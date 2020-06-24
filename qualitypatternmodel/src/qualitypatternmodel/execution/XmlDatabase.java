/**
 */
package qualitypatternmodel.execution;

import org.basex.core.BaseXException;
import org.basex.core.Context;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getElementNames <em>Element Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getAttributeNames <em>Attribute Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getRecordedAttributeValues <em>Recorded Attribute Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getRecordedDataValues <em>Recorded Data Values</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase()
 * @model
 * @generated
 */
public interface XmlDatabase extends Database {
	/**
	 * Returns the value of the '<em><b>Element Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Names</em>' attribute list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_ElementNames()
	 * @model
	 * @generated
	 */
	EList<String> getElementNames();

	/**
	 * Returns the value of the '<em><b>Attribute Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Names</em>' attribute list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_AttributeNames()
	 * @model
	 * @generated
	 */
	EList<String> getAttributeNames();

	/**
	 * Returns the value of the '<em><b>Recorded Attribute Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Attribute Values</em>' attribute list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_RecordedAttributeValues()
	 * @model
	 * @generated
	 */
	EList<String> getRecordedAttributeValues();

	/**
	 * Returns the value of the '<em><b>Recorded Data Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Data Values</em>' attribute list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlDatabase_RecordedDataValues()
	 * @model
	 * @generated
	 */
	EList<String> getRecordedDataValues();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	void analyseDatabase() throws BaseXException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	void analyseSchema() throws BaseXException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordAttributeValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordDataValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeAttributeValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeDataValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	void init() throws BaseXException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	void open() throws BaseXException;

} // XmlDatabase
