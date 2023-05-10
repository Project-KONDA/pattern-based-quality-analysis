/**
 */
package qualitypatternmodel.adaptionrdf;

import org.eclipse.emf.ecore.EObject;
import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rdf Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#getRdfNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RdfNode extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateRdfTypes() throws InvalidityException;
} // RdfNode
