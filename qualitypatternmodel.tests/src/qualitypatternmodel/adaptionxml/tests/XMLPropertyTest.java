/**
 */
package qualitypatternmodel.adaptionxml.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.XMLProperty;

import qualitypatternmodel.graphstructure.tests.PropertyTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLPropertyTest extends PropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLPropertyTest.class);
	}

	/**
	 * Constructs a new XML Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XML Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XMLProperty getFixture() {
		return (XMLProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionxmlFactory.eINSTANCE.createXMLProperty());
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

} //XMLPropertyTest
