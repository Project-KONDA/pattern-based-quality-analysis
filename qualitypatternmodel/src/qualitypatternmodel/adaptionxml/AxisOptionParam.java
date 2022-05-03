/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RelationOptionParam</b></em>'.
 * A parameter for specifying <code>XmlNavigations</code> via an XPath axis.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.AxisOptionParam#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.AxisOptionParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.AxisOptionParam#getAxisPair <em>Axis Pair</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getAxisOptionParam()
 * @model
 * @generated
 */
public interface AxisOptionParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.AxisKind}.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionxml.AxisKind}.
	 * <!-- begin-user-doc -->
	 * Returns all allowed choices of type <code>RelationKind</code>.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.adaptionxml.AxisKind
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getAxisOptionParam_Options()
	 * @model
	 * @generated
	 */
	EList<AxisKind> getOptions();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionxml.AxisKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.adaptionxml.AxisKind
	 * @see #setValue(AxisKind)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getAxisOptionParam_Value()
	 * @model required="true"
	 * @generated
	 */
	AxisKind getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.AxisOptionParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.adaptionxml.AxisKind
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AxisKind value);

	/**
	 * Returns the value of the '<em><b>Axis Pair</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.AxisPair#getAxisOptionParam <em>Axis Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Pair</em>' container reference.
	 * @see #setAxisPair(AxisPair)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getAxisOptionParam_AxisPair()
	 * @see qualitypatternmodel.adaptionxml.AxisPair#getAxisOptionParam
	 * @model opposite="axisOptionParam" required="true" transient="false"
	 * @generated
	 */
	AxisPair getAxisPair();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.AxisOptionParam#getAxisPair <em>Axis Pair</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Pair</em>' container reference.
	 * @see #getAxisPair()
	 * @generated
	 */
	void setAxisPair(AxisPair value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of suggested <code>RelationsKinds</code> for the <code>value</code> based on
	 * already specified tag names of <code>source</code> and <code>target</code>.
	 * 
	 * @return a list of suggested <code>RelationsKinds</code> for the <code>value</code> based on
	 * already specified tag names of <code>source</code> and <code>target</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<AxisKind> inferSuggestions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueIfValid(AxisKind newValue) throws InvalidityException;

} // AxisOption
