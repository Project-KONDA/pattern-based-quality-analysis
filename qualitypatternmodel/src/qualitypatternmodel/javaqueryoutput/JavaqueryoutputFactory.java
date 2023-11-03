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
	 * Returns a new object of class '<em>Record Interim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Interim</em>'.
	 * @generated
	 */
	RecordInterim createRecordInterim();

	/**
	 * Returns a new object of class '<em>Boolean Value Interim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value Interim</em>'.
	 * @generated
	 */
	BooleanValueInterim createBooleanValueInterim();

	/**
	 * Returns a new object of class '<em>Container Interim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Interim</em>'.
	 * @generated
	 */
	ContainerInterim createContainerInterim();

	/**
	 * Returns a new object of class '<em>Value List Interim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value List Interim</em>'.
	 * @generated
	 */
	ValueListInterim createValueListInterim();

	/**
	 * Returns a new object of class '<em>Number Value Interim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Value Interim</em>'.
	 * @generated
	 */
	NumberValueInterim createNumberValueInterim();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaqueryoutputPackage getJavaqueryoutputPackage();

} //JavaqueryoutputFactory
