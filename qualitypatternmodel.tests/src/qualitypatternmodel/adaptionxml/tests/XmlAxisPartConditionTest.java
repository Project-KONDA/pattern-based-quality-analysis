/**
 */
package qualitypatternmodel.adaptionxml.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.parameters.tests.ParameterTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Xml Axis Part Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmlAxisPartConditionTest extends ParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XmlAxisPartConditionTest.class);
	}

	/**
	 * Constructs a new Xml Axis Part Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlAxisPartConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Xml Axis Part Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XmlAxisPartCondition getFixture() {
		return (XmlAxisPartCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionxmlFactory.eINSTANCE.createXmlAxisPartCondition());
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

} //XmlAxisPartConditionTest
