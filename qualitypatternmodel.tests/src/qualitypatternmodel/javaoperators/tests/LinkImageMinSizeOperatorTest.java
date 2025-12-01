/**
 */
package qualitypatternmodel.javaoperators.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaoperators.JavaoperatorsFactory;
import qualitypatternmodel.javaoperators.LinkImageMinSizeOperator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link Image Min Size Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkImageMinSizeOperatorTest extends OneArgJavaTwoNumberOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkImageMinSizeOperatorTest.class);
	}

	/**
	 * Constructs a new Link Image Min Size Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkImageMinSizeOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link Image Min Size Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinkImageMinSizeOperator getFixture() {
		return (LinkImageMinSizeOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaoperatorsFactory.eINSTANCE.createLinkImageMinSizeOperator());
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

} //LinkImageMinSizeOperatorTest
