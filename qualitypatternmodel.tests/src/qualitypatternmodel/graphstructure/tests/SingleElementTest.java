/**
 */
package qualitypatternmodel.graphstructure.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.patternstructure.tests.PatternElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#copyNextElementsToNextGraphs() <em>Copy Next Elements To Next Graphs</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#copyNextElementToNextGraphs(qualitypatternmodel.graphstructure.SingleElement) <em>Copy Next Element To Next Graphs</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#removeElementFromPreviousGraphs() <em>Remove Element From Previous Graphs</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#copyNextElementToPreviousGraphs(qualitypatternmodel.graphstructure.SingleElement, boolean) <em>Copy Next Element To Previous Graphs</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#copyNextElementsToPreviousGraphs(boolean) <em>Copy Next Elements To Previous Graphs</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#toXQueryNoCount(qualitypatternmodel.patternstructure.Location) <em>To XQuery No Count</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#isRootElement() <em>Is Root Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#removeMappingsToNext() <em>Remove Mappings To Next</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#removeFromReturnElements() <em>Remove From Return Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#clearMatchRecursively() <em>Clear Match Recursively</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getAllRelations() <em>Get All Relations</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#translatePredicatesViaAnd(qualitypatternmodel.patternstructure.Location) <em>Translate Predicates Via And</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#clearPredicatesRecursively() <em>Clear Predicates Recursively</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#translatePredicatesViaBrackets(qualitypatternmodel.patternstructure.Location) <em>Translate Predicates Via Brackets</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getAllElements() <em>Get All Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getOriginalID() <em>Get Original ID</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getXQueryRepresentation(qualitypatternmodel.patternstructure.Location) <em>Get XQuery Representation</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#addPrimitiveMatch(java.lang.String) <em>Add Primitive Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#addPrimitiveComparison(java.lang.String) <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getXQueryVariable() <em>Get XQuery Variable</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#addPrimitiveMatch() <em>Add Primitive Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#addPrimitiveComparison() <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getGraphDepth() <em>Get Graph Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#translatePathFromPrevious() <em>Translate Path From Previous</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#getAllOperators() <em>Get All Operators</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#addPrimitiveComparison(qualitypatternmodel.graphstructure.PropertyLocation, java.lang.String, qualitypatternmodel.functions.ComparisonOperator, qualitypatternmodel.parameters.Parameter) <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#addPrimitiveComparison(qualitypatternmodel.parameters.Parameter) <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#clearComparisonRecursively() <em>Clear Comparison Recursively</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.SingleElement#clearPropertyRecursively() <em>Clear Property Recursively</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#getReturnType() <em>Get Return Type</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#isTranslatable() <em>Is Translatable</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#getAllArgumentElements() <em>Get All Argument Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SingleElementTest extends PatternElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SingleElementTest.class);
	}

	/**
	 * Constructs a new Single Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Single Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SingleElement getFixture() {
		return (SingleElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphstructureFactory.eINSTANCE.createSingleElement());
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
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#copyNextElementsToNextGraphs() <em>Copy Next Elements To Next Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#copyNextElementsToNextGraphs()
	 * @generated
	 */
	public void testCopyNextElementsToNextGraphs() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#copyNextElementToNextGraphs(qualitypatternmodel.graphstructure.SingleElement) <em>Copy Next Element To Next Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#copyNextElementToNextGraphs(qualitypatternmodel.graphstructure.SingleElement)
	 * @generated
	 */
	public void testCopyNextElementToNextGraphs__SingleElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#removeElementFromPreviousGraphs() <em>Remove Element From Previous Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#removeElementFromPreviousGraphs()
	 * @generated
	 */
	public void testRemoveElementFromPreviousGraphs() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#copyNextElementToPreviousGraphs(qualitypatternmodel.graphstructure.SingleElement, boolean) <em>Copy Next Element To Previous Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#copyNextElementToPreviousGraphs(qualitypatternmodel.graphstructure.SingleElement, boolean)
	 * @generated
	 */
	public void testCopyNextElementToPreviousGraphs__SingleElement_boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#copyNextElementsToPreviousGraphs(boolean) <em>Copy Next Elements To Previous Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#copyNextElementsToPreviousGraphs(boolean)
	 * @generated
	 */
	public void testCopyNextElementsToPreviousGraphs__boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#toXQueryNoCount(qualitypatternmodel.patternstructure.Location) <em>To XQuery No Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#toXQueryNoCount(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	public void testToXQueryNoCount__Location() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#isRootElement() <em>Is Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#isRootElement()
	 * @generated
	 */
	public void testIsRootElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#removeMappingsToNext() <em>Remove Mappings To Next</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#removeMappingsToNext()
	 * @generated
	 */
	public void testRemoveMappingsToNext() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#removeFromReturnElements() <em>Remove From Return Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#removeFromReturnElements()
	 * @generated
	 */
	public void testRemoveFromReturnElements() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#clearMatchRecursively() <em>Clear Match Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#clearMatchRecursively()
	 * @generated
	 */
	public void testClearMatchRecursively() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#getAllRelations() <em>Get All Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#getAllRelations()
	 * @generated
	 */
	public void testGetAllRelations() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#translatePredicatesViaAnd(qualitypatternmodel.patternstructure.Location) <em>Translate Predicates Via And</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#translatePredicatesViaAnd(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	public void testTranslatePredicatesViaAnd__Location() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#clearPredicatesRecursively() <em>Clear Predicates Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#clearPredicatesRecursively()
	 * @generated
	 */
	public void testClearPredicatesRecursively() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#translatePredicatesViaBrackets(qualitypatternmodel.patternstructure.Location) <em>Translate Predicates Via Brackets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#translatePredicatesViaBrackets(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	public void testTranslatePredicatesViaBrackets__Location() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#getAllElements() <em>Get All Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#getAllElements()
	 * @generated
	 */
	public void testGetAllElements() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#getOriginalID() <em>Get Original ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#getOriginalID()
	 * @generated
	 */
	public void testGetOriginalID() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#getXQueryRepresentation(qualitypatternmodel.patternstructure.Location) <em>Get XQuery Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#getXQueryRepresentation(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	public void testGetXQueryRepresentation__Location() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#addPrimitiveMatch(java.lang.String) <em>Add Primitive Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#addPrimitiveMatch(java.lang.String)
	 * @generated
	 */
	public void testAddPrimitiveMatch__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#addPrimitiveComparison(java.lang.String) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#addPrimitiveComparison(java.lang.String)
	 * @generated
	 */
	public void testAddPrimitiveComparison__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#getXQueryVariable() <em>Get XQuery Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#getXQueryVariable()
	 * @generated
	 */
	public void testGetXQueryVariable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#addPrimitiveMatch() <em>Add Primitive Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#addPrimitiveMatch()
	 * @generated
	 */
	public void testAddPrimitiveMatch() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#addPrimitiveComparison() <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#addPrimitiveComparison()
	 * @generated
	 */
	public void testAddPrimitiveComparison() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#getGraphDepth() <em>Get Graph Depth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#getGraphDepth()
	 * @generated
	 */
	public void testGetGraphDepth() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#translatePathFromPrevious() <em>Translate Path From Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#translatePathFromPrevious()
	 * @generated
	 */
	public void testTranslatePathFromPrevious() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#getAllOperators() <em>Get All Operators</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#getAllOperators()
	 * @generated
	 */
	public void testGetAllOperators() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#addPrimitiveComparison(qualitypatternmodel.graphstructure.PropertyLocation, java.lang.String, qualitypatternmodel.functions.ComparisonOperator, qualitypatternmodel.parameters.Parameter) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#addPrimitiveComparison(qualitypatternmodel.graphstructure.PropertyLocation, java.lang.String, qualitypatternmodel.functions.ComparisonOperator, qualitypatternmodel.parameters.Parameter)
	 * @generated
	 */
	public void testAddPrimitiveComparison__PropertyLocation_String_ComparisonOperator_Parameter() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#addPrimitiveComparison(qualitypatternmodel.parameters.Parameter) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#addPrimitiveComparison(qualitypatternmodel.parameters.Parameter)
	 * @generated
	 */
	public void testAddPrimitiveComparison__Parameter() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#clearComparisonRecursively() <em>Clear Comparison Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#clearComparisonRecursively()
	 * @generated
	 */
	public void testClearComparisonRecursively() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.SingleElement#clearPropertyRecursively() <em>Clear Property Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.SingleElement#clearPropertyRecursively()
	 * @generated
	 */
	public void testClearPropertyRecursively() {
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

} //SingleElementTest
