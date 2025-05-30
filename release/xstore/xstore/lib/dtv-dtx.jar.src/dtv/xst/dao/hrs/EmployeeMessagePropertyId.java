/*     */ package dtv.xst.dao.hrs;
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
/*     */ public class EmployeeMessagePropertyId
/*     */   extends AbstractObjectId
/*     */ {
/*     */   private static final long serialVersionUID = 569049678L;
/*     */   private Long _messageId;
/*     */   private String _propertyCode;
/*     */   
/*     */   public EmployeeMessagePropertyId() {}
/*     */   
/*     */   public EmployeeMessagePropertyId(String argObjectIdValue) {
/*  23 */     setValue(argObjectIdValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Long getMessageId() {
/*  30 */     return this._messageId;
/*     */   }
/*     */   
/*     */   public void setMessageId(Long argMessageId) {
/*  34 */     this._messageId = argMessageId;
/*     */   }
/*     */   
/*     */   public String getPropertyCode() {
/*  38 */     return this._propertyCode;
/*     */   }
/*     */   
/*     */   public void setPropertyCode(String argPropertyCode) {
/*  42 */     this._propertyCode = (argPropertyCode != null && MANAGE_CASE) ? argPropertyCode.toUpperCase() : argPropertyCode;
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
/*  57 */       setMessageId(Long.valueOf(str));
/*  58 */       str = tokens[2];
/*     */       
/*  60 */       if ("null".equals(str)) {
/*  61 */         setPropertyCode((String)null);
/*     */       } else {
/*     */         
/*  64 */         setPropertyCode(str);
/*     */       }
/*     */     
/*  67 */     } catch (Exception ee) {
/*  68 */       throw new DtxException("An exception occured while parsing object id string: " + argObjectIdValue, ee);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ob) {
/*  74 */     if (this == ob) {
/*  75 */       return true;
/*     */     }
/*  77 */     if (!(ob instanceof EmployeeMessagePropertyId)) {
/*  78 */       return false;
/*     */     }
/*  80 */     EmployeeMessagePropertyId other = (EmployeeMessagePropertyId)ob;
/*  81 */     return (((this._organizationId == null && other._organizationId == null) || (this._organizationId != null && this._organizationId
/*     */ 
/*     */       
/*  84 */       .equals(other._organizationId))) && ((this._messageId == null && other._messageId == null) || (this._messageId != null && this._messageId
/*     */ 
/*     */       
/*  87 */       .equals(other._messageId))) && ((this._propertyCode == null && other._propertyCode == null) || (this._propertyCode != null && this._propertyCode
/*     */ 
/*     */       
/*  90 */       .equals(other._propertyCode))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  96 */     return ((this._organizationId == null) ? 0 : this._organizationId
/*  97 */       .hashCode()) + ((this._messageId == null) ? 0 : this._messageId
/*  98 */       .hashCode()) + ((this._propertyCode == null) ? 0 : this._propertyCode
/*  99 */       .hashCode());
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDtxTypeName() {
/* 104 */     return "EmployeeMessageProperty";
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 109 */     StringBuilder buff = new StringBuilder(36);
/*     */     
/* 111 */     return buff.append(
/* 112 */         String.valueOf(this._organizationId))
/* 113 */       .append("::").append(String.valueOf(this._messageId))
/* 114 */       .append("::").append(this._propertyCode)
/* 115 */       .toString();
/*     */   }
/*     */   
/*     */   public boolean validate() {
/* 119 */     if (this._messageId == null) {
/* 120 */       return false;
/*     */     }
/* 122 */     if (this._propertyCode == null) {
/* 123 */       return false;
/*     */     }
/* 125 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\hrs\EmployeeMessagePropertyId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */