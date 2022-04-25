/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.parameters.ParameterValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * The representation of primitive data values contained in data units (represented by <code>Elements</code>).
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.PrimitiveNode#getMatch <em>Match</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getPrimitiveNode()
 * @model
 * @generated
 */
public interface PrimitiveNode extends Node {

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new <code>Comparison</code> that has <code>this</code> as an argument and
	 * is added to the <code>predicates</code> of <code>element</code>.
	 * 
	 * @return the new <code>Comparison</code> that has <code>this</code> as an argument
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Comparison addComparison();

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if <code>this</code> serves as an argument of a <code>Operator</code>.
	 * 
	 * @return <code>true</code> if <code>this</code> serves as an argument of a <code>Operator</code>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isOperatorArgument();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkComparisonConsistency(ParameterValue parameterValue) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkComparisonConsistency(Comparison comp) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<PrimitiveNode> getEquivalentProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkComparisonConsistency() throws InvalidityException;

	/**
	 * Returns the value of the '<em><b>Match</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Match}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Match#getPrimitiveNode <em>Primitive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getPrimitiveNode_Match()
	 * @see qualitypatternmodel.operators.Match#getPrimitiveNode
	 * @model opposite="primitiveNode"
	 * @generated
	 */
	EList<Match> getMatch();

} // Property
