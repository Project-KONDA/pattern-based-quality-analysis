/**
 */
package qualitypatternmodel.javaqueryoutput;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage
 * @generated
 */
public interface JavaqueryoutputFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaqueryoutputFactory eINSTANCE = qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interim Result Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interim Result Structure</em>'.
	 * @generated
	 */
	InterimResultStructure createInterimResultStructure();

	/**
	 * Returns a new object of class '<em>Value Interim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Interim</em>'.
	 * @generated
	 */
	ValueInterim createValueInterim();

	/**
	 * Returns a new object of class '<em>Variable Container Interim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Container Interim</em>'.
	 * @generated
	 */
	VariableContainerInterim createVariableContainerInterim();

	/**
	 * Returns a new object of class '<em>Fixed Container Interim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Container Interim</em>'.
	 * @generated
	 */
	FixedContainerInterim createFixedContainerInterim();

	/**
	 * Returns a new object of class '<em>Container Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Result</em>'.
	 * @generated
	 */
	ContainerResult createContainerResult();

	/**
	 * Returns a new object of class '<em>Value Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Result</em>'.
	 * @generated
	 */
	ValueResult createValueResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaqueryoutputPackage getJavaqueryoutputPackage();

} //JavaqueryoutputFactory
