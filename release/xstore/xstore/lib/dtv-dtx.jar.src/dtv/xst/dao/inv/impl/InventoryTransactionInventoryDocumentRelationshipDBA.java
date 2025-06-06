/*    */ package dtv.xst.dao.inv.impl;
/*    */ 
/*    */ import dtv.data2.access.IDataAccessObject;
/*    */ import dtv.data2.access.IObjectId;
/*    */ import dtv.data2.access.impl.PersistenceConstants;
/*    */ import dtv.data2.access.impl.jdbc.IJDBCRelationshipAdapter;
/*    */ import dtv.xst.dao.inv.InventoryDocumentId;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InventoryTransactionInventoryDocumentRelationshipDBA
/*    */   implements IJDBCRelationshipAdapter
/*    */ {
/* 19 */   private List<Object> _parameterList = new ArrayList(4);
/*    */   
/* 21 */   InventoryDocumentId _childObjectId = null;
/*    */   
/*    */   public String getSelect() {
/* 24 */     return "SELECT invctl_document_id, document_typcode, organization_id, rtl_loc_id, create_date, create_user_id, update_date, update_user_id, complete_date_timestamp, create_date_timestamp, originator_id, status_code, document_subtypcode, originator_name, last_activity_date, po_ref_nbr, record_creation_type, description, control_number, originator_address_id, submit_date FROM inv_invctl_document WHERE invctl_document_id = ? AND document_typcode = ? AND organization_id = ? AND rtl_loc_id = ?";
/*    */   }
/*    */ 
/*    */   
/*    */   public void setParent(IDataAccessObject argDAO) {
/* 29 */     InventoryTransactionDAO dao = (InventoryTransactionDAO)argDAO;
/* 30 */     this._childObjectId = new InventoryDocumentId();
/* 31 */     this._parameterList.add((dao.getDocumentId() != null && PersistenceConstants.MANAGE_CASE) ? dao.getDocumentId().toUpperCase() : dao.getDocumentId());
/* 32 */     this._childObjectId.setDocumentId(dao.getDocumentId());
/* 33 */     this._parameterList.add((dao.getDocumentTypeCode() != null && PersistenceConstants.MANAGE_CASE) ? dao.getDocumentTypeCode().toUpperCase() : dao.getDocumentTypeCode());
/* 34 */     this._childObjectId.setDocumentTypeCode(dao.getDocumentTypeCode());
/* 35 */     this._parameterList.add(dao.getOrganizationId());
/* 36 */     this._childObjectId.setOrganizationId(dao.getOrganizationId());
/* 37 */     this._parameterList.add(dao.getInventoryDocumentRetailLocationId());
/* 38 */     this._childObjectId.setRetailLocationId(dao.getInventoryDocumentRetailLocationId());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOrgHierarchyJoinRequired() {
/* 43 */     return false;
/*    */   }
/*    */   
/*    */   public List getParameterList() {
/* 47 */     return this._parameterList;
/*    */   }
/*    */   
/*    */   public IObjectId getChildObjectId() {
/* 51 */     return (IObjectId)this._childObjectId;
/*    */   }
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\inv\impl\InventoryTransactionInventoryDocumentRelationshipDBA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */