/**
 */
package qualitypatternmodel.operators;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * A function on <code>PatternElement</code>s that produces a return value.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.Operator#getOperatorList <em>Operator List</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.operators.OperatorsPackage#getOperator()
 * @model abstract="true"
 * @generated
 */
public interface Operator extends qualitypatternmodel.graphstructure.Comparable, PatternElement {

	/**
	 * Returns the value of the '<em><b>Operator List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.OperatorList#getOperators <em>Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * Gets the container.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator List</em>' container reference.
	 * @see #setOperatorList(OperatorList)
	 * @see qualitypatternmodel.operators.OperatorsPackage#getOperator_OperatorList()
	 * @see qualitypatternmodel.operators.OperatorList#getOperators
	 * @model opposite="operators" required="true" transient="false"
	 * @generated
	 */
	OperatorList getOperatorList();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.operators.Operator#getOperatorList <em>Operator List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator List</em>' container reference.
	 * @see #getOperatorList()
	 * @generated
	 */
	void setOperatorList(OperatorList value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list containing <code>this</code>.
	 * 
	 * @return a list containing <code>this</code>.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Operator> getAllOperators();

	/**
	 * <!-- begin-user-doc -->
	 * Returns true if <code>this</code> is valid.
	 * 
	 * @return true if <code>this</code> is valid
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * In case <code>this</code> is included in nesting(s) of <code>Operators</code>
	 * returns a list of <code>BooleanOperators</code> that are the roots of
	 * these nestings, else returns a list containing only <code>this</code>
	 * 
	 * @return
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<BooleanOperator> getRootBooleanOperators();

	/**
	 * <!-- begin-user-doc -->
	 * Recursively checks if <code>this</code> or descendants of <code>this</code> in the hierarchy of nested <code>Operators</code>
	 * are contained in <code>visitedOperators</code>.
	 * 
	 * @throws OperatorCycleException if <code>this</code> or descendants of <code>this</code> in the hierarchy of nested <code>Operators</code>
	 * are contained in <code>visitedOperators</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.operators.OperatorCycleExceptionWrapper" visitedOperatorsMany="true"
	 * @generated
	 */
	void isCycleFree(EList<Operator> visitedOperators) throws OperatorCycleException;

	/**
	 * <!-- begin-user-doc -->
	 * Checks if descendants of <code>this</code> in the hierarchy of nested <code>Operators</code>
	 * directly or indirectly have themselves as arguments.
	 * 
	 * @throws OperatorCycleException if descendants of <code>this</code> in the hierarchy of nested <code>Operators</code>
	 * directly or indirectly have themselves as arguments
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.operators.OperatorCycleExceptionWrapper"
	 * @generated
	 */
	void isCycleFree() throws OperatorCycleException;

	/**
	 * <!-- begin-user-doc -->
	 * A list of arguments of <code>this</code>.
	 * 
	 * @return a list of arguments of <code>this</code>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<qualitypatternmodel.graphstructure.Comparable> getArguments();
} // Operator
