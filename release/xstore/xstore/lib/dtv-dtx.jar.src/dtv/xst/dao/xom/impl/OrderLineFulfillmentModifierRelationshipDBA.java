/*    */ package dtv.xst.dao.xom.impl;
/*    */ 
/*    */ import dtv.data2.access.IDataAccessObject;
/*    */ import dtv.data2.access.IObjectId;
/*    */ import dtv.data2.access.impl.jdbc.IJDBCRelationshipAdapter;
/*    */ import dtv.xst.dao.xom.FulfillmentModifierId;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class OrderLineFulfillmentModifierRelationshipDBA
/*    */   implements IJDBCRelationshipAdapter
/*    */ {
/* 19 */   private List<Object> _parameterList = new ArrayList(3);
/*    */   
/* 21 */   FulfillmentModifierId _childObjectId = null;
/*    */   
/*    */   public String getSelect() {
/* 24 */     return "SELECT organization_id, order_id, detail_seq, create_date, create_user_id, update_date, update_user_id, loc_id, organization_name, salutation, loc_name1, loc_name2, middle_name, suffix, address_seq, telephone, email_address FROM xom_fulfillment_mod WHERE organization_id = ? AND order_id = ? AND detail_seq = ?";
/*    */   }
/*    */ 
/*    */   
/*    */   public void setParent(IDataAccessObject argDAO) {
/* 29 */     OrderLineDAO dao = (OrderLineDAO)argDAO;
/* 30 */     this._childObjectId = new FulfillmentModifierId();
/* 31 */     this._parameterList.add(dao.getOrganizationId());
/* 32 */     this._childObjectId.setOrganizationId(dao.getOrganizationId());
/* 33 */     this._parameterList.add(dao.getOrderId());
/* 34 */     this._childObjectId.setOrderId(dao.getOrderId());
/* 35 */     this._parameterList.add(dao.getSequence());
/* 36 */     this._childObjectId.setSequence(dao.getSequence());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOrgHierarchyJoinRequired() {
/* 41 */     return false;
/*    */   }
/*    */   
/*    */   public List getParameterList() {
/* 45 */     return this._parameterList;
/*    */   }
/*    */   
/*    */   public IObjectId getChildObjectId() {
/* 49 */     return (IObjectId)this._childObjectId;
/*    */   }
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\xom\impl\OrderLineFulfillmentModifierRelationshipDBA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */