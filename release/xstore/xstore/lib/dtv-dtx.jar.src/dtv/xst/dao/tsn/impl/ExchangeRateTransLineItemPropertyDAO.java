/*     */ package dtv.xst.dao.tsn.impl;
/*     */ 
/*     */ import dtv.data2.access.DaoUtils;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.exception.DtxException;
/*     */ import dtv.data2.access.impl.AbstractDAOImpl;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.xst.dao.tsn.ExchangeRateTransLineItemPropertyId;
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
/*     */ public class ExchangeRateTransLineItemPropertyDAO
/*     */   extends AbstractDAOImpl
/*     */ {
/*     */   private static final long serialVersionUID = 1691669729L;
/*  23 */   private static final Logger _logger = Logger.getLogger(ExchangeRateTransLineItemPropertyDAO.class);
/*     */   
/*     */   private Long _organizationId;
/*     */   private Long _retailLocationId;
/*     */   private DtvDate _businessDate;
/*     */   private Long _workstationId;
/*     */   private Long _transactionSequence;
/*     */   private Integer _lineItemSequence;
/*     */   private String _propertyCode;
/*     */   private String _type;
/*     */   private String _stringValue;
/*     */   private DtvDate _dateValue;
/*     */   private BigDecimal _decimalValue;
/*     */   private DtvDate _createDate;
/*     */   private String _createUserId;
/*     */   private DtvDate _updateDate;
/*     */   private String _updateUserId;
/*     */   
/*     */   public Long getOrganizationId() {
/*  42 */     return this._organizationId;
/*     */   }
/*     */   
/*     */   public void setOrganizationId(Long argOrganizationId) {
/*  46 */     if (changed(argOrganizationId, this._organizationId, "organizationId")) {
/*  47 */       this._organizationId = argOrganizationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getRetailLocationId() {
/*  52 */     return this._retailLocationId;
/*     */   }
/*     */   
/*     */   public void setRetailLocationId(Long argRetailLocationId) {
/*  56 */     if (changed(argRetailLocationId, this._retailLocationId, "retailLocationId")) {
/*  57 */       this._retailLocationId = argRetailLocationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getBusinessDate() {
/*  62 */     return (Date)this._businessDate;
/*     */   }
/*     */   
/*     */   public void setBusinessDate(Date argBusinessDate) {
/*  66 */     if (changed(argBusinessDate, this._businessDate, "businessDate")) {
/*  67 */       this._businessDate = (argBusinessDate == null || argBusinessDate instanceof DtvDate) ? (DtvDate)argBusinessDate : new DtvDate(argBusinessDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public Long getWorkstationId() {
/*  73 */     return this._workstationId;
/*     */   }
/*     */   
/*     */   public void setWorkstationId(Long argWorkstationId) {
/*  77 */     if (changed(argWorkstationId, this._workstationId, "workstationId")) {
/*  78 */       this._workstationId = argWorkstationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getTransactionSequence() {
/*  83 */     return this._transactionSequence;
/*     */   }
/*     */   
/*     */   public void setTransactionSequence(Long argTransactionSequence) {
/*  87 */     if (changed(argTransactionSequence, this._transactionSequence, "transactionSequence")) {
/*  88 */       this._transactionSequence = argTransactionSequence;
/*     */     }
/*     */   }
/*     */   
/*     */   public Integer getLineItemSequence() {
/*  93 */     return this._lineItemSequence;
/*     */   }
/*     */   
/*     */   public void setLineItemSequence(Integer argLineItemSequence) {
/*  97 */     if (changed(argLineItemSequence, this._lineItemSequence, "lineItemSequence")) {
/*  98 */       this._lineItemSequence = argLineItemSequence;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getPropertyCode() {
/* 103 */     return this._propertyCode;
/*     */   }
/*     */   
/*     */   public void setPropertyCode(String argPropertyCode) {
/* 107 */     if (changed(argPropertyCode, this._propertyCode, "propertyCode")) {
/* 108 */       this._propertyCode = (argPropertyCode != null && MANAGE_CASE) ? argPropertyCode.toUpperCase() : argPropertyCode;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getType() {
/* 113 */     return this._type;
/*     */   }
/*     */   
/*     */   public void setType(String argType) {
/* 117 */     if (changed(argType, this._type, "type")) {
/* 118 */       this._type = argType;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getStringValue() {
/* 123 */     return this._stringValue;
/*     */   }
/*     */   
/*     */   public void setStringValue(String argStringValue) {
/* 127 */     if (changed(argStringValue, this._stringValue, "stringValue")) {
/* 128 */       this._stringValue = argStringValue;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getDateValue() {
/* 133 */     return (Date)this._dateValue;
/*     */   }
/*     */   
/*     */   public void setDateValue(Date argDateValue) {
/* 137 */     if (changed(argDateValue, this._dateValue, "dateValue")) {
/* 138 */       this._dateValue = (argDateValue == null || argDateValue instanceof DtvDate) ? (DtvDate)argDateValue : new DtvDate(argDateValue);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public BigDecimal getDecimalValue() {
/* 144 */     return this._decimalValue;
/*     */   }
/*     */   
/*     */   public void setDecimalValue(BigDecimal argDecimalValue) {
/* 148 */     if (changed(argDecimalValue, this._decimalValue, "decimalValue")) {
/* 149 */       this._decimalValue = argDecimalValue;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getCreateDate() {
/* 154 */     return (Date)this._createDate;
/*     */   }
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/* 158 */     if (changed(argCreateDate, this._createDate, "createDate")) {
/* 159 */       this._createDate = (argCreateDate == null || argCreateDate instanceof DtvDate) ? (DtvDate)argCreateDate : new DtvDate(argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/* 165 */     return this._createUserId;
/*     */   }
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/* 169 */     if (changed(argCreateUserId, this._createUserId, "createUserId")) {
/* 170 */       this._createUserId = argCreateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getUpdateDate() {
/* 175 */     return (Date)this._updateDate;
/*     */   }
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/* 179 */     if (changed(argUpdateDate, this._updateDate, "updateDate")) {
/* 180 */       this._updateDate = (argUpdateDate == null || argUpdateDate instanceof DtvDate) ? (DtvDate)argUpdateDate : new DtvDate(argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/* 186 */     return this._updateUserId;
/*     */   }
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/* 190 */     if (changed(argUpdateUserId, this._updateUserId, "updateUserId")) {
/* 191 */       this._updateUserId = argUpdateUserId;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 198 */     StringBuilder buf = new StringBuilder(512);
/* 199 */     buf.append(super.toString()).append(" Id: ").append(getObjectId()).append(" Values: ");
/* 200 */     if (getOrganizationId() != null) {
/* 201 */       buf.append("organizationId").append("=").append(getOrganizationId()).append(" ");
/*     */     }
/* 203 */     if (getRetailLocationId() != null) {
/* 204 */       buf.append("retailLocationId").append("=").append(getRetailLocationId()).append(" ");
/*     */     }
/* 206 */     if (getBusinessDate() != null) {
/* 207 */       buf.append("businessDate").append("=").append(getBusinessDate()).append(" ");
/*     */     }
/* 209 */     if (getWorkstationId() != null) {
/* 210 */       buf.append("workstationId").append("=").append(getWorkstationId()).append(" ");
/*     */     }
/* 212 */     if (getTransactionSequence() != null) {
/* 213 */       buf.append("transactionSequence").append("=").append(getTransactionSequence()).append(" ");
/*     */     }
/* 215 */     if (getLineItemSequence() != null) {
/* 216 */       buf.append("lineItemSequence").append("=").append(getLineItemSequence()).append(" ");
/*     */     }
/* 218 */     if (getPropertyCode() != null) {
/* 219 */       buf.append("propertyCode").append("=").append(getPropertyCode()).append(" ");
/*     */     }
/* 221 */     if (getType() != null) {
/* 222 */       buf.append("type").append("=").append(getType()).append(" ");
/*     */     }
/* 224 */     if (getStringValue() != null) {
/* 225 */       buf.append("stringValue").append("=").append(getStringValue()).append(" ");
/*     */     }
/* 227 */     if (getDateValue() != null) {
/* 228 */       buf.append("dateValue").append("=").append(getDateValue()).append(" ");
/*     */     }
/* 230 */     if (getDecimalValue() != null) {
/* 231 */       buf.append("decimalValue").append("=").append(getDecimalValue()).append(" ");
/*     */     }
/* 233 */     if (getCreateDate() != null) {
/* 234 */       buf.append("createDate").append("=").append(getCreateDate()).append(" ");
/*     */     }
/* 236 */     if (getCreateUserId() != null) {
/* 237 */       buf.append("createUserId").append("=").append(getCreateUserId()).append(" ");
/*     */     }
/* 239 */     if (getUpdateDate() != null) {
/* 240 */       buf.append("updateDate").append("=").append(getUpdateDate()).append(" ");
/*     */     }
/* 242 */     if (getUpdateUserId() != null) {
/* 243 */       buf.append("updateUserId").append("=").append(getUpdateUserId()).append(" ");
/*     */     }
/*     */     
/* 246 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public IObjectId getObjectId() {
/* 250 */     ExchangeRateTransLineItemPropertyId id = new ExchangeRateTransLineItemPropertyId();
/* 251 */     id.setOrganizationId(getOrganizationId());
/* 252 */     id.setRetailLocationId(getRetailLocationId());
/* 253 */     id.setBusinessDate(getBusinessDate());
/* 254 */     id.setWorkstationId(getWorkstationId());
/* 255 */     id.setTransactionSequence(getTransactionSequence());
/* 256 */     id.setLineItemSequence(getLineItemSequence());
/* 257 */     id.setPropertyCode(getPropertyCode());
/* 258 */     return (IObjectId)id;
/*     */   }
/*     */   
/*     */   public void setObjectId(IObjectId argObjectId) {
/* 262 */     setOrganizationId(((ExchangeRateTransLineItemPropertyId)argObjectId).getOrganizationId());
/* 263 */     setRetailLocationId(((ExchangeRateTransLineItemPropertyId)argObjectId).getRetailLocationId());
/* 264 */     setBusinessDate(((ExchangeRateTransLineItemPropertyId)argObjectId).getBusinessDate());
/* 265 */     setWorkstationId(((ExchangeRateTransLineItemPropertyId)argObjectId).getWorkstationId());
/* 266 */     setTransactionSequence(((ExchangeRateTransLineItemPropertyId)argObjectId).getTransactionSequence());
/* 267 */     setLineItemSequence(((ExchangeRateTransLineItemPropertyId)argObjectId).getLineItemSequence());
/* 268 */     setPropertyCode(((ExchangeRateTransLineItemPropertyId)argObjectId).getPropertyCode());
/*     */   }
/*     */   
/*     */   public String getImplementingClass() {
/* 272 */     return null;
/*     */   }
/*     */   
/*     */   public String toXmlString() {
/* 276 */     StringBuilder buf = new StringBuilder(750);
/* 277 */     buf.append("<").append("dao").append(" name=\"ExchangeRateTransLineItemProperty\" cmd=\"" + getObjectStateString() + "\">");
/* 278 */     getFieldsAsXml(buf);
/* 279 */     buf.append("</").append("dao").append(">");
/*     */     
/* 281 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public Map<String, String> getValues() {
/* 285 */     Map<String, String> values = super.getValues();
/* 286 */     if (this._organizationId != null) values.put("OrganizationId", DaoUtils.getXmlSafeFieldValue(-5, this._organizationId)); 
/* 287 */     if (this._retailLocationId != null) values.put("RetailLocationId", DaoUtils.getXmlSafeFieldValue(-5, this._retailLocationId)); 
/* 288 */     if (this._businessDate != null) values.put("BusinessDate", DaoUtils.getXmlSafeFieldValue(91, this._businessDate)); 
/* 289 */     if (this._workstationId != null) values.put("WorkstationId", DaoUtils.getXmlSafeFieldValue(-5, this._workstationId)); 
/* 290 */     if (this._transactionSequence != null) values.put("TransactionSequence", DaoUtils.getXmlSafeFieldValue(-5, this._transactionSequence)); 
/* 291 */     if (this._lineItemSequence != null) values.put("LineItemSequence", DaoUtils.getXmlSafeFieldValue(4, this._lineItemSequence)); 
/* 292 */     if (this._propertyCode != null) values.put("PropertyCode", DaoUtils.getXmlSafeFieldValue(12, this._propertyCode)); 
/* 293 */     if (this._type != null) values.put("Type", DaoUtils.getXmlSafeFieldValue(12, this._type)); 
/* 294 */     if (this._stringValue != null) values.put("StringValue", DaoUtils.getXmlSafeFieldValue(12, this._stringValue)); 
/* 295 */     if (this._dateValue != null) values.put("DateValue", DaoUtils.getXmlSafeFieldValue(91, this._dateValue)); 
/* 296 */     if (this._decimalValue != null) values.put("DecimalValue", DaoUtils.getXmlSafeFieldValue(3, this._decimalValue)); 
/* 297 */     if (this._createDate != null) values.put("CreateDate", DaoUtils.getXmlSafeFieldValue(91, this._createDate)); 
/* 298 */     if (this._createUserId != null) values.put("CreateUserId", DaoUtils.getXmlSafeFieldValue(12, this._createUserId)); 
/* 299 */     if (this._updateDate != null) values.put("UpdateDate", DaoUtils.getXmlSafeFieldValue(91, this._updateDate)); 
/* 300 */     if (this._updateUserId != null) values.put("UpdateUserId", DaoUtils.getXmlSafeFieldValue(12, this._updateUserId)); 
/* 301 */     return values;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setValues(Map<String, String> argValues) {
/* 306 */     super.setValues(argValues);
/* 307 */     for (Map.Entry<String, String> field : argValues.entrySet()) {
/*     */       
/* 309 */       String fieldName = field.getKey();
/* 310 */       String fieldValue = field.getValue();
/* 311 */       switch (fieldName) {
/*     */         
/*     */         case "OrganizationId":
/*     */           try {
/* 315 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 316 */             setOrganizationId((Long)value);
/* 317 */           } catch (Exception ee) {
/* 318 */             throw new DtxException("An exception occurred while calling setOrganizationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "RetailLocationId":
/*     */           try {
/* 324 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 325 */             setRetailLocationId((Long)value);
/* 326 */           } catch (Exception ee) {
/* 327 */             throw new DtxException("An exception occurred while calling setRetailLocationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "BusinessDate":
/*     */           try {
/* 333 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 334 */             setBusinessDate((Date)value);
/* 335 */           } catch (Exception ee) {
/* 336 */             throw new DtxException("An exception occurred while calling setBusinessDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "WorkstationId":
/*     */           try {
/* 342 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 343 */             setWorkstationId((Long)value);
/* 344 */           } catch (Exception ee) {
/* 345 */             throw new DtxException("An exception occurred while calling setWorkstationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "TransactionSequence":
/*     */           try {
/* 351 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 352 */             setTransactionSequence((Long)value);
/* 353 */           } catch (Exception ee) {
/* 354 */             throw new DtxException("An exception occurred while calling setTransactionSequence() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "LineItemSequence":
/*     */           try {
/* 360 */             Object value = DaoUtils.getFieldValueForXmlString(4, fieldValue);
/* 361 */             setLineItemSequence((Integer)value);
/* 362 */           } catch (Exception ee) {
/* 363 */             throw new DtxException("An exception occurred while calling setLineItemSequence() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "PropertyCode":
/*     */           try {
/* 369 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 370 */             setPropertyCode((String)value);
/* 371 */           } catch (Exception ee) {
/* 372 */             throw new DtxException("An exception occurred while calling setPropertyCode() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "Type":
/*     */           try {
/* 378 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 379 */             setType((String)value);
/* 380 */           } catch (Exception ee) {
/* 381 */             throw new DtxException("An exception occurred while calling setType() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "StringValue":
/*     */           try {
/* 387 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 388 */             setStringValue((String)value);
/* 389 */           } catch (Exception ee) {
/* 390 */             throw new DtxException("An exception occurred while calling setStringValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "DateValue":
/*     */           try {
/* 396 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 397 */             setDateValue((Date)value);
/* 398 */           } catch (Exception ee) {
/* 399 */             throw new DtxException("An exception occurred while calling setDateValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "DecimalValue":
/*     */           try {
/* 405 */             Object value = DaoUtils.getFieldValueForXmlString(3, fieldValue);
/* 406 */             setDecimalValue((BigDecimal)value);
/* 407 */           } catch (Exception ee) {
/* 408 */             throw new DtxException("An exception occurred while calling setDecimalValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateDate":
/*     */           try {
/* 414 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 415 */             setCreateDate((Date)value);
/* 416 */           } catch (Exception ee) {
/* 417 */             throw new DtxException("An exception occurred while calling setCreateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateUserId":
/*     */           try {
/* 423 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 424 */             setCreateUserId((String)value);
/* 425 */           } catch (Exception ee) {
/* 426 */             throw new DtxException("An exception occurred while calling setCreateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateDate":
/*     */           try {
/* 432 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 433 */             setUpdateDate((Date)value);
/* 434 */           } catch (Exception ee) {
/* 435 */             throw new DtxException("An exception occurred while calling setUpdateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateUserId":
/*     */           try {
/* 441 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 442 */             setUpdateUserId((String)value);
/* 443 */           } catch (Exception ee) {
/* 444 */             throw new DtxException("An exception occurred while calling setUpdateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\tsn\impl\ExchangeRateTransLineItemPropertyDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */