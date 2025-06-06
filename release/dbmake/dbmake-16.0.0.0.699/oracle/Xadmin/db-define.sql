-- 
-- TABLE: CFG_BASE_FEATURE 
--

CREATE TABLE CFG_BASE_FEATURE(
    FEATURE_ID               VARCHAR2(200 char)     NOT NULL,
    DESCRIPTION              VARCHAR2(4000 char),
    DEPENDS_ON_FEATURE_ID    VARCHAR2(200 char),
    SORT_ORDER               NUMBER(10, 0),
    CREATE_DATE              DATE,
    CREATE_USER_ID           VARCHAR2(30 char),
    UPDATE_DATE              DATE,
    UPDATE_USER_ID           VARCHAR2(30 char),
    CONSTRAINT PK_CFG_BASE_FEATURE PRIMARY KEY (FEATURE_ID)
)
;


GRANT DELETE ON CFG_BASE_FEATURE TO POSUSERS
;
GRANT INSERT ON CFG_BASE_FEATURE TO POSUSERS
;
GRANT SELECT ON CFG_BASE_FEATURE TO POSUSERS
;
GRANT UPDATE ON CFG_BASE_FEATURE TO POSUSERS
;
GRANT DELETE ON CFG_BASE_FEATURE TO DBAUSERS
;
GRANT INSERT ON CFG_BASE_FEATURE TO DBAUSERS
;
GRANT SELECT ON CFG_BASE_FEATURE TO DBAUSERS
;
GRANT UPDATE ON CFG_BASE_FEATURE TO DBAUSERS
;

-- 
-- TABLE: CFG_LANDSCAPE 
--

CREATE TABLE CFG_LANDSCAPE(
    ORGANIZATION_ID    NUMBER(10, 0)     NOT NULL,
    LANDSCAPE_ID       NUMBER(19, 0)     NOT NULL,
    DESCRIPTION        VARCHAR2(255 char),
    COMMENTS           VARCHAR2(4000 char),
    CREATE_DATE        DATE,
    CREATE_USER_ID     VARCHAR2(30 char),
    UPDATE_DATE        DATE,
    UPDATE_USER_ID     VARCHAR2(30 char),
    CONSTRAINT PK_CFG_LANDSCAPE PRIMARY KEY (ORGANIZATION_ID, LANDSCAPE_ID)
)
;


GRANT DELETE ON CFG_LANDSCAPE TO POSUSERS
;
GRANT INSERT ON CFG_LANDSCAPE TO POSUSERS
;
GRANT SELECT ON CFG_LANDSCAPE TO POSUSERS
;
GRANT UPDATE ON CFG_LANDSCAPE TO POSUSERS
;
GRANT DELETE ON CFG_LANDSCAPE TO DBAUSERS
;
GRANT INSERT ON CFG_LANDSCAPE TO DBAUSERS
;
GRANT SELECT ON CFG_LANDSCAPE TO DBAUSERS
;
GRANT UPDATE ON CFG_LANDSCAPE TO DBAUSERS
;

-- 
-- TABLE: CFG_LANDSCAPE_GROUP 
--

CREATE TABLE CFG_LANDSCAPE_GROUP(
    ORGANIZATION_ID        NUMBER(10, 0)		 NOT NULL,
    LANDSCAPE_ID           NUMBER(19, 0)		 NOT NULL,
    PROFILE_GROUP_ID       VARCHAR2(60 char)     NOT NULL,
    PROFILE_GROUP_ORDER    NUMBER(10, 0)		 NOT NULL,
    CREATE_DATE            DATE,
    CREATE_USER_ID         VARCHAR2(30 char),
    UPDATE_DATE            DATE,
    UPDATE_USER_ID         VARCHAR2(30 char),
    CONSTRAINT PK_CFG_LANDSCAPE_GROUP PRIMARY KEY (ORGANIZATION_ID, LANDSCAPE_ID, PROFILE_GROUP_ID)
)
;


GRANT DELETE ON CFG_LANDSCAPE_GROUP TO POSUSERS
;
GRANT INSERT ON CFG_LANDSCAPE_GROUP TO POSUSERS
;
GRANT SELECT ON CFG_LANDSCAPE_GROUP TO POSUSERS
;
GRANT UPDATE ON CFG_LANDSCAPE_GROUP TO POSUSERS
;
GRANT DELETE ON CFG_LANDSCAPE_GROUP TO DBAUSERS
;
GRANT INSERT ON CFG_LANDSCAPE_GROUP TO DBAUSERS
;
GRANT SELECT ON CFG_LANDSCAPE_GROUP TO DBAUSERS
;
GRANT UPDATE ON CFG_LANDSCAPE_GROUP TO DBAUSERS
;

-- 
-- TABLE: CFG_LANDSCAPE_RANGE 
--

CREATE TABLE CFG_LANDSCAPE_RANGE(
    ORGANIZATION_ID       NUMBER(10, 0)		    NOT NULL,
    LANDSCAPE_ID          NUMBER(19, 0)		    NOT NULL,
    PROFILE_GROUP_ID      VARCHAR2(60 char)     NOT NULL,
    RANGE_SEQ             NUMBER(10, 0)		    NOT NULL,
    PROFILE_ELEMENT_ID    VARCHAR2(60 char)     NOT NULL,
    RANGE_START           NUMBER(10, 0)		    NOT NULL,
    RANGE_END             NUMBER(10, 0)		    NOT NULL,
    CREATE_DATE           DATE,
    CREATE_USER_ID        VARCHAR2(30 char),
    UPDATE_DATE           DATE,
    UPDATE_USER_ID        VARCHAR2(30 char),
    CONSTRAINT PK_CFG_LANDSCAPE_RANGE PRIMARY KEY (ORGANIZATION_ID, LANDSCAPE_ID, PROFILE_GROUP_ID, RANGE_SEQ)
)
;


GRANT DELETE ON CFG_LANDSCAPE_RANGE TO POSUSERS
;
GRANT INSERT ON CFG_LANDSCAPE_RANGE TO POSUSERS
;
GRANT SELECT ON CFG_LANDSCAPE_RANGE TO POSUSERS
;
GRANT UPDATE ON CFG_LANDSCAPE_RANGE TO POSUSERS
;
GRANT DELETE ON CFG_LANDSCAPE_RANGE TO DBAUSERS
;
GRANT INSERT ON CFG_LANDSCAPE_RANGE TO DBAUSERS
;
GRANT SELECT ON CFG_LANDSCAPE_RANGE TO DBAUSERS
;
GRANT UPDATE ON CFG_LANDSCAPE_RANGE TO DBAUSERS
;

-- 
-- TABLE: CFG_PERSONALITY 
--

CREATE TABLE CFG_PERSONALITY(
    ORGANIZATION_ID    NUMBER(10, 0)    NOT NULL,
    PERSONALITY_ID     NUMBER(19, 0)    NOT NULL,
    DESCRIPTION        VARCHAR2(255 char),
    comments           varchar2(4000 char),
    CREATE_DATE        DATE,
    CREATE_USER_ID     VARCHAR2(30 char),
    UPDATE_DATE        DATE,
    UPDATE_USER_ID     VARCHAR2(30 char),
    CONSTRAINT PK_CFG_PERSONALITY PRIMARY KEY (ORGANIZATION_ID, PERSONALITY_ID)
)
;


GRANT DELETE ON CFG_PERSONALITY TO POSUSERS
;
GRANT INSERT ON CFG_PERSONALITY TO POSUSERS
;
GRANT SELECT ON CFG_PERSONALITY TO POSUSERS
;
GRANT UPDATE ON CFG_PERSONALITY TO POSUSERS
;
GRANT DELETE ON CFG_PERSONALITY TO DBAUSERS
;
GRANT INSERT ON CFG_PERSONALITY TO DBAUSERS
;
GRANT SELECT ON CFG_PERSONALITY TO DBAUSERS
;
GRANT UPDATE ON CFG_PERSONALITY TO DBAUSERS
;

-- 
-- TABLE: CFG_PERSONALITY_BASE_FEATURE 
--

CREATE TABLE CFG_PERSONALITY_BASE_FEATURE(
    ORGANIZATION_ID    NUMBER(10, 0)	     NOT NULL,
    PERSONALITY_ID     NUMBER(19, 0)	     NOT NULL,
    FEATURE_ID         VARCHAR2(200 char)    NOT NULL,
    SORT_ORDER         NUMBER(10, 0),
    CREATE_DATE        DATE,
    CREATE_USER_ID     VARCHAR2(30 char),
    UPDATE_DATE        DATE,
    UPDATE_USER_ID     VARCHAR2(30 char),
    CONSTRAINT PK_CFG_PERSONALITY_BAS_FEATURE PRIMARY KEY (ORGANIZATION_ID, PERSONALITY_ID, FEATURE_ID)
)
;


GRANT DELETE ON CFG_PERSONALITY_BASE_FEATURE TO POSUSERS
;
GRANT INSERT ON CFG_PERSONALITY_BASE_FEATURE TO POSUSERS
;
GRANT SELECT ON CFG_PERSONALITY_BASE_FEATURE TO POSUSERS
;
GRANT UPDATE ON CFG_PERSONALITY_BASE_FEATURE TO POSUSERS
;
GRANT DELETE ON CFG_PERSONALITY_BASE_FEATURE TO DBAUSERS
;
GRANT INSERT ON CFG_PERSONALITY_BASE_FEATURE TO DBAUSERS
;
GRANT SELECT ON CFG_PERSONALITY_BASE_FEATURE TO DBAUSERS
;
GRANT UPDATE ON CFG_PERSONALITY_BASE_FEATURE TO DBAUSERS
;

-- 
-- TABLE: CFG_PERSONALITY_ELEMENT 
--

CREATE TABLE CFG_PERSONALITY_ELEMENT(
    ORGANIZATION_ID    NUMBER(10, 0)		 NOT NULL,
    PERSONALITY_ID     NUMBER(19, 0)		 NOT NULL,
    ELEMENT_ID         VARCHAR2(60 char)     NOT NULL,
    GROUP_ID           VARCHAR2(60 char)     NOT NULL,
    SORT_ORDER         NUMBER(10, 0),
    CREATE_DATE        DATE,
    CREATE_USER_ID     VARCHAR2(30 char),
    UPDATE_DATE        DATE,
    UPDATE_USER_ID     VARCHAR2(30 char),
    CONSTRAINT PK_CFG_PERSONALITY_ELEMENT PRIMARY KEY (ORGANIZATION_ID, PERSONALITY_ID, ELEMENT_ID, GROUP_ID)
)
;


GRANT DELETE ON CFG_PERSONALITY_ELEMENT TO POSUSERS
;
GRANT INSERT ON CFG_PERSONALITY_ELEMENT TO POSUSERS
;
GRANT SELECT ON CFG_PERSONALITY_ELEMENT TO POSUSERS
;
GRANT UPDATE ON CFG_PERSONALITY_ELEMENT TO POSUSERS
;
GRANT DELETE ON CFG_PERSONALITY_ELEMENT TO DBAUSERS
;
GRANT INSERT ON CFG_PERSONALITY_ELEMENT TO DBAUSERS
;
GRANT SELECT ON CFG_PERSONALITY_ELEMENT TO DBAUSERS
;
GRANT UPDATE ON CFG_PERSONALITY_ELEMENT TO DBAUSERS
;

-- 
-- TABLE: CFG_PROFILE_ELEMENT_VERSION 
--

CREATE TABLE CFG_PROFILE_ELEMENT_VERSION(
    ORGANIZATION_ID       NUMBER(10, 0)			NOT NULL,
    PROFILE_GROUP_ID      VARCHAR2(60 char)     NOT NULL,
    PROFILE_ELEMENT_ID    VARCHAR2(60 char)     NOT NULL,
    CONFIG_VERSION        NUMBER(19, 0)			NOT NULL,
    DEPLOYED              NUMBER(1, 0)			DEFAULT 0,
    CREATE_DATE           DATE,
    CREATE_USER_ID        VARCHAR2(30 char),
    UPDATE_DATE           DATE,
    UPDATE_USER_ID        VARCHAR2(30 char),
    CONSTRAINT PK_CFG_PROFILE_ELEMENT_VERSION PRIMARY KEY (ORGANIZATION_ID, PROFILE_GROUP_ID, PROFILE_ELEMENT_ID)
)
;

GRANT DELETE ON CFG_PROFILE_ELEMENT_VERSION TO POSUSERS
;
GRANT INSERT ON CFG_PROFILE_ELEMENT_VERSION TO POSUSERS
;
GRANT SELECT ON CFG_PROFILE_ELEMENT_VERSION TO POSUSERS
;
GRANT UPDATE ON CFG_PROFILE_ELEMENT_VERSION TO POSUSERS
;
GRANT DELETE ON CFG_PROFILE_ELEMENT_VERSION TO DBAUSERS
;
GRANT INSERT ON CFG_PROFILE_ELEMENT_VERSION TO DBAUSERS
;
GRANT SELECT ON CFG_PROFILE_ELEMENT_VERSION TO DBAUSERS
;
GRANT UPDATE ON CFG_PROFILE_ELEMENT_VERSION TO DBAUSERS
;

-- 
-- TABLE: CFG_REASON_CODE_TYPE 
--

CREATE TABLE CFG_REASON_CODE_TYPE(
    ORGANIZATION_ID     NUMBER(10, 0)		  NOT NULL,
    REASON_CODE_TYPE    VARCHAR2(30 char)     NOT NULL,
    DESCRIPTION         VARCHAR2(254 char),
    CREATE_DATE         DATE,
    CREATE_USER_ID      VARCHAR2(30 char),
    UPDATE_DATE         DATE,
    UPDATE_USER_ID      VARCHAR2(30 char),
    CONSTRAINT PK_CFG_REASON_CODE_TYPE PRIMARY KEY (ORGANIZATION_ID, REASON_CODE_TYPE)
)
;

GRANT DELETE ON CFG_REASON_CODE_TYPE TO POSUSERS
;
GRANT INSERT ON CFG_REASON_CODE_TYPE TO POSUSERS
;
GRANT SELECT ON CFG_REASON_CODE_TYPE TO POSUSERS
;
GRANT UPDATE ON CFG_REASON_CODE_TYPE TO POSUSERS
;
GRANT DELETE ON CFG_REASON_CODE_TYPE TO DBAUSERS
;
GRANT INSERT ON CFG_REASON_CODE_TYPE TO DBAUSERS
;
GRANT SELECT ON CFG_REASON_CODE_TYPE TO DBAUSERS
;
GRANT UPDATE ON CFG_REASON_CODE_TYPE TO DBAUSERS
;

-- 
-- TABLE: CFG_STORE_PERSONALITY 
--

CREATE TABLE CFG_STORE_PERSONALITY(
    ORGANIZATION_ID    NUMBER(10, 0)    NOT NULL,
    STORE_NUMBER       NUMBER(10, 0)    NOT NULL,
    PERSONALITY_ID     NUMBER(19, 0)    NOT NULL,
    LANDSCAPE_ID       NUMBER(19, 0)    NOT NULL,
    CREATE_DATE        DATE,
    CREATE_USER_ID     VARCHAR2(30 char),
    UPDATE_DATE        DATE,
    UPDATE_USER_ID     VARCHAR2(30 char),
    CONSTRAINT PK_CFG_STORE_PERSONALITY PRIMARY KEY (ORGANIZATION_ID, STORE_NUMBER)
)
;


GRANT DELETE ON CFG_STORE_PERSONALITY TO POSUSERS
;
GRANT INSERT ON CFG_STORE_PERSONALITY TO POSUSERS
;
GRANT SELECT ON CFG_STORE_PERSONALITY TO POSUSERS
;
GRANT UPDATE ON CFG_STORE_PERSONALITY TO POSUSERS
;
GRANT DELETE ON CFG_STORE_PERSONALITY TO DBAUSERS
;
GRANT INSERT ON CFG_STORE_PERSONALITY TO DBAUSERS
;
GRANT SELECT ON CFG_STORE_PERSONALITY TO DBAUSERS
;
GRANT UPDATE ON CFG_STORE_PERSONALITY TO DBAUSERS
;

-- 
-- TABLE: CFG_TAB_PROPERTY 
--

CREATE TABLE CFG_TAB_PROPERTY(
    TAB_ID               VARCHAR2(30 char)      NOT NULL,
    PROPERTY_ID          VARCHAR2(30 char)      NOT NULL,
    DISPLAY_COMPONENT    VARCHAR2(1000 char)    NOT NULL,
    VALUE_TYPE           VARCHAR2(1000 char)    NOT NULL,
    LABEL                VARCHAR2(1000 char)    NOT NULL,
    CREATE_DATE          DATE,
    CREATE_USER_ID       VARCHAR2(30 char),
    UPDATE_DATE          DATE,
    UPDATE_USER_ID       VARCHAR2(30 char),
    CONSTRAINT PK_CFG_TAB_PROPERTY PRIMARY KEY (PROPERTY_ID, TAB_ID)
)
;

GRANT DELETE ON CFG_TAB_PROPERTY TO POSUSERS
;
GRANT INSERT ON CFG_TAB_PROPERTY TO POSUSERS
;
GRANT SELECT ON CFG_TAB_PROPERTY TO POSUSERS
;
GRANT UPDATE ON CFG_TAB_PROPERTY TO POSUSERS
;
GRANT DELETE ON CFG_TAB_PROPERTY TO DBAUSERS
;
GRANT INSERT ON CFG_TAB_PROPERTY TO DBAUSERS
;
GRANT SELECT ON CFG_TAB_PROPERTY TO DBAUSERS
;
GRANT UPDATE ON CFG_TAB_PROPERTY TO DBAUSERS
;

-- 
-- TABLE: CFG_TENDER_OPTIONS_CHANGE 
--

