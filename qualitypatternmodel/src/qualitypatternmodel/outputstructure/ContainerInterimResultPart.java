/**
 */
package qualitypatternmodel.outputstructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Interim Result Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.outputstructure.ContainerInterimResultPart#getContained <em>Contained</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.outputstructure.OutputstructurePackage#getContainerInterimResultPart()
 * @model
 * @generated
 */
public interface ContainerInterimResultPart extends InterimResultParam {
	/**
	 * Returns the value of the '<em><b>Contained</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.outputstructure.InterimResultParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained</em>' containment reference list.
	 * @see qualitypatternmodel.outputstructure.OutputstructurePackage#getContainerInterimResultPart_Contained()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InterimResultParam> getContained();

} // ContainerInterimResultPart
