/*    */ package dtv.xst.dao.thr.impl;
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
/*    */ public class PayrollPropertiesRelationshipDBA
/*    */   implements IJDBCRelationshipAdapter
/*    */ {
/* 19 */   private List<Object> _parameterList = new ArrayList(5);
/*    */   
/*    */   public String getSelect() {
/* 22 */     return "SELECT rtl_loc_id, party_id, organization_id, business_date, payroll_category, property_code, type, string_value, date_value, decimal_value, create_date, create_user_id, update_date, update_user_id FROM thr_payroll_p WHERE rtl_loc_id = ? AND party_id = ? AND organization_id = ? AND business_date = ? AND payroll_category = ?";
/*    */   }
/*    */ 
/*    */   
/*    */   public void setParent(IDataAccessObject argDAO) {
/* 27 */     PayrollDAO dao = (PayrollDAO)argDAO;
/* 28 */     this._parameterList.add(dao.getRetailLocId());
/* 29 */     this._parameterList.add(dao.getPartyId());
/* 30 */     this._parameterList.add(dao.getOrganizationId());
/* 31 */     this._parameterList.add(dao.getBusinessDate());
/* 32 */     this._parameterList.add(dao.getPayrollCategory());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOrgHierarchyJoinRequired() {
/* 37 */     return false;
/*    */   }
/*    */   
/*    */   public List getParameterList() {
/* 41 */     return this._parameterList;
/*    */   }
/*    */   
/*    */   public IObjectId getChildObjectId() {
/* 45 */     throw new DtxException("getChildObjectId() can only be called on ONE-ONE relationships. This is an invalid call for relationship adapter: " + getClass().getName());
/*    */   }
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\thr\impl\PayrollPropertiesRelationshipDBA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */