/**
 */
package qualitypatternmodel.javaoperators.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.LinkSourceOperator;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;

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

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		textListParam.isValid(abstractionLevel);
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
		EList<String> urls = getTextListParam().getValues();
		boolean contained = false;
		for (String part: urls) {
			contained = contained || url.contains(part);
		}
		if (!contained)
			return false;
		return (new ValidateLinkOperatorImpl()).apply(url);
	}

	@Override
	public EList<Node> getAllArgumentElements() {
		return primitiveNode.getAllArgumentElements();
	}

	@Override
	public EList<Comparable> getArguments(){
		EList<Comparable> list = super.getArguments();
		list.add(textListParam);
		return list;
	}

	@Override
	public void createParameters() {
		super.createParameters();
		ParameterList parameterList = getParameterList();
		if(parameterList != null) {
			if(getTextListParam() == null) {
				TextListParam textLiteral = new TextListParamImpl();
				setTextListParam(textLiteral);
			}
			parameterList.add(getTextListParam());
		}
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
		return res;
	}

} //LinkSourceOperatorImpl
