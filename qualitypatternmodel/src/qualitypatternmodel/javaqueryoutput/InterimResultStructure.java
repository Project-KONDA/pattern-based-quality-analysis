/**
 */
package qualitypatternmodel.javaqueryoutput;

import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interim Results Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.InterimResultStructure#getSubstructure <em>Substructure</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.InterimResultStructure#getRecord <em>Record</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResultStructure()
 * @model
 * @generated
 */
public interface InterimResultStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Substructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substructure</em>' containment reference.
	 * @see #setSubstructure(InterimResultPart)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResultStructure_Substructure()
	 * @model containment="true"
	 * @generated
	 */
	InterimResultPart getSubstructure();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.InterimResultStructure#getSubstructure <em>Substructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substructure</em>' containment reference.
	 * @see #getSubstructure()
	 * @generated
	 */
	void setSubstructure(InterimResultPart value);

	/**
	 * Returns the value of the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record</em>' containment reference.
	 * @see #setRecord(InterimResultPart)
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResultStructure_Record()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InterimResultPart getRecord();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.javaqueryoutput.InterimResultStructure#getRecord <em>Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record</em>' containment reference.
	 * @see #getRecord()
	 * @generated
	 */
	void setRecord(InterimResultPart value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="qualitypatternmodel.textrepresentation.JSONObjectWrapper"
	 * @generated
	 */
	JSONObject toJson();

} // InterimResultsStructure
