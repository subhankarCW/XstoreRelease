/*     */ package dtv.xst.dao.cat;
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
/*     */ public class CustomerAccountPlanPropertyId
/*     */   extends AbstractObjectId
/*     */ {
/*     */   private static final long serialVersionUID = -1337897459L;
/*     */   private String _custAccountCode;
/*     */   private String _planId;
/*     */   private String _propertyCode;
/*     */   
/*     */   public CustomerAccountPlanPropertyId() {}
/*     */   
/*     */   public CustomerAccountPlanPropertyId(String argObjectIdValue) {
/*  23 */     setValue(argObjectIdValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCustAccountCode() {
/*  31 */     return this._custAccountCode;
/*     */   }
/*     */   
/*     */   public void setCustAccountCode(String argCustAccountCode) {
/*  35 */     this._custAccountCode = (argCustAccountCode != null && MANAGE_CASE) ? argCustAccountCode.toUpperCase() : argCustAccountCode;
/*     */   }
/*     */   
/*     */   public String getPlanId() {
/*  39 */     return this._planId;
/*     */   }
/*     */   
/*     */   public void setPlanId(String argPlanId) {
/*  43 */     this._planId = (argPlanId != null && MANAGE_CASE) ? argPlanId.toUpperCase() : argPlanId;
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
/*  63 */       setOrganizationId(Long.valueOf(str));
/*  64 */       str = tokens[1];
/*     */       
/*  66 */       if ("null".equals(str)) {
/*  67 */         setCustAccountCode((String)null);
/*     */       } else {
/*     */         
/*  70 */         setCustAccountCode(str);
/*     */       } 
/*  72 */       str = tokens[2];
/*     */       
/*  74 */       if ("null".equals(str)) {
/*  75 */         setPlanId((String)null);
/*     */       } else {
/*     */         
/*  78 */         setPlanId(str);
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
/*  99 */     if (!(ob instanceof CustomerAccountPlanPropertyId)) {
/* 100 */       return false;
/*     */     }
/* 102 */     CustomerAccountPlanPropertyId other = (CustomerAccountPlanPropertyId)ob;
/* 103 */     return (((this._organizationId == null && other._organizationId == null) || (this._organizationId != null && this._organizationId
/*     */ 
/*     */       
/* 106 */       .equals(other._organizationId))) && ((this._custAccountCode == null && other._custAccountCode == null) || (this._custAccountCode != null && this._custAccountCode
/*     */ 
/*     */       
/* 109 */       .equals(other._custAccountCode))) && ((this._planId == null && other._planId == null) || (this._planId != null && this._planId
/*     */ 
/*     */       
/* 112 */       .equals(other._planId))) && ((this._propertyCode == null && other._propertyCode == null) || (this._propertyCode != null && this._propertyCode
/*     */ 
/*     */       
/* 115 */       .equals(other._propertyCode))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 121 */     return ((this._organizationId == null) ? 0 : this._organizationId
/* 122 */       .hashCode()) + ((this._custAccountCode == null) ? 0 : this._custAccountCode
/* 123 */       .hashCode()) + ((this._planId == null) ? 0 : this._planId
/* 124 */       .hashCode()) + ((this._propertyCode == null) ? 0 : this._propertyCode
/* 125 */       .hashCode());
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDtxTypeName() {
/* 130 */     return "CustomerAccountPlanProperty";
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 135 */     StringBuilder buff = new StringBuilder(48);
/*     */     
/* 137 */     return buff.append(
/* 138 */         String.valueOf(this._organizationId))
/* 139 */       .append("::").append(this._custAccountCode)
/* 140 */       .append("::").append(this._planId)
/* 141 */       .append("::").append(this._propertyCode)
/* 142 */       .toString();
/*     */   }
/*     */   
/*     */   public boolean validate() {
/* 146 */     if (this._custAccountCode == null) {
/* 147 */       return false;
/*     */     }
/* 149 */     if (this._planId == null) {
/* 150 */       return false;
/*     */     }
/* 152 */     if (this._propertyCode == null) {
/* 153 */       return false;
/*     */     }
/* 155 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\cat\CustomerAccountPlanPropertyId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */