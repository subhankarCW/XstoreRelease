/*    */ package dtv.xst.dao.prc.impl;
/*    */ 
/*    */ import dtv.data2.access.IDataAccessObject;
/*    */ import dtv.data2.access.IObjectId;
/*    */ import dtv.data2.access.exception.DtxException;
/*    */ import dtv.data2.access.impl.jdbc.IJDBCRelationshipAdapter;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DealDocumentXrefPropertiesRelationshipDBA
/*    */   implements IJDBCRelationshipAdapter
/*    */ {
/* 19 */   private List<Object> _parameterList = new ArrayList(4);
/*    */   
/*    */   public String getSelect() {
/* 22 */     return "SELECT organization_id, deal_id, series_id, document_type, property_code, type, string_value, date_value, decimal_value, create_date, create_user_id, update_date, update_user_id FROM prc_deal_document_xref_p WHERE organization_id = ? AND deal_id = ? AND series_id = ? AND document_type = ?";
/*    */   }
/*    */ 
/*    */   
/*    */   public void setParent(IDataAccessObject argDAO) {
/* 27 */     DealDocumentXrefDAO dao = (DealDocumentXrefDAO)argDAO;
/* 28 */     this._parameterList.add(dao.getOrganizationId());
/* 29 */     this._parameterList.add(dao.getDealId());
/* 30 */     this._parameterList.add(dao.getSeriesId());
/* 31 */     this._parameterList.add(dao.getDocumentType());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOrgHierarchyJoinRequired() {
/* 36 */     return false;
/*    */   }
/*    */   
/*    */   public List getParameterList() {
/* 40 */     return this._parameterList;
/*    */   }
/*    */   
/*    */   public IObjectId getChildObjectId() {
/* 44 */     throw new DtxException("getChildObjectId() can only be called on ONE-ONE relationships. This is an invalid call for relationship adapter: " + getClass().getName());
/*    */   }
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\prc\impl\DealDocumentXrefPropertiesRelationshipDBA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */