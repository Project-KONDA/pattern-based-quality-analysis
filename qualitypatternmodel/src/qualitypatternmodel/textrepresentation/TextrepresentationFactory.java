/**
 */
package qualitypatternmodel.textrepresentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage
 * @generated
 */
public interface TextrepresentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TextrepresentationFactory eINSTANCE = qualitypatternmodel.textrepresentation.impl.TextrepresentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pattern Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern Text</em>'.
	 * @generated
	 */
	PatternText createPatternText();

	/**
	 * Returns a new object of class '<em>Parameter Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Fragment</em>'.
	 * @generated
	 */
	ParameterFragment createParameterFragment();

	/**
	 * Returns a new object of class '<em>Text Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Fragment</em>'.
	 * @generated
	 */
	TextFragment createTextFragment();

	/**
	 * Returns a new object of class '<em>Parameter Predefinition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Predefinition</em>'.
	 * @generated
	 */
	ParameterPredefinition createParameterPredefinition();

	/**
	 * Returns a new object of class '<em>Value Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Map</em>'.
	 * @generated
	 */
	ValueMap createValueMap();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TextrepresentationPackage getTextrepresentationPackage();

} //TextrepresentationFactory
