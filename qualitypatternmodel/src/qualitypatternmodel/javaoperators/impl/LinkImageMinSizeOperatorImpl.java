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
	public Boolean apply(String param1) {
		double width = getNumber1().getValue();
		double height = getNumber2().getValue();
		Pair<Integer, Integer> size = LinkOperatorUtil.getImageSize(param1, "GET");
		if (size == null || size.getLeft() == null || size.getRight() == null) 
			return false;
		
		double min = (width + height - Math.abs(width - height)) / 2;
		double max = (width + height + Math.abs(width - height)) / 2;
		
		int min2 = (size.getLeft() + size.getRight() - Math.abs(size.getLeft() - size.getRight())) / 2;
		int max2 = (size.getLeft() + size.getRight() + Math.abs(size.getLeft() - size.getRight())) / 2;
				
		return min <= min2 && max <= max2;
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
		return res;
	}

} //LinkImageSizeOperatorImpl
