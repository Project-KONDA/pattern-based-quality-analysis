/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.patternstructure.CountCondition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.OptionParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.OptionParam#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.OptionParam#getProperty <em>Property</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.OptionParam#getRelation <em>Relation</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.OptionParam#getComparison <em>Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.OptionParam#getCountcondition <em>Countcondition</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getOptionParam()
 * @model
 * @generated
 */
public interface OptionParam<T> extends Parameter {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getOptionParam_Value()
	 * @model
	 * @generated
	 */
	T getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.OptionParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(T value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getOptionParam_Options()
	 * @model
	 * @generated
	 */
	EList<T> getOptions();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Property#getOptionParam <em>Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getOptionParam_Property()
	 * @see qualitypatternmodel.graphstructure.Property#getOptionParam
	 * @model opposite="optionParam"
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.OptionParam#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Relation#getOptionParam <em>Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(Relation)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getOptionParam_Relation()
	 * @see qualitypatternmodel.graphstructure.Relation#getOptionParam
	 * @model opposite="optionParam"
	 * @generated
	 */
	Relation getRelation();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.OptionParam#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(Relation value);

	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.functions.Comparison}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.Comparison#getOptionParam <em>Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getOptionParam_Comparison()
	 * @see qualitypatternmodel.functions.Comparison#getOptionParam
	 * @model opposite="optionParam"
	 * @generated
	 */
	EList<Comparison> getComparison();

	/**
	 * Returns the value of the '<em><b>Countcondition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountCondition#getOptionParam <em>Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countcondition</em>' reference.
	 * @see #setCountcondition(CountCondition)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getOptionParam_Countcondition()
	 * @see qualitypatternmodel.patternstructure.CountCondition#getOptionParam
	 * @model opposite="optionParam"
	 * @generated
	 */
	CountCondition getCountcondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.OptionParam#getCountcondition <em>Countcondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Countcondition</em>' reference.
	 * @see #getCountcondition()
	 * @generated
	 */
	void setCountcondition(CountCondition value);

} // OptionParam
