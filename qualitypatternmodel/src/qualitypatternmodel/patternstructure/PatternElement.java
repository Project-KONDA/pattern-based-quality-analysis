/**
 */
package qualitypatternmodel.patternstructure;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
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
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#getShortPatternInternalId <em>Short Pattern Internal Id</em>}</li>
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
	 * @see #setId(String)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPatternElement_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.PatternElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Short Pattern Internal Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Pattern Internal Id</em>' attribute.
	 * @see #setShortPatternInternalId(int)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPatternElement_ShortPatternInternalId()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getShortPatternInternalId();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.PatternElement#getShortPatternInternalId <em>Short Pattern Internal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Pattern Internal Id</em>' attribute.
	 * @see #getShortPatternInternalId()
	 * @generated
	 */
	void setShortPatternInternalId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String toXQuery(Location location) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<Input> getAllInputs() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void prepareTranslation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	PatternElement getContainer() throws MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.functions.OperatorCycleExceptionWrapper" isDefinedPatternRequired="true"
	 * @generated
	 */
	void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.functions.OperatorCycleExceptionWrapper" isDefinedPatternRequired="true"
	 * @generated
	 */
	void isValidLocal(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	PatternElement getAncestor(Class<?> cls) throws MissingPatternContainerException;

} // PatternElement
