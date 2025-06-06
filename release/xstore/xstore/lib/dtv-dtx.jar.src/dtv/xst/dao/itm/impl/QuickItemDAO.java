/*     */ package dtv.xst.dao.itm.impl;
/*     */ 
/*     */ import dtv.data2.access.DaoUtils;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.exception.DtxException;
/*     */ import dtv.data2.access.impl.AbstractDAOImpl;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.xst.dao.itm.QuickItemId;
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
/*     */ public class QuickItemDAO
/*     */   extends AbstractDAOImpl
/*     */ {
/*     */   private static final long serialVersionUID = -990546304L;
/*  23 */   private static final Logger _logger = Logger.getLogger(QuickItemDAO.class);
/*     */   
/*     */   private Long _organizationId;
/*     */   private String _itemId;
/*     */   private DtvDate _createDate;
/*     */   private String _createUserId;
/*     */   private DtvDate _updateDate;
/*     */   private String _updateUserId;
/*     */   private String _orgCode;
/*     */   private String _orgValue;
/*     */   private String _parentId;
/*     */   private String _description;
/*     */   private String _imageUrl;
/*     */   private Integer _sortOrder;
/*     */   
/*     */   public Long getOrganizationId() {
/*  39 */     return this._organizationId;
/*     */   }
/*     */   
/*     */   public void setOrganizationId(Long argOrganizationId) {
/*  43 */     if (changed(argOrganizationId, this._organizationId, "organizationId")) {
/*  44 */       this._organizationId = argOrganizationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getItemId() {
/*  49 */     return this._itemId;
/*     */   }
/*     */   
/*     */   public void setItemId(String argItemId) {
/*  53 */     if (changed(argItemId, this._itemId, "itemId")) {
/*  54 */       this._itemId = (argItemId != null && MANAGE_CASE) ? argItemId.toUpperCase() : argItemId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getCreateDate() {
/*  59 */     return (Date)this._createDate;
/*     */   }
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/*  63 */     if (changed(argCreateDate, this._createDate, "createDate")) {
/*  64 */       this._createDate = (argCreateDate == null || argCreateDate instanceof DtvDate) ? (DtvDate)argCreateDate : new DtvDate(argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/*  70 */     return this._createUserId;
/*     */   }
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/*  74 */     if (changed(argCreateUserId, this._createUserId, "createUserId")) {
/*  75 */       this._createUserId = argCreateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getUpdateDate() {
/*  80 */     return (Date)this._updateDate;
/*     */   }
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/*  84 */     if (changed(argUpdateDate, this._updateDate, "updateDate")) {
/*  85 */       this._updateDate = (argUpdateDate == null || argUpdateDate instanceof DtvDate) ? (DtvDate)argUpdateDate : new DtvDate(argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/*  91 */     return this._updateUserId;
/*     */   }
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/*  95 */     if (changed(argUpdateUserId, this._updateUserId, "updateUserId")) {
/*  96 */       this._updateUserId = argUpdateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getOrgCode() {
/* 101 */     return this._orgCode;
/*     */   }
/*     */   
/*     */   public void setOrgCode(String argOrgCode) {
/* 105 */     if (changed(argOrgCode, this._orgCode, "orgCode")) {
/* 106 */       this._orgCode = argOrgCode;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getOrgValue() {
/* 111 */     return this._orgValue;
/*     */   }
/*     */   
/*     */   public void setOrgValue(String argOrgValue) {
/* 115 */     if (changed(argOrgValue, this._orgValue, "orgValue")) {
/* 116 */       this._orgValue = argOrgValue;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getParentId() {
/* 121 */     return this._parentId;
/*     */   }
/*     */   
/*     */   public void setParentId(String argParentId) {
/* 125 */     if (changed(argParentId, this._parentId, "parentId")) {
/* 126 */       this._parentId = argParentId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getDescription() {
/* 131 */     return this._description;
/*     */   }
/*     */   
/*     */   public void setDescription(String argDescription) {
/* 135 */     if (changed(argDescription, this._description, "description")) {
/* 136 */       this._description = argDescription;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getImageUrl() {
/* 141 */     return this._imageUrl;
/*     */   }
/*     */   
/*     */   public void setImageUrl(String argImageUrl) {
/* 145 */     if (changed(argImageUrl, this._imageUrl, "imageUrl")) {
/* 146 */       this._imageUrl = argImageUrl;
/*     */     }
/*     */   }
/*     */   
/*     */   public Integer getSortOrder() {
/* 151 */     return this._sortOrder;
/*     */   }
/*     */   
/*     */   public void setSortOrder(Integer argSortOrder) {
/* 155 */     if (changed(argSortOrder, this._sortOrder, "sortOrder")) {
/* 156 */       this._sortOrder = argSortOrder;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 163 */     StringBuilder buf = new StringBuilder(512);
/* 164 */     buf.append(super.toString()).append(" Id: ").append(getObjectId()).append(" Values: ");
/* 165 */     if (getOrganizationId() != null) {
/* 166 */       buf.append("organizationId").append("=").append(getOrganizationId()).append(" ");
/*     */     }
/* 168 */     if (getItemId() != null) {
/* 169 */       buf.append("itemId").append("=").append(getItemId()).append(" ");
/*     */     }
/* 171 */     if (getCreateDate() != null) {
/* 172 */       buf.append("createDate").append("=").append(getCreateDate()).append(" ");
/*     */     }
/* 174 */     if (getCreateUserId() != null) {
/* 175 */       buf.append("createUserId").append("=").append(getCreateUserId()).append(" ");
/*     */     }
/* 177 */     if (getUpdateDate() != null) {
/* 178 */       buf.append("updateDate").append("=").append(getUpdateDate()).append(" ");
/*     */     }
/* 180 */     if (getUpdateUserId() != null) {
/* 181 */       buf.append("updateUserId").append("=").append(getUpdateUserId()).append(" ");
/*     */     }
/* 183 */     if (getOrgCode() != null) {
/* 184 */       buf.append("orgCode").append("=").append(getOrgCode()).append(" ");
/*     */     }
/* 186 */     if (getOrgValue() != null) {
/* 187 */       buf.append("orgValue").append("=").append(getOrgValue()).append(" ");
/*     */     }
/* 189 */     if (getParentId() != null) {
/* 190 */       buf.append("parentId").append("=").append(getParentId()).append(" ");
/*     */     }
/* 192 */     if (getDescription() != null) {
/* 193 */       buf.append("description").append("=").append(getDescription()).append(" ");
/*     */     }
/* 195 */     if (getImageUrl() != null) {
/* 196 */       buf.append("imageUrl").append("=").append(getImageUrl()).append(" ");
/*     */     }
/* 198 */     if (getSortOrder() != null) {
/* 199 */       buf.append("sortOrder").append("=").append(getSortOrder()).append(" ");
/*     */     }
/*     */     
/* 202 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public IObjectId getObjectId() {
/* 206 */     QuickItemId id = new QuickItemId();
/* 207 */     id.setOrganizationId(getOrganizationId());
/* 208 */     id.setItemId(getItemId());
/* 209 */     return (IObjectId)id;
/*     */   }
/*     */   
/*     */   public void setObjectId(IObjectId argObjectId) {
/* 213 */     setOrganizationId(((QuickItemId)argObjectId).getOrganizationId());
/* 214 */     setItemId(((QuickItemId)argObjectId).getItemId());
/*     */   }
/*     */   
/*     */   public String getImplementingClass() {
/* 218 */     return null;
/*     */   }
/*     */   
/*     */   public String toXmlString() {
/* 222 */     StringBuilder buf = new StringBuilder(600);
/* 223 */     buf.append("<").append("dao").append(" name=\"QuickItem\" cmd=\"" + getObjectStateString() + "\">");
/* 224 */     getFieldsAsXml(buf);
/* 225 */     buf.append("</").append("dao").append(">");
/*     */     
/* 227 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public Map<String, String> getValues() {
/* 231 */     Map<String, String> values = super.getValues();
/* 232 */     if (this._organizationId != null) values.put("OrganizationId", DaoUtils.getXmlSafeFieldValue(-5, this._organizationId)); 
/* 233 */     if (this._itemId != null) values.put("ItemId", DaoUtils.getXmlSafeFieldValue(12, this._itemId)); 
/* 234 */     if (this._createDate != null) values.put("CreateDate", DaoUtils.getXmlSafeFieldValue(91, this._createDate)); 
/* 235 */     if (this._createUserId != null) values.put("CreateUserId", DaoUtils.getXmlSafeFieldValue(12, this._createUserId)); 
/* 236 */     if (this._updateDate != null) values.put("UpdateDate", DaoUtils.getXmlSafeFieldValue(91, this._updateDate)); 
/* 237 */     if (this._updateUserId != null) values.put("UpdateUserId", DaoUtils.getXmlSafeFieldValue(12, this._updateUserId)); 
/* 238 */     if (this._orgCode != null) values.put("OrgCode", DaoUtils.getXmlSafeFieldValue(12, this._orgCode)); 
/* 239 */     if (this._orgValue != null) values.put("OrgValue", DaoUtils.getXmlSafeFieldValue(12, this._orgValue)); 
/* 240 */     if (this._parentId != null) values.put("ParentId", DaoUtils.getXmlSafeFieldValue(12, this._parentId)); 
/* 241 */     if (this._description != null) values.put("Description", DaoUtils.getXmlSafeFieldValue(12, this._description)); 
/* 242 */     if (this._imageUrl != null) values.put("ImageUrl", DaoUtils.getXmlSafeFieldValue(12, this._imageUrl)); 
/* 243 */     if (this._sortOrder != null) values.put("SortOrder", DaoUtils.getXmlSafeFieldValue(4, this._sortOrder)); 
/* 244 */     return values;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setValues(Map<String, String> argValues) {
/* 249 */     super.setValues(argValues);
/* 250 */     for (Map.Entry<String, String> field : argValues.entrySet()) {
/*     */       
/* 252 */       String fieldName = field.getKey();
/* 253 */       String fieldValue = field.getValue();
/* 254 */       switch (fieldName) {
/*     */         
/*     */         case "OrganizationId":
/*     */           try {
/* 258 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 259 */             setOrganizationId((Long)value);
/* 260 */           } catch (Exception ee) {
/* 261 */             throw new DtxException("An exception occurred while calling setOrganizationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "ItemId":
/*     */           try {
/* 267 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 268 */             setItemId((String)value);
/* 269 */           } catch (Exception ee) {
/* 270 */             throw new DtxException("An exception occurred while calling setItemId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateDate":
/*     */           try {
/* 276 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 277 */             setCreateDate((Date)value);
/* 278 */           } catch (Exception ee) {
/* 279 */             throw new DtxException("An exception occurred while calling setCreateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateUserId":
/*     */           try {
/* 285 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 286 */             setCreateUserId((String)value);
/* 287 */           } catch (Exception ee) {
/* 288 */             throw new DtxException("An exception occurred while calling setCreateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateDate":
/*     */           try {
/* 294 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 295 */             setUpdateDate((Date)value);
/* 296 */           } catch (Exception ee) {
/* 297 */             throw new DtxException("An exception occurred while calling setUpdateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateUserId":
/*     */           try {
/* 303 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 304 */             setUpdateUserId((String)value);
/* 305 */           } catch (Exception ee) {
/* 306 */             throw new DtxException("An exception occurred while calling setUpdateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "OrgCode":
/*     */           try {
/* 312 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 313 */             setOrgCode((String)value);
/* 314 */           } catch (Exception ee) {
/* 315 */             throw new DtxException("An exception occurred while calling setOrgCode() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "OrgValue":
/*     */           try {
/* 321 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 322 */             setOrgValue((String)value);
/* 323 */           } catch (Exception ee) {
/* 324 */             throw new DtxException("An exception occurred while calling setOrgValue() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "ParentId":
/*     */           try {
/* 330 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 331 */             setParentId((String)value);
/* 332 */           } catch (Exception ee) {
/* 333 */             throw new DtxException("An exception occurred while calling setParentId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "Description":
/*     */           try {
/* 339 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 340 */             setDescription((String)value);
/* 341 */           } catch (Exception ee) {
/* 342 */             throw new DtxException("An exception occurred while calling setDescription() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "ImageUrl":
/*     */           try {
/* 348 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 349 */             setImageUrl((String)value);
/* 350 */           } catch (Exception ee) {
/* 351 */             throw new DtxException("An exception occurred while calling setImageUrl() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "SortOrder":
/*     */           try {
/* 357 */             Object value = DaoUtils.getFieldValueForXmlString(4, fieldValue);
/* 358 */             setSortOrder((Integer)value);
/* 359 */           } catch (Exception ee) {
/* 360 */             throw new DtxException("An exception occurred while calling setSortOrder() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\itm\impl\QuickItemDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */