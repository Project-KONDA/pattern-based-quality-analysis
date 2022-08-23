/**
 */
package qualitypatternmodel.adaptionNeo4J;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage
 * @generated
 */
public interface AdaptionNeo4JFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptionNeo4JFactory eINSTANCE = qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Neo Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Node</em>'.
	 * @generated
	 */
	NeoNode createNeoNode();

	/**
	 * Returns a new object of class '<em>Neo Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Edge</em>'.
	 * @generated
	 */
	NeoEdge createNeoEdge();

	/**
	 * Returns a new object of class '<em>Neo Complex Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Complex Edge</em>'.
	 * @generated
	 */
	NeoComplexEdge createNeoComplexEdge();

	/**
	 * Returns a new object of class '<em>Neo Simple Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Simple Edge</em>'.
	 * @generated
	 */
	NeoSimpleEdge createNeoSimpleEdge();

	/**
	 * Returns a new object of class '<em>Neo Property Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Property Node</em>'.
	 * @generated
	 */
	NeoPropertyNode createNeoPropertyNode();

	/**
	 * Returns a new object of class '<em>Neo Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Path Param</em>'.
	 * @generated
	 */
	NeoPathParam createNeoPathParam();

	/**
	 * Returns a new object of class '<em>Neo Property Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Property Path Param</em>'.
	 * @generated
	 */
	NeoPropertyPathParam createNeoPropertyPathParam();

	/**
	 * Returns a new object of class '<em>Neo Property Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Property Edge</em>'.
	 * @generated
	 */
	NeoPropertyEdge createNeoPropertyEdge();

	/**
	 * Returns a new object of class '<em>Neo Unspecified Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Unspecified Edge</em>'.
	 * @generated
	 */
	NeoUnspecifiedEdge createNeoUnspecifiedEdge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptionNeo4JPackage getAdaptionNeo4JPackage();

} //AdaptionNeo4JFactory
