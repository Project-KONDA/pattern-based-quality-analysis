/**
 */
package qualitypatternmodel.javaqueryoutput;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.ContainerResult#getSubresult <em>Subresult</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.ContainerResult#getTagname <em>Tagname</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getContainerResult()
 * @model
 * @generated
 */
public interface ContainerResult extends InterimResult {
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

	/**
	 * Returns the value of the '<em><b>Tagname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagname</em>' attribute.
	 * @see #setTagname(String)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getContainerResult_Tagname()
	 * @model
	 * @generated
	 */
	String getTagname();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.ContainerResult#getTagname <em>Tagname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tagname</em>' attribute.
	 * @see #getTagname()
	 * @generated
	 */
	void setTagname(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper" param1DataType="qualitypatternmodel.parameters.StringArray"
	 * @generated
	 */
	Boolean initialize(String[] param1) throws InvalidityException;

} // ContainerResult
