/**
 * CONFIDENTIAL AND PROPRIETARY SOURCE CODE. 
 * 
 * Use and distribution of this code is subject to applicable 
 * licenses and the permission of the code owner.  This notice 
 * does not indicate the actual or intended publication of 
 * this source code.
 * 
 * Portions developed for Camping World by BTM Global Consulting
 * LLC and are the property of Camping World.
 * 
 * ===== BTM Modification ===========================================
 * Req/Bug ID#      ddMMyy    Description
 * BZ25640          051518    New Requirement - Used Firearm System Process Redesign
 *===================================================================
 */

package caw.pos.register.ufa.rcpt;

import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dtv.docbuilding.AbstractDocBuilderField;
import dtv.docbuilding.IDocElementFactory;
import dtv.docbuilding.types.DocBuilderAlignmentType;
import dtv.i18n.formatter.output.IOutputFormatter;
import dtv.xst.dao.tsn.ITenderControlTransaction;
import dtv.xst.dao.ttr.ITenderLineItem;

/**
 *
 */
public class CawRcptUFAItemCodeBuilderField extends AbstractDocBuilderField {

    private static final Logger _logger = LogManager
            .getLogger(CawRcptUFAItemCodeBuilderField.class);

    public CawRcptUFAItemCodeBuilderField(String argContents, String argStyle,
            Integer argLocation, DocBuilderAlignmentType argAlignment,
            int argPriority, IOutputFormatter argFormatter) {

        super(argContents, argStyle, argLocation, argAlignment, argPriority, argFormatter);
    }

    @Override
    public String getContents(Object argSource, IDocElementFactory argFactory,
            Locale argLocale) {

        String result = "";
        if (argSource instanceof ITenderControlTransaction) {
            ITenderControlTransaction tndControlTrans = (ITenderControlTransaction) argSource;
            tndControlTrans.getRetailTransactionLineItems().get(0)
                    .getProperties();
            try {
                Object tender = tndControlTrans.getRetailTransactionLineItems()
                        .get(0);
                if (tender instanceof ITenderLineItem) {
                    result = ((ITenderLineItem) tender).getProperties().get(1)
                            .getStringValue();
                }
            } catch (Exception ex) {
                _logger.debug("getContents-Item Code", ex);
            }

        }
        return result;
    }

}
