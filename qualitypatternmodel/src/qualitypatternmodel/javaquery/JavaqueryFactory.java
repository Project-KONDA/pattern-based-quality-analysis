/**
 */
package qualitypatternmodel.javaquery;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.javaquery.JavaqueryPackage
 * @generated
 */
public interface JavaqueryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaqueryFactory eINSTANCE = qualitypatternmodel.javaquery.impl.JavaqueryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Java Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Filter</em>'.
	 * @generated
	 */
	JavaFilter createJavaFilter();

	/**
	 * Returns a new object of class '<em>Formula Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formula Filter Part</em>'.
	 * @generated
	 */
	FormulaFilterPart createFormulaFilterPart();

	/**
	 * Returns a new object of class '<em>Boolean Filter Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Filter Element</em>'.
	 * @generated
	 */
	BooleanFilterElement createBooleanFilterElement();

	/**
	 * Returns a new object of class '<em>One Arg Function Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>One Arg Function Filter Part</em>'.
	 * @generated
	 */
	OneArgFunctionFilterPart createOneArgFunctionFilterPart();

	/**
	 * Returns a new object of class '<em>List Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Filter Part</em>'.
	 * @generated
	 */
	ListFilterPart createListFilterPart();

	/**
	 * Returns a new object of class '<em>Two Arg Function Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Two Arg Function Filter Part</em>'.
	 * @generated
	 */
	TwoArgFunctionFilterPart createTwoArgFunctionFilterPart();

	/**
	 * Returns a new object of class '<em>Not Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Filter Part</em>'.
	 * @generated
	 */
	NotFilterPart createNotFilterPart();

	/**
	 * Returns a new object of class '<em>Count Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Filter Part</em>'.
	 * @generated
	 */
	CountFilterPart createCountFilterPart();

	/**
	 * Returns a new object of class '<em>Count Filter Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Filter Element</em>'.
	 * @generated
	 */
	CountFilterElement createCountFilterElement();

	/**
	 * Returns a new object of class '<em>Number Filter Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Filter Element</em>'.
	 * @generated
	 */
	NumberFilterElement createNumberFilterElement();

	/**
	 * Returns a new object of class '<em>Number Value Filter Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Value Filter Element</em>'.
	 * @generated
	 */
	NumberValueFilterElement createNumberValueFilterElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaqueryPackage getJavaqueryPackage();

} //JavaqueryFactory
