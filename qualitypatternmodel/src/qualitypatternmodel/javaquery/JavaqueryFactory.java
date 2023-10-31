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
	 * Returns a new object of class '<em>Boolean Filter Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Filter Part</em>'.
	 * @generated
	 */
	BooleanFilterPart createBooleanFilterPart();

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
	 * Returns a new object of class '<em>Every Combinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Every Combinator</em>'.
	 * @generated
	 */
	EveryCombinator createEveryCombinator();

	/**
	 * Returns a new object of class '<em>Any Combinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Combinator</em>'.
	 * @generated
	 */
	AnyCombinator createAnyCombinator();

	/**
	 * Returns a new object of class '<em>None Combinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>None Combinator</em>'.
	 * @generated
	 */
	NoneCombinator createNoneCombinator();

	/**
	 * Returns a new object of class '<em>Count Combinator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Combinator</em>'.
	 * @generated
	 */
	CountCombinator createCountCombinator();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JavaqueryPackage getJavaqueryPackage();

} //JavaqueryFactory
