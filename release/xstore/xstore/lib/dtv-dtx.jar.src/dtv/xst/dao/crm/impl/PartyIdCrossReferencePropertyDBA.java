/*     */ package dtv.xst.dao.crm.impl;
/*     */ 
/*     */ import dtv.data2.access.IDataAccessObject;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.impl.jdbc.IFiller;
/*     */ import dtv.data2.access.impl.jdbc.IJDBCTableAdapter;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.xst.dao.crm.PartyIdCrossReferencePropertyId;
/*     */ import java.math.BigDecimal;
/*     */ import java.sql.PreparedStatement;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Timestamp;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PartyIdCrossReferencePropertyDBA
/*     */   implements IJDBCTableAdapter
/*     */ {
/*     */   private static final long serialVersionUID = -2124073535L;
/*     */   private Long _organizationId;
/*     */   private Long _partyId;
/*     */   private String _alternateIdOwner;
/*     */   private String _propertyCode;
/*     */   private String _type;
/*     */   private String _stringValue;
/*     */   private Date _dateValue;
/*     */   private BigDecimal _decimalValue;
/*     */   private Date _createDate;
/*     */   private String _createUserId;
/*     */   private Date _updateDate;
/*     */   private String _updateUserId;
/*     */   private static final String SELECT_OBJECT = "SELECT t.organization_id, t.party_id, t.alternate_id_owner, t.property_code, t.type, t.string_value, t.date_value, t.decimal_value, t.create_date, t.create_user_id, t.update_date, t.update_user_id FROM crm_party_id_xref_p t";
/*     */   private static final String SELECT_WHERE_OBJECT = " WHERE organization_id = ?  AND party_id = ?  AND alternate_id_owner = ?  AND property_code = ?  ";
/*     */   
/*     */   public String getSelect() {
/*  41 */     return getSelectImpl();
/*     */   }
/*     */   
/*     */   private String getSelectImpl() {
/*  45 */     return "SELECT t.organization_id, t.party_id, t.alternate_id_owner, t.property_code, t.type, t.string_value, t.date_value, t.decimal_value, t.create_date, t.create_user_id, t.update_date, t.update_user_id FROM crm_party_id_xref_p t";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSelectWhere() {
/*  51 */     return " WHERE organization_id = ?  AND party_id = ?  AND alternate_id_owner = ?  AND property_code = ?  ";
/*     */   }
/*     */   
/*  54 */   private static final String[] INSERT_OBJECT = new String[] { "INSERT INTO crm_party_id_xref_p(organization_id, party_id, alternate_id_owner, property_code, type, string_value, date_value, decimal_value, create_date, create_user_id, update_date, update_user_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" };
/*     */   
/*     */   public String[] getInsert() {
/*  57 */     return INSERT_OBJECT;
/*     */   }
/*     */   
/*     */   public Object[][] getInsertParameters() {
/*  61 */     Object[][] insertParameterObject = { { this._organizationId, this._partyId, this._alternateIdOwner, this._propertyCode, this._type, this._stringValue, this._dateValue, this._decimalValue, this._createDate, this._createUserId, this._updateDate, this._updateUserId } };
/*  62 */     return insertParameterObject;
/*     */   }
/*     */   
/*  65 */   private static final int[][] INSERT_PARAMETER_TYPES_OBJECT = new int[][] { { -5, -5, 12, 12, 12, 12, 91, 3, 91, 12, 91, 12 } };
/*     */   
/*     */   public int[][] getInsertParameterTypes() {
/*  68 */     return INSERT_PARAMETER_TYPES_OBJECT;
/*     */   }
/*     */   
/*  71 */   private static final String[] UPDATE_OBJECT = new String[] { "UPDATE crm_party_id_xref_p SET type = ?, string_value = ?, date_value = ?, decimal_value = ?, update_date = ?, update_user_id = ?" };
/*     */   
/*     */   public String[] getUpdate() {
/*  74 */     return UPDATE_OBJECT;
/*     */   }
/*     */   
/*     */   public Object[][] getUpdateParameters() {
/*  78 */     Object[][] updateParameterObject = { { this._type, this._stringValue, this._dateValue, this._decimalValue, this._updateDate, this._updateUserId } };
/*  79 */     return updateParameterObject;
/*     */   }
/*     */   
/*  82 */   private static final int[][] UPDATE_PARAMETER_TYPE_OBJECT = new int[][] { { 12, 12, 91, 3, 91, 12 } };
/*     */   public int[][] getUpdateParameterTypes() {
/*  84 */     return UPDATE_PARAMETER_TYPE_OBJECT;
/*     */   }
/*     */   
/*  87 */   private static final String[] DELETE_OBJECT = new String[] { "DELETE FROM crm_party_id_xref_p" }; private static final String WHERE_OBJECT = " WHERE organization_id = ?  AND party_id = ?  AND alternate_id_owner = ?  AND property_code = ?  ";
/*     */   
/*     */   public String[] getDelete() {
/*  90 */     return DELETE_OBJECT;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getWhere() {
/*  96 */     return " WHERE organization_id = ?  AND party_id = ?  AND alternate_id_owner = ?  AND property_code = ?  ";
/*     */   }
/*     */   public Object[] getWhereParameters() {
/*  99 */     return new Object[] { this._organizationId, this._partyId, this._alternateIdOwner, this._propertyCode };
/*     */   }
/*     */   
/* 102 */   private static final int[] WHERE_PARAMETER_OBJECT = new int[] { -5, -5, 12, 12 };
/*     */   
/*     */   public int[] getWhereParameterTypes() {
/* 105 */     return WHERE_PARAMETER_OBJECT;
/*     */   }
/*     */   public String getTableName() {
/* 108 */     return "crm_party_id_xref_p";
/*     */   }
/*     */   
/*     */   public IFiller getFiller() {
/* 112 */     return getFillerImpl();
/*     */   }
/*     */   
/*     */   private IFiller getFillerImpl() {
/* 116 */     return new PartyIdCrossReferencePropertyFiller(this);
/*     */   }
/*     */   
/*     */   private static class PartyIdCrossReferencePropertyFiller
/*     */     implements IFiller {
/*     */     private PartyIdCrossReferencePropertyDBA _parent;
/*     */     
/*     */     public PartyIdCrossReferencePropertyFiller(PartyIdCrossReferencePropertyDBA argParent) {
/* 124 */       this._parent = argParent;
/*     */     }
/*     */ 
/*     */     
/*     */     public void fill(ResultSet argResultSet) throws SQLException {
/* 129 */       long primitiveResult = argResultSet.getLong(1);
/* 130 */       if (primitiveResult != 0L || argResultSet.getObject(1) != null) {
/* 131 */         this._parent._organizationId = Long.valueOf(primitiveResult);
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 137 */       primitiveResult = argResultSet.getLong(2);
/* 138 */       if (primitiveResult != 0L || argResultSet.getObject(2) != null) {
/* 139 */         this._parent._partyId = Long.valueOf(primitiveResult);
/*     */       }
/*     */ 
/*     */       
/* 143 */       this._parent._alternateIdOwner = argResultSet.getString(3);
/* 144 */       this._parent._propertyCode = argResultSet.getString(4);
/* 145 */       this._parent._type = argResultSet.getString(5);
/* 146 */       this._parent._stringValue = argResultSet.getString(6);
/*     */       
/* 148 */       Timestamp t7 = argResultSet.getTimestamp(7);
/* 149 */       if (t7 != null) {
/* 150 */         this._parent._dateValue = (Date)new DtvDate(t7.getTime());
/*     */       } else {
/*     */         
/* 153 */         this._parent._dateValue = null;
/*     */       } 
/*     */       
/* 156 */       this._parent._decimalValue = argResultSet.getBigDecimal(8);
/*     */       
/* 158 */       Timestamp t9 = argResultSet.getTimestamp(9);
/* 159 */       if (t9 != null) {
/* 160 */         this._parent._createDate = (Date)new DtvDate(t9.getTime());
/*     */       } else {
/*     */         
/* 163 */         this._parent._createDate = null;
/*     */       } 
/*     */       
/* 166 */       this._parent._createUserId = argResultSet.getString(10);
/*     */       
/* 168 */       Timestamp t11 = argResultSet.getTimestamp(11);
/* 169 */       if (t11 != null) {
/* 170 */         this._parent._updateDate = (Date)new DtvDate(t11.getTime());
/*     */       } else {
/*     */         
/* 173 */         this._parent._updateDate = null;
/*     */       } 
/*     */       
/* 176 */       this._parent._updateUserId = argResultSet.getString(12);
/*     */     }
/*     */   }
/*     */   
/*     */   public IDataAccessObject loadDAO(IDataAccessObject argDAO) {
/* 181 */     argDAO.suppressStateChanges(true);
/* 182 */     PartyIdCrossReferencePropertyDAO dao = (PartyIdCrossReferencePropertyDAO)argDAO;
/* 183 */     dao.setOrganizationId(this._organizationId);
/* 184 */     dao.setPartyId(this._partyId);
/* 185 */     dao.setAlternateIdOwner(this._alternateIdOwner);
/* 186 */     dao.setPropertyCode(this._propertyCode);
/* 187 */     dao.setType(this._type);
/* 188 */     dao.setStringValue(this._stringValue);
/* 189 */     dao.setDateValue(this._dateValue);
/* 190 */     dao.setDecimalValue(this._decimalValue);
/* 191 */     dao.setCreateDate(this._createDate);
/* 192 */     dao.setCreateUserId(this._createUserId);
/* 193 */     dao.setUpdateDate(this._updateDate);
/* 194 */     dao.setUpdateUserId(this._updateUserId);
/* 195 */     argDAO.suppressStateChanges(false);
/* 196 */     return (IDataAccessObject)dao;
/*     */   }
/*     */   
/*     */   public IDataAccessObject loadDefaultDAO() {
/* 200 */     return loadDAO((IDataAccessObject)new PartyIdCrossReferencePropertyDAO());
/*     */   }
/*     */   
/*     */   public void fill(IDataAccessObject argDAO) {
/* 204 */     PartyIdCrossReferencePropertyDAO dao = (PartyIdCrossReferencePropertyDAO)argDAO;
/* 205 */     this._organizationId = dao.getOrganizationId();
/* 206 */     this._partyId = dao.getPartyId();
/* 207 */     this._alternateIdOwner = dao.getAlternateIdOwner();
/* 208 */     this._propertyCode = dao.getPropertyCode();
/* 209 */     this._type = dao.getType();
/* 210 */     this._stringValue = dao.getStringValue();
/* 211 */     this._dateValue = dao.getDateValue();
/* 212 */     this._decimalValue = dao.getDecimalValue();
/* 213 */     this._createDate = dao.getCreateDate();
/* 214 */     this._createUserId = dao.getCreateUserId();
/* 215 */     this._updateDate = dao.getUpdateDate();
/* 216 */     this._updateUserId = dao.getUpdateUserId();
/*     */   }
/*     */   
/*     */   public PreparedStatement writeObjectId(IObjectId argId, PreparedStatement argStatement) throws SQLException {
/* 220 */     PartyIdCrossReferencePropertyId id = (PartyIdCrossReferencePropertyId)argId;
/* 221 */     argStatement.setLong(1, id.getOrganizationId().longValue());
/* 222 */     argStatement.setLong(2, id.getPartyId().longValue());
/* 223 */     argStatement.setString(3, id.getAlternateIdOwner());
/* 224 */     argStatement.setString(4, id.getPropertyCode());
/* 225 */     return argStatement;
/*     */   }
/*     */   
/*     */   public IObjectId getObjectId() {
/* 229 */     PartyIdCrossReferencePropertyId id = new PartyIdCrossReferencePropertyId();
/* 230 */     id.setOrganizationId(this._organizationId);
/* 231 */     id.setPartyId(this._partyId);
/* 232 */     id.setAlternateIdOwner(this._alternateIdOwner);
/* 233 */     id.setPropertyCode(this._propertyCode);
/* 234 */     return (IObjectId)id;
/*     */   }
/*     */ 
/*     */   
/*     */   public void fill(IJDBCTableAdapter argAdapter) {}
/*     */ 
/*     */   
/*     */   public boolean isExtensible() {
/* 242 */     return false;
/*     */   }
/*     */   
/*     */   public String getImplementingClass() {
/* 246 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\crm\impl\PartyIdCrossReferencePropertyDBA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */