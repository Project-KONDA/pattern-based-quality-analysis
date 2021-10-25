/**
 */
package qualitypatternmodel.execution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Databases</b></em>'.
 * A singleton that contains all defined databases.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.Databases#getXmlDatabases <em>Xml Databases</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Databases#getXmlSchemata <em>Xml Schemata</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getDatabases()
 * @model
 * @generated
 */
public interface Databases extends EObject {
	/**
	 * Returns the value of the '<em><b>Xml Databases</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.execution.XmlDataDatabase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Databases</em>' containment reference list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getDatabases_XmlDatabases()
	 * @model containment="true"
	 * @generated
	 */
	EList<XmlDataDatabase> getXmlDatabases();

	/**
	 * Returns the value of the '<em><b>Xml Schemata</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.execution.XmlSchemaDatabase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Schemata</em>' containment reference list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getDatabases_XmlSchemata()
	 * @model containment="true"
	 * @generated
	 */
	EList<XmlSchemaDatabase> getXmlSchemata();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void clear();

} // Databases
