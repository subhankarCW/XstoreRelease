/*     */ package dtv.xst.dao.crm.impl;
/*     */ 
/*     */ import dtv.data2.access.DaoUtils;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.exception.DtxException;
/*     */ import dtv.data2.access.impl.AbstractDAOImpl;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.xst.dao.crm.CustomerAffiliationId;
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
/*     */ public class CustomerAffiliationDAO
/*     */   extends AbstractDAOImpl
/*     */ {
/*     */   private static final long serialVersionUID = -1596359662L;
/*  23 */   private static final Logger _logger = Logger.getLogger(CustomerAffiliationDAO.class);
/*     */   
/*     */   private Long _organizationId;
/*     */   private Long _partyId;
/*     */   private String _customerGroupId;
/*     */   private DtvDate _createDate;
/*     */   private String _createUserId;
/*     */   private DtvDate _updateDate;
/*     */   private String _updateUserId;
/*     */   
/*     */   public Long getOrganizationId() {
/*  34 */     return this._organizationId;
/*     */   }
/*     */   
/*     */   public void setOrganizationId(Long argOrganizationId) {
/*  38 */     if (changed(argOrganizationId, this._organizationId, "organizationId")) {
/*  39 */       this._organizationId = argOrganizationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getPartyId() {
/*  44 */     return this._partyId;
/*     */   }
/*     */   
/*     */   public void setPartyId(Long argPartyId) {
/*  48 */     if (changed(argPartyId, this._partyId, "partyId")) {
/*  49 */       this._partyId = argPartyId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getCustomerGroupId() {
/*  54 */     return this._customerGroupId;
/*     */   }
/*     */   
/*     */   public void setCustomerGroupId(String argCustomerGroupId) {
/*  58 */     if (changed(argCustomerGroupId, this._customerGroupId, "customerGroupId")) {
/*  59 */       this._customerGroupId = (argCustomerGroupId != null && MANAGE_CASE) ? argCustomerGroupId.toUpperCase() : argCustomerGroupId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getCreateDate() {
/*  64 */     return (Date)this._createDate;
/*     */   }
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/*  68 */     if (changed(argCreateDate, this._createDate, "createDate")) {
/*  69 */       this._createDate = (argCreateDate == null || argCreateDate instanceof DtvDate) ? (DtvDate)argCreateDate : new DtvDate(argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/*  75 */     return this._createUserId;
/*     */   }
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/*  79 */     if (changed(argCreateUserId, this._createUserId, "createUserId")) {
/*  80 */       this._createUserId = argCreateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getUpdateDate() {
/*  85 */     return (Date)this._updateDate;
/*     */   }
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/*  89 */     if (changed(argUpdateDate, this._updateDate, "updateDate")) {
/*  90 */       this._updateDate = (argUpdateDate == null || argUpdateDate instanceof DtvDate) ? (DtvDate)argUpdateDate : new DtvDate(argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/*  96 */     return this._updateUserId;
/*     */   }
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/* 100 */     if (changed(argUpdateUserId, this._updateUserId, "updateUserId")) {
/* 101 */       this._updateUserId = argUpdateUserId;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 108 */     StringBuilder buf = new StringBuilder(512);
/* 109 */     buf.append(super.toString()).append(" Id: ").append(getObjectId()).append(" Values: ");
/* 110 */     if (getOrganizationId() != null) {
/* 111 */       buf.append("organizationId").append("=").append(getOrganizationId()).append(" ");
/*     */     }
/* 113 */     if (getPartyId() != null) {
/* 114 */       buf.append("partyId").append("=").append(getPartyId()).append(" ");
/*     */     }
/* 116 */     if (getCustomerGroupId() != null) {
/* 117 */       buf.append("customerGroupId").append("=").append(getCustomerGroupId()).append(" ");
/*     */     }
/* 119 */     if (getCreateDate() != null) {
/* 120 */       buf.append("createDate").append("=").append(getCreateDate()).append(" ");
/*     */     }
/* 122 */     if (getCreateUserId() != null) {
/* 123 */       buf.append("createUserId").append("=").append(getCreateUserId()).append(" ");
/*     */     }
/* 125 */     if (getUpdateDate() != null) {
/* 126 */       buf.append("updateDate").append("=").append(getUpdateDate()).append(" ");
/*     */     }
/* 128 */     if (getUpdateUserId() != null) {
/* 129 */       buf.append("updateUserId").append("=").append(getUpdateUserId()).append(" ");
/*     */     }
/*     */     
/* 132 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public IObjectId getObjectId() {
/* 136 */     CustomerAffiliationId id = new CustomerAffiliationId();
/* 137 */     id.setOrganizationId(getOrganizationId());
/* 138 */     id.setPartyId(getPartyId());
/* 139 */     id.setCustomerGroupId(getCustomerGroupId());
/* 140 */     return (IObjectId)id;
/*     */   }
/*     */   
/*     */   public void setObjectId(IObjectId argObjectId) {
/* 144 */     setOrganizationId(((CustomerAffiliationId)argObjectId).getOrganizationId());
/* 145 */     setPartyId(((CustomerAffiliationId)argObjectId).getPartyId());
/* 146 */     setCustomerGroupId(((CustomerAffiliationId)argObjectId).getCustomerGroupId());
/*     */   }
/*     */   
/*     */   public String getImplementingClass() {
/* 150 */     return null;
/*     */   }
/*     */   
/*     */   public String toXmlString() {
/* 154 */     StringBuilder buf = new StringBuilder(350);
/* 155 */     buf.append("<").append("dao").append(" name=\"CustomerAffiliation\" cmd=\"" + getObjectStateString() + "\">");
/* 156 */     getFieldsAsXml(buf);
/* 157 */     buf.append("</").append("dao").append(">");
/*     */     
/* 159 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public Map<String, String> getValues() {
/* 163 */     Map<String, String> values = super.getValues();
/* 164 */     if (this._organizationId != null) values.put("OrganizationId", DaoUtils.getXmlSafeFieldValue(-5, this._organizationId)); 
/* 165 */     if (this._partyId != null) values.put("PartyId", DaoUtils.getXmlSafeFieldValue(-5, this._partyId)); 
/* 166 */     if (this._customerGroupId != null) values.put("CustomerGroupId", DaoUtils.getXmlSafeFieldValue(12, this._customerGroupId)); 
/* 167 */     if (this._createDate != null) values.put("CreateDate", DaoUtils.getXmlSafeFieldValue(91, this._createDate)); 
/* 168 */     if (this._createUserId != null) values.put("CreateUserId", DaoUtils.getXmlSafeFieldValue(12, this._createUserId)); 
/* 169 */     if (this._updateDate != null) values.put("UpdateDate", DaoUtils.getXmlSafeFieldValue(91, this._updateDate)); 
/* 170 */     if (this._updateUserId != null) values.put("UpdateUserId", DaoUtils.getXmlSafeFieldValue(12, this._updateUserId)); 
/* 171 */     return values;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setValues(Map<String, String> argValues) {
/* 176 */     super.setValues(argValues);
/* 177 */     for (Map.Entry<String, String> field : argValues.entrySet()) {
/*     */       
/* 179 */       String fieldName = field.getKey();
/* 180 */       String fieldValue = field.getValue();
/* 181 */       switch (fieldName) {
/*     */         
/*     */         case "OrganizationId":
/*     */           try {
/* 185 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 186 */             setOrganizationId((Long)value);
/* 187 */           } catch (Exception ee) {
/* 188 */             throw new DtxException("An exception occurred while calling setOrganizationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "PartyId":
/*     */           try {
/* 194 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 195 */             setPartyId((Long)value);
/* 196 */           } catch (Exception ee) {
/* 197 */             throw new DtxException("An exception occurred while calling setPartyId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CustomerGroupId":
/*     */           try {
/* 203 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 204 */             setCustomerGroupId((String)value);
/* 205 */           } catch (Exception ee) {
/* 206 */             throw new DtxException("An exception occurred while calling setCustomerGroupId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateDate":
/*     */           try {
/* 212 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 213 */             setCreateDate((Date)value);
/* 214 */           } catch (Exception ee) {
/* 215 */             throw new DtxException("An exception occurred while calling setCreateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateUserId":
/*     */           try {
/* 221 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 222 */             setCreateUserId((String)value);
/* 223 */           } catch (Exception ee) {
/* 224 */             throw new DtxException("An exception occurred while calling setCreateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateDate":
/*     */           try {
/* 230 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 231 */             setUpdateDate((Date)value);
/* 232 */           } catch (Exception ee) {
/* 233 */             throw new DtxException("An exception occurred while calling setUpdateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateUserId":
/*     */           try {
/* 239 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 240 */             setUpdateUserId((String)value);
/* 241 */           } catch (Exception ee) {
/* 242 */             throw new DtxException("An exception occurred while calling setUpdateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\crm\impl\CustomerAffiliationDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */