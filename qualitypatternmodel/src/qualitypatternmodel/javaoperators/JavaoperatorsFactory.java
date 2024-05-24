/**
 */
package qualitypatternmodel.javaoperators;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage
 * @generated
 */
public interface JavaoperatorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaoperatorsFactory eINSTANCE = qualitypatternmodel.javaoperators.impl.JavaoperatorsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Validate Link Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validate Link Operator</em>'.
	 * @generated
	 */
	ValidateLinkOperator createValidateLinkOperator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaoperatorsPackage getJavaoperatorsPackage();

} //JavaoperatorsFactory
