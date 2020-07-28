/**
 */
package qualitypatternmodel.execution;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getContext <em>Context</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getElementNames <em>Element Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getAttributeNames <em>Attribute Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getRecordedAttributeValues <em>Recorded Attribute Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getRecordedDataValues <em>Recorded Data Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getSchemaContext <em>Schema Context</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getNamespace <em>Namespace</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase()
 * @model
 * @generated
 */
public interface XmlDatabase extends Database {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(Context)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_Context()
	 * @model dataType="qualitypatternmodel.execution.BaseXContextWrapper"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.XmlDatabase#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * Returns the value of the '<em><b>Element Names</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Names</em>' map.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_ElementNames()
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
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_AttributeNames()
	 * @model mapType="qualitypatternmodel.execution.StringToIntMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getAttributeNames();

	/**
	 * Returns the value of the '<em><b>Recorded Attribute Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Attribute Values</em>' map.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_RecordedAttributeValues()
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
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_RecordedDataValues()
	 * @model mapType="qualitypatternmodel.execution.StringToIntMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject&gt;"
	 * @generated
	 */
	EMap<String, Integer> getRecordedDataValues();

	/**
	 * Returns the value of the '<em><b>Schema Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Context</em>' attribute.
	 * @see #setSchemaContext(Context)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_SchemaContext()
	 * @model dataType="qualitypatternmodel.execution.BaseXContextWrapper"
	 * @generated
	 */
	Context getSchemaContext();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.XmlDatabase#getSchemaContext <em>Schema Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Context</em>' attribute.
	 * @see #getSchemaContext()
	 * @generated
	 */
	void setSchemaContext(Context value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.XmlDatabase#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

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
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	void analyseSchema() throws BaseXException, QueryException, QueryIOException;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	void checkKeyRefInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkChildInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkParentInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkDescendantInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkAncestorInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkAttributeInSchema(String elementName, String attributeName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	void createSchemaDatabase() throws BaseXException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	void openSchemaDatabase() throws BaseXException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkFollowingSiblingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkPrecedingSiblingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkFollowingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	boolean checkPrecedingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	void initSchemaDatabase() throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getChildrenInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getDescendantsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getParentInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getAncestorsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getAttributesInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getFollowingSiblingsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getPrecedingSiblingsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getFollowingInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getPrecedingInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

} // XmlDatabase
