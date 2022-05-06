/**
 */
package qualitypatternmodel.adaptionxml;

import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Navigation</b></em>'.
 * A relation between two XML elements in the hierarchically structured XML data that corresponds to an XPath axis.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlElementNavigation#getPathParam <em>Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlElementNavigation()
 * @model
 * @generated
 */
public interface XmlElementNavigation extends Relation {
	/**
	 * Returns the value of the '<em><b>Path Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.PathParam#getXmlNavigation <em>Xml Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Param</em>' reference.
	 * @see #setPathParam(PathParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlElementNavigation_PathParam()
	 * @see qualitypatternmodel.adaptionxml.PathParam#getXmlNavigation
	 * @model opposite="xmlNavigation" required="true"
	 * @generated
	 */
	PathParam getPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlElementNavigation#getPathParam <em>Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Param</em>' reference.
	 * @see #getPathParam()
	 * @generated
	 */
	void setPathParam(PathParam value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	PathParam getOriginalPathParam();

} // XMLNavigation
