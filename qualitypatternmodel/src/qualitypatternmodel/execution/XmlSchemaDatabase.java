/**
 */
package qualitypatternmodel.execution;

import java.io.IOException;
import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Schema</b></em>'.
 * A BaseX XML database containing an XML schema definition.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.XmlSchemaDatabase#getXmlDatabases <em>Xml Databases</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlSchemaDatabase#getElementNames <em>Element Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlSchemaDatabase#getAttributeNames <em>Attribute Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlSchemaDatabase#getRootElementNames <em>Root Element Names</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlSchemaDatabase#getPrefix <em>Prefix</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlSchemaDatabase()
 * @model
 * @generated
 */
public interface XmlSchemaDatabase extends XmlDatabase, Databaseformat {
	/**
	 * Returns the value of the '<em><b>Xml Databases</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.execution.XmlDataDatabase}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.execution.XmlDataDatabase#getXmlSchema <em>Xml Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Databases</em>' reference list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlSchemaDatabase_XmlDatabases()
	 * @see qualitypatternmodel.execution.XmlDataDatabase#getXmlSchema
	 * @model opposite="xmlSchema"
	 * @generated
	 */
	EList<XmlDataDatabase> getXmlDatabases();

	/**
	 * Returns the value of the '<em><b>Element Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Names</em>' attribute list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlSchemaDatabase_ElementNames()
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
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlSchemaDatabase_AttributeNames()
	 * @model
	 * @generated
	 */
	EList<String> getAttributeNames();

	/**
	 * Returns the value of the '<em><b>Root Element Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element Names</em>' attribute list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlSchemaDatabase_RootElementNames()
	 * @model
	 * @generated
	 */
	EList<String> getRootElementNames();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getXmlSchemaDatabase_Prefix()
	 * @model
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.XmlSchemaDatabase#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	void checkKeyRefInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their child.
	 * 
	 * @param elementName1 the name of the parent XML elements
	 * @param elementName2 the name of the child XML elements
	 * @return <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their child
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	boolean checkChildInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their parent.
	 * 
	 * @param elementName1 the name of the child XML elements
	 * @param elementName2 the name of the parent XML elements
	 * @return <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their parent
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	boolean checkParentInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their descendant.
	 * 
	 * @param elementName1 the name of the parent XML elements
	 * @param elementName2 the name of the descendant XML elements
	 * @return <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their descendant
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	boolean checkDescendantInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their ancestor.
	 * 
	 * @param elementName1 the name of the descendant XML elements
	 * @param elementName2 the name of the ancestor XML elements
	 * @return <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their ancestor
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	boolean checkAncestorInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if according to the XML schema XML elements with name <code>elementName</code> may contain XML attributes with name <code>attributeName</code>.
	 * 
	 * @param elementName the name of the XML element
	 * @param attributeName the name of the XML attribute
	 * @return <code>true</code> if according to the XML schema XML elements with name <code>elementName</code> may contain XML attributes with name <code>attributeName</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	boolean checkAttributeInSchema(String elementName, String attributeName) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their following sibling.
	 * 
	 * @param elementName1 the name of the preceding sibling XML elements
	 * @param elementName2 the name of the following sibling XML elements
	 * @return <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their following sibling
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	boolean checkFollowingSiblingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their preceding sibling.
	 * 
	 * @param elementName1 the name of the following sibling XML elements
	 * @param elementName2 the name of the preceding sibling XML elements
	 * @return <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their preceding sibling
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	boolean checkPrecedingSiblingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their following element.
	 * 
	 * @param elementName1 the name of the preceding XML elements
	 * @param elementName2 the name of the following XML elements
	 * @return <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their following element
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	boolean checkFollowingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their preceding element.
	 * 
	 * @param elementName1 the name of the following XML elements
	 * @param elementName2 the name of the preceding XML elements
	 * @return <code>true</code> if according to the XML schema XML elements with name <code>elementName1</code> may have XML elements with name <code>elementName2</code> as their following element
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	boolean checkPrecedingInSchema(String elementName1, String elementName2) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of names of XML elements that according to the XML schema may occur as children of XML elements with name <code>elementName</code>.
	 * 
	 * @param elementName the name of the parent XML element
	 * @return a list of names of XML elements that according to the XML schema may occur as children of XML elements with name <code>elementName</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getChildrenInSchema(String elementName) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of names of XML elements that according to the XML schema may occur as descendants of XML elements with name <code>elementName</code>.
	 * 
	 * @param elementName the name of the ancestor XML element
	 * @return a list of names of XML elements that according to the XML schema may occur as descendants of XML elements with name <code>elementName</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getDescendantsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of names of XML elements that according to the XML schema may occur as parents of XML elements with name <code>elementName</code>.
	 * 
	 * @param elementName the name of the child XML element
	 * @return a list of names of XML elements that according to the XML schema may occur as parents of XML elements with name <code>elementName</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getParentsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of names of XML elements that according to the XML schema may occur as ancestors of XML elements with name <code>elementName</code>.
	 * 
	 * @param elementName the name of the descendant XML element
	 * @return a list of names of XML elements that according to the XML schema may occur as ancestors of XML elements with name <code>elementName</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getAncestorsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of names of XML attributes that according to the XML schema may occur in XML elements with name <code>elementName</code>.
	 * 
	 * @param elementName the name of the XML element
	 * @return a list of names of XML attributes that according to the XML schema may occur in XML elements with name <code>elementName</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getAttributesInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of names of XML elements that according to the XML schema may occur as following siblings of XML elements with name <code>elementName</code>.
	 * 
	 * @param elementName the name of the preceding sibling XML element
	 * @return a list of names of XML elements that according to the XML schema may occur as following siblings of XML elements with name <code>elementName</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getFollowingSiblingsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of names of XML elements that according to the XML schema may occur as preceding siblings of XML elements with name <code>elementName</code>.
	 * 
	 * @param elementName the name of the following sibling XML element
	 * @return a list of names of XML elements that according to the XML schema may occur as preceding siblings of XML elements with name <code>elementName</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getPrecedingSiblingsInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of names of XML elements that according to the XML schema may occur as following elements of XML elements with name <code>elementName</code>.
	 * 
	 * @param elementName the name of the preceding XML element
	 * @return a list of names of XML elements that according to the XML schema may occur as following elements of XML elements with name <code>elementName</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getFollowingInSchema(String elementName) throws BaseXException, QueryException, QueryIOException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of names of XML elements that according to the XML schema may occur as preceding elements of XML elements with name <code>elementName</code>.
	 * 
	 * @param elementName the name of the following XML element
	 * @return a list of names of XML elements that according to the XML schema may occur as preceding elements of XML elements with name <code>elementName</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.execution.BaseXExceptionWrapper qualitypatternmodel.execution.QueryExceptionWrapper qualitypatternmodel.execution.QueryIOExceptionWrapper"
	 * @generated
	 */
	EList<String> getPrecedingInSchema(String elementName) throws BaseXException, QueryException, QueryIOException;

} // XmlSchema
