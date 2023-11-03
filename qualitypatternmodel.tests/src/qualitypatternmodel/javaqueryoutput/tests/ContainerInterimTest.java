/**
 */
package qualitypatternmodel.javaqueryoutput.tests;

import junit.textui.TestRunner;

import qualitypatternmodel.javaqueryoutput.ContainerInterim;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Container Interim</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerInterimTest extends InterimResultParamTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainerInterimTest.class);
	}

	/**
	 * Constructs a new Container Interim test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInterimTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Container Interim test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContainerInterim getFixture() {
		return (ContainerInterim)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JavaqueryoutputFactory.eINSTANCE.createContainerInterim());
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

} //ContainerInterimTest
