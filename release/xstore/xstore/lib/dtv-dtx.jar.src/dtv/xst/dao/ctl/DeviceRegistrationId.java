/*     */ package dtv.xst.dao.ctl;
/*     */ 
/*     */ import dtv.data2.access.AbstractObjectId;
/*     */ import dtv.data2.access.exception.DtxException;
/*     */ import dtv.util.StringUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DeviceRegistrationId
/*     */   extends AbstractObjectId
/*     */ {
/*     */   private static final long serialVersionUID = 163923535L;
/*     */   private Long _retailLocationId;
/*     */   private Long _workstationId;
/*     */   
/*     */   public DeviceRegistrationId() {}
/*     */   
/*     */   public DeviceRegistrationId(String argObjectIdValue) {
/*  23 */     setValue(argObjectIdValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Long getRetailLocationId() {
/*  30 */     return this._retailLocationId;
/*     */   }
/*     */   
/*     */   public void setRetailLocationId(Long argRetailLocationId) {
/*  34 */     this._retailLocationId = argRetailLocationId;
/*     */   }
/*     */   
/*     */   public Long getWorkstationId() {
/*  38 */     return this._workstationId;
/*     */   }
/*     */   
/*     */   public void setWorkstationId(Long argWorkstationId) {
/*  42 */     this._workstationId = argWorkstationId;
/*     */   }
/*     */   
/*     */   public void setValue(String argObjectIdValue) {
/*  46 */     String str = argObjectIdValue;
/*  47 */     if (StringUtils.isEmpty(str)) {
/*  48 */       throw new DtxException("argument passed to setValue() is null or empty - a valid value must be passed");
/*     */     }
/*     */     try {
/*  51 */       String[] tokens = str.split("::");
/*  52 */       str = tokens[0];
/*     */       
/*  54 */       setOrganizationId(Long.valueOf(str));
/*  55 */       str = tokens[1];
/*     */       
/*  57 */       setRetailLocationId(Long.valueOf(str));
/*  58 */       str = tokens[2];
/*     */       
/*  60 */       setWorkstationId(Long.valueOf(str));
/*     */     }
/*  62 */     catch (Exception ee) {
/*  63 */       throw new DtxException("An exception occured while parsing object id string: " + argObjectIdValue, ee);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ob) {
/*  69 */     if (this == ob) {
/*  70 */       return true;
/*     */     }
/*  72 */     if (!(ob instanceof DeviceRegistrationId)) {
/*  73 */       return false;
/*     */     }
/*  75 */     DeviceRegistrationId other = (DeviceRegistrationId)ob;
/*  76 */     return (((this._organizationId == null && other._organizationId == null) || (this._organizationId != null && this._organizationId
/*     */ 
/*     */       
/*  79 */       .equals(other._organizationId))) && ((this._retailLocationId == null && other._retailLocationId == null) || (this._retailLocationId != null && this._retailLocationId
/*     */ 
/*     */       
/*  82 */       .equals(other._retailLocationId))) && ((this._workstationId == null && other._workstationId == null) || (this._workstationId != null && this._workstationId
/*     */ 
/*     */       
/*  85 */       .equals(other._workstationId))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  91 */     return ((this._organizationId == null) ? 0 : this._organizationId
/*  92 */       .hashCode()) + ((this._retailLocationId == null) ? 0 : this._retailLocationId
/*  93 */       .hashCode()) + ((this._workstationId == null) ? 0 : this._workstationId
/*  94 */       .hashCode());
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDtxTypeName() {
/*  99 */     return "DeviceRegistration";
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 104 */     StringBuilder buff = new StringBuilder(36);
/*     */     
/* 106 */     return buff.append(
/* 107 */         String.valueOf(this._organizationId))
/* 108 */       .append("::").append(String.valueOf(this._retailLocationId))
/* 109 */       .append("::").append(String.valueOf(this._workstationId))
/* 110 */       .toString();
/*     */   }
/*     */   
/*     */   public boolean validate() {
/* 114 */     if (this._retailLocationId == null) {
/* 115 */       return false;
/*     */     }
/* 117 */     if (this._workstationId == null) {
/* 118 */       return false;
/*     */     }
/* 120 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\ctl\DeviceRegistrationId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */