/**
 */
package QualityPatternModel;

import QualityPatternModel.impl.InvalidTranslationException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see QualityPatternModel.QualityPatternModelPackage#getPatternElement()
 * @model abstract="true"
 * @generated
 */
public interface PatternElement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isValid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="QualityPatternModel.InvalidTranslationExceptionWrapper"
	 * @generated
	 */
	String toXQuery(TranslationLocation translationLocation) throws InvalidTranslationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toLocalXQuery(TranslationLocation tranlsationLocation);

} // PatternElement
