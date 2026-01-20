/**
 */
package qualitypatternmodel.javaoperators.impl;

import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.LinkOperatorUtil;
import qualitypatternmodel.javaoperators.ValidateLinkOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validate Link Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ValidateLinkOperatorImpl extends OneArgJavaOperatorImpl implements ValidateLinkOperator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidateLinkOperatorImpl() {
		super();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaoperatorsPackage.Literals.VALIDATE_LINK_OPERATOR;
	}
	@Override
	public Boolean apply(String urlString) {
		Boolean negate = getOption().getValue();
		return apply2(urlString, negate);
	}
	
	public static Boolean apply2(String urlString, Boolean negate) {
		urlString = urlString.trim();
		Boolean result = false;
		for (String method: LinkOperatorUtil.REQUEST_METHOD) {
			if (!result) {
				result = LinkOperatorUtil.evaluateResponseCode(urlString, method);
			}
		}
		return result != negate;
	}
	@Override
	public String myToString() {
		String res = "ValidateLink (" + getInternalId() + ")";
		if (getOption() != null) {
			res +=  "[bool ";
			if (!getOption().getValue()) {
				res += "not ";
			}
			res += getOption().getInternalId() + "]";
		} else {
			res += "[no option] ";
		}

		if (getPrimitiveNode() != null) {
			res += "[node " + getPrimitiveNode().getInternalId() + "]";
		} else {
			res += "[no node] ";
		}
		return res;
	}
} //ValidateLinkOperatorImpl
