/*     */ package dtv.xst.dao.inv.impl;
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
/*     */ import dtv.xst.dao.inv.IInventoryTransactionDetailProperty;
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class InventoryTransactionDetailPropertyModel
/*     */   extends AbstractDataModelPropertiesImpl
/*     */   implements IInventoryTransactionDetailProperty
/*     */ {
/*     */   private static final long serialVersionUID = -333611544L;
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
/*  36 */     setDAO((IDataAccessObject)new InventoryTransactionDetailPropertyDAO());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private InventoryTransactionDetailPropertyDAO getDAO_() {
/*  44 */     return (InventoryTransactionDetailPropertyDAO)this._daoImpl;
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
/*  68 */       this._events.post(IInventoryTransactionDetailProperty.SET_ORGANIZATIONID, Long.valueOf(argOrganizationId));
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
/* 107 */       this._events.post(IInventoryTransactionDetailProperty.SET_RETAILLOCATIONID, Long.valueOf(argRetailLocationId));
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
/*     */   public Date getBusinessDate() {
/* 130 */     return getDAO_().getBusinessDate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBusinessDate(Date argBusinessDate) {
/* 138 */     if (setBusinessDate_noev(argBusinessDate) && 
/* 139 */       this._events != null && 
/* 140 */       postEventsForChanges()) {
/* 141 */       this._events.post(IInventoryTransactionDetailProperty.SET_BUSINESSDATE, argBusinessDate);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setBusinessDate_noev(Date argBusinessDate) {
/* 148 */     boolean ev_postable = false;
/*     */     
/* 150 */     if ((getDAO_().getBusinessDate() == null && argBusinessDate != null) || (
/* 151 */       getDAO_().getBusinessDate() != null && !getDAO_().getBusinessDate().equals(argBusinessDate))) {
/* 152 */       getDAO_().setBusinessDate(argBusinessDate);
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
/*     */   public long getWorkstationId() {
/* 164 */     if (getDAO_().getWorkstationId() != null) {
/* 165 */       return getDAO_().getWorkstationId().longValue();
/*     */     }
/*     */     
/* 168 */     return 0L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWorkstationId(long argWorkstationId) {
/* 177 */     if (setWorkstationId_noev(argWorkstationId) && 
/* 178 */       this._events != null && 
/* 179 */       postEventsForChanges()) {
/* 180 */       this._events.post(IInventoryTransactionDetailProperty.SET_WORKSTATIONID, Long.valueOf(argWorkstationId));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setWorkstationId_noev(long argWorkstationId) {
/* 187 */     boolean ev_postable = false;
/*     */     
/* 189 */     if ((getDAO_().getWorkstationId() == null && Long.valueOf(argWorkstationId) != null) || (
/* 190 */       getDAO_().getWorkstationId() != null && !getDAO_().getWorkstationId().equals(Long.valueOf(argWorkstationId)))) {
/* 191 */       getDAO_().setWorkstationId(Long.valueOf(argWorkstationId));
/* 192 */       ev_postable = true;
/*     */     } 
/*     */     
/* 195 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getTransactionSequence() {
/* 203 */     if (getDAO_().getTransactionSequence() != null) {
/* 204 */       return getDAO_().getTransactionSequence().longValue();
/*     */     }
/*     */     
/* 207 */     return 0L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTransactionSequence(long argTransactionSequence) {
/* 216 */     if (setTransactionSequence_noev(argTransactionSequence) && 
/* 217 */       this._events != null && 
/* 218 */       postEventsForChanges()) {
/* 219 */       this._events.post(IInventoryTransactionDetailProperty.SET_TRANSACTIONSEQUENCE, Long.valueOf(argTransactionSequence));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setTransactionSequence_noev(long argTransactionSequence) {
/* 226 */     boolean ev_postable = false;
/*     */     
/* 228 */     if ((getDAO_().getTransactionSequence() == null && Long.valueOf(argTransactionSequence) != null) || (
/* 229 */       getDAO_().getTransactionSequence() != null && !getDAO_().getTransactionSequence().equals(Long.valueOf(argTransactionSequence)))) {
/* 230 */       getDAO_().setTransactionSequence(Long.valueOf(argTransactionSequence));
/* 231 */       ev_postable = true;
/*     */     } 
/*     */     
/* 234 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInventoryDetailSequence() {
/* 242 */     if (getDAO_().getInventoryDetailSequence() != null) {
/* 243 */       return getDAO_().getInventoryDetailSequence().intValue();
/*     */     }
/*     */     
/* 246 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInventoryDetailSequence(int argInventoryDetailSequence) {
/* 255 */     if (setInventoryDetailSequence_noev(argInventoryDetailSequence) && 
/* 256 */       this._events != null && 
/* 257 */       postEventsForChanges()) {
/* 258 */       this._events.post(IInventoryTransactionDetailProperty.SET_INVENTORYDETAILSEQUENCE, Integer.valueOf(argInventoryDetailSequence));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setInventoryDetailSequence_noev(int argInventoryDetailSequence) {
/* 265 */     boolean ev_postable = false;
/*     */     
/* 267 */     if ((getDAO_().getInventoryDetailSequence() == null && Integer.valueOf(argInventoryDetailSequence) != null) || (
/* 268 */       getDAO_().getInventoryDetailSequence() != null && !getDAO_().getInventoryDetailSequence().equals(Integer.valueOf(argInventoryDetailSequence)))) {
/* 269 */       getDAO_().setInventoryDetailSequence(Integer.valueOf(argInventoryDetailSequence));
/* 270 */       ev_postable = true;
/*     */     } 
/*     */     
/* 273 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPropertyCode() {
/* 281 */     return getDAO_().getPropertyCode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPropertyCode(String argPropertyCode) {
/* 289 */     if (setPropertyCode_noev(argPropertyCode) && 
/* 290 */       this._events != null && 
/* 291 */       postEventsForChanges()) {
/* 292 */       this._events.post(IInventoryTransactionDetailProperty.SET_PROPERTYCODE, argPropertyCode);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setPropertyCode_noev(String argPropertyCode) {
/* 299 */     boolean ev_postable = false;
/*     */     
/* 301 */     if ((getDAO_().getPropertyCode() == null && argPropertyCode != null) || (
/* 302 */       getDAO_().getPropertyCode() != null && !getDAO_().getPropertyCode().equals(argPropertyCode))) {
/* 303 */       getDAO_().setPropertyCode(argPropertyCode);
/* 304 */       ev_postable = true;
/*     */     } 
/*     */     
/* 307 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getType() {
/* 315 */     return getDAO_().getType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setType(String argType) {
/* 323 */     if (setType_noev(argType) && 
/* 324 */       this._events != null && 
/* 325 */       postEventsForChanges()) {
/* 326 */       this._events.post(IInventoryTransactionDetailProperty.SET_TYPE, argType);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setType_noev(String argType) {
/* 333 */     boolean ev_postable = false;
/*     */     
/* 335 */     if ((getDAO_().getType() == null && argType != null) || (
/* 336 */       getDAO_().getType() != null && !getDAO_().getType().equals(argType))) {
/* 337 */       getDAO_().setType(argType);
/* 338 */       ev_postable = true;
/*     */     } 
/*     */     
/* 341 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStringValue() {
/* 349 */     return getDAO_().getStringValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStringValue(String argStringValue) {
/* 357 */     if (setStringValue_noev(argStringValue) && 
/* 358 */       this._events != null && 
/* 359 */       postEventsForChanges()) {
/* 360 */       this._events.post(IInventoryTransactionDetailProperty.SET_STRINGVALUE, argStringValue);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setStringValue_noev(String argStringValue) {
/* 367 */     boolean ev_postable = false;
/*     */     
/* 369 */     if ((getDAO_().getStringValue() == null && argStringValue != null) || (
/* 370 */       getDAO_().getStringValue() != null && !getDAO_().getStringValue().equals(argStringValue))) {
/* 371 */       getDAO_().setStringValue(argStringValue);
/* 372 */       ev_postable = true;
/*     */     } 
/*     */     
/* 375 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDateValue() {
/* 383 */     return getDAO_().getDateValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDateValue(Date argDateValue) {
/* 391 */     if (setDateValue_noev(argDateValue) && 
/* 392 */       this._events != null && 
/* 393 */       postEventsForChanges()) {
/* 394 */       this._events.post(IInventoryTransactionDetailProperty.SET_DATEVALUE, argDateValue);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setDateValue_noev(Date argDateValue) {
/* 401 */     boolean ev_postable = false;
/*     */     
/* 403 */     if ((getDAO_().getDateValue() == null && argDateValue != null) || (
/* 404 */       getDAO_().getDateValue() != null && !getDAO_().getDateValue().equals(argDateValue))) {
/* 405 */       getDAO_().setDateValue(argDateValue);
/* 406 */       ev_postable = true;
/*     */     } 
/*     */     
/* 409 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getDecimalValue() {
/* 417 */     return getDAO_().getDecimalValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDecimalValue(BigDecimal argDecimalValue) {
/* 425 */     if (setDecimalValue_noev(argDecimalValue) && 
/* 426 */       this._events != null && 
/* 427 */       postEventsForChanges()) {
/* 428 */       this._events.post(IInventoryTransactionDetailProperty.SET_DECIMALVALUE, argDecimalValue);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setDecimalValue_noev(BigDecimal argDecimalValue) {
/* 435 */     boolean ev_postable = false;
/*     */     
/* 437 */     if ((getDAO_().getDecimalValue() == null && argDecimalValue != null) || (
/* 438 */       getDAO_().getDecimalValue() != null && !getDAO_().getDecimalValue().equals(argDecimalValue))) {
/* 439 */       getDAO_().setDecimalValue(argDecimalValue);
/* 440 */       ev_postable = true;
/*     */     } 
/*     */     
/* 443 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getCreateDate() {
/* 451 */     return getDAO_().getCreateDate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/* 459 */     if (setCreateDate_noev(argCreateDate) && 
/* 460 */       this._events != null && 
/* 461 */       postEventsForChanges()) {
/* 462 */       this._events.post(IInventoryTransactionDetailProperty.SET_CREATEDATE, argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCreateDate_noev(Date argCreateDate) {
/* 469 */     boolean ev_postable = false;
/*     */     
/* 471 */     if ((getDAO_().getCreateDate() == null && argCreateDate != null) || (
/* 472 */       getDAO_().getCreateDate() != null && !getDAO_().getCreateDate().equals(argCreateDate))) {
/* 473 */       getDAO_().setCreateDate(argCreateDate);
/* 474 */       ev_postable = true;
/*     */     } 
/*     */     
/* 477 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/* 485 */     return getDAO_().getCreateUserId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/* 493 */     if (setCreateUserId_noev(argCreateUserId) && 
/* 494 */       this._events != null && 
/* 495 */       postEventsForChanges()) {
/* 496 */       this._events.post(IInventoryTransactionDetailProperty.SET_CREATEUSERID, argCreateUserId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCreateUserId_noev(String argCreateUserId) {
/* 503 */     boolean ev_postable = false;
/*     */     
/* 505 */     if ((getDAO_().getCreateUserId() == null && argCreateUserId != null) || (
/* 506 */       getDAO_().getCreateUserId() != null && !getDAO_().getCreateUserId().equals(argCreateUserId))) {
/* 507 */       getDAO_().setCreateUserId(argCreateUserId);
/* 508 */       ev_postable = true;
/*     */     } 
/*     */     
/* 511 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getUpdateDate() {
/* 519 */     return getDAO_().getUpdateDate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/* 527 */     if (setUpdateDate_noev(argUpdateDate) && 
/* 528 */       this._events != null && 
/* 529 */       postEventsForChanges()) {
/* 530 */       this._events.post(IInventoryTransactionDetailProperty.SET_UPDATEDATE, argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setUpdateDate_noev(Date argUpdateDate) {
/* 537 */     boolean ev_postable = false;
/*     */     
/* 539 */     if ((getDAO_().getUpdateDate() == null && argUpdateDate != null) || (
/* 540 */       getDAO_().getUpdateDate() != null && !getDAO_().getUpdateDate().equals(argUpdateDate))) {
/* 541 */       getDAO_().setUpdateDate(argUpdateDate);
/* 542 */       ev_postable = true;
/*     */     } 
/*     */     
/* 545 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/* 553 */     return getDAO_().getUpdateUserId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/* 561 */     if (setUpdateUserId_noev(argUpdateUserId) && 
/* 562 */       this._events != null && 
/* 563 */       postEventsForChanges()) {
/* 564 */       this._events.post(IInventoryTransactionDetailProperty.SET_UPDATEUSERID, argUpdateUserId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setUpdateUserId_noev(String argUpdateUserId) {
/* 571 */     boolean ev_postable = false;
/*     */     
/* 573 */     if ((getDAO_().getUpdateUserId() == null && argUpdateUserId != null) || (
/* 574 */       getDAO_().getUpdateUserId() != null && !getDAO_().getUpdateUserId().equals(argUpdateUserId))) {
/* 575 */       getDAO_().setUpdateUserId(argUpdateUserId);
/* 576 */       ev_postable = true;
/*     */     } 
/*     */     
/* 579 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getValue(String argFieldId) {
/* 585 */     if ("InventoryTransactionDetailPropertyExtension".equals(argFieldId)) {
/* 586 */       return this._myExtension;
/*     */     }
/*     */     
/* 589 */     return super.getValue(argFieldId);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValue(String argFieldId, Object argValue) {
/* 595 */     if ("InventoryTransactionDetailPropertyExtension".equals(argFieldId)) {
/* 596 */       this._myExtension = (IDataModel)argValue;
/*     */     } else {
/*     */       
/* 599 */       super.setValue(argFieldId, argValue);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDependencies(IPersistenceDefaults argPD, EventManager argEM) {
/* 605 */     this._persistenceDefaults = argPD;
/* 606 */     this._daoImpl.setPersistenceDefaults(argPD);
/* 607 */     this._eventManager = argEM;
/* 608 */     this._events = (Eventor)new ModelEventor((IDataModel)this, argEM);
/* 609 */     this._eventCascade = (EventHandler)new CascadingHandler(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void startTransaction() {
/* 614 */     if (this._alreadyInStart) {
/*     */       return;
/*     */     }
/*     */     
/* 618 */     this._alreadyInStart = true;
/*     */ 
/*     */     
/* 621 */     super.startTransaction();
/*     */ 
/*     */     
/* 624 */     this._alreadyInStart = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollbackChanges() {
/* 629 */     if (isAlreadyRolledBack()) {
/*     */       return;
/*     */     }
/* 632 */     super.rollbackChanges();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void commitTransaction() {
/* 638 */     if (this._alreadyInCommit) {
/*     */       return;
/*     */     }
/* 641 */     this._alreadyInCommit = true;
/*     */ 
/*     */     
/* 644 */     super.commitTransaction();
/*     */ 
/*     */     
/* 647 */     this._alreadyInCommit = false;
/*     */   }
/*     */ 
/*     */   
/*     */   private void readObject(ObjectInputStream argStream) throws IOException, ClassNotFoundException {
/* 652 */     argStream.defaultReadObject();
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\inv\impl\InventoryTransactionDetailPropertyModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */