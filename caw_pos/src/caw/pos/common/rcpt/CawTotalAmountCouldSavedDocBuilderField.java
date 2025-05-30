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
 * BZ24657          011217    "You could have saved..." receipts changes
 *===================================================================
 */

package caw.pos.common.rcpt;

import java.math.BigDecimal;
import java.util.Locale;

import dtv.docbuilding.IDocElementFactory;
import dtv.docbuilding.types.DocBuilderAlignmentType;
import dtv.i18n.formatter.output.IOutputFormatter;
import dtv.pos.common.rcpt.TotalAmountSavedDocBuilderField;
import dtv.util.NumberUtils;
import dtv.xst.dao.trl.IRetailTransaction;

/**
 *
 */
public class CawTotalAmountCouldSavedDocBuilderField
        extends TotalAmountSavedDocBuilderField {

    /**
    * Constructor.
    *
    * @param argContents the contents
    * @param argStyle the style
    * @param argLocation the location
    * @param argAlignment the alignment
    * @param argPriority the priority
    * @param argFormatter the formatter
    */
    public CawTotalAmountCouldSavedDocBuilderField(String argContents,
            String argStyle, Integer argLocation,
            DocBuilderAlignmentType argAlignment, int argPriority,
            IOutputFormatter argFormatter) {

        super(argContents, argStyle, argLocation, argAlignment, argPriority, argFormatter);
    }

    /** {@inheritDoc} */
    @Override
    public String getContents(Object argSource, IDocElementFactory argFactory,
            Locale argLocale) {

        BigDecimal totalDiscount = NumberUtils.ZERO;
        if (argSource instanceof IRetailTransaction) {
            totalDiscount = new CawTotalAmountCouldSavedWorker(
                    (IRetailTransaction) argSource).call();
        }

        return getFormatter().format(totalDiscount, argLocale);
    }
}
