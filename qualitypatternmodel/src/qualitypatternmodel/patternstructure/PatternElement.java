/**
 */
package qualitypatternmodel.patternstructure;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import qualitypatternmodel.inputfields.Input;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPatternElement()
 * @model abstract="true"
 * @generated
 */
public interface PatternElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPatternElement_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.PatternElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidTranslationExceptionWrapper"
	 * @generated
	 */
	String toXQuery(Location location) throws InvalidTranslationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidTranslationExceptionWrapper"
	 * @generated
	 */
	void isValid(boolean isDefinedPattern, Location location) throws InvalidTranslationException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidTranslationExceptionWrapper"
	 * @generated
	 */
	EList<Input> getAllVariables() throws InvalidTranslationException;

} // PatternElement
