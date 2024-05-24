/**
 */
package qualitypatternmodel.graphstructure;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaoperators.OneArgJavaOperator;
import qualitypatternmodel.javaoperators.TwoArgJavaOperator;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.NullCheck;
import qualitypatternmodel.operators.StringLength;
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
 *   <li>{@link qualitypatternmodel.graphstructure.PrimitiveNode#getContains <em>Contains</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.PrimitiveNode#getNullCheck <em>Null Check</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.PrimitiveNode#getStringLength <em>String Length</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.PrimitiveNode#getOneArgJavaOperator <em>One Arg Java Operator</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.PrimitiveNode#getTwoArgJavaOperator1 <em>Two Arg Java Operator1</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.PrimitiveNode#getTwoArgJavaOperator2 <em>Two Arg Java Operator2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getPrimitiveNode()
 * @model
 * @generated
 */
public interface PrimitiveNode extends Node {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkComparisonConsistency(ParameterValue parameterValue) throws InvalidityException;

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

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Contains}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Contains#getPrimitiveNode <em>Primitive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getPrimitiveNode_Contains()
	 * @see qualitypatternmodel.operators.Contains#getPrimitiveNode
	 * @model opposite="primitiveNode"
	 * @generated
	 */
	EList<Contains> getContains();

	/**
	 * Returns the value of the '<em><b>Null Check</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.NullCheck#getPrimitiveNode <em>Primitive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Check</em>' reference.
	 * @see #setNullCheck(NullCheck)
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getPrimitiveNode_NullCheck()
	 * @see qualitypatternmodel.operators.NullCheck#getPrimitiveNode
	 * @model opposite="primitiveNode"
	 * @generated
	 */
	NullCheck getNullCheck();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getNullCheck <em>Null Check</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Check</em>' reference.
	 * @see #getNullCheck()
	 * @generated
	 */
	void setNullCheck(NullCheck value);

	/**
	 * Returns the value of the '<em><b>String Length</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.StringLength}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.StringLength#getPrimitiveNode <em>Primitive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Length</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getPrimitiveNode_StringLength()
	 * @see qualitypatternmodel.operators.StringLength#getPrimitiveNode
	 * @model opposite="primitiveNode"
	 * @generated
	 */
	EList<StringLength> getStringLength();

	/**
	 * Returns the value of the '<em><b>One Arg Java Operator</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.javaoperators.OneArgJavaOperator}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.javaoperators.OneArgJavaOperator#getPrimitiveNode <em>Primitive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>One Arg Java Operator</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getPrimitiveNode_OneArgJavaOperator()
	 * @see qualitypatternmodel.javaoperators.OneArgJavaOperator#getPrimitiveNode
	 * @model opposite="primitiveNode"
	 * @generated
	 */
	EList<OneArgJavaOperator> getOneArgJavaOperator();

	/**
	 * Returns the value of the '<em><b>Two Arg Java Operator1</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.javaoperators.TwoArgJavaOperator}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.javaoperators.TwoArgJavaOperator#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Two Arg Java Operator1</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getPrimitiveNode_TwoArgJavaOperator1()
	 * @see qualitypatternmodel.javaoperators.TwoArgJavaOperator#getArgument1
	 * @model opposite="argument1"
	 * @generated
	 */
	EList<TwoArgJavaOperator> getTwoArgJavaOperator1();

	/**
	 * Returns the value of the '<em><b>Two Arg Java Operator2</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.javaoperators.TwoArgJavaOperator}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.javaoperators.TwoArgJavaOperator#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Two Arg Java Operator2</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getPrimitiveNode_TwoArgJavaOperator2()
	 * @see qualitypatternmodel.javaoperators.TwoArgJavaOperator#getArgument2
	 * @model opposite="argument2"
	 * @generated
	 */
	EList<TwoArgJavaOperator> getTwoArgJavaOperator2();

} // Property
