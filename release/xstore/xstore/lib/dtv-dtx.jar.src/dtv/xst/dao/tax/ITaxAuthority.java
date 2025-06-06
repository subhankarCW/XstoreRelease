/*    */ package dtv.xst.dao.tax;
/*    */ import dtv.data2.access.IDataAccessObject;
/*    */ import dtv.data2.access.IDataModel;
/*    */ import dtv.event.EventEnum;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ 
/*    */ public interface ITaxAuthority extends IDataModel, IHasDataProperty<ITaxAuthorityProperty> {
/*  9 */   public static final EventEnum SET_ORGANIZATIONID = new EventEnum("set organizationId");
/* 10 */   public static final EventEnum SET_TAXAUTHORITYID = new EventEnum("set taxAuthorityId");
/* 11 */   public static final EventEnum SET_CREATEDATE = new EventEnum("set createDate");
/* 12 */   public static final EventEnum SET_CREATEUSERID = new EventEnum("set createUserId");
/* 13 */   public static final EventEnum SET_UPDATEDATE = new EventEnum("set updateDate");
/* 14 */   public static final EventEnum SET_UPDATEUSERID = new EventEnum("set updateUserId");
/* 15 */   public static final EventEnum SET_ORGCODE = new EventEnum("set orgCode");
/* 16 */   public static final EventEnum SET_ORGVALUE = new EventEnum("set orgValue");
/* 17 */   public static final EventEnum SET_NAME = new EventEnum("set name");
/* 18 */   public static final EventEnum SET_ROUNDINGCODE = new EventEnum("set roundingCode");
/* 19 */   public static final EventEnum SET_ROUNDINGDIGITSQUANTITY = new EventEnum("set roundingDigitsQuantity");
/* 20 */   public static final EventEnum SET_EXTERNALSYSTEM = new EventEnum("set externalSystem");
/* 21 */   public static final EventEnum ADD_PROPERTIES = new EventEnum("add Properties");
/* 22 */   public static final EventEnum REMOVE_PROPERTIES = new EventEnum("remove Properties");
/* 23 */   public static final EventEnum SET_PROPERTIES = new EventEnum("set Properties");
/* 24 */   public static final EventEnum START_TRANSACTION = new EventEnum("start transaction");
/* 25 */   public static final EventEnum ROLLBACK_TRANSACTION = new EventEnum("rollback transaction");
/* 26 */   public static final EventEnum COMMIT_TRANSACTION = new EventEnum("commit transaction");
/*    */   
/*    */   void setDAO(IDataAccessObject paramIDataAccessObject);
/*    */   
/*    */   long getOrganizationId();
/*    */   
/*    */   void setOrganizationId(long paramLong);
/*    */   
/*    */   String getTaxAuthorityId();
/*    */   
/*    */   void setTaxAuthorityId(String paramString);
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
/*    */   String getOrgCode();
/*    */   
/*    */   void setOrgCode(String paramString);
/*    */   
/*    */   String getOrgValue();
/*    */   
/*    */   void setOrgValue(String paramString);
/*    */   
/*    */   String getName();
/*    */   
/*    */   void setName(String paramString);
/*    */   
/*    */   String getRoundingCode();
/*    */   
/*    */   void setRoundingCode(String paramString);
/*    */   
/*    */   int getRoundingDigitsQuantity();
/*    */   
/*    */   void setRoundingDigitsQuantity(int paramInt);
/*    */   
/*    */   String getExternalSystem();
/*    */   
/*    */   void setExternalSystem(String paramString);
/*    */   
/*    */   IDataModel getTaxAuthorityExt();
/*    */   
/*    */   void setTaxAuthorityExt(IDataModel paramIDataModel);
/*    */   
/*    */   List<ITaxAuthorityProperty> getProperties();
/*    */   
/*    */   void setProperties(List<ITaxAuthorityProperty> paramList);
/*    */   
/*    */   void addTaxAuthorityProperty(ITaxAuthorityProperty paramITaxAuthorityProperty);
/*    */   
/*    */   void removeTaxAuthorityProperty(ITaxAuthorityProperty paramITaxAuthorityProperty);
/*    */   
/*    */   void startTransaction();
/*    */   
/*    */   void rollbackChanges();
/*    */   
/*    */   void commitTransaction();
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\tax\ITaxAuthority.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */