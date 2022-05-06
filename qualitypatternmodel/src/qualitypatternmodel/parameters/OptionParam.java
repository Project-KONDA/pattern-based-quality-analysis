/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.patternstructure.CountCondition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Param</b></em>'.
 * Defines input parameter specified by an enumeration <code>T</code>.
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
 *   <li>{@link qualitypatternmodel.parameters.OptionParam#getCountCondition <em>Count Condition</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlProperty#getOptionParam <em>Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(XmlProperty)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getOptionParam_Property()
	 * @see qualitypatternmodel.adaptionxml.XmlProperty#getOptionParam
	 * @model opposite="optionParam"
	 * @generated
	 */
	XmlProperty getProperty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.OptionParam#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(XmlProperty value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlElementNavigation#getOptionParam <em>Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(XmlElementNavigation)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getOptionParam_Relation()
	 * @see qualitypatternmodel.adaptionxml.XmlElementNavigation#getOptionParam
	 * @model opposite="optionParam"
	 * @generated
	 */
	XmlElementNavigation getRelation();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.OptionParam#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(XmlElementNavigation value);

	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Comparison}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Comparison#getOptionParam <em>Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getOptionParam_Comparison()
	 * @see qualitypatternmodel.operators.Comparison#getOptionParam
	 * @model opposite="optionParam"
	 * @generated
	 */
	EList<Comparison> getComparison();

	/**
	 * Returns the value of the '<em><b>Count Condition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CountCondition#getOptionParam <em>Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count Condition</em>' reference.
	 * @see #setCountCondition(CountCondition)
	 * @see qualitypatternmodel.parameters.ParametersPackage#getOptionParam_CountCondition()
	 * @see qualitypatternmodel.patternstructure.CountCondition#getOptionParam
	 * @model opposite="optionParam"
	 * @generated
	 */
	CountCondition getCountCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.OptionParam#getCountCondition <em>Count Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count Condition</em>' reference.
	 * @see #getCountCondition()
	 * @generated
	 */
	void setCountCondition(CountCondition value);

} // OptionParam
