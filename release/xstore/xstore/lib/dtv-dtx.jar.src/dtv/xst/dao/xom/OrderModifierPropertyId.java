/*     */ package dtv.xst.dao.xom;
/*     */ 
/*     */ import dtv.data2.access.AbstractObjectId;
/*     */ import dtv.data2.access.exception.DtxException;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.util.StringUtils;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class OrderModifierPropertyId
/*     */   extends AbstractObjectId
/*     */ {
/*     */   private static final long serialVersionUID = 152714522L;
/*     */   private Long _retailLocationId;
/*     */   private DtvDate _businessDate;
/*     */   private Long _workstationId;
/*     */   private Long _transactionSequence;
/*     */   private Integer _retailTransactionLineItemSequence;
/*     */   private String _propertyCode;
/*     */   
/*     */   public OrderModifierPropertyId() {}
/*     */   
/*     */   public OrderModifierPropertyId(String argObjectIdValue) {
/*  25 */     setValue(argObjectIdValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Long getRetailLocationId() {
/*  36 */     return this._retailLocationId;
/*     */   }
/*     */   
/*     */   public void setRetailLocationId(Long argRetailLocationId) {
/*  40 */     this._retailLocationId = argRetailLocationId;
/*     */   }
/*     */   
/*     */   public Date getBusinessDate() {
/*  44 */     return (Date)this._businessDate;
/*     */   }
/*     */   
/*     */   public void setBusinessDate(Date argBusinessDate) {
/*  48 */     this._businessDate = (argBusinessDate == null || argBusinessDate instanceof DtvDate) ? (DtvDate)argBusinessDate : new DtvDate(argBusinessDate);
/*     */   }
/*     */ 
/*     */   
/*     */   public Long getWorkstationId() {
/*  53 */     return this._workstationId;
/*     */   }
/*     */   
/*     */   public void setWorkstationId(Long argWorkstationId) {
/*  57 */     this._workstationId = argWorkstationId;
/*     */   }
/*     */   
/*     */   public Long getTransactionSequence() {
/*  61 */     return this._transactionSequence;
/*     */   }
/*     */   
/*     */   public void setTransactionSequence(Long argTransactionSequence) {
/*  65 */     this._transactionSequence = argTransactionSequence;
/*     */   }
/*     */   
/*     */   public Integer getRetailTransactionLineItemSequence() {
/*  69 */     return this._retailTransactionLineItemSequence;
/*     */   }
/*     */   
/*     */   public void setRetailTransactionLineItemSequence(Integer argRetailTransactionLineItemSequence) {
/*  73 */     this._retailTransactionLineItemSequence = argRetailTransactionLineItemSequence;
/*     */   }
/*     */   
/*     */   public String getPropertyCode() {
/*  77 */     return this._propertyCode;
/*     */   }
/*     */   
/*     */   public void setPropertyCode(String argPropertyCode) {
/*  81 */     this._propertyCode = (argPropertyCode != null && MANAGE_CASE) ? argPropertyCode.toUpperCase() : argPropertyCode;
/*     */   }
/*     */   
/*     */   public void setValue(String argObjectIdValue) {
/*  85 */     String str = argObjectIdValue;
/*  86 */     if (StringUtils.isEmpty(str)) {
/*  87 */       throw new DtxException("argument passed to setValue() is null or empty - a valid value must be passed");
/*     */     }
/*     */     try {
/*  90 */       String[] tokens = str.split("::");
/*  91 */       str = tokens[0];
/*     */       
/*  93 */       setOrganizationId(Long.valueOf(str));
/*  94 */       str = tokens[1];
/*     */       
/*  96 */       setRetailLocationId(Long.valueOf(str));
/*  97 */       str = tokens[2];
/*     */       
/*  99 */       if ("null".equals(str)) {
/* 100 */         setBusinessDate((Date)null);
/*     */       } else {
/*     */         
/* 103 */         setBusinessDate((Date)new DtvDate());
/* 104 */         this._businessDate.setTimeFromSerialization(Long.parseLong(str));
/*     */       } 
/* 106 */       str = tokens[3];
/*     */       
/* 108 */       setWorkstationId(Long.valueOf(str));
/* 109 */       str = tokens[4];
/*     */       
/* 111 */       setTransactionSequence(Long.valueOf(str));
/* 112 */       str = tokens[5];
/*     */       
/* 114 */       setRetailTransactionLineItemSequence(Integer.valueOf(str));
/* 115 */       str = tokens[6];
/*     */       
/* 117 */       if ("null".equals(str)) {
/* 118 */         setPropertyCode((String)null);
/*     */       } else {
/*     */         
/* 121 */         setPropertyCode(str);
/*     */       }
/*     */     
/* 124 */     } catch (Exception ee) {
/* 125 */       throw new DtxException("An exception occured while parsing object id string: " + argObjectIdValue, ee);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object ob) {
/* 131 */     if (this == ob) {
/* 132 */       return true;
/*     */     }
/* 134 */     if (!(ob instanceof OrderModifierPropertyId)) {
/* 135 */       return false;
/*     */     }
/* 137 */     OrderModifierPropertyId other = (OrderModifierPropertyId)ob;
/* 138 */     return (((this._organizationId == null && other._organizationId == null) || (this._organizationId != null && this._organizationId
/*     */ 
/*     */       
/* 141 */       .equals(other._organizationId))) && ((this._retailLocationId == null && other._retailLocationId == null) || (this._retailLocationId != null && this._retailLocationId
/*     */ 
/*     */       
/* 144 */       .equals(other._retailLocationId))) && ((this._businessDate == null && other._businessDate == null) || (this._businessDate != null && this._businessDate
/*     */ 
/*     */       
/* 147 */       .equals(other._businessDate))) && ((this._workstationId == null && other._workstationId == null) || (this._workstationId != null && this._workstationId
/*     */ 
/*     */       
/* 150 */       .equals(other._workstationId))) && ((this._transactionSequence == null && other._transactionSequence == null) || (this._transactionSequence != null && this._transactionSequence
/*     */ 
/*     */       
/* 153 */       .equals(other._transactionSequence))) && ((this._retailTransactionLineItemSequence == null && other._retailTransactionLineItemSequence == null) || (this._retailTransactionLineItemSequence != null && this._retailTransactionLineItemSequence
/*     */ 
/*     */       
/* 156 */       .equals(other._retailTransactionLineItemSequence))) && ((this._propertyCode == null && other._propertyCode == null) || (this._propertyCode != null && this._propertyCode
/*     */ 
/*     */       
/* 159 */       .equals(other._propertyCode))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 165 */     return ((this._organizationId == null) ? 0 : this._organizationId
/* 166 */       .hashCode()) + ((this._retailLocationId == null) ? 0 : this._retailLocationId
/* 167 */       .hashCode()) + ((this._businessDate == null) ? 0 : this._businessDate
/* 168 */       .hashCode()) + ((this._workstationId == null) ? 0 : this._workstationId
/* 169 */       .hashCode()) + ((this._transactionSequence == null) ? 0 : this._transactionSequence
/* 170 */       .hashCode()) + ((this._retailTransactionLineItemSequence == null) ? 0 : this._retailTransactionLineItemSequence
/* 171 */       .hashCode()) + ((this._propertyCode == null) ? 0 : this._propertyCode
/* 172 */       .hashCode());
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDtxTypeName() {
/* 177 */     return "OrderModifierProperty";
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 182 */     StringBuilder buff = new StringBuilder(84);
/*     */     
/* 184 */     return buff.append(
/* 185 */         String.valueOf(this._organizationId))
/* 186 */       .append("::").append(String.valueOf(this._retailLocationId))
/* 187 */       .append("::").append((this._businessDate == null) ? "null" : String.valueOf(this._businessDate.getTimeSerializable()))
/* 188 */       .append("::").append(String.valueOf(this._workstationId))
/* 189 */       .append("::").append(String.valueOf(this._transactionSequence))
/* 190 */       .append("::").append(String.valueOf(this._retailTransactionLineItemSequence))
/* 191 */       .append("::").append(this._propertyCode)
/* 192 */       .toString();
/*     */   }
/*     */   
/*     */   public boolean validate() {
/* 196 */     if (this._retailLocationId == null) {
/* 197 */       return false;
/*     */     }
/* 199 */     if (this._businessDate == null) {
/* 200 */       return false;
/*     */     }
/* 202 */     if (this._workstationId == null) {
/* 203 */       return false;
/*     */     }
/* 205 */     if (this._transactionSequence == null) {
/* 206 */       return false;
/*     */     }
/* 208 */     if (this._retailTransactionLineItemSequence == null) {
/* 209 */       return false;
/*     */     }
/* 211 */     if (this._propertyCode == null) {
/* 212 */       return false;
/*     */     }
/* 214 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\xom\OrderModifierPropertyId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */