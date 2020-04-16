/**
 */
package qualitypatternmodel.adaptionxml.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.XMLNavigation;

import qualitypatternmodel.graphstructure.tests.RelationTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Navigation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLNavigationTest extends RelationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLNavigationTest.class);
	}

	/**
	 * Constructs a new XML Navigation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLNavigationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XML Navigation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XMLNavigation getFixture() {
		return (XMLNavigation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionxmlFactory.eINSTANCE.createXMLNavigation());
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

} //XMLNavigationTest
