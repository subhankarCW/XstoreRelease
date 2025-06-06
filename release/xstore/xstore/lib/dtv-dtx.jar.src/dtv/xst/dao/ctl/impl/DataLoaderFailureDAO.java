/*     */ package dtv.xst.dao.ctl.impl;
/*     */ 
/*     */ import dtv.data2.access.DaoUtils;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.exception.DtxException;
/*     */ import dtv.data2.access.impl.AbstractDAOImpl;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.xst.dao.ctl.DataLoaderFailureId;
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
/*     */ public class DataLoaderFailureDAO
/*     */   extends AbstractDAOImpl
/*     */ {
/*     */   private static final long serialVersionUID = 299414093L;
/*  23 */   private static final Logger _logger = Logger.getLogger(DataLoaderFailureDAO.class);
/*     */   
/*     */   private Long _organizationId;
/*     */   private String _fileName;
/*     */   private Long _runTime;
/*     */   private Integer _failureSequence;
/*     */   private DtvDate _createDate;
/*     */   private String _createUserId;
/*     */   private DtvDate _updateDate;
/*     */   private String _updateUserId;
/*     */   private String _failureMessage;
/*     */   private String _failedData;
/*     */   
/*     */   public Long getOrganizationId() {
/*  37 */     return this._organizationId;
/*     */   }
/*     */   
/*     */   public void setOrganizationId(Long argOrganizationId) {
/*  41 */     if (changed(argOrganizationId, this._organizationId, "organizationId")) {
/*  42 */       this._organizationId = argOrganizationId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getFileName() {
/*  47 */     return this._fileName;
/*     */   }
/*     */   
/*     */   public void setFileName(String argFileName) {
/*  51 */     if (changed(argFileName, this._fileName, "fileName")) {
/*  52 */       this._fileName = (argFileName != null && MANAGE_CASE) ? argFileName.toUpperCase() : argFileName;
/*     */     }
/*     */   }
/*     */   
/*     */   public Long getRunTime() {
/*  57 */     return this._runTime;
/*     */   }
/*     */   
/*     */   public void setRunTime(Long argRunTime) {
/*  61 */     if (changed(argRunTime, this._runTime, "runTime")) {
/*  62 */       this._runTime = argRunTime;
/*     */     }
/*     */   }
/*     */   
/*     */   public Integer getFailureSequence() {
/*  67 */     return this._failureSequence;
/*     */   }
/*     */   
/*     */   public void setFailureSequence(Integer argFailureSequence) {
/*  71 */     if (changed(argFailureSequence, this._failureSequence, "failureSequence")) {
/*  72 */       this._failureSequence = argFailureSequence;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getCreateDate() {
/*  77 */     return (Date)this._createDate;
/*     */   }
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/*  81 */     if (changed(argCreateDate, this._createDate, "createDate")) {
/*  82 */       this._createDate = (argCreateDate == null || argCreateDate instanceof DtvDate) ? (DtvDate)argCreateDate : new DtvDate(argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/*  88 */     return this._createUserId;
/*     */   }
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/*  92 */     if (changed(argCreateUserId, this._createUserId, "createUserId")) {
/*  93 */       this._createUserId = argCreateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public Date getUpdateDate() {
/*  98 */     return (Date)this._updateDate;
/*     */   }
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/* 102 */     if (changed(argUpdateDate, this._updateDate, "updateDate")) {
/* 103 */       this._updateDate = (argUpdateDate == null || argUpdateDate instanceof DtvDate) ? (DtvDate)argUpdateDate : new DtvDate(argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/* 109 */     return this._updateUserId;
/*     */   }
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/* 113 */     if (changed(argUpdateUserId, this._updateUserId, "updateUserId")) {
/* 114 */       this._updateUserId = argUpdateUserId;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getFailureMessage() {
/* 119 */     return this._failureMessage;
/*     */   }
/*     */   
/*     */   public void setFailureMessage(String argFailureMessage) {
/* 123 */     if (changed(argFailureMessage, this._failureMessage, "failureMessage")) {
/* 124 */       this._failureMessage = argFailureMessage;
/*     */     }
/*     */   }
/*     */   
/*     */   public String getFailedData() {
/* 129 */     return this._failedData;
/*     */   }
/*     */   
/*     */   public void setFailedData(String argFailedData) {
/* 133 */     if (changed(argFailedData, this._failedData, "failedData")) {
/* 134 */       this._failedData = argFailedData;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 141 */     StringBuilder buf = new StringBuilder(512);
/* 142 */     buf.append(super.toString()).append(" Id: ").append(getObjectId()).append(" Values: ");
/* 143 */     if (getOrganizationId() != null) {
/* 144 */       buf.append("organizationId").append("=").append(getOrganizationId()).append(" ");
/*     */     }
/* 146 */     if (getFileName() != null) {
/* 147 */       buf.append("fileName").append("=").append(getFileName()).append(" ");
/*     */     }
/* 149 */     if (getRunTime() != null) {
/* 150 */       buf.append("runTime").append("=").append(getRunTime()).append(" ");
/*     */     }
/* 152 */     if (getFailureSequence() != null) {
/* 153 */       buf.append("failureSequence").append("=").append(getFailureSequence()).append(" ");
/*     */     }
/* 155 */     if (getCreateDate() != null) {
/* 156 */       buf.append("createDate").append("=").append(getCreateDate()).append(" ");
/*     */     }
/* 158 */     if (getCreateUserId() != null) {
/* 159 */       buf.append("createUserId").append("=").append(getCreateUserId()).append(" ");
/*     */     }
/* 161 */     if (getUpdateDate() != null) {
/* 162 */       buf.append("updateDate").append("=").append(getUpdateDate()).append(" ");
/*     */     }
/* 164 */     if (getUpdateUserId() != null) {
/* 165 */       buf.append("updateUserId").append("=").append(getUpdateUserId()).append(" ");
/*     */     }
/* 167 */     if (getFailureMessage() != null) {
/* 168 */       buf.append("failureMessage").append("=").append(getFailureMessage()).append(" ");
/*     */     }
/* 170 */     if (getFailedData() != null) {
/* 171 */       buf.append("failedData").append("=").append(getFailedData()).append(" ");
/*     */     }
/*     */     
/* 174 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public IObjectId getObjectId() {
/* 178 */     DataLoaderFailureId id = new DataLoaderFailureId();
/* 179 */     id.setOrganizationId(getOrganizationId());
/* 180 */     id.setFileName(getFileName());
/* 181 */     id.setRunTime(getRunTime());
/* 182 */     id.setFailureSequence(getFailureSequence());
/* 183 */     return (IObjectId)id;
/*     */   }
/*     */   
/*     */   public void setObjectId(IObjectId argObjectId) {
/* 187 */     setOrganizationId(((DataLoaderFailureId)argObjectId).getOrganizationId());
/* 188 */     setFileName(((DataLoaderFailureId)argObjectId).getFileName());
/* 189 */     setRunTime(((DataLoaderFailureId)argObjectId).getRunTime());
/* 190 */     setFailureSequence(((DataLoaderFailureId)argObjectId).getFailureSequence());
/*     */   }
/*     */   
/*     */   public String getImplementingClass() {
/* 194 */     return null;
/*     */   }
/*     */   
/*     */   public String toXmlString() {
/* 198 */     StringBuilder buf = new StringBuilder(500);
/* 199 */     buf.append("<").append("dao").append(" name=\"DataLoaderFailure\" cmd=\"" + getObjectStateString() + "\">");
/* 200 */     getFieldsAsXml(buf);
/* 201 */     buf.append("</").append("dao").append(">");
/*     */     
/* 203 */     return buf.toString();
/*     */   }
/*     */   
/*     */   public Map<String, String> getValues() {
/* 207 */     Map<String, String> values = super.getValues();
/* 208 */     if (this._organizationId != null) values.put("OrganizationId", DaoUtils.getXmlSafeFieldValue(-5, this._organizationId)); 
/* 209 */     if (this._fileName != null) values.put("FileName", DaoUtils.getXmlSafeFieldValue(12, this._fileName)); 
/* 210 */     if (this._runTime != null) values.put("RunTime", DaoUtils.getXmlSafeFieldValue(-5, this._runTime)); 
/* 211 */     if (this._failureSequence != null) values.put("FailureSequence", DaoUtils.getXmlSafeFieldValue(4, this._failureSequence)); 
/* 212 */     if (this._createDate != null) values.put("CreateDate", DaoUtils.getXmlSafeFieldValue(91, this._createDate)); 
/* 213 */     if (this._createUserId != null) values.put("CreateUserId", DaoUtils.getXmlSafeFieldValue(12, this._createUserId)); 
/* 214 */     if (this._updateDate != null) values.put("UpdateDate", DaoUtils.getXmlSafeFieldValue(91, this._updateDate)); 
/* 215 */     if (this._updateUserId != null) values.put("UpdateUserId", DaoUtils.getXmlSafeFieldValue(12, this._updateUserId)); 
/* 216 */     if (this._failureMessage != null) values.put("FailureMessage", DaoUtils.getXmlSafeFieldValue(12, this._failureMessage)); 
/* 217 */     if (this._failedData != null) values.put("FailedData", DaoUtils.getXmlSafeFieldValue(12, this._failedData)); 
/* 218 */     return values;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setValues(Map<String, String> argValues) {
/* 223 */     super.setValues(argValues);
/* 224 */     for (Map.Entry<String, String> field : argValues.entrySet()) {
/*     */       
/* 226 */       String fieldName = field.getKey();
/* 227 */       String fieldValue = field.getValue();
/* 228 */       switch (fieldName) {
/*     */         
/*     */         case "OrganizationId":
/*     */           try {
/* 232 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 233 */             setOrganizationId((Long)value);
/* 234 */           } catch (Exception ee) {
/* 235 */             throw new DtxException("An exception occurred while calling setOrganizationId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "FileName":
/*     */           try {
/* 241 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 242 */             setFileName((String)value);
/* 243 */           } catch (Exception ee) {
/* 244 */             throw new DtxException("An exception occurred while calling setFileName() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "RunTime":
/*     */           try {
/* 250 */             Object value = DaoUtils.getFieldValueForXmlString(-5, fieldValue);
/* 251 */             setRunTime((Long)value);
/* 252 */           } catch (Exception ee) {
/* 253 */             throw new DtxException("An exception occurred while calling setRunTime() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "FailureSequence":
/*     */           try {
/* 259 */             Object value = DaoUtils.getFieldValueForXmlString(4, fieldValue);
/* 260 */             setFailureSequence((Integer)value);
/* 261 */           } catch (Exception ee) {
/* 262 */             throw new DtxException("An exception occurred while calling setFailureSequence() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateDate":
/*     */           try {
/* 268 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 269 */             setCreateDate((Date)value);
/* 270 */           } catch (Exception ee) {
/* 271 */             throw new DtxException("An exception occurred while calling setCreateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "CreateUserId":
/*     */           try {
/* 277 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 278 */             setCreateUserId((String)value);
/* 279 */           } catch (Exception ee) {
/* 280 */             throw new DtxException("An exception occurred while calling setCreateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateDate":
/*     */           try {
/* 286 */             Object value = DaoUtils.getFieldValueForXmlString(91, fieldValue);
/* 287 */             setUpdateDate((Date)value);
/* 288 */           } catch (Exception ee) {
/* 289 */             throw new DtxException("An exception occurred while calling setUpdateDate() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "UpdateUserId":
/*     */           try {
/* 295 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 296 */             setUpdateUserId((String)value);
/* 297 */           } catch (Exception ee) {
/* 298 */             throw new DtxException("An exception occurred while calling setUpdateUserId() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "FailureMessage":
/*     */           try {
/* 304 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 305 */             setFailureMessage((String)value);
/* 306 */           } catch (Exception ee) {
/* 307 */             throw new DtxException("An exception occurred while calling setFailureMessage() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */ 
/*     */         
/*     */         case "FailedData":
/*     */           try {
/* 313 */             Object value = DaoUtils.getFieldValueForXmlString(12, fieldValue);
/* 314 */             setFailedData((String)value);
/* 315 */           } catch (Exception ee) {
/* 316 */             throw new DtxException("An exception occurred while calling setFailedData() with " + fieldValue + " on: " + this + " " + ee.toString(), ee);
/*     */           } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\ctl\impl\DataLoaderFailureDAO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */