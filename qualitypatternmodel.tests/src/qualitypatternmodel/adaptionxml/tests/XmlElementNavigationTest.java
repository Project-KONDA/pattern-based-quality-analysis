/**
 */
package qualitypatternmodel.adaptionxml.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xml Element Navigation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlElementNavigationTest extends XmlNavigationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XmlElementNavigationTest.class);
	}

	/**
	 * Constructs a new Xml Element Navigation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlElementNavigationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Xml Element Navigation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XmlElementNavigation getFixture() {
		return (XmlElementNavigation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionxmlFactory.eINSTANCE.createXmlElementNavigation());
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

} //XmlElementNavigationTest
