/**
 */
package qualitypatternmodel.functions;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.Operator#getOperatorList <em>Operator List</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.functions.FunctionsPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends qualitypatternmodel.graphstructure.Comparable, PatternElement {

	/**
	 * Returns the value of the '<em><b>Operator List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.OperatorList#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator List</em>' container reference.
	 * @see #setOperatorList(OperatorList)
	 * @see qualitypatternmodel.functions.FunctionsPackage#getOperator_OperatorList()
	 * @see qualitypatternmodel.functions.OperatorList#getOperators
	 * @model opposite="operators" required="true" transient="false"
	 * @generated
	 */
	OperatorList getOperatorList();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.functions.Operator#getOperatorList <em>Operator List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator List</em>' container reference.
	 * @see #getOperatorList()
	 * @generated
	 */
	void setOperatorList(OperatorList value);

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
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<BooleanOperator> getRootBooleanOperators();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.functions.OperatorCycleExceptionWrapper" visitedOperatorsMany="true"
	 * @generated
	 */
	void isCycleFree(EList<Operator> visitedOperators) throws OperatorCycleException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.functions.OperatorCycleExceptionWrapper"
	 * @generated
	 */
	void isCycleFree() throws OperatorCycleException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<qualitypatternmodel.graphstructure.Comparable> getArguments();
} // Operator
