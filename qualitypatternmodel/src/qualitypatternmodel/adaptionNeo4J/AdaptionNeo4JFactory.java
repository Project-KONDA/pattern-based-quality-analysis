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
	 * Returns a new object of class '<em>Neo Attribute Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Attribute Node</em>'.
	 * @generated
	 */
	NeoAttributeNode createNeoAttributeNode();

	/**
	 * Returns a new object of class '<em>Neo Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Path Param</em>'.
	 * @generated
	 */
	NeoPathParam createNeoPathParam();

	/**
	 * Returns a new object of class '<em>Neo Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Label</em>'.
	 * @generated
	 */
	NeoLabel createNeoLabel();

	/**
	 * Returns a new object of class '<em>Neo Attribute Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Attribute Path Param</em>'.
	 * @generated
	 */
	NeoAttributePathParam createNeoAttributePathParam();

	/**
	 * Returns a new object of class '<em>Neo Attribute Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Attribute Edge</em>'.
	 * @generated
	 */
	NeoAttributeEdge createNeoAttributeEdge();

	/**
	 * Returns a new object of class '<em>Neo In Edge Targed Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo In Edge Targed Node</em>'.
	 * @generated
	 */
	NeoInEdgeTargedNode createNeoInEdgeTargedNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptionNeo4JPackage getAdaptionNeo4JPackage();

} //AdaptionNeo4JFactory
