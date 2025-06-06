/*    */ package dtv.xst.dao.trl;
/*    */ import dtv.data2.access.IDataAccessObject;
/*    */ import dtv.data2.access.IDataModel;
/*    */ import dtv.event.EventEnum;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ 
/*    */ public interface IWarrantyModifier extends IDataModel, IHasDataProperty<IWarrantyModifierProperty> {
/*  9 */   public static final EventEnum SET_BUSINESSDATE = new EventEnum("set businessDate");
/* 10 */   public static final EventEnum SET_ORGANIZATIONID = new EventEnum("set organizationId");
/* 11 */   public static final EventEnum SET_RETAILLOCATIONID = new EventEnum("set retailLocationId");
/* 12 */   public static final EventEnum SET_RETAILTRANSACTIONLINEITEMSEQUENCE = new EventEnum("set retailTransactionLineItemSequence");
/* 13 */   public static final EventEnum SET_TRANSACTIONSEQUENCE = new EventEnum("set transactionSequence");
/* 14 */   public static final EventEnum SET_WORKSTATIONID = new EventEnum("set workstationId");
/* 15 */   public static final EventEnum SET_WARRANTYMODIFIERSEQUENCE = new EventEnum("set warrantyModifierSequence");
/* 16 */   public static final EventEnum SET_CREATEDATE = new EventEnum("set createDate");
/* 17 */   public static final EventEnum SET_CREATEUSERID = new EventEnum("set createUserId");
/* 18 */   public static final EventEnum SET_UPDATEDATE = new EventEnum("set updateDate");
/* 19 */   public static final EventEnum SET_UPDATEUSERID = new EventEnum("set updateUserId");
/* 20 */   public static final EventEnum SET_WARRANTYNBR = new EventEnum("set warrantyNbr");
/* 21 */   public static final EventEnum SET_WARRANTYTYPECODE = new EventEnum("set warrantyTypeCode");
/* 22 */   public static final EventEnum ADD_PROPERTIES = new EventEnum("add Properties");
/* 23 */   public static final EventEnum REMOVE_PROPERTIES = new EventEnum("remove Properties");
/* 24 */   public static final EventEnum SET_PROPERTIES = new EventEnum("set Properties");
/* 25 */   public static final EventEnum START_TRANSACTION = new EventEnum("start transaction");
/* 26 */   public static final EventEnum ROLLBACK_TRANSACTION = new EventEnum("rollback transaction");
/* 27 */   public static final EventEnum COMMIT_TRANSACTION = new EventEnum("commit transaction");
/*    */   
/*    */   void setDAO(IDataAccessObject paramIDataAccessObject);
/*    */   
/*    */   Date getBusinessDate();
/*    */   
/*    */   void setBusinessDate(Date paramDate);
/*    */   
/*    */   long getOrganizationId();
/*    */   
/*    */   void setOrganizationId(long paramLong);
/*    */   
/*    */   long getRetailLocationId();
/*    */   
/*    */   void setRetailLocationId(long paramLong);
/*    */   
/*    */   int getRetailTransactionLineItemSequence();
/*    */   
/*    */   void setRetailTransactionLineItemSequence(int paramInt);
/*    */   
/*    */   long getTransactionSequence();
/*    */   
/*    */   void setTransactionSequence(long paramLong);
/*    */   
/*    */   long getWorkstationId();
/*    */   
/*    */   void setWorkstationId(long paramLong);
/*    */   
/*    */   int getWarrantyModifierSequence();
/*    */   
/*    */   void setWarrantyModifierSequence(int paramInt);
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
/*    */   String getWarrantyNbr();
/*    */   
/*    */   void setWarrantyNbr(String paramString);
/*    */   
/*    */   String getWarrantyTypeCode();
/*    */   
/*    */   void setWarrantyTypeCode(String paramString);
/*    */   
/*    */   IDataModel getWarrantyModifierExt();
/*    */   
/*    */   void setWarrantyModifierExt(IDataModel paramIDataModel);
/*    */   
/*    */   List<IWarrantyModifierProperty> getProperties();
/*    */   
/*    */   void setProperties(List<IWarrantyModifierProperty> paramList);
/*    */   
/*    */   void addWarrantyModifierProperty(IWarrantyModifierProperty paramIWarrantyModifierProperty);
/*    */   
/*    */   void removeWarrantyModifierProperty(IWarrantyModifierProperty paramIWarrantyModifierProperty);
/*    */   
/*    */   void setParentLine(IWarrantyLineItem paramIWarrantyLineItem);
/*    */   
/*    */   IWarrantyLineItem getParentLine();
/*    */   
/*    */   void startTransaction();
/*    */   
/*    */   void rollbackChanges();
/*    */   
/*    */   void commitTransaction();
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\trl\IWarrantyModifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */