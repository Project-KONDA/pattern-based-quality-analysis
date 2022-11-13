/**
 */
package qualitypatternmodel.adaptionxml.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xml Property Navigation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlPropertyNavigationTest extends XmlNavigationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XmlPropertyNavigationTest.class);
	}

	/**
	 * Constructs a new Xml Property Navigation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlPropertyNavigationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Xml Property Navigation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XmlPropertyNavigation getFixture() {
		return (XmlPropertyNavigation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionxmlFactory.eINSTANCE.createXmlPropertyNavigation());
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

} //XmlPropertyNavigationTest
