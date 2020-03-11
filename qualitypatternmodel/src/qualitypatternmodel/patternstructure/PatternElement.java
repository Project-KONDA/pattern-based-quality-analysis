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
 * Abstract Class, which implements all basic methods needed by all classes, which are part of the structure of the Pattern.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#getId <em>Id</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#getInternalId <em>Internal Id</em>}</li>
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
	 * Returns the value of the '<em><b>Internal Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Id</em>' attribute.
	 * @see #setInternalId(int)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPatternElement_InternalId()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getInternalId();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.PatternElement#getInternalId <em>Internal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Id</em>' attribute.
	 * @see #getInternalId()
	 * @generated
	 */
	void setInternalId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * Translates the structure of the model instance into an XQuery expression
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String toXQuery(Location location) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * iterates over all contained elements and returns all contained model elements, that extend the Input class 
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<Input> getAllInputs() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Initialization of the translation to XQuery of the model instance 
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void prepareTranslation();

	/**
	 * <!-- begin-user-doc -->
	 * calls isValid to check model constraints for current element
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String myToString();

	/**
	 * <!-- begin-user-doc -->
	 * get element, which directly contain the current element
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	PatternElement getContainer() throws MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * call isValidLocal and isValid of all contained elements
	 * @param isDefinedPattern true, if all input elements shall have assigned a concrete value
	 * @throws InvalidityException when the current or one contained model element is invalid
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.functions.OperatorCycleExceptionWrapper" isDefinedPatternRequired="true"
	 * @generated
	 */
	void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * check validity of the variables of the current model element. Does not check contained elements 
	 * @param isDefinedPattern true, if the current element extends Input and shall have assigned a concrete value
	 * if the current element does not extend Input, the parameter does not have an impact
	 * @throws InvalidityException when the current model element is invalid
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.functions.OperatorCycleExceptionWrapper" isDefinedPatternRequired="true"
	 * @generated
	 */
	void isValidLocal(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;
	
	/**
	 * <!-- begin-user-doc -->
	 * Iterates up through the model instance hierarchy and returns the first element of the desired class.  
	 * @param type of expected element to return
	 * @return Model Element of type cls
	 * @throws MissingPatternContainerException if no element of the expected type is in the model hierarchy above the current element 
	 * or one container element does not extend the type PatternElement. 
	 * <!-- end-user-doc -->
	 */
	PatternElement getAncestor(Class<?> cls) throws MissingPatternContainerException;

} // PatternElement
