/*     */ package dtv.xst.dao.inv.impl;
/*     */ 
/*     */ import dtv.data2.access.DaoUtils;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.exception.DtxException;
/*     */ import dtv.data2.access.impl.AbstractDAOImpl;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.xst.dao.inv.InventoryMovementPendingDetailId;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Date;
/*     */ import java.util.Map;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class InventoryMovementPendingDetailDAO
/*     */   extends AbstractDAOImpl
/*     */ {
/*     */   private static final long serialVersionUID = 827340925L;
/*  23 */   private static final Logger _logger = Logger.getLogger(InventoryMovementPendingDetailDAO.class);
/*     */   
/*     */   private Long _organizationId;
/*     */   private Long _retailLocationId;
/*     */   private DtvDate _businessDate;
/*     */   private Long _workstationId;
/*     */   private Long _transactionSequence;
/*     */   private Long _lineItemSequence;
/*     */   private Long _pendingSequence;
/*     */   private DtvDate _createDate;
/*     */   private String _createUserId;
/*     */   private DtvDate _updateDate;
/*     */   private String _updateUserId;
/*     */   private String _serialNumber;
/*     */   private String _itemId;
/*     */   private BigDecimal _quantity;
/*     */   private String _sourceLocationId;
/*     */   private String _sourceBucketId;
/*     */   private String _destinationLocationId;
/*     */   private String _destinationBucketId;
/*     */   private String _actionCode;
/*  44 */   private Boolean _void = Boolean.FALSE;
/*     */   
/*     */   public Long getOrganizationId() {
/*  47 */     return this._organizationId;
/*     */   }
/*     */   
/*     */   public void setOrganizationId(Long argOrganizationId) {
/*  51 */     if (changed(argOrganizationId, this._organizationId, "organizationId")) {
/*  52 */       this._organizationId = argOrganizationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getRetailLocationId() {
/*  57 */     return this._retailLocationId;
/*     */   }
/*     */   
/*     */   public void setRetailLocationId(Long argRetailLocationId) {
/*  61 */     if (changed(argRetailLocationId, this._retailLocationId, "retailLocationId")) {
/*  62 */       this._retailLocationId = argRetailLocationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getBusinessDate() {
/*  67 */     return (Date)this._businessDate;
/*     */   }
/*     */   
/*     */   public void setBusinessDate(Date argBusinessDate) {
/*  71 */     if (changed(argBusinessDate, this._businessDate, "businessDate")) {
/*  72 */       this._businessDate = (argBusinessDate == null || argBusinessDate instanceof DtvDate) ? (DtvDate)argBusinessDate : new DtvDate(argBusinessDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public Long getWorkstationId() {
/*  78 */     return this._workstationId;
/*     */   }
/*     */   
/*     */   public void setWorkstationId(Long argWorkstationId) {
/*  82 */     if (changed(argWorkstationId, this._workstationId, "workstationId")) {
/*  83 */       this._workstationId = argWorkstationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getTransactionSequence() {
/*  88 */     return this._transactionSequence;
/*     */   }
/*     */   
/*     */   public void setTransactionSequence(Long argTransactionSequence) {
/*  92 */     if (changed(argTransactionSequence, this._transactionSequence, "transactionSequence")) {
/*  93 */       this._transactionSequence = argTransactionSequence;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getLineItemSequence() {
/*  98 */     return this._lineItemSequence;
/*     */   }
/*     */   
/*     */   public void setLineItemSequence(Long argLineItemSequence) {
/* 102 */     if (changed(argLineItemSequence, this._lineItemSequence, "lineItemSequence")) {
/* 103 */       this._lineItemSequence = argLineItemSequence;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getPendingSequence() {
/* 108 */     return this._pendingSequence;
/*     */   }
/*     */   
/*     */   public void setPendingSequence(Long argPendingSequence) {
/* 112 */     if (changed(argPendingSequence, this._pendingSequence, "pendingSequence")) {
/* 113 */       this._pendingSequence = argPendingSequence;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getCreateDate() {
/* 118 */     return (Date)this._createDate;
/*     */   }
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/* 122 */     if (changed(argCreateDate, this._createDate, "createDate")) {
/* 123 */       this._createDate = (argCreateDate == null || argCreateDate instanceof DtvDate) ? (DtvDate)argCreateDate : new DtvDate(argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/* 129 */     return this._createUserId;
/*     */   }
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/* 133 */     if (changed(argCreateUserId, this._createUserId, "createUserId")) {
/* 134 */       this._createUserId = argCreateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getUpdateDate() {
/* 139 */     return (Date)this._updateDate;
/*     */   }
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/* 143 */     if (changed(argUpdateDate, this._updateDate, "updateDate")) {
/* 144 */       this._updateDate = (argUpdateDate == null || argUpdateDate instanceof DtvDate) ? (DtvDate)argUpdateDate : new DtvDate(argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/* 150 */     return this._updateUserId;
/*     */   }
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/* 154 */     if (changed(argUpdateUserId, this._updateUserId, "updateUserId")) {
/* 155 */       this._updateUserId = argUpdateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getSerialNumber() {
/* 160 */     return this._serialNumber;
/*     */   }
/*     */   
/*     */   public void setSerialNumber(String argSerialNumber) {
/* 164 */     if (changed(argSerialNumber, this._serialNumber, "serialNumber")) {
/* 165 */       this._serialNumber = argSerialNumber;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getItemId() {
/* 170 */     return this._itemId;
/*     */   }
/*     */   
/*     */   public void setItemId(String argItemId) {
/* 174 */     if (changed(argItemId, this._itemId, "itemId")) {
/* 175 */       this._itemId = argItemId;
/*     */     }
/*     */   }
/*     */   
/*     */   public BigDecimal getQuantity() {
/* 180 */     return this._quantity;
/*     */   }
/*     */   
/*     */   public void setQuantity(BigDecimal argQuantity) {
/* 184 */     if (changed(argQuantity, this._quantity, "quantity")) {
/* 185 */       this._quantity = argQuantity;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getSourceLocationId() {
/* 190 */     return this._sourceLocationId;
/*     */   }
/*     */   
/*     */   public void setSourceLocationId(String argSourceLocationId) {
/* 194 */     if (changed(argSourceLocationId, this._sourceLocationId, "sourceLocationId")) {
/* 195 */       this._sourceLocationId = argSourceLocationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getSourceBucketId() {
/* 200 */     return this._sourceBucketId;
/*     */   }
/*     */   
/*     */   public void setSourceBucketId(String argSourceBucketId) {
/* 204 */     if (changed(argSourceBucketId, this._sourceBucketId, "sourceBucketId")) {
/* 205 */       this._sourceBucketId = argSourceBucketId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getDestinationLocationId() {
/* 210 */     return this._destinationLocationId;
/*     */   }
/*     */   
/*     */   public void setDestinationLocationId(String argDestinationLocationId) {
/* 214 */     if (changed(argDestinationLocationId, this._destinationLocationId, "destinationLocationId")) {
/* 215 */       this._destinationLocationId = argDestinationLocationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getDestinationBucketId() {
/* 220 */     return this._destinationBucketId;
/*     */   }
/*     */   
/*     */   public void setDestinationBucketId(String argDestinationBucketId) {
/* 224 */     if (changed(argDestinationBucketId, this._destinationBucketId, "destinationBucketId")) {
/* 225 */       this._destinationBucketId = argDestinationBucketId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getActionCode() {
/* 230 */     return this._actionCode;
/*     */   }
/*     */   
/*     */   public void setActionCode(String argActionCode) {
/* 234 */     if (changed(argActionCode, this._actionCode, "actionCode")) {
/* 235 */       this._actionCode = argActionCode;
/*     */     }
/*     */   }
/*     */   
/*     */   public Boolean getVoid() {
/* 240 */     return this._void;
/*     */   }
/*     */   
/*     */   public void setVoid(Boolean argVoid) {
/* 244 */     if (changed(argVoid, this._void, "void")) {
/* 245 */       this._void = argVoid;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 252 */     StringBuilder buf = new StringBuilder(512);
/* 253 */     buf.append(super.toString()).append(" Id: ").append(getObjectId()).append(" Values: ");
/* 254 */     if (getOrganizationId() != null) {
/* 255 */       buf.append("organizationId").append("=").append(getOrganizationId()).append(" ");
/*     */     }
/* 257 */     if (getRetailLocationId() != null) {
/* 258 */       buf.append("retailLocationId").append("=").append(getRetailLocationId()).append(" ");
/*     */     }
/* 260 */     if (getBusinessDate() != null) {
/* 261 */       buf.append("businessDate").append("=").append(getBusinessDate()).append(" ");
/*     */     }
/* 263 */     if (getWorkstationId() != null) {
/* 264 */       buf.append("workstationId").append("=").append(getWorkstationId()).append(" ");
/*     */     }
/* 266 */     if (getTransactionSequence() != null) {
/* 267 */       buf.append("transactionSequence").append("=").append(getTransactionSequence()).append(" ");
/*     */     }
/* 269 */     if (getLineItemSequence() != null) {
/* 270 */       buf.append("lineItemSequence").append("=").append(getLineItemSequence()).append(" ");
/*     */     }
/* 272 */     if (getPendingSequence() != null) {
/* 273 */       buf.append("pendingSequence").append("=").append(getPendingSequence()).append(" ");
/*     */     }
/* 275 */     if (getCreateDate() != null) {
/* 276 */       buf.append("createDate").append("=").append(getCreateDate()).append(" ");
/*     */     }
/* 278 */     if (getCreateUserId() != null) {
/* 279 */       buf.append("createUserId").append("=").append(getCreateUserId()).append(" ");
/*     */     }
/* 281 */     if (getUpdateDate() != null) {
/* 282 */       buf.append("updateDate").append("=").append(getUpdateDate()).append(" ");
/*     */     }
/* 284 */     if (getUpdateUserId() != null) {
/* 285 */       buf.append("updateUserId").append("=").append(getUpdateUserId()).append(" ");
/*     */     }
/* 287 */     if (getSerialNumber() != null) {
/* 288 */       buf.append("serialNumber").append("=").append(getSerialNumber()).append(" ");
/*     */     }
/* 290 */     if (getItemId() != null) {
/* 291 */       buf.append("itemId").append("=").append(getItemId()).append(" ");
/*     */     }
/* 293 */     if (getQuantity() != null) {
/* 294 */       buf.append("quantity").append("=").append(getQuantity()).append(" ");
/*     */     }
/* 296 */     if (getSourceLocationId() != null) {
/* 297 */       buf.append("sourceLocationId").append("=").append(getSourceLocationId()).append(" ");
/*     */     }
/* 299 */     if (getSourceBucketId() != null) {
/* 300 */       buf.append("sourceBucketId").append("=").append(getSourceBucketId()).append(" ");
/*     */     }
/* 302 */     if (getDestinationLocationId() != null) {
/* 303 */       buf.append("destinationLocationId").append("=").append(getDestinationLocationId()).append(" ");
/*     */     }
/* 305 */     if (getDestinationBucketId() != null) {
/* 306 */       buf.append("destinationBucketId").append("=").append(getDestinationBucketId()).append(" ");
/*     */     }
/* 308 */     if (getActionCode() != null) {
/* 309 */       buf.append("actionCode").append("=").append(getActionCode()).append(" ");
/*     */     }
/* 311 */     if (getVoid() != null && getVoid().booleanValue()) {
/* 312 */       buf.append("void").append("=").append(getVoid()).append(" ");
/*     */     }
/*     */     
/* 315 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public IObjectId getObjectId() {
/* 319 */     InventoryMovementPendingDetailId id = new InventoryMovementPendingDetailId();
/* 320 */     id.setOrganizationId(getOrganizationId());
/* 321 */     id.setRetailLocationId(getRetailLocationId());
/* 322 */     id.setBusinessDate(getBusinessDate());
/* 323 */     id.setWorkstationId(getWorkstationId());
/* 324 */     id.setTransactionSequence(getTransactionSequence());
/* 325 */     id.setLineItemSequence(getLineItemSequence());
/* 326 */     id.setPendingSequence(getPendingSequence());
/* 327 */     return (IObjectId)id;
/*     */   }
/*     */   
/*     */   public void setObjectId(IObjectId argObjectId) {
/* 331 */     setOrganizationId(((InventoryMovementPendingDetailId)argObjectId).getOrganizationId());
/* 332 */     setRetailLocationId(((InventoryMovementPendingDetailId)argObjectId).getRetailLocationId());
/* 333 */     setBusinessDate(((InventoryMovementPendingDetailId)argObjectId).getBusinessDate());
/* 334 */     setWorkstationId(((InventoryMovementPendingDetailId)argObjectId).getWorkstationId());
/* 335 */     setTransactionSequence(((InventoryMovementPendingDetailId)argObjectId).getTransactionSequence());
/* 336 */     setLineItemSequence(((InventoryMovementPendingDetailId)argObjectId).getLineItemSequence());
/* 337 */     setPendingSequence(((InventoryMovementPendingDetailId)argObjectId).getPendingSequence());
/*     */   }
/*     */   
/*     */   public String getImplementingClass() {
/* 341 */     return null;
/*     */   }
/*     */   
/*     */   public String toXmlString() {
/* 345 */     StringBuilder buf = new StringBuilder(1000);
/* 346 */     buf.append("<").append("dao").append(" name=\"InventoryMovementPendingDetail\" cmd=\"" + getObjectStateString() + "\">");
/* 347 */     getFieldsAsXml(buf);
/* 348 */     buf.append("</").append("dao").append(">");
/*     */     
/* 350 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public Map<String, String> getValues() {
/* 354 */     Map<String, String> values = super.getValues();
/* 355 */     if (this._organizationId != null) values.put("OrganizationId", DaoUtils.getXmlSafeFieldValue(-5, this._organizationId)); 
/* 356 */     if (this._retailLocationId != null) values.put("RetailLocationId", DaoUtils.getXmlSafeFieldValue(-5, this._retailLocationId)); 
/* 357 */     if (this._businessDate != null) values.put("BusinessDate", DaoUtils.getXmlSafeFieldValue(91, this._businessDate)); 
/* 358 */     if (this._workstationId != null) values.put("WorkstationId", DaoUtils.getXmlSafeFieldValue(-5, this._workstationId)); 
/* 359 */     if (this._transactionSequence != null) values.put("TransactionSequence", DaoUtils.getXmlSafeFieldValue(-5, this._transactionSequence)); 
/* 360 */     if (this._lineItemSequence != null) values.put("LineItemSequence", DaoUtils.getXmlSafeFieldValue(-5, this._lineItemSequence)); 
/* 361 */     if (this._pendingSequence != null) values.put("PendingSequence", DaoUtils.getXmlSafeFieldValue(-5, this._pendingSequence)); 
/* 362 */     if (this._createDate != null) values.put("CreateDate", DaoUtils.getXmlSafeFieldValue(91, this._createDate)); 
/* 363 */     if (this._createUserId != null) values.put("CreateUserId", DaoUtils.getXmlSafeFieldValue(12, this._createUserId)); 
/* 364 */     if (this._updateDate != null) values.put("UpdateDate", DaoUtils.getXmlSafeFieldValue(91, this._updateDate)); 
/* 365 */     if (this._updateUserId != null) values.put("UpdateUserId", DaoUtils.getXmlSafeFieldValue(12, this._updateUserId)); 
/* 366 */     if (this._serialNumber != null) values.put("SerialNumber", DaoUtils.getXmlSafeFieldValue(12, this._serialNumber)); 
/* 367 */     if (this._itemId != null) values.put("ItemId", DaoUtils.getXmlSafeFieldValue(12, this._itemId)); 
/* 368 */     if (this._quantity != null) values.put("Quantity", DaoUtils.getXmlSafeFieldValue(3, this._quantity)); 
/* 369 */     if (this._sourceLocationId != null) values.put("SourceLocationId", DaoUtils.getXmlSafeFieldValue(12, this._sourceLocationId)); 
/* 370 */     if (this._sourceBucketId != null) values.put("SourceBucketId", DaoUtils.getXmlSafeFieldValue(12, this._sourceBucketId)); 
/* 371 */     if (this._destinationLocationId != null) values.put("DestinationLocationId", DaoUtils.getXmlSafeFieldValue(12, this._destinationLocationId)); 
/* 372 */     if (this._destinationBucketId != null) values.put("DestinationBucketId", DaoUtils.getXmlSafeFieldValue(12, this._destinationBucketId)); 
/* 373 */     if (this._actionCode != null) values.put("ActionCode", DaoUtils.getXmlSafeFieldValue(12, this._actionCode)); 
/* 374 */     if (this._void != null) values.put("Void", DaoUtils.getXmlSafeFieldValue(-7, this._void)); 
/* 375 */     return values;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setValues(Map<String, String> argValues) {
/* 380 */     super.setValues(argValues);
/* 381 */     for (Map.Entry<String, String> field : argValues.entrySet()) {
/*     */       
/* 383 */       String fieldName = field.getKey();
/* 384 */       String fieldValue = field.getValue();
/* 385 */       switch (fieldName) {
/*     */         
/*     */         case "OrganizationId":
/*     */           try {
/* 389 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 390 */             setOrganizationId((Long)value);
/* 391 */           } catch (Exception ee) {
/* 392 */             throw new DtxException("An exception occurred while calling setOrganizationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "RetailLocationId":
/*     */           try {
/* 398 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 399 */             setRetailLocationId((Long)value);
/* 400 */           } catch (Exception ee) {
/* 401 */             throw new DtxException("An exception occurred while calling setRetailLocationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "BusinessDate":
/*     */           try {
/* 407 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 408 */             setBusinessDate((Date)value);
/* 409 */           } catch (Exception ee) {
/* 410 */             throw new DtxException("An exception occurred while calling setBusinessDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "WorkstationId":
/*     */           try {
/* 416 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 417 */             setWorkstationId((Long)value);
/* 418 */           } catch (Exception ee) {
/* 419 */             throw new DtxException("An exception occurred while calling setWorkstationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "TransactionSequence":
/*     */           try {
/* 425 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 426 */             setTransactionSequence((Long)value);
/* 427 */           } catch (Exception ee) {
/* 428 */             throw new DtxException("An exception occurred while calling setTransactionSequence() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "LineItemSequence":
/*     */           try {
/* 434 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 435 */             setLineItemSequence((Long)value);
/* 436 */           } catch (Exception ee) {
/* 437 */             throw new DtxException("An exception occurred while calling setLineItemSequence() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "PendingSequence":
/*     */           try {
/* 443 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 444 */             setPendingSequence((Long)value);
/* 445 */           } catch (Exception ee) {
/* 446 */             throw new DtxException("An exception occurred while calling setPendingSequence() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateDate":
/*     */           try {
/* 452 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 453 */             setCreateDate((Date)value);
/* 454 */           } catch (Exception ee) {
/* 455 */             throw new DtxException("An exception occurred while calling setCreateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateUserId":
/*     */           try {
/* 461 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 462 */             setCreateUserId((String)value);
/* 463 */           } catch (Exception ee) {
/* 464 */             throw new DtxException("An exception occurred while calling setCreateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateDate":
/*     */           try {
/* 470 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 471 */             setUpdateDate((Date)value);
/* 472 */           } catch (Exception ee) {
/* 473 */             throw new DtxException("An exception occurred while calling setUpdateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateUserId":
/*     */           try {
/* 479 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 480 */             setUpdateUserId((String)value);
/* 481 */           } catch (Exception ee) {
/* 482 */             throw new DtxException("An exception occurred while calling setUpdateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "SerialNumber":
/*     */           try {
/* 488 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 489 */             setSerialNumber((String)value);
/* 490 */           } catch (Exception ee) {
/* 491 */             throw new DtxException("An exception occurred while calling setSerialNumber() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "ItemId":
/*     */           try {
/* 497 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 498 */             setItemId((String)value);
/* 499 */           } catch (Exception ee) {
/* 500 */             throw new DtxException("An exception occurred while calling setItemId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "Quantity":
/*     */           try {
/* 506 */             Object value = DaoUtils.getFieldValueForXmlString(3, fieldValue);
/* 507 */             setQuantity((BigDecimal)value);
/* 508 */           } catch (Exception ee) {
/* 509 */             throw new DtxException("An exception occurred while calling setQuantity() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "SourceLocationId":
/*     */           try {
/* 515 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 516 */             setSourceLocationId((String)value);
/* 517 */           } catch (Exception ee) {
/* 518 */             throw new DtxException("An exception occurred while calling setSourceLocationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "SourceBucketId":
/*     */           try {
/* 524 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 525 */             setSourceBucketId((String)value);
/* 526 */           } catch (Exception ee) {
/* 527 */             throw new DtxException("An exception occurred while calling setSourceBucketId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "DestinationLocationId":
/*     */           try {
/* 533 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 534 */             setDestinationLocationId((String)value);
/* 535 */           } catch (Exception ee) {
/* 536 */             throw new DtxException("An exception occurred while calling setDestinationLocationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "DestinationBucketId":
/*     */           try {
/* 542 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 543 */             setDestinationBucketId((String)value);
/* 544 */           } catch (Exception ee) {
/* 545 */             throw new DtxException("An exception occurred while calling setDestinationBucketId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "ActionCode":
/*     */           try {
/* 551 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 552 */             setActionCode((String)value);
/* 553 */           } catch (Exception ee) {
/* 554 */             throw new DtxException("An exception occurred while calling setActionCode() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "Void":
/*     */           try {
/* 560 */             Object value = DaoUtils.getFieldValueForXmlString(-7, fieldValue);
/* 561 */             setVoid((Boolean)value);
/* 562 */           } catch (Exception ee) {
/* 563 */             throw new DtxException("An exception occurred while calling setVoid() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\inv\impl\InventoryMovementPendingDetailDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */