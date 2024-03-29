/**
 */
package qualitypatternmodel.adaptionrdf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage
 * @generated
 */
public interface AdaptionrdfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptionrdfFactory eINSTANCE = qualitypatternmodel.adaptionrdf.impl.AdaptionrdfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rdf Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdf Predicate</em>'.
	 * @generated
	 */
	RdfPredicate createRdfPredicate();

	/**
	 * Returns a new object of class '<em>Rdf Iri Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdf Iri Node</em>'.
	 * @generated
	 */
	RdfIriNode createRdfIriNode();

	/**
	 * Returns a new object of class '<em>Rdf Single Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdf Single Predicate</em>'.
	 * @generated
	 */
	RdfSinglePredicate createRdfSinglePredicate();

	/**
	 * Returns a new object of class '<em>Rdf Literal Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdf Literal Node</em>'.
	 * @generated
	 */
	RdfLiteralNode createRdfLiteralNode();

	/**
	 * Returns a new object of class '<em>Iri Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iri Param</em>'.
	 * @generated
	 */
	IriParam createIriParam();

	/**
	 * Returns a new object of class '<em>Rdf Xor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdf Xor</em>'.
	 * @generated
	 */
	RdfXor createRdfXor();

	/**
	 * Returns a new object of class '<em>Rdf Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdf Sequence</em>'.
	 * @generated
	 */
	RdfSequence createRdfSequence();

	/**
	 * Returns a new object of class '<em>Iri List Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iri List Param</em>'.
	 * @generated
	 */
	IriListParam createIriListParam();

	/**
	 * Returns a new object of class '<em>Rdf Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdf Path Param</em>'.
	 * @generated
	 */
	RdfPathParam createRdfPathParam();

	/**
	 * Returns a new object of class '<em>Rdf Path Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdf Path Part</em>'.
	 * @generated
	 */
	RdfPathPart createRdfPathPart();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptionrdfPackage getAdaptionrdfPackage();

} //AdaptionrdfFactory
