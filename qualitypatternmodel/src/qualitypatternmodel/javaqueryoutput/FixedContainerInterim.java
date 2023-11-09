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
} // FixedContainerInterim