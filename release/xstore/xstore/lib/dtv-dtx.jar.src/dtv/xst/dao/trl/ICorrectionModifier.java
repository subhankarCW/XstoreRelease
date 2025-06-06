/*    */ package dtv.xst.dao.trl;
/*    */ import dtv.data2.access.IDataModel;
/*    */ import dtv.event.EventEnum;
/*    */ import java.math.BigDecimal;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ 
/*    */ public interface ICorrectionModifier extends IDataModel, IHasDataProperty<ICorrectionModifierProperty> {
/*  9 */   public static final EventEnum SET_BUSINESSDATE = new EventEnum("set businessDate");
/* 10 */   public static final EventEnum SET_ORGANIZATIONID = new EventEnum("set organizationId");
/* 11 */   public static final EventEnum SET_RETAILLOCATIONID = new EventEnum("set retailLocationId");
/* 12 */   public static final EventEnum SET_RETAILTRANSACTIONLINEITEMSEQUENCE = new EventEnum("set retailTransactionLineItemSequence");
/* 13 */   public static final EventEnum SET_TRANSACTIONSEQUENCE = new EventEnum("set transactionSequence");
/* 14 */   public static final EventEnum SET_WORKSTATIONID = new EventEnum("set workstationId");
/* 15 */   public static final EventEnum SET_CREATEDATE = new EventEnum("set createDate");
/* 16 */   public static final EventEnum SET_CREATEUSERID = new EventEnum("set createUserId");
/* 17 */   public static final EventEnum SET_UPDATEDATE = new EventEnum("set updateDate");
/* 18 */   public static final EventEnum SET_UPDATEUSERID = new EventEnum("set updateUserId");
/* 19 */   public static final EventEnum SET_ORIGINALRETAILLOCATIONID = new EventEnum("set originalRetailLocationId");
/* 20 */   public static final EventEnum SET_ORIGINALWORKSTATIONID = new EventEnum("set originalWorkstationId");
/* 21 */   public static final EventEnum SET_ORIGINALBUSINESSDATE = new EventEnum("set originalBusinessDate");
/* 22 */   public static final EventEnum SET_ORIGINALTRANSACTIONSEQUENCE = new EventEnum("set originalTransactionSequence");
/* 23 */   public static final EventEnum SET_ORIGINALRETAILTRANSACTIONLINEITEMSEQUENCE = new EventEnum("set originalRetailTransactionLineItemSequence");
/* 24 */   public static final EventEnum SET_REASONCODE = new EventEnum("set reasonCode");
/* 25 */   public static final EventEnum SET_NOTES = new EventEnum("set notes");
/* 26 */   public static final EventEnum SET_ORIGINALTAXAMT = new EventEnum("set originalTaxAmt");
/* 27 */   public static final EventEnum SET_ORIGINALEXTENDEDPRICE = new EventEnum("set originalExtendedPrice");
/* 28 */   public static final EventEnum SET_ORIGINALUNITPRICE = new EventEnum("set originalUnitPrice");
/* 29 */   public static final EventEnum SET_ORIGINALBASEEXTENDEDPRICE = new EventEnum("set originalBaseExtendedPrice");
/* 30 */   public static final EventEnum SET_ORIGINALBASEUNITPRICE = new EventEnum("set originalBaseUnitPrice");
/* 31 */   public static final EventEnum ADD_PROPERTIES = new EventEnum("add Properties");
/* 32 */   public static final EventEnum REMOVE_PROPERTIES = new EventEnum("remove Properties");
/* 33 */   public static final EventEnum SET_PROPERTIES = new EventEnum("set Properties");
/* 34 */   public static final EventEnum START_TRANSACTION = new EventEnum("start transaction");
/* 35 */   public static final EventEnum ROLLBACK_TRANSACTION = new EventEnum("rollback transaction");
/* 36 */   public static final EventEnum COMMIT_TRANSACTION = new EventEnum("commit transaction");
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
/*    */   long getOriginalRetailLocationId();
/*    */   
/*    */   void setOriginalRetailLocationId(long paramLong);
/*    */   
/*    */   long getOriginalWorkstationId();
/*    */   
/*    */   void setOriginalWorkstationId(long paramLong);
/*    */   
/*    */   Date getOriginalBusinessDate();
/*    */   
/*    */   void setOriginalBusinessDate(Date paramDate);
/*    */   
/*    */   long getOriginalTransactionSequence();
/*    */   
/*    */   void setOriginalTransactionSequence(long paramLong);
/*    */   
/*    */   int getOriginalRetailTransactionLineItemSequence();
/*    */   
/*    */   void setOriginalRetailTransactionLineItemSequence(int paramInt);
/*    */   
/*    */   String getReasonCode();
/*    */   
/*    */   void setReasonCode(String paramString);
/*    */   
/*    */   String getNotes();
/*    */   
/*    */   void setNotes(String paramString);
/*    */   
/*    */   BigDecimal getOriginalTaxAmt();
/*    */   
/*    */   void setOriginalTaxAmt(BigDecimal paramBigDecimal);
/*    */   
/*    */   BigDecimal getOriginalExtendedPrice();
/*    */   
/*    */   void setOriginalExtendedPrice(BigDecimal paramBigDecimal);
/*    */   
/*    */   BigDecimal getOriginalUnitPrice();
/*    */   
/*    */   void setOriginalUnitPrice(BigDecimal paramBigDecimal);
/*    */   
/*    */   BigDecimal getOriginalBaseExtendedPrice();
/*    */   
/*    */   void setOriginalBaseExtendedPrice(BigDecimal paramBigDecimal);
/*    */   
/*    */   BigDecimal getOriginalBaseUnitPrice();
/*    */   
/*    */   void setOriginalBaseUnitPrice(BigDecimal paramBigDecimal);
/*    */   
/*    */   IDataModel getCorrectionModifierExt();
/*    */   
/*    */   void setCorrectionModifierExt(IDataModel paramIDataModel);
/*    */   
/*    */   List<ICorrectionModifierProperty> getProperties();
/*    */   
/*    */   void setProperties(List<ICorrectionModifierProperty> paramList);
/*    */   
/*    */   void addCorrectionModifierProperty(ICorrectionModifierProperty paramICorrectionModifierProperty);
/*    */   
/*    */   void removeCorrectionModifierProperty(ICorrectionModifierProperty paramICorrectionModifierProperty);
/*    */   
/*    */   void setParentLine(IRetailTransactionLineItem paramIRetailTransactionLineItem);
/*    */   
/*    */   IRetailTransactionLineItem getParentLine();
/*    */   
/*    */   void startTransaction();
/*    */   
/*    */   void rollbackChanges();
/*    */   
/*    */   void commitTransaction();
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\trl\ICorrectionModifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */