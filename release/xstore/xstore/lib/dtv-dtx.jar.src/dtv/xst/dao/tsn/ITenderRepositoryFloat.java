/*    */ package dtv.xst.dao.tsn;
/*    */ import dtv.data2.access.IDataModel;
/*    */ import dtv.event.EventEnum;
/*    */ import java.math.BigDecimal;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ 
/*    */ public interface ITenderRepositoryFloat extends IDataModel, IHasDataProperty<ITenderRepositoryFloatProperty> {
/*  9 */   public static final EventEnum SET_ORGANIZATIONID = new EventEnum("set organizationId");
/* 10 */   public static final EventEnum SET_RETAILLOCATIONID = new EventEnum("set retailLocationId");
/* 11 */   public static final EventEnum SET_TENDERREPOSITORYID = new EventEnum("set tenderRepositoryId");
/* 12 */   public static final EventEnum SET_CURRENCYID = new EventEnum("set currencyId");
/* 13 */   public static final EventEnum SET_CREATEDATE = new EventEnum("set createDate");
/* 14 */   public static final EventEnum SET_CREATEUSERID = new EventEnum("set createUserId");
/* 15 */   public static final EventEnum SET_UPDATEDATE = new EventEnum("set updateDate");
/* 16 */   public static final EventEnum SET_UPDATEUSERID = new EventEnum("set updateUserId");
/* 17 */   public static final EventEnum SET_DEFAULTCASHFLOAT = new EventEnum("set defaultCashFloat");
/* 18 */   public static final EventEnum SET_LASTCLOSINGCASHAMT = new EventEnum("set lastClosingCashAmt");
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
/*    */   long getRetailLocationId();
/*    */   
/*    */   void setRetailLocationId(long paramLong);
/*    */   
/*    */   String getTenderRepositoryId();
/*    */   
/*    */   void setTenderRepositoryId(String paramString);
/*    */   
/*    */   String getCurrencyId();
/*    */   
/*    */   void setCurrencyId(String paramString);
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
/*    */   BigDecimal getDefaultCashFloat();
/*    */   
/*    */   void setDefaultCashFloat(BigDecimal paramBigDecimal);
/*    */   
/*    */   BigDecimal getLastClosingCashAmt();
/*    */   
/*    */   void setLastClosingCashAmt(BigDecimal paramBigDecimal);
/*    */   
/*    */   IDataModel getTenderRepositoryFloatExt();
/*    */   
/*    */   void setTenderRepositoryFloatExt(IDataModel paramIDataModel);
/*    */   
/*    */   List<ITenderRepositoryFloatProperty> getProperties();
/*    */   
/*    */   void setProperties(List<ITenderRepositoryFloatProperty> paramList);
/*    */   
/*    */   void addTenderRepositoryFloatProperty(ITenderRepositoryFloatProperty paramITenderRepositoryFloatProperty);
/*    */   
/*    */   void removeTenderRepositoryFloatProperty(ITenderRepositoryFloatProperty paramITenderRepositoryFloatProperty);
/*    */   
/*    */   void setParentTenderRepository(ITenderRepository paramITenderRepository);
/*    */   
/*    */   ITenderRepository getParentTenderRepository();
/*    */   
/*    */   void startTransaction();
/*    */   
/*    */   void rollbackChanges();
/*    */   
/*    */   void commitTransaction();
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\tsn\ITenderRepositoryFloat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */