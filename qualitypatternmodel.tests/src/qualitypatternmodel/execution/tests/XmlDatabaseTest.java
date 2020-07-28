/**
 */
package qualitypatternmodel.execution.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.execution.ExecutionFactory;
import qualitypatternmodel.execution.XmlDatabase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xml Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#analyseDatabase() <em>Analyse Database</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#analyseSchema() <em>Analyse Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#recordAttributeValue(java.lang.String) <em>Record Attribute Value</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#recordDataValue(java.lang.String) <em>Record Data Value</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#removeAttributeValue(java.lang.String) <em>Remove Attribute Value</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#removeDataValue(java.lang.String) <em>Remove Data Value</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#init() <em>Init</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#open() <em>Open</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#recordElementName(java.lang.String) <em>Record Element Name</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#recordAttributeName(java.lang.String) <em>Record Attribute Name</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#removeElementName(java.lang.String) <em>Remove Element Name</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#removeAttributeName(java.lang.String) <em>Remove Attribute Name</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#checkKeyRefInSchema(java.lang.String, java.lang.String) <em>Check Key Ref In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#checkChildInSchema(java.lang.String, java.lang.String) <em>Check Child In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#checkParentInSchema(java.lang.String, java.lang.String) <em>Check Parent In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#checkDescendantInSchema(java.lang.String, java.lang.String) <em>Check Descendant In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#checkAncestorInSchema(java.lang.String, java.lang.String) <em>Check Ancestor In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#checkAttributeInSchema(java.lang.String, java.lang.String) <em>Check Attribute In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#createSchemaDatabase() <em>Create Schema Database</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#openSchemaDatabase() <em>Open Schema Database</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#checkFollowingSiblingInSchema(java.lang.String, java.lang.String) <em>Check Following Sibling In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#checkPrecedingSiblingInSchema(java.lang.String, java.lang.String) <em>Check Preceding Sibling In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#checkFollowingInSchema(java.lang.String, java.lang.String) <em>Check Following In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#checkPrecedingInSchema(java.lang.String, java.lang.String) <em>Check Preceding In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#initSchemaDatabase() <em>Init Schema Database</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getChildrenInSchema(java.lang.String) <em>Get Children In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getDescendantsInSchema(java.lang.String) <em>Get Descendants In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getParentInSchema(java.lang.String) <em>Get Parent In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getAncestorsInSchema(java.lang.String) <em>Get Ancestors In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getAttributesInSchema(java.lang.String) <em>Get Attributes In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getFollowingSiblingsInSchema(java.lang.String) <em>Get Following Siblings In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getPrecedingSiblingsInSchema(java.lang.String) <em>Get Preceding Siblings In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getFollowingInSchema(java.lang.String) <em>Get Following In Schema</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.XmlDatabase#getPrecedingInSchema(java.lang.String) <em>Get Preceding In Schema</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class XmlDatabaseTest extends DatabaseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XmlDatabaseTest.class);
	}

	/**
	 * Constructs a new Xml Database test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlDatabaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Xml Database test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XmlDatabase getFixture() {
		return (XmlDatabase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionFactory.eINSTANCE.createXmlDatabase());
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
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#analyseDatabase() <em>Analyse Database</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#analyseDatabase()
	 * @generated
	 */
	public void testAnalyseDatabase() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#analyseSchema() <em>Analyse Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#analyseSchema()
	 * @generated
	 */
	public void testAnalyseSchema() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#recordAttributeValue(java.lang.String) <em>Record Attribute Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#recordAttributeValue(java.lang.String)
	 * @generated
	 */
	public void testRecordAttributeValue__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#recordDataValue(java.lang.String) <em>Record Data Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#recordDataValue(java.lang.String)
	 * @generated
	 */
	public void testRecordDataValue__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#removeAttributeValue(java.lang.String) <em>Remove Attribute Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#removeAttributeValue(java.lang.String)
	 * @generated
	 */
	public void testRemoveAttributeValue__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#removeDataValue(java.lang.String) <em>Remove Data Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#removeDataValue(java.lang.String)
	 * @generated
	 */
	public void testRemoveDataValue__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#init()
	 * @generated
	 */
	public void testInit() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#open() <em>Open</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#open()
	 * @generated
	 */
	public void testOpen() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#recordElementName(java.lang.String) <em>Record Element Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#recordElementName(java.lang.String)
	 * @generated
	 */
	public void testRecordElementName__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#recordAttributeName(java.lang.String) <em>Record Attribute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#recordAttributeName(java.lang.String)
	 * @generated
	 */
	public void testRecordAttributeName__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#removeElementName(java.lang.String) <em>Remove Element Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#removeElementName(java.lang.String)
	 * @generated
	 */
	public void testRemoveElementName__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#removeAttributeName(java.lang.String) <em>Remove Attribute Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#removeAttributeName(java.lang.String)
	 * @generated
	 */
	public void testRemoveAttributeName__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#checkKeyRefInSchema(java.lang.String, java.lang.String) <em>Check Key Ref In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#checkKeyRefInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCheckKeyRefInSchema__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#checkChildInSchema(java.lang.String, java.lang.String) <em>Check Child In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#checkChildInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCheckChildInSchema__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#checkParentInSchema(java.lang.String, java.lang.String) <em>Check Parent In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#checkParentInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCheckParentInSchema__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#checkDescendantInSchema(java.lang.String, java.lang.String) <em>Check Descendant In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#checkDescendantInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCheckDescendantInSchema__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#checkAncestorInSchema(java.lang.String, java.lang.String) <em>Check Ancestor In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#checkAncestorInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCheckAncestorInSchema__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#checkAttributeInSchema(java.lang.String, java.lang.String) <em>Check Attribute In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#checkAttributeInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCheckAttributeInSchema__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#createSchemaDatabase() <em>Create Schema Database</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#createSchemaDatabase()
	 * @generated
	 */
	public void testCreateSchemaDatabase() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#openSchemaDatabase() <em>Open Schema Database</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#openSchemaDatabase()
	 * @generated
	 */
	public void testOpenSchemaDatabase() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#checkFollowingSiblingInSchema(java.lang.String, java.lang.String) <em>Check Following Sibling In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#checkFollowingSiblingInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCheckFollowingSiblingInSchema__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#checkPrecedingSiblingInSchema(java.lang.String, java.lang.String) <em>Check Preceding Sibling In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#checkPrecedingSiblingInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCheckPrecedingSiblingInSchema__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#checkFollowingInSchema(java.lang.String, java.lang.String) <em>Check Following In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#checkFollowingInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCheckFollowingInSchema__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#checkPrecedingInSchema(java.lang.String, java.lang.String) <em>Check Preceding In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#checkPrecedingInSchema(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCheckPrecedingInSchema__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#initSchemaDatabase() <em>Init Schema Database</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#initSchemaDatabase()
	 * @generated
	 */
	public void testInitSchemaDatabase() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#getChildrenInSchema(java.lang.String) <em>Get Children In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#getChildrenInSchema(java.lang.String)
	 * @generated
	 */
	public void testGetChildrenInSchema__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#getDescendantsInSchema(java.lang.String) <em>Get Descendants In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#getDescendantsInSchema(java.lang.String)
	 * @generated
	 */
	public void testGetDescendantsInSchema__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#getParentInSchema(java.lang.String) <em>Get Parent In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#getParentInSchema(java.lang.String)
	 * @generated
	 */
	public void testGetParentInSchema__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#getAncestorsInSchema(java.lang.String) <em>Get Ancestors In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#getAncestorsInSchema(java.lang.String)
	 * @generated
	 */
	public void testGetAncestorsInSchema__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#getAttributesInSchema(java.lang.String) <em>Get Attributes In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#getAttributesInSchema(java.lang.String)
	 * @generated
	 */
	public void testGetAttributesInSchema__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#getFollowingSiblingsInSchema(java.lang.String) <em>Get Following Siblings In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#getFollowingSiblingsInSchema(java.lang.String)
	 * @generated
	 */
	public void testGetFollowingSiblingsInSchema__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#getPrecedingSiblingsInSchema(java.lang.String) <em>Get Preceding Siblings In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#getPrecedingSiblingsInSchema(java.lang.String)
	 * @generated
	 */
	public void testGetPrecedingSiblingsInSchema__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#getFollowingInSchema(java.lang.String) <em>Get Following In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#getFollowingInSchema(java.lang.String)
	 * @generated
	 */
	public void testGetFollowingInSchema__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link qualitypatternmodel.execution.XmlDatabase#getPrecedingInSchema(java.lang.String) <em>Get Preceding In Schema</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.execution.XmlDatabase#getPrecedingInSchema(java.lang.String)
	 * @generated
	 */
	public void testGetPrecedingInSchema__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //XmlDatabaseTest
