/*     */ package dtv.xst.dao.itm.impl;
/*     */ 
/*     */ import dtv.data2.access.DaoUtils;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.exception.DtxException;
/*     */ import dtv.data2.access.impl.AbstractDAOImpl;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.xst.dao.itm.ItemMessagePropertyId;
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
/*     */ public class ItemMessagePropertyDAO
/*     */   extends AbstractDAOImpl
/*     */ {
/*     */   private static final long serialVersionUID = 1322608457L;
/*  23 */   private static final Logger _logger = Logger.getLogger(ItemMessagePropertyDAO.class);
/*     */   
/*     */   private String _messageId;
/*     */   private Long _organizationId;
/*     */   private DtvDate _effectiveDate;
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
/*     */   public String getMessageId() {
/*  39 */     return this._messageId;
/*     */   }
/*     */   
/*     */   public void setMessageId(String argMessageId) {
/*  43 */     if (changed(argMessageId, this._messageId, "messageId")) {
/*  44 */       this._messageId = (argMessageId != null && MANAGE_CASE) ? argMessageId.toUpperCase() : argMessageId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getOrganizationId() {
/*  49 */     return this._organizationId;
/*     */   }
/*     */   
/*     */   public void setOrganizationId(Long argOrganizationId) {
/*  53 */     if (changed(argOrganizationId, this._organizationId, "organizationId")) {
/*  54 */       this._organizationId = argOrganizationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getEffectiveDate() {
/*  59 */     return (Date)this._effectiveDate;
/*     */   }
/*     */   
/*     */   public void setEffectiveDate(Date argEffectiveDate) {
/*  63 */     if (changed(argEffectiveDate, this._effectiveDate, "effectiveDate")) {
/*  64 */       this._effectiveDate = (argEffectiveDate == null || argEffectiveDate instanceof DtvDate) ? (DtvDate)argEffectiveDate : new DtvDate(argEffectiveDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPropertyCode() {
/*  70 */     return this._propertyCode;
/*     */   }
/*     */   
/*     */   public void setPropertyCode(String argPropertyCode) {
/*  74 */     if (changed(argPropertyCode, this._propertyCode, "propertyCode")) {
/*  75 */       this._propertyCode = (argPropertyCode != null && MANAGE_CASE) ? argPropertyCode.toUpperCase() : argPropertyCode;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getType() {
/*  80 */     return this._type;
/*     */   }
/*     */   
/*     */   public void setType(String argType) {
/*  84 */     if (changed(argType, this._type, "type")) {
/*  85 */       this._type = argType;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getStringValue() {
/*  90 */     return this._stringValue;
/*     */   }
/*     */   
/*     */   public void setStringValue(String argStringValue) {
/*  94 */     if (changed(argStringValue, this._stringValue, "stringValue")) {
/*  95 */       this._stringValue = argStringValue;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getDateValue() {
/* 100 */     return (Date)this._dateValue;
/*     */   }
/*     */   
/*     */   public void setDateValue(Date argDateValue) {
/* 104 */     if (changed(argDateValue, this._dateValue, "dateValue")) {
/* 105 */       this._dateValue = (argDateValue == null || argDateValue instanceof DtvDate) ? (DtvDate)argDateValue : new DtvDate(argDateValue);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public BigDecimal getDecimalValue() {
/* 111 */     return this._decimalValue;
/*     */   }
/*     */   
/*     */   public void setDecimalValue(BigDecimal argDecimalValue) {
/* 115 */     if (changed(argDecimalValue, this._decimalValue, "decimalValue")) {
/* 116 */       this._decimalValue = argDecimalValue;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getCreateDate() {
/* 121 */     return (Date)this._createDate;
/*     */   }
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/* 125 */     if (changed(argCreateDate, this._createDate, "createDate")) {
/* 126 */       this._createDate = (argCreateDate == null || argCreateDate instanceof DtvDate) ? (DtvDate)argCreateDate : new DtvDate(argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/* 132 */     return this._createUserId;
/*     */   }
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/* 136 */     if (changed(argCreateUserId, this._createUserId, "createUserId")) {
/* 137 */       this._createUserId = argCreateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getUpdateDate() {
/* 142 */     return (Date)this._updateDate;
/*     */   }
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/* 146 */     if (changed(argUpdateDate, this._updateDate, "updateDate")) {
/* 147 */       this._updateDate = (argUpdateDate == null || argUpdateDate instanceof DtvDate) ? (DtvDate)argUpdateDate : new DtvDate(argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/* 153 */     return this._updateUserId;
/*     */   }
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/* 157 */     if (changed(argUpdateUserId, this._updateUserId, "updateUserId")) {
/* 158 */       this._updateUserId = argUpdateUserId;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 165 */     StringBuilder buf = new StringBuilder(512);
/* 166 */     buf.append(super.toString()).append(" Id: ").append(getObjectId()).append(" Values: ");
/* 167 */     if (getMessageId() != null) {
/* 168 */       buf.append("messageId").append("=").append(getMessageId()).append(" ");
/*     */     }
/* 170 */     if (getOrganizationId() != null) {
/* 171 */       buf.append("organizationId").append("=").append(getOrganizationId()).append(" ");
/*     */     }
/* 173 */     if (getEffectiveDate() != null) {
/* 174 */       buf.append("effectiveDate").append("=").append(getEffectiveDate()).append(" ");
/*     */     }
/* 176 */     if (getPropertyCode() != null) {
/* 177 */       buf.append("propertyCode").append("=").append(getPropertyCode()).append(" ");
/*     */     }
/* 179 */     if (getType() != null) {
/* 180 */       buf.append("type").append("=").append(getType()).append(" ");
/*     */     }
/* 182 */     if (getStringValue() != null) {
/* 183 */       buf.append("stringValue").append("=").append(getStringValue()).append(" ");
/*     */     }
/* 185 */     if (getDateValue() != null) {
/* 186 */       buf.append("dateValue").append("=").append(getDateValue()).append(" ");
/*     */     }
/* 188 */     if (getDecimalValue() != null) {
/* 189 */       buf.append("decimalValue").append("=").append(getDecimalValue()).append(" ");
/*     */     }
/* 191 */     if (getCreateDate() != null) {
/* 192 */       buf.append("createDate").append("=").append(getCreateDate()).append(" ");
/*     */     }
/* 194 */     if (getCreateUserId() != null) {
/* 195 */       buf.append("createUserId").append("=").append(getCreateUserId()).append(" ");
/*     */     }
/* 197 */     if (getUpdateDate() != null) {
/* 198 */       buf.append("updateDate").append("=").append(getUpdateDate()).append(" ");
/*     */     }
/* 200 */     if (getUpdateUserId() != null) {
/* 201 */       buf.append("updateUserId").append("=").append(getUpdateUserId()).append(" ");
/*     */     }
/*     */     
/* 204 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public IObjectId getObjectId() {
/* 208 */     ItemMessagePropertyId id = new ItemMessagePropertyId();
/* 209 */     id.setMessageId(getMessageId());
/* 210 */     id.setOrganizationId(getOrganizationId());
/* 211 */     id.setEffectiveDate(getEffectiveDate());
/* 212 */     id.setPropertyCode(getPropertyCode());
/* 213 */     return (IObjectId)id;
/*     */   }
/*     */   
/*     */   public void setObjectId(IObjectId argObjectId) {
/* 217 */     setMessageId(((ItemMessagePropertyId)argObjectId).getMessageId());
/* 218 */     setOrganizationId(((ItemMessagePropertyId)argObjectId).getOrganizationId());
/* 219 */     setEffectiveDate(((ItemMessagePropertyId)argObjectId).getEffectiveDate());
/* 220 */     setPropertyCode(((ItemMessagePropertyId)argObjectId).getPropertyCode());
/*     */   }
/*     */   
/*     */   public String getImplementingClass() {
/* 224 */     return null;
/*     */   }
/*     */   
/*     */   public String toXmlString() {
/* 228 */     StringBuilder buf = new StringBuilder(600);
/* 229 */     buf.append("<").append("dao").append(" name=\"ItemMessageProperty\" cmd=\"" + getObjectStateString() + "\">");
/* 230 */     getFieldsAsXml(buf);
/* 231 */     buf.append("</").append("dao").append(">");
/*     */     
/* 233 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public Map<String, String> getValues() {
/* 237 */     Map<String, String> values = super.getValues();
/* 238 */     if (this._messageId != null) values.put("MessageId", DaoUtils.getXmlSafeFieldValue(12, this._messageId)); 
/* 239 */     if (this._organizationId != null) values.put("OrganizationId", DaoUtils.getXmlSafeFieldValue(-5, this._organizationId)); 
/* 240 */     if (this._effectiveDate != null) values.put("EffectiveDate", DaoUtils.getXmlSafeFieldValue(91, this._effectiveDate)); 
/* 241 */     if (this._propertyCode != null) values.put("PropertyCode", DaoUtils.getXmlSafeFieldValue(12, this._propertyCode)); 
/* 242 */     if (this._type != null) values.put("Type", DaoUtils.getXmlSafeFieldValue(12, this._type)); 
/* 243 */     if (this._stringValue != null) values.put("StringValue", DaoUtils.getXmlSafeFieldValue(12, this._stringValue)); 
/* 244 */     if (this._dateValue != null) values.put("DateValue", DaoUtils.getXmlSafeFieldValue(91, this._dateValue)); 
/* 245 */     if (this._decimalValue != null) values.put("DecimalValue", DaoUtils.getXmlSafeFieldValue(3, this._decimalValue)); 
/* 246 */     if (this._createDate != null) values.put("CreateDate", DaoUtils.getXmlSafeFieldValue(91, this._createDate)); 
/* 247 */     if (this._createUserId != null) values.put("CreateUserId", DaoUtils.getXmlSafeFieldValue(12, this._createUserId)); 
/* 248 */     if (this._updateDate != null) values.put("UpdateDate", DaoUtils.getXmlSafeFieldValue(91, this._updateDate)); 
/* 249 */     if (this._updateUserId != null) values.put("UpdateUserId", DaoUtils.getXmlSafeFieldValue(12, this._updateUserId)); 
/* 250 */     return values;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setValues(Map<String, String> argValues) {
/* 255 */     super.setValues(argValues);
/* 256 */     for (Map.Entry<String, String> field : argValues.entrySet()) {
/*     */       
/* 258 */       String fieldName = field.getKey();
/* 259 */       String fieldValue = field.getValue();
/* 260 */       switch (fieldName) {
/*     */         
/*     */         case "MessageId":
/*     */           try {
/* 264 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 265 */             setMessageId((String)value);
/* 266 */           } catch (Exception ee) {
/* 267 */             throw new DtxException("An exception occurred while calling setMessageId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "OrganizationId":
/*     */           try {
/* 273 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 274 */             setOrganizationId((Long)value);
/* 275 */           } catch (Exception ee) {
/* 276 */             throw new DtxException("An exception occurred while calling setOrganizationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "EffectiveDate":
/*     */           try {
/* 282 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 283 */             setEffectiveDate((Date)value);
/* 284 */           } catch (Exception ee) {
/* 285 */             throw new DtxException("An exception occurred while calling setEffectiveDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "PropertyCode":
/*     */           try {
/* 291 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 292 */             setPropertyCode((String)value);
/* 293 */           } catch (Exception ee) {
/* 294 */             throw new DtxException("An exception occurred while calling setPropertyCode() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "Type":
/*     */           try {
/* 300 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 301 */             setType((String)value);
/* 302 */           } catch (Exception ee) {
/* 303 */             throw new DtxException("An exception occurred while calling setType() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "StringValue":
/*     */           try {
/* 309 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 310 */             setStringValue((String)value);
/* 311 */           } catch (Exception ee) {
/* 312 */             throw new DtxException("An exception occurred while calling setStringValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "DateValue":
/*     */           try {
/* 318 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 319 */             setDateValue((Date)value);
/* 320 */           } catch (Exception ee) {
/* 321 */             throw new DtxException("An exception occurred while calling setDateValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "DecimalValue":
/*     */           try {
/* 327 */             Object value = DaoUtils.getFieldValueForXmlString(3, fieldValue);
/* 328 */             setDecimalValue((BigDecimal)value);
/* 329 */           } catch (Exception ee) {
/* 330 */             throw new DtxException("An exception occurred while calling setDecimalValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateDate":
/*     */           try {
/* 336 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 337 */             setCreateDate((Date)value);
/* 338 */           } catch (Exception ee) {
/* 339 */             throw new DtxException("An exception occurred while calling setCreateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateUserId":
/*     */           try {
/* 345 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 346 */             setCreateUserId((String)value);
/* 347 */           } catch (Exception ee) {
/* 348 */             throw new DtxException("An exception occurred while calling setCreateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateDate":
/*     */           try {
/* 354 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 355 */             setUpdateDate((Date)value);
/* 356 */           } catch (Exception ee) {
/* 357 */             throw new DtxException("An exception occurred while calling setUpdateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateUserId":
/*     */           try {
/* 363 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 364 */             setUpdateUserId((String)value);
/* 365 */           } catch (Exception ee) {
/* 366 */             throw new DtxException("An exception occurred while calling setUpdateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\itm\impl\ItemMessagePropertyDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */