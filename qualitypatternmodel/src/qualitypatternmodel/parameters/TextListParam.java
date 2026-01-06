/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaoperators.OneArgJavaListOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text List</b></em>'.
 * Defines input parameter of type List<String>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.TextListParam#getJavaListOperator <em>Java List Operator</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getTextListParam()
 * @model
 * @generated
 */
public interface TextListParam extends ListParam, TextParam {

	/**
	 * Returns the value of the '<em><b>Java List Operator</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.javaoperators.OneArgJavaListOperator}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.javaoperators.OneArgJavaListOperator#getTextListParam <em>Text List Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java List Operator</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextListParam_JavaListOperator()
	 * @see qualitypatternmodel.javaoperators.OneArgJavaListOperator#getTextListParam
	 * @model opposite="textListParam"
	 * @generated
	 */
	EList<OneArgJavaListOperator> getJavaListOperator();

	@Override
	void setValueIfValid(EList<String> newValue) throws InvalidityException;
} // TextList
