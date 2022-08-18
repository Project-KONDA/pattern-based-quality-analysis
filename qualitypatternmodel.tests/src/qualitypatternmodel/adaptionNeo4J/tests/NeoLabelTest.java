/**
 */
package qualitypatternmodel.adaptionNeo4J.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoLabel;

import qualitypatternmodel.parameters.tests.ParameterValueTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Neo Label</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeoLabelTest extends ParameterValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NeoLabelTest.class);
	}

	/**
	 * Constructs a new Neo Label test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoLabelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Neo Label test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NeoLabel getFixture() {
		return (NeoLabel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdaptionNeo4JFactory.eINSTANCE.createNeoLabel());
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

} //NeoLabelTest
