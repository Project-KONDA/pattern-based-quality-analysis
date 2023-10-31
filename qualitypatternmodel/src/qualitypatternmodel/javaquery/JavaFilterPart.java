/**
 */
package qualitypatternmodel.javaquery;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.javaquery.JavaqueryPackage#getJavaFilterPart()
 * @model abstract="true"
 * @generated
 */
public interface JavaFilterPart extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	Boolean apply() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<JavaFilterPart> getArguments();
} // JavaFilterPart
