/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import qualitypatternmodel.adaptionxml.XmlElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getParameterValue()
 * @model abstract="true"
 * @generated
 */
public interface ParameterValue extends Parameter, qualitypatternmodel.graphstructure.Comparable {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInTagComparison();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInAttributeComparison();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isInDataComparison();

	EMap<String, Integer> getElementTags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.parameters.StringToIntEMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getAttributeNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.parameters.StringToIntEMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getDataValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.parameters.StringToIntEMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getAttributeValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getSuggestions();

	EList<String> inferElementTagSuggestions();

	EList<XmlElement> getTagComparisonElements();
} // XSType
