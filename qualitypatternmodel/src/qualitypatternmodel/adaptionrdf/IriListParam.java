/**
 */
package qualitypatternmodel.adaptionrdf;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.parameters.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iri List Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriListParam#getIriParam <em>Iri Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriListParam#getRdfIriNode <em>Rdf Iri Node</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriListParam()
 * @model
 * @generated
 */
public interface IriListParam extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Iri Param</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionrdf.IriParam}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.IriParam#getIriListParam <em>Iri List Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iri Param</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriListParam_IriParam()
	 * @see qualitypatternmodel.adaptionrdf.IriParam#getIriListParam
	 * @model opposite="iriListParam" containment="true"
	 * @generated
	 */
	EList<IriParam> getIriParam();

	/**
	 * Returns the value of the '<em><b>Rdf Iri Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfIriNode#getRdfIriNodeTypes <em>Rdf Iri Node Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Iri Node</em>' reference.
	 * @see #setRdfIriNode(RdfIriNode)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriListParam_RdfIriNode()
	 * @see qualitypatternmodel.adaptionrdf.RdfIriNode#getRdfIriNodeTypes
	 * @model opposite="rdfIriNodeTypes"
	 * @generated
	 */
	RdfIriNode getRdfIriNode();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.IriListParam#getRdfIriNode <em>Rdf Iri Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Iri Node</em>' reference.
	 * @see #getRdfIriNode()
	 * @generated
	 */
	void setRdfIriNode(RdfIriNode value);

} // IriListParam
