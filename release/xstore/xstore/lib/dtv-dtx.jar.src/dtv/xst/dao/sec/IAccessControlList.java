/*    */ package dtv.xst.dao.sec;
/*    */ import dtv.data2.access.IDataAccessObject;
/*    */ import dtv.data2.access.IDataModel;
/*    */ import dtv.event.EventEnum;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ 
/*    */ public interface IAccessControlList extends IDataModel, IHasDataProperty<IAccessControlListProperty> {
/*  9 */   public static final EventEnum SET_ORGANIZATIONID = new EventEnum("set organizationId");
/* 10 */   public static final EventEnum SET_SECUREDOBJECTID = new EventEnum("set securedObjectId");
/* 11 */   public static final EventEnum SET_CREATEDATE = new EventEnum("set createDate");
/* 12 */   public static final EventEnum SET_CREATEUSERID = new EventEnum("set createUserId");
/* 13 */   public static final EventEnum SET_UPDATEDATE = new EventEnum("set updateDate");
/* 14 */   public static final EventEnum SET_UPDATEUSERID = new EventEnum("set updateUserId");
/* 15 */   public static final EventEnum SET_AUTHENTICATIONREQUIRED = new EventEnum("set authenticationRequired");
/* 16 */   public static final EventEnum ADD_ACLENTRIES = new EventEnum("add AclEntries");
/* 17 */   public static final EventEnum REMOVE_ACLENTRIES = new EventEnum("remove AclEntries");
/* 18 */   public static final EventEnum SET_ACLENTRIES = new EventEnum("set AclEntries");
/* 19 */   public static final EventEnum ADD_PROPERTIES = new EventEnum("add Properties");
/* 20 */   public static final EventEnum REMOVE_PROPERTIES = new EventEnum("remove Properties");
/* 21 */   public static final EventEnum SET_PROPERTIES = new EventEnum("set Properties");
/* 22 */   public static final EventEnum START_TRANSACTION = new EventEnum("start transaction");
/* 23 */   public static final EventEnum ROLLBACK_TRANSACTION = new EventEnum("rollback transaction");
/* 24 */   public static final EventEnum COMMIT_TRANSACTION = new EventEnum("commit transaction");
/*    */   
/*    */   void setDAO(IDataAccessObject paramIDataAccessObject);
/*    */   
/*    */   long getOrganizationId();
/*    */   
/*    */   void setOrganizationId(long paramLong);
/*    */   
/*    */   String getSecuredObjectId();
/*    */   
/*    */   void setSecuredObjectId(String paramString);
/*    */   
/*    */   Date getCreateDate();
/*    */   
/*    */   void setCreateDate(Date paramDate);
/*    */   
/*    */   String getCreateUserId();
/*    */   
/*    */   void setCreateUserId(String paramString);
/*    */   
/*    */   Date getUpdateDate();
/*    */   
/*    */   void setUpdateDate(Date paramDate);
/*    */   
/*    */   String getUpdateUserId();
/*    */   
/*    */   void setUpdateUserId(String paramString);
/*    */   
/*    */   boolean getAuthenticationRequired();
/*    */   
/*    */   void setAuthenticationRequired(boolean paramBoolean);
/*    */   
/*    */   IDataModel getAccessControlListExt();
/*    */   
/*    */   void setAccessControlListExt(IDataModel paramIDataModel);
/*    */   
/*    */   List<IAclAccessType> getAclEntries();
/*    */   
/*    */   void setAclEntries(List<IAclAccessType> paramList);
/*    */   
/*    */   void addAclAccessType(IAclAccessType paramIAclAccessType);
/*    */   
/*    */   void removeAclAccessType(IAclAccessType paramIAclAccessType);
/*    */   
/*    */   List<IAccessControlListProperty> getProperties();
/*    */   
/*    */   void setProperties(List<IAccessControlListProperty> paramList);
/*    */   
/*    */   void addAccessControlListProperty(IAccessControlListProperty paramIAccessControlListProperty);
/*    */   
/*    */   void removeAccessControlListProperty(IAccessControlListProperty paramIAccessControlListProperty);
/*    */   
/*    */   void startTransaction();
/*    */   
/*    */   void rollbackChanges();
/*    */   
/*    */   void commitTransaction();
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\sec\IAccessControlList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */