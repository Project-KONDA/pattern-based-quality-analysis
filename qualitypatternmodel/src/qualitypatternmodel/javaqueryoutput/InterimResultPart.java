/**
 */
package qualitypatternmodel.javaqueryoutput;

import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interim Result Part</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#getInterimResultPart()
 * @model abstract="true"
 * @generated
 */
public interface InterimResultPart extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="qualitypatternmodel.textrepresentation.JSONObjectWrapper"
	 * @generated
	 */
	JSONObject toJson();

	abstract public Integer getInterimPartId();
} // InterimResultPart
