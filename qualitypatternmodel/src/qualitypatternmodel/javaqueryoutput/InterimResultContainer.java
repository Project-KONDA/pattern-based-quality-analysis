/**
 */
package qualitypatternmodel.javaqueryoutput;

import org.eclipse.emf.ecore.EObject;
import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interim Result Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.InterimResultContainer#getCorrespondsTo <em>Corresponds To</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.InterimResultContainer#getParameter <em>Parameter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.InterimResultContainer#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResultContainer()
 * @model
 * @generated
 */
public interface InterimResultContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Corresponds To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponds To</em>' reference.
	 * @see #setCorrespondsTo(InterimResultStructure)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResultContainer_CorrespondsTo()
	 * @model
	 * @generated
	 */
	InterimResultStructure getCorrespondsTo();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.InterimResultContainer#getCorrespondsTo <em>Corresponds To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponds To</em>' reference.
	 * @see #getCorrespondsTo()
	 * @generated
	 */
	void setCorrespondsTo(InterimResultStructure value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(InterimResult)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResultContainer_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	InterimResult getParameter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.InterimResultContainer#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(InterimResult value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(InterimResult)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResultContainer_Return()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterimResult getReturn();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.InterimResultContainer#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(InterimResult value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Boolean isValidToStructure();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	Boolean initialize(String value) throws InvalidityException;

} // InterimResultContainer
