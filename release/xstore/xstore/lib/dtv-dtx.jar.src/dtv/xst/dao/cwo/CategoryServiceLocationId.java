/*     */ package dtv.xst.dao.cwo;
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
/*     */ public class CategoryServiceLocationId
/*     */   extends AbstractObjectId
/*     */ {
/*     */   private static final long serialVersionUID = 2138160268L;
/*     */   private String _serviceLocationId;
/*     */   private String _categoryId;
/*     */   
/*     */   public CategoryServiceLocationId() {}
/*     */   
/*     */   public CategoryServiceLocationId(String argObjectIdValue) {
/*  23 */     setValue(argObjectIdValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getServiceLocationId() {
/*  30 */     return this._serviceLocationId;
/*     */   }
/*     */   
/*     */   public void setServiceLocationId(String argServiceLocationId) {
/*  34 */     this._serviceLocationId = (argServiceLocationId != null && MANAGE_CASE) ? argServiceLocationId.toUpperCase() : argServiceLocationId;
/*     */   }
/*     */   
/*     */   public String getCategoryId() {
/*  38 */     return this._categoryId;
/*     */   }
/*     */   
/*     */   public void setCategoryId(String argCategoryId) {
/*  42 */     this._categoryId = (argCategoryId != null && MANAGE_CASE) ? argCategoryId.toUpperCase() : argCategoryId;
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
/*  57 */       if ("null".equals(str)) {
/*  58 */         setServiceLocationId((String)null);
/*     */       } else {
/*     */         
/*  61 */         setServiceLocationId(str);
/*     */       } 
/*  63 */       str = tokens[2];
/*     */       
/*  65 */       if ("null".equals(str)) {
/*  66 */         setCategoryId((String)null);
/*     */       } else {
/*     */         
/*  69 */         setCategoryId(str);
/*     */       }
/*     */     
/*  72 */     } catch (Exception ee) {
/*  73 */       throw new DtxException("An exception occured while parsing object id string: " + argObjectIdValue, ee);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ob) {
/*  79 */     if (this == ob) {
/*  80 */       return true;
/*     */     }
/*  82 */     if (!(ob instanceof CategoryServiceLocationId)) {
/*  83 */       return false;
/*     */     }
/*  85 */     CategoryServiceLocationId other = (CategoryServiceLocationId)ob;
/*  86 */     return (((this._organizationId == null && other._organizationId == null) || (this._organizationId != null && this._organizationId
/*     */ 
/*     */       
/*  89 */       .equals(other._organizationId))) && ((this._serviceLocationId == null && other._serviceLocationId == null) || (this._serviceLocationId != null && this._serviceLocationId
/*     */ 
/*     */       
/*  92 */       .equals(other._serviceLocationId))) && ((this._categoryId == null && other._categoryId == null) || (this._categoryId != null && this._categoryId
/*     */ 
/*     */       
/*  95 */       .equals(other._categoryId))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 101 */     return ((this._organizationId == null) ? 0 : this._organizationId
/* 102 */       .hashCode()) + ((this._serviceLocationId == null) ? 0 : this._serviceLocationId
/* 103 */       .hashCode()) + ((this._categoryId == null) ? 0 : this._categoryId
/* 104 */       .hashCode());
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDtxTypeName() {
/* 109 */     return "CategoryServiceLocation";
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 114 */     StringBuilder buff = new StringBuilder(36);
/*     */     
/* 116 */     return buff.append(
/* 117 */         String.valueOf(this._organizationId))
/* 118 */       .append("::").append(this._serviceLocationId)
/* 119 */       .append("::").append(this._categoryId)
/* 120 */       .toString();
/*     */   }
/*     */   
/*     */   public boolean validate() {
/* 124 */     if (this._serviceLocationId == null) {
/* 125 */       return false;
/*     */     }
/* 127 */     if (this._categoryId == null) {
/* 128 */       return false;
/*     */     }
/* 130 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\cwo\CategoryServiceLocationId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */