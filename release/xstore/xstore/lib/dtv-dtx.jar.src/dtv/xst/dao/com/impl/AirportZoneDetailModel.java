/*     */ package dtv.xst.dao.com.impl;
/*     */ import dtv.data2.IPersistenceDefaults;
/*     */ import dtv.data2.access.IDataAccessObject;
/*     */ import dtv.data2.access.IDataModel;
/*     */ import dtv.data2.access.IDataProperty;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.ModelEventor;
/*     */ import dtv.data2.access.impl.IDataModelImpl;
/*     */ import dtv.data2.access.impl.Relationship;
/*     */ import dtv.event.EventDescriptor;
/*     */ import dtv.event.EventManager;
/*     */ import dtv.event.Eventor;
/*     */ import dtv.event.IEventAware;
/*     */ import dtv.event.IEventSource;
/*     */ import dtv.event.handler.CascadingHandler;
/*     */ import dtv.util.HistoricalList;
/*     */ import dtv.util.StringUtils;
/*     */ import dtv.xst.dao.com.AirportZoneDetailPropertyId;
/*     */ import dtv.xst.dao.com.IAirportZoneDetail;
/*     */ import dtv.xst.dao.com.IAirportZoneDetailProperty;
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ public class AirportZoneDetailModel extends AbstractDataModelWithPropertyImpl<IAirportZoneDetailProperty> implements IAirportZoneDetail {
/*     */   private static final long serialVersionUID = 1260580392L;
/*     */   private transient boolean _alreadyInStart = false;
/*     */   private transient boolean _alreadyInCommit = false;
/*     */   
/*     */   public String toString() {
/*  33 */     return super.toString() + " Id: " + getObjectId();
/*     */   }
/*     */   private IDataModel _myExtension; private HistoricalList<IAirportZoneDetailProperty> _properties; private transient HistoricalList<IAirportZoneDetailProperty> _propertiesSavepoint;
/*     */   
/*     */   public void initDAO() {
/*  38 */     setDAO((IDataAccessObject)new AirportZoneDetailDAO());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private AirportZoneDetailDAO getDAO_() {
/*  46 */     return (AirportZoneDetailDAO)this._daoImpl;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getOrganizationId() {
/*  54 */     if (getDAO_().getOrganizationId() != null) {
/*  55 */       return getDAO_().getOrganizationId().longValue();
/*     */     }
/*     */     
/*  58 */     return 0L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrganizationId(long argOrganizationId) {
/*  67 */     if (setOrganizationId_noev(argOrganizationId) && 
/*  68 */       this._events != null && 
/*  69 */       postEventsForChanges()) {
/*  70 */       this._events.post(IAirportZoneDetail.SET_ORGANIZATIONID, Long.valueOf(argOrganizationId));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setOrganizationId_noev(long argOrganizationId) {
/*  77 */     boolean ev_postable = false;
/*     */     
/*  79 */     if ((getDAO_().getOrganizationId() == null && Long.valueOf(argOrganizationId) != null) || (
/*  80 */       getDAO_().getOrganizationId() != null && !getDAO_().getOrganizationId().equals(Long.valueOf(argOrganizationId)))) {
/*  81 */       getDAO_().setOrganizationId(Long.valueOf(argOrganizationId));
/*  82 */       ev_postable = true;
/*  83 */       if (this._properties != null) {
/*     */         
/*  85 */         Iterator<AirportZoneDetailPropertyModel> it = this._properties.iterator();
/*  86 */         while (it.hasNext())
/*     */         {
/*  88 */           ((AirportZoneDetailPropertyModel)it.next()).setOrganizationId_noev(argOrganizationId);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  93 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getZoneId() {
/* 101 */     return getDAO_().getZoneId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setZoneId(String argZoneId) {
/* 109 */     if (setZoneId_noev(argZoneId) && 
/* 110 */       this._events != null && 
/* 111 */       postEventsForChanges()) {
/* 112 */       this._events.post(IAirportZoneDetail.SET_ZONEID, argZoneId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setZoneId_noev(String argZoneId) {
/* 119 */     boolean ev_postable = false;
/*     */     
/* 121 */     if ((getDAO_().getZoneId() == null && argZoneId != null) || (
/* 122 */       getDAO_().getZoneId() != null && !getDAO_().getZoneId().equals(argZoneId))) {
/* 123 */       getDAO_().setZoneId(argZoneId);
/* 124 */       ev_postable = true;
/* 125 */       if (this._properties != null) {
/*     */         
/* 127 */         Iterator<AirportZoneDetailPropertyModel> it = this._properties.iterator();
/* 128 */         while (it.hasNext())
/*     */         {
/* 130 */           ((AirportZoneDetailPropertyModel)it.next()).setZoneId_noev(argZoneId);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 135 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDestinationZoneId() {
/* 143 */     return getDAO_().getDestinationZoneId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDestinationZoneId(String argDestinationZoneId) {
/* 151 */     if (setDestinationZoneId_noev(argDestinationZoneId) && 
/* 152 */       this._events != null && 
/* 153 */       postEventsForChanges()) {
/* 154 */       this._events.post(IAirportZoneDetail.SET_DESTINATIONZONEID, argDestinationZoneId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setDestinationZoneId_noev(String argDestinationZoneId) {
/* 161 */     boolean ev_postable = false;
/*     */     
/* 163 */     if ((getDAO_().getDestinationZoneId() == null && argDestinationZoneId != null) || (
/* 164 */       getDAO_().getDestinationZoneId() != null && !getDAO_().getDestinationZoneId().equals(argDestinationZoneId))) {
/* 165 */       getDAO_().setDestinationZoneId(argDestinationZoneId);
/* 166 */       ev_postable = true;
/* 167 */       if (this._properties != null) {
/*     */         
/* 169 */         Iterator<AirportZoneDetailPropertyModel> it = this._properties.iterator();
/* 170 */         while (it.hasNext())
/*     */         {
/* 172 */           ((AirportZoneDetailPropertyModel)it.next()).setDestinationZoneId_noev(argDestinationZoneId);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 177 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getCreateDate() {
/* 185 */     return getDAO_().getCreateDate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/* 193 */     if (setCreateDate_noev(argCreateDate) && 
/* 194 */       this._events != null && 
/* 195 */       postEventsForChanges()) {
/* 196 */       this._events.post(IAirportZoneDetail.SET_CREATEDATE, argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCreateDate_noev(Date argCreateDate) {
/* 203 */     boolean ev_postable = false;
/*     */     
/* 205 */     if ((getDAO_().getCreateDate() == null && argCreateDate != null) || (
/* 206 */       getDAO_().getCreateDate() != null && !getDAO_().getCreateDate().equals(argCreateDate))) {
/* 207 */       getDAO_().setCreateDate(argCreateDate);
/* 208 */       ev_postable = true;
/*     */     } 
/*     */     
/* 211 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/* 219 */     return getDAO_().getCreateUserId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/* 227 */     if (setCreateUserId_noev(argCreateUserId) && 
/* 228 */       this._events != null && 
/* 229 */       postEventsForChanges()) {
/* 230 */       this._events.post(IAirportZoneDetail.SET_CREATEUSERID, argCreateUserId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCreateUserId_noev(String argCreateUserId) {
/* 237 */     boolean ev_postable = false;
/*     */     
/* 239 */     if ((getDAO_().getCreateUserId() == null && argCreateUserId != null) || (
/* 240 */       getDAO_().getCreateUserId() != null && !getDAO_().getCreateUserId().equals(argCreateUserId))) {
/* 241 */       getDAO_().setCreateUserId(argCreateUserId);
/* 242 */       ev_postable = true;
/*     */     } 
/*     */     
/* 245 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getUpdateDate() {
/* 253 */     return getDAO_().getUpdateDate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/* 261 */     if (setUpdateDate_noev(argUpdateDate) && 
/* 262 */       this._events != null && 
/* 263 */       postEventsForChanges()) {
/* 264 */       this._events.post(IAirportZoneDetail.SET_UPDATEDATE, argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setUpdateDate_noev(Date argUpdateDate) {
/* 271 */     boolean ev_postable = false;
/*     */     
/* 273 */     if ((getDAO_().getUpdateDate() == null && argUpdateDate != null) || (
/* 274 */       getDAO_().getUpdateDate() != null && !getDAO_().getUpdateDate().equals(argUpdateDate))) {
/* 275 */       getDAO_().setUpdateDate(argUpdateDate);
/* 276 */       ev_postable = true;
/*     */     } 
/*     */     
/* 279 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/* 287 */     return getDAO_().getUpdateUserId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/* 295 */     if (setUpdateUserId_noev(argUpdateUserId) && 
/* 296 */       this._events != null && 
/* 297 */       postEventsForChanges()) {
/* 298 */       this._events.post(IAirportZoneDetail.SET_UPDATEUSERID, argUpdateUserId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setUpdateUserId_noev(String argUpdateUserId) {
/* 305 */     boolean ev_postable = false;
/*     */     
/* 307 */     if ((getDAO_().getUpdateUserId() == null && argUpdateUserId != null) || (
/* 308 */       getDAO_().getUpdateUserId() != null && !getDAO_().getUpdateUserId().equals(argUpdateUserId))) {
/* 309 */       getDAO_().setUpdateUserId(argUpdateUserId);
/* 310 */       ev_postable = true;
/*     */     } 
/*     */     
/* 313 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTaxCalculationMode() {
/* 321 */     return getDAO_().getTaxCalculationMode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTaxCalculationMode(String argTaxCalculationMode) {
/* 329 */     if (setTaxCalculationMode_noev(argTaxCalculationMode) && 
/* 330 */       this._events != null && 
/* 331 */       postEventsForChanges()) {
/* 332 */       this._events.post(IAirportZoneDetail.SET_TAXCALCULATIONMODE, argTaxCalculationMode);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setTaxCalculationMode_noev(String argTaxCalculationMode) {
/* 339 */     boolean ev_postable = false;
/*     */     
/* 341 */     if ((getDAO_().getTaxCalculationMode() == null && argTaxCalculationMode != null) || (
/* 342 */       getDAO_().getTaxCalculationMode() != null && !getDAO_().getTaxCalculationMode().equals(argTaxCalculationMode))) {
/* 343 */       getDAO_().setTaxCalculationMode(argTaxCalculationMode);
/* 344 */       ev_postable = true;
/*     */     } 
/*     */     
/* 347 */     return ev_postable;
/*     */   }
/*     */   
/*     */   protected IAirportZoneDetailProperty newProperty(String argPropertyName) {
/* 351 */     AirportZoneDetailPropertyId id = new AirportZoneDetailPropertyId();
/*     */     
/* 353 */     id.setZoneId(getZoneId());
/* 354 */     id.setDestinationZoneId(getDestinationZoneId());
/* 355 */     id.setPropertyCode(argPropertyName);
/*     */     
/* 357 */     IAirportZoneDetailProperty prop = (IAirportZoneDetailProperty)DataFactory.getInstance().createNewObject((IObjectId)id, IAirportZoneDetailProperty.class);
/* 358 */     return prop;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Relationship(name = "Properties")
/*     */   public List<IAirportZoneDetailProperty> getProperties() {
/* 367 */     if (this._properties == null) {
/* 368 */       this._properties = new HistoricalList(null);
/*     */     }
/* 370 */     return (List<IAirportZoneDetailProperty>)this._properties;
/*     */   }
/*     */   
/*     */   public void setProperties(List<IAirportZoneDetailProperty> argProperties) {
/* 374 */     if (this._properties == null) {
/* 375 */       this._properties = new HistoricalList(argProperties);
/*     */     } else {
/* 377 */       this._properties.setCurrentList(argProperties);
/*     */     } 
/*     */     
/* 380 */     for (IAirportZoneDetailProperty child : this._properties) {
/* 381 */       AirportZoneDetailPropertyModel model = (AirportZoneDetailPropertyModel)child;
/* 382 */       model.setOrganizationId_noev(getOrganizationId());
/* 383 */       model.setZoneId_noev(getZoneId());
/* 384 */       model.setDestinationZoneId_noev(getDestinationZoneId());
/* 385 */       if (child instanceof IDataModelImpl) {
/* 386 */         IDataAccessObject childDao = ((IDataModelImpl)child).getDAO();
/* 387 */         if (StringUtils.isEmpty(childDao.getOriginDataSource()) && 
/* 388 */           !StringUtils.isEmpty(getDAO().getOriginDataSource())) {
/* 389 */           childDao.setOriginDataSource(getDAO().getOriginDataSource());
/*     */         }
/*     */       } 
/* 392 */       if (postEventsForChanges()) {
/* 393 */         this._eventManager.registerEventHandler((IEventAware)this._eventCascade, (IEventSource)child);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void addAirportZoneDetailProperty(IAirportZoneDetailProperty argAirportZoneDetailProperty) {
/* 399 */     if (this._properties == null) {
/* 400 */       this._properties = new HistoricalList(null);
/*     */     }
/* 402 */     argAirportZoneDetailProperty.setOrganizationId(getOrganizationId());
/* 403 */     argAirportZoneDetailProperty.setZoneId(getZoneId());
/* 404 */     argAirportZoneDetailProperty.setDestinationZoneId(getDestinationZoneId());
/* 405 */     if (argAirportZoneDetailProperty instanceof IDataModelImpl) {
/* 406 */       IDataAccessObject childDao = ((IDataModelImpl)argAirportZoneDetailProperty).getDAO();
/* 407 */       if (StringUtils.isEmpty(childDao.getOriginDataSource()) && 
/* 408 */         !StringUtils.isEmpty(getDAO().getOriginDataSource())) {
/* 409 */         childDao.setOriginDataSource(getDAO().getOriginDataSource());
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 414 */     if (postEventsForChanges()) {
/* 415 */       this._eventManager.registerEventHandler((IEventAware)this._eventCascade, (IEventSource)new EventDescriptor(argAirportZoneDetailProperty));
/*     */     }
/*     */     
/* 418 */     this._properties.add(argAirportZoneDetailProperty);
/* 419 */     if (postEventsForChanges()) {
/* 420 */       this._events.post(IAirportZoneDetail.ADD_PROPERTIES, argAirportZoneDetailProperty);
/*     */     }
/*     */   }
/*     */   
/*     */   public void removeAirportZoneDetailProperty(IAirportZoneDetailProperty argAirportZoneDetailProperty) {
/* 425 */     if (this._properties != null) {
/*     */       
/* 427 */       if (postEventsForChanges()) {
/* 428 */         this._eventManager.deregisterEventHandler((IEventAware)this._eventCascade, (IEventSource)new EventDescriptor(argAirportZoneDetailProperty));
/*     */       }
/* 430 */       this._properties.remove(argAirportZoneDetailProperty);
/* 431 */       if (postEventsForChanges()) {
/* 432 */         this._events.post(IAirportZoneDetail.REMOVE_PROPERTIES, argAirportZoneDetailProperty);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getValue(String argFieldId) {
/* 439 */     if ("Properties".equals(argFieldId)) {
/* 440 */       return getProperties();
/*     */     }
/* 442 */     if ("AirportZoneDetailExtension".equals(argFieldId)) {
/* 443 */       return this._myExtension;
/*     */     }
/*     */     
/* 446 */     return super.getValue(argFieldId);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValue(String argFieldId, Object argValue) {
/* 452 */     if ("Properties".equals(argFieldId)) {
/* 453 */       setProperties(changeToList(argValue, IAirportZoneDetailProperty.class));
/*     */     }
/* 455 */     else if ("AirportZoneDetailExtension".equals(argFieldId)) {
/* 456 */       this._myExtension = (IDataModel)argValue;
/*     */     } else {
/*     */       
/* 459 */       super.setValue(argFieldId, argValue);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDependencies(IPersistenceDefaults argPD, EventManager argEM) {
/* 465 */     this._persistenceDefaults = argPD;
/* 466 */     this._daoImpl.setPersistenceDefaults(argPD);
/* 467 */     this._eventManager = argEM;
/* 468 */     this._events = (Eventor)new ModelEventor((IDataModel)this, argEM);
/* 469 */     this._eventCascade = (EventHandler)new CascadingHandler(this);
/* 470 */     if (this._properties != null) {
/* 471 */       for (IAirportZoneDetailProperty relationship : this._properties) {
/* 472 */         ((IDataModelImpl)relationship).setDependencies(argPD, argEM);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public IDataModel getAirportZoneDetailExt() {
/* 478 */     return this._myExtension;
/*     */   }
/*     */   
/*     */   public void setAirportZoneDetailExt(IDataModel argExt) {
/* 482 */     this._myExtension = argExt;
/*     */   }
/*     */ 
/*     */   
/*     */   public void startTransaction() {
/* 487 */     if (this._alreadyInStart) {
/*     */       return;
/*     */     }
/*     */     
/* 491 */     this._alreadyInStart = true;
/*     */ 
/*     */     
/* 494 */     super.startTransaction();
/*     */     
/* 496 */     this._propertiesSavepoint = this._properties;
/* 497 */     if (this._properties != null) {
/* 498 */       this._propertiesSavepoint = new HistoricalList((List)this._properties);
/* 499 */       Iterator<IDataModel> it = this._properties.iterator();
/* 500 */       while (it.hasNext()) {
/* 501 */         ((IDataModel)it.next()).startTransaction();
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 506 */     this._alreadyInStart = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollbackChanges() {
/* 511 */     if (isAlreadyRolledBack()) {
/*     */       return;
/*     */     }
/* 514 */     super.rollbackChanges();
/*     */     
/* 516 */     this._properties = this._propertiesSavepoint;
/* 517 */     this._propertiesSavepoint = null;
/* 518 */     if (this._properties != null) {
/* 519 */       Iterator<IDataModel> it = this._properties.iterator();
/* 520 */       while (it.hasNext()) {
/* 521 */         ((IDataModel)it.next()).rollbackChanges();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void commitTransaction() {
/* 529 */     if (this._alreadyInCommit) {
/*     */       return;
/*     */     }
/* 532 */     this._alreadyInCommit = true;
/*     */ 
/*     */     
/* 535 */     super.commitTransaction();
/*     */     
/* 537 */     this._propertiesSavepoint = this._properties;
/* 538 */     if (this._properties != null) {
/* 539 */       Iterator<IDataModel> it = this._properties.iterator();
/* 540 */       while (it.hasNext()) {
/* 541 */         ((IDataModel)it.next()).commitTransaction();
/*     */       }
/* 543 */       this._properties = new HistoricalList((List)this._properties);
/*     */     } 
/*     */ 
/*     */     
/* 547 */     this._alreadyInCommit = false;
/*     */   }
/*     */ 
/*     */   
/*     */   private void readObject(ObjectInputStream argStream) throws IOException, ClassNotFoundException {
/* 552 */     argStream.defaultReadObject();
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\com\impl\AirportZoneDetailModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */