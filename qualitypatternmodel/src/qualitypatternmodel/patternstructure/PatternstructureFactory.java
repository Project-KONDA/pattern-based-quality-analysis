/**
 */
package qualitypatternmodel.patternstructure;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage
 * @generated
 */
public interface PatternstructureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternstructureFactory eINSTANCE = qualitypatternmodel.patternstructure.impl.PatternstructureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Relation Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Mapping</em>'.
	 * @generated
	 */
	RelationMapping createRelationMapping();

	/**
	 * Returns a new object of class '<em>Quantified Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantified Condition</em>'.
	 * @generated
	 */
	QuantifiedCondition createQuantifiedCondition();

	/**
	 * Returns a new object of class '<em>Morphism</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Morphism</em>'.
	 * @generated
	 */
	Morphism createMorphism();

	/**
	 * Returns a new object of class '<em>Element Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Mapping</em>'.
	 * @generated
	 */
	ElementMapping createElementMapping();

	/**
	 * Returns a new object of class '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formula</em>'.
	 * @generated
	 */
	Formula createFormula();

	/**
	 * Returns a new object of class '<em>True Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True Element</em>'.
	 * @generated
	 */
	TrueElement createTrueElement();

	/**
	 * Returns a new object of class '<em>Complete Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Complete Pattern</em>'.
	 * @generated
	 */
	CompletePattern createCompletePattern();

	/**
	 * Returns a new object of class '<em>Not Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Condition</em>'.
	 * @generated
	 */
	NotCondition createNotCondition();

	/**
	 * Returns a new object of class '<em>Count Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Condition</em>'.
	 * @generated
	 */
	CountCondition createCountCondition();

	/**
	 * Returns a new object of class '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count</em>'.
	 * @generated
	 */
	Count createCount();

	/**
	 * Returns a new object of class '<em>Count Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count Pattern</em>'.
	 * @generated
	 */
	CountPattern createCountPattern();

	/**
	 * Returns a new object of class '<em>Number Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Element</em>'.
	 * @generated
	 */
	NumberElement createNumberElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternstructurePackage getPatternstructurePackage();

} //PatternstructureFactory
