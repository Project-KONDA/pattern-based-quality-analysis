/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.RelationOptionParam#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.RelationOptionParam#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.RelationOptionParam#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getRelationOptionParam()
 * @model
 * @generated
 */
public interface RelationOptionParam extends Parameter {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionxml.RelationKind}.
	 * The literals are from the enumeration {@link qualitypatternmodel.adaptionxml.RelationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see qualitypatternmodel.adaptionxml.RelationKind
	 * @see qualitypatternmodel.parameters.ParametersPackage#getRelationOptionParam_Options()
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
	 * @see qualitypatternmodel.parameters.ParametersPackage#getRelationOptionParam_Value()
	 * @model required="true"
	 * @generated
	 */
	RelationKind getValue();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.parameters.RelationOptionParam#getValue <em>Value</em>}' attribute.
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
	 * @see qualitypatternmodel.parameters.ParametersPackage#getRelationOptionParam_Relations()
	 * @see qualitypatternmodel.adaptionxml.XmlNavigation#getOption
	 * @model opposite="option"
	 * @generated
	 */
	EList<XmlNavigation> getRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<RelationKind> inferSuggestions();

} // AxisOption
