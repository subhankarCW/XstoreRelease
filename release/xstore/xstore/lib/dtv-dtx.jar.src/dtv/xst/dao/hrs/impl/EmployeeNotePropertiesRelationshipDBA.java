/*    */ package dtv.xst.dao.hrs.impl;
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
/*    */ public class EmployeeNotePropertiesRelationshipDBA
/*    */   implements IJDBCRelationshipAdapter
/*    */ {
/* 19 */   private List<Object> _parameterList = new ArrayList(3);
/*    */   
/*    */   public String getSelect() {
/* 22 */     return "SELECT organization_id, employee_id, note_seq, property_code, type, string_value, date_value, decimal_value, create_date, create_user_id, update_date, update_user_id FROM hrs_employee_notes_p WHERE organization_id = ? AND employee_id = ? AND note_seq = ?";
/*    */   }
/*    */ 
/*    */   
/*    */   public void setParent(IDataAccessObject argDAO) {
/* 27 */     EmployeeNoteDAO dao = (EmployeeNoteDAO)argDAO;
/* 28 */     this._parameterList.add(dao.getOrganizationId());
/* 29 */     this._parameterList.add(dao.getEmployeeId());
/* 30 */     this._parameterList.add(dao.getNoteSequence());
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


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\hrs\impl\EmployeeNotePropertiesRelationshipDBA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */