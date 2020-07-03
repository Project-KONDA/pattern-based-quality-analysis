/**
 */
package qualitypatternmodel.adaptionxml;

import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.parameters.RelationOptionParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.XmlNavigation#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlNavigation()
 * @model
 * @generated
 */
public interface XmlNavigation extends Relation {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.RelationOptionParam#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(RelationOptionParam)
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#getXmlNavigation_Option()
	 * @see qualitypatternmodel.parameters.RelationOptionParam#getRelations
	 * @model opposite="relations"
	 * @generated
	 */
	RelationOptionParam getOption();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionxml.XmlNavigation#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(RelationOptionParam value);

} // XMLNavigation
