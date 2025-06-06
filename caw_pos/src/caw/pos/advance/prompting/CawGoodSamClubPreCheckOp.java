/**
 * CONFIDENTIAL AND PROPRIETARY SOURCE CODE. 
 * 
 * Use and distribution of this code is subject to applicable 
 * licenses and the permission of the code owner.  This notice 
 * does not indicate the actual or intended publication of 
 * this source code.
 * 
 * Portions developed for Camping World by BTM Global Consulting
 * LLC and are the property of Camping World.
 * 
 * ===== BTM Modification ===========================================
 * Req/Bug ID#      ddMMyy    Description
 * BZ24354          081117    [Advance Prompting] Add membership info validation API to all membership types when manually entered in POS
 * BZ24424          131117    "RA membership validation" prompt does not display for RA JOIN when you select "1-Year join (w/Auto Renew) - $69.95"
 * BZ24444          141117    GS Join membership validation  doesn't display after assigning the new customer from customer option
 * BZ24877          221217    When Selling Memberships, Store Associates Are Not Prompted for Membership#
 * BZ25565          060318    Membership item cannot be purchased successfully in case EBS offline 
 * BZ28529          051218    [Internal] Error with Prompt Engine when sending Prompt Engine result
 *===================================================================
 */

package caw.pos.advance.prompting;

import javax.inject.Inject;

import caw.pos.common.CawValueKeys;

import dtv.pos.common.OpChainKey;
import dtv.pos.iframework.event.IXstEvent;
import dtv.pos.iframework.op.IOpResponse;
import dtv.pos.register.AddItemToSaleTranOp;
import dtv.pos.spring.ValueKeys;
import dtv.xst.dao.crm.IParty;
import dtv.xst.dao.itm.IItem;
import dtv.xst.dao.itm.impl.NonPhysicalItemModel;

/**
 * The CawGoodSamClubPreCheckOp class
 */
public class CawGoodSamClubPreCheckOp extends AddItemToSaleTranOp {

    @Inject
    private CawMembershipActivityHelper _cawMembershipActivityHelper;

    /** (non-Javadoc)
     * @see dtv.pos.register.AddItemToSaleTranOp#handleOpExec(dtv.pos.iframework.event.IXstEvent)
     */
    @Override
    public IOpResponse handleOpExec(IXstEvent argEvent) {

        IOpResponse iOpResponse = this.HELPER.completeResponse();
        /* Begin BZ28529 */
        IParty cust = _transactionScope.getValue(ValueKeys.SELECTED_CUSTOMER);
        if (cust != null) { // BZ24444 // BZ25565
            /* End BZ28529 */
            if (getScopedValue(ValueKeys.CURRENT_ITEM) != null) {
                CawMembershipActivityModel activityModel = null;
                IItem item = getScopedValue(ValueKeys.CURRENT_ITEM);
                // Begin BZ24424
                if (item != null && item instanceof NonPhysicalItemModel && item.getMerchLevel4Id() != null) {
                    String itemSubtype = item.getMerchLevel4Id();
                    activityModel = _cawMembershipActivityHelper.getGroupItemByGroupName(itemSubtype);

                    if (activityModel != null) {
//                        iOpResponse = this.HELPER.getStartChainResponse(OpChainKey.valueOf("NOTIFICATION_MANUAL_JOIN_GSC")); //BZ69574
                        setScopedValue(CawValueKeys.ITEM_NON_PHYSICAL_GROUP, activityModel);
                    }
                }
                // End BZ24424
            } else {
                clearParameter();
            }
        } else {
            clearParameter();
            /* Begin BZ24877 */
            if (getScopedValue(ValueKeys.CURRENT_ITEM) != null) {
                CawMembershipActivityModel activityModel = null;
                IItem item = getScopedValue(ValueKeys.CURRENT_ITEM);
                if (item != null && item instanceof NonPhysicalItemModel && item.getMerchLevel4Id() != null) {
                    String itemSubtype = item.getMerchLevel4Id();
                    activityModel = _cawMembershipActivityHelper.getGroupItemByGroupName(itemSubtype);

                    if (activityModel != null) {
//                        iOpResponse = this.HELPER.getStartChainResponse(OpChainKey.valueOf("NOTIFICATION_MANUAL_JOIN_GSC")); //BZ69574
                        iOpResponse = this.HELPER.getStartChainResponse(OpChainKey.valueOf("NOTIFICATION_JOIN_GSC"));
                        //setScopedValue(CawValueKeys.ITEM_NON_PHYSICAL_GROUP, activityModel);
                    }
                }
            }
            /* End BZ24877 */
        }

        return iOpResponse;
    }

    private void clearParameter() {

        clearScopedValue(CawValueKeys.ITEM_NON_PHYSICAL_GROUP);
        clearScopedValue(CawValueKeys.VALIDATE_MEMBERSHIP_MSG);
    }
}
