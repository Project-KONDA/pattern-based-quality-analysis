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
 *   <li>{@link qualitypatternmodel.adaptionxml.RelationOptionParam#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.RelationOptionParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.RelationOptionParam#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getRelationOptionParam()
 * @model
 * @generated
 */
public interface RelationOptionParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.RelationKind}.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionxml.RelationKind}.
	 * <!-- begin-user-doc -->
	 * Returns all allowed choices of type <code>RelationKind</code>.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.adaptionxml.RelationKind
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getRelationOptionParam_Options()
	 * @model
	 * @generated
	 */
	EList<RelationKind> getOptions();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionxml.RelationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.adaptionxml.RelationKind
	 * @see #setValue(RelationKind)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getRelationOptionParam_Value()
	 * @model required="true"
	 * @generated
	 */
	RelationKind getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.RelationOptionParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see qualitypatternmodel.adaptionxml.RelationKind
	 * @see #getValue()
	 * @generated
	 */
	void setValue(RelationKind value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.XmlNavigation}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlNavigation#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' reference list.
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getRelationOptionParam_Relations()
	 * @see qualitypatternmodel.adaptionxml.XmlNavigation#getOption
	 * @model opposite="option"
	 * @generated
	 */
	EList<XmlNavigation> getRelations();

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
	EList<RelationKind> inferSuggestions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setValueIfValid(RelationKind newValue) throws InvalidityException;

} // AxisOption
