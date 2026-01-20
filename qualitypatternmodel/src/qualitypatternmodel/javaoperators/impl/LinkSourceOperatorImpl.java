/**
 */
package qualitypatternmodel.javaoperators.impl;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.LinkOperatorUtil;
import qualitypatternmodel.javaoperators.LinkSourceOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Source Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LinkSourceOperatorImpl extends OneArgJavaListOperatorImpl implements LinkSourceOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkSourceOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaoperatorsPackage.Literals.LINK_SOURCE_OPERATOR;
	}

	@Override
	public Boolean apply(String url) {
		Boolean negate = getOption().getValue();
		EList<String> urls = getTextListParam().getValues();
		return apply2(url, negate, urls);
	}
	
	public static Boolean apply2(String url, Boolean negate, List<String> urls) {
		boolean contained = false;
		for (String part: urls) {
			contained = contained || url.contains(part);
		}
		if (!contained)
			return negate;

		String urlString = url.trim();
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
		String res = "LinkSource (" + getInternalId() + ")";
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
		if (getTextListParam() != null) {
			res += "[list " + getTextListParam().getInternalId() + "]";
		} else {
			res += "[no list] ";
		}
		return res;
	}

} //LinkSourceOperatorImpl
