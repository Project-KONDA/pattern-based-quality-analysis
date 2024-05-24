/**
 */
package qualitypatternmodel.javaqueryoutput;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interim Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.InterimResult#getCorrespondsTo <em>Corresponds To</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResult()
 * @model abstract="true"
 * @generated
 */
public interface InterimResult extends EObject {

	/**
	 * Returns the value of the '<em><b>Corresponds To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponds To</em>' reference.
	 * @see #setCorrespondsTo(InterimResultPart)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResult_CorrespondsTo()
	 * @model
	 * @generated
	 */
	InterimResultPart getCorrespondsTo();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.InterimResult#getCorrespondsTo <em>Corresponds To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponds To</em>' reference.
	 * @see #getCorrespondsTo()
	 * @generated
	 */
	void setCorrespondsTo(InterimResultPart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void setCorresponding(InterimResultPart corresponding) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Boolean isValidToCorresponding();
} // InterimResult
