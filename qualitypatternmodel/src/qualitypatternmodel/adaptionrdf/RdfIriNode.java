/**
 */
package qualitypatternmodel.adaptionrdf;

import qualitypatternmodel.graphstructure.ComplexNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdf Iri Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.RdfIriNode#getRdfIriNodeTypes <em>Rdf Iri Node Types</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfIriNode()
 * @model
 * @generated
 */
public interface RdfIriNode extends ComplexNode, RdfNode {

	/**
	 * Returns the value of the '<em><b>Rdf Iri Node Types</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.adaptionrdf.IriListParam#getRdfIriNode <em>Rdf Iri Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rdf Iri Node Types</em>' reference.
	 * @see #setRdfIriNodeTypes(IriListParam)
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfIriNode_RdfIriNodeTypes()
	 * @see qualitypatternmodel.adaptionrdf.IriListParam#getRdfIriNode
	 * @model opposite="rdfIriNode"
	 * @generated
	 */
	IriListParam getRdfIriNodeTypes();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.adaptionrdf.RdfIriNode#getRdfIriNodeTypes <em>Rdf Iri Node Types</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rdf Iri Node Types</em>' reference.
	 * @see #getRdfIriNodeTypes()
	 * @generated
	 */
	void setRdfIriNodeTypes(IriListParam value);
} // RdfIriNode
