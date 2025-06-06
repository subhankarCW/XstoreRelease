/*     */ package dtv.xst.dao.dsc;
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
/*     */ public class DiscountCompatabilityPropertyId
/*     */   extends AbstractObjectId
/*     */ {
/*     */   private static final long serialVersionUID = -774761860L;
/*     */   private String _compatibleDiscountCode;
/*     */   private String _primaryDiscountCode;
/*     */   private String _propertyCode;
/*     */   
/*     */   public DiscountCompatabilityPropertyId() {}
/*     */   
/*     */   public DiscountCompatabilityPropertyId(String argObjectIdValue) {
/*  23 */     setValue(argObjectIdValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCompatibleDiscountCode() {
/*  31 */     return this._compatibleDiscountCode;
/*     */   }
/*     */   
/*     */   public void setCompatibleDiscountCode(String argCompatibleDiscountCode) {
/*  35 */     this._compatibleDiscountCode = (argCompatibleDiscountCode != null && MANAGE_CASE) ? argCompatibleDiscountCode.toUpperCase() : argCompatibleDiscountCode;
/*     */   }
/*     */   
/*     */   public String getPrimaryDiscountCode() {
/*  39 */     return this._primaryDiscountCode;
/*     */   }
/*     */   
/*     */   public void setPrimaryDiscountCode(String argPrimaryDiscountCode) {
/*  43 */     this._primaryDiscountCode = (argPrimaryDiscountCode != null && MANAGE_CASE) ? argPrimaryDiscountCode.toUpperCase() : argPrimaryDiscountCode;
/*     */   }
/*     */   
/*     */   public String getPropertyCode() {
/*  47 */     return this._propertyCode;
/*     */   }
/*     */   
/*     */   public void setPropertyCode(String argPropertyCode) {
/*  51 */     this._propertyCode = (argPropertyCode != null && MANAGE_CASE) ? argPropertyCode.toUpperCase() : argPropertyCode;
/*     */   }
/*     */   
/*     */   public void setValue(String argObjectIdValue) {
/*  55 */     String str = argObjectIdValue;
/*  56 */     if (StringUtils.isEmpty(str)) {
/*  57 */       throw new DtxException("argument passed to setValue() is null or empty - a valid value must be passed");
/*     */     }
/*     */     try {
/*  60 */       String[] tokens = str.split("::");
/*  61 */       str = tokens[0];
/*     */       
/*  63 */       if ("null".equals(str)) {
/*  64 */         setCompatibleDiscountCode((String)null);
/*     */       } else {
/*     */         
/*  67 */         setCompatibleDiscountCode(str);
/*     */       } 
/*  69 */       str = tokens[1];
/*     */       
/*  71 */       setOrganizationId(Long.valueOf(str));
/*  72 */       str = tokens[2];
/*     */       
/*  74 */       if ("null".equals(str)) {
/*  75 */         setPrimaryDiscountCode((String)null);
/*     */       } else {
/*     */         
/*  78 */         setPrimaryDiscountCode(str);
/*     */       } 
/*  80 */       str = tokens[3];
/*     */       
/*  82 */       if ("null".equals(str)) {
/*  83 */         setPropertyCode((String)null);
/*     */       } else {
/*     */         
/*  86 */         setPropertyCode(str);
/*     */       }
/*     */     
/*  89 */     } catch (Exception ee) {
/*  90 */       throw new DtxException("An exception occured while parsing object id string: " + argObjectIdValue, ee);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ob) {
/*  96 */     if (this == ob) {
/*  97 */       return true;
/*     */     }
/*  99 */     if (!(ob instanceof DiscountCompatabilityPropertyId)) {
/* 100 */       return false;
/*     */     }
/* 102 */     DiscountCompatabilityPropertyId other = (DiscountCompatabilityPropertyId)ob;
/* 103 */     return (((this._compatibleDiscountCode == null && other._compatibleDiscountCode == null) || (this._compatibleDiscountCode != null && this._compatibleDiscountCode
/*     */ 
/*     */       
/* 106 */       .equals(other._compatibleDiscountCode))) && ((this._organizationId == null && other._organizationId == null) || (this._organizationId != null && this._organizationId
/*     */ 
/*     */       
/* 109 */       .equals(other._organizationId))) && ((this._primaryDiscountCode == null && other._primaryDiscountCode == null) || (this._primaryDiscountCode != null && this._primaryDiscountCode
/*     */ 
/*     */       
/* 112 */       .equals(other._primaryDiscountCode))) && ((this._propertyCode == null && other._propertyCode == null) || (this._propertyCode != null && this._propertyCode
/*     */ 
/*     */       
/* 115 */       .equals(other._propertyCode))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 121 */     return ((this._compatibleDiscountCode == null) ? 0 : this._compatibleDiscountCode
/* 122 */       .hashCode()) + ((this._organizationId == null) ? 0 : this._organizationId
/* 123 */       .hashCode()) + ((this._primaryDiscountCode == null) ? 0 : this._primaryDiscountCode
/* 124 */       .hashCode()) + ((this._propertyCode == null) ? 0 : this._propertyCode
/* 125 */       .hashCode());
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDtxTypeName() {
/* 130 */     return "DiscountCompatabilityProperty";
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 135 */     StringBuilder buff = new StringBuilder(48);
/*     */     
/* 137 */     return buff.append(this._compatibleDiscountCode)
/*     */       
/* 139 */       .append("::").append(String.valueOf(this._organizationId))
/* 140 */       .append("::").append(this._primaryDiscountCode)
/* 141 */       .append("::").append(this._propertyCode)
/* 142 */       .toString();
/*     */   }
/*     */   
/*     */   public boolean validate() {
/* 146 */     if (this._compatibleDiscountCode == null) {
/* 147 */       return false;
/*     */     }
/* 149 */     if (this._primaryDiscountCode == null) {
/* 150 */       return false;
/*     */     }
/* 152 */     if (this._propertyCode == null) {
/* 153 */       return false;
/*     */     }
/* 155 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\dsc\DiscountCompatabilityPropertyId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */