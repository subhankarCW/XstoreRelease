/*    */ package dtv.xst.dao.xom;
/*    */ import dtv.data2.access.IDataAccessObject;
/*    */ import dtv.data2.access.IDataModel;
/*    */ import dtv.event.EventEnum;
/*    */ import java.util.Date;
/*    */ import java.util.List;
/*    */ 
/*    */ public interface IAddressModifier extends IDataModel, IAddressModifierModel, IHasDataProperty<IAddressModifierProperty> {
/*  9 */   public static final EventEnum SET_ORGANIZATIONID = new EventEnum("set organizationId");
/* 10 */   public static final EventEnum SET_ORDERID = new EventEnum("set orderId");
/* 11 */   public static final EventEnum SET_SEQUENCE = new EventEnum("set sequence");
/* 12 */   public static final EventEnum SET_CREATEDATE = new EventEnum("set createDate");
/* 13 */   public static final EventEnum SET_CREATEUSERID = new EventEnum("set createUserId");
/* 14 */   public static final EventEnum SET_UPDATEDATE = new EventEnum("set updateDate");
/* 15 */   public static final EventEnum SET_UPDATEUSERID = new EventEnum("set updateUserId");
/* 16 */   public static final EventEnum SET_ADDRESS1 = new EventEnum("set address1");
/* 17 */   public static final EventEnum SET_ADDRESS2 = new EventEnum("set address2");
/* 18 */   public static final EventEnum SET_ADDRESS3 = new EventEnum("set address3");
/* 19 */   public static final EventEnum SET_ADDRESS4 = new EventEnum("set address4");
/* 20 */   public static final EventEnum SET_APARTMENT = new EventEnum("set apartment");
/* 21 */   public static final EventEnum SET_CITY = new EventEnum("set city");
/* 22 */   public static final EventEnum SET_STATE = new EventEnum("set state");
/* 23 */   public static final EventEnum SET_POSTALCODE = new EventEnum("set postalCode");
/* 24 */   public static final EventEnum SET_COUNTRY = new EventEnum("set country");
/* 25 */   public static final EventEnum SET_NEIGHBORHOOD = new EventEnum("set neighborhood");
/* 26 */   public static final EventEnum SET_COUNTY = new EventEnum("set county");
/* 27 */   public static final EventEnum ADD_PROPERTIES = new EventEnum("add Properties");
/* 28 */   public static final EventEnum REMOVE_PROPERTIES = new EventEnum("remove Properties");
/* 29 */   public static final EventEnum SET_PROPERTIES = new EventEnum("set Properties");
/* 30 */   public static final EventEnum START_TRANSACTION = new EventEnum("start transaction");
/* 31 */   public static final EventEnum ROLLBACK_TRANSACTION = new EventEnum("rollback transaction");
/* 32 */   public static final EventEnum COMMIT_TRANSACTION = new EventEnum("commit transaction");
/*    */   
/*    */   void setDAO(IDataAccessObject paramIDataAccessObject);
/*    */   
/*    */   long getOrganizationId();
/*    */   
/*    */   void setOrganizationId(long paramLong);
/*    */   
/*    */   String getOrderId();
/*    */   
/*    */   void setOrderId(String paramString);
/*    */   
/*    */   long getSequence();
/*    */   
/*    */   void setSequence(long paramLong);
/*    */   
/*    */   Date getCreateDate();
/*    */   
/*    */   void setCreateDate(Date paramDate);
/*    */   
/*    */   String getCreateUserId();
/*    */   
/*    */   void setCreateUserId(String paramString);
/*    */   
/*    */   Date getUpdateDate();
/*    */   
/*    */   void setUpdateDate(Date paramDate);
/*    */   
/*    */   String getUpdateUserId();
/*    */   
/*    */   void setUpdateUserId(String paramString);
/*    */   
/*    */   String getAddress1();
/*    */   
/*    */   void setAddress1(String paramString);
/*    */   
/*    */   String getAddress2();
/*    */   
/*    */   void setAddress2(String paramString);
/*    */   
/*    */   String getAddress3();
/*    */   
/*    */   void setAddress3(String paramString);
/*    */   
/*    */   String getAddress4();
/*    */   
/*    */   void setAddress4(String paramString);
/*    */   
/*    */   String getApartment();
/*    */   
/*    */   void setApartment(String paramString);
/*    */   
/*    */   String getCity();
/*    */   
/*    */   void setCity(String paramString);
/*    */   
/*    */   String getState();
/*    */   
/*    */   void setState(String paramString);
/*    */   
/*    */   String getPostalCode();
/*    */   
/*    */   void setPostalCode(String paramString);
/*    */   
/*    */   String getCountry();
/*    */   
/*    */   void setCountry(String paramString);
/*    */   
/*    */   String getNeighborhood();
/*    */   
/*    */   void setNeighborhood(String paramString);
/*    */   
/*    */   String getCounty();
/*    */   
/*    */   void setCounty(String paramString);
/*    */   
/*    */   IDataModel getAddressModifierExt();
/*    */   
/*    */   void setAddressModifierExt(IDataModel paramIDataModel);
/*    */   
/*    */   List<IAddressModifierProperty> getProperties();
/*    */   
/*    */   void setProperties(List<IAddressModifierProperty> paramList);
/*    */   
/*    */   void addAddressModifierProperty(IAddressModifierProperty paramIAddressModifierProperty);
/*    */   
/*    */   void removeAddressModifierProperty(IAddressModifierProperty paramIAddressModifierProperty);
/*    */   
/*    */   void startTransaction();
/*    */   
/*    */   void rollbackChanges();
/*    */   
/*    */   void commitTransaction();
/*    */ }


/* Location:              C:\WIP-Xstore_Delta-main\release\xstore\xstore\lib\dtv-dtx.jar!\dtv\xst\dao\xom\IAddressModifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */