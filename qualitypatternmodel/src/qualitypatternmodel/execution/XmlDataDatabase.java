/**
 */
package qualitypatternmodel.execution;

import java.io.IOException;
import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Database</b></em>'.
 * A BaseX XML database that patterns can be applied to.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.XmlDataDatabase#getRecordedAttributeValues <em>Recorded Attribute Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDataDatabase#getRecordedDataValues <em>Recorded Data Values</em>}</li>
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
	void setXmlSchema(XmlSchemaDatabase value) throws InvalidityException;

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
	 * Records an attribute <code>value</code> entered in a pattern for this <code>Database</code>.
	 * 
	 * @param value the attribute <code>value</code> to be recorded
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordAttributeValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Records a data <code>value</code> entered in a pattern for this <code>Database</code>.
	 * 
	 * @param value the data <code>value</code> to be recorded
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordDataValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Removes one occurrence of an attribute <code>value</code> from the record.
	 * 
	 * @param value the attribute <code>value</code> to be removed
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeAttributeValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Removes one occurrence of an data <code>value</code> from the record.
	 * 
	 * @param value the data <code>value</code> to be removed
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDataValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Records an element <code>name</code> entered in a pattern for this <code>Database</code>.
	 * 
	 * @param name the element <code>name</code> to be recorded
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordElementName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * Records an attribute <code>name</code> entered in a pattern for this <code>Database</code>.
	 * 
	 * @param name the attribute <code>name</code> to be recorded
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordAttributeName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * Removes one occurrence of an element <code>name</code> from the record.
	 * 
	 * @param value the element <code>name</code> to be removed
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeElementName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * Removes one occurrence of an attribute <code>name</code> from the record.
	 * 
	 * @param value the attribute <code>name</code> to be removed
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeAttributeName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * Records all <code>attributeNames</code>.
	 * 
	 * @param attributeNames the attribute names to be recorded
	 * <!-- end-user-doc -->
	 * @model attributeNamesMany="true"
	 * @generated
	 */
	void addAttributeNames(EList<String> attributeNames);

	/**
	 * <!-- begin-user-doc -->
	 * Records all <code>elementNames</code>.
	 * 
	 * @param elementNames the element names to be recorded
	 * <!-- end-user-doc -->
	 * @model elementNamesMany="true"
	 * @generated
	 */
	void addElementNames(EList<String> elementNames);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.IoExceptionWrapper qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper"
	 * @generated
	 */
	LocalXmlSchemaDatabase createSchemaDatabaseFromReferencedSchema() throws IOException, QueryException, InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.IoExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String findXSDURL() throws IOException, QueryException, InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.IoExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	EList<String> getSuggestionsFromAxisPreviousTag(AxisKind axisKind, String previousTag) throws IOException, QueryException, QueryIOException, BaseXException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.IoExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	EList<String> getSuggestionsFromAxisNextTag(AxisKind axisKind, String previousTag) throws IOException, QueryException, QueryIOException, BaseXException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.IoExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	EList<String> getSuggestionsFromAxisPreviousRoot(AxisKind axisKind) throws IOException, QueryException, QueryIOException, BaseXException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.IoExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	EList<AxisKind> getSuggestionsFromSourceTargetTag(String sourceTag, String targetTag) throws IOException, QueryException, QueryIOException, BaseXException;

} // XmlDatabase
