/**
 */
package qualitypatternmodel.javaqueryoutput.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaqueryoutput.ContainerResult;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Container Result</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerResultTest extends InterimResultTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainerResultTest.class);
	}

	/**
	 * Constructs a new Container Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerResultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Container Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContainerResult getFixture() {
		return (ContainerResult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryoutputFactory.eINSTANCE.createContainerResult());
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

} //ContainerResultTest
