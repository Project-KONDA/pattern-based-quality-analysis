/**
 */
package qualitypatternmodel.adaptionneo4j;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage
 * @generated
 */
public interface Adaptionneo4jFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Adaptionneo4jFactory eINSTANCE = qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Neo Element Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Element Node</em>'.
	 * @generated
	 */
	NeoElementNode createNeoElementNode();

	/**
	 * Returns a new object of class '<em>Neo Element Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Element Edge</em>'.
	 * @generated
	 */
	NeoElementEdge createNeoElementEdge();

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
	 * Returns a new object of class '<em>Neo Element Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Neo Element Path Param</em>'.
	 * @generated
	 */
	NeoElementPathParam createNeoElementPathParam();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Adaptionneo4jPackage getAdaptionneo4jPackage();

} //Adaptionneo4jFactory
