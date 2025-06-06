/*     */ package dtv.xst.dao.cat.impl;
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
/*     */ import dtv.xst.dao.cat.ICustomerItemAccountActivityProperty;
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CustomerItemAccountActivityPropertyModel
/*     */   extends AbstractDataModelPropertiesImpl
/*     */   implements ICustomerItemAccountActivityProperty
/*     */ {
/*     */   private static final long serialVersionUID = 698586848L;
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
/*  36 */     setDAO((IDataAccessObject)new CustomerItemAccountActivityPropertyDAO());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private CustomerItemAccountActivityPropertyDAO getDAO_() {
/*  44 */     return (CustomerItemAccountActivityPropertyDAO)this._daoImpl;
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
/*  68 */       this._events.post(ICustomerItemAccountActivityProperty.SET_ORGANIZATIONID, Long.valueOf(argOrganizationId));
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
/*     */   public String getCustAccountId() {
/*  91 */     return getDAO_().getCustAccountId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustAccountId(String argCustAccountId) {
/*  99 */     if (setCustAccountId_noev(argCustAccountId) && 
/* 100 */       this._events != null && 
/* 101 */       postEventsForChanges()) {
/* 102 */       this._events.post(ICustomerItemAccountActivityProperty.SET_CUSTACCOUNTID, argCustAccountId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCustAccountId_noev(String argCustAccountId) {
/* 109 */     boolean ev_postable = false;
/*     */     
/* 111 */     if ((getDAO_().getCustAccountId() == null && argCustAccountId != null) || (
/* 112 */       getDAO_().getCustAccountId() != null && !getDAO_().getCustAccountId().equals(argCustAccountId))) {
/* 113 */       getDAO_().setCustAccountId(argCustAccountId);
/* 114 */       ev_postable = true;
/*     */     } 
/*     */     
/* 117 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustAccountCode() {
/* 125 */     return getDAO_().getCustAccountCode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustAccountCode(String argCustAccountCode) {
/* 133 */     if (setCustAccountCode_noev(argCustAccountCode) && 
/* 134 */       this._events != null && 
/* 135 */       postEventsForChanges()) {
/* 136 */       this._events.post(ICustomerItemAccountActivityProperty.SET_CUSTACCOUNTCODE, argCustAccountCode);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCustAccountCode_noev(String argCustAccountCode) {
/* 143 */     boolean ev_postable = false;
/*     */     
/* 145 */     if ((getDAO_().getCustAccountCode() == null && argCustAccountCode != null) || (
/* 146 */       getDAO_().getCustAccountCode() != null && !getDAO_().getCustAccountCode().equals(argCustAccountCode))) {
/* 147 */       getDAO_().setCustAccountCode(argCustAccountCode);
/* 148 */       ev_postable = true;
/*     */     } 
/*     */     
/* 151 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getCustAccountDetailNum() {
/* 159 */     if (getDAO_().getCustAccountDetailNum() != null) {
/* 160 */       return getDAO_().getCustAccountDetailNum().longValue();
/*     */     }
/*     */     
/* 163 */     return 0L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCustAccountDetailNum(long argCustAccountDetailNum) {
/* 172 */     if (setCustAccountDetailNum_noev(argCustAccountDetailNum) && 
/* 173 */       this._events != null && 
/* 174 */       postEventsForChanges()) {
/* 175 */       this._events.post(ICustomerItemAccountActivityProperty.SET_CUSTACCOUNTDETAILNUM, Long.valueOf(argCustAccountDetailNum));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCustAccountDetailNum_noev(long argCustAccountDetailNum) {
/* 182 */     boolean ev_postable = false;
/*     */     
/* 184 */     if ((getDAO_().getCustAccountDetailNum() == null && Long.valueOf(argCustAccountDetailNum) != null) || (
/* 185 */       getDAO_().getCustAccountDetailNum() != null && !getDAO_().getCustAccountDetailNum().equals(Long.valueOf(argCustAccountDetailNum)))) {
/* 186 */       getDAO_().setCustAccountDetailNum(Long.valueOf(argCustAccountDetailNum));
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
/*     */   public long getSequenceNumber() {
/* 198 */     if (getDAO_().getSequenceNumber() != null) {
/* 199 */       return getDAO_().getSequenceNumber().longValue();
/*     */     }
/*     */     
/* 202 */     return 0L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSequenceNumber(long argSequenceNumber) {
/* 211 */     if (setSequenceNumber_noev(argSequenceNumber) && 
/* 212 */       this._events != null && 
/* 213 */       postEventsForChanges()) {
/* 214 */       this._events.post(ICustomerItemAccountActivityProperty.SET_SEQUENCENUMBER, Long.valueOf(argSequenceNumber));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setSequenceNumber_noev(long argSequenceNumber) {
/* 221 */     boolean ev_postable = false;
/*     */     
/* 223 */     if ((getDAO_().getSequenceNumber() == null && Long.valueOf(argSequenceNumber) != null) || (
/* 224 */       getDAO_().getSequenceNumber() != null && !getDAO_().getSequenceNumber().equals(Long.valueOf(argSequenceNumber)))) {
/* 225 */       getDAO_().setSequenceNumber(Long.valueOf(argSequenceNumber));
/* 226 */       ev_postable = true;
/*     */     } 
/*     */     
/* 229 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPropertyCode() {
/* 237 */     return getDAO_().getPropertyCode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPropertyCode(String argPropertyCode) {
/* 245 */     if (setPropertyCode_noev(argPropertyCode) && 
/* 246 */       this._events != null && 
/* 247 */       postEventsForChanges()) {
/* 248 */       this._events.post(ICustomerItemAccountActivityProperty.SET_PROPERTYCODE, argPropertyCode);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setPropertyCode_noev(String argPropertyCode) {
/* 255 */     boolean ev_postable = false;
/*     */     
/* 257 */     if ((getDAO_().getPropertyCode() == null && argPropertyCode != null) || (
/* 258 */       getDAO_().getPropertyCode() != null && !getDAO_().getPropertyCode().equals(argPropertyCode))) {
/* 259 */       getDAO_().setPropertyCode(argPropertyCode);
/* 260 */       ev_postable = true;
/*     */     } 
/*     */     
/* 263 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getType() {
/* 271 */     return getDAO_().getType();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setType(String argType) {
/* 279 */     if (setType_noev(argType) && 
/* 280 */       this._events != null && 
/* 281 */       postEventsForChanges()) {
/* 282 */       this._events.post(ICustomerItemAccountActivityProperty.SET_TYPE, argType);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setType_noev(String argType) {
/* 289 */     boolean ev_postable = false;
/*     */     
/* 291 */     if ((getDAO_().getType() == null && argType != null) || (
/* 292 */       getDAO_().getType() != null && !getDAO_().getType().equals(argType))) {
/* 293 */       getDAO_().setType(argType);
/* 294 */       ev_postable = true;
/*     */     } 
/*     */     
/* 297 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStringValue() {
/* 305 */     return getDAO_().getStringValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStringValue(String argStringValue) {
/* 313 */     if (setStringValue_noev(argStringValue) && 
/* 314 */       this._events != null && 
/* 315 */       postEventsForChanges()) {
/* 316 */       this._events.post(ICustomerItemAccountActivityProperty.SET_STRINGVALUE, argStringValue);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setStringValue_noev(String argStringValue) {
/* 323 */     boolean ev_postable = false;
/*     */     
/* 325 */     if ((getDAO_().getStringValue() == null && argStringValue != null) || (
/* 326 */       getDAO_().getStringValue() != null && !getDAO_().getStringValue().equals(argStringValue))) {
/* 327 */       getDAO_().setStringValue(argStringValue);
/* 328 */       ev_postable = true;
/*     */     } 
/*     */     
/* 331 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDateValue() {
/* 339 */     return getDAO_().getDateValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDateValue(Date argDateValue) {
/* 347 */     if (setDateValue_noev(argDateValue) && 
/* 348 */       this._events != null && 
/* 349 */       postEventsForChanges()) {
/* 350 */       this._events.post(ICustomerItemAccountActivityProperty.SET_DATEVALUE, argDateValue);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setDateValue_noev(Date argDateValue) {
/* 357 */     boolean ev_postable = false;
/*     */     
/* 359 */     if ((getDAO_().getDateValue() == null && argDateValue != null) || (
/* 360 */       getDAO_().getDateValue() != null && !getDAO_().getDateValue().equals(argDateValue))) {
/* 361 */       getDAO_().setDateValue(argDateValue);
/* 362 */       ev_postable = true;
/*     */     } 
/*     */     
/* 365 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BigDecimal getDecimalValue() {
/* 373 */     return getDAO_().getDecimalValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDecimalValue(BigDecimal argDecimalValue) {
/* 381 */     if (setDecimalValue_noev(argDecimalValue) && 
/* 382 */       this._events != null && 
/* 383 */       postEventsForChanges()) {
/* 384 */       this._events.post(ICustomerItemAccountActivityProperty.SET_DECIMALVALUE, argDecimalValue);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setDecimalValue_noev(BigDecimal argDecimalValue) {
/* 391 */     boolean ev_postable = false;
/*     */     
/* 393 */     if ((getDAO_().getDecimalValue() == null && argDecimalValue != null) || (
/* 394 */       getDAO_().getDecimalValue() != null && !getDAO_().getDecimalValue().equals(argDecimalValue))) {
/* 395 */       getDAO_().setDecimalValue(argDecimalValue);
/* 396 */       ev_postable = true;
/*     */     } 
/*     */     
/* 399 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getCreateDate() {
/* 407 */     return getDAO_().getCreateDate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/* 415 */     if (setCreateDate_noev(argCreateDate) && 
/* 416 */       this._events != null && 
/* 417 */       postEventsForChanges()) {
/* 418 */       this._events.post(ICustomerItemAccountActivityProperty.SET_CREATEDATE, argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCreateDate_noev(Date argCreateDate) {
/* 425 */     boolean ev_postable = false;
/*     */     
/* 427 */     if ((getDAO_().getCreateDate() == null && argCreateDate != null) || (
/* 428 */       getDAO_().getCreateDate() != null && !getDAO_().getCreateDate().equals(argCreateDate))) {
/* 429 */       getDAO_().setCreateDate(argCreateDate);
/* 430 */       ev_postable = true;
/*     */     } 
/*     */     
/* 433 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/* 441 */     return getDAO_().getCreateUserId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/* 449 */     if (setCreateUserId_noev(argCreateUserId) && 
/* 450 */       this._events != null && 
/* 451 */       postEventsForChanges()) {
/* 452 */       this._events.post(ICustomerItemAccountActivityProperty.SET_CREATEUSERID, argCreateUserId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCreateUserId_noev(String argCreateUserId) {
/* 459 */     boolean ev_postable = false;
/*     */     
/* 461 */     if ((getDAO_().getCreateUserId() == null && argCreateUserId != null) || (
/* 462 */       getDAO_().getCreateUserId() != null && !getDAO_().getCreateUserId().equals(argCreateUserId))) {
/* 463 */       getDAO_().setCreateUserId(argCreateUserId);
/* 464 */       ev_postable = true;
/*     */     } 
/*     */     
/* 467 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getUpdateDate() {
/* 475 */     return getDAO_().getUpdateDate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/* 483 */     if (setUpdateDate_noev(argUpdateDate) && 
/* 484 */       this._events != null && 
/* 485 */       postEventsForChanges()) {
/* 486 */       this._events.post(ICustomerItemAccountActivityProperty.SET_UPDATEDATE, argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setUpdateDate_noev(Date argUpdateDate) {
/* 493 */     boolean ev_postable = false;
/*     */     
/* 495 */     if ((getDAO_().getUpdateDate() == null && argUpdateDate != null) || (
/* 496 */       getDAO_().getUpdateDate() != null && !getDAO_().getUpdateDate().equals(argUpdateDate))) {
/* 497 */       getDAO_().setUpdateDate(argUpdateDate);
/* 498 */       ev_postable = true;
/*     */     } 
/*     */     
/* 501 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/* 509 */     return getDAO_().getUpdateUserId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/* 517 */     if (setUpdateUserId_noev(argUpdateUserId) && 
/* 518 */       this._events != null && 
/* 519 */       postEventsForChanges()) {
/* 520 */       this._events.post(ICustomerItemAccountActivityProperty.SET_UPDATEUSERID, argUpdateUserId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setUpdateUserId_noev(String argUpdateUserId) {
/* 527 */     boolean ev_postable = false;
/*     */     
/* 529 */     if ((getDAO_().getUpdateUserId() == null && argUpdateUserId != null) || (
/* 530 */       getDAO_().getUpdateUserId() != null && !getDAO_().getUpdateUserId().equals(argUpdateUserId))) {
/* 531 */       getDAO_().setUpdateUserId(argUpdateUserId);
/* 532 */       ev_postable = true;
/*     */     } 
/*     */     
/* 535 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getValue(String argFieldId) {
/* 541 */     if ("CustomerItemAccountActivityPropertyExtension".equals(argFieldId)) {
/* 542 */       return this._myExtension;
/*     */     }
/*     */     
/* 545 */     return super.getValue(argFieldId);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValue(String argFieldId, Object argValue) {
/* 551 */     if ("CustomerItemAccountActivityPropertyExtension".equals(argFieldId)) {
/* 552 */       this._myExtension = (IDataModel)argValue;
/*     */     } else {
/*     */       
/* 555 */       super.setValue(argFieldId, argValue);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDependencies(IPersistenceDefaults argPD, EventManager argEM) {
/* 561 */     this._persistenceDefaults = argPD;
/* 562 */     this._daoImpl.setPersistenceDefaults(argPD);
/* 563 */     this._eventManager = argEM;
/* 564 */     this._events = (Eventor)new ModelEventor((IDataModel)this, argEM);
/* 565 */     this._eventCascade = (EventHandler)new CascadingHandler(this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void startTransaction() {
/* 570 */     if (this._alreadyInStart) {
/*     */       return;
/*     */     }
/*     */     
/* 574 */     this._alreadyInStart = true;
/*     */ 
/*     */     
/* 577 */     super.startTransaction();
/*     */ 
/*     */     
/* 580 */     this._alreadyInStart = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollbackChanges() {
/* 585 */     if (isAlreadyRolledBack()) {
/*     */       return;
/*     */     }
/* 588 */     super.rollbackChanges();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void commitTransaction() {
/* 594 */     if (this._alreadyInCommit) {
/*     */       return;
/*     */     }
/* 597 */     this._alreadyInCommit = true;
/*     */ 
/*     */     
/* 600 */     super.commitTransaction();
/*     */ 
/*     */     
/* 603 */     this._alreadyInCommit = false;
/*     */   }
/*     */ 
/*     */   
/*     */   private void readObject(ObjectInputStream argStream) throws IOException, ClassNotFoundException {
/* 608 */     argStream.defaultReadObject();
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\cat\impl\CustomerItemAccountActivityPropertyModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */