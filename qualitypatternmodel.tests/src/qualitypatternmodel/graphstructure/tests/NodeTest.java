/**
 */
package qualitypatternmodel.graphstructure.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.Node;

import qualitypatternmodel.patternstructure.tests.PatternElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getOriginalID() <em>Get Original ID</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addPrimitiveMatch(java.lang.String) <em>Add Primitive Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(java.lang.String) <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addPrimitiveMatch() <em>Add Primitive Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison() <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getAllOperators() <em>Get All Operators</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.operators.ComparisonOperator, qualitypatternmodel.parameters.ParameterValue) <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.parameters.ParameterValue) <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#setGraphSimple(qualitypatternmodel.graphstructure.Graph) <em>Set Graph Simple</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#checkComparisonConsistency(qualitypatternmodel.operators.Comparison) <em>Check Comparison Consistency</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getEquivalentNodes() <em>Get Equivalent Nodes</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#makePrimitive() <em>Make Primitive</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#makeComplex() <em>Make Complex</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addTargetNode() <em>Add Target Node</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addOutgoing(qualitypatternmodel.graphstructure.Node) <em>Add Outgoing</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#getOriginalNode() <em>Get Original Node</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#makeComplexRecursive() <em>Make Complex Recursive</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#makePrimitiveRecursive() <em>Make Primitive Recursive</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#makeGeneric() <em>Make Generic</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#makeGenericRecursive() <em>Make Generic Recursive</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#checkGeneric() <em>Check Generic</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#checkPrimitive() <em>Check Primitive</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#checkComplex() <em>Check Complex</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Node#addIncomming(qualitypatternmodel.graphstructure.Node) <em>Add Incomming</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Adaptable#removeParametersFromParameterList() <em>Remove Parameters From Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Adaptable#createParameters() <em>Create Parameters</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#getReturnType() <em>Get Return Type</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#isTranslatable() <em>Is Translatable</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#getAllArgumentElements() <em>Get All Argument Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#isOperatorArgument() <em>Is Operator Argument</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class NodeTest extends PatternElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NodeTest.class);
	}

	/**
	 * Constructs a new Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Node getFixture() {
		return (Node)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphstructureFactory.eINSTANCE.createNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#getOriginalID() <em>Get Original ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#getOriginalID()
	 * @generated
	 */
	public void testGetOriginalID() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveMatch(java.lang.String) <em>Add Primitive Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveMatch(java.lang.String)
	 * @generated
	 */
	public void testAddPrimitiveMatch__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(java.lang.String) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(java.lang.String)
	 * @generated
	 */
	public void testAddPrimitiveComparison__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveMatch() <em>Add Primitive Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveMatch()
	 * @generated
	 */
	public void testAddPrimitiveMatch() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison() <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveComparison()
	 * @generated
	 */
	public void testAddPrimitiveComparison() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#getAllOperators() <em>Get All Operators</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#getAllOperators()
	 * @generated
	 */
	public void testGetAllOperators() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.operators.ComparisonOperator, qualitypatternmodel.parameters.ParameterValue) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.operators.ComparisonOperator, qualitypatternmodel.parameters.ParameterValue)
	 * @generated
	 */
	public void testAddPrimitiveComparison__ComparisonOperator_ParameterValue() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.parameters.ParameterValue) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addPrimitiveComparison(qualitypatternmodel.parameters.ParameterValue)
	 * @generated
	 */
	public void testAddPrimitiveComparison__ParameterValue() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#setGraphSimple(qualitypatternmodel.graphstructure.Graph) <em>Set Graph Simple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#setGraphSimple(qualitypatternmodel.graphstructure.Graph)
	 * @generated
	 */
	public void testSetGraphSimple__Graph() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#checkComparisonConsistency(qualitypatternmodel.operators.Comparison) <em>Check Comparison Consistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#checkComparisonConsistency(qualitypatternmodel.operators.Comparison)
	 * @generated
	 */
	public void testCheckComparisonConsistency__Comparison() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#getEquivalentNodes() <em>Get Equivalent Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#getEquivalentNodes()
	 * @generated
	 */
	public void testGetEquivalentNodes() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#makePrimitive() <em>Make Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#makePrimitive()
	 * @generated
	 */
	public void testMakePrimitive() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#makeComplex() <em>Make Complex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#makeComplex()
	 * @generated
	 */
	public void testMakeComplex() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addTargetNode() <em>Add Target Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addTargetNode()
	 * @generated
	 */
	public void testAddTargetNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addOutgoing(qualitypatternmodel.graphstructure.Node) <em>Add Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addOutgoing(qualitypatternmodel.graphstructure.Node)
	 * @generated
	 */
	public void testAddOutgoing__Node() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#getOriginalNode() <em>Get Original Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#getOriginalNode()
	 * @generated
	 */
	public void testGetOriginalNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#makeComplexRecursive() <em>Make Complex Recursive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#makeComplexRecursive()
	 * @generated
	 */
	public void testMakeComplexRecursive() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#makePrimitiveRecursive() <em>Make Primitive Recursive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#makePrimitiveRecursive()
	 * @generated
	 */
	public void testMakePrimitiveRecursive() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#makeGeneric() <em>Make Generic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#makeGeneric()
	 * @generated
	 */
	public void testMakeGeneric() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#makeGenericRecursive() <em>Make Generic Recursive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#makeGenericRecursive()
	 * @generated
	 */
	public void testMakeGenericRecursive() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#checkGeneric() <em>Check Generic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#checkGeneric()
	 * @generated
	 */
	public void testCheckGeneric() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#checkPrimitive() <em>Check Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#checkPrimitive()
	 * @generated
	 */
	public void testCheckPrimitive() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#checkComplex() <em>Check Complex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#checkComplex()
	 * @generated
	 */
	public void testCheckComplex() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Node#addIncomming(qualitypatternmodel.graphstructure.Node) <em>Add Incomming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Node#addIncomming(qualitypatternmodel.graphstructure.Node)
	 * @generated
	 */
	public void testAddIncomming__Node() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Adaptable#removeParametersFromParameterList() <em>Remove Parameters From Parameter List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Adaptable#removeParametersFromParameterList()
	 * @generated
	 */
	public void testRemoveParametersFromParameterList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Adaptable#createParameters() <em>Create Parameters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Adaptable#createParameters()
	 * @generated
	 */
	public void testCreateParameters() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Comparable#getReturnType() <em>Get Return Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Comparable#getReturnType()
	 * @generated
	 */
	public void testGetReturnType() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Comparable#isTranslatable() <em>Is Translatable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Comparable#isTranslatable()
	 * @generated
	 */
	public void testIsTranslatable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Comparable#getAllArgumentElements() <em>Get All Argument Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Comparable#getAllArgumentElements()
	 * @generated
	 */
	public void testGetAllArgumentElements() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Comparable#isOperatorArgument() <em>Is Operator Argument</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Comparable#isOperatorArgument()
	 * @generated
	 */
	public void testIsOperatorArgument() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //NodeTest
