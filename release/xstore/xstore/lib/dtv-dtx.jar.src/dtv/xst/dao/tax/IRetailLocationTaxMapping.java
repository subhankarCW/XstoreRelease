/*    */ package dtv.xst.dao.tax;
/*    */ import dtv.data2.access.IDataAccessObject;
/*    */ import dtv.data2.access.IDataModel;
/*    */ import dtv.event.EventEnum;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ 
/*    */ public interface IRetailLocationTaxMapping extends IDataModel, IHasDataProperty<IRetailLocationTaxMappingProperty> {
/*  9 */   public static final EventEnum SET_ORGANIZATIONID = new EventEnum("set organizationId");
/* 10 */   public static final EventEnum SET_RETAILLOCATIONID = new EventEnum("set retailLocationId");
/* 11 */   public static final EventEnum SET_CREATEDATE = new EventEnum("set createDate");
/* 12 */   public static final EventEnum SET_CREATEUSERID = new EventEnum("set createUserId");
/* 13 */   public static final EventEnum SET_UPDATEDATE = new EventEnum("set updateDate");
/* 14 */   public static final EventEnum SET_UPDATEUSERID = new EventEnum("set updateUserId");
/* 15 */   public static final EventEnum SET_TAXLOCATIONID = new EventEnum("set taxLocationId");
/* 16 */   public static final EventEnum SET_TAXLOCATION = new EventEnum("set TaxLocation");
/* 17 */   public static final EventEnum ADD_PROPERTIES = new EventEnum("add Properties");
/* 18 */   public static final EventEnum REMOVE_PROPERTIES = new EventEnum("remove Properties");
/* 19 */   public static final EventEnum SET_PROPERTIES = new EventEnum("set Properties");
/* 20 */   public static final EventEnum START_TRANSACTION = new EventEnum("start transaction");
/* 21 */   public static final EventEnum ROLLBACK_TRANSACTION = new EventEnum("rollback transaction");
/* 22 */   public static final EventEnum COMMIT_TRANSACTION = new EventEnum("commit transaction");
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
/*    */   String getTaxLocationId();
/*    */   
/*    */   void setTaxLocationId(String paramString);
/*    */   
/*    */   IDataModel getRetailLocationTaxMappingExt();
/*    */   
/*    */   void setRetailLocationTaxMappingExt(IDataModel paramIDataModel);
/*    */   
/*    */   ITaxLocation getTaxLocation();
/*    */   
/*    */   void setTaxLocation(ITaxLocation paramITaxLocation);
/*    */   
/*    */   List<IRetailLocationTaxMappingProperty> getProperties();
/*    */   
/*    */   void setProperties(List<IRetailLocationTaxMappingProperty> paramList);
/*    */   
/*    */   void addRetailLocationTaxMappingProperty(IRetailLocationTaxMappingProperty paramIRetailLocationTaxMappingProperty);
/*    */   
/*    */   void removeRetailLocationTaxMappingProperty(IRetailLocationTaxMappingProperty paramIRetailLocationTaxMappingProperty);
/*    */   
/*    */   void startTransaction();
/*    */   
/*    */   void rollbackChanges();
/*    */   
/*    */   void commitTransaction();
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\tax\IRetailLocationTaxMapping.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */