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
	 * Returns a new object of class '<em>Rdf Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdf Path Param</em>'.
	 * @generated
	 */
	RdfPathParam createRdfPathParam();

	/**
	 * Returns a new object of class '<em>Rdf Axis Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rdf Axis Pair</em>'.
	 * @generated
	 */
	RdfAxisPair createRdfAxisPair();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptionrdfPackage getAdaptionrdfPackage();

} //AdaptionrdfFactory
