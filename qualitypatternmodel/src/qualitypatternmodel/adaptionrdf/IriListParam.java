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
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriListParam#getIriParams <em>Iri Params</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriListParam#getRdfIriNode <em>Rdf Iri Node</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.IriListParam#getRdfPathPart <em>Rdf Path Part</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriListParam()
 * @model
 * @generated
 */
public interface IriListParam extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Iri Params</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.adaptionrdf.IriParam}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.IriParam#getIriListParam <em>Iri List Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iri Params</em>' containment reference list.
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriListParam_IriParams()
	 * @see qualitypatternmodel.adaptionrdf.IriParam#getIriListParam
	 * @model opposite="iriListParam" containment="true"
	 * @generated
	 */
	EList<IriParam> getIriParams();

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

	/**
	 * Returns the value of the '<em><b>Rdf Path Part</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.RdfPathPart#getTargetNodeTypes <em>Target Node Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Path Part</em>' container reference.
	 * @see #setRdfPathPart(RdfPathPart)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getIriListParam_RdfPathPart()
	 * @see qualitypatternmodel.adaptionrdf.RdfPathPart#getTargetNodeTypes
	 * @model opposite="targetNodeTypes" transient="false"
	 * @generated
	 */
	RdfPathPart getRdfPathPart();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.IriListParam#getRdfPathPart <em>Rdf Path Part</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Path Part</em>' container reference.
	 * @see #getRdfPathPart()
	 * @generated
	 */
	void setRdfPathPart(RdfPathPart value);

} // IriListParam
