/**
 */
package qualitypatternmodel.functions;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.ComparisonOptionParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.Comparison#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.Comparison#getArgument2 <em>Argument2</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.Comparison#getType <em>Type</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.Comparison#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends BooleanOperator {
	/**
	 * Returns the value of the '<em><b>Argument1</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Comparable#getComparison1 <em>Comparison1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument1</em>' reference.
	 * @see #setArgument1(qualitypatternmodel.graphstructure.Comparable)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison_Argument1()
	 * @see qualitypatternmodel.graphstructure.Comparable#getComparison1
	 * @model opposite="comparison1" required="true"
	 * @generated
	 */
	qualitypatternmodel.graphstructure.Comparable getArgument1();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Comparison#getArgument1 <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument1</em>' reference.
	 * @see #getArgument1()
	 * @generated
	 */
	void setArgument1(qualitypatternmodel.graphstructure.Comparable value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.ComparisonOptionParam#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(ComparisonOptionParam)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison_Option()
	 * @see qualitypatternmodel.parameters.ComparisonOptionParam#getComparison
	 * @model opposite="comparison" required="true"
	 * @generated
	 */
	ComparisonOptionParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Comparison#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(ComparisonOptionParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setTypeAccordingToArgument(qualitypatternmodel.graphstructure.Comparable newArgument, qualitypatternmodel.graphstructure.Comparable otherArgument);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void adaptOperatorElementAssociation(qualitypatternmodel.graphstructure.Comparable newArgument, qualitypatternmodel.graphstructure.Comparable oldArgument);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void moveElementsFromRootOperatorToOldArgument(qualitypatternmodel.graphstructure.Comparable oldArgument, BooleanOperator rootOperator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeOldArgumentElementsFromRootOperator(qualitypatternmodel.graphstructure.Comparable oldArgument, BooleanOperator rootOperator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootBooleanOperatorsMany="true"
	 * @generated
	 */
	void moveElementsFromNewArgumentToRootOperator(qualitypatternmodel.graphstructure.Comparable newArgument, EList<BooleanOperator> rootBooleanOperators);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootBooleanOperatorsMany="true"
	 * @generated
	 */
	void addNewArgumentElementsToRootOperator(qualitypatternmodel.graphstructure.Comparable newArgument, EList<BooleanOperator> rootBooleanOperators);

	/**
	 * Returns the value of the '<em><b>Argument2</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Comparable#getComparison2 <em>Comparison2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument2</em>' reference.
	 * @see #setArgument2(qualitypatternmodel.graphstructure.Comparable)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison_Argument2()
	 * @see qualitypatternmodel.graphstructure.Comparable#getComparison2
	 * @model opposite="comparison2" required="true"
	 * @generated
	 */
	qualitypatternmodel.graphstructure.Comparable getArgument2();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Comparison#getArgument2 <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument2</em>' reference.
	 * @see #getArgument2()
	 * @generated
	 */
	void setArgument2(qualitypatternmodel.graphstructure.Comparable value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.graphstructure.ReturnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @see #setType(ReturnType)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getComparison_Type()
	 * @model
	 * @generated
	 */
	ReturnType getType();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Comparison#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see qualitypatternmodel.graphstructure.ReturnType
	 * @see #getType()
	 * @generated
	 */
	void setType(ReturnType value);

} // Comparison
