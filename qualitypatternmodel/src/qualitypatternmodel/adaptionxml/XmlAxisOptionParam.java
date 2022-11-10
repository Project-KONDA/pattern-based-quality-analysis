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
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getXmlAxisPart <em>Xml Axis Part</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisOptionParam()
 * @model
 * @generated
 */
public interface XmlAxisOptionParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.XmlAxisKind}.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionxml.XmlAxisKind}.
	 * <!-- begin-user-doc -->
	 * Returns all allowed choices of type <code>RelationKind</code>.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisKind
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisOptionParam_Options()
	 * @model
	 * @generated
	 */
	EList<XmlAxisKind> getOptions();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionxml.XmlAxisKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisKind
	 * @see #setValue(XmlAxisKind)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisOptionParam_Value()
	 * @model required="true"
	 * @generated
	 */
	XmlAxisKind getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.adaptionxml.XmlAxisKind
	 * @see #getValue()
	 * @generated
	 */
	void setValue(XmlAxisKind value);

	/**
	 * Returns the value of the '<em><b>Xml Axis Part</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlAxisOptionParam <em>Xml Axis Option Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Axis Part</em>' container reference.
	 * @see #setXmlAxisPart(XmlAxisPart)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlAxisOptionParam_XmlAxisPart()
	 * @see qualitypatternmodel.adaptionxml.XmlAxisPart#getXmlAxisOptionParam
	 * @model opposite="xmlAxisOptionParam" required="true" transient="false"
	 * @generated
	 */
	XmlAxisPart getXmlAxisPart();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlAxisOptionParam#getXmlAxisPart <em>Xml Axis Part</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Axis Part</em>' container reference.
	 * @see #getXmlAxisPart()
	 * @generated
	 */
	void setXmlAxisPart(XmlAxisPart value);

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
	EList<XmlAxisKind> inferSuggestions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueIfValid(XmlAxisKind newValue) throws InvalidityException;

} // AxisOption
