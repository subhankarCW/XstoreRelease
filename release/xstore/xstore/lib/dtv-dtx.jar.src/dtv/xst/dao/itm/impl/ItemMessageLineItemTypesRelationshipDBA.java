/*    */ package dtv.xst.dao.itm.impl;
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
/*    */ public class ItemMessageLineItemTypesRelationshipDBA
/*    */   implements IJDBCRelationshipAdapter
/*    */ {
/* 19 */   private List<Object> _parameterList = new ArrayList(2);
/*    */   
/*    */   public String getSelect() {
/* 22 */     return "SELECT msg_id, organization_id, sale_lineitm_typcode, org_code, org_value, create_date, create_user_id, update_date, update_user_id FROM itm_item_msg_types WHERE msg_id = ? AND organization_id = ?";
/*    */   }
/*    */ 
/*    */   
/*    */   public void setParent(IDataAccessObject argDAO) {
/* 27 */     ItemMessageDAO dao = (ItemMessageDAO)argDAO;
/* 28 */     this._parameterList.add(dao.getMessageId());
/* 29 */     this._parameterList.add(dao.getOrganizationId());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOrgHierarchyJoinRequired() {
/* 34 */     return true;
/*    */   }
/*    */   
/*    */   public List getParameterList() {
/* 38 */     return this._parameterList;
/*    */   }
/*    */   
/*    */   public IObjectId getChildObjectId() {
/* 42 */     throw new DtxException("getChildObjectId() can only be called on ONE-ONE relationships. This is an invalid call for relationship adapter: " + getClass().getName());
/*    */   }
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\itm\impl\ItemMessageLineItemTypesRelationshipDBA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */