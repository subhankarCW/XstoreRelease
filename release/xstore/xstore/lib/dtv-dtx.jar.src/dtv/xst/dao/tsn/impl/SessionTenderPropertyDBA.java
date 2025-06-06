/*     */ package dtv.xst.dao.tsn.impl;
/*     */ 
/*     */ import dtv.data2.access.IDataAccessObject;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.impl.jdbc.IFiller;
/*     */ import dtv.data2.access.impl.jdbc.IJDBCTableAdapter;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.xst.dao.tsn.SessionTenderPropertyId;
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
/*     */ public class SessionTenderPropertyDBA
/*     */   implements IJDBCTableAdapter
/*     */ {
/*     */   private static final long serialVersionUID = -2014019361L;
/*     */   private Long _organizationId;
/*     */   private Long _retailLocationId;
/*     */   private Long _sessionId;
/*     */   private String _tenderId;
/*     */   private String _propertyCode;
/*     */   private String _type;
/*     */   private String _stringValue;
/*     */   private Date _dateValue;
/*     */   private BigDecimal _decimalValue;
/*     */   private Date _createDate;
/*     */   private String _createUserId;
/*     */   private Date _updateDate;
/*     */   private String _updateUserId;
/*     */   private static final String SELECT_OBJECT = "SELECT t.organization_id, t.rtl_loc_id, t.session_id, t.tndr_id, t.property_code, t.type, t.string_value, t.date_value, t.decimal_value, t.create_date, t.create_user_id, t.update_date, t.update_user_id FROM tsn_session_tndr_p t";
/*     */   private static final String SELECT_WHERE_OBJECT = " WHERE organization_id = ?  AND rtl_loc_id = ?  AND session_id = ?  AND tndr_id = ?  AND property_code = ?  ";
/*     */   
/*     */   public String getSelect() {
/*  42 */     return getSelectImpl();
/*     */   }
/*     */   
/*     */   private String getSelectImpl() {
/*  46 */     return "SELECT t.organization_id, t.rtl_loc_id, t.session_id, t.tndr_id, t.property_code, t.type, t.string_value, t.date_value, t.decimal_value, t.create_date, t.create_user_id, t.update_date, t.update_user_id FROM tsn_session_tndr_p t";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSelectWhere() {
/*  52 */     return " WHERE organization_id = ?  AND rtl_loc_id = ?  AND session_id = ?  AND tndr_id = ?  AND property_code = ?  ";
/*     */   }
/*     */   
/*  55 */   private static final String[] INSERT_OBJECT = new String[] { "INSERT INTO tsn_session_tndr_p(organization_id, rtl_loc_id, session_id, tndr_id, property_code, type, string_value, date_value, decimal_value, create_date, create_user_id, update_date, update_user_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" };
/*     */   
/*     */   public String[] getInsert() {
/*  58 */     return INSERT_OBJECT;
/*     */   }
/*     */   
/*     */   public Object[][] getInsertParameters() {
/*  62 */     Object[][] insertParameterObject = { { this._organizationId, this._retailLocationId, this._sessionId, this._tenderId, this._propertyCode, this._type, this._stringValue, this._dateValue, this._decimalValue, this._createDate, this._createUserId, this._updateDate, this._updateUserId } };
/*  63 */     return insertParameterObject;
/*     */   }
/*     */   
/*  66 */   private static final int[][] INSERT_PARAMETER_TYPES_OBJECT = new int[][] { { -5, -5, -5, 12, 12, 12, 12, 91, 3, 91, 12, 91, 12 } };
/*     */   
/*     */   public int[][] getInsertParameterTypes() {
/*  69 */     return INSERT_PARAMETER_TYPES_OBJECT;
/*     */   }
/*     */   
/*  72 */   private static final String[] UPDATE_OBJECT = new String[] { "UPDATE tsn_session_tndr_p SET type = ?, string_value = ?, date_value = ?, decimal_value = ?, update_date = ?, update_user_id = ?" };
/*     */   
/*     */   public String[] getUpdate() {
/*  75 */     return UPDATE_OBJECT;
/*     */   }
/*     */   
/*     */   public Object[][] getUpdateParameters() {
/*  79 */     Object[][] updateParameterObject = { { this._type, this._stringValue, this._dateValue, this._decimalValue, this._updateDate, this._updateUserId } };
/*  80 */     return updateParameterObject;
/*     */   }
/*     */   
/*  83 */   private static final int[][] UPDATE_PARAMETER_TYPE_OBJECT = new int[][] { { 12, 12, 91, 3, 91, 12 } };
/*     */   public int[][] getUpdateParameterTypes() {
/*  85 */     return UPDATE_PARAMETER_TYPE_OBJECT;
/*     */   }
/*     */   
/*  88 */   private static final String[] DELETE_OBJECT = new String[] { "DELETE FROM tsn_session_tndr_p" }; private static final String WHERE_OBJECT = " WHERE organization_id = ?  AND rtl_loc_id = ?  AND session_id = ?  AND tndr_id = ?  AND property_code = ?  ";
/*     */   
/*     */   public String[] getDelete() {
/*  91 */     return DELETE_OBJECT;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getWhere() {
/*  97 */     return " WHERE organization_id = ?  AND rtl_loc_id = ?  AND session_id = ?  AND tndr_id = ?  AND property_code = ?  ";
/*     */   }
/*     */   public Object[] getWhereParameters() {
/* 100 */     return new Object[] { this._organizationId, this._retailLocationId, this._sessionId, this._tenderId, this._propertyCode };
/*     */   }
/*     */   
/* 103 */   private static final int[] WHERE_PARAMETER_OBJECT = new int[] { -5, -5, -5, 12, 12 };
/*     */   
/*     */   public int[] getWhereParameterTypes() {
/* 106 */     return WHERE_PARAMETER_OBJECT;
/*     */   }
/*     */   public String getTableName() {
/* 109 */     return "tsn_session_tndr_p";
/*     */   }
/*     */   
/*     */   public IFiller getFiller() {
/* 113 */     return getFillerImpl();
/*     */   }
/*     */   
/*     */   private IFiller getFillerImpl() {
/* 117 */     return new SessionTenderPropertyFiller(this);
/*     */   }
/*     */   
/*     */   private static class SessionTenderPropertyFiller
/*     */     implements IFiller {
/*     */     private SessionTenderPropertyDBA _parent;
/*     */     
/*     */     public SessionTenderPropertyFiller(SessionTenderPropertyDBA argParent) {
/* 125 */       this._parent = argParent;
/*     */     }
/*     */ 
/*     */     
/*     */     public void fill(ResultSet argResultSet) throws SQLException {
/* 130 */       long primitiveResult = argResultSet.getLong(1);
/* 131 */       if (primitiveResult != 0L || argResultSet.getObject(1) != null) {
/* 132 */         this._parent._organizationId = Long.valueOf(primitiveResult);
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 138 */       primitiveResult = argResultSet.getLong(2);
/* 139 */       if (primitiveResult != 0L || argResultSet.getObject(2) != null) {
/* 140 */         this._parent._retailLocationId = Long.valueOf(primitiveResult);
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 146 */       primitiveResult = argResultSet.getLong(3);
/* 147 */       if (primitiveResult != 0L || argResultSet.getObject(3) != null) {
/* 148 */         this._parent._sessionId = Long.valueOf(primitiveResult);
/*     */       }
/*     */ 
/*     */       
/* 152 */       this._parent._tenderId = argResultSet.getString(4);
/* 153 */       this._parent._propertyCode = argResultSet.getString(5);
/* 154 */       this._parent._type = argResultSet.getString(6);
/* 155 */       this._parent._stringValue = argResultSet.getString(7);
/*     */       
/* 157 */       Timestamp t8 = argResultSet.getTimestamp(8);
/* 158 */       if (t8 != null) {
/* 159 */         this._parent._dateValue = (Date)new DtvDate(t8.getTime());
/*     */       } else {
/*     */         
/* 162 */         this._parent._dateValue = null;
/*     */       } 
/*     */       
/* 165 */       this._parent._decimalValue = argResultSet.getBigDecimal(9);
/*     */       
/* 167 */       Timestamp t10 = argResultSet.getTimestamp(10);
/* 168 */       if (t10 != null) {
/* 169 */         this._parent._createDate = (Date)new DtvDate(t10.getTime());
/*     */       } else {
/*     */         
/* 172 */         this._parent._createDate = null;
/*     */       } 
/*     */       
/* 175 */       this._parent._createUserId = argResultSet.getString(11);
/*     */       
/* 177 */       Timestamp t12 = argResultSet.getTimestamp(12);
/* 178 */       if (t12 != null) {
/* 179 */         this._parent._updateDate = (Date)new DtvDate(t12.getTime());
/*     */       } else {
/*     */         
/* 182 */         this._parent._updateDate = null;
/*     */       } 
/*     */       
/* 185 */       this._parent._updateUserId = argResultSet.getString(13);
/*     */     }
/*     */   }
/*     */   
/*     */   public IDataAccessObject loadDAO(IDataAccessObject argDAO) {
/* 190 */     argDAO.suppressStateChanges(true);
/* 191 */     SessionTenderPropertyDAO dao = (SessionTenderPropertyDAO)argDAO;
/* 192 */     dao.setOrganizationId(this._organizationId);
/* 193 */     dao.setRetailLocationId(this._retailLocationId);
/* 194 */     dao.setSessionId(this._sessionId);
/* 195 */     dao.setTenderId(this._tenderId);
/* 196 */     dao.setPropertyCode(this._propertyCode);
/* 197 */     dao.setType(this._type);
/* 198 */     dao.setStringValue(this._stringValue);
/* 199 */     dao.setDateValue(this._dateValue);
/* 200 */     dao.setDecimalValue(this._decimalValue);
/* 201 */     dao.setCreateDate(this._createDate);
/* 202 */     dao.setCreateUserId(this._createUserId);
/* 203 */     dao.setUpdateDate(this._updateDate);
/* 204 */     dao.setUpdateUserId(this._updateUserId);
/* 205 */     argDAO.suppressStateChanges(false);
/* 206 */     return (IDataAccessObject)dao;
/*     */   }
/*     */   
/*     */   public IDataAccessObject loadDefaultDAO() {
/* 210 */     return loadDAO((IDataAccessObject)new SessionTenderPropertyDAO());
/*     */   }
/*     */   
/*     */   public void fill(IDataAccessObject argDAO) {
/* 214 */     SessionTenderPropertyDAO dao = (SessionTenderPropertyDAO)argDAO;
/* 215 */     this._organizationId = dao.getOrganizationId();
/* 216 */     this._retailLocationId = dao.getRetailLocationId();
/* 217 */     this._sessionId = dao.getSessionId();
/* 218 */     this._tenderId = dao.getTenderId();
/* 219 */     this._propertyCode = dao.getPropertyCode();
/* 220 */     this._type = dao.getType();
/* 221 */     this._stringValue = dao.getStringValue();
/* 222 */     this._dateValue = dao.getDateValue();
/* 223 */     this._decimalValue = dao.getDecimalValue();
/* 224 */     this._createDate = dao.getCreateDate();
/* 225 */     this._createUserId = dao.getCreateUserId();
/* 226 */     this._updateDate = dao.getUpdateDate();
/* 227 */     this._updateUserId = dao.getUpdateUserId();
/*     */   }
/*     */   
/*     */   public PreparedStatement writeObjectId(IObjectId argId, PreparedStatement argStatement) throws SQLException {
/* 231 */     SessionTenderPropertyId id = (SessionTenderPropertyId)argId;
/* 232 */     argStatement.setLong(1, id.getOrganizationId().longValue());
/* 233 */     argStatement.setLong(2, id.getRetailLocationId().longValue());
/* 234 */     argStatement.setLong(3, id.getSessionId().longValue());
/* 235 */     argStatement.setString(4, id.getTenderId());
/* 236 */     argStatement.setString(5, id.getPropertyCode());
/* 237 */     return argStatement;
/*     */   }
/*     */   
/*     */   public IObjectId getObjectId() {
/* 241 */     SessionTenderPropertyId id = new SessionTenderPropertyId();
/* 242 */     id.setOrganizationId(this._organizationId);
/* 243 */     id.setRetailLocationId(this._retailLocationId);
/* 244 */     id.setSessionId(this._sessionId);
/* 245 */     id.setTenderId(this._tenderId);
/* 246 */     id.setPropertyCode(this._propertyCode);
/* 247 */     return (IObjectId)id;
/*     */   }
/*     */ 
/*     */   
/*     */   public void fill(IJDBCTableAdapter argAdapter) {}
/*     */ 
/*     */   
/*     */   public boolean isExtensible() {
/* 255 */     return false;
/*     */   }
/*     */   
/*     */   public String getImplementingClass() {
/* 259 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\tsn\impl\SessionTenderPropertyDBA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */