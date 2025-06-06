#! /bin/sh

#
# Java Service Wrapper general startup script
#

# Application
APP_NAME="transreplicate"
APP_LONG_NAME="Xstore Transaction Replicator"

# Priority at which to run the wrapper.  See "man nice" for valid priorities.
#  nice is only used if a priority is specified.
PRIORITY=

# Location of the pid file.
PIDDIR="./tmp"

# If uncommented, causes the Wrapper to be shutdown using an anchor file.
#  When launched with the 'start' command, it will also ignore all INT and
#  TERM signals.
IGNORE_SIGNALS=true

# If specified, the Wrapper will be run as the specified user.
# IMPORTANT - Make sure that the user has the required privileges to write
#  the PID file and wrapper.log files.  Failure to be able to write the log
#  file will cause the Wrapper to exit without any way to write out an error
#  message.
# NOTE - This will set the user which is used to run the Wrapper as well as
#  the JVM and is not useful in situations where a privileged resource or
#  port needs to be allocated prior to the user being changed.
#RUN_AS_USER=

# The following two lines are used by the chkconfig command. Change as is
#  appropriate for your application.  They should remain commented.
# chkconfig: 2345 20 80
# description: Xstore Transaction Replicator

# Do not modify anything beyond this point (except for maybe path section below)
#-----------------------------------------------------------------------------

# Get the fully qualified path to the script
case $0 in
    /*)
        SCRIPT="$0"
        ;;
    *)
        PWD=`pwd`
        SCRIPT="$PWD/$0"
        ;;
esac

# Resolve the true real path without any sym links.
CHANGED=true
while [ "X$CHANGED" != "X" ]
do
    # Change spaces to ":" so the tokens can be parsed.
    SCRIPT=`echo $SCRIPT | sed -e 's; ;:;g'`
    # Get the real path to this script, resolving any symbolic links
    TOKENS=`echo $SCRIPT | sed -e 's;/; ;g'`
    REALPATH=
    for C in $TOKENS; do
        REALPATH="$REALPATH/$C"
        while [ -h "$REALPATH" ] ; do
            LS="`ls -ld "$REALPATH"`"
            LINK="`expr "$LS" : '.*-> \(.*\)$'`"
            if expr "$LINK" : '/.*' > /dev/null; then
                REALPATH="$LINK"
            else
                REALPATH="`dirname "$REALPATH"`""/$LINK"
            fi
        done
    done
    # Change ":" chars back to spaces.
    REALPATH=`echo $REALPATH | sed -e 's;:; ;g'`

    if [ "$REALPATH" = "$SCRIPT" ] ; then
        CHANGED=""
    else
        SCRIPT="$REALPATH"
    fi
done

# extract the directory only from the fully resolved script name
REALPATH="`dirname "$REALPATH"`"

# Change the current directory to the location of the script
cd "$REALPATH"
REALDIR=`pwd`

# Move any JVM crash logs into the log directory.
if [ -e hs_pid????.log ] ; then
  mv hs_pid????.log log/
fi

# If the PIDDIR is relative, set its value relative to the full REALPATH to avoid problems if
#  the working directory is later changed.
FIRST_CHAR=`echo $PIDDIR | cut -c1,1`
if [ "$FIRST_CHAR" != "/" ] ; then
    PIDDIR=$REALDIR/$PIDDIR
fi
# Same test for WRAPPER_CMD
FIRST_CHAR=`echo $WRAPPER_CMD | cut -c1,1`
if [ "$FIRST_CHAR" != "/" ] ; then
    WRAPPER_CMD=$REALDIR/$WRAPPER_CMD
fi
# Same test for WRAPPER_CONF
FIRST_CHAR=`echo $WRAPPER_CONF | cut -c1,1`
if [ "$FIRST_CHAR" != "/" ] ; then
    WRAPPER_CONF=$REALDIR/$WRAPPER_CONF
fi

# Process ID
ANCHORFILE="$PIDDIR/$APP_NAME.anchor"
PIDFILE="$PIDDIR/$APP_NAME.wrapper.pid"
pid=""

# Resolve the location of the 'ps' command
PSEXE="/usr/bin/ps"
if [ ! -x $PSEXE ] ; then
    PSEXE="/bin/ps"
    if [ ! -x $PSEXE ] ; then
        echo "Unable to locate 'ps'."
        echo "Please report this message along with the location of the command on your system."
        exit 1
    fi
fi

# Resolve the os
DIST_OS=`uname -s | tr [:upper:] [:lower:] | tr -d [:blank:]`
case "$DIST_OS" in
    'sunos')
        DIST_OS="solaris"
        ;;
    'hp-ux' | 'hp-ux64')
        DIST_OS="hpux"
        ;;
    'darwin')
        DIST_OS="macosx"
        ;;
    'unix_sv')
        DIST_OS="unixware"
        ;;
esac

# Resolve the architecture
DIST_ARCH=`uname -p | tr [:upper:] [:lower:] | tr -d [:blank:]`
if [ "$DIST_ARCH" = "unknown" ] ; then
    DIST_ARCH=`uname -m | tr [:upper:] [:lower:] | tr -d [:blank:]`
fi
case "$DIST_ARCH" in
    'amd64' | 'ia32' | 'ia64' | 'i386' | 'i486' | 'i586' | 'i686' | 'x86_64')
        DIST_ARCH="x86"
        ;;
    'ip27')
        DIST_ARCH="mips"
        ;;
    'power' | 'powerpc' | 'power_pc' | 'ppc64')
        DIST_ARCH="ppc"
        ;;
    'pa_risc' | 'pa-risc')
        DIST_ARCH="parisc"
        ;;
    'sun4u' | 'sparcv9')
        DIST_ARCH="sparc"
        ;;
    '9000/800')
        DIST_ARCH="parisc"
        ;;
esac

# Decide on the wrapper binary to use.
# If a 32-bit wrapper binary exists then it will work on 32 or 64 bit
#  platforms, if the 64-bit binary exists then the distribution most
#  likely wants to use long names.  Otherwise, look for the default.
# For macosx, we also want to look for universal binaries.
WRAPPER_TEST_CMD="$WRAPPER_CMD-$DIST_OS-$DIST_ARCH-32"
if [ -x $WRAPPER_TEST_CMD ] ; then
    WRAPPER_CMD="$WRAPPER_TEST_CMD"
else
    if [ "$DIST_OS" = "macosx" ] ; then
        WRAPPER_TEST_CMD="$WRAPPER_CMD-$DIST_OS-universal-32"
        if [ -x $WRAPPER_TEST_CMD ] ; then
            WRAPPER_CMD="$WRAPPER_TEST_CMD"
        else
            WRAPPER_TEST_CMD="$WRAPPER_CMD-$DIST_OS-$DIST_ARCH-64"
            if [ -x $WRAPPER_TEST_CMD ] ; then
                WRAPPER_CMD="$WRAPPER_TEST_CMD"
            else
                WRAPPER_TEST_CMD="$WRAPPER_CMD-$DIST_OS-universal-64"
                if [ -x $WRAPPER_TEST_CMD ] ; then
                    WRAPPER_CMD="$WRAPPER_TEST_CMD"
                else
                    if [ ! -x $WRAPPER_CMD ] ; then
                        echo "Unable to locate any of the following binaries:"
                        echo "  $WRAPPER_CMD-$DIST_OS-$DIST_ARCH-32"
                        echo "  $WRAPPER_CMD-$DIST_OS-universal-32"
                        echo "  $WRAPPER_CMD-$DIST_OS-$DIST_ARCH-64"
                        echo "  $WRAPPER_CMD-$DIST_OS-universal-64"
                        echo "  $WRAPPER_CMD"
                        exit 1
                    fi
                fi
            fi
        fi
    else
        WRAPPER_TEST_CMD="$WRAPPER_CMD-$DIST_OS-$DIST_ARCH-64"
        if [ -x $WRAPPER_TEST_CMD ] ; then
            WRAPPER_CMD="$WRAPPER_TEST_CMD"
        else
            if [ ! -x $WRAPPER_CMD ] ; then
                echo "Unable to locate any of the following binaries:"
                echo "  $WRAPPER_CMD-$DIST_OS-$DIST_ARCH-32"
                echo "  $WRAPPER_CMD-$DIST_OS-$DIST_ARCH-64"
                echo "  $WRAPPER_CMD"
                exit 1
            fi
        fi
    fi
fi
 
# Build the nice clause
if [ "X$PRIORITY" = "X" ] ; then
    CMDNICE=""
else
    CMDNICE="nice -$PRIORITY"
fi

# Build the anchor file clause.
if [ "X$IGNORE_SIGNALS" = "X" ] ; then
   ANCHORPROP=
   IGNOREPROP=
else
   ANCHORPROP=wrapper.anchorfile=$ANCHORFILE
   IGNOREPROP=wrapper.ignore_signals=TRUE
fi

# Build the lock file clause.  Only create a lock file if the lock directory exists on this platform.
if [ -d $LOCKDIR ] ; then
    LOCKPROP=wrapper.lockfile=$LOCKFILE
else
    LOCKPROP=
fi
#-----------------------------------------------------------
# set up the paths, etc required for Xstore processes
# ... maybe you can modify this section if you know what you're doing
#

WRAPPER_CONF=$REALPATH/wrapper/conf/transreplicate.conf
export PLATFORM=linux
export _WRAPPED_APP=transreplicate
export JAVA_HOME=/opt/jre
export JAVA=$JAVA_HOME/bin/transreplicate
PLATFORMPATH=$REALPATH/$PLATFORM

if [ ! -f $JAVA ] ; then
  cp $JAVA_HOME/bin/java $JAVA
fi
if [ ! -x $JAVA ] ; then
  chmod +x $JAVA
fi
WRAPPER_CMD=$PLATFORMPATH/bin/transreplicate-wrapper
# make a copy of the wrapper executable with a specific name
if [ ! -f $WRAPPER_CMD ] ; then
  cp $PLATFORMPATH/bin/wrapper $WRAPPER_CMD
fi
# make sure the file is executable
if [ ! -x $WRAPPER_CMD ] ; then
  chmod +x $WRAPPER_CMD
fi
# if for some reason things are not like we want, use the non-specific version instead
if [ ! -x $WRAPPER_CMD ] ; then
  WRAPPER_CMD=$PLATFORMPATH/bin/wrapper
fi

export PATH=$JAVA_HOME/bin:$PLATFORMPATH/lib:$PATH
export LD_LIBRARY_PATH=$PLATFORMPATH/lib:$LD_LIBRARY_PATH

#
# OK, don't modify anything after here either
#-----------------------------------------------------------
checkUser() {
    # Check the configured user.  If necessary rerun this script as the desired user.
    if [ "X$RUN_AS_USER" != "X" ] ; then
        # Resolve the location of the 'id' command
        IDEXE="/usr/xpg4/bin/id"
        if [ ! -x $IDEXE ] ; then
            IDEXE="/usr/bin/id"
            if [ ! -x $IDEXE ] ; then
                echo "Unable to locate 'id'."
                echo "Please report this message along with the location of the command on your system."
                exit 1
            fi
        fi
    
        if [ "`$IDEXE -u -n`" = "$RUN_AS_USER" ] ; then
            # Already running as the configured user.  Avoid password prompts by not calling su.
            RUN_AS_USER=""
        fi
    fi
    if [ "X$RUN_AS_USER" != "X" ] ; then
        # If LOCKPROP and $RUN_AS_USER are defined then the new user will most likely not be
        # able to create the lock file.  The Wrapper will be able to update this file once it
        # is created but will not be able to delete it on shutdown.  If $2 is defined then
        # the lock file should be created for the current command
        if [ "X$LOCKPROP" != "X" ] ; then
            if [ "X$2" != "X" ] ; then
                # Resolve the primary group 
                RUN_AS_GROUP=`groups $RUN_AS_USER | awk '{print $3}' | tail -1`
                if [ "X$RUN_AS_GROUP" = "X" ] ; then
                    RUN_AS_GROUP=RUN_AS_USER
                fi
                touch $LOCKFILE
                chown $RUN_AS_USER:$RUN_AS_GROUP $LOCKFILE
            fi
        fi

        # Still want to change users, recurse.  This means that the user will only be
        #  prompted for a password once.
        su -m $RUN_AS_USER -c "$REALPATH $1"

        # Now that we are the original user again, we may need to clean up the lock file.
        if [ "X$LOCKPROP" != "X" ] ; then
            getpid
            if [ "X$pid" = "X" ] ; then
                # Wrapper is not running so make sure the lock file is deleted.
                if [ -f $LOCKFILE ] ; then
                    rm $LOCKFILE
                fi
            fi
        fi

        exit 0
    fi
}

getpid() {
    if [ -f $PIDFILE ]; then
        if [ -r $PIDFILE ]; then
            pid=`cat $PIDFILE`
            if [ "X$pid" != "X" ] ; then
                # It is possible that 'a' process with the pid exists but that it is not the
                #  correct process.  This can happen in a number of cases, but the most
                #  common is during system startup after an unclean shutdown.
                # The ps statement below looks for the specific wrapper command running as
                #  the pid.  If it is not found then the pid file is considered to be stale.
                pidtest=`$PSEXE -p $pid -o args | grep $WRAPPER_CMD | tail -1`
                if [ "X$pidtest" = "X" ] ; then
                    # This is a stale pid file.
                    rm -f $PIDFILE
                    echo "Removed stale pid file: $PIDFILE"
                    pid=""
                fi
            fi
        else
            echo "Cannot read $PIDFILE."
            exit 1
        fi
    fi
}

testpid() {
    pid=`$PSEXE -p $pid | grep $pid | grep -v grep | awk '{print $1}' | tail -1`
    if [ "X$pid" = "X" ] ; then
        # Process is gone so remove the pid file.
        rm -f $PIDFILE
        pid=""
    fi
}

console() {
    echo "Running $APP_LONG_NAME..."
    getpid
    if [ "X$pid" = "X" ] ; then
        COMMAND_LINE="$CMDNICE $WRAPPER_CMD $WRAPPER_CONF wrapper.java.command=$JAVA wrapper.syslog.ident=$APP_NAME wrapper.pidfile=$PIDFILE $ANCHORPROP $LOCKPROP"
        exec $COMMAND_LINE
    else
        echo "$APP_LONG_NAME is already running."
        exit 1
    fi
}
 
start() {
    echo "Starting $APP_LONG_NAME..."
    getpid
    if [ "X$pid" = "X" ]; then
        COMMAND_LINE="$CMDNICE $WRAPPER_CMD $WRAPPER_CONF wrapper.java.command=$JAVA wrapper.syslog.ident=$APP_NAME wrapper.pidfile=$PIDFILE wrapper.daemonize=TRUE $ANCHORPROP $IGNOREPROP $LOCKPROP"
        exec $COMMAND_LINE
    else
        echo "$APP_LONG_NAME is already running."
        exit 1
    fi
}
 
stopit() {
    echo "Stopping $APP_LONG_NAME..."
    getpid
    if [ "X$pid" = "X" ]; then
        echo "$APP_LONG_NAME was not running."
    else
        if [ "X$IGNORE_SIGNALS" = "X" ]; then
            # Running so try to stop it.
            kill $pid
            if [ $? -ne 0 ]; then
                # An explanation for the failure should have been given
                echo "Unable to stop $APP_LONG_NAME."
                exit 1
            fi
        else
            rm -f $ANCHORFILE
            if [ -f $ANCHORFILE ] ; then
                # An explanation for the failure should have been given
                echo "Unable to stop $APP_LONG_NAME."
                exit 1
            fi
        fi

        # We can not predict how long it will take for the wrapper to
        #  actually stop as it depends on settings in wrapper.conf.
        #  Loop until it does.
        savepid=$pid
        CNT=0
        TOTCNT=0
        while [ "X$pid" != "X" ]
        do
            # Show a waiting message every 5 seconds.
            if [ "$CNT" -lt "5" ] ; then
                CNT=`expr $CNT + 1`
            else
                echo "Waiting for $APP_LONG_NAME to exit..."
                CNT=0
            fi
            TOTCNT=`expr $TOTCNT + 1`

            sleep 1

            testpid
        done

        pid=$savepid
        testpid
        if [ "X$pid" != "X" ] ; then
            echo "Failed to stop $APP_LONG_NAME."
            exit 1
        else
            echo "Stopped $APP_LONG_NAME."
        fi
    fi
}

status() {
    getpid
    if [ "X$pid" = "X" ] ; then
        echo "$APP_LONG_NAME is not running."
        exit 1
    else
        echo "$APP_LONG_NAME is running ($pid)."
        exit 0
    fi
}

dump() {
    echo "Dumping $APP_LONG_NAME..."
    getpid
    if [ "X$pid" = "X" ] ; then
        echo "$APP_LONG_NAME was not running."

    else
        kill -3 $pid

        if [ $? -ne 0 ] ; then
            echo "Failed to dump $APP_LONG_NAME."
            exit 1
        else
            echo "Dumped $APP_LONG_NAME."
        fi
    fi
}

locateInsservExe() {
    INSSERVEXE="/sbin/insserv"
    if [ ! -x $INSSERVEXE ] ; then
        INSSERVEXE="/usr/sbin/insserv"
        if [ ! -x $INSSERVEXE ] ; then
            echo "Unable to locate 'insserv'."
            echo "Please report this message along with the location of the command on your system."
            exit 1
        fi
    fi
}

installit() {
    echo "Installing $APP_LONG_NAME as a Linux Service..."
    locateinsserv
    if [ -f /etc/init.d/$APP_NAME ] ; then
        rm /etc/init.d/$APP_NAME
        if [ $? ne 0 ] ; then
          echo "Unable to remove existing /etc/init.d/$APP_NAME"
          exit 1
        fi
    fi
    cp $REALPATH/linux/service/$APP_NAME /etc/init.d
    chmod +x /etc/init.d/$APP_NAME
    $INSSERVEXE -d $APP_NAME
    if [ $? ne 0 ] ; then
      echo "Failed to install $APP_LONG_NAME as a Linux service."
      exit 1
    else 
      echo "Installed $APP_LONG_NAME as a Linux service."
    fi
}

removeit() {
    echo "Uninstalling $APP_LONG_NAME as a Linux Service..."
    locateinsserv
    $INSSERVEXE -r $APP_NAME
    if [ $? ne 0 ] ; then
        echo "Unable to uninstall service."
        exit 1
    fi
    rm -f /etc/init.d/$APP_NAME
    if [ -f /etc/init.d/$APP_NAME ] ; then
        echo "Uninstalled, but unable to delete $APP_NAME from /etc/init.d"
        exit 1
    else
        echo "Uninstalled $APP_LONG_NAME as a Linux service."
    fi
}

removeSerialLocks() {
    if [ "X$APP_NAME" = "Xxstore" ] ; then
        rm -f /var/lock/*ttyS* >/dev/null 2>/dev/null
    fi
    if [ "X$APP_NAME" = "Xhardware-tester" ] ; then
        rm -f /var/lock/*ttyS* >/dev/null 2>/dev/null
    fi
}

case "X$1" in

    # if no argument passed, run in console mode
    'X')
        removeSerialLocks
        checkUser $1 touchlock
        console

        ;;

    'Xconsole')
        removeSerialLocks
        checkUser $1 touchlock
        console
        ;;

    'Xstart')
        removeSerialLocks
        checkUser $1 touchlock
        start
        ;;

    'Xstop')
        checkUser $1
        stopit
        ;;

    'Xrestart')
        checkUser $1 touchlock
        stopit
        removeSerialLocks
        start
        ;;

    'Xstatus')
        checkUser $1
        status
        ;;

    'Xinstall')
        installit
        ;;

    'Xdump')
        checkUser $1
        dump
        ;;

    'Xremove')
        removeit
        ;;

    *)
        echo "Usage: $0 { console | start | stop | restart | status | dump }"
        echo "    $0 console    run $APP_LONG_NAME with a console"
        echo "    $0 start      start $APP_LONG_NAME"
        echo "    $0 stop       stop $APP_LONG_NAME"
        echo "    $0 restart    stop and restart $APP_LONG_NAME"
        echo "    $0 status     display a message indiciting if $APP_LONG_NAME is running (exits with status 1 is not running)"
        echo "    $0 dump       attempts to kill $APP_LONG_NAME"
        echo "    $0 install    installs $APP_LONG_NAME as Linux service"
        echo "    $0 remove     uninstalls $APP_LONG_NAME as Linux service"
        echo "    $0 help       show this message"
        exit 1
        ;;
esac

# Move any JVM crash logs into the log directory.
if [ -e hs_pid????.log ] ; then
  mv hs_pid????.log log/
fi

exit 0
