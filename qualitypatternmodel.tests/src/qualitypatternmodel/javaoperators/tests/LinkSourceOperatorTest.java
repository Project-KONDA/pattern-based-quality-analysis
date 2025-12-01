/**
 */
package qualitypatternmodel.javaoperators.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaoperators.JavaoperatorsFactory;
import qualitypatternmodel.javaoperators.LinkSourceOperator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link Source Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkSourceOperatorTest extends OneArgJavaListOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkSourceOperatorTest.class);
	}

	/**
	 * Constructs a new Link Source Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkSourceOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link Source Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinkSourceOperator getFixture() {
		return (LinkSourceOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaoperatorsFactory.eINSTANCE.createLinkSourceOperator());
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

} //LinkSourceOperatorTest
