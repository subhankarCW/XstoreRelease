/*    */ package dtv.xst.dao.trl.impl;
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
/*    */ public class WarrantyModifierPropertiesRelationshipDBA
/*    */   implements IJDBCRelationshipAdapter
/*    */ {
/* 19 */   private List<Object> _parameterList = new ArrayList(7);
/*    */   
/*    */   public String getSelect() {
/* 22 */     return "SELECT business_date, organization_id, rtl_loc_id, rtrans_lineitm_seq, trans_seq, wkstn_id, warranty_modifier_seq, property_code, type, string_value, date_value, decimal_value, create_date, create_user_id, update_date, update_user_id FROM trl_warranty_modifier_p WHERE business_date = ? AND organization_id = ? AND rtl_loc_id = ? AND rtrans_lineitm_seq = ? AND trans_seq = ? AND wkstn_id = ? AND warranty_modifier_seq = ?";
/*    */   }
/*    */ 
/*    */   
/*    */   public void setParent(IDataAccessObject argDAO) {
/* 27 */     WarrantyModifierDAO dao = (WarrantyModifierDAO)argDAO;
/* 28 */     this._parameterList.add(dao.getBusinessDate());
/* 29 */     this._parameterList.add(dao.getOrganizationId());
/* 30 */     this._parameterList.add(dao.getRetailLocationId());
/* 31 */     this._parameterList.add(dao.getRetailTransactionLineItemSequence());
/* 32 */     this._parameterList.add(dao.getTransactionSequence());
/* 33 */     this._parameterList.add(dao.getWorkstationId());
/* 34 */     this._parameterList.add(dao.getWarrantyModifierSequence());
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
/* 47 */     throw new DtxException("getChildObjectId() can only be called on ONE-ONE relationships. This is an invalid call for relationship adapter: " + getClass().getName());
/*    */   }
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\trl\impl\WarrantyModifierPropertiesRelationshipDBA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */