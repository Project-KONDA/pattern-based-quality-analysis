/**
 */
package qualitypatternmodel.javaoperators.impl;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.LinkMimeTypeOperator;
import qualitypatternmodel.javaoperators.LinkOperatorUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Mime Type Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LinkMimeTypeOperatorImpl extends OneArgJavaListOperatorImpl implements LinkMimeTypeOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkMimeTypeOperatorImpl() {
		super();
	}

	@Override
	public Boolean apply(String param) {
		Boolean negate = getOption().getValue();
		EList<String> types = getTextListParam().getValues();
		return apply2(param, negate, types);
	}
		
	public static Boolean apply2(String param, Boolean negate, List<String> mimes) {
		String mime = LinkOperatorUtil.getMimeType(param, "GET");
		if (mime == null)
			return negate;
		for (String type: mimes)
			if (type.length()>1 && mime.startsWith(type))
				return !negate;
		return negate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaoperatorsPackage.Literals.LINK_MIME_TYPE_OPERATOR;
	}

	@Override
	public String myToString() {
		String res = "LinkMimeType (" + getInternalId() + ")";
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

} //LinkMimeTypeOperatorImpl
