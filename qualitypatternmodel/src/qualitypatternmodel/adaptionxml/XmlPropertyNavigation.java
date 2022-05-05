/**
 */
package qualitypatternmodel.adaptionxml;

import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Property Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlPropertyNavigation#getPathParam <em>Path Param</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPropertyNavigation()
 * @model
 * @generated
 */
public interface XmlPropertyNavigation extends Relation {

	/**
	 * Returns the value of the '<em><b>Path Param</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionxml.PathParam#getXmlPropertyNavigation <em>Xml Property Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Param</em>' reference.
	 * @see #setPathParam(PathParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlPropertyNavigation_PathParam()
	 * @see qualitypatternmodel.adaptionxml.PathParam#getXmlPropertyNavigation
	 * @model opposite="xmlPropertyNavigation" required="true"
	 * @generated
	 */
	PathParam getPathParam();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlPropertyNavigation#getPathParam <em>Path Param</em>}' reference.
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
} // XmlPropertyNavigation
