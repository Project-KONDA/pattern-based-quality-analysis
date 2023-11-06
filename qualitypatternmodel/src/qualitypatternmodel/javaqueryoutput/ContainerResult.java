/**
 */
package qualitypatternmodel.javaqueryoutput;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.ContainerResult#getCorrespondsTo <em>Corresponds To</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.ContainerResult#getSubresult <em>Subresult</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getContainerResult()
 * @model
 * @generated
 */
public interface ContainerResult extends InterimResult {
	/**
	 * Returns the value of the '<em><b>Corresponds To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corresponds To</em>' reference.
	 * @see #setCorrespondsTo(ContainerInterim)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getContainerResult_CorrespondsTo()
	 * @model
	 * @generated
	 */
	ContainerInterim getCorrespondsTo();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.ContainerResult#getCorrespondsTo <em>Corresponds To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corresponds To</em>' reference.
	 * @see #getCorrespondsTo()
	 * @generated
	 */
	void setCorrespondsTo(ContainerInterim value);

	/**
	 * Returns the value of the '<em><b>Subresult</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.javaqueryoutput.InterimResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subresult</em>' containment reference list.
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getContainerResult_Subresult()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterimResult> getSubresult();

} // ContainerResult
