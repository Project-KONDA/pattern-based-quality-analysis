/**
 */
package qualitypatternmodel.execution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.XmlSchema#getXmlDatabases <em>Xml Databases</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlSchema()
 * @model
 * @generated
 */
public interface XmlSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Xml Databases</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.execution.XmlDatabase}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.execution.XmlDatabase#getXmlSchema <em>Xml Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Databases</em>' reference list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlSchema_XmlDatabases()
	 * @see qualitypatternmodel.execution.XmlDatabase#getXmlSchema
	 * @model opposite="xmlSchema"
	 * @generated
	 */
	EList<XmlDatabase> getXmlDatabases();

} // XmlSchema
