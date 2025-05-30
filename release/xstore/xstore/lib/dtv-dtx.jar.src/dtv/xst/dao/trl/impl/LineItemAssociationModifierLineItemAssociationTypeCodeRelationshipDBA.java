/*    */ package dtv.xst.dao.trl.impl;
/*    */ 
/*    */ import dtv.data2.access.IDataAccessObject;
/*    */ import dtv.data2.access.IObjectId;
/*    */ import dtv.data2.access.impl.PersistenceConstants;
/*    */ import dtv.data2.access.impl.jdbc.IJDBCRelationshipAdapter;
/*    */ import dtv.xst.dao.trl.LineItemAssociationTypeCodeId;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LineItemAssociationModifierLineItemAssociationTypeCodeRelationshipDBA
/*    */   implements IJDBCRelationshipAdapter
/*    */ {
/* 19 */   private List<Object> _parameterList = new ArrayList(2);
/*    */   
/* 21 */   LineItemAssociationTypeCodeId _childObjectId = null;
/*    */   
/*    */   public String getSelect() {
/* 24 */     return "SELECT lineitm_assoc_typcode, organization_id, create_date, create_user_id, update_date, update_user_id, cascade_delete_flag, cascade_quantity_flag, child_restrict_delete_flag, child_restrict_price_flag, child_restrict_quantity_flag, description, parent_restrict_delete_flag, parent_restrict_price_flag, parent_restrict_quantity_flag, sort_order FROM trl_lineitm_assoc_typcode WHERE lineitm_assoc_typcode = ? AND organization_id = ?";
/*    */   }
/*    */ 
/*    */   
/*    */   public void setParent(IDataAccessObject argDAO) {
/* 29 */     LineItemAssociationModifierDAO dao = (LineItemAssociationModifierDAO)argDAO;
/* 30 */     this._childObjectId = new LineItemAssociationTypeCodeId();
/* 31 */     this._parameterList.add((dao.getLineItemAssociationTypeCodeString() != null && PersistenceConstants.MANAGE_CASE) ? dao.getLineItemAssociationTypeCodeString().toUpperCase() : dao.getLineItemAssociationTypeCodeString());
/* 32 */     this._childObjectId.setLineItemAssociationTypeCode(dao.getLineItemAssociationTypeCodeString());
/* 33 */     this._parameterList.add(dao.getOrganizationId());
/* 34 */     this._childObjectId.setOrganizationId(dao.getOrganizationId());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOrgHierarchyJoinRequired() {
/* 39 */     return false;
/*    */   }
/*    */   
/*    */   public List getParameterList() {
/* 43 */     return this._parameterList;
/*    */   }
/*    */   
/*    */   public IObjectId getChildObjectId() {
/* 47 */     return (IObjectId)this._childObjectId;
/*    */   }
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\trl\impl\LineItemAssociationModifierLineItemAssociationTypeCodeRelationshipDBA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */