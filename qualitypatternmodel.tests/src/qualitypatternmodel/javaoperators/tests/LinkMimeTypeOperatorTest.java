/**
 */
package qualitypatternmodel.javaoperators.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaoperators.JavaoperatorsFactory;
import qualitypatternmodel.javaoperators.LinkMimeTypeOperator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link Mime Type Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkMimeTypeOperatorTest extends OneArgJavaListOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkMimeTypeOperatorTest.class);
	}

	/**
	 * Constructs a new Link Mime Type Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMimeTypeOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link Mime Type Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinkMimeTypeOperator getFixture() {
		return (LinkMimeTypeOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaoperatorsFactory.eINSTANCE.createLinkMimeTypeOperator());
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

} //LinkMimeTypeOperatorTest
