/*     */ package dtv.xst.dao.thr.impl;
/*     */ 
/*     */ import dtv.data2.access.DaoUtils;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.exception.DtxException;
/*     */ import dtv.data2.access.impl.AbstractDAOImpl;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.xst.dao.thr.TimecardJournalPropertyId;
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
/*     */ public class TimecardJournalPropertyDAO
/*     */   extends AbstractDAOImpl
/*     */ {
/*     */   private static final long serialVersionUID = -1994885905L;
/*  23 */   private static final Logger _logger = Logger.getLogger(TimecardJournalPropertyDAO.class);
/*     */   
/*     */   private Long _organizationId;
/*     */   private DtvDate _businessDate;
/*     */   private Long _retailLocationId;
/*     */   private Long _partyId;
/*     */   private Long _timecardEntryId;
/*     */   private Long _workstationId;
/*     */   private Long _timecardEntrySeq;
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
/*  43 */     return this._organizationId;
/*     */   }
/*     */   
/*     */   public void setOrganizationId(Long argOrganizationId) {
/*  47 */     if (changed(argOrganizationId, this._organizationId, "organizationId")) {
/*  48 */       this._organizationId = argOrganizationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getBusinessDate() {
/*  53 */     return (Date)this._businessDate;
/*     */   }
/*     */   
/*     */   public void setBusinessDate(Date argBusinessDate) {
/*  57 */     if (changed(argBusinessDate, this._businessDate, "businessDate")) {
/*  58 */       this._businessDate = (argBusinessDate == null || argBusinessDate instanceof DtvDate) ? (DtvDate)argBusinessDate : new DtvDate(argBusinessDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public Long getRetailLocationId() {
/*  64 */     return this._retailLocationId;
/*     */   }
/*     */   
/*     */   public void setRetailLocationId(Long argRetailLocationId) {
/*  68 */     if (changed(argRetailLocationId, this._retailLocationId, "retailLocationId")) {
/*  69 */       this._retailLocationId = argRetailLocationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getPartyId() {
/*  74 */     return this._partyId;
/*     */   }
/*     */   
/*     */   public void setPartyId(Long argPartyId) {
/*  78 */     if (changed(argPartyId, this._partyId, "partyId")) {
/*  79 */       this._partyId = argPartyId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getTimecardEntryId() {
/*  84 */     return this._timecardEntryId;
/*     */   }
/*     */   
/*     */   public void setTimecardEntryId(Long argTimecardEntryId) {
/*  88 */     if (changed(argTimecardEntryId, this._timecardEntryId, "timecardEntryId")) {
/*  89 */       this._timecardEntryId = argTimecardEntryId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getWorkstationId() {
/*  94 */     return this._workstationId;
/*     */   }
/*     */   
/*     */   public void setWorkstationId(Long argWorkstationId) {
/*  98 */     if (changed(argWorkstationId, this._workstationId, "workstationId")) {
/*  99 */       this._workstationId = argWorkstationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getTimecardEntrySeq() {
/* 104 */     return this._timecardEntrySeq;
/*     */   }
/*     */   
/*     */   public void setTimecardEntrySeq(Long argTimecardEntrySeq) {
/* 108 */     if (changed(argTimecardEntrySeq, this._timecardEntrySeq, "timecardEntrySeq")) {
/* 109 */       this._timecardEntrySeq = argTimecardEntrySeq;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getPropertyCode() {
/* 114 */     return this._propertyCode;
/*     */   }
/*     */   
/*     */   public void setPropertyCode(String argPropertyCode) {
/* 118 */     if (changed(argPropertyCode, this._propertyCode, "propertyCode")) {
/* 119 */       this._propertyCode = (argPropertyCode != null && MANAGE_CASE) ? argPropertyCode.toUpperCase() : argPropertyCode;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getType() {
/* 124 */     return this._type;
/*     */   }
/*     */   
/*     */   public void setType(String argType) {
/* 128 */     if (changed(argType, this._type, "type")) {
/* 129 */       this._type = argType;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getStringValue() {
/* 134 */     return this._stringValue;
/*     */   }
/*     */   
/*     */   public void setStringValue(String argStringValue) {
/* 138 */     if (changed(argStringValue, this._stringValue, "stringValue")) {
/* 139 */       this._stringValue = argStringValue;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getDateValue() {
/* 144 */     return (Date)this._dateValue;
/*     */   }
/*     */   
/*     */   public void setDateValue(Date argDateValue) {
/* 148 */     if (changed(argDateValue, this._dateValue, "dateValue")) {
/* 149 */       this._dateValue = (argDateValue == null || argDateValue instanceof DtvDate) ? (DtvDate)argDateValue : new DtvDate(argDateValue);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public BigDecimal getDecimalValue() {
/* 155 */     return this._decimalValue;
/*     */   }
/*     */   
/*     */   public void setDecimalValue(BigDecimal argDecimalValue) {
/* 159 */     if (changed(argDecimalValue, this._decimalValue, "decimalValue")) {
/* 160 */       this._decimalValue = argDecimalValue;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getCreateDate() {
/* 165 */     return (Date)this._createDate;
/*     */   }
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/* 169 */     if (changed(argCreateDate, this._createDate, "createDate")) {
/* 170 */       this._createDate = (argCreateDate == null || argCreateDate instanceof DtvDate) ? (DtvDate)argCreateDate : new DtvDate(argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/* 176 */     return this._createUserId;
/*     */   }
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/* 180 */     if (changed(argCreateUserId, this._createUserId, "createUserId")) {
/* 181 */       this._createUserId = argCreateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getUpdateDate() {
/* 186 */     return (Date)this._updateDate;
/*     */   }
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/* 190 */     if (changed(argUpdateDate, this._updateDate, "updateDate")) {
/* 191 */       this._updateDate = (argUpdateDate == null || argUpdateDate instanceof DtvDate) ? (DtvDate)argUpdateDate : new DtvDate(argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/* 197 */     return this._updateUserId;
/*     */   }
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/* 201 */     if (changed(argUpdateUserId, this._updateUserId, "updateUserId")) {
/* 202 */       this._updateUserId = argUpdateUserId;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 209 */     StringBuilder buf = new StringBuilder(512);
/* 210 */     buf.append(super.toString()).append(" Id: ").append(getObjectId()).append(" Values: ");
/* 211 */     if (getOrganizationId() != null) {
/* 212 */       buf.append("organizationId").append("=").append(getOrganizationId()).append(" ");
/*     */     }
/* 214 */     if (getBusinessDate() != null) {
/* 215 */       buf.append("businessDate").append("=").append(getBusinessDate()).append(" ");
/*     */     }
/* 217 */     if (getRetailLocationId() != null) {
/* 218 */       buf.append("retailLocationId").append("=").append(getRetailLocationId()).append(" ");
/*     */     }
/* 220 */     if (getPartyId() != null) {
/* 221 */       buf.append("partyId").append("=").append(getPartyId()).append(" ");
/*     */     }
/* 223 */     if (getTimecardEntryId() != null) {
/* 224 */       buf.append("timecardEntryId").append("=").append(getTimecardEntryId()).append(" ");
/*     */     }
/* 226 */     if (getWorkstationId() != null) {
/* 227 */       buf.append("workstationId").append("=").append(getWorkstationId()).append(" ");
/*     */     }
/* 229 */     if (getTimecardEntrySeq() != null) {
/* 230 */       buf.append("timecardEntrySeq").append("=").append(getTimecardEntrySeq()).append(" ");
/*     */     }
/* 232 */     if (getPropertyCode() != null) {
/* 233 */       buf.append("propertyCode").append("=").append(getPropertyCode()).append(" ");
/*     */     }
/* 235 */     if (getType() != null) {
/* 236 */       buf.append("type").append("=").append(getType()).append(" ");
/*     */     }
/* 238 */     if (getStringValue() != null) {
/* 239 */       buf.append("stringValue").append("=").append(getStringValue()).append(" ");
/*     */     }
/* 241 */     if (getDateValue() != null) {
/* 242 */       buf.append("dateValue").append("=").append(getDateValue()).append(" ");
/*     */     }
/* 244 */     if (getDecimalValue() != null) {
/* 245 */       buf.append("decimalValue").append("=").append(getDecimalValue()).append(" ");
/*     */     }
/* 247 */     if (getCreateDate() != null) {
/* 248 */       buf.append("createDate").append("=").append(getCreateDate()).append(" ");
/*     */     }
/* 250 */     if (getCreateUserId() != null) {
/* 251 */       buf.append("createUserId").append("=").append(getCreateUserId()).append(" ");
/*     */     }
/* 253 */     if (getUpdateDate() != null) {
/* 254 */       buf.append("updateDate").append("=").append(getUpdateDate()).append(" ");
/*     */     }
/* 256 */     if (getUpdateUserId() != null) {
/* 257 */       buf.append("updateUserId").append("=").append(getUpdateUserId()).append(" ");
/*     */     }
/*     */     
/* 260 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public IObjectId getObjectId() {
/* 264 */     TimecardJournalPropertyId id = new TimecardJournalPropertyId();
/* 265 */     id.setOrganizationId(getOrganizationId());
/* 266 */     id.setBusinessDate(getBusinessDate());
/* 267 */     id.setRetailLocationId(getRetailLocationId());
/* 268 */     id.setPartyId(getPartyId());
/* 269 */     id.setTimecardEntryId(getTimecardEntryId());
/* 270 */     id.setWorkstationId(getWorkstationId());
/* 271 */     id.setTimecardEntrySeq(getTimecardEntrySeq());
/* 272 */     id.setPropertyCode(getPropertyCode());
/* 273 */     return (IObjectId)id;
/*     */   }
/*     */   
/*     */   public void setObjectId(IObjectId argObjectId) {
/* 277 */     setOrganizationId(((TimecardJournalPropertyId)argObjectId).getOrganizationId());
/* 278 */     setBusinessDate(((TimecardJournalPropertyId)argObjectId).getBusinessDate());
/* 279 */     setRetailLocationId(((TimecardJournalPropertyId)argObjectId).getRetailLocationId());
/* 280 */     setPartyId(((TimecardJournalPropertyId)argObjectId).getPartyId());
/* 281 */     setTimecardEntryId(((TimecardJournalPropertyId)argObjectId).getTimecardEntryId());
/* 282 */     setWorkstationId(((TimecardJournalPropertyId)argObjectId).getWorkstationId());
/* 283 */     setTimecardEntrySeq(((TimecardJournalPropertyId)argObjectId).getTimecardEntrySeq());
/* 284 */     setPropertyCode(((TimecardJournalPropertyId)argObjectId).getPropertyCode());
/*     */   }
/*     */   
/*     */   public String getImplementingClass() {
/* 288 */     return null;
/*     */   }
/*     */   
/*     */   public String toXmlString() {
/* 292 */     StringBuilder buf = new StringBuilder(800);
/* 293 */     buf.append("<").append("dao").append(" name=\"TimecardJournalProperty\" cmd=\"" + getObjectStateString() + "\">");
/* 294 */     getFieldsAsXml(buf);
/* 295 */     buf.append("</").append("dao").append(">");
/*     */     
/* 297 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public Map<String, String> getValues() {
/* 301 */     Map<String, String> values = super.getValues();
/* 302 */     if (this._organizationId != null) values.put("OrganizationId", DaoUtils.getXmlSafeFieldValue(-5, this._organizationId)); 
/* 303 */     if (this._businessDate != null) values.put("BusinessDate", DaoUtils.getXmlSafeFieldValue(91, this._businessDate)); 
/* 304 */     if (this._retailLocationId != null) values.put("RetailLocationId", DaoUtils.getXmlSafeFieldValue(-5, this._retailLocationId)); 
/* 305 */     if (this._partyId != null) values.put("PartyId", DaoUtils.getXmlSafeFieldValue(-5, this._partyId)); 
/* 306 */     if (this._timecardEntryId != null) values.put("TimecardEntryId", DaoUtils.getXmlSafeFieldValue(-5, this._timecardEntryId)); 
/* 307 */     if (this._workstationId != null) values.put("WorkstationId", DaoUtils.getXmlSafeFieldValue(-5, this._workstationId)); 
/* 308 */     if (this._timecardEntrySeq != null) values.put("TimecardEntrySeq", DaoUtils.getXmlSafeFieldValue(-5, this._timecardEntrySeq)); 
/* 309 */     if (this._propertyCode != null) values.put("PropertyCode", DaoUtils.getXmlSafeFieldValue(12, this._propertyCode)); 
/* 310 */     if (this._type != null) values.put("Type", DaoUtils.getXmlSafeFieldValue(12, this._type)); 
/* 311 */     if (this._stringValue != null) values.put("StringValue", DaoUtils.getXmlSafeFieldValue(12, this._stringValue)); 
/* 312 */     if (this._dateValue != null) values.put("DateValue", DaoUtils.getXmlSafeFieldValue(91, this._dateValue)); 
/* 313 */     if (this._decimalValue != null) values.put("DecimalValue", DaoUtils.getXmlSafeFieldValue(3, this._decimalValue)); 
/* 314 */     if (this._createDate != null) values.put("CreateDate", DaoUtils.getXmlSafeFieldValue(91, this._createDate)); 
/* 315 */     if (this._createUserId != null) values.put("CreateUserId", DaoUtils.getXmlSafeFieldValue(12, this._createUserId)); 
/* 316 */     if (this._updateDate != null) values.put("UpdateDate", DaoUtils.getXmlSafeFieldValue(91, this._updateDate)); 
/* 317 */     if (this._updateUserId != null) values.put("UpdateUserId", DaoUtils.getXmlSafeFieldValue(12, this._updateUserId)); 
/* 318 */     return values;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setValues(Map<String, String> argValues) {
/* 323 */     super.setValues(argValues);
/* 324 */     for (Map.Entry<String, String> field : argValues.entrySet()) {
/*     */       
/* 326 */       String fieldName = field.getKey();
/* 327 */       String fieldValue = field.getValue();
/* 328 */       switch (fieldName) {
/*     */         
/*     */         case "OrganizationId":
/*     */           try {
/* 332 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 333 */             setOrganizationId((Long)value);
/* 334 */           } catch (Exception ee) {
/* 335 */             throw new DtxException("An exception occurred while calling setOrganizationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "BusinessDate":
/*     */           try {
/* 341 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 342 */             setBusinessDate((Date)value);
/* 343 */           } catch (Exception ee) {
/* 344 */             throw new DtxException("An exception occurred while calling setBusinessDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "RetailLocationId":
/*     */           try {
/* 350 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 351 */             setRetailLocationId((Long)value);
/* 352 */           } catch (Exception ee) {
/* 353 */             throw new DtxException("An exception occurred while calling setRetailLocationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "PartyId":
/*     */           try {
/* 359 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 360 */             setPartyId((Long)value);
/* 361 */           } catch (Exception ee) {
/* 362 */             throw new DtxException("An exception occurred while calling setPartyId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "TimecardEntryId":
/*     */           try {
/* 368 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 369 */             setTimecardEntryId((Long)value);
/* 370 */           } catch (Exception ee) {
/* 371 */             throw new DtxException("An exception occurred while calling setTimecardEntryId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "WorkstationId":
/*     */           try {
/* 377 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 378 */             setWorkstationId((Long)value);
/* 379 */           } catch (Exception ee) {
/* 380 */             throw new DtxException("An exception occurred while calling setWorkstationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "TimecardEntrySeq":
/*     */           try {
/* 386 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 387 */             setTimecardEntrySeq((Long)value);
/* 388 */           } catch (Exception ee) {
/* 389 */             throw new DtxException("An exception occurred while calling setTimecardEntrySeq() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "PropertyCode":
/*     */           try {
/* 395 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 396 */             setPropertyCode((String)value);
/* 397 */           } catch (Exception ee) {
/* 398 */             throw new DtxException("An exception occurred while calling setPropertyCode() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "Type":
/*     */           try {
/* 404 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 405 */             setType((String)value);
/* 406 */           } catch (Exception ee) {
/* 407 */             throw new DtxException("An exception occurred while calling setType() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "StringValue":
/*     */           try {
/* 413 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 414 */             setStringValue((String)value);
/* 415 */           } catch (Exception ee) {
/* 416 */             throw new DtxException("An exception occurred while calling setStringValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "DateValue":
/*     */           try {
/* 422 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 423 */             setDateValue((Date)value);
/* 424 */           } catch (Exception ee) {
/* 425 */             throw new DtxException("An exception occurred while calling setDateValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "DecimalValue":
/*     */           try {
/* 431 */             Object value = DaoUtils.getFieldValueForXmlString(3, fieldValue);
/* 432 */             setDecimalValue((BigDecimal)value);
/* 433 */           } catch (Exception ee) {
/* 434 */             throw new DtxException("An exception occurred while calling setDecimalValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateDate":
/*     */           try {
/* 440 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 441 */             setCreateDate((Date)value);
/* 442 */           } catch (Exception ee) {
/* 443 */             throw new DtxException("An exception occurred while calling setCreateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateUserId":
/*     */           try {
/* 449 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 450 */             setCreateUserId((String)value);
/* 451 */           } catch (Exception ee) {
/* 452 */             throw new DtxException("An exception occurred while calling setCreateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateDate":
/*     */           try {
/* 458 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 459 */             setUpdateDate((Date)value);
/* 460 */           } catch (Exception ee) {
/* 461 */             throw new DtxException("An exception occurred while calling setUpdateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateUserId":
/*     */           try {
/* 467 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 468 */             setUpdateUserId((String)value);
/* 469 */           } catch (Exception ee) {
/* 470 */             throw new DtxException("An exception occurred while calling setUpdateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\thr\impl\TimecardJournalPropertyDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */