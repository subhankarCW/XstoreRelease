/*    */ package dtv.xst.dao.inv;
/*    */ import dtv.data2.access.IDataModel;
/*    */ import dtv.event.EventEnum;
/*    */ import java.math.BigDecimal;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ 
/*    */ public interface IShipmentLineItem extends IDataModel, IShipmentLineItemModel, IHasDataProperty<IShipmentLineItemProperty> {
/*  9 */   public static final EventEnum SET_ORGANIZATIONID = new EventEnum("set organizationId");
/* 10 */   public static final EventEnum SET_RETAILLOCATIONID = new EventEnum("set retailLocationId");
/* 11 */   public static final EventEnum SET_DOCUMENTID = new EventEnum("set documentId");
/* 12 */   public static final EventEnum SET_DOCUMENTTYPECODE = new EventEnum("set documentTypeCode");
/* 13 */   public static final EventEnum SET_SHIPMENTSEQUENCE = new EventEnum("set shipmentSequence");
/* 14 */   public static final EventEnum SET_LINEITEMSEQUENCE = new EventEnum("set lineItemSequence");
/* 15 */   public static final EventEnum SET_CREATEDATE = new EventEnum("set createDate");
/* 16 */   public static final EventEnum SET_CREATEUSERID = new EventEnum("set createUserId");
/* 17 */   public static final EventEnum SET_UPDATEDATE = new EventEnum("set updateDate");
/* 18 */   public static final EventEnum SET_UPDATEUSERID = new EventEnum("set updateUserId");
/* 19 */   public static final EventEnum SET_INVENTORYDOCUMENTLINENUMBER = new EventEnum("set inventoryDocumentLineNumber");
/* 20 */   public static final EventEnum SET_SHIPQUANTITY = new EventEnum("set shipQuantity");
/* 21 */   public static final EventEnum SET_CARTONID = new EventEnum("set cartonId");
/* 22 */   public static final EventEnum SET_STATUSCODE = new EventEnum("set statusCode");
/* 23 */   public static final EventEnum ADD_PROPERTIES = new EventEnum("add Properties");
/* 24 */   public static final EventEnum REMOVE_PROPERTIES = new EventEnum("remove Properties");
/* 25 */   public static final EventEnum SET_PROPERTIES = new EventEnum("set Properties");
/* 26 */   public static final EventEnum START_TRANSACTION = new EventEnum("start transaction");
/* 27 */   public static final EventEnum ROLLBACK_TRANSACTION = new EventEnum("rollback transaction");
/* 28 */   public static final EventEnum COMMIT_TRANSACTION = new EventEnum("commit transaction");
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
/*    */   String getDocumentId();
/*    */   
/*    */   void setDocumentId(String paramString);
/*    */   
/*    */   String getDocumentTypeCode();
/*    */   
/*    */   void setDocumentTypeCode(String paramString);
/*    */   
/*    */   int getShipmentSequence();
/*    */   
/*    */   void setShipmentSequence(int paramInt);
/*    */   
/*    */   int getLineItemSequence();
/*    */   
/*    */   void setLineItemSequence(int paramInt);
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
/*    */   int getInventoryDocumentLineNumber();
/*    */   
/*    */   void setInventoryDocumentLineNumber(int paramInt);
/*    */   
/*    */   BigDecimal getShipQuantity();
/*    */   
/*    */   void setShipQuantity(BigDecimal paramBigDecimal);
/*    */   
/*    */   String getCartonId();
/*    */   
/*    */   void setCartonId(String paramString);
/*    */   
/*    */   String getStatusCode();
/*    */   
/*    */   void setStatusCode(String paramString);
/*    */   
/*    */   IDataModel getShipmentLineItemExt();
/*    */   
/*    */   void setShipmentLineItemExt(IDataModel paramIDataModel);
/*    */   
/*    */   List<IShipmentLineItemProperty> getProperties();
/*    */   
/*    */   void setProperties(List<IShipmentLineItemProperty> paramList);
/*    */   
/*    */   void addShipmentLineItemProperty(IShipmentLineItemProperty paramIShipmentLineItemProperty);
/*    */   
/*    */   void removeShipmentLineItemProperty(IShipmentLineItemProperty paramIShipmentLineItemProperty);
/*    */   
/*    */   void setParentShipment(IShipment paramIShipment);
/*    */   
/*    */   IShipment getParentShipment();
/*    */   
/*    */   void startTransaction();
/*    */   
/*    */   void rollbackChanges();
/*    */   
/*    */   void commitTransaction();
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\inv\IShipmentLineItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */