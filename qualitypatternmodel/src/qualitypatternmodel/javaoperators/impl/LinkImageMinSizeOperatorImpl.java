/**
 */
package qualitypatternmodel.javaoperators.impl;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.LinkImageMinSizeOperator;
import qualitypatternmodel.javaoperators.LinkOperatorUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Image Size Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LinkImageMinSizeOperatorImpl extends OneArgJavaTwoNumberOperatorImpl implements LinkImageMinSizeOperator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImageMinSizeOperatorImpl() {
		super();
	}

	@Override
	public Boolean apply(String param) {
		Boolean negate = getOption().getValue();
		double width = getNumber1().getValue();
		double height = getNumber2().getValue();
		return apply2(param, negate, width, height);
	}
	
	public static Boolean apply2(String param, Boolean negate, double width, double height) {
		Pair<Integer, Integer> size = LinkOperatorUtil.getImageSize(param, "GET");

		if (size == null || size.getLeft() == null || size.getRight() == null) 
			return negate;

		double min = (width + height - Math.abs(width - height)) / 2;
		double max = (width + height + Math.abs(width - height)) / 2;
		int min2 = (size.getLeft() + size.getRight() - Math.abs(size.getLeft() - size.getRight())) / 2;
		int max2 = (size.getLeft() + size.getRight() + Math.abs(size.getLeft() - size.getRight())) / 2;

		Boolean result = min <= min2 && max <= max2; 
		return result != negate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaoperatorsPackage.Literals.LINK_IMAGE_MIN_SIZE_OPERATOR;
	}

	@Override
	public String myToString() {
		String res = "LinkImageSize (" + getInternalId() + ")";
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
		if (getNumber1() == null)
			res += "( no num1";
		else 
			res += "( num " + getNumber1().getInternalId();

		if (getNumber2() == null)
			res += " x no num2 )";
		else 
			res += " x num" + getNumber2().getInternalId() + " )";
		return res;
	}

} //LinkImageSizeOperatorImpl
