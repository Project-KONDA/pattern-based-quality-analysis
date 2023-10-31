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
	 * Returns a new object of class '<em>Interim Results Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interim Results Structure</em>'.
	 * @generated
	 */
	InterimResultsStructure createInterimResultsStructure();

	/**
	 * Returns a new object of class '<em>Record Interim Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Interim Result</em>'.
	 * @generated
	 */
	RecordInterimResult createRecordInterimResult();

	/**
	 * Returns a new object of class '<em>Boolean Interim Result Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Interim Result Param</em>'.
	 * @generated
	 */
	BooleanInterimResultParam createBooleanInterimResultParam();

	/**
	 * Returns a new object of class '<em>Container Interim Result Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Interim Result Part</em>'.
	 * @generated
	 */
	ContainerInterimResultPart createContainerInterimResultPart();

	/**
	 * Returns a new object of class '<em>Value List Interim Result Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value List Interim Result Part</em>'.
	 * @generated
	 */
	ValueListInterimResultPart createValueListInterimResultPart();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaqueryoutputPackage getJavaqueryoutputPackage();

} //JavaqueryoutputFactory