CREATE TABLE CFG_TENDER_OPTIONS_CHANGE(
    ORGANIZATION_ID                 NUMBER(10, 0)		  NOT NULL,
    PROFILE_GROUP_ID                VARCHAR2(60 char)     NOT NULL,
    PROFILE_ELEMENT_ID              VARCHAR2(60 char)     NOT NULL,
    CHANGE_ID                       VARCHAR2(254 char)    NOT NULL,
	config_version					NUMBER(19, 0)		  DEFAULT 0 NOT NULL,
    TNDR_ID                         VARCHAR2(60 char)     NOT NULL,
    AUTH_MTHD_CODE                  VARCHAR2(30 char),
    SERIAL_ID_NBR_REQ_FLAG          NUMBER(1, 0)        DEFAULT 0,
    AUTH_REQ_FLAG                   NUMBER(1, 0)        DEFAULT 0,
    AUTH_EXPR_DATE_REQ_FLAG         NUMBER(1, 0)        DEFAULT 0,
    PIN_REQ_FLAG                    NUMBER(1, 0)        DEFAULT 0,
    CUST_SIG_REQ_FLAG               NUMBER(1, 0)        DEFAULT 0,
    ENDORSEMENT_REQ_FLAG            NUMBER(1, 0)        DEFAULT 0,
    OPEN_CASH_DRAWER_REQ_FLAG       NUMBER(1, 0)        DEFAULT 0,
    UNIT_COUNT_REQ_CODE             VARCHAR2(30 char),
    MAG_SWIPE_READER_REQ_FLAG       NUMBER(1, 0)        DEFAULT 0,
    DFLT_TO_AMT_DUE_FLAG            NUMBER(1, 0)        DEFAULT 0,
    MIN_DENOMINATION_AMT            NUMBER(17, 6),
    REPORTING_GROUP                 VARCHAR2(30 char),
    EFFECTIVE_DATE                  DATE,
    EXPR_DATE                       DATE,
    MIN_DAYS_FOR_RETURN             NUMBER(10, 0),
    MAX_DAYS_FOR_RETURN             NUMBER(10, 0),
    CUST_ID_REQ_CODE                VARCHAR2(30 char),
    CUST_ASSOCIATION_FLAG           NUMBER(1, 0)        DEFAULT 0,
    POPULATE_SYSTEM_COUNT_FLAG      NUMBER(1, 0)        DEFAULT 0,
    INCLUDE_IN_TYPE_COUNT_FLAG      NUMBER(1, 0)        DEFAULT 0,
    SUGGESTED_DEPOSIT_THRESHOLD     NUMBER(17, 6),
    SUGGEST_DEPOSIT_FLAG            NUMBER(1, 0)        DEFAULT 0,
    CHANGE_TNDR_ID                  VARCHAR2(60),
    CASH_CHANGE_LIMIT               NUMBER(17, 6),
    OVER_TENDER_OVERRIDABLE_FLAG    NUMBER(1, 0)        DEFAULT 0,
    NON_VOIDABLE_FLAG               NUMBER(1, 0)        DEFAULT 0,
    DISALLOW_SPLIT_TNDR_FLAG        NUMBER(1, 0)        DEFAULT 0,
    CLOSE_COUNT_DISC_THRESHOLD      NUMBER(17, 6),
    CID_MSR_REQ_FLAG                NUMBER(1, 0)        DEFAULT 0,
    CID_KEYED_REQ_FLAG              NUMBER(1, 0)        DEFAULT 0,
    POSTAL_CODE_REQ_FLAG            NUMBER(1, 0)        DEFAULT 0,
    POST_VOID_OPEN_DRAWER_FLAG      NUMBER(1, 0)        DEFAULT 0,
    change_allowed_when_foreign     NUMBER(1, 0)        DEFAULT 0,
    fiscal_tndr_id                  VARCHAR2(10 char),
    rounding_mode                   VARCHAR2(254 char),
    assign_cash_drawer_req_flag     NUMBER(1, 0)        DEFAULT 0,
    post_void_assign_drawer_flag    NUMBER(1, 0)        DEFAULT 0,
    CREATE_DATE                     DATE,
    CREATE_USER_ID                  VARCHAR2(30 char),
    UPDATE_DATE                     DATE,
    UPDATE_USER_ID                  VARCHAR2(30 char),
    RECORD_STATE                    VARCHAR2(30 char),
    CONSTRAINT PK_CFG_TENDER_OPTIONS_CHANGE PRIMARY KEY (ORGANIZATION_ID, PROFILE_GROUP_ID, PROFILE_ELEMENT_ID, CHANGE_ID,config_version)
)
;


GRANT DELETE ON CFG_TENDER_OPTIONS_CHANGE TO POSUSERS
;
GRANT INSERT ON CFG_TENDER_OPTIONS_CHANGE TO POSUSERS
;
GRANT SELECT ON CFG_TENDER_OPTIONS_CHANGE TO POSUSERS
;
GRANT UPDATE ON CFG_TENDER_OPTIONS_CHANGE TO POSUSERS
;
GRANT DELETE ON CFG_TENDER_OPTIONS_CHANGE TO DBAUSERS
;
GRANT INSERT ON CFG_TENDER_OPTIONS_CHANGE TO DBAUSERS
;
GRANT SELECT ON CFG_TENDER_OPTIONS_CHANGE TO DBAUSERS
;
GRANT UPDATE ON CFG_TENDER_OPTIONS_CHANGE TO DBAUSERS
;

-- 
-- TABLE: DAT_RETAIL_LOC_WKSTN_CHANGE 
--

CREATE TABLE DAT_RETAIL_LOC_WKSTN_CHANGE(
    ORGANIZATION_ID    NUMBER(10, 0)	     NOT NULL,
    TARGET_NODE        VARCHAR2(100 char)    NOT NULL,
    TARGET_DATE        VARCHAR2(8 char)      NOT NULL,
    SEQUENCE_NUMBER    NUMBER(10, 0)	     NOT NULL,
    RECORD_ID          VARCHAR2(254 char)    NOT NULL,
    RTL_LOC_ID         NUMBER(10, 0)	     NOT NULL,
    WKSTN_ID           NUMBER(19, 0)	     NOT NULL,
    DELETE_FLAG        NUMBER(1, 0)		     DEFAULT 0 NOT NULL,
    CREATE_DATE        DATE,
    CREATE_USER_ID     VARCHAR2(30 char),
    UPDATE_DATE        DATE,
    UPDATE_USER_ID     VARCHAR2(30 char),
    CONSTRAINT PK_DAT_RETAIL_LOC_WKSTN PRIMARY KEY (ORGANIZATION_ID, TARGET_NODE, TARGET_DATE, SEQUENCE_NUMBER, RECORD_ID, WKSTN_ID)
)
;
GRANT SELECT ON DAT_RETAIL_LOC_WKSTN_CHANGE TO POSUSERS
;
GRANT INSERT ON DAT_RETAIL_LOC_WKSTN_CHANGE TO POSUSERS
;
GRANT UPDATE ON DAT_RETAIL_LOC_WKSTN_CHANGE TO POSUSERS
;
GRANT DELETE ON DAT_RETAIL_LOC_WKSTN_CHANGE TO POSUSERS
;
GRANT SELECT ON DAT_RETAIL_LOC_WKSTN_CHANGE TO DBAUSERS
;
GRANT INSERT ON DAT_RETAIL_LOC_WKSTN_CHANGE TO DBAUSERS
;
GRANT UPDATE ON DAT_RETAIL_LOC_WKSTN_CHANGE TO DBAUSERS
;
GRANT DELETE ON DAT_RETAIL_LOC_WKSTN_CHANGE TO DBAUSERS
;


-- 
-- TABLE: DAT_TENDER_REPOSITORY_CHANGE 
--

CREATE TABLE DAT_TENDER_REPOSITORY_CHANGE(
    ORGANIZATION_ID       NUMBER(10, 0)		    NOT NULL,
    TARGET_NODE           VARCHAR2(100 char)    NOT NULL,
    TARGET_DATE           VARCHAR2(8 char)      NOT NULL,
    SEQUENCE_NUMBER       NUMBER(10, 0)		    NOT NULL,
    RECORD_ID             VARCHAR2(254 char)    NOT NULL,
    RTL_LOC_ID            NUMBER(10, 0)		    NOT NULL,
    TNDR_REPOSITORY_ID    VARCHAR2(60 char)     NOT NULL,
    TYPCODE               VARCHAR2(30 char),
    NOT_ISSUABLE_FLAG     NUMBER(1, 0)		    DEFAULT 0 NOT NULL,
    NAME                  VARCHAR2(254 char),
    DESCRIPTION           VARCHAR2(254 char),
    DFLT_WKSTN_ID         NUMBER(19, 0),
    DELETE_FLAG           NUMBER(1, 0)		    DEFAULT 0 NOT NULL,
    CREATE_DATE           DATE,
    CREATE_USER_ID        VARCHAR2(30 char),
    UPDATE_DATE           DATE,
    UPDATE_USER_ID        VARCHAR2(30 char),
    CONSTRAINT PK_DAT_TENDER_REPOSITORY PRIMARY KEY (ORGANIZATION_ID, TARGET_NODE, TARGET_DATE, SEQUENCE_NUMBER, RECORD_ID, TNDR_REPOSITORY_ID)
)
;

GRANT DELETE ON DAT_TENDER_REPOSITORY_CHANGE TO POSUSERS
;
GRANT INSERT ON DAT_TENDER_REPOSITORY_CHANGE TO POSUSERS
;
GRANT SELECT ON DAT_TENDER_REPOSITORY_CHANGE TO POSUSERS
;
GRANT UPDATE ON DAT_TENDER_REPOSITORY_CHANGE TO POSUSERS
;
GRANT DELETE ON DAT_TENDER_REPOSITORY_CHANGE TO DBAUSERS
;
GRANT INSERT ON DAT_TENDER_REPOSITORY_CHANGE TO DBAUSERS
;
GRANT SELECT ON DAT_TENDER_REPOSITORY_CHANGE TO DBAUSERS
;
GRANT UPDATE ON DAT_TENDER_REPOSITORY_CHANGE TO DBAUSERS
;
-- 
-- TABLE: DAT_TENDER_REP_FLOAT_CHANGE 
--

CREATE TABLE DAT_TENDER_REP_FLOAT_CHANGE(
    ORGANIZATION_ID        NUMBER(10, 0)	     NOT NULL,
    TARGET_NODE            VARCHAR2(100 char)    NOT NULL,
    TARGET_DATE            VARCHAR2(8 char)      NOT NULL,
    SEQUENCE_NUMBER        NUMBER(10, 0)	     NOT NULL,
    RECORD_ID              VARCHAR2(254 char)    NOT NULL,
    RTL_LOC_ID             NUMBER(10, 0)	     NOT NULL,
    TNDR_REPOSITORY_ID     VARCHAR2(60 char)     NOT NULL,
    CURRENCY_ID            VARCHAR2(3 char)      NOT NULL,
    DEFAULT_CASH_FLOAT     NUMBER(17, 6),
    LAST_CLOSING_AMOUNT    NUMBER(17, 6),
    DELETE_FLAG            NUMBER(1, 0)		     DEFAULT 0 NOT NULL,
    CREATE_DATE            DATE,
    CREATE_USER_ID         VARCHAR2(30 char),
    UPDATE_DATE            DATE,
    UPDATE_USER_ID         VARCHAR2(30 char),
    CONSTRAINT PK_DAT_TENDER_REP_FLOAT PRIMARY KEY (ORGANIZATION_ID, TARGET_NODE, TARGET_DATE, SEQUENCE_NUMBER, RECORD_ID, TNDR_REPOSITORY_ID, CURRENCY_ID)
)
;
GRANT SELECT ON DAT_TENDER_REP_FLOAT_CHANGE TO POSUSERS
;
GRANT INSERT ON DAT_TENDER_REP_FLOAT_CHANGE TO POSUSERS
;
GRANT UPDATE ON DAT_TENDER_REP_FLOAT_CHANGE TO POSUSERS
;
GRANT DELETE ON DAT_TENDER_REP_FLOAT_CHANGE TO POSUSERS
;
GRANT SELECT ON DAT_TENDER_REP_FLOAT_CHANGE TO DBAUSERS
;
GRANT INSERT ON DAT_TENDER_REP_FLOAT_CHANGE TO DBAUSERS
;
GRANT UPDATE ON DAT_TENDER_REP_FLOAT_CHANGE TO DBAUSERS
;
GRANT DELETE ON DAT_TENDER_REP_FLOAT_CHANGE TO DBAUSERS
;

-- 
-- TABLE: cfg_alert_severity_threshold 
--

CREATE TABLE cfg_alert_severity_threshold(
    organization_id       NUMBER(10, 0)		    NOT NULL,
    alert_type            VARCHAR2(60 char)     NOT NULL,
    medium_threshold      NUMBER(10, 0),
    high_threshold        NUMBER(10, 0),
    critical_threshold    NUMBER(10, 0),
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_cfg_alert_severity_thrshld PRIMARY KEY (alert_type, organization_id)
)
;


GRANT SELECT ON cfg_alert_severity_threshold TO POSUSERS
;
GRANT INSERT ON cfg_alert_severity_threshold TO POSUSERS
;
GRANT UPDATE ON cfg_alert_severity_threshold TO POSUSERS
;
GRANT DELETE ON cfg_alert_severity_threshold TO POSUSERS
;
GRANT SELECT ON cfg_alert_severity_threshold TO DBAUSERS
;
GRANT INSERT ON cfg_alert_severity_threshold TO DBAUSERS
;
GRANT UPDATE ON cfg_alert_severity_threshold TO DBAUSERS
;
GRANT DELETE ON cfg_alert_severity_threshold TO DBAUSERS
;

-- 
-- TABLE: cfg_code_category 
--

CREATE TABLE cfg_code_category(
    organization_id    NUMBER(10, 0)		 NOT NULL,
    category_group     VARCHAR2(254 char),
    category           VARCHAR2(254 char)    NOT NULL,
    internal_flag      NUMBER(1, 0)			 DEFAULT 0 NOT NULL,
    description        VARCHAR2(254 char),
    comments           VARCHAR2(254 char),
    privilege_id       VARCHAR2(30 char),
    uses_image_url     NUMBER(1, 0)			 DEFAULT 0 NOT NULL,
    uses_rank          NUMBER(1, 0)			 DEFAULT 0 NOT NULL,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_cfg_code_category PRIMARY KEY (organization_id, category)
)
;


GRANT SELECT ON cfg_code_category TO POSUSERS
;
GRANT INSERT ON cfg_code_category TO POSUSERS
;
GRANT UPDATE ON cfg_code_category TO POSUSERS
;
GRANT DELETE ON cfg_code_category TO POSUSERS
;
GRANT SELECT ON cfg_code_category TO DBAUSERS
;
GRANT INSERT ON cfg_code_category TO DBAUSERS
;
GRANT UPDATE ON cfg_code_category TO DBAUSERS
;
GRANT DELETE ON cfg_code_category TO DBAUSERS
;

-- 
-- TABLE: cfg_code_value 
--

CREATE TABLE cfg_code_value(
    code_id           NUMBER(19, 0)			NOT NULL,
    category          VARCHAR2(30 char)     NOT NULL,
    config_name       VARCHAR2(195 char)    NOT NULL,
    code              VARCHAR2(195 char)    NOT NULL,
    sub_category      VARCHAR2(30 char)     NOT NULL,
    description       VARCHAR2(256 char),
    sort_order        NUMBER(10, 0),
    data1             VARCHAR2(120 char),
    data2             VARCHAR2(120 char),
    data3             VARCHAR2(120 char),
    create_date       DATE,
    create_user_id    VARCHAR2(30 char),
    update_date       DATE,
    update_user_id    VARCHAR2(30 char),
    CONSTRAINT pk_cfg_code_value PRIMARY KEY (code_id),
    CONSTRAINT uq_cfg_code_value  UNIQUE (category, config_name, sub_category, code)
)
;


GRANT SELECT ON cfg_code_value TO POSUSERS
;
GRANT INSERT ON cfg_code_value TO POSUSERS
;
GRANT UPDATE ON cfg_code_value TO POSUSERS
;
GRANT DELETE ON cfg_code_value TO POSUSERS
;
GRANT SELECT ON cfg_code_value TO DBAUSERS
;
GRANT INSERT ON cfg_code_value TO DBAUSERS
;
GRANT UPDATE ON cfg_code_value TO DBAUSERS
;
GRANT DELETE ON cfg_code_value TO DBAUSERS
;

-- 
-- TABLE: cfg_code_value_change 
--

CREATE TABLE cfg_code_value_change(
    organization_id       NUMBER(10, 0)		    NOT NULL,
    profile_group_id      VARCHAR2(60 char)     NOT NULL,
    profile_element_id    VARCHAR2(60 char)     NOT NULL,
    change_id             VARCHAR2(254 char)    NOT NULL,
	config_version		  NUMBER(19, 0)		    DEFAULT 0 NOT NULL,
    category              VARCHAR2(30 char)     NOT NULL,
    code                  VARCHAR2(60 char)     NOT NULL,
    description           VARCHAR2(254 char),
    sort_order            NUMBER(10, 0),
    hidden_flag           NUMBER(1, 0)		    DEFAULT 0,
    enabled_flag          NUMBER(1, 0)		    DEFAULT 0,
    image_url             VARCHAR2(254 char),
    rank                  NUMBER(10, 0),
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_cfg_code_value_change PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_id,config_version)
)
;


GRANT SELECT ON cfg_code_value_change TO POSUSERS
;
GRANT INSERT ON cfg_code_value_change TO POSUSERS
;
GRANT UPDATE ON cfg_code_value_change TO POSUSERS
;
GRANT DELETE ON cfg_code_value_change TO POSUSERS
;
GRANT SELECT ON cfg_code_value_change TO DBAUSERS
;
GRANT INSERT ON cfg_code_value_change TO DBAUSERS
;
GRANT UPDATE ON cfg_code_value_change TO DBAUSERS
;
GRANT DELETE ON cfg_code_value_change TO DBAUSERS
;

-- 
-- TABLE: cfg_critical_alert_email 
--

CREATE TABLE cfg_critical_alert_email(
    organization_id    NUMBER(10, 0)	     NOT NULL,
    email_address      VARCHAR2(254 char)    NOT NULL,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_cfg_critical_alert_email PRIMARY KEY (organization_id, email_address)
)
;

GRANT SELECT ON cfg_critical_alert_email TO POSUSERS
;
GRANT INSERT ON cfg_critical_alert_email TO POSUSERS
;
GRANT UPDATE ON cfg_critical_alert_email TO POSUSERS
;
GRANT DELETE ON cfg_critical_alert_email TO POSUSERS
;
GRANT SELECT ON cfg_critical_alert_email TO DBAUSERS
;
GRANT INSERT ON cfg_critical_alert_email TO DBAUSERS
;
GRANT UPDATE ON cfg_critical_alert_email TO DBAUSERS
;
GRANT DELETE ON cfg_critical_alert_email TO DBAUSERS
;

-- 
-- TABLE: cfg_desc_translation_map 
--

CREATE TABLE cfg_desc_translation_map(
    s_organization_id       NUMBER(10, 0)		  NOT NULL,
    s_profile_group_id      VARCHAR2(60 char)     NOT NULL,
    s_profile_element_id    VARCHAR2(60 char)     NOT NULL,
	s_config_version		NUMBER(19, 0),
    change_id               VARCHAR2(254 char)    NOT NULL,
    t_organization_id       NUMBER(10, 0)		  NOT NULL,
    t_profile_group_id      VARCHAR2(60 char)     NOT NULL,
    t_profile_element_id    VARCHAR2(60 char)     NOT NULL,
	t_config_version		NUMBER(19, 0),
    translation_key         VARCHAR2(150 char)    NOT NULL,
    locale                  VARCHAR2(30 char)     NOT NULL
)
;


GRANT SELECT ON cfg_desc_translation_map TO POSUSERS
;
GRANT INSERT ON cfg_desc_translation_map TO POSUSERS
;
GRANT UPDATE ON cfg_desc_translation_map TO POSUSERS
;
GRANT DELETE ON cfg_desc_translation_map TO POSUSERS
;
GRANT SELECT ON cfg_desc_translation_map TO DBAUSERS
;
GRANT INSERT ON cfg_desc_translation_map TO DBAUSERS
;
GRANT UPDATE ON cfg_desc_translation_map TO DBAUSERS
;
GRANT DELETE ON cfg_desc_translation_map TO DBAUSERS
;

-- 
-- TABLE: cfg_description_translation 
--

CREATE TABLE cfg_description_translation(
    organization_id       NUMBER(10, 0)		     NOT NULL,
    profile_group_id      VARCHAR2(60 char)      NOT NULL,
    profile_element_id    VARCHAR2(60 char)      NOT NULL,
    translation_key       VARCHAR2(150 char)     NOT NULL,
    locale                VARCHAR2(30 char)      NOT NULL,
	config_version		  NUMBER(19, 0)			 DEFAULT 0 NOT NULL,
    translation           VARCHAR2(4000 char),
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_cfg_translation PRIMARY KEY (organization_id, profile_group_id, profile_element_id, translation_key, locale,config_version)
)
;


