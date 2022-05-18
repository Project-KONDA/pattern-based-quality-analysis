/**
 */
package qualitypatternmodel.adaptionxml;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlNavigation#getXmlPathParam <em>Xml Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlNavigation#getSourceVariable <em>Source Variable</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlNavigation#getVariableCounter <em>Variable Counter</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlNavigation()
 * @model abstract="true"
 * @generated
 */
public interface XmlNavigation extends Relation {
	/**
	 * Returns the value of the '<em><b>Xml Path Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.XmlPathParam#getXmlNavigation <em>Xml Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Path Param</em>' reference.
	 * @see #setXmlPathParam(XmlPathParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlNavigation_XmlPathParam()
	 * @see qualitypatternmodel.adaptionxml.XmlPathParam#getXmlNavigation
	 * @model opposite="xmlNavigation"
	 * @generated
	 */
	XmlPathParam getXmlPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlNavigation#getXmlPathParam <em>Xml Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Path Param</em>' reference.
	 * @see #getXmlPathParam()
	 * @generated
	 */
	void setXmlPathParam(XmlPathParam value);

	/**
	 * Returns the value of the '<em><b>Source Variable</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Variable</em>' attribute.
	 * @see #setSourceVariable(String)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlNavigation_SourceVariable()
	 * @model default=""
	 * @generated
	 */
	String getSourceVariable();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlNavigation#getSourceVariable <em>Source Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Variable</em>' attribute.
	 * @see #getSourceVariable()
	 * @generated
	 */
	void setSourceVariable(String value);

	/**
	 * Returns the value of the '<em><b>Variable Counter</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Counter</em>' attribute.
	 * @see #setVariableCounter(int)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlNavigation_VariableCounter()
	 * @model default="0"
	 * @generated
	 */
	int getVariableCounter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlNavigation#getVariableCounter <em>Variable Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Counter</em>' attribute.
	 * @see #getVariableCounter()
	 * @generated
	 */
	void setVariableCounter(int value);

	String generateXQuery() throws InvalidityException;

} // XmlNavigation
