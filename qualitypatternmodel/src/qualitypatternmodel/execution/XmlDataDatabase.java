/**
 */
package qualitypatternmodel.execution;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Database</b></em>'.
 * A BaseX XML database.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.XmlDataDatabase#getContext <em>Context</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDataDatabase#getRecordedAttributeValues <em>Recorded Attribute Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDataDatabase#getRecordedDataValues <em>Recorded Data Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDataDatabase#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDataDatabase#getXmlSchema <em>Xml Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDataDatabase#getElementNames <em>Element Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDataDatabase#getAttributeNames <em>Attribute Names</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDataDatabase()
 * @model
 * @generated
 */
public interface XmlDataDatabase extends XmlDatabase, Database {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(Context)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDataDatabase_Context()
	 * @model dataType="qualitypatternmodel.execution.BaseXContextWrapper"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.XmlDataDatabase#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Recorded Attribute Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Attribute Values</em>' map.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDataDatabase_RecordedAttributeValues()
	 * @model mapType="qualitypatternmodel.execution.StringToIntMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getRecordedAttributeValues();

	/**
	 * Returns the value of the '<em><b>Recorded Data Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Data Values</em>' map.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDataDatabase_RecordedDataValues()
	 * @model mapType="qualitypatternmodel.execution.StringToIntMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getRecordedDataValues();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDataDatabase_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.XmlDataDatabase#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Xml Schema</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getXmlDatabases <em>Xml Databases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Schema</em>' reference.
	 * @see #setXmlSchema(XmlSchemaDatabase)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDataDatabase_XmlSchema()
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase#getXmlDatabases
	 * @model opposite="xmlDatabases"
	 * @generated
	 */
	XmlSchemaDatabase getXmlSchema();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.XmlDataDatabase#getXmlSchema <em>Xml Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Schema</em>' reference.
	 * @see #getXmlSchema()
	 * @generated
	 */
	void setXmlSchema(XmlSchemaDatabase value);

	/**
	 * Returns the value of the '<em><b>Element Names</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Names</em>' map.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDataDatabase_ElementNames()
	 * @model mapType="qualitypatternmodel.execution.StringToIntMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getElementNames();

	/**
	 * Returns the value of the '<em><b>Attribute Names</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Names</em>' map.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDataDatabase_AttributeNames()
	 * @model mapType="qualitypatternmodel.execution.StringToIntMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getAttributeNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	void analyseDatabase() throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordAttributeValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordDataValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeAttributeValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDataValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	void init() throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	void open() throws BaseXException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordElementName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordAttributeName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeElementName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeAttributeName(String name);

} // XmlDatabase
