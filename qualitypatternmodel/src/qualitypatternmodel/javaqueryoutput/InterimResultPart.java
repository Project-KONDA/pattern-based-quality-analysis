/**
 */
package qualitypatternmodel.javaqueryoutput;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.eclipse.emf.ecore.EObject;

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
	ObjectNode toJson();

	abstract public Integer getInterimPartId();
} // InterimResultPart