GRANT SELECT ON cfg_description_translation TO POSUSERS
;
GRANT INSERT ON cfg_description_translation TO POSUSERS
;
GRANT UPDATE ON cfg_description_translation TO POSUSERS
;
GRANT DELETE ON cfg_description_translation TO POSUSERS
;
GRANT SELECT ON cfg_description_translation TO DBAUSERS
;
GRANT INSERT ON cfg_description_translation TO DBAUSERS
;
GRANT UPDATE ON cfg_description_translation TO DBAUSERS
;
GRANT DELETE ON cfg_description_translation TO DBAUSERS
;

-- 
-- TABLE: cfg_discount_change 
--

CREATE TABLE cfg_discount_change(
    organization_id         NUMBER(10, 0)	      NOT NULL,
    profile_group_id        VARCHAR2(60 char)     NOT NULL,
    profile_element_id      VARCHAR2(60 char)     NOT NULL,
    change_id               VARCHAR2(254 char)    NOT NULL,
	config_version			NUMBER(19, 0)		  DEFAULT 0 NOT NULL,
    discount_code           VARCHAR2(60 char)     NOT NULL,
    enabled_flag            NUMBER(1, 0)	      DEFAULT 0,
    effective_date          DATE,
    expiration_date         DATE,
    type_code               VARCHAR2(30 char),
    application_method      VARCHAR2(30 char),
    percentage              NUMBER(6, 4),
    description             VARCHAR2(254 char),
    calculation_method      VARCHAR2(30 char),
    prompt_message          VARCHAR2(254 char),
    max_trans_count         NUMBER(10, 0),
    exclusive_flag          NUMBER(1, 0)	      DEFAULT 0,
    privilege_type          VARCHAR2(60 char),
    amount                  NUMBER(17, 6),
    min_eligible_amount     NUMBER(17, 6),
    serialized_flag         NUMBER(1, 0)	      DEFAULT 0,
    max_discount_amount     NUMBER(17, 6),
    sort_order              NUMBER(10, 0),
    disallow_change_flag    NUMBER(1, 0)	      DEFAULT 0,
	max_amount				number(17,6),
	max_percentage			number(17,6),
    create_date             DATE,
    create_user_id          VARCHAR2(30 char),
    update_date             DATE,
    update_user_id          VARCHAR2(30 char),
    CONSTRAINT pk_dsc_discount_change PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_id,config_version)
)
;


GRANT SELECT ON cfg_discount_change TO POSUSERS
;
GRANT INSERT ON cfg_discount_change TO POSUSERS
;
GRANT UPDATE ON cfg_discount_change TO POSUSERS
;
GRANT DELETE ON cfg_discount_change TO POSUSERS
;
GRANT SELECT ON cfg_discount_change TO DBAUSERS
;
GRANT INSERT ON cfg_discount_change TO DBAUSERS
;
GRANT UPDATE ON cfg_discount_change TO DBAUSERS
;
GRANT DELETE ON cfg_discount_change TO DBAUSERS
;

-- 
-- TABLE: cfg_dsc_group_mapping_change 
--

CREATE TABLE cfg_dsc_group_mapping_change(
    organization_id       NUMBER(10, 0)		    NOT NULL,
    profile_group_id      VARCHAR2(60 char)     NOT NULL,
    profile_element_id    VARCHAR2(60 char)     NOT NULL,
    change_id             VARCHAR2(254 char)    NOT NULL,
    discount_code         VARCHAR2(60 char)     NOT NULL,
    customer_group_id     VARCHAR2(60 char)     NOT NULL,
	config_version		  NUMBER(19, 0)		    DEFAULT 0 NOT NULL,
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_cfg_dsc_grp_mapping_change PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_id, customer_group_id,config_version)
)
;


GRANT SELECT ON cfg_dsc_group_mapping_change TO POSUSERS
;
GRANT INSERT ON cfg_dsc_group_mapping_change TO POSUSERS
;
GRANT UPDATE ON cfg_dsc_group_mapping_change TO POSUSERS
;
GRANT DELETE ON cfg_dsc_group_mapping_change TO POSUSERS
;
GRANT SELECT ON cfg_dsc_group_mapping_change TO DBAUSERS
;
GRANT INSERT ON cfg_dsc_group_mapping_change TO DBAUSERS
;
GRANT UPDATE ON cfg_dsc_group_mapping_change TO DBAUSERS
;
GRANT DELETE ON cfg_dsc_group_mapping_change TO DBAUSERS
;

-- 
-- TABLE: cfg_dsc_valid_item_type_change 
--

CREATE TABLE cfg_dsc_valid_item_type_change(
    organization_id       NUMBER(10, 0)		    NOT NULL,
    profile_group_id      VARCHAR2(60 char)     NOT NULL,
    profile_element_id    VARCHAR2(60 char)     NOT NULL,
    change_id             VARCHAR2(254 char)    NOT NULL,
    discount_code         VARCHAR2(60 char)     NOT NULL,
    item_type_code        VARCHAR2(30 char)     NOT NULL,
	config_version		  NUMBER(19, 0)		    DEFAULT 0 NOT NULL,
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_cfg_dsc_vld_itm_type_change PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_id, item_type_code,config_version)
)
;


GRANT SELECT ON cfg_dsc_valid_item_type_change TO POSUSERS
;
GRANT INSERT ON cfg_dsc_valid_item_type_change TO POSUSERS
;
GRANT UPDATE ON cfg_dsc_valid_item_type_change TO POSUSERS
;
GRANT DELETE ON cfg_dsc_valid_item_type_change TO POSUSERS
;
GRANT SELECT ON cfg_dsc_valid_item_type_change TO DBAUSERS
;
GRANT INSERT ON cfg_dsc_valid_item_type_change TO DBAUSERS
;
GRANT UPDATE ON cfg_dsc_valid_item_type_change TO DBAUSERS
;
GRANT DELETE ON cfg_dsc_valid_item_type_change TO DBAUSERS
;

-- 
-- TABLE: cfg_menu_config 
--

CREATE TABLE cfg_menu_config(
    category                    VARCHAR2(60 char)      NOT NULL,
    menu_name                   VARCHAR2(100 char)     NOT NULL,
    parent_menu_name            VARCHAR2(100 char),
    config_type                 VARCHAR2(120 char),
    title                       VARCHAR2(60 char),
    menu_type                   VARCHAR2(30 char),
    sort_order                  NUMBER(10, 0),
    view_id                     VARCHAR2(200 char),
    action_expression           VARCHAR2(200 char),
    active_flag                 NUMBER(1, 0)		   DEFAULT 0 NOT NULL,
    propagation                 VARCHAR2(30 char),
    security_privilege          VARCHAR2(30 char),
    custom_datasource_class     VARCHAR2(200 char),
    custom_datasource_method    VARCHAR2(30 char),
    menu_small_icon             VARCHAR2(254 char),
    menu_separator              NUMBER(1, 0)		   DEFAULT 0,
    description                 VARCHAR2(4000 char),
    create_date                 DATE,
    create_user_id              VARCHAR2(30 char),
    update_date                 DATE,
    update_user_id              VARCHAR2(30 char),
    CONSTRAINT pk_cfg_menu_config PRIMARY KEY (category, menu_name)
)
;


GRANT SELECT ON cfg_menu_config TO POSUSERS
;
GRANT INSERT ON cfg_menu_config TO POSUSERS
;
GRANT UPDATE ON cfg_menu_config TO POSUSERS
;
GRANT DELETE ON cfg_menu_config TO POSUSERS
;
GRANT SELECT ON cfg_menu_config TO DBAUSERS
;
GRANT INSERT ON cfg_menu_config TO DBAUSERS
;
GRANT UPDATE ON cfg_menu_config TO DBAUSERS
;
GRANT DELETE ON cfg_menu_config TO DBAUSERS
;

-- 
-- TABLE: cfg_message_translation 
--

CREATE TABLE cfg_message_translation(
    organization_id       NUMBER(10, 0)		     NOT NULL,
    profile_group_id      VARCHAR2(60 char)      NOT NULL,
    profile_element_id    VARCHAR2(60 char)      NOT NULL,
    translation_key       VARCHAR2(150 char)     NOT NULL,
    locale                VARCHAR2(30 char)      NOT NULL,
	config_version		  NUMBER(19, 0)			 DEFAULT 0 NOT NULL,
    translation           VARCHAR2(4000 char),
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_cfg_message_translation PRIMARY KEY (organization_id, profile_group_id, profile_element_id, translation_key, locale,config_version)
)
;


GRANT SELECT ON cfg_message_translation TO POSUSERS
;
GRANT INSERT ON cfg_message_translation TO POSUSERS
;
GRANT UPDATE ON cfg_message_translation TO POSUSERS
;
GRANT DELETE ON cfg_message_translation TO POSUSERS
;
GRANT SELECT ON cfg_message_translation TO DBAUSERS
;
GRANT INSERT ON cfg_message_translation TO DBAUSERS
;
GRANT UPDATE ON cfg_message_translation TO DBAUSERS
;
GRANT DELETE ON cfg_message_translation TO DBAUSERS
;

-- 
-- TABLE: cfg_msg_translation_map 
--

CREATE TABLE cfg_msg_translation_map(
    s_organization_id       NUMBER(10, 0)		  NOT NULL,
    s_profile_group_id      VARCHAR2(60 char)     NOT NULL,
    s_profile_element_id    VARCHAR2(60 char)     NOT NULL,
	s_config_version		NUMBER(19, 0),
    change_id               VARCHAR2(254 char)    NOT NULL,
    t_organization_id       NUMBER(10, 0)		  NOT NULL,
    t_profile_group_id      VARCHAR2(60 char)     NOT NULL,
    t_profile_element_id    VARCHAR2(60 char)     NOT NULL,
	t_config_version		NUMBER(19, 0),
    translation_key         VARCHAR2(150 char)    NOT NULL,
    locale                  VARCHAR2(30 char)     NOT NULL
)
;


GRANT SELECT ON cfg_msg_translation_map TO POSUSERS
;
GRANT INSERT ON cfg_msg_translation_map TO POSUSERS
;
GRANT UPDATE ON cfg_msg_translation_map TO POSUSERS
;
GRANT DELETE ON cfg_msg_translation_map TO POSUSERS
;
GRANT SELECT ON cfg_msg_translation_map TO DBAUSERS
;
GRANT INSERT ON cfg_msg_translation_map TO DBAUSERS
;
GRANT UPDATE ON cfg_msg_translation_map TO DBAUSERS
;
GRANT DELETE ON cfg_msg_translation_map TO DBAUSERS
;

-- 
-- TABLE: cfg_org_hierarchy_level 
--

CREATE TABLE cfg_org_hierarchy_level(
    organization_id    NUMBER(10, 0)		 NOT NULL,
    org_code           VARCHAR2(30 char)     NOT NULL,
    parent_org_code    VARCHAR2(30 char),
    description        VARCHAR2(254 char),
    system_flag        NUMBER(1, 0)			 DEFAULT 0,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_cfg_org_hierarchy_level PRIMARY KEY (organization_id, org_code)
)
;


GRANT SELECT ON cfg_org_hierarchy_level TO POSUSERS
;
GRANT INSERT ON cfg_org_hierarchy_level TO POSUSERS
;
GRANT UPDATE ON cfg_org_hierarchy_level TO POSUSERS
;
GRANT DELETE ON cfg_org_hierarchy_level TO POSUSERS
;
GRANT SELECT ON cfg_org_hierarchy_level TO DBAUSERS
;
GRANT INSERT ON cfg_org_hierarchy_level TO DBAUSERS
;
GRANT UPDATE ON cfg_org_hierarchy_level TO DBAUSERS
;
GRANT DELETE ON cfg_org_hierarchy_level TO DBAUSERS
;

-- 
-- TABLE: cfg_privilege 
--

CREATE TABLE cfg_privilege(
    privilege_id      VARCHAR2(30 char)     NOT NULL,
    privilege_desc    VARCHAR2(255 char),
    short_desc        VARCHAR2(60 char),
    category          VARCHAR2(30 char),
    create_date       DATE,
    create_user_id    VARCHAR2(30 char),
    update_date       DATE,
    update_user_id    VARCHAR2(30 char),
    CONSTRAINT pk_cfg_privileges PRIMARY KEY (privilege_id)
)
;


GRANT SELECT ON cfg_privilege TO POSUSERS
;
GRANT INSERT ON cfg_privilege TO POSUSERS
;
GRANT UPDATE ON cfg_privilege TO POSUSERS
;
GRANT DELETE ON cfg_privilege TO POSUSERS
;
GRANT SELECT ON cfg_privilege TO DBAUSERS
;
GRANT INSERT ON cfg_privilege TO DBAUSERS
;
GRANT UPDATE ON cfg_privilege TO DBAUSERS
;
GRANT DELETE ON cfg_privilege TO DBAUSERS
;

-- 
-- TABLE: cfg_profile_element 
--

CREATE TABLE cfg_profile_element(
    element_id             VARCHAR2(60 char)      NOT NULL,
    group_id               VARCHAR2(60 char)      NOT NULL,
    element_description    VARCHAR2(255 char),
    comments               VARCHAR2(4000 char),
    organization_id        NUMBER(10, 0)		  NOT NULL,
    create_date            DATE,
    create_user_id         VARCHAR2(30 char),
    update_date            DATE,
    update_user_id         VARCHAR2(30 char),
    CONSTRAINT pk_cfg_profile_element PRIMARY KEY (organization_id, element_id, group_id)
)
;

GRANT SELECT ON cfg_profile_element TO POSUSERS
;
GRANT INSERT ON cfg_profile_element TO POSUSERS
;
GRANT UPDATE ON cfg_profile_element TO POSUSERS
;
GRANT DELETE ON cfg_profile_element TO POSUSERS
;
GRANT SELECT ON cfg_profile_element TO DBAUSERS
;
GRANT INSERT ON cfg_profile_element TO DBAUSERS
;
GRANT UPDATE ON cfg_profile_element TO DBAUSERS
;
GRANT DELETE ON cfg_profile_element TO DBAUSERS
;

-- 
-- TABLE: cfg_profile_element_changes 
--

CREATE TABLE cfg_profile_element_changes(
    organization_id       NUMBER(10, 0)		    NOT NULL,
    profile_group_id      VARCHAR2(60 char)     NOT NULL,
    profile_element_id    VARCHAR2(60 char)     NOT NULL,
    change_type           VARCHAR2(60 char)     NOT NULL,
    change_subtype        VARCHAR2(254 char)    NOT NULL,
    config_version        NUMBER(19, 0)		    DEFAULT 0 NOT NULL,
    change_format         VARCHAR2(30 char),
    changes               CLOB,
    inactive_flag         NUMBER(1, 0)		    DEFAULT 0 NOT NULL,
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_cfg_profile_element_changes PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_type, change_subtype,config_version)
)
;


GRANT SELECT ON cfg_profile_element_changes TO POSUSERS
;
GRANT INSERT ON cfg_profile_element_changes TO POSUSERS
;
GRANT UPDATE ON cfg_profile_element_changes TO POSUSERS
;
GRANT DELETE ON cfg_profile_element_changes TO POSUSERS
;
GRANT SELECT ON cfg_profile_element_changes TO DBAUSERS
;
GRANT INSERT ON cfg_profile_element_changes TO DBAUSERS
;
GRANT UPDATE ON cfg_profile_element_changes TO DBAUSERS
;
GRANT DELETE ON cfg_profile_element_changes TO DBAUSERS
;

-- 
-- TABLE: cfg_profile_group 
--

CREATE TABLE cfg_profile_group(
    group_id             VARCHAR2(60 char)      NOT NULL,
    group_description    VARCHAR2(255 char),
    comments             VARCHAR2(4000 char),
    organization_id      NUMBER(10, 0)		    NOT NULL,
	group_type			 varchar2(60 char),
    create_date          DATE,
    create_user_id       VARCHAR2(30 char),
    update_date          DATE,
    update_user_id       VARCHAR2(30 char),
    CONSTRAINT pk_cfg_profile_group PRIMARY KEY (organization_id, group_id)
)
;

GRANT SELECT ON cfg_profile_group TO POSUSERS
;
GRANT INSERT ON cfg_profile_group TO POSUSERS
;
GRANT UPDATE ON cfg_profile_group TO POSUSERS
;
GRANT DELETE ON cfg_profile_group TO POSUSERS
;
GRANT SELECT ON cfg_profile_group TO DBAUSERS
;
GRANT INSERT ON cfg_profile_group TO DBAUSERS
;
GRANT UPDATE ON cfg_profile_group TO DBAUSERS
;
GRANT DELETE ON cfg_profile_group TO DBAUSERS
;

-- 
-- TABLE: cfg_reason_code_change 
--

CREATE TABLE cfg_reason_code_change(
    organization_id       NUMBER(10, 0)		    NOT NULL,
    profile_group_id      VARCHAR2(60 char)     NOT NULL,
    profile_element_id    VARCHAR2(60 char)     NOT NULL,
    change_id             VARCHAR2(254 char)    NOT NULL,
	config_version		  NUMBER(19, 0)			DEFAULT 0 NOT NULL,
    enabled_flag          NUMBER(1, 0)			DEFAULT 0,
    type_code             VARCHAR2(30 char)     NOT NULL,
    reason_code           VARCHAR2(30 char)     NOT NULL,
    description           VARCHAR2(254 char),
    parent_code           VARCHAR2(30 char),
    gl_account_number     VARCHAR2(254 char),
    min_amount            NUMBER(17, 6),
    max_amount            NUMBER(17, 6),
    comment_req           VARCHAR2(10 char),
    cust_message          VARCHAR2(254 char),
    inv_action_code       VARCHAR2(30 char),
    location_id           VARCHAR2(60 char),
    bucket_id             VARCHAR2(60 char),
    sort_order            NUMBER(10, 0),
    hidden_flag           NUMBER(1, 0)			DEFAULT 0,
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_cfg_reason_code_change PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_id,config_version)
)
;


GRANT SELECT ON cfg_reason_code_change TO POSUSERS
;
GRANT INSERT ON cfg_reason_code_change TO POSUSERS
;
GRANT UPDATE ON cfg_reason_code_change TO POSUSERS
;
GRANT DELETE ON cfg_reason_code_change TO POSUSERS
;
GRANT SELECT ON cfg_reason_code_change TO DBAUSERS
;
GRANT INSERT ON cfg_reason_code_change TO DBAUSERS
;
GRANT UPDATE ON cfg_reason_code_change TO DBAUSERS
;
GRANT DELETE ON cfg_reason_code_change TO DBAUSERS
;

-- 
-- TABLE: cfg_receipt_text_change 
--

CREATE TABLE cfg_receipt_text_change(
    organization_id       NUMBER(10, 0)		     NOT NULL,
    profile_group_id      VARCHAR2(60 char)      NOT NULL,
    profile_element_id    VARCHAR2(60 char)      NOT NULL,
    change_id             VARCHAR2(254 char)     NOT NULL,
	config_version		  NUMBER(19, 0)			 DEFAULT 0 NOT NULL,
    text_code             VARCHAR2(30 char)      NOT NULL,
    text_subcode          VARCHAR2(30 char)      NOT NULL,
    receipt_text          VARCHAR2(4000 char)    NOT NULL,
    eff_date              DATE,
    expr_date             DATE,
    line_format           VARCHAR2(254 char),
    reformat_flag         NUMBER(1, 0)			 DEFAULT 1,
    text_seq              NUMBER(10, 0)			 DEFAULT 0 NOT NULL,
    enabled_flag          NUMBER(1, 0)			 DEFAULT 1,
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_cfg_receipt_text_changes PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_id,config_version)
)
;


