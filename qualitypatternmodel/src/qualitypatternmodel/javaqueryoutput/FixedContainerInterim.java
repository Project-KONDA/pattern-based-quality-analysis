/**
 */
package qualitypatternmodel.javaqueryoutput;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Container Interim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.FixedContainerInterim#getContained <em>Contained</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.FixedContainerInterim#getCanBeEmpty <em>Can Be Empty</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getFixedContainerInterim()
 * @model
 * @generated
 */
public interface FixedContainerInterim extends ContainerInterim {

	/**
	 * Returns the value of the '<em><b>Contained</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.javaqueryoutput.InterimResultPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained</em>' containment reference list.
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getFixedContainerInterim_Contained()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InterimResultPart> getContained();

	/**
	 * Returns the value of the '<em><b>Can Be Empty</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Be Empty</em>' attribute.
	 * @see #setCanBeEmpty(Boolean)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getFixedContainerInterim_CanBeEmpty()
	 * @model default="false"
	 * @generated
	 */
	Boolean getCanBeEmpty();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.FixedContainerInterim#getCanBeEmpty <em>Can Be Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Be Empty</em>' attribute.
	 * @see #getCanBeEmpty()
	 * @generated
	 */
	void setCanBeEmpty(Boolean value);
} // FixedContainerInterim
