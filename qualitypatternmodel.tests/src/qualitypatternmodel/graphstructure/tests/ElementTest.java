/**
 */
package qualitypatternmodel.graphstructure.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.tests.PatternElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#copyNextElementsToNextGraphs() <em>Copy Next Elements To Next Graphs</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#copyNextElementToNextGraphs(qualitypatternmodel.graphstructure.Element) <em>Copy Next Element To Next Graphs</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#copyNextElementToPreviousGraphs(qualitypatternmodel.graphstructure.Element, boolean) <em>Copy Next Element To Previous Graphs</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#copyNextElementsToPreviousGraphs(boolean) <em>Copy Next Elements To Previous Graphs</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#isRootElement() <em>Is Root Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#removeFromReturnElementsRecursively() <em>Remove From Return Elements Recursively</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#clearMatchRecursively() <em>Clear Match Recursively</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getAllRelations() <em>Get All Relations</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#clearPredicatesRecursively() <em>Clear Predicates Recursively</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getAllElements() <em>Get All Elements</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getOriginalID() <em>Get Original ID</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getXQueryRepresentation(qualitypatternmodel.patternstructure.Location) <em>Get XQuery Representation</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#addPrimitiveMatch(java.lang.String) <em>Add Primitive Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(java.lang.String) <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getXQueryVariable() <em>Get XQuery Variable</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#addPrimitiveMatch() <em>Add Primitive Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#addPrimitiveComparison() <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getGraphDepth() <em>Get Graph Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#getAllOperators() <em>Get All Operators</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(qualitypatternmodel.graphstructure.PropertyLocation, java.lang.String, qualitypatternmodel.functions.ComparisonOperator, qualitypatternmodel.parameters.Parameter) <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(qualitypatternmodel.parameters.Parameter) <em>Add Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#clearComparisonRecursively() <em>Clear Comparison Recursively</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#clearPropertyRecursively() <em>Clear Property Recursively</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#copyProperty(qualitypatternmodel.graphstructure.Property) <em>Copy Property</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#copyPrimitiveComparison(qualitypatternmodel.functions.Comparison) <em>Copy Primitive Comparison</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Element#copyMatch(qualitypatternmodel.functions.Match) <em>Copy Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#getReturnType() <em>Get Return Type</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#isTranslatable() <em>Is Translatable</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#getAllArgumentElements() <em>Get All Argument Elements</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ElementTest extends PatternElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElementTest.class);
	}

	/**
	 * Constructs a new Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Element getFixture() {
		return (Element)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GraphstructureFactory.eINSTANCE.createElement());
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
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#copyNextElementsToNextGraphs() <em>Copy Next Elements To Next Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#copyNextElementsToNextGraphs()
	 * @generated
	 */
	public void testCopyNextElementsToNextGraphs() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#copyNextElementToNextGraphs(qualitypatternmodel.graphstructure.Element) <em>Copy Next Element To Next Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#copyNextElementToNextGraphs(qualitypatternmodel.graphstructure.Element)
	 * @generated
	 */
	public void testCopyNextElementToNextGraphs__Element() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#copyNextElementToPreviousGraphs(qualitypatternmodel.graphstructure.Element, boolean) <em>Copy Next Element To Previous Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#copyNextElementToPreviousGraphs(qualitypatternmodel.graphstructure.Element, boolean)
	 * @generated
	 */
	public void testCopyNextElementToPreviousGraphs__Element_boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#copyNextElementsToPreviousGraphs(boolean) <em>Copy Next Elements To Previous Graphs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#copyNextElementsToPreviousGraphs(boolean)
	 * @generated
	 */
	public void testCopyNextElementsToPreviousGraphs__boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#isRootElement() <em>Is Root Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#isRootElement()
	 * @generated
	 */
	public void testIsRootElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#removeFromReturnElementsRecursively() <em>Remove From Return Elements Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#removeFromReturnElementsRecursively()
	 * @generated
	 */
	public void testRemoveFromReturnElementsRecursively() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#clearMatchRecursively() <em>Clear Match Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#clearMatchRecursively()
	 * @generated
	 */
	public void testClearMatchRecursively() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#getAllRelations() <em>Get All Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#getAllRelations()
	 * @generated
	 */
	public void testGetAllRelations() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#clearPredicatesRecursively() <em>Clear Predicates Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#clearPredicatesRecursively()
	 * @generated
	 */
	public void testClearPredicatesRecursively() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#getAllElements() <em>Get All Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#getAllElements()
	 * @generated
	 */
	public void testGetAllElements() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#getOriginalID() <em>Get Original ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#getOriginalID()
	 * @generated
	 */
	public void testGetOriginalID() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#getXQueryRepresentation(qualitypatternmodel.patternstructure.Location) <em>Get XQuery Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#getXQueryRepresentation(qualitypatternmodel.patternstructure.Location)
	 * @generated
	 */
	public void testGetXQueryRepresentation__Location() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#addPrimitiveMatch(java.lang.String) <em>Add Primitive Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#addPrimitiveMatch(java.lang.String)
	 * @generated
	 */
	public void testAddPrimitiveMatch__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(java.lang.String) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(java.lang.String)
	 * @generated
	 */
	public void testAddPrimitiveComparison__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#getXQueryVariable() <em>Get XQuery Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#getXQueryVariable()
	 * @generated
	 */
	public void testGetXQueryVariable() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#addPrimitiveMatch() <em>Add Primitive Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#addPrimitiveMatch()
	 * @generated
	 */
	public void testAddPrimitiveMatch() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#addPrimitiveComparison() <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#addPrimitiveComparison()
	 * @generated
	 */
	public void testAddPrimitiveComparison() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#getGraphDepth() <em>Get Graph Depth</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#getGraphDepth()
	 * @generated
	 */
	public void testGetGraphDepth() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#getAllOperators() <em>Get All Operators</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#getAllOperators()
	 * @generated
	 */
	public void testGetAllOperators() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(qualitypatternmodel.graphstructure.PropertyLocation, java.lang.String, qualitypatternmodel.functions.ComparisonOperator, qualitypatternmodel.parameters.Parameter) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(qualitypatternmodel.graphstructure.PropertyLocation, java.lang.String, qualitypatternmodel.functions.ComparisonOperator, qualitypatternmodel.parameters.Parameter)
	 * @generated
	 */
	public void testAddPrimitiveComparison__PropertyLocation_String_ComparisonOperator_Parameter() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(qualitypatternmodel.parameters.Parameter) <em>Add Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#addPrimitiveComparison(qualitypatternmodel.parameters.Parameter)
	 * @generated
	 */
	public void testAddPrimitiveComparison__Parameter() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#clearComparisonRecursively() <em>Clear Comparison Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#clearComparisonRecursively()
	 * @generated
	 */
	public void testClearComparisonRecursively() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#clearPropertyRecursively() <em>Clear Property Recursively</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#clearPropertyRecursively()
	 * @generated
	 */
	public void testClearPropertyRecursively() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#copyProperty(qualitypatternmodel.graphstructure.Property) <em>Copy Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#copyProperty(qualitypatternmodel.graphstructure.Property)
	 * @generated
	 */
	public void testCopyProperty__Property() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#copyPrimitiveComparison(qualitypatternmodel.functions.Comparison) <em>Copy Primitive Comparison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#copyPrimitiveComparison(qualitypatternmodel.functions.Comparison)
	 * @generated
	 */
	public void testCopyPrimitiveComparison__Comparison() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.graphstructure.Element#copyMatch(qualitypatternmodel.functions.Match) <em>Copy Match</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.graphstructure.Element#copyMatch(qualitypatternmodel.functions.Match)
	 * @generated
	 */
	public void testCopyMatch__Match() {
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
