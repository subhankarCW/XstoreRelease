/*     */ package dtv.xst.dao.loc.impl;
/*     */ 
/*     */ import dtv.data2.IPersistenceDefaults;
/*     */ import dtv.data2.access.IDataAccessObject;
/*     */ import dtv.data2.access.IDataModel;
/*     */ import dtv.data2.access.ModelEventor;
/*     */ import dtv.data2.access.impl.AbstractDataModelPropertiesImpl;
/*     */ import dtv.event.EventHandler;
/*     */ import dtv.event.EventManager;
/*     */ import dtv.event.Eventor;
/*     */ import dtv.event.handler.CascadingHandler;
/*     */ import dtv.xst.dao.loc.ICloseDatesProperty;
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CloseDatesPropertyModel
/*     */   extends AbstractDataModelPropertiesImpl
/*     */   implements ICloseDatesProperty
/*     */ {
/*     */   private static final long serialVersionUID = 1128690818L;
/*     */   private transient boolean _alreadyInStart = false;
/*     */   private transient boolean _alreadyInCommit = false;
/*     */   private IDataModel _myExtension;
/*     */   
/*     */   public String toString() {
/*  31 */     return super.toString() + " Id: " + getObjectId();
/*     */   }
/*     */ 
/*     */   
/*     */   public void initDAO() {
/*  36 */     setDAO((IDataAccessObject)new CloseDatesPropertyDAO());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private CloseDatesPropertyDAO getDAO_() {
/*  44 */     return (CloseDatesPropertyDAO)this._daoImpl;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getOrganizationId() {
/*  52 */     if (getDAO_().getOrganizationId() != null) {
/*  53 */       return getDAO_().getOrganizationId().longValue();
/*     */     }
/*     */     
/*  56 */     return 0L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrganizationId(long argOrganizationId) {
/*  65 */     if (setOrganizationId_noev(argOrganizationId) && 
/*  66 */       this._events != null && 
/*  67 */       postEventsForChanges()) {
/*  68 */       this._events.post(ICloseDatesProperty.SET_ORGANIZATIONID, Long.valueOf(argOrganizationId));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setOrganizationId_noev(long argOrganizationId) {
/*  75 */     boolean ev_postable = false;
/*     */     
/*  77 */     if ((getDAO_().getOrganizationId() == null && Long.valueOf(argOrganizationId) != null) || (
/*  78 */       getDAO_().getOrganizationId() != null && !getDAO_().getOrganizationId().equals(Long.valueOf(argOrganizationId)))) {
/*  79 */       getDAO_().setOrganizationId(Long.valueOf(argOrganizationId));
/*  80 */       ev_postable = true;
/*     */     } 
/*     */     
/*  83 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getRetailLocationId() {
/*  91 */     if (getDAO_().getRetailLocationId() != null) {
/*  92 */       return getDAO_().getRetailLocationId().longValue();
/*     */     }
/*     */     
/*  95 */     return 0L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRetailLocationId(long argRetailLocationId) {
/* 104 */     if (setRetailLocationId_noev(argRetailLocationId) && 
/* 105 */       this._events != null && 
/* 106 */       postEventsForChanges()) {
/* 107 */       this._events.post(ICloseDatesProperty.SET_RETAILLOCATIONID, Long.valueOf(argRetailLocationId));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setRetailLocationId_noev(long argRetailLocationId) {
/* 114 */     boolean ev_postable = false;
/*     */     
/* 116 */     if ((getDAO_().getRetailLocationId() == null && Long.valueOf(argRetailLocationId) != null) || (
/* 117 */       getDAO_().getRetailLocationId() != null && !getDAO_().getRetailLocationId().equals(Long.valueOf(argRetailLocationId)))) {
/* 118 */       getDAO_().setRetailLocationId(Long.valueOf(argRetailLocationId));
/* 119 */       ev_postable = true;
/*     */     } 
/*     */     
/* 122 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getCloseDate() {
/* 130 */     return getDAO_().getCloseDate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCloseDate(Date argCloseDate) {
/* 138 */     if (setCloseDate_noev(argCloseDate) && 
/* 139 */       this._events != null && 
/* 140 */       postEventsForChanges()) {
/* 141 */       this._events.post(ICloseDatesProperty.SET_CLOSEDATE, argCloseDate);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCloseDate_noev(Date argCloseDate) {
/* 148 */     boolean ev_postable = false;
/*     */     
/* 150 */     if ((getDAO_().getCloseDate() == null && argCloseDate != null) || (
/* 151 */       getDAO_().getCloseDate() != null && !getDAO_().getCloseDate().equals(argCloseDate))) {
/* 152 */       getDAO_().setCloseDate(argCloseDate);
/* 153 */       ev_postable = true;
/*     */     } 
/*     */     
/* 156 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPropertyCode() {
/* 164 */     return getDAO_().getPropertyCode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPropertyCode(String argPropertyCode) {
/* 172 */     if (setPropertyCode_noev(argPropertyCode) && 
/* 173 */       this._events != null && 
/* 174 */       postEventsForChanges()) {
/* 175 */       this._events.post(ICloseDatesProperty.SET_PROPERTYCODE, argPropertyCode);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setPropertyCode_noev(String argPropertyCode) {
/* 182 */     boolean ev_postable = false;
/*     */     
/* 184 */     if ((getDAO_().getPropertyCode() == null && argPropertyCode != null) || (
/* 185 */       getDAO_().getPropertyCode() != null && !getDAO_().getPropertyCode().equals(argPropertyCode))) {
/* 186 */       getDAO_().setPropertyCode(argPropertyCode);
/* 187 */       ev_postable = true;
/*     */     } 
/*     */     
/* 190 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getType() {
/* 198 */     return getDAO_().getType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setType(String argType) {
/* 206 */     if (setType_noev(argType) && 
/* 207 */       this._events != null && 
/* 208 */       postEventsForChanges()) {
/* 209 */       this._events.post(ICloseDatesProperty.SET_TYPE, argType);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setType_noev(String argType) {
/* 216 */     boolean ev_postable = false;
/*     */     
/* 218 */     if ((getDAO_().getType() == null && argType != null) || (
/* 219 */       getDAO_().getType() != null && !getDAO_().getType().equals(argType))) {
/* 220 */       getDAO_().setType(argType);
/* 221 */       ev_postable = true;
/*     */     } 
/*     */     
/* 224 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStringValue() {
/* 232 */     return getDAO_().getStringValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStringValue(String argStringValue) {
/* 240 */     if (setStringValue_noev(argStringValue) && 
/* 241 */       this._events != null && 
/* 242 */       postEventsForChanges()) {
/* 243 */       this._events.post(ICloseDatesProperty.SET_STRINGVALUE, argStringValue);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setStringValue_noev(String argStringValue) {
/* 250 */     boolean ev_postable = false;
/*     */     
/* 252 */     if ((getDAO_().getStringValue() == null && argStringValue != null) || (
/* 253 */       getDAO_().getStringValue() != null && !getDAO_().getStringValue().equals(argStringValue))) {
/* 254 */       getDAO_().setStringValue(argStringValue);
/* 255 */       ev_postable = true;
/*     */     } 
/*     */     
/* 258 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDateValue() {
/* 266 */     return getDAO_().getDateValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDateValue(Date argDateValue) {
/* 274 */     if (setDateValue_noev(argDateValue) && 
/* 275 */       this._events != null && 
/* 276 */       postEventsForChanges()) {
/* 277 */       this._events.post(ICloseDatesProperty.SET_DATEVALUE, argDateValue);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setDateValue_noev(Date argDateValue) {
/* 284 */     boolean ev_postable = false;
/*     */     
/* 286 */     if ((getDAO_().getDateValue() == null && argDateValue != null) || (
/* 287 */       getDAO_().getDateValue() != null && !getDAO_().getDateValue().equals(argDateValue))) {
/* 288 */       getDAO_().setDateValue(argDateValue);
/* 289 */       ev_postable = true;
/*     */     } 
/*     */     
/* 292 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getDecimalValue() {
/* 300 */     return getDAO_().getDecimalValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDecimalValue(BigDecimal argDecimalValue) {
/* 308 */     if (setDecimalValue_noev(argDecimalValue) && 
/* 309 */       this._events != null && 
/* 310 */       postEventsForChanges()) {
/* 311 */       this._events.post(ICloseDatesProperty.SET_DECIMALVALUE, argDecimalValue);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setDecimalValue_noev(BigDecimal argDecimalValue) {
/* 318 */     boolean ev_postable = false;
/*     */     
/* 320 */     if ((getDAO_().getDecimalValue() == null && argDecimalValue != null) || (
/* 321 */       getDAO_().getDecimalValue() != null && !getDAO_().getDecimalValue().equals(argDecimalValue))) {
/* 322 */       getDAO_().setDecimalValue(argDecimalValue);
/* 323 */       ev_postable = true;
/*     */     } 
/*     */     
/* 326 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getCreateDate() {
/* 334 */     return getDAO_().getCreateDate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/* 342 */     if (setCreateDate_noev(argCreateDate) && 
/* 343 */       this._events != null && 
/* 344 */       postEventsForChanges()) {
/* 345 */       this._events.post(ICloseDatesProperty.SET_CREATEDATE, argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCreateDate_noev(Date argCreateDate) {
/* 352 */     boolean ev_postable = false;
/*     */     
/* 354 */     if ((getDAO_().getCreateDate() == null && argCreateDate != null) || (
/* 355 */       getDAO_().getCreateDate() != null && !getDAO_().getCreateDate().equals(argCreateDate))) {
/* 356 */       getDAO_().setCreateDate(argCreateDate);
/* 357 */       ev_postable = true;
/*     */     } 
/*     */     
/* 360 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/* 368 */     return getDAO_().getCreateUserId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/* 376 */     if (setCreateUserId_noev(argCreateUserId) && 
/* 377 */       this._events != null && 
/* 378 */       postEventsForChanges()) {
/* 379 */       this._events.post(ICloseDatesProperty.SET_CREATEUSERID, argCreateUserId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCreateUserId_noev(String argCreateUserId) {
/* 386 */     boolean ev_postable = false;
/*     */     
/* 388 */     if ((getDAO_().getCreateUserId() == null && argCreateUserId != null) || (
/* 389 */       getDAO_().getCreateUserId() != null && !getDAO_().getCreateUserId().equals(argCreateUserId))) {
/* 390 */       getDAO_().setCreateUserId(argCreateUserId);
/* 391 */       ev_postable = true;
/*     */     } 
/*     */     
/* 394 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getUpdateDate() {
/* 402 */     return getDAO_().getUpdateDate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/* 410 */     if (setUpdateDate_noev(argUpdateDate) && 
/* 411 */       this._events != null && 
/* 412 */       postEventsForChanges()) {
/* 413 */       this._events.post(ICloseDatesProperty.SET_UPDATEDATE, argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setUpdateDate_noev(Date argUpdateDate) {
/* 420 */     boolean ev_postable = false;
/*     */     
/* 422 */     if ((getDAO_().getUpdateDate() == null && argUpdateDate != null) || (
/* 423 */       getDAO_().getUpdateDate() != null && !getDAO_().getUpdateDate().equals(argUpdateDate))) {
/* 424 */       getDAO_().setUpdateDate(argUpdateDate);
/* 425 */       ev_postable = true;
/*     */     } 
/*     */     
/* 428 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/* 436 */     return getDAO_().getUpdateUserId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/* 444 */     if (setUpdateUserId_noev(argUpdateUserId) && 
/* 445 */       this._events != null && 
/* 446 */       postEventsForChanges()) {
/* 447 */       this._events.post(ICloseDatesProperty.SET_UPDATEUSERID, argUpdateUserId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setUpdateUserId_noev(String argUpdateUserId) {
/* 454 */     boolean ev_postable = false;
/*     */     
/* 456 */     if ((getDAO_().getUpdateUserId() == null && argUpdateUserId != null) || (
/* 457 */       getDAO_().getUpdateUserId() != null && !getDAO_().getUpdateUserId().equals(argUpdateUserId))) {
/* 458 */       getDAO_().setUpdateUserId(argUpdateUserId);
/* 459 */       ev_postable = true;
/*     */     } 
/*     */     
/* 462 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getValue(String argFieldId) {
/* 468 */     if ("CloseDatesPropertyExtension".equals(argFieldId)) {
/* 469 */       return this._myExtension;
/*     */     }
/*     */     
/* 472 */     return super.getValue(argFieldId);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValue(String argFieldId, Object argValue) {
/* 478 */     if ("CloseDatesPropertyExtension".equals(argFieldId)) {
/* 479 */       this._myExtension = (IDataModel)argValue;
/*     */     } else {
/*     */       
/* 482 */       super.setValue(argFieldId, argValue);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDependencies(IPersistenceDefaults argPD, EventManager argEM) {
/* 488 */     this._persistenceDefaults = argPD;
/* 489 */     this._daoImpl.setPersistenceDefaults(argPD);
/* 490 */     this._eventManager = argEM;
/* 491 */     this._events = (Eventor)new ModelEventor((IDataModel)this, argEM);
/* 492 */     this._eventCascade = (EventHandler)new CascadingHandler(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void startTransaction() {
/* 497 */     if (this._alreadyInStart) {
/*     */       return;
/*     */     }
/*     */     
/* 501 */     this._alreadyInStart = true;
/*     */ 
/*     */     
/* 504 */     super.startTransaction();
/*     */ 
/*     */     
/* 507 */     this._alreadyInStart = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollbackChanges() {
/* 512 */     if (isAlreadyRolledBack()) {
/*     */       return;
/*     */     }
/* 515 */     super.rollbackChanges();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void commitTransaction() {
/* 521 */     if (this._alreadyInCommit) {
/*     */       return;
/*     */     }
/* 524 */     this._alreadyInCommit = true;
/*     */ 
/*     */     
/* 527 */     super.commitTransaction();
/*     */ 
/*     */     
/* 530 */     this._alreadyInCommit = false;
/*     */   }
/*     */ 
/*     */   
/*     */   private void readObject(ObjectInputStream argStream) throws IOException, ClassNotFoundException {
/* 535 */     argStream.defaultReadObject();
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\loc\impl\CloseDatesPropertyModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */