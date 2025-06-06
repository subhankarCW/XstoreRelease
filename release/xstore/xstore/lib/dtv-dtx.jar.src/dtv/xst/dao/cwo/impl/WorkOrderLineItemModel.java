/*     */ package dtv.xst.dao.cwo.impl;
/*     */ 
/*     */ import dtv.data2.IPersistenceDefaults;
/*     */ import dtv.data2.access.IDataAccessObject;
/*     */ import dtv.data2.access.IDataModel;
/*     */ import dtv.event.EventManager;
/*     */ import dtv.xst.dao.cwo.IWorkOrderLineItem;
/*     */ import dtv.xst.dao.trl.impl.SaleReturnLineItemModel;
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WorkOrderLineItemModel
/*     */   extends SaleReturnLineItemModel
/*     */   implements IWorkOrderLineItem
/*     */ {
/*     */   private static final long serialVersionUID = -2040221980L;
/*     */   private transient boolean _alreadyInStart = false;
/*     */   private transient boolean _alreadyInCommit = false;
/*     */   private IDataModel _myExtension;
/*     */   
/*     */   public void initDAO() {
/*  30 */     setDAO((IDataAccessObject)new WorkOrderLineItemDAO());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private WorkOrderLineItemDAO getDAO_() {
/*  38 */     return (WorkOrderLineItemDAO)this._daoImpl;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getCreateDate() {
/*  46 */     return getDAO_().getCreateDate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreateDate(Date argCreateDate) {
/*  54 */     if (setCreateDate_noev(argCreateDate) && 
/*  55 */       this._events != null && 
/*  56 */       postEventsForChanges()) {
/*  57 */       this._events.post(IWorkOrderLineItem.SET_CREATEDATE, argCreateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCreateDate_noev(Date argCreateDate) {
/*  64 */     boolean ev_postable = false;
/*     */     
/*  66 */     if ((getDAO_().getCreateDate() == null && argCreateDate != null) || (
/*  67 */       getDAO_().getCreateDate() != null && !getDAO_().getCreateDate().equals(argCreateDate))) {
/*  68 */       getDAO_().setCreateDate(argCreateDate);
/*  69 */       ev_postable = true;
/*     */     } 
/*     */     
/*  72 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCreateUserId() {
/*  80 */     return getDAO_().getCreateUserId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCreateUserId(String argCreateUserId) {
/*  88 */     if (setCreateUserId_noev(argCreateUserId) && 
/*  89 */       this._events != null && 
/*  90 */       postEventsForChanges()) {
/*  91 */       this._events.post(IWorkOrderLineItem.SET_CREATEUSERID, argCreateUserId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setCreateUserId_noev(String argCreateUserId) {
/*  98 */     boolean ev_postable = false;
/*     */     
/* 100 */     if ((getDAO_().getCreateUserId() == null && argCreateUserId != null) || (
/* 101 */       getDAO_().getCreateUserId() != null && !getDAO_().getCreateUserId().equals(argCreateUserId))) {
/* 102 */       getDAO_().setCreateUserId(argCreateUserId);
/* 103 */       ev_postable = true;
/*     */     } 
/*     */     
/* 106 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getUpdateDate() {
/* 114 */     return getDAO_().getUpdateDate();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUpdateDate(Date argUpdateDate) {
/* 122 */     if (setUpdateDate_noev(argUpdateDate) && 
/* 123 */       this._events != null && 
/* 124 */       postEventsForChanges()) {
/* 125 */       this._events.post(IWorkOrderLineItem.SET_UPDATEDATE, argUpdateDate);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setUpdateDate_noev(Date argUpdateDate) {
/* 132 */     boolean ev_postable = false;
/*     */     
/* 134 */     if ((getDAO_().getUpdateDate() == null && argUpdateDate != null) || (
/* 135 */       getDAO_().getUpdateDate() != null && !getDAO_().getUpdateDate().equals(argUpdateDate))) {
/* 136 */       getDAO_().setUpdateDate(argUpdateDate);
/* 137 */       ev_postable = true;
/*     */     } 
/*     */     
/* 140 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUpdateUserId() {
/* 148 */     return getDAO_().getUpdateUserId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUpdateUserId(String argUpdateUserId) {
/* 156 */     if (setUpdateUserId_noev(argUpdateUserId) && 
/* 157 */       this._events != null && 
/* 158 */       postEventsForChanges()) {
/* 159 */       this._events.post(IWorkOrderLineItem.SET_UPDATEUSERID, argUpdateUserId);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setUpdateUserId_noev(String argUpdateUserId) {
/* 166 */     boolean ev_postable = false;
/*     */     
/* 168 */     if ((getDAO_().getUpdateUserId() == null && argUpdateUserId != null) || (
/* 169 */       getDAO_().getUpdateUserId() != null && !getDAO_().getUpdateUserId().equals(argUpdateUserId))) {
/* 170 */       getDAO_().setUpdateUserId(argUpdateUserId);
/* 171 */       ev_postable = true;
/*     */     } 
/*     */     
/* 174 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPriceStatus() {
/* 182 */     return getDAO_().getPriceStatus();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPriceStatus(String argPriceStatus) {
/* 190 */     if (setPriceStatus_noev(argPriceStatus) && 
/* 191 */       this._events != null && 
/* 192 */       postEventsForChanges()) {
/* 193 */       this._events.post(IWorkOrderLineItem.SET_PRICESTATUS, argPriceStatus);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setPriceStatus_noev(String argPriceStatus) {
/* 200 */     boolean ev_postable = false;
/*     */     
/* 202 */     if ((getDAO_().getPriceStatus() == null && argPriceStatus != null) || (
/* 203 */       getDAO_().getPriceStatus() != null && !getDAO_().getPriceStatus().equals(argPriceStatus))) {
/* 204 */       getDAO_().setPriceStatus(argPriceStatus);
/* 205 */       ev_postable = true;
/*     */     } 
/*     */     
/* 208 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getInstructions() {
/* 216 */     return getDAO_().getInstructions();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInstructions(String argInstructions) {
/* 224 */     if (setInstructions_noev(argInstructions) && 
/* 225 */       this._events != null && 
/* 226 */       postEventsForChanges()) {
/* 227 */       this._events.post(IWorkOrderLineItem.SET_INSTRUCTIONS, argInstructions);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setInstructions_noev(String argInstructions) {
/* 234 */     boolean ev_postable = false;
/*     */     
/* 236 */     if ((getDAO_().getInstructions() == null && argInstructions != null) || (
/* 237 */       getDAO_().getInstructions() != null && !getDAO_().getInstructions().equals(argInstructions))) {
/* 238 */       getDAO_().setInstructions(argInstructions);
/* 239 */       ev_postable = true;
/*     */     } 
/*     */     
/* 242 */     return ev_postable;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getValue(String argFieldId) {
/* 248 */     if ("WorkOrderLineItemExtension".equals(argFieldId)) {
/* 249 */       return this._myExtension;
/*     */     }
/*     */     
/* 252 */     return super.getValue(argFieldId);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValue(String argFieldId, Object argValue) {
/* 258 */     if ("WorkOrderLineItemExtension".equals(argFieldId)) {
/* 259 */       this._myExtension = (IDataModel)argValue;
/*     */     } else {
/*     */       
/* 262 */       super.setValue(argFieldId, argValue);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDependencies(IPersistenceDefaults argPD, EventManager argEM) {
/* 268 */     super.setDependencies(argPD, argEM);
/*     */   }
/*     */   
/*     */   public IDataModel getWorkOrderLineItemExt() {
/* 272 */     return this._myExtension;
/*     */   }
/*     */   
/*     */   public void setWorkOrderLineItemExt(IDataModel argExt) {
/* 276 */     this._myExtension = argExt;
/*     */   }
/*     */ 
/*     */   
/*     */   public void startTransaction() {
/* 281 */     if (this._alreadyInStart) {
/*     */       return;
/*     */     }
/*     */     
/* 285 */     this._alreadyInStart = true;
/*     */ 
/*     */     
/* 288 */     super.startTransaction();
/*     */ 
/*     */     
/* 291 */     this._alreadyInStart = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollbackChanges() {
/* 296 */     if (isAlreadyRolledBack()) {
/*     */       return;
/*     */     }
/* 299 */     super.rollbackChanges();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void commitTransaction() {
/* 305 */     if (this._alreadyInCommit) {
/*     */       return;
/*     */     }
/* 308 */     this._alreadyInCommit = true;
/*     */ 
/*     */     
/* 311 */     super.commitTransaction();
/*     */ 
/*     */     
/* 314 */     this._alreadyInCommit = false;
/*     */   }
/*     */ 
/*     */   
/*     */   private void readObject(ObjectInputStream argStream) throws IOException, ClassNotFoundException {
/* 319 */     argStream.defaultReadObject();
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\cwo\impl\WorkOrderLineItemModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */