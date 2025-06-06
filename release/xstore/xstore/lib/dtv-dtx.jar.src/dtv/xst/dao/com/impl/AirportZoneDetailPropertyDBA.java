/*     */ package dtv.xst.dao.com.impl;
/*     */ 
/*     */ import dtv.data2.access.IDataAccessObject;
/*     */ import dtv.data2.access.IObjectId;
/*     */ import dtv.data2.access.impl.jdbc.IFiller;
/*     */ import dtv.data2.access.impl.jdbc.IJDBCTableAdapter;
/*     */ import dtv.util.DtvDate;
/*     */ import dtv.xst.dao.com.AirportZoneDetailPropertyId;
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
/*     */ public class AirportZoneDetailPropertyDBA
/*     */   implements IJDBCTableAdapter
/*     */ {
/*     */   private static final long serialVersionUID = -1683060707L;
/*     */   private Long _organizationId;
/*     */   private String _zoneId;
/*     */   private String _destinationZoneId;
/*     */   private String _propertyCode;
/*     */   private String _type;
/*     */   private String _stringValue;
/*     */   private Date _dateValue;
/*     */   private BigDecimal _decimalValue;
/*     */   private Date _createDate;
/*     */   private String _createUserId;
/*     */   private Date _updateDate;
/*     */   private String _updateUserId;
/*     */   private static final String SELECT_OBJECT = "SELECT t.organization_id, t.zone_id, t.destination_zone_id, t.property_code, t.type, t.string_value, t.date_value, t.decimal_value, t.create_date, t.create_user_id, t.update_date, t.update_user_id FROM com_airport_zone_detail_p t";
/*     */   private static final String SELECT_WHERE_OBJECT = " WHERE organization_id = ?  AND zone_id = ?  AND destination_zone_id = ?  AND property_code = ?  ";
/*     */   
/*     */   public String getSelect() {
/*  41 */     return getSelectImpl();
/*     */   }
/*     */   
/*     */   private String getSelectImpl() {
/*  45 */     return "SELECT t.organization_id, t.zone_id, t.destination_zone_id, t.property_code, t.type, t.string_value, t.date_value, t.decimal_value, t.create_date, t.create_user_id, t.update_date, t.update_user_id FROM com_airport_zone_detail_p t";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSelectWhere() {
/*  51 */     return " WHERE organization_id = ?  AND zone_id = ?  AND destination_zone_id = ?  AND property_code = ?  ";
/*     */   }
/*     */   
/*  54 */   private static final String[] INSERT_OBJECT = new String[] { "INSERT INTO com_airport_zone_detail_p(organization_id, zone_id, destination_zone_id, property_code, type, string_value, date_value, decimal_value, create_date, create_user_id, update_date, update_user_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" };
/*     */   
/*     */   public String[] getInsert() {
/*  57 */     return INSERT_OBJECT;
/*     */   }
/*     */   
/*     */   public Object[][] getInsertParameters() {
/*  61 */     Object[][] insertParameterObject = { { this._organizationId, this._zoneId, this._destinationZoneId, this._propertyCode, this._type, this._stringValue, this._dateValue, this._decimalValue, this._createDate, this._createUserId, this._updateDate, this._updateUserId } };
/*  62 */     return insertParameterObject;
/*     */   }
/*     */   
/*  65 */   private static final int[][] INSERT_PARAMETER_TYPES_OBJECT = new int[][] { { -5, 12, 12, 12, 12, 12, 91, 3, 91, 12, 91, 12 } };
/*     */   
/*     */   public int[][] getInsertParameterTypes() {
/*  68 */     return INSERT_PARAMETER_TYPES_OBJECT;
/*     */   }
/*     */   
/*  71 */   private static final String[] UPDATE_OBJECT = new String[] { "UPDATE com_airport_zone_detail_p SET type = ?, string_value = ?, date_value = ?, decimal_value = ?, update_date = ?, update_user_id = ?" };
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
/*  87 */   private static final String[] DELETE_OBJECT = new String[] { "DELETE FROM com_airport_zone_detail_p" }; private static final String WHERE_OBJECT = " WHERE organization_id = ?  AND zone_id = ?  AND destination_zone_id = ?  AND property_code = ?  ";
/*     */   
/*     */   public String[] getDelete() {
/*  90 */     return DELETE_OBJECT;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getWhere() {
/*  96 */     return " WHERE organization_id = ?  AND zone_id = ?  AND destination_zone_id = ?  AND property_code = ?  ";
/*     */   }
/*     */   public Object[] getWhereParameters() {
/*  99 */     return new Object[] { this._organizationId, this._zoneId, this._destinationZoneId, this._propertyCode };
/*     */   }
/*     */   
/* 102 */   private static final int[] WHERE_PARAMETER_OBJECT = new int[] { -5, 12, 12, 12 };
/*     */   
/*     */   public int[] getWhereParameterTypes() {
/* 105 */     return WHERE_PARAMETER_OBJECT;
/*     */   }
/*     */   public String getTableName() {
/* 108 */     return "com_airport_zone_detail_p";
/*     */   }
/*     */   
/*     */   public IFiller getFiller() {
/* 112 */     return getFillerImpl();
/*     */   }
/*     */   
/*     */   private IFiller getFillerImpl() {
/* 116 */     return new AirportZoneDetailPropertyFiller(this);
/*     */   }
/*     */   
/*     */   private static class AirportZoneDetailPropertyFiller
/*     */     implements IFiller {
/*     */     private AirportZoneDetailPropertyDBA _parent;
/*     */     
/*     */     public AirportZoneDetailPropertyFiller(AirportZoneDetailPropertyDBA argParent) {
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
/* 135 */       this._parent._zoneId = argResultSet.getString(2);
/* 136 */       this._parent._destinationZoneId = argResultSet.getString(3);
/* 137 */       this._parent._propertyCode = argResultSet.getString(4);
/* 138 */       this._parent._type = argResultSet.getString(5);
/* 139 */       this._parent._stringValue = argResultSet.getString(6);
/*     */       
/* 141 */       Timestamp t7 = argResultSet.getTimestamp(7);
/* 142 */       if (t7 != null) {
/* 143 */         this._parent._dateValue = (Date)new DtvDate(t7.getTime());
/*     */       } else {
/*     */         
/* 146 */         this._parent._dateValue = null;
/*     */       } 
/*     */       
/* 149 */       this._parent._decimalValue = argResultSet.getBigDecimal(8);
/*     */       
/* 151 */       Timestamp t9 = argResultSet.getTimestamp(9);
/* 152 */       if (t9 != null) {
/* 153 */         this._parent._createDate = (Date)new DtvDate(t9.getTime());
/*     */       } else {
/*     */         
/* 156 */         this._parent._createDate = null;
/*     */       } 
/*     */       
/* 159 */       this._parent._createUserId = argResultSet.getString(10);
/*     */       
/* 161 */       Timestamp t11 = argResultSet.getTimestamp(11);
/* 162 */       if (t11 != null) {
/* 163 */         this._parent._updateDate = (Date)new DtvDate(t11.getTime());
/*     */       } else {
/*     */         
/* 166 */         this._parent._updateDate = null;
/*     */       } 
/*     */       
/* 169 */       this._parent._updateUserId = argResultSet.getString(12);
/*     */     }
/*     */   }
/*     */   
/*     */   public IDataAccessObject loadDAO(IDataAccessObject argDAO) {
/* 174 */     argDAO.suppressStateChanges(true);
/* 175 */     AirportZoneDetailPropertyDAO dao = (AirportZoneDetailPropertyDAO)argDAO;
/* 176 */     dao.setOrganizationId(this._organizationId);
/* 177 */     dao.setZoneId(this._zoneId);
/* 178 */     dao.setDestinationZoneId(this._destinationZoneId);
/* 179 */     dao.setPropertyCode(this._propertyCode);
/* 180 */     dao.setType(this._type);
/* 181 */     dao.setStringValue(this._stringValue);
/* 182 */     dao.setDateValue(this._dateValue);
/* 183 */     dao.setDecimalValue(this._decimalValue);
/* 184 */     dao.setCreateDate(this._createDate);
/* 185 */     dao.setCreateUserId(this._createUserId);
/* 186 */     dao.setUpdateDate(this._updateDate);
/* 187 */     dao.setUpdateUserId(this._updateUserId);
/* 188 */     argDAO.suppressStateChanges(false);
/* 189 */     return (IDataAccessObject)dao;
/*     */   }
/*     */   
/*     */   public IDataAccessObject loadDefaultDAO() {
/* 193 */     return loadDAO((IDataAccessObject)new AirportZoneDetailPropertyDAO());
/*     */   }
/*     */   
/*     */   public void fill(IDataAccessObject argDAO) {
/* 197 */     AirportZoneDetailPropertyDAO dao = (AirportZoneDetailPropertyDAO)argDAO;
/* 198 */     this._organizationId = dao.getOrganizationId();
/* 199 */     this._zoneId = dao.getZoneId();
/* 200 */     this._destinationZoneId = dao.getDestinationZoneId();
/* 201 */     this._propertyCode = dao.getPropertyCode();
/* 202 */     this._type = dao.getType();
/* 203 */     this._stringValue = dao.getStringValue();
/* 204 */     this._dateValue = dao.getDateValue();
/* 205 */     this._decimalValue = dao.getDecimalValue();
/* 206 */     this._createDate = dao.getCreateDate();
/* 207 */     this._createUserId = dao.getCreateUserId();
/* 208 */     this._updateDate = dao.getUpdateDate();
/* 209 */     this._updateUserId = dao.getUpdateUserId();
/*     */   }
/*     */   
/*     */   public PreparedStatement writeObjectId(IObjectId argId, PreparedStatement argStatement) throws SQLException {
/* 213 */     AirportZoneDetailPropertyId id = (AirportZoneDetailPropertyId)argId;
/* 214 */     argStatement.setLong(1, id.getOrganizationId().longValue());
/* 215 */     argStatement.setString(2, id.getZoneId());
/* 216 */     argStatement.setString(3, id.getDestinationZoneId());
/* 217 */     argStatement.setString(4, id.getPropertyCode());
/* 218 */     return argStatement;
/*     */   }
/*     */   
/*     */   public IObjectId getObjectId() {
/* 222 */     AirportZoneDetailPropertyId id = new AirportZoneDetailPropertyId();
/* 223 */     id.setOrganizationId(this._organizationId);
/* 224 */     id.setZoneId(this._zoneId);
/* 225 */     id.setDestinationZoneId(this._destinationZoneId);
/* 226 */     id.setPropertyCode(this._propertyCode);
/* 227 */     return (IObjectId)id;
/*     */   }
/*     */ 
/*     */   
/*     */   public void fill(IJDBCTableAdapter argAdapter) {}
/*     */ 
/*     */   
/*     */   public boolean isExtensible() {
/* 235 */     return false;
/*     */   }
/*     */   
/*     */   public String getImplementingClass() {
/* 239 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\com\impl\AirportZoneDetailPropertyDBA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */