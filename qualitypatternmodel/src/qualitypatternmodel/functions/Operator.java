/**
 */
package qualitypatternmodel.functions;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.graphstructure.GraphElement;
import qualitypatternmodel.patternstructure.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.functions.FunctionsPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends GraphElement {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<Operator> getAllOperators() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain chain, Map context);
} // Operator
