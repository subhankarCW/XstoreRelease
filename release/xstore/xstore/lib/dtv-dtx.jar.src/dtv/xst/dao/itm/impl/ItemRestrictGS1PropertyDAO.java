/*     */ package dtv.xst.dao.itm.impl;
/*     */ 
/*     */ import dtv.data2.access.DaoUtils;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.exception.DtxException;
/*     */ import dtv.data2.access.impl.AbstractDAOImpl;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.xst.dao.itm.ItemRestrictGS1PropertyId;
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
/*     */ public class ItemRestrictGS1PropertyDAO
/*     */   extends AbstractDAOImpl
/*     */ {
/*     */   private static final long serialVersionUID = -1621268661L;
/*  23 */   private static final Logger _logger = Logger.getLogger(ItemRestrictGS1PropertyDAO.class);
/*     */   
/*     */   private Long _organizationId;
/*     */   private String _itemId;
/*     */   private String _fieldId;
/*     */   private String _startValue;
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
/*  40 */     return this._organizationId;
/*     */   }
/*     */   
/*     */   public void setOrganizationId(Long argOrganizationId) {
/*  44 */     if (changed(argOrganizationId, this._organizationId, "organizationId")) {
/*  45 */       this._organizationId = argOrganizationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getItemId() {
/*  50 */     return this._itemId;
/*     */   }
/*     */   
/*     */   public void setItemId(String argItemId) {
/*  54 */     if (changed(argItemId, this._itemId, "itemId")) {
/*  55 */       this._itemId = (argItemId != null && MANAGE_CASE) ? argItemId.toUpperCase() : argItemId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getFieldId() {
/*  60 */     return this._fieldId;
/*     */   }
/*     */   
/*     */   public void setFieldId(String argFieldId) {
/*  64 */     if (changed(argFieldId, this._fieldId, "fieldId")) {
/*  65 */       this._fieldId = (argFieldId != null && MANAGE_CASE) ? argFieldId.toUpperCase() : argFieldId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getStartValue() {
/*  70 */     return this._startValue;
/*     */   }
/*     */   
/*     */   public void setStartValue(String argStartValue) {
/*  74 */     if (changed(argStartValue, this._startValue, "startValue")) {
/*  75 */       this._startValue = (argStartValue != null && MANAGE_CASE) ? argStartValue.toUpperCase() : argStartValue;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getPropertyCode() {
/*  80 */     return this._propertyCode;
/*     */   }
/*     */   
/*     */   public void setPropertyCode(String argPropertyCode) {
/*  84 */     if (changed(argPropertyCode, this._propertyCode, "propertyCode")) {
/*  85 */       this._propertyCode = (argPropertyCode != null && MANAGE_CASE) ? argPropertyCode.toUpperCase() : argPropertyCode;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getType() {
/*  90 */     return this._type;
/*     */   }
/*     */   
/*     */   public void setType(String argType) {
/*  94 */     if (changed(argType, this._type, "type")) {
/*  95 */       this._type = argType;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getStringValue() {
/* 100 */     return this._stringValue;
/*     */   }
/*     */   
/*     */   public void setStringValue(String argStringValue) {
/* 104 */     if (changed(argStringValue, this._stringValue, "stringValue")) {
/* 105 */       this._stringValue = argStringValue;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getDateValue() {
/* 110 */     return (Date)this._dateValue;
/*     */   }
/*     */   
/*     */   public void setDateValue(Date argDateValue) {
/* 114 */     if (changed(argDateValue, this._dateValue, "dateValue")) {
/* 115 */       this._dateValue = (argDateValue == null || argDateValue instanceof DtvDate) ? (DtvDate)argDateValue : new DtvDate(argDateValue);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public BigDecimal getDecimalValue() {
/* 121 */     return this._decimalValue;
/*     */   }
/*     */   
/*     */   public void setDecimalValue(BigDecimal argDecimalValue) {
/* 125 */     if (changed(argDecimalValue, this._decimalValue, "decimalValue")) {
/* 126 */       this._decimalValue = argDecimalValue;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getCreateDate() {
/* 131 */     return (Date)this._createDate;
/*     */   }
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/* 135 */     if (changed(argCreateDate, this._createDate, "createDate")) {
/* 136 */       this._createDate = (argCreateDate == null || argCreateDate instanceof DtvDate) ? (DtvDate)argCreateDate : new DtvDate(argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/* 142 */     return this._createUserId;
/*     */   }
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/* 146 */     if (changed(argCreateUserId, this._createUserId, "createUserId")) {
/* 147 */       this._createUserId = argCreateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getUpdateDate() {
/* 152 */     return (Date)this._updateDate;
/*     */   }
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/* 156 */     if (changed(argUpdateDate, this._updateDate, "updateDate")) {
/* 157 */       this._updateDate = (argUpdateDate == null || argUpdateDate instanceof DtvDate) ? (DtvDate)argUpdateDate : new DtvDate(argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/* 163 */     return this._updateUserId;
/*     */   }
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/* 167 */     if (changed(argUpdateUserId, this._updateUserId, "updateUserId")) {
/* 168 */       this._updateUserId = argUpdateUserId;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 175 */     StringBuilder buf = new StringBuilder(512);
/* 176 */     buf.append(super.toString()).append(" Id: ").append(getObjectId()).append(" Values: ");
/* 177 */     if (getOrganizationId() != null) {
/* 178 */       buf.append("organizationId").append("=").append(getOrganizationId()).append(" ");
/*     */     }
/* 180 */     if (getItemId() != null) {
/* 181 */       buf.append("itemId").append("=").append(getItemId()).append(" ");
/*     */     }
/* 183 */     if (getFieldId() != null) {
/* 184 */       buf.append("fieldId").append("=").append(getFieldId()).append(" ");
/*     */     }
/* 186 */     if (getStartValue() != null) {
/* 187 */       buf.append("startValue").append("=").append(getStartValue()).append(" ");
/*     */     }
/* 189 */     if (getPropertyCode() != null) {
/* 190 */       buf.append("propertyCode").append("=").append(getPropertyCode()).append(" ");
/*     */     }
/* 192 */     if (getType() != null) {
/* 193 */       buf.append("type").append("=").append(getType()).append(" ");
/*     */     }
/* 195 */     if (getStringValue() != null) {
/* 196 */       buf.append("stringValue").append("=").append(getStringValue()).append(" ");
/*     */     }
/* 198 */     if (getDateValue() != null) {
/* 199 */       buf.append("dateValue").append("=").append(getDateValue()).append(" ");
/*     */     }
/* 201 */     if (getDecimalValue() != null) {
/* 202 */       buf.append("decimalValue").append("=").append(getDecimalValue()).append(" ");
/*     */     }
/* 204 */     if (getCreateDate() != null) {
/* 205 */       buf.append("createDate").append("=").append(getCreateDate()).append(" ");
/*     */     }
/* 207 */     if (getCreateUserId() != null) {
/* 208 */       buf.append("createUserId").append("=").append(getCreateUserId()).append(" ");
/*     */     }
/* 210 */     if (getUpdateDate() != null) {
/* 211 */       buf.append("updateDate").append("=").append(getUpdateDate()).append(" ");
/*     */     }
/* 213 */     if (getUpdateUserId() != null) {
/* 214 */       buf.append("updateUserId").append("=").append(getUpdateUserId()).append(" ");
/*     */     }
/*     */     
/* 217 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public IObjectId getObjectId() {
/* 221 */     ItemRestrictGS1PropertyId id = new ItemRestrictGS1PropertyId();
/* 222 */     id.setOrganizationId(getOrganizationId());
/* 223 */     id.setItemId(getItemId());
/* 224 */     id.setFieldId(getFieldId());
/* 225 */     id.setStartValue(getStartValue());
/* 226 */     id.setPropertyCode(getPropertyCode());
/* 227 */     return (IObjectId)id;
/*     */   }
/*     */   
/*     */   public void setObjectId(IObjectId argObjectId) {
/* 231 */     setOrganizationId(((ItemRestrictGS1PropertyId)argObjectId).getOrganizationId());
/* 232 */     setItemId(((ItemRestrictGS1PropertyId)argObjectId).getItemId());
/* 233 */     setFieldId(((ItemRestrictGS1PropertyId)argObjectId).getFieldId());
/* 234 */     setStartValue(((ItemRestrictGS1PropertyId)argObjectId).getStartValue());
/* 235 */     setPropertyCode(((ItemRestrictGS1PropertyId)argObjectId).getPropertyCode());
/*     */   }
/*     */   
/*     */   public String getImplementingClass() {
/* 239 */     return null;
/*     */   }
/*     */   
/*     */   public String toXmlString() {
/* 243 */     StringBuilder buf = new StringBuilder(650);
/* 244 */     buf.append("<").append("dao").append(" name=\"ItemRestrictGS1Property\" cmd=\"" + getObjectStateString() + "\">");
/* 245 */     getFieldsAsXml(buf);
/* 246 */     buf.append("</").append("dao").append(">");
/*     */     
/* 248 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public Map<String, String> getValues() {
/* 252 */     Map<String, String> values = super.getValues();
/* 253 */     if (this._organizationId != null) values.put("OrganizationId", DaoUtils.getXmlSafeFieldValue(-5, this._organizationId)); 
/* 254 */     if (this._itemId != null) values.put("ItemId", DaoUtils.getXmlSafeFieldValue(12, this._itemId)); 
/* 255 */     if (this._fieldId != null) values.put("FieldId", DaoUtils.getXmlSafeFieldValue(12, this._fieldId)); 
/* 256 */     if (this._startValue != null) values.put("StartValue", DaoUtils.getXmlSafeFieldValue(12, this._startValue)); 
/* 257 */     if (this._propertyCode != null) values.put("PropertyCode", DaoUtils.getXmlSafeFieldValue(12, this._propertyCode)); 
/* 258 */     if (this._type != null) values.put("Type", DaoUtils.getXmlSafeFieldValue(12, this._type)); 
/* 259 */     if (this._stringValue != null) values.put("StringValue", DaoUtils.getXmlSafeFieldValue(12, this._stringValue)); 
/* 260 */     if (this._dateValue != null) values.put("DateValue", DaoUtils.getXmlSafeFieldValue(91, this._dateValue)); 
/* 261 */     if (this._decimalValue != null) values.put("DecimalValue", DaoUtils.getXmlSafeFieldValue(3, this._decimalValue)); 
/* 262 */     if (this._createDate != null) values.put("CreateDate", DaoUtils.getXmlSafeFieldValue(91, this._createDate)); 
/* 263 */     if (this._createUserId != null) values.put("CreateUserId", DaoUtils.getXmlSafeFieldValue(12, this._createUserId)); 
/* 264 */     if (this._updateDate != null) values.put("UpdateDate", DaoUtils.getXmlSafeFieldValue(91, this._updateDate)); 
/* 265 */     if (this._updateUserId != null) values.put("UpdateUserId", DaoUtils.getXmlSafeFieldValue(12, this._updateUserId)); 
/* 266 */     return values;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setValues(Map<String, String> argValues) {
/* 271 */     super.setValues(argValues);
/* 272 */     for (Map.Entry<String, String> field : argValues.entrySet()) {
/*     */       
/* 274 */       String fieldName = field.getKey();
/* 275 */       String fieldValue = field.getValue();
/* 276 */       switch (fieldName) {
/*     */         
/*     */         case "OrganizationId":
/*     */           try {
/* 280 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 281 */             setOrganizationId((Long)value);
/* 282 */           } catch (Exception ee) {
/* 283 */             throw new DtxException("An exception occurred while calling setOrganizationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "ItemId":
/*     */           try {
/* 289 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 290 */             setItemId((String)value);
/* 291 */           } catch (Exception ee) {
/* 292 */             throw new DtxException("An exception occurred while calling setItemId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "FieldId":
/*     */           try {
/* 298 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 299 */             setFieldId((String)value);
/* 300 */           } catch (Exception ee) {
/* 301 */             throw new DtxException("An exception occurred while calling setFieldId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "StartValue":
/*     */           try {
/* 307 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 308 */             setStartValue((String)value);
/* 309 */           } catch (Exception ee) {
/* 310 */             throw new DtxException("An exception occurred while calling setStartValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "PropertyCode":
/*     */           try {
/* 316 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 317 */             setPropertyCode((String)value);
/* 318 */           } catch (Exception ee) {
/* 319 */             throw new DtxException("An exception occurred while calling setPropertyCode() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "Type":
/*     */           try {
/* 325 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 326 */             setType((String)value);
/* 327 */           } catch (Exception ee) {
/* 328 */             throw new DtxException("An exception occurred while calling setType() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "StringValue":
/*     */           try {
/* 334 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 335 */             setStringValue((String)value);
/* 336 */           } catch (Exception ee) {
/* 337 */             throw new DtxException("An exception occurred while calling setStringValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "DateValue":
/*     */           try {
/* 343 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 344 */             setDateValue((Date)value);
/* 345 */           } catch (Exception ee) {
/* 346 */             throw new DtxException("An exception occurred while calling setDateValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "DecimalValue":
/*     */           try {
/* 352 */             Object value = DaoUtils.getFieldValueForXmlString(3, fieldValue);
/* 353 */             setDecimalValue((BigDecimal)value);
/* 354 */           } catch (Exception ee) {
/* 355 */             throw new DtxException("An exception occurred while calling setDecimalValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateDate":
/*     */           try {
/* 361 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 362 */             setCreateDate((Date)value);
/* 363 */           } catch (Exception ee) {
/* 364 */             throw new DtxException("An exception occurred while calling setCreateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateUserId":
/*     */           try {
/* 370 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 371 */             setCreateUserId((String)value);
/* 372 */           } catch (Exception ee) {
/* 373 */             throw new DtxException("An exception occurred while calling setCreateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateDate":
/*     */           try {
/* 379 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 380 */             setUpdateDate((Date)value);
/* 381 */           } catch (Exception ee) {
/* 382 */             throw new DtxException("An exception occurred while calling setUpdateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateUserId":
/*     */           try {
/* 388 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 389 */             setUpdateUserId((String)value);
/* 390 */           } catch (Exception ee) {
/* 391 */             throw new DtxException("An exception occurred while calling setUpdateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\itm\impl\ItemRestrictGS1PropertyDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */