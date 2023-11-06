/**
 */
package qualitypatternmodel.javaqueryoutput;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Container Interim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.VariableContainerInterim#getContained <em>Contained</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getVariableContainerInterim()
 * @model
 * @generated
 */
public interface VariableContainerInterim extends ContainerInterim {

	/**
	 * Returns the value of the '<em><b>Contained</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained</em>' reference.
	 * @see #setContained(InterimResultPart)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getVariableContainerInterim_Contained()
	 * @model required="true"
	 * @generated
	 */
	InterimResultPart getContained();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.VariableContainerInterim#getContained <em>Contained</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained</em>' reference.
	 * @see #getContained()
	 * @generated
	 */
	void setContained(InterimResultPart value);
} // VariableContainerInterim
