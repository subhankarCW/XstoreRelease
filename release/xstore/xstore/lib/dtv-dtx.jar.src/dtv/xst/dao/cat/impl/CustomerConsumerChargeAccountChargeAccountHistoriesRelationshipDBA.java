/*    */ package dtv.xst.dao.cat.impl;
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
/*    */ public class CustomerConsumerChargeAccountChargeAccountHistoriesRelationshipDBA
/*    */   implements IJDBCRelationshipAdapter
/*    */ {
/* 19 */   private List<Object> _parameterList = new ArrayList(3);
/*    */   
/*    */   public String getSelect() {
/* 22 */     return "SELECT organization_id, cust_acct_id, cust_acct_code, history_seq, create_date, create_user_id, update_date, update_user_id, activity_date, activity_enum, amt, party_id, business_date, trans_seq, wkstn_id, rtl_loc_id, rtrans_lineitm_seq, acct_balance, acct_user_name, acct_user_id, reversed_flag FROM cat_charge_acct_history WHERE organization_id = ? AND cust_acct_id = ? AND cust_acct_code = ?";
/*    */   }
/*    */ 
/*    */   
/*    */   public void setParent(IDataAccessObject argDAO) {
/* 27 */     CustomerConsumerChargeAccountDAO dao = (CustomerConsumerChargeAccountDAO)argDAO;
/* 28 */     this._parameterList.add(dao.getOrganizationId());
/* 29 */     this._parameterList.add(dao.getCustAccountId());
/* 30 */     this._parameterList.add(dao.getCustAccountCode());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOrgHierarchyJoinRequired() {
/* 35 */     return false;
/*    */   }
/*    */   
/*    */   public List getParameterList() {
/* 39 */     return this._parameterList;
/*    */   }
/*    */   
/*    */   public IObjectId getChildObjectId() {
/* 43 */     throw new DtxException("getChildObjectId() can only be called on ONE-ONE relationships. This is an invalid call for relationship adapter: " + getClass().getName());
/*    */   }
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\cat\impl\CustomerConsumerChargeAccountChargeAccountHistoriesRelationshipDBA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */