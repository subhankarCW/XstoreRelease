/*     */ package dtv.xst.dao.tax.impl;
/*     */ 
/*     */ import dtv.data2.access.DaoUtils;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.exception.DtxException;
/*     */ import dtv.data2.access.impl.AbstractDAOImpl;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.xst.dao.tax.TaxLocationId;
/*     */ import java.util.Date;
/*     */ import java.util.Map;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TaxLocationDAO
/*     */   extends AbstractDAOImpl
/*     */ {
/*     */   private static final long serialVersionUID = 1612484704L;
/*  23 */   private static final Logger _logger = Logger.getLogger(TaxLocationDAO.class);
/*     */   
/*     */   private Long _organizationId;
/*     */   private String _taxLocationId;
/*     */   private DtvDate _createDate;
/*     */   private String _createUserId;
/*     */   private DtvDate _updateDate;
/*     */   private String _updateUserId;
/*     */   private String _orgCode;
/*     */   private String _orgValue;
/*     */   private String _description;
/*     */   private String _name;
/*     */   private String _externalSystem;
/*     */   
/*     */   public Long getOrganizationId() {
/*  38 */     return this._organizationId;
/*     */   }
/*     */   
/*     */   public void setOrganizationId(Long argOrganizationId) {
/*  42 */     if (changed(argOrganizationId, this._organizationId, "organizationId")) {
/*  43 */       this._organizationId = argOrganizationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getTaxLocationId() {
/*  48 */     return this._taxLocationId;
/*     */   }
/*     */   
/*     */   public void setTaxLocationId(String argTaxLocationId) {
/*  52 */     if (changed(argTaxLocationId, this._taxLocationId, "taxLocationId")) {
/*  53 */       this._taxLocationId = (argTaxLocationId != null && MANAGE_CASE) ? argTaxLocationId.toUpperCase() : argTaxLocationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getCreateDate() {
/*  58 */     return (Date)this._createDate;
/*     */   }
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/*  62 */     if (changed(argCreateDate, this._createDate, "createDate")) {
/*  63 */       this._createDate = (argCreateDate == null || argCreateDate instanceof DtvDate) ? (DtvDate)argCreateDate : new DtvDate(argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/*  69 */     return this._createUserId;
/*     */   }
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/*  73 */     if (changed(argCreateUserId, this._createUserId, "createUserId")) {
/*  74 */       this._createUserId = argCreateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getUpdateDate() {
/*  79 */     return (Date)this._updateDate;
/*     */   }
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/*  83 */     if (changed(argUpdateDate, this._updateDate, "updateDate")) {
/*  84 */       this._updateDate = (argUpdateDate == null || argUpdateDate instanceof DtvDate) ? (DtvDate)argUpdateDate : new DtvDate(argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/*  90 */     return this._updateUserId;
/*     */   }
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/*  94 */     if (changed(argUpdateUserId, this._updateUserId, "updateUserId")) {
/*  95 */       this._updateUserId = argUpdateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getOrgCode() {
/* 100 */     return this._orgCode;
/*     */   }
/*     */   
/*     */   public void setOrgCode(String argOrgCode) {
/* 104 */     if (changed(argOrgCode, this._orgCode, "orgCode")) {
/* 105 */       this._orgCode = argOrgCode;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getOrgValue() {
/* 110 */     return this._orgValue;
/*     */   }
/*     */   
/*     */   public void setOrgValue(String argOrgValue) {
/* 114 */     if (changed(argOrgValue, this._orgValue, "orgValue")) {
/* 115 */       this._orgValue = argOrgValue;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getDescription() {
/* 120 */     return this._description;
/*     */   }
/*     */   
/*     */   public void setDescription(String argDescription) {
/* 124 */     if (changed(argDescription, this._description, "description")) {
/* 125 */       this._description = argDescription;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getName() {
/* 130 */     return this._name;
/*     */   }
/*     */   
/*     */   public void setName(String argName) {
/* 134 */     if (changed(argName, this._name, "name")) {
/* 135 */       this._name = argName;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getExternalSystem() {
/* 140 */     return this._externalSystem;
/*     */   }
/*     */   
/*     */   public void setExternalSystem(String argExternalSystem) {
/* 144 */     if (changed(argExternalSystem, this._externalSystem, "externalSystem")) {
/* 145 */       this._externalSystem = argExternalSystem;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 152 */     StringBuilder buf = new StringBuilder(512);
/* 153 */     buf.append(super.toString()).append(" Id: ").append(getObjectId()).append(" Values: ");
/* 154 */     if (getOrganizationId() != null) {
/* 155 */       buf.append("organizationId").append("=").append(getOrganizationId()).append(" ");
/*     */     }
/* 157 */     if (getTaxLocationId() != null) {
/* 158 */       buf.append("taxLocationId").append("=").append(getTaxLocationId()).append(" ");
/*     */     }
/* 160 */     if (getCreateDate() != null) {
/* 161 */       buf.append("createDate").append("=").append(getCreateDate()).append(" ");
/*     */     }
/* 163 */     if (getCreateUserId() != null) {
/* 164 */       buf.append("createUserId").append("=").append(getCreateUserId()).append(" ");
/*     */     }
/* 166 */     if (getUpdateDate() != null) {
/* 167 */       buf.append("updateDate").append("=").append(getUpdateDate()).append(" ");
/*     */     }
/* 169 */     if (getUpdateUserId() != null) {
/* 170 */       buf.append("updateUserId").append("=").append(getUpdateUserId()).append(" ");
/*     */     }
/* 172 */     if (getOrgCode() != null) {
/* 173 */       buf.append("orgCode").append("=").append(getOrgCode()).append(" ");
/*     */     }
/* 175 */     if (getOrgValue() != null) {
/* 176 */       buf.append("orgValue").append("=").append(getOrgValue()).append(" ");
/*     */     }
/* 178 */     if (getDescription() != null) {
/* 179 */       buf.append("description").append("=").append(getDescription()).append(" ");
/*     */     }
/* 181 */     if (getName() != null) {
/* 182 */       buf.append("name").append("=").append(getName()).append(" ");
/*     */     }
/* 184 */     if (getExternalSystem() != null) {
/* 185 */       buf.append("externalSystem").append("=").append(getExternalSystem()).append(" ");
/*     */     }
/*     */     
/* 188 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public IObjectId getObjectId() {
/* 192 */     TaxLocationId id = new TaxLocationId();
/* 193 */     id.setOrganizationId(getOrganizationId());
/* 194 */     id.setTaxLocationId(getTaxLocationId());
/* 195 */     return (IObjectId)id;
/*     */   }
/*     */   
/*     */   public void setObjectId(IObjectId argObjectId) {
/* 199 */     setOrganizationId(((TaxLocationId)argObjectId).getOrganizationId());
/* 200 */     setTaxLocationId(((TaxLocationId)argObjectId).getTaxLocationId());
/*     */   }
/*     */   
/*     */   public String getImplementingClass() {
/* 204 */     return null;
/*     */   }
/*     */   
/*     */   public String toXmlString() {
/* 208 */     StringBuilder buf = new StringBuilder(550);
/* 209 */     buf.append("<").append("dao").append(" name=\"TaxLocation\" cmd=\"" + getObjectStateString() + "\">");
/* 210 */     getFieldsAsXml(buf);
/* 211 */     buf.append("</").append("dao").append(">");
/*     */     
/* 213 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public Map<String, String> getValues() {
/* 217 */     Map<String, String> values = super.getValues();
/* 218 */     if (this._organizationId != null) values.put("OrganizationId", DaoUtils.getXmlSafeFieldValue(-5, this._organizationId)); 
/* 219 */     if (this._taxLocationId != null) values.put("TaxLocationId", DaoUtils.getXmlSafeFieldValue(12, this._taxLocationId)); 
/* 220 */     if (this._createDate != null) values.put("CreateDate", DaoUtils.getXmlSafeFieldValue(91, this._createDate)); 
/* 221 */     if (this._createUserId != null) values.put("CreateUserId", DaoUtils.getXmlSafeFieldValue(12, this._createUserId)); 
/* 222 */     if (this._updateDate != null) values.put("UpdateDate", DaoUtils.getXmlSafeFieldValue(91, this._updateDate)); 
/* 223 */     if (this._updateUserId != null) values.put("UpdateUserId", DaoUtils.getXmlSafeFieldValue(12, this._updateUserId)); 
/* 224 */     if (this._orgCode != null) values.put("OrgCode", DaoUtils.getXmlSafeFieldValue(12, this._orgCode)); 
/* 225 */     if (this._orgValue != null) values.put("OrgValue", DaoUtils.getXmlSafeFieldValue(12, this._orgValue)); 
/* 226 */     if (this._description != null) values.put("Description", DaoUtils.getXmlSafeFieldValue(12, this._description)); 
/* 227 */     if (this._name != null) values.put("Name", DaoUtils.getXmlSafeFieldValue(12, this._name)); 
/* 228 */     if (this._externalSystem != null) values.put("ExternalSystem", DaoUtils.getXmlSafeFieldValue(12, this._externalSystem)); 
/* 229 */     return values;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setValues(Map<String, String> argValues) {
/* 234 */     super.setValues(argValues);
/* 235 */     for (Map.Entry<String, String> field : argValues.entrySet()) {
/*     */       
/* 237 */       String fieldName = field.getKey();
/* 238 */       String fieldValue = field.getValue();
/* 239 */       switch (fieldName) {
/*     */         
/*     */         case "OrganizationId":
/*     */           try {
/* 243 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 244 */             setOrganizationId((Long)value);
/* 245 */           } catch (Exception ee) {
/* 246 */             throw new DtxException("An exception occurred while calling setOrganizationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "TaxLocationId":
/*     */           try {
/* 252 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 253 */             setTaxLocationId((String)value);
/* 254 */           } catch (Exception ee) {
/* 255 */             throw new DtxException("An exception occurred while calling setTaxLocationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateDate":
/*     */           try {
/* 261 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 262 */             setCreateDate((Date)value);
/* 263 */           } catch (Exception ee) {
/* 264 */             throw new DtxException("An exception occurred while calling setCreateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateUserId":
/*     */           try {
/* 270 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 271 */             setCreateUserId((String)value);
/* 272 */           } catch (Exception ee) {
/* 273 */             throw new DtxException("An exception occurred while calling setCreateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateDate":
/*     */           try {
/* 279 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 280 */             setUpdateDate((Date)value);
/* 281 */           } catch (Exception ee) {
/* 282 */             throw new DtxException("An exception occurred while calling setUpdateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateUserId":
/*     */           try {
/* 288 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 289 */             setUpdateUserId((String)value);
/* 290 */           } catch (Exception ee) {
/* 291 */             throw new DtxException("An exception occurred while calling setUpdateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "OrgCode":
/*     */           try {
/* 297 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 298 */             setOrgCode((String)value);
/* 299 */           } catch (Exception ee) {
/* 300 */             throw new DtxException("An exception occurred while calling setOrgCode() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "OrgValue":
/*     */           try {
/* 306 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 307 */             setOrgValue((String)value);
/* 308 */           } catch (Exception ee) {
/* 309 */             throw new DtxException("An exception occurred while calling setOrgValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "Description":
/*     */           try {
/* 315 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 316 */             setDescription((String)value);
/* 317 */           } catch (Exception ee) {
/* 318 */             throw new DtxException("An exception occurred while calling setDescription() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "Name":
/*     */           try {
/* 324 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 325 */             setName((String)value);
/* 326 */           } catch (Exception ee) {
/* 327 */             throw new DtxException("An exception occurred while calling setName() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "ExternalSystem":
/*     */           try {
/* 333 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 334 */             setExternalSystem((String)value);
/* 335 */           } catch (Exception ee) {
/* 336 */             throw new DtxException("An exception occurred while calling setExternalSystem() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\tax\impl\TaxLocationDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */