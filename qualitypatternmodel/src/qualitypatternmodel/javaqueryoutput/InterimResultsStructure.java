/**
 */
package qualitypatternmodel.javaqueryoutput;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interim Results Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.InterimResultsStructure#getSubstructure <em>Substructure</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.InterimResultsStructure#getRecord <em>Record</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResultsStructure()
 * @model
 * @generated
 */
public interface InterimResultsStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Substructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substructure</em>' containment reference.
	 * @see #setSubstructure(InterimResultParam)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResultsStructure_Substructure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterimResultParam getSubstructure();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.InterimResultsStructure#getSubstructure <em>Substructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substructure</em>' containment reference.
	 * @see #getSubstructure()
	 * @generated
	 */
	void setSubstructure(InterimResultParam value);

	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference.
	 * @see #setRecord(RecordInterimResult)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResultsStructure_Record()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RecordInterimResult getRecord();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.InterimResultsStructure#getRecord <em>Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record</em>' containment reference.
	 * @see #getRecord()
	 * @generated
	 */
	void setRecord(RecordInterimResult value);

} // InterimResultsStructure