GRANT SELECT ON cfg_receipt_text_change TO POSUSERS
;
GRANT INSERT ON cfg_receipt_text_change TO POSUSERS
;
GRANT UPDATE ON cfg_receipt_text_change TO POSUSERS
;
GRANT DELETE ON cfg_receipt_text_change TO POSUSERS
;
GRANT SELECT ON cfg_receipt_text_change TO DBAUSERS
;
GRANT INSERT ON cfg_receipt_text_change TO DBAUSERS
;
GRANT UPDATE ON cfg_receipt_text_change TO DBAUSERS
;
GRANT DELETE ON cfg_receipt_text_change TO DBAUSERS
;

-- 
-- TABLE: cfg_resource 
--

CREATE TABLE cfg_resource(
    organization_id		number(10,0)		NOT NULL,
    profile_group_id	varchar2(60 char)	NOT NULL,
    profile_element_id	varchar2(60 char)	NOT NULL,
    bundle_name			VARCHAR2(60 char)	NOT NULL,
    locale				VARCHAR2(30 char)	NOT NULL,
	config_version		number(19,0)		DEFAULT 0 NOT NULL,
    data				VARCHAR2(4000 char),
    create_date			DATE,
    create_user_id		VARCHAR2(30 char),
    update_date			DATE,
    update_user_id		VARCHAR2(30 char),
    CONSTRAINT pk_cfg_resource_bundle PRIMARY KEY (organization_id, profile_group_id, profile_element_id, bundle_name, locale, config_version)
)
;


GRANT SELECT ON cfg_resource TO POSUSERS
;
GRANT INSERT ON cfg_resource TO POSUSERS
;
GRANT UPDATE ON cfg_resource TO POSUSERS
;
GRANT DELETE ON cfg_resource TO POSUSERS
;
GRANT SELECT ON cfg_resource TO DBAUSERS
;
GRANT INSERT ON cfg_resource TO DBAUSERS
;
GRANT UPDATE ON cfg_resource TO DBAUSERS
;
GRANT DELETE ON cfg_resource TO DBAUSERS
;

-- 
-- TABLE: cfg_role 
--

CREATE TABLE cfg_role(
    role_id             VARCHAR2(30 char)     NOT NULL,
    role_desc           VARCHAR2(255 char),
    system_role_flag    NUMBER(1, 0)		  DEFAULT 0 NOT NULL,
    xadmin_rank         NUMBER(10, 0)		  DEFAULT 0 NOT NULL,
    xstore_rank         NUMBER(10, 0)		  DEFAULT 0 NOT NULL,
    create_date         DATE,
    create_user_id      VARCHAR2(30 char),
    update_date         DATE,
    update_user_id      VARCHAR2(30 char),
    CONSTRAINT pk_cfg_role PRIMARY KEY (role_id)
)
;


GRANT SELECT ON cfg_role TO POSUSERS
;
GRANT INSERT ON cfg_role TO POSUSERS
;
GRANT UPDATE ON cfg_role TO POSUSERS
;
GRANT DELETE ON cfg_role TO POSUSERS
;
GRANT SELECT ON cfg_role TO DBAUSERS
;
GRANT INSERT ON cfg_role TO DBAUSERS
;
GRANT UPDATE ON cfg_role TO DBAUSERS
;
GRANT DELETE ON cfg_role TO DBAUSERS
;

-- 
-- TABLE: cfg_role_privilege 
--

CREATE TABLE cfg_role_privilege(
    role_id           VARCHAR2(30 char)    NOT NULL,
    privilege_id      VARCHAR2(30 char)    NOT NULL,
    create_date       DATE,
    create_user_id    VARCHAR2(30 char),
    update_date       DATE,
    update_user_id    VARCHAR2(30 char),
    CONSTRAINT pk_cfg_role_privilege PRIMARY KEY (role_id, privilege_id)
)
;


GRANT SELECT ON cfg_role_privilege TO POSUSERS
;
GRANT INSERT ON cfg_role_privilege TO POSUSERS
;
GRANT UPDATE ON cfg_role_privilege TO POSUSERS
;
GRANT DELETE ON cfg_role_privilege TO POSUSERS
;
GRANT SELECT ON cfg_role_privilege TO DBAUSERS
;
GRANT INSERT ON cfg_role_privilege TO DBAUSERS
;
GRANT UPDATE ON cfg_role_privilege TO DBAUSERS
;
GRANT DELETE ON cfg_role_privilege TO DBAUSERS
;

-- 
-- TABLE: cfg_sec_group_change 
--

CREATE TABLE cfg_sec_group_change(
    organization_id       NUMBER(10, 0)		    NOT NULL,
    profile_group_id      VARCHAR2(60 char)     NOT NULL,
    profile_element_id    VARCHAR2(60 char)     NOT NULL,
    change_id             VARCHAR2(254 char)    NOT NULL,
	config_version		  NUMBER(19, 0)			DEFAULT 0 NOT NULL,
    group_id              VARCHAR2(60 char)     NOT NULL,
    description           VARCHAR2(254 char),
    bitmap_position       NUMBER(10, 0),
    group_rank            NUMBER(10, 0),
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_cfg_sec_group_change PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_id,config_version)
)
;


GRANT SELECT ON cfg_sec_group_change TO POSUSERS
;
GRANT INSERT ON cfg_sec_group_change TO POSUSERS
;
GRANT UPDATE ON cfg_sec_group_change TO POSUSERS
;
GRANT DELETE ON cfg_sec_group_change TO POSUSERS
;
GRANT SELECT ON cfg_sec_group_change TO DBAUSERS
;
GRANT INSERT ON cfg_sec_group_change TO DBAUSERS
;
GRANT UPDATE ON cfg_sec_group_change TO DBAUSERS
;
GRANT DELETE ON cfg_sec_group_change TO DBAUSERS
;

-- 
-- TABLE: cfg_sec_privilege_change 
--

CREATE TABLE cfg_sec_privilege_change(
    organization_id                   NUMBER(10, 0)		     NOT NULL,
    profile_group_id                  VARCHAR2(60 char)      NOT NULL,
    profile_element_id                VARCHAR2(60 char)      NOT NULL,
    change_id                         VARCHAR2(254 char)     NOT NULL,
	config_version					  NUMBER(19, 0)			 DEFAULT 0 NOT NULL,
    privilege_type                    VARCHAR2(60 char)      NOT NULL,
    authentication_req                NUMBER(1, 0)		     DEFAULT 0,
    description                       VARCHAR2(254 char),
    overridable_flag                  NUMBER(1, 0)		     DEFAULT 0,
    group_membership                  VARCHAR2(4000 char),
    second_prompt_settings            VARCHAR2(30 char),
    second_prompt_req_diff_emp        NUMBER(1, 0)		     DEFAULT 0,
    second_prompt_group_membership    VARCHAR2(4000 char),
    create_date                       DATE,
    create_user_id                    VARCHAR2(30 char),
    update_date                       DATE,
    update_user_id                    VARCHAR2(30 char),
    CONSTRAINT pk_cfg_sec_privilege_change PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_id,config_version)
)
;


GRANT SELECT ON cfg_sec_privilege_change TO POSUSERS
;
GRANT INSERT ON cfg_sec_privilege_change TO POSUSERS
;
GRANT UPDATE ON cfg_sec_privilege_change TO POSUSERS
;
GRANT DELETE ON cfg_sec_privilege_change TO POSUSERS
;
GRANT SELECT ON cfg_sec_privilege_change TO DBAUSERS
;
GRANT INSERT ON cfg_sec_privilege_change TO DBAUSERS
;
GRANT UPDATE ON cfg_sec_privilege_change TO DBAUSERS
;
GRANT DELETE ON cfg_sec_privilege_change TO DBAUSERS
;

-- 
-- TABLE: cfg_sequence 
--

CREATE TABLE cfg_sequence(
    organization_id    NUMBER(10, 0)		 NOT NULL,
    rtl_loc_id         NUMBER(10, 0)		 NOT NULL,
    wkstn_id           NUMBER(19, 0)		 NOT NULL,
    sequence_id        VARCHAR2(255 char)    NOT NULL,
    sequence_nbr       NUMBER(19, 0)		 NOT NULL,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_cfg_sequence PRIMARY KEY (organization_id, rtl_loc_id, wkstn_id, sequence_id)
)
;


GRANT SELECT ON cfg_sequence TO POSUSERS
;
GRANT INSERT ON cfg_sequence TO POSUSERS
;
GRANT UPDATE ON cfg_sequence TO POSUSERS
;
GRANT DELETE ON cfg_sequence TO POSUSERS
;
GRANT SELECT ON cfg_sequence TO DBAUSERS
;
GRANT INSERT ON cfg_sequence TO DBAUSERS
;
GRANT UPDATE ON cfg_sequence TO DBAUSERS
;
GRANT DELETE ON cfg_sequence TO DBAUSERS
;

-- 
-- TABLE: cfg_sequence_part 
--

CREATE TABLE cfg_sequence_part(
    organization_id     NUMBER(10, 0)		  NOT NULL,
    sequence_id         VARCHAR2(255 char)    NOT NULL,
    prefix              VARCHAR2(30 char),
    suffix              VARCHAR2(30 char),
    encode_flag         NUMBER(1, 0),
    check_digit_algo    VARCHAR2(30 char),
    numeric_flag        NUMBER(1, 0),
    pad_length          NUMBER(10, 0),
    pad_character       VARCHAR2(2 char),
    initial_value       NUMBER(10, 0),
    max_value           NUMBER(10, 0),
    value_increment     NUMBER(10, 0),
    include_store_id    NUMBER(1, 0),
    store_pad_length    NUMBER(10, 0),
    include_wkstn_id    NUMBER(1, 0),
    wkstn_pad_length    NUMBER(10, 0),
    create_date         DATE,
    create_user_id      VARCHAR2(30 char),
    update_date         DATE,
    update_user_id      VARCHAR2(30 char),
    CONSTRAINT pk_cfg_sequence_part PRIMARY KEY (organization_id, sequence_id)
)
;


GRANT SELECT ON cfg_sequence_part TO POSUSERS
;
GRANT INSERT ON cfg_sequence_part TO POSUSERS
;
GRANT UPDATE ON cfg_sequence_part TO POSUSERS
;
GRANT DELETE ON cfg_sequence_part TO POSUSERS
;
GRANT SELECT ON cfg_sequence_part TO DBAUSERS
;
GRANT INSERT ON cfg_sequence_part TO DBAUSERS
;
GRANT UPDATE ON cfg_sequence_part TO DBAUSERS
;
GRANT DELETE ON cfg_sequence_part TO DBAUSERS
;

-- 
-- TABLE: cfg_system_setting 
--

CREATE TABLE cfg_system_setting(
    config_id          VARCHAR2(60 char)     NOT NULL,
    config_value       VARCHAR2(200 char),
    modified_event     VARCHAR2(200 char),
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_cfg_system_setting PRIMARY KEY (config_id)
)
;


GRANT SELECT ON cfg_system_setting TO POSUSERS
;
GRANT INSERT ON cfg_system_setting TO POSUSERS
;
GRANT UPDATE ON cfg_system_setting TO POSUSERS
;
GRANT DELETE ON cfg_system_setting TO POSUSERS
;
GRANT SELECT ON cfg_system_setting TO DBAUSERS
;
GRANT INSERT ON cfg_system_setting TO DBAUSERS
;
GRANT UPDATE ON cfg_system_setting TO DBAUSERS
;
GRANT DELETE ON cfg_system_setting TO DBAUSERS
;

-- 
-- TABLE: cfg_tender_availability_change 
--

CREATE TABLE cfg_tender_availability_change(
    organization_id       NUMBER(10, 0)			NOT NULL,
    profile_group_id      VARCHAR2(60 char)		NOT NULL,
    profile_element_id    VARCHAR2(60 char)     NOT NULL,
    change_id             VARCHAR2(254 char)    NOT NULL,
    tndr_id               VARCHAR2(60 char)     NOT NULL,
    availability_code     VARCHAR2(30 char)     NOT NULL,
	config_version		  NUMBER(19, 0)			DEFAULT 0 NOT NULL,
    enabled_flag          NUMBER(1, 0)			DEFAULT 0,
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_cfg_tender_avail_change PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_id, availability_code,config_version)
)
;


GRANT SELECT ON cfg_tender_availability_change TO POSUSERS
;
GRANT INSERT ON cfg_tender_availability_change TO POSUSERS
;
GRANT UPDATE ON cfg_tender_availability_change TO POSUSERS
;
GRANT DELETE ON cfg_tender_availability_change TO POSUSERS
;
GRANT SELECT ON cfg_tender_availability_change TO DBAUSERS
;
GRANT INSERT ON cfg_tender_availability_change TO DBAUSERS
;
GRANT UPDATE ON cfg_tender_availability_change TO DBAUSERS
;
GRANT DELETE ON cfg_tender_availability_change TO DBAUSERS
;

-- 
-- TABLE: cfg_tender_change 
--

CREATE TABLE cfg_tender_change(
    organization_id                 NUMBER(10, 0)		  NOT NULL,
    profile_group_id                VARCHAR2(60 char)     NOT NULL,
    profile_element_id              VARCHAR2(60 char)     NOT NULL,
    change_id                       VARCHAR2(254 char)    NOT NULL,
	config_version					NUMBER(19, 0)		  DEFAULT 0 NOT NULL,
    tndr_id                         VARCHAR2(60 char)     NOT NULL,
    tndr_typcode                    VARCHAR2(30 char),
    currency_id                     VARCHAR2(3 char),
    description                     VARCHAR2(254 char),
    display_order                   NUMBER(10, 0),
    flash_sales_display_order		NUMBER(10, 0),
    disabled_flag                   NUMBER(1, 0)		  DEFAULT 0,
    create_date                     DATE,
    create_user_id                  VARCHAR2(30 char),
    update_date                     DATE,
    update_user_id                  VARCHAR2(30 char),
    CONSTRAINT pk_cfg_tender_change PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_id,config_version)
)
;


GRANT SELECT ON cfg_tender_change TO POSUSERS
;
GRANT INSERT ON cfg_tender_change TO POSUSERS
;
GRANT UPDATE ON cfg_tender_change TO POSUSERS
;
GRANT DELETE ON cfg_tender_change TO POSUSERS
;
GRANT SELECT ON cfg_tender_change TO DBAUSERS
;
GRANT INSERT ON cfg_tender_change TO DBAUSERS
;
GRANT UPDATE ON cfg_tender_change TO DBAUSERS
;
GRANT DELETE ON cfg_tender_change TO DBAUSERS
;

-- 
-- TABLE: cfg_tender_denomination_change 
--

CREATE TABLE cfg_tender_denomination_change(
    organization_id       NUMBER(10, 0)		    NOT NULL,
    profile_group_id      VARCHAR2(60 char)     NOT NULL,
    profile_element_id    VARCHAR2(60 char)     NOT NULL,
    change_id             VARCHAR2(254 char)    NOT NULL,
    tndr_id               VARCHAR2(60 char)     NOT NULL,
    denomination_id       VARCHAR2(60 char)     NOT NULL,
	config_version		  NUMBER(19, 0)			DEFAULT 0 NOT NULL,
    description           VARCHAR2(254 char),
    value                 NUMBER(17, 6),
    sort_order            NUMBER(10, 0),
    enabled_flag          NUMBER(1, 0)			DEFAULT 0,
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_cfg_tender_denom_change PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_id, denomination_id,config_version)
)
;


GRANT SELECT ON cfg_tender_denomination_change TO POSUSERS
;
GRANT INSERT ON cfg_tender_denomination_change TO POSUSERS
;
GRANT UPDATE ON cfg_tender_denomination_change TO POSUSERS
;
GRANT DELETE ON cfg_tender_denomination_change TO POSUSERS
;
GRANT SELECT ON cfg_tender_denomination_change TO DBAUSERS
;
GRANT INSERT ON cfg_tender_denomination_change TO DBAUSERS
;
GRANT UPDATE ON cfg_tender_denomination_change TO DBAUSERS
;
GRANT DELETE ON cfg_tender_denomination_change TO DBAUSERS
;

-- 
-- TABLE: cfg_tender_settings_change 
--

CREATE TABLE cfg_tender_settings_change(
    organization_id                 NUMBER(10, 0)		  NOT NULL,
    profile_group_id                VARCHAR2(60 char)     NOT NULL,
    profile_element_id              VARCHAR2(60 char)     NOT NULL,
    change_id                       VARCHAR2(254 char)    NOT NULL,
	config_version					NUMBER(19, 0)		  DEFAULT 0 NOT NULL,
    tndr_id                         VARCHAR2(60 char)     NOT NULL,
    group_id                        VARCHAR2(60 char)     NOT NULL,
    usage_code                      VARCHAR2(30 char)     NOT NULL,
    entry_mthd_code                 VARCHAR2(60 char)     NOT NULL,
    online_floor_approval_amt       NUMBER(17, 6),
    online_ceiling_approval_amt     NUMBER(17, 6),
    over_tndr_limit                 NUMBER(17, 6),
    offline_floor_approval_amt      NUMBER(17, 6),
    offline_ceiling_approval_amt    NUMBER(17, 6),
    min_accept_amt                  NUMBER(17, 6),
    max_accept_amt                  NUMBER(17, 6),
    max_refund_with_receipt         NUMBER(17, 6),
    max_refund_wo_receipt           NUMBER(17, 6),
    enabled_flag                    NUMBER(1, 0)		   DEFAULT 0,
    create_date                     DATE,
    create_user_id                  VARCHAR2(30 char),
    update_date                     DATE,
    update_user_id                  VARCHAR2(30 char),
    CONSTRAINT pk_cfg_tender_settings_change PRIMARY KEY (organization_id, profile_group_id, profile_element_id, change_id,config_version)
)
;


GRANT SELECT ON cfg_tender_settings_change TO POSUSERS
;
GRANT INSERT ON cfg_tender_settings_change TO POSUSERS
;
GRANT UPDATE ON cfg_tender_settings_change TO POSUSERS
;
GRANT DELETE ON cfg_tender_settings_change TO POSUSERS
;
GRANT SELECT ON cfg_tender_settings_change TO DBAUSERS
;
GRANT INSERT ON cfg_tender_settings_change TO DBAUSERS
;
GRANT UPDATE ON cfg_tender_settings_change TO DBAUSERS
;
GRANT DELETE ON cfg_tender_settings_change TO DBAUSERS
;

-- 
-- TABLE: cfg_tender_type_category 
--

CREATE TABLE cfg_tender_type_category(
    organization_id    NUMBER(10, 0)		 NOT NULL,
    tender_category    VARCHAR2(30 char)     NOT NULL,
    tender_type        VARCHAR2(30 char)     NOT NULL,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_cfg_tender_type_category PRIMARY KEY (organization_id, tender_category, tender_type)
)
;


GRANT SELECT ON cfg_tender_type_category TO POSUSERS
;
GRANT INSERT ON cfg_tender_type_category TO POSUSERS
;
GRANT UPDATE ON cfg_tender_type_category TO POSUSERS
;
GRANT DELETE ON cfg_tender_type_category TO POSUSERS
;
GRANT SELECT ON cfg_tender_type_category TO DBAUSERS
;
GRANT INSERT ON cfg_tender_type_category TO DBAUSERS
;
GRANT UPDATE ON cfg_tender_type_category TO DBAUSERS
;
GRANT DELETE ON cfg_tender_type_category TO DBAUSERS
;

-- 
-- TABLE: cfg_upload_record 
--

CREATE TABLE cfg_upload_record(
    organization_id    NUMBER(10, 0)		  NOT NULL,
    name               VARCHAR2(255 char)     NOT NULL,
    user_org_nodes     VARCHAR2(4000 char),
    file_desc          VARCHAR2(100 char),
    file_size          NUMBER(19, 0),
    create_date        DATE		              DEFAULT sysdate,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_cfg_upload_record PRIMARY KEY (organization_id, name)
)
;


GRANT SELECT ON cfg_upload_record TO POSUSERS
;
GRANT INSERT ON cfg_upload_record TO POSUSERS
;
GRANT UPDATE ON cfg_upload_record TO POSUSERS
;
GRANT DELETE ON cfg_upload_record TO POSUSERS
;
GRANT SELECT ON cfg_upload_record TO DBAUSERS
;
GRANT INSERT ON cfg_upload_record TO DBAUSERS
;
GRANT UPDATE ON cfg_upload_record TO DBAUSERS
;
GRANT DELETE ON cfg_upload_record TO DBAUSERS
;

-- 
-- TABLE: cfg_user 
--

CREATE TABLE cfg_user(
    user_name                VARCHAR2(30 char)     NOT NULL,
    first_name               VARCHAR2(60 char),
    last_name                VARCHAR2(60 char),
    role_id                  VARCHAR2(30 char),
    locale                   VARCHAR2(30 char),
    email_address            VARCHAR2(254 char),
    organization_id          NUMBER(10, 0),
    is_account_locked        NUMBER(1, 0)		   DEFAULT 0 NOT NULL,
    failed_login_attempts    NUMBER(10, 0)		   DEFAULT 0 NOT NULL,
	directory_type			 varchar2(30 char)	   DEFAULT 'INTERNAL' NOT NULL,
    create_date              DATE,
    create_user_id           VARCHAR2(30 char),
    update_date              DATE,
    update_user_id           VARCHAR2(30 char),
    CONSTRAINT pk_cfg_user PRIMARY KEY (user_name)
)
;


GRANT SELECT ON cfg_user TO POSUSERS
;
GRANT INSERT ON cfg_user TO POSUSERS
;
GRANT UPDATE ON cfg_user TO POSUSERS
;
GRANT DELETE ON cfg_user TO POSUSERS
;
GRANT SELECT ON cfg_user TO DBAUSERS
;
GRANT INSERT ON cfg_user TO DBAUSERS
;
GRANT UPDATE ON cfg_user TO DBAUSERS
;
GRANT DELETE ON cfg_user TO DBAUSERS
;

-- 
-- TABLE: cfg_user_node 
--

CREATE TABLE cfg_user_node(
    organization_id    NUMBER(10, 0),
    user_name          VARCHAR2(30 char)     NOT NULL,
    org_scope          VARCHAR2(100 char)    NOT NULL,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_cfg_user_node PRIMARY KEY (user_name, org_scope)
)
;


GRANT SELECT ON cfg_user_node TO POSUSERS
;
GRANT INSERT ON cfg_user_node TO POSUSERS
;
GRANT UPDATE ON cfg_user_node TO POSUSERS
;
GRANT DELETE ON cfg_user_node TO POSUSERS
;
GRANT SELECT ON cfg_user_node TO DBAUSERS
;
GRANT INSERT ON cfg_user_node TO DBAUSERS
;
GRANT UPDATE ON cfg_user_node TO DBAUSERS
;
GRANT DELETE ON cfg_user_node TO DBAUSERS
;

-- 
-- TABLE: cfg_user_password 
--

CREATE TABLE cfg_user_password(
    organization_id    NUMBER(10, 0)	     DEFAULT 1,
    user_name          VARCHAR2(30 char)     NOT NULL,
    password_id        NUMBER(19, 0)	     NOT NULL,
    password           VARCHAR2(255 char),
    effective_date     DATE,
	temporary_flag	   NUMBER(1, 0)			 DEFAULT 0,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_cfg_user_password PRIMARY KEY (password_id)
)
;


GRANT SELECT ON cfg_user_password TO POSUSERS
;
GRANT INSERT ON cfg_user_password TO POSUSERS
;
GRANT UPDATE ON cfg_user_password TO POSUSERS
;
GRANT DELETE ON cfg_user_password TO POSUSERS
;
GRANT SELECT ON cfg_user_password TO DBAUSERS
;
GRANT INSERT ON cfg_user_password TO DBAUSERS
;
GRANT UPDATE ON cfg_user_password TO DBAUSERS
;
GRANT DELETE ON cfg_user_password TO DBAUSERS
;

-- 
-- TABLE: dat_address_change 
--

CREATE TABLE dat_address_change(
    organization_id    NUMBER(10, 0)		 NOT NULL,
    target_node        VARCHAR2(100 char)    NOT NULL,
    target_date        VARCHAR2(8 char)      NOT NULL,
    sequence_number    NUMBER(10, 0)		 NOT NULL,
    record_id          VARCHAR2(254 char)    NOT NULL,
    address_id         VARCHAR2(60 char)     NOT NULL,
    org_code           VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value          VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    address1           VARCHAR2(254 char),
    address2           VARCHAR2(254 char),
    address3           VARCHAR2(254 char),
    address4           VARCHAR2(254 char),
    apartment          VARCHAR2(30 char),
    city               VARCHAR2(254 char),
    territory          VARCHAR2(254 char),
    postal_code        VARCHAR2(254 char),
    country            VARCHAR2(254 char),
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_dat_address_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_address_change TO POSUSERS
;
GRANT INSERT ON dat_address_change TO POSUSERS
;
GRANT UPDATE ON dat_address_change TO POSUSERS
;
GRANT DELETE ON dat_address_change TO POSUSERS
;
GRANT SELECT ON dat_address_change TO DBAUSERS
;
GRANT INSERT ON dat_address_change TO DBAUSERS
;
GRANT UPDATE ON dat_address_change TO DBAUSERS
;
GRANT DELETE ON dat_address_change TO DBAUSERS
;

-- 
-- TABLE: dat_attached_item_change 
--

CREATE TABLE dat_attached_item_change(
    organization_id              NUMBER(10, 0)		   NOT NULL,
    target_node                  VARCHAR2(100 char)    NOT NULL,
    target_date                  VARCHAR2(8 char)      NOT NULL,
    sequence_number              NUMBER(10, 0)		   NOT NULL,
    record_id                    VARCHAR2(254 char)    NOT NULL,
    sold_item_id                 VARCHAR2(60 char)     NOT NULL,
    attached_item_id             VARCHAR2(60 char)     NOT NULL,
    level_code                   VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    level_value                  VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    begin_datetime               DATE,
    end_datetime                 DATE,
    prompt_to_add_flag           NUMBER(1, 0)		   DEFAULT 0 NOT NULL,
    prompt_to_add_msg_key        VARCHAR2(254 char),
    quantity_to_add              NUMBER(11, 4),
    lineitm_assoc_typcode        VARCHAR2(30 char),
    prompt_for_return_flag       NUMBER(1, 0)		   DEFAULT 0 NOT NULL,
    prompt_for_return_msg_key    VARCHAR2(254 char),
    deployed_flag                NUMBER(1, 0)		   DEFAULT 0,
    create_date                  DATE,
    create_user_id               VARCHAR2(30 char),
    update_date                  DATE,
    update_user_id               VARCHAR2(30 char),
    CONSTRAINT pk_dat_attached_item_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_attached_item_change TO POSUSERS
;
GRANT INSERT ON dat_attached_item_change TO POSUSERS
;
GRANT UPDATE ON dat_attached_item_change TO POSUSERS
;
GRANT DELETE ON dat_attached_item_change TO POSUSERS
;
GRANT SELECT ON dat_attached_item_change TO DBAUSERS
;
GRANT INSERT ON dat_attached_item_change TO DBAUSERS
;
GRANT UPDATE ON dat_attached_item_change TO DBAUSERS
;
GRANT DELETE ON dat_attached_item_change TO DBAUSERS
;

-- 
-- TABLE: dat_datamanager_change 
--

CREATE TABLE dat_datamanager_change(
    organization_id       NUMBER(10, 0)		     NOT NULL,
    target_node           VARCHAR2(100 char)     NOT NULL,
    target_date           VARCHAR2(8 char)       NOT NULL,
    sequence_number       NUMBER(10, 0)		     NOT NULL,
    record_id             VARCHAR2(254 char)     NOT NULL,
    action_type           VARCHAR2(60 char),
    record_type           VARCHAR2(60 char)      NOT NULL,
    record_description    VARCHAR2(1000 char),
    deployed_flag         NUMBER(1, 0)		     DEFAULT 0,
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_dat_datamanager_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id, record_type)
)
;


GRANT SELECT ON dat_datamanager_change TO POSUSERS
;
GRANT INSERT ON dat_datamanager_change TO POSUSERS
;
GRANT UPDATE ON dat_datamanager_change TO POSUSERS
;
GRANT DELETE ON dat_datamanager_change TO POSUSERS
;
GRANT SELECT ON dat_datamanager_change TO DBAUSERS
;
GRANT INSERT ON dat_datamanager_change TO DBAUSERS
;
GRANT UPDATE ON dat_datamanager_change TO DBAUSERS
;
GRANT DELETE ON dat_datamanager_change TO DBAUSERS
;

-- 
-- TABLE: dat_emp_change 
--

CREATE TABLE dat_emp_change(
    organization_id            NUMBER(10, 0)		  NOT NULL,
    target_node                VARCHAR2(100 char)     NOT NULL,
    target_date                VARCHAR2(8 char)       NOT NULL,
    sequence_number            NUMBER(10, 0)		  NOT NULL,
    record_id                  VARCHAR2(254 char)     NOT NULL,
    deployed_flag              NUMBER(1, 0)			  DEFAULT 0,
    employee_id                VARCHAR2(60 char)      NOT NULL,
    party_id                   NUMBER(19, 0),
    login_id                   VARCHAR2(60 char),
    hire_date                  DATE,
    active_date                DATE,
    terminated_date            DATE,
    job_title                  VARCHAR2(254 char),
    base_pay                   NUMBER(17, 6),
    emergency_contact_name     VARCHAR2(254 char),
    emergency_contact_phone    VARCHAR2(32 char),
    last_review_date           DATE,
    next_review_date           DATE,
    additional_withholdings    NUMBER(17, 6),
    clock_in_not_req_flag      NUMBER(1, 0)			  DEFAULT 0,
    employee_pay_status        VARCHAR2(30 char),
    employee_statcode          VARCHAR2(30 char),
    group_membership           VARCHAR2(4000 char),
    primary_group              VARCHAR2(60 char),
    training_status_enum       VARCHAR2(30 char),
    locked_out_flag            NUMBER(1, 0)			  DEFAULT 0,
    overtime_eligible_flag     NUMBER(1, 0)			  DEFAULT 0,
    salutation                 VARCHAR2(30 char),
    first_name                 VARCHAR2(60 char),
    middle_name                VARCHAR2(60 char),
    last_name                  VARCHAR2(60 char),
    suffix                     VARCHAR2(30 char),
    gender                     VARCHAR2(30 char),
    preferred_locale           VARCHAR2(30 char),
    birth_date                 DATE,
    address1                   VARCHAR2(254 char),
    address2                   VARCHAR2(254 char),
    city                       VARCHAR2(254 char),
    state                      VARCHAR2(30 char),
    postal_code                VARCHAR2(30 char),
    country                    VARCHAR2(254 char),
    primary_phone              VARCHAR2(32 char),
    email_address              VARCHAR2(254 char),
    other_phone                VARCHAR2(32 char),
    create_date                DATE,
    create_user_id             VARCHAR2(30 char),
    update_date                DATE,
    update_user_id             VARCHAR2(30 char),
    CONSTRAINT pk_emp_change PRIMARY KEY (organization_id, target_node, target_date, record_id, sequence_number)
)
;


GRANT SELECT ON dat_emp_change TO POSUSERS
;
GRANT INSERT ON dat_emp_change TO POSUSERS
;
GRANT UPDATE ON dat_emp_change TO POSUSERS
;
GRANT DELETE ON dat_emp_change TO POSUSERS
;
GRANT SELECT ON dat_emp_change TO DBAUSERS
;
GRANT INSERT ON dat_emp_change TO DBAUSERS
;
GRANT UPDATE ON dat_emp_change TO DBAUSERS
;
GRANT DELETE ON dat_emp_change TO DBAUSERS
;

-- 
-- TABLE: dat_emp_cust_group_change 
--

CREATE TABLE dat_emp_cust_group_change(
    organization_id    NUMBER(10, 0)		 NOT NULL,
    target_node        VARCHAR2(100 char)    NOT NULL,
    target_date        VARCHAR2(8 char)      NOT NULL,
    sequence_number    NUMBER(10, 0)		 NOT NULL,
    record_id          VARCHAR2(254 char)    NOT NULL,
    group_id           VARCHAR2(60 char)     NOT NULL,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_dat_emp_cust_group_change PRIMARY KEY (organization_id, target_node, target_date, record_id, sequence_number, group_id)
)
;


GRANT SELECT ON dat_emp_cust_group_change TO POSUSERS
;
GRANT INSERT ON dat_emp_cust_group_change TO POSUSERS
;
GRANT UPDATE ON dat_emp_cust_group_change TO POSUSERS
;
GRANT DELETE ON dat_emp_cust_group_change TO POSUSERS
;
GRANT SELECT ON dat_emp_cust_group_change TO DBAUSERS
;
GRANT INSERT ON dat_emp_cust_group_change TO DBAUSERS
;
GRANT UPDATE ON dat_emp_cust_group_change TO DBAUSERS
;
GRANT DELETE ON dat_emp_cust_group_change TO DBAUSERS
;

-- 
-- TABLE: dat_emp_store_change 
--

CREATE TABLE dat_emp_store_change(
    organization_id         NUMBER(10, 0)		  NOT NULL,
    target_node             VARCHAR2(100 char)    NOT NULL,
    target_date             VARCHAR2(8 char)      NOT NULL,
    sequence_number         NUMBER(10, 0)		  NOT NULL,
    record_id               VARCHAR2(254 char)    NOT NULL,
    rtl_loc_id              NUMBER(10, 0)		  NOT NULL,
    employee_id             VARCHAR2(60 char)     NOT NULL,
    employee_store_seq      NUMBER(10, 0)		  NOT NULL,
    begin_date              DATE,
    end_date                DATE,
    temp_assignment_flag    NUMBER(1, 0)		  DEFAULT 0,
    create_date             DATE,
    create_user_id          VARCHAR2(30 char),
    update_date             DATE,
    update_user_id          VARCHAR2(30 char),
    CONSTRAINT pk_emp_store_change PRIMARY KEY (organization_id, target_node, target_date, record_id, sequence_number, employee_store_seq)
)
;


GRANT SELECT ON dat_emp_store_change TO POSUSERS
;
GRANT INSERT ON dat_emp_store_change TO POSUSERS
;
GRANT UPDATE ON dat_emp_store_change TO POSUSERS
;
GRANT DELETE ON dat_emp_store_change TO POSUSERS
;
GRANT SELECT ON dat_emp_store_change TO DBAUSERS
;
GRANT INSERT ON dat_emp_store_change TO DBAUSERS
;
GRANT UPDATE ON dat_emp_store_change TO DBAUSERS
;
GRANT DELETE ON dat_emp_store_change TO DBAUSERS
;

-- 
-- TABLE: dat_emp_task_change 
--

CREATE TABLE dat_emp_task_change(
    organization_id    NUMBER(10, 0)	      NOT NULL,
    target_node        VARCHAR2(100 char)     NOT NULL,
    target_date        VARCHAR2(8 char)       NOT NULL,
    sequence_number    NUMBER(10, 0)	      NOT NULL,
    record_id          VARCHAR2(254 char)     NOT NULL,
    rtl_loc_id         NUMBER(10, 0)	      NOT NULL,
    task_id            NUMBER(19, 0)	      NOT NULL,
    start_date         DATE,
    end_date           DATE,
    typcode            VARCHAR2(60 char),
    visibility         VARCHAR2(30 char),
    assignment_id      VARCHAR2(60 char),
    title              VARCHAR2(255 char),
    description        VARCHAR2(4000 char),
    priority           VARCHAR2(20 char),
    deployed_flag      NUMBER(1, 0)		      DEFAULT 0,
    status_code        VARCHAR2(30 char),
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_dat_emp_task_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_emp_task_change TO POSUSERS
;
GRANT INSERT ON dat_emp_task_change TO POSUSERS
;
GRANT UPDATE ON dat_emp_task_change TO POSUSERS
;
GRANT DELETE ON dat_emp_task_change TO POSUSERS
;
GRANT SELECT ON dat_emp_task_change TO DBAUSERS
;
GRANT INSERT ON dat_emp_task_change TO DBAUSERS
;
GRANT UPDATE ON dat_emp_task_change TO DBAUSERS
;
GRANT DELETE ON dat_emp_task_change TO DBAUSERS
;

-- 
-- TABLE: dat_exchange_rate_change 
--

CREATE TABLE dat_exchange_rate_change(
    organization_id    NUMBER(10, 0)		 NOT NULL,
    target_node        VARCHAR2(100 char)    NOT NULL,
    target_date        VARCHAR2(8 char)      NOT NULL,
    sequence_number    NUMBER(10, 0)		 NOT NULL,
    record_id          VARCHAR2(254 char)    NOT NULL,
    level_code         VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    level_value        VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    base_currency      VARCHAR2(3 char)      NOT NULL,
    target_currency    VARCHAR2(3 char)      NOT NULL,
    rate               NUMBER(17, 6),
    deployed_flag      NUMBER(1, 0)			 DEFAULT 0,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    record_state       VARCHAR2(30 char),
    CONSTRAINT pk_data_exchange_rate_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_exchange_rate_change TO POSUSERS
;
GRANT INSERT ON dat_exchange_rate_change TO POSUSERS
;
GRANT UPDATE ON dat_exchange_rate_change TO POSUSERS
;
GRANT DELETE ON dat_exchange_rate_change TO POSUSERS
;
GRANT SELECT ON dat_exchange_rate_change TO DBAUSERS
;
GRANT INSERT ON dat_exchange_rate_change TO DBAUSERS
;
GRANT UPDATE ON dat_exchange_rate_change TO DBAUSERS
;
GRANT DELETE ON dat_exchange_rate_change TO DBAUSERS
;

-- 
-- TABLE: dat_item_change 
--

CREATE TABLE dat_item_change(
    organization_id                 NUMBER(10, 0)		  NOT NULL,
    target_node                     VARCHAR2(100 char)    NOT NULL,
    target_date                     VARCHAR2(8 char)      NOT NULL,
    sequence_number                 NUMBER(10, 0)		  NOT NULL,
    record_id                       VARCHAR2(254 char)    NOT NULL,
    dtype                           VARCHAR2(100 char),
    item_id                         VARCHAR2(60 char)     NOT NULL,
    org_code                        VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value                       VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    name                            VARCHAR2(254 char),
    description                     VARCHAR2(254 char),
    merch_level_1                   VARCHAR2(60 char)     DEFAULT 'DEFAULT',
    merch_level_2	                VARCHAR2(60 char),
    merch_level_3                   VARCHAR2(60 char),
    merch_level_4                   VARCHAR2(60 char),
    item_url						varchar2(254 char),
    list_price	                    number(17, 6),
    measure_req_flag			    NUMBER(1, 0)		  DEFAULT 0,
    item_lvlcode                    VARCHAR2(30 char),
    parent_item_id                  VARCHAR2(60 char),
    not_inventoried_flag	        NUMBER(1, 0)	      DEFAULT 0,
    serialized_item_flag            NUMBER(1, 0)		  DEFAULT 0,
    item_typcode                    VARCHAR2(30 char),
    dtv_class_name                  VARCHAR2(254 char),
    dimension_system                VARCHAR2(60 char),
    disallow_matrix_display_flag    NUMBER(1, 0)		  DEFAULT 0,
    item_matrix_color               VARCHAR2(20 char),
    deployed_flag                   NUMBER(1, 0)		  DEFAULT 0,
    dimension1                      VARCHAR2(60 char),
    dimension2                      VARCHAR2(60 char),
    dimension3                      VARCHAR2(60 char),
    create_date                     DATE,
    create_user_id                  VARCHAR2(30 char),
    update_date                     DATE,
    update_user_id                  VARCHAR2(30 char),
    record_state                    VARCHAR2(30 char),
    CONSTRAINT pk_dat_item_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_item_change TO POSUSERS
;
GRANT INSERT ON dat_item_change TO POSUSERS
;
GRANT UPDATE ON dat_item_change TO POSUSERS
;
GRANT DELETE ON dat_item_change TO POSUSERS
;
GRANT SELECT ON dat_item_change TO DBAUSERS
;
GRANT INSERT ON dat_item_change TO DBAUSERS
;
GRANT UPDATE ON dat_item_change TO DBAUSERS
;
GRANT DELETE ON dat_item_change TO DBAUSERS
;

-- 
-- INDEX: idx_dat_item_change02 
--

CREATE INDEX idx_dat_item_change02 ON dat_item_change(item_id, item_typcode, merch_level_1, organization_id)
;
-- 
-- INDEX: xst_dat_item_change_mrchlvl3 
--

CREATE INDEX xst_dat_item_change_mrchlvl3 ON dat_item_change(organization_id, merch_level_3)
;
-- 
-- INDEX: xst_dat_item_change_mrchlvl1 
--

CREATE INDEX xst_dat_item_change_mrchlvl1 ON dat_item_change(organization_id, merch_level_1)
;
-- 
-- INDEX: xst_dat_item_change_desc 
--

CREATE INDEX xst_dat_item_change_desc ON dat_item_change(organization_id, description)
;
-- 
-- INDEX: xst_dat_item_change_id_parntid 
--

CREATE INDEX xst_dat_item_change_id_parntid ON dat_item_change(organization_id, parent_item_id, item_id)
;
-- 
-- INDEX: xst_dat_item_change_mrchlvl4 
--

CREATE INDEX xst_dat_item_change_mrchlvl4 ON dat_item_change(organization_id, merch_level_4)
;
-- 
-- INDEX: xst_dat_item_change_mrchlvl2 
--

CREATE INDEX xst_dat_item_change_mrchlvl2 ON dat_item_change(organization_id, merch_level_2)
;
-- 
-- INDEX: xst_dat_item_change_typcode 
--

CREATE INDEX xst_dat_item_change_typcode ON dat_item_change(organization_id, item_typcode)
;

-- 
-- TABLE: dat_item_options_change 
--

CREATE TABLE dat_item_options_change(
    organization_id              NUMBER(10, 0)       NOT NULL,
    target_node                  varchar2(100 char)  NOT NULL,
    target_date                  varchar2(8 char)    NOT NULL,
    sequence_number              number(10, 0)       NOT NULL,
    record_id                    varchar2(254 char)  NOT NULL,
    deployed_flag                NUMBER(1, 0)        DEFAULT 0,
    item_id                      varchar2(60 char)   NOT NULL,
    level_code                   varchar2(30 char)   DEFAULT '*' NOT NULL,
    level_value                  varchar2(60 char)   DEFAULT '*' NOT NULL,
    unit_cost                    number(17, 6),
    curr_sale_price              number(17, 6),
    unit_of_measure_code         varchar2(30 char),
    compare_at_price             number(17, 6),
    min_sale_unit_count          decimal(11, 4),
    max_sale_unit_count          decimal(11, 4),
    item_availability_code       varchar2(30 char),
    disallow_discounts_flag      NUMBER(1, 0)        DEFAULT 0,
    prompt_for_quantity_flag     NUMBER(1, 0)        DEFAULT 0,
    prompt_for_price_flag        NUMBER(1, 0)        DEFAULT 0,
    prompt_for_description_flag  NUMBER(1, 0)        DEFAULT 0,
    force_quantity_of_one_flag   NUMBER(1, 0)        DEFAULT 0,
    not_returnable_flag          NUMBER(1, 0)        DEFAULT 0,
    no_giveaways_flag            NUMBER(1, 0)        DEFAULT 0,
    attached_items_flag          NUMBER(1, 0)        DEFAULT 0,
    substitute_available_flag    NUMBER(1, 0)        DEFAULT 0,
    tax_group_id                 varchar2(60 char),
    messages_flag                NUMBER(1, 0)        DEFAULT 0,
    vendor                       varchar2(256 char),
    season_code                  varchar2(30 char),
    part_number                  varchar2(254 char),
    qty_scale                    number(10, 0),
    restocking_fee               number(17, 6),
    special_order_lead_days      number(10, 0),
    apply_restocking_fee_flag    NUMBER(1, 0)        DEFAULT 0,
    disallow_send_sale_flag      NUMBER(1, 0)        DEFAULT 0,
    disallow_price_change_flag   NUMBER(1, 0)        DEFAULT 0,
    disallow_layaway_flag        NUMBER(1, 0)        DEFAULT 0,
    disallow_special_order_flag  NUMBER(1, 0)        DEFAULT 0,
    disallow_work_order_flag     NUMBER(1, 0)        DEFAULT 0,
    disallow_remote_send_flag    NUMBER(1, 0)        DEFAULT 0,
    disallow_commission_flag     NUMBER(1, 0)        DEFAULT 0,
    warranty_flag                NUMBER(1, 0)        DEFAULT 0,
    generic_item_flag            NUMBER(1, 0)        DEFAULT 0,
    min_age_required             number(10, 0),
    initial_sale_qty             number(11, 4),
    disposition_code             varchar2(30 char),
    foodstamp_eligible_flag      NUMBER(1, 0)        DEFAULT 0,
    stock_status                 varchar2(60 char),
    prompt_for_customer          varchar2(30 char),
    shipping_weight              number(12, 3),
    disallow_order_flag          NUMBER(1, 0)        DEFAULT 0,
    disallow_deals_flag          NUMBER(1, 0)        DEFAULT 0,
    pack_size                    number(11, 4),
    default_source_type          varchar2(60 char),
    default_source_id            varchar2(60 char),
    disallow_rain_check          NUMBER(1, 0)        DEFAULT 0,
    selling_group_id             varchar2(60 char),
    fiscal_item_id               varchar2(254 char),
    fiscal_item_description      varchar2(254 char),
    exclude_from_net_sales_flag  NUMBER(1, 0)        DEFAULT 0,
    create_date                  date,
    create_user_id               varchar2(30 char),
    update_date                  date,
    update_user_id               varchar2(30 char),
    record_state                 varchar2(30 char),
    CONSTRAINT pk_dat_item_options_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT on dat_item_options_change TO POSUSERS
;
GRANT INSERT on dat_item_options_change TO POSUSERS
;
GRANT UPDATE on dat_item_options_change TO POSUSERS
;
GRANT DELETE on dat_item_options_change TO POSUSERS
;
GRANT SELECT on dat_item_options_change to DBAUSERS
;
GRANT INSERT on dat_item_options_change to DBAUSERS
;
GRANT UPDATE on dat_item_options_change to DBAUSERS
;
GRANT DELETE on dat_item_options_change to DBAUSERS
;
-- 
-- TABLE: dat_item_price_change 
--

CREATE TABLE dat_item_price_change(
    organization_id    NUMBER(10, 0)		 NOT NULL,
    target_node        VARCHAR2(100 char)    NOT NULL,
    target_date        VARCHAR2(8 char)      NOT NULL,
    sequence_number    NUMBER(10, 0)		 NOT NULL,
    record_id          VARCHAR2(254 char)    NOT NULL,
    item_id            VARCHAR2(60 char)     NOT NULL,
    level_code         VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    level_value        VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    property_code      VARCHAR2(60 char)     NOT NULL,
    effective_date     DATE					 NOT NULL,
    expiration_date    DATE,
    price              NUMBER(17, 6)		 NOT NULL,
    price_qty          NUMBER(11, 4)		 DEFAULT 1 NOT NULL,
    deployed_flag      NUMBER(1, 0)			 DEFAULT 0,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_dat_item_price_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_item_price_change TO POSUSERS
;
GRANT INSERT ON dat_item_price_change TO POSUSERS
;
GRANT UPDATE ON dat_item_price_change TO POSUSERS
;
GRANT DELETE ON dat_item_price_change TO POSUSERS
;
GRANT SELECT ON dat_item_price_change TO DBAUSERS
;
GRANT INSERT ON dat_item_price_change TO DBAUSERS
;
GRANT UPDATE ON dat_item_price_change TO DBAUSERS
;
GRANT DELETE ON dat_item_price_change TO DBAUSERS
;

-- 
-- TABLE: dat_item_upc_change 
--

CREATE TABLE dat_item_upc_change(
    organization_id     NUMBER(10, 0)		  NOT NULL,
    target_node         VARCHAR2(100 char)    NOT NULL,
    target_date         VARCHAR2(8 char)      NOT NULL,
    sequence_number     NUMBER(10, 0)		  NOT NULL,
    record_id           VARCHAR2(254 char)    NOT NULL,
    manufacturer_upc    VARCHAR2(60 char)     NOT NULL,
    org_code            VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value           VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    item_id             VARCHAR2(60 char),
    manufacturer        VARCHAR2(254 char),
    primary_flag        NUMBER(1, 0)		  DEFAULT 0 NOT NULL,
    create_date         DATE,
    create_user_id      VARCHAR2(30 char),
    update_date         DATE,
    update_user_id      VARCHAR2(30 char),
    record_state        VARCHAR2(30 char),
    CONSTRAINT pk_dat_item_upc_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id, manufacturer_upc)
)
;


GRANT SELECT ON dat_item_upc_change TO POSUSERS
;
GRANT INSERT ON dat_item_upc_change TO POSUSERS
;
GRANT UPDATE ON dat_item_upc_change TO POSUSERS
;
GRANT DELETE ON dat_item_upc_change TO POSUSERS
;
GRANT SELECT ON dat_item_upc_change TO DBAUSERS
;
GRANT INSERT ON dat_item_upc_change TO DBAUSERS
;
GRANT UPDATE ON dat_item_upc_change TO DBAUSERS
;
GRANT DELETE ON dat_item_upc_change TO DBAUSERS
;

-- 
-- INDEX: xst_dat_item_upc_change_itemid 
--

CREATE INDEX xst_dat_item_upc_change_itemid ON dat_item_upc_change(organization_id, item_id)
;
-- 
-- INDEX: xst_dat_item_upc_change_upc 
--

CREATE INDEX xst_dat_item_upc_change_upc ON dat_item_upc_change(manufacturer_upc, item_id, organization_id)
;
-- 
-- TABLE: dat_matrix_sort_order_change 
--

CREATE TABLE dat_matrix_sort_order_change(
    organization_id     NUMBER(10, 0)		  NOT NULL,
    target_node         VARCHAR2(100 char)    NOT NULL,
    target_date         VARCHAR2(8 char)      NOT NULL,
    sequence_number     NUMBER(10, 0)		  NOT NULL,
    record_id           VARCHAR2(254 char)    NOT NULL,
    matrix_sort_type    VARCHAR2(60 char)     NOT NULL,
    matrix_sort_id      VARCHAR2(60 char)     NOT NULL,
    org_code            VARCHAR2(30 char)     NOT NULL,
    org_value           VARCHAR2(60 char)     NOT NULL,
    sort_order          NUMBER(10, 0),
    deployed_flag       NUMBER(1, 0)		  DEFAULT 0,
    create_date         DATE,
    create_user_id      VARCHAR2(30 char),
    update_date         DATE,
    update_user_id      VARCHAR2(30 char),
    CONSTRAINT pk_dat_matrx_sort_order_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_matrix_sort_order_change TO POSUSERS
;
GRANT INSERT ON dat_matrix_sort_order_change TO POSUSERS
;
GRANT UPDATE ON dat_matrix_sort_order_change TO POSUSERS
;
GRANT DELETE ON dat_matrix_sort_order_change TO POSUSERS
;
GRANT SELECT ON dat_matrix_sort_order_change TO DBAUSERS
;
GRANT INSERT ON dat_matrix_sort_order_change TO DBAUSERS
;
GRANT UPDATE ON dat_matrix_sort_order_change TO DBAUSERS
;
GRANT DELETE ON dat_matrix_sort_order_change TO DBAUSERS
;

-- 
-- TABLE: dat_merch_hierarchy_change 
--

CREATE TABLE dat_merch_hierarchy_change(
    organization_id                 NUMBER(10, 0)		  NOT NULL,
    target_node                     VARCHAR2(100 char)    NOT NULL,
    target_date                     VARCHAR2(8 char)      NOT NULL,
    sequence_number                 NUMBER(10, 0)		  NOT NULL,
    record_id                       VARCHAR2(254 char)    NOT NULL,
    hierarchy_id                    VARCHAR2(60 char)     NOT NULL,
    org_code                        VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value                       VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    parent_id                       VARCHAR2(60 char),
    level_code                      VARCHAR2(30 char),
    description                     VARCHAR2(254 char),
    sort_order                      NUMBER(10, 0),
    hidden_flag                     NUMBER(1, 0)		  DEFAULT 0,
    disallow_matrix_display_flag    NUMBER(1, 0)		  DEFAULT 0,
    item_matrix_color               VARCHAR2(20 char),
    deployed_flag                   NUMBER(1, 0)		  DEFAULT 0,
    create_date                     DATE,
    create_user_id                  VARCHAR2(30 char),
    update_date                     DATE,
    update_user_id                  VARCHAR2(30 char),
    CONSTRAINT pk_dat_merch_hierarchy_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_merch_hierarchy_change TO POSUSERS
;
GRANT INSERT ON dat_merch_hierarchy_change TO POSUSERS
;
GRANT UPDATE ON dat_merch_hierarchy_change TO POSUSERS
;
GRANT DELETE ON dat_merch_hierarchy_change TO POSUSERS
;
GRANT SELECT ON dat_merch_hierarchy_change TO DBAUSERS
;
GRANT INSERT ON dat_merch_hierarchy_change TO DBAUSERS
;
GRANT UPDATE ON dat_merch_hierarchy_change TO DBAUSERS
;
GRANT DELETE ON dat_merch_hierarchy_change TO DBAUSERS
;

-- 
-- TABLE: dat_non_phys_item_change 
--

CREATE TABLE dat_non_phys_item_change(
    organization_id                NUMBER(10, 0)		 NOT NULL,
    target_node                    VARCHAR2(100 char)    NOT NULL,
    target_date                    VARCHAR2(8 char)      NOT NULL,
    sequence_number                NUMBER(10, 0)		 NOT NULL,
    record_id                      VARCHAR2(254 char)    NOT NULL,
    dtype                          VARCHAR2(100 char),
    item_id                        VARCHAR2(60 char)     NOT NULL,
    org_code                       VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value                      VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    display_order                  NUMBER(10, 0),
    non_phys_item_typcode          VARCHAR2(30 char),
    non_phys_item_subtype          VARCHAR2(30 char),
    exclude_from_net_sales_flag    NUMBER(1, 0)			 DEFAULT 0,
    create_date                    DATE,
    create_user_id                 VARCHAR2(30 char),
    update_date                    DATE,
    update_user_id                 VARCHAR2(30 char),
    CONSTRAINT pk_dat_non_phys_item_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_non_phys_item_change TO POSUSERS
;
GRANT INSERT ON dat_non_phys_item_change TO POSUSERS
;
GRANT UPDATE ON dat_non_phys_item_change TO POSUSERS
;
GRANT DELETE ON dat_non_phys_item_change TO POSUSERS
;
GRANT SELECT ON dat_non_phys_item_change TO DBAUSERS
;
GRANT INSERT ON dat_non_phys_item_change TO DBAUSERS
;
GRANT UPDATE ON dat_non_phys_item_change TO DBAUSERS
;
GRANT DELETE ON dat_non_phys_item_change TO DBAUSERS
;

-- 
-- TABLE: dat_retail_location_change 
--

CREATE TABLE dat_retail_location_change(
    organization_id            NUMBER(10, 0)		 NOT NULL,
    target_node                VARCHAR2(100 char)    NOT NULL,
    target_date                VARCHAR2(8 char)      NOT NULL,
    sequence_number            NUMBER(10, 0)		 NOT NULL,
    record_id                  VARCHAR2(254 char)    NOT NULL,
    rtl_loc_id                 NUMBER(10, 0)		 NOT NULL,
    store_name                 VARCHAR2(254 char),
    address1                   VARCHAR2(254 char),
    address2                   VARCHAR2(254 char),
    address3                   VARCHAR2(254 char),
    address4                   VARCHAR2(254 char),
    city                       VARCHAR2(254 char),
    state                      VARCHAR2(30 char),
    district                   VARCHAR2(30 char),
    area                       VARCHAR2(30 char),
    postal_code                VARCHAR2(30 char),
    country                    VARCHAR2(254 char),
    locale                     VARCHAR2(30 char),
    currency_id                VARCHAR2(3 char),
    latitude                   NUMBER(17, 6),
    longitude                  NUMBER(17, 6),
    telephone1                 VARCHAR2(32 char),
    telephone2                 VARCHAR2(32 char),
    telephone3                 VARCHAR2(32 char),
    telephone4                 VARCHAR2(32 char),
    description                VARCHAR2(254 char),
    store_nbr                  VARCHAR2(254 char),
    apartment                  VARCHAR2(30 char),
    store_manager              VARCHAR2(254 char),
    email_addr                 VARCHAR2(254 char),
    default_tax_percentage     NUMBER(8, 6),
    location_type              VARCHAR2(60 char),
    delivery_available_flag    NUMBER(1, 0)		     DEFAULT 0 NOT NULL,
    pickup_available_flag      NUMBER(1, 0)		     DEFAULT 0 NOT NULL,
    transfer_available_flag    NUMBER(1, 0)			 DEFAULT 0 NOT NULL,
    geo_code                   VARCHAR2(20 char),
    uez_flag                   NUMBER(1, 0)		     DEFAULT 0 NOT NULL,
    alternate_store_nbr        VARCHAR2(254 char),
    tax_loc_id                 VARCHAR2(60 char),
    deployed_flag              NUMBER(1, 0)		     DEFAULT 0,
	zone_id					   varchar2(30 char),
	use_till_accountability_flag NUMBER(1, 0)		 DEFAULT 0 NOT NULL,
	deposit_bank_name		   varchar2(254 char),
	deposit_bank_account_number varchar2(30 char),
    create_date                DATE,
    create_user_id             VARCHAR2(30 char),
    update_date                DATE,
    update_user_id             VARCHAR2(30 char),
    CONSTRAINT pk_dat_retail_location_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_retail_location_change TO POSUSERS
;
GRANT INSERT ON dat_retail_location_change TO POSUSERS
;
GRANT UPDATE ON dat_retail_location_change TO POSUSERS
;
GRANT DELETE ON dat_retail_location_change TO POSUSERS
;
GRANT SELECT ON dat_retail_location_change TO DBAUSERS
;
GRANT INSERT ON dat_retail_location_change TO DBAUSERS
;
GRANT UPDATE ON dat_retail_location_change TO DBAUSERS
;
GRANT DELETE ON dat_retail_location_change TO DBAUSERS
;

-- 
-- TABLE: dat_store_message_change 
--

CREATE TABLE dat_store_message_change(
    organization_id        NUMBER(10, 0)		  NOT NULL,
    target_node            VARCHAR2(100 char)     NOT NULL,
    target_date            VARCHAR2(8 char)       NOT NULL,
    sequence_number        NUMBER(10, 0)		  NOT NULL,
    record_id              VARCHAR2(254 char)     NOT NULL,
    deployed_flag          NUMBER(1, 0)			  DEFAULT 0,
    message_id             NUMBER(19, 0),
    org_code               VARCHAR2(30 char)      DEFAULT '*',
    org_value              VARCHAR2(60 char)      DEFAULT '*',
    start_date             DATE,
    end_date               DATE,
    priority               VARCHAR2(20 char),
    content                VARCHAR2(4000 char),
    store_created_flag     NUMBER(1, 0)			  DEFAULT 0,
    wkstn_specific_flag    NUMBER(1, 0)			  DEFAULT 0,
    wkstn_id               NUMBER(19, 0),
    void_flag              NUMBER(1, 0)			  DEFAULT 0,
    message_url            VARCHAR2(254 char),
    create_date            DATE,
    create_user_id         VARCHAR2(30 char),
    update_date            DATE,
    update_user_id         VARCHAR2(30 char),
    CONSTRAINT pk_dat_store_message_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_store_message_change TO POSUSERS
;
GRANT INSERT ON dat_store_message_change TO POSUSERS
;
GRANT UPDATE ON dat_store_message_change TO POSUSERS
;
GRANT DELETE ON dat_store_message_change TO POSUSERS
;
GRANT SELECT ON dat_store_message_change TO DBAUSERS
;
GRANT INSERT ON dat_store_message_change TO DBAUSERS
;
GRANT UPDATE ON dat_store_message_change TO DBAUSERS
;
GRANT DELETE ON dat_store_message_change TO DBAUSERS
;

-- 
-- TABLE: dat_tax_authority_change 
--

CREATE TABLE dat_tax_authority_change(
    organization_id             NUMBER(10, 0)		  NOT NULL,
    target_node                 VARCHAR2(100 char)    NOT NULL,
    target_date                 VARCHAR2(8 char)      NOT NULL,
    sequence_number             NUMBER(10, 0)		  NOT NULL,
    record_id                   VARCHAR2(254 char)    NOT NULL,
    tax_authority_id            VARCHAR2(60 char)     NOT NULL,
    name                        VARCHAR2(254 char),
    rounding_code               VARCHAR2(30 char),
    rounding_digits_quantity    NUMBER(10, 0),
    deployed_flag               NUMBER(1, 0)		  DEFAULT 0,
    org_code                    VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value                   VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    create_date                 DATE,
    create_user_id              VARCHAR2(30 char),
    update_date                 DATE,
    update_user_id              VARCHAR2(30 char),
    CONSTRAINT pk_dat_tax_authority_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_tax_authority_change TO POSUSERS
;
GRANT INSERT ON dat_tax_authority_change TO POSUSERS
;
GRANT UPDATE ON dat_tax_authority_change TO POSUSERS
;
GRANT DELETE ON dat_tax_authority_change TO POSUSERS
;
GRANT SELECT ON dat_tax_authority_change TO DBAUSERS
;
GRANT INSERT ON dat_tax_authority_change TO DBAUSERS
;
GRANT UPDATE ON dat_tax_authority_change TO DBAUSERS
;
GRANT DELETE ON dat_tax_authority_change TO DBAUSERS
;

-- 
-- TABLE: dat_tax_bracket_change 
--

CREATE TABLE dat_tax_bracket_change(
    organization_id    NUMBER(10, 0)		 NOT NULL,
    target_node        VARCHAR2(100 char)    NOT NULL,
    target_date        VARCHAR2(8 char)      NOT NULL,
    sequence_number    NUMBER(10, 0)		 NOT NULL,
    record_id          VARCHAR2(254 char)    NOT NULL,
    tax_bracket_id     VARCHAR2(60 char)     NOT NULL,
    org_code           VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value          VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    deployed_flag      NUMBER(1, 0)			 DEFAULT 0,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_dat_tax_bracket_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_tax_bracket_change TO POSUSERS
;
GRANT INSERT ON dat_tax_bracket_change TO POSUSERS
;
GRANT UPDATE ON dat_tax_bracket_change TO POSUSERS
;
GRANT DELETE ON dat_tax_bracket_change TO POSUSERS
;
GRANT SELECT ON dat_tax_bracket_change TO DBAUSERS
;
GRANT INSERT ON dat_tax_bracket_change TO DBAUSERS
;
GRANT UPDATE ON dat_tax_bracket_change TO DBAUSERS
;
GRANT DELETE ON dat_tax_bracket_change TO DBAUSERS
;

-- 
-- TABLE: dat_tax_bracket_dtl_change 
--

CREATE TABLE dat_tax_bracket_dtl_change(
    organization_id        NUMBER(10, 0)		 NOT NULL,
    target_node            VARCHAR2(100 char)    NOT NULL,
    target_date            VARCHAR2(8 char)      NOT NULL,
    sequence_number        NUMBER(10, 0)		 NOT NULL,
    record_id              VARCHAR2(254 char)    NOT NULL,
    tax_bracket_id         VARCHAR2(60 char)     NOT NULL,
    org_code               VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value              VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    tax_bracket_seq_nbr    NUMBER(10, 0)		 NOT NULL,
    tax_breakpoint         NUMBER(17, 6),
    tax_amount             NUMBER(17, 6),
    deleted_flag           NUMBER(1, 0)			 DEFAULT 0,
    create_date            DATE,
    create_user_id         VARCHAR2(30 char),
    update_date            DATE,
    update_user_id         VARCHAR2(30 char),
    CONSTRAINT pk_dat_tax_bracket_dtl_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id, tax_bracket_seq_nbr)
)
;


GRANT SELECT ON dat_tax_bracket_dtl_change TO POSUSERS
;
GRANT INSERT ON dat_tax_bracket_dtl_change TO POSUSERS
;
GRANT UPDATE ON dat_tax_bracket_dtl_change TO POSUSERS
;
GRANT DELETE ON dat_tax_bracket_dtl_change TO POSUSERS
;
GRANT SELECT ON dat_tax_bracket_dtl_change TO DBAUSERS
;
GRANT INSERT ON dat_tax_bracket_dtl_change TO DBAUSERS
;
GRANT UPDATE ON dat_tax_bracket_dtl_change TO DBAUSERS
;
GRANT DELETE ON dat_tax_bracket_dtl_change TO DBAUSERS
;

-- 
-- TABLE: dat_tax_group_change 
--

CREATE TABLE dat_tax_group_change(
    organization_id    NUMBER(10, 0)		 NOT NULL,
    target_node        VARCHAR2(100 char)    NOT NULL,
    target_date        VARCHAR2(8 char)      NOT NULL,
    sequence_number    NUMBER(10, 0)		 NOT NULL,
    record_id          VARCHAR2(254 char)    NOT NULL,
    tax_group_id       VARCHAR2(60 char)     NOT NULL,
    name               VARCHAR2(254 char),
    description        VARCHAR2(254 char),
    deployed_flag      NUMBER(1, 0)		     DEFAULT 0,
    org_code           VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value          VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_dat_tax_group_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_tax_group_change TO POSUSERS
;
GRANT INSERT ON dat_tax_group_change TO POSUSERS
;
GRANT UPDATE ON dat_tax_group_change TO POSUSERS
;
GRANT DELETE ON dat_tax_group_change TO POSUSERS
;
GRANT SELECT ON dat_tax_group_change TO DBAUSERS
;
GRANT INSERT ON dat_tax_group_change TO DBAUSERS
;
GRANT UPDATE ON dat_tax_group_change TO DBAUSERS
;
GRANT DELETE ON dat_tax_group_change TO DBAUSERS
;

-- 
-- TABLE: dat_tax_group_rule_change 
--

CREATE TABLE dat_tax_group_rule_change(
    organization_id              NUMBER(10, 0)		   NOT NULL,
    target_node                  VARCHAR2(100 char)    NOT NULL,
    target_date                  VARCHAR2(8 char)      NOT NULL,
    sequence_number              NUMBER(10, 0)		   NOT NULL,
    record_id                    VARCHAR2(254 char)    NOT NULL,
    tax_group_id                 VARCHAR2(60 char)     NOT NULL,
    tax_loc_id                   VARCHAR2(60 char)     NOT NULL,
    tax_rule_seq_nbr             NUMBER(10, 0)		   NOT NULL,
    tax_authority_id             VARCHAR2(60 char),
    name                         VARCHAR2(254 char),
    description                  VARCHAR2(254 char),
    compound_seq_nbr             NUMBER(10, 0),
    compound_flag                NUMBER(1, 0)		   DEFAULT 0,
    taxed_at_trans_level_flag    NUMBER(1, 0)		   DEFAULT 0,
    tax_typcode                  VARCHAR2(30 char),
    deployed_flag                NUMBER(1, 0)		   DEFAULT 0,
    org_code                     VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value                    VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    create_date                  DATE,
    create_user_id               VARCHAR2(30 char),
    update_date                  DATE,
    update_user_id               VARCHAR2(30 char),
    CONSTRAINT pk_dat_tax_group_rule_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_tax_group_rule_change TO POSUSERS
;
GRANT INSERT ON dat_tax_group_rule_change TO POSUSERS
;
GRANT UPDATE ON dat_tax_group_rule_change TO POSUSERS
;
GRANT DELETE ON dat_tax_group_rule_change TO POSUSERS
;
GRANT SELECT ON dat_tax_group_rule_change TO DBAUSERS
;
GRANT INSERT ON dat_tax_group_rule_change TO DBAUSERS
;
GRANT UPDATE ON dat_tax_group_rule_change TO DBAUSERS
;
GRANT DELETE ON dat_tax_group_rule_change TO DBAUSERS
;

-- 
-- TABLE: dat_tax_location_change 
--

CREATE TABLE dat_tax_location_change(
    organization_id    NUMBER(10, 0)		 NOT NULL,
    target_node        VARCHAR2(100 char)    NOT NULL,
    target_date        VARCHAR2(8 char)      NOT NULL,
    sequence_number    NUMBER(10, 0)		 NOT NULL,
    record_id          VARCHAR2(254 char)    NOT NULL,
    tax_loc_id         VARCHAR2(60 char)     NOT NULL,
    name               VARCHAR2(254 char),
    description        VARCHAR2(254 char),
    deployed_flag      NUMBER(1, 0)			 DEFAULT 0,
    org_code           VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value          VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_dat_tax_location_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_tax_location_change TO POSUSERS
;
GRANT INSERT ON dat_tax_location_change TO POSUSERS
;
GRANT UPDATE ON dat_tax_location_change TO POSUSERS
;
GRANT DELETE ON dat_tax_location_change TO POSUSERS
;
GRANT SELECT ON dat_tax_location_change TO DBAUSERS
;
GRANT INSERT ON dat_tax_location_change TO DBAUSERS
;
GRANT UPDATE ON dat_tax_location_change TO DBAUSERS
;
GRANT DELETE ON dat_tax_location_change TO DBAUSERS
;

-- 
-- TABLE: dat_tax_rate_override_change 
--

CREATE TABLE dat_tax_rate_override_change(
    organization_id             NUMBER(10, 0)		  NOT NULL,
    target_node                 VARCHAR2(100 char)    NOT NULL,
    target_date                 VARCHAR2(8 char)      NOT NULL,
    sequence_number             NUMBER(10, 0)		  NOT NULL,
    record_id                   VARCHAR2(254 char)    NOT NULL,
    tax_group_id                VARCHAR2(60 char)     NOT NULL,
    tax_loc_id                  VARCHAR2(60 char)     NOT NULL,
    tax_rule_seq_nbr            NUMBER(10, 0)		  NOT NULL,
    tax_rate_rule_seq           NUMBER(10, 0)		  NOT NULL,
    tax_bracket_id              VARCHAR2(60 char),
    tax_rate_min_taxable_amt    NUMBER(17, 6),
    effective_datetime          DATE,
    expr_datetime               DATE,
    percentage                  NUMBER(8, 6),
    amt                         NUMBER(17, 6),
    daily_start_time            DATE,
    daily_end_time              DATE,
    tax_rate_max_taxable_amt    NUMBER(17, 6),
    breakpoint_typcode          VARCHAR2(30 char),
    deployed_flag               NUMBER(1, 0)		  DEFAULT 0,
    org_code                    VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value                   VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    create_date                 DATE,
    create_user_id              VARCHAR2(30 char),
    update_date                 DATE,
    update_user_id              VARCHAR2(30 char),
    CONSTRAINT pk_dat_tax_rate_override_chang PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_tax_rate_override_change TO POSUSERS
;
GRANT INSERT ON dat_tax_rate_override_change TO POSUSERS
;
GRANT UPDATE ON dat_tax_rate_override_change TO POSUSERS
;
GRANT DELETE ON dat_tax_rate_override_change TO POSUSERS
;
GRANT SELECT ON dat_tax_rate_override_change TO DBAUSERS
;
GRANT INSERT ON dat_tax_rate_override_change TO DBAUSERS
;
GRANT UPDATE ON dat_tax_rate_override_change TO DBAUSERS
;
GRANT DELETE ON dat_tax_rate_override_change TO DBAUSERS
;

-- 
-- TABLE: dat_tax_rate_rule_change 
--

CREATE TABLE dat_tax_rate_rule_change(
    organization_id             NUMBER(10, 0)		  NOT NULL,
    target_node                 VARCHAR2(100 char)    NOT NULL,
    target_date                 VARCHAR2(8 char)      NOT NULL,
    sequence_number             NUMBER(10, 0)		  NOT NULL,
    record_id                   VARCHAR2(254 char)    NOT NULL,
    tax_group_id                VARCHAR2(60 char)     NOT NULL,
    tax_loc_id                  VARCHAR2(60 char)     NOT NULL,
    tax_rule_seq_nbr            NUMBER(10, 0)		  NOT NULL,
    tax_rate_rule_seq           NUMBER(10, 0)		  NOT NULL,
    tax_bracket_id              VARCHAR2(60 char),
    tax_rate_min_taxable_amt    NUMBER(17, 6),
    effective_datetime          DATE,
    expr_datetime               DATE,
    percentage                  NUMBER(8, 6),
    amt                         NUMBER(17, 6),
    daily_start_time            DATE,
    daily_end_time              DATE,
    tax_rate_max_taxable_amt    NUMBER(17, 6),
    breakpoint_typcode          VARCHAR2(30 char),
    deployed_flag               NUMBER(1, 0)		  DEFAULT 0,
    org_code                    VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value                   VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    create_date                 DATE,
    create_user_id              VARCHAR2(30 char),
    update_date                 DATE,
    update_user_id              VARCHAR2(30 char),
    CONSTRAINT pk_dat_tax_rate_rule_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_tax_rate_rule_change TO POSUSERS
;
GRANT INSERT ON dat_tax_rate_rule_change TO POSUSERS
;
GRANT UPDATE ON dat_tax_rate_rule_change TO POSUSERS
;
GRANT DELETE ON dat_tax_rate_rule_change TO POSUSERS
;
GRANT SELECT ON dat_tax_rate_rule_change TO DBAUSERS
;
GRANT INSERT ON dat_tax_rate_rule_change TO DBAUSERS
;
GRANT UPDATE ON dat_tax_rate_rule_change TO DBAUSERS
;
GRANT DELETE ON dat_tax_rate_rule_change TO DBAUSERS
;

-- 
-- TABLE: dat_vendor_change 
--

CREATE TABLE dat_vendor_change(
    organization_id      NUMBER(10, 0)		   NOT NULL,
    target_node          VARCHAR2(100 char)    NOT NULL,
    target_date          VARCHAR2(8 char)      NOT NULL,
    sequence_number      NUMBER(10, 0)		   NOT NULL,
    record_id            VARCHAR2(254 char)    NOT NULL,
    vendor_id            VARCHAR2(60 char)     NOT NULL,
    org_code             VARCHAR2(30 char)     DEFAULT '*' NOT NULL,
    org_value            VARCHAR2(60 char)     DEFAULT '*' NOT NULL,
    name                 VARCHAR2(254 char),
    buyer                VARCHAR2(254 char),
    address_id           VARCHAR2(60 char),
    telephone            VARCHAR2(32 char),
    contact_telephone    VARCHAR2(32 char),
    typcode              VARCHAR2(30 char),
    contact              VARCHAR2(254 char),
    fax                  VARCHAR2(32 char),
    status               VARCHAR2(30 char),
    deployed_flag        NUMBER(1, 0)     DEFAULT 0,
    create_date          DATE,
    create_user_id       VARCHAR2(30 char),
    update_date          DATE,
    update_user_id       VARCHAR2(30 char),
    CONSTRAINT pk_dat_vendor_change PRIMARY KEY (organization_id, target_node, target_date, sequence_number, record_id)
)
;


GRANT SELECT ON dat_vendor_change TO POSUSERS
;
GRANT INSERT ON dat_vendor_change TO POSUSERS
;
GRANT UPDATE ON dat_vendor_change TO POSUSERS
;
GRANT DELETE ON dat_vendor_change TO POSUSERS
;
GRANT SELECT ON dat_vendor_change TO DBAUSERS
;
GRANT INSERT ON dat_vendor_change TO DBAUSERS
;
GRANT UPDATE ON dat_vendor_change TO DBAUSERS
;
GRANT DELETE ON dat_vendor_change TO DBAUSERS
;

-- 
-- TABLE: dpl_deployment 
--

CREATE TABLE dpl_deployment(
    organization_id            NUMBER(10, 0)     NOT NULL,
    deployment_id              NUMBER(19, 0)     NOT NULL,
    deployment_name            VARCHAR2(75 char),
    plan_id                    NUMBER(19, 0),
    xstore_version             VARCHAR2(40 char),
    plan_name                  VARCHAR2(60 char),
    deployment_type            VARCHAR2(30 char),
    org_scope                  VARCHAR2(100 char),
    staging_status             VARCHAR2(30 char),
    deploy_status              VARCHAR2(30 char),
    purge_status               VARCHAR2(30 char),
    download_time              VARCHAR2(30 char),
    apply_immediately          NUMBER(1, 0),
    deployment_manifest_xml    VARCHAR2(4000 char),
    cancel_timestamp           DATE,
    cancel_user_id             VARCHAR2(30 char),
    profile_group_id           VARCHAR2(60 char),
    profile_element_id         VARCHAR2(60 char),
	config_version			   NUMBER(19, 0),
    create_date                DATE,
    create_user_id             VARCHAR2(30 char),
    update_date                DATE,
    update_user_id             VARCHAR2(30 char),
    CONSTRAINT pk_dpl_deployment PRIMARY KEY (organization_id, deployment_id)
)
;


GRANT SELECT ON dpl_deployment TO POSUSERS
;
GRANT INSERT ON dpl_deployment TO POSUSERS
;
GRANT UPDATE ON dpl_deployment TO POSUSERS
;
GRANT DELETE ON dpl_deployment TO POSUSERS
;
GRANT SELECT ON dpl_deployment TO DBAUSERS
;
GRANT INSERT ON dpl_deployment TO DBAUSERS
;
GRANT UPDATE ON dpl_deployment TO DBAUSERS
;
GRANT DELETE ON dpl_deployment TO DBAUSERS
;

-- 
-- TABLE: dpl_deployment_email 
--

CREATE TABLE dpl_deployment_email(
    deployment_id      NUMBER(19, 0)		NOT NULL,
    organization_id    NUMBER(10, 0)		NOT NULL,
    user_name          VARCHAR2(30 char)    NOT NULL,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_dpl_deployment_email PRIMARY KEY (organization_id, deployment_id, user_name)
)
;


GRANT SELECT ON dpl_deployment_email TO POSUSERS
;
GRANT INSERT ON dpl_deployment_email TO POSUSERS
;
GRANT UPDATE ON dpl_deployment_email TO POSUSERS
;
GRANT DELETE ON dpl_deployment_email TO POSUSERS
;
GRANT SELECT ON dpl_deployment_email TO DBAUSERS
;
GRANT INSERT ON dpl_deployment_email TO DBAUSERS
;
GRANT UPDATE ON dpl_deployment_email TO DBAUSERS
;
GRANT DELETE ON dpl_deployment_email TO DBAUSERS
;

-- 
-- TABLE: dpl_deployment_file 
--

CREATE TABLE dpl_deployment_file(
    organization_id    NUMBER(10, 0)    NOT NULL,
    deployment_id      NUMBER(19, 0)    NOT NULL,
    file_seq           NUMBER(10, 0)    NOT NULL,
    file_type          VARCHAR2(100 char),
    relative_path      VARCHAR2(254 char),
    purge_status       VARCHAR2(30 char),
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_dpl_deployment_file PRIMARY KEY (organization_id, deployment_id, file_seq)
)
;


GRANT SELECT ON dpl_deployment_file TO POSUSERS
;
GRANT INSERT ON dpl_deployment_file TO POSUSERS
;
GRANT UPDATE ON dpl_deployment_file TO POSUSERS
;
GRANT DELETE ON dpl_deployment_file TO POSUSERS
;
GRANT SELECT ON dpl_deployment_file TO DBAUSERS
;
GRANT INSERT ON dpl_deployment_file TO DBAUSERS
;
GRANT UPDATE ON dpl_deployment_file TO DBAUSERS
;
GRANT DELETE ON dpl_deployment_file TO DBAUSERS
;

-- 
-- TABLE: dpl_deployment_file_status 
--

CREATE TABLE dpl_deployment_file_status(
    organization_id         NUMBER(10, 0)     NOT NULL,
    deployment_id           NUMBER(19, 0)     NOT NULL,
    deployment_wave_id      NUMBER(10, 0)     NOT NULL,
    store_number            NUMBER(10, 0)     NOT NULL,
    file_seq                NUMBER(10, 0)     NOT NULL,
    downloaded_status       VARCHAR2(100 char),
    downloaded_details      VARCHAR2(4000 char),
    downloaded_timestamp    DATE,
    applied_status          VARCHAR2(100 char),
    applied_details         VARCHAR2(4000 char),
    applied_timestamp       DATE,
    create_date             DATE,
    create_user_id          VARCHAR2(30 char),
    update_date             DATE,
    update_user_id          VARCHAR2(30 char),
    CONSTRAINT pk_dpl_deployment_file_status PRIMARY KEY (organization_id, deployment_id, deployment_wave_id, store_number, file_seq)
)
;


GRANT SELECT ON dpl_deployment_file_status TO POSUSERS
;
GRANT INSERT ON dpl_deployment_file_status TO POSUSERS
;
GRANT UPDATE ON dpl_deployment_file_status TO POSUSERS
;
GRANT DELETE ON dpl_deployment_file_status TO POSUSERS
;
GRANT SELECT ON dpl_deployment_file_status TO DBAUSERS
;
GRANT INSERT ON dpl_deployment_file_status TO DBAUSERS
;
GRANT UPDATE ON dpl_deployment_file_status TO DBAUSERS
;
GRANT DELETE ON dpl_deployment_file_status TO DBAUSERS
;

-- 
-- TABLE: dpl_deployment_plan 
--

CREATE TABLE dpl_deployment_plan(
    plan_id            NUMBER(19, 0)		NOT NULL,
    plan_name          VARCHAR2(60 char)    NOT NULL,
    description        VARCHAR2(255 char),
    organization_id    NUMBER(10, 0)		NOT NULL,
    org_scope          VARCHAR2(100 char),
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_dpl_deployment_plan PRIMARY KEY (organization_id, plan_id)
)
;


GRANT SELECT ON dpl_deployment_plan TO POSUSERS
;
GRANT INSERT ON dpl_deployment_plan TO POSUSERS
;
GRANT UPDATE ON dpl_deployment_plan TO POSUSERS
;
GRANT DELETE ON dpl_deployment_plan TO POSUSERS
;
GRANT SELECT ON dpl_deployment_plan TO DBAUSERS
;
GRANT INSERT ON dpl_deployment_plan TO DBAUSERS
;
GRANT UPDATE ON dpl_deployment_plan TO DBAUSERS
;
GRANT DELETE ON dpl_deployment_plan TO DBAUSERS
;

-- 
-- TABLE: dpl_deployment_plan_emails 
--

CREATE TABLE dpl_deployment_plan_emails(
    plan_id            NUMBER(19, 0)		NOT NULL,
    organization_id    NUMBER(10, 0)		NOT NULL,
    user_name          VARCHAR2(30 char)    NOT NULL,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_dpl_deployment_plan_emails PRIMARY KEY (organization_id, plan_id, user_name)
)
;


GRANT SELECT ON dpl_deployment_plan_emails TO POSUSERS
;
GRANT INSERT ON dpl_deployment_plan_emails TO POSUSERS
;
GRANT UPDATE ON dpl_deployment_plan_emails TO POSUSERS
;
GRANT DELETE ON dpl_deployment_plan_emails TO POSUSERS
;
GRANT SELECT ON dpl_deployment_plan_emails TO DBAUSERS
;
GRANT INSERT ON dpl_deployment_plan_emails TO DBAUSERS
;
GRANT UPDATE ON dpl_deployment_plan_emails TO DBAUSERS
;
GRANT DELETE ON dpl_deployment_plan_emails TO DBAUSERS
;

-- 
-- TABLE: dpl_deployment_plan_wave 
--

CREATE TABLE dpl_deployment_plan_wave(
    wave_id                   NUMBER(19, 0)			NOT NULL,
    wave_name                 VARCHAR2(60 char)     NOT NULL,
    plan_id                   NUMBER(19, 0)			NOT NULL,
    description               VARCHAR2(255 char),
    timeline                  NUMBER(10, 0),
    approval_needed           NUMBER(1, 0)			DEFAULT 0,
    is_all_remaining_store    NUMBER(1, 0)			DEFAULT 0,
    organization_id           NUMBER(10, 0)			NOT NULL,
    create_date               DATE,
    create_user_id            VARCHAR2(30 char),
    update_date               DATE,
    update_user_id            VARCHAR2(30 char),
    CONSTRAINT pk_dpl_deployment_plan_wave PRIMARY KEY (organization_id, wave_id, plan_id),
    CONSTRAINT uc_dpl_deployment_plan_wave  UNIQUE (wave_name, plan_id, organization_id)
)
;


GRANT SELECT ON dpl_deployment_plan_wave TO POSUSERS
;
GRANT INSERT ON dpl_deployment_plan_wave TO POSUSERS
;
GRANT UPDATE ON dpl_deployment_plan_wave TO POSUSERS
;
GRANT DELETE ON dpl_deployment_plan_wave TO POSUSERS
;
GRANT SELECT ON dpl_deployment_plan_wave TO DBAUSERS
;
GRANT INSERT ON dpl_deployment_plan_wave TO DBAUSERS
;
GRANT UPDATE ON dpl_deployment_plan_wave TO DBAUSERS
;
GRANT DELETE ON dpl_deployment_plan_wave TO DBAUSERS
;

-- 
-- TABLE: dpl_deployment_plan_wavetarget 
--

CREATE TABLE dpl_deployment_plan_wavetarget(
    wave_id            NUMBER(19, 0)		NOT NULL,
    plan_id            NUMBER(19, 0)		NOT NULL,
    org_scope          VARCHAR2(100 char)   NOT NULL,
    organization_id    NUMBER(10, 0)		NOT NULL,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_dpldeploymentplanwavetarget PRIMARY KEY (organization_id, wave_id, plan_id, org_scope)
)
;


GRANT SELECT ON dpl_deployment_plan_wavetarget TO POSUSERS
;
GRANT INSERT ON dpl_deployment_plan_wavetarget TO POSUSERS
;
GRANT UPDATE ON dpl_deployment_plan_wavetarget TO POSUSERS
;
GRANT DELETE ON dpl_deployment_plan_wavetarget TO POSUSERS
;
GRANT SELECT ON dpl_deployment_plan_wavetarget TO DBAUSERS
;
GRANT INSERT ON dpl_deployment_plan_wavetarget TO DBAUSERS
;
GRANT UPDATE ON dpl_deployment_plan_wavetarget TO DBAUSERS
;
GRANT DELETE ON dpl_deployment_plan_wavetarget TO DBAUSERS
;

-- 
-- TABLE: dpl_deployment_target 
--

CREATE TABLE dpl_deployment_target(
    organization_id                  NUMBER(10, 0)    NOT NULL,
    deployment_id                    NUMBER(19, 0)    NOT NULL,
    deployment_wave_id               NUMBER(10, 0)    NOT NULL,
    store_number                     NUMBER(10, 0)    NOT NULL,
    manifest_downloaded_timestamp    DATE,
    files_applied_status             VARCHAR2(100 char),
    files_downloaded_status          VARCHAR2(100 char),
    create_date                      DATE,
    create_user_id                   VARCHAR2(30 char),
    update_date                      DATE,
    update_user_id                   VARCHAR2(30 char),
    CONSTRAINT pk_dpl_deployment_target PRIMARY KEY (organization_id, deployment_id, deployment_wave_id, store_number)
)
;


GRANT SELECT ON dpl_deployment_target TO POSUSERS
;
GRANT INSERT ON dpl_deployment_target TO POSUSERS
;
GRANT UPDATE ON dpl_deployment_target TO POSUSERS
;
GRANT DELETE ON dpl_deployment_target TO POSUSERS
;
GRANT SELECT ON dpl_deployment_target TO DBAUSERS
;
GRANT INSERT ON dpl_deployment_target TO DBAUSERS
;
GRANT UPDATE ON dpl_deployment_target TO DBAUSERS
;
GRANT DELETE ON dpl_deployment_target TO DBAUSERS
;

-- 
-- TABLE: dpl_deployment_wave 
--

CREATE TABLE dpl_deployment_wave(
    organization_id           NUMBER(10, 0)			NOT NULL,
    deployment_id             NUMBER(19, 0)			NOT NULL,
    deployment_wave_id        NUMBER(10, 0)			NOT NULL,
    wave_name                 VARCHAR2(60 char)     NOT NULL,
    approval_needed           NUMBER(1, 0)			DEFAULT 0,
    approved                  NUMBER(1, 0)			DEFAULT 1,
    is_approval_email_sent    NUMBER(1, 0)			DEFAULT 0,
    is_onhold_email_sent      NUMBER(1, 0)			DEFAULT 0,
    wave_status               VARCHAR2(100 char),
    target_date               DATE,
    create_date               DATE,
    create_user_id            VARCHAR2(30 char),
    update_date               DATE,
    update_user_id            VARCHAR2(30 char),
    CONSTRAINT pk_dpl_deployment_wave PRIMARY KEY (organization_id, deployment_id, deployment_wave_id)
)
;


GRANT SELECT ON dpl_deployment_wave TO POSUSERS
;
GRANT INSERT ON dpl_deployment_wave TO POSUSERS
;
GRANT UPDATE ON dpl_deployment_wave TO POSUSERS
;
GRANT DELETE ON dpl_deployment_wave TO POSUSERS
;
GRANT SELECT ON dpl_deployment_wave TO DBAUSERS
;
GRANT INSERT ON dpl_deployment_wave TO DBAUSERS
;
GRANT UPDATE ON dpl_deployment_wave TO DBAUSERS
;
GRANT DELETE ON dpl_deployment_wave TO DBAUSERS
;

-- 
-- TABLE: dpl_deployment_wave_approvals 
--

CREATE TABLE dpl_deployment_wave_approvals(
    log_id                NUMBER(19, 0)    NOT NULL,
    organization_id       NUMBER(10, 0)    NOT NULL,
    deployment_id         NUMBER(19, 0)    NOT NULL,
    deployment_wave_id    NUMBER(10, 0)    NOT NULL,
    comments              VARCHAR2(255 char),
    action                VARCHAR2(100 char),
    create_date           DATE,
    create_user_id        VARCHAR2(30 char),
    update_date           DATE,
    update_user_id        VARCHAR2(30 char),
    CONSTRAINT pk_dpl_deployment_wv_approvals PRIMARY KEY (log_id)
)
;


GRANT SELECT ON dpl_deployment_wave_approvals TO POSUSERS
;
GRANT INSERT ON dpl_deployment_wave_approvals TO POSUSERS
;
GRANT UPDATE ON dpl_deployment_wave_approvals TO POSUSERS
;
GRANT DELETE ON dpl_deployment_wave_approvals TO POSUSERS
;
GRANT SELECT ON dpl_deployment_wave_approvals TO DBAUSERS
;
GRANT INSERT ON dpl_deployment_wave_approvals TO DBAUSERS
;
GRANT UPDATE ON dpl_deployment_wave_approvals TO DBAUSERS
;
GRANT DELETE ON dpl_deployment_wave_approvals TO DBAUSERS
;

-- 
-- TABLE: loc_rtl_loc_collection 
--

CREATE TABLE loc_rtl_loc_collection(
    collection_name    VARCHAR2(60 char)     NOT NULL,
    organization_id    NUMBER(10, 0)		 DEFAULT 1 NOT NULL,
    description        VARCHAR2(256 char),
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT pk_loc_rtl_loc_collection PRIMARY KEY (organization_id, collection_name)
)
;


GRANT SELECT ON loc_rtl_loc_collection TO POSUSERS
;
GRANT INSERT ON loc_rtl_loc_collection TO POSUSERS
;
GRANT UPDATE ON loc_rtl_loc_collection TO POSUSERS
;
GRANT DELETE ON loc_rtl_loc_collection TO POSUSERS
;
GRANT SELECT ON loc_rtl_loc_collection TO DBAUSERS
;
GRANT INSERT ON loc_rtl_loc_collection TO DBAUSERS
;
GRANT UPDATE ON loc_rtl_loc_collection TO DBAUSERS
;
GRANT DELETE ON loc_rtl_loc_collection TO DBAUSERS
;

-- 
-- TABLE: loc_rtl_loc_collection_element 
--

CREATE TABLE loc_rtl_loc_collection_element(
    collection_name    VARCHAR2(60 char)     NOT NULL,
    org_scope_code     VARCHAR2(60 char)     NOT NULL,
    organization_id    NUMBER(10, 0)		 DEFAULT 1 NOT NULL,
    create_date        DATE,
    create_user_id     VARCHAR2(30 char),
    update_date        DATE,
    update_user_id     VARCHAR2(30 char),
    CONSTRAINT PK_TMP_RTL_LOC_COLLCTN_ELEMENT PRIMARY KEY (organization_id, collection_name, org_scope_code)
)
;


GRANT SELECT ON loc_rtl_loc_collection_element TO POSUSERS
;
GRANT INSERT ON loc_rtl_loc_collection_element TO POSUSERS
;
GRANT UPDATE ON loc_rtl_loc_collection_element TO POSUSERS
;
GRANT DELETE ON loc_rtl_loc_collection_element TO POSUSERS
;
GRANT SELECT ON loc_rtl_loc_collection_element TO DBAUSERS
;
GRANT INSERT ON loc_rtl_loc_collection_element TO DBAUSERS
;
GRANT UPDATE ON loc_rtl_loc_collection_element TO DBAUSERS
;
GRANT DELETE ON loc_rtl_loc_collection_element TO DBAUSERS
;

-- 
-- TABLE: rpt_stock_rollup 
--

CREATE TABLE rpt_stock_rollup(
    id                NUMBER(19, 0)    NOT NULL,
    user_id           VARCHAR2(50 char),
    fiscal_year       NUMBER(19, 0),
    start_date        DATE,
    end_date          DATE,
    status            VARCHAR2(30 char),
    create_date       DATE,
    create_user_id    VARCHAR2(30 char),
    update_date       DATE,
    update_user_id    VARCHAR2(30 char),
    CONSTRAINT pk_rpt_stock_rollup PRIMARY KEY (id)
)
;


GRANT SELECT ON rpt_stock_rollup TO POSUSERS
;
GRANT INSERT ON rpt_stock_rollup TO POSUSERS
;
GRANT UPDATE ON rpt_stock_rollup TO POSUSERS
;
GRANT DELETE ON rpt_stock_rollup TO POSUSERS
;
GRANT SELECT ON rpt_stock_rollup TO DBAUSERS
;
GRANT INSERT ON rpt_stock_rollup TO DBAUSERS
;
GRANT UPDATE ON rpt_stock_rollup TO DBAUSERS
;
GRANT DELETE ON rpt_stock_rollup TO DBAUSERS
;

-- 
-- VIEW: Test_Connection 
--

CREATE OR REPLACE VIEW Test_Connection(result)
AS
SELECT 1  from dual
;

GRANT SELECT ON Test_Connection TO POSUSERS
;
GRANT SELECT ON Test_Connection TO DBAUSERS
;

-- 
-- SEQUENCE: DEPLOYMENT_WAVE_APPROVALS_SEQ 
--

CREATE SEQUENCE DEPLOYMENT_WAVE_APPROVALS_SEQ
    START WITH 0
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 9999999999999999999
    NOCYCLE
    CACHE 20
    NOORDER
;
GRANT SELECT ON DEPLOYMENT_WAVE_APPROVALS_SEQ TO POSUSERS
;
GRANT SELECT ON DEPLOYMENT_WAVE_APPROVALS_SEQ TO DBAUSERS
;


-- 
-- SEQUENCE: HIBERNATE_SEQUENCE 
--

CREATE SEQUENCE HIBERNATE_SEQUENCE
    START WITH 10000
    INCREMENT BY 1
    MINVALUE 10000
    MAXVALUE 999999999999999999999999999
    NOCYCLE
    CACHE 20
    NOORDER
;
GRANT SELECT ON HIBERNATE_SEQUENCE TO POSUSERS
;
GRANT SELECT ON HIBERNATE_SEQUENCE TO DBAUSERS
;


-- 
-- TRIGGER: deployment_wave_approvals_trg 
--

CREATE OR REPLACE TRIGGER deployment_wave_approvals_trg
				BEFORE INSERT ON dpl_deployment_wave_approvals
				FOR EACH ROW
				BEGIN
				    SELECT deployment_wave_approvals_seq.nextval INTO :new.log_id FROM dual;
				END;
/

