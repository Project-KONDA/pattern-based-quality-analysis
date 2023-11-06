/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;

import qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl;

import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;

import qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;

import qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl;

import qualitypatternmodel.execution.ExecutionPackage;

import qualitypatternmodel.execution.impl.ExecutionPackageImpl;

import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl;

import qualitypatternmodel.javaoperators.JavaoperatorsPackage;

import qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl;

import qualitypatternmodel.javaquery.JavaqueryPackage;

import qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl;
import qualitypatternmodel.javaqueryoutput.ContainerInterim;
import qualitypatternmodel.javaqueryoutput.FixedContainerInterim;
import qualitypatternmodel.javaqueryoutput.InterimResultParam;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.InterimResultStructure;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputFactory;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.RecordInterim;
import qualitypatternmodel.javaqueryoutput.ValueInterim;
import qualitypatternmodel.javaqueryoutput.VariableContainerInterim;
import qualitypatternmodel.operators.OperatorsPackage;

import qualitypatternmodel.operators.impl.OperatorsPackageImpl;

import qualitypatternmodel.parameters.ParametersPackage;

import qualitypatternmodel.parameters.impl.ParametersPackageImpl;

import qualitypatternmodel.patternstructure.PatternstructurePackage;

import qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl;

import qualitypatternmodel.textrepresentation.TextrepresentationPackage;

import qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaqueryoutputPackageImpl extends EPackageImpl implements JavaqueryoutputPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interimResultStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordInterimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interimResultPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interimResultParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerInterimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueInterimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableContainerInterimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedContainerInterimEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaqueryoutputPackageImpl() {
		super(eNS_URI, JavaqueryoutputFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JavaqueryoutputPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaqueryoutputPackage init() {
		if (isInited) return (JavaqueryoutputPackage)EPackage.Registry.INSTANCE.getEPackage(JavaqueryoutputPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJavaqueryoutputPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JavaqueryoutputPackageImpl theJavaqueryoutputPackage = registeredJavaqueryoutputPackage instanceof JavaqueryoutputPackageImpl ? (JavaqueryoutputPackageImpl)registeredJavaqueryoutputPackage : new JavaqueryoutputPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(registeredPackage instanceof ParametersPackageImpl ? registeredPackage : ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl)(registeredPackage instanceof OperatorsPackageImpl ? registeredPackage : OperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);
		GraphstructurePackageImpl theGraphstructurePackage = (GraphstructurePackageImpl)(registeredPackage instanceof GraphstructurePackageImpl ? registeredPackage : GraphstructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		PatternstructurePackageImpl thePatternstructurePackage = (PatternstructurePackageImpl)(registeredPackage instanceof PatternstructurePackageImpl ? registeredPackage : PatternstructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdaptionxmlPackage.eNS_URI);
		AdaptionxmlPackageImpl theAdaptionxmlPackage = (AdaptionxmlPackageImpl)(registeredPackage instanceof AdaptionxmlPackageImpl ? registeredPackage : AdaptionxmlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(registeredPackage instanceof ExecutionPackageImpl ? registeredPackage : ExecutionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TextrepresentationPackage.eNS_URI);
		TextrepresentationPackageImpl theTextrepresentationPackage = (TextrepresentationPackageImpl)(registeredPackage instanceof TextrepresentationPackageImpl ? registeredPackage : TextrepresentationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdaptionrdfPackage.eNS_URI);
		AdaptionrdfPackageImpl theAdaptionrdfPackage = (AdaptionrdfPackageImpl)(registeredPackage instanceof AdaptionrdfPackageImpl ? registeredPackage : AdaptionrdfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Adaptionneo4jPackage.eNS_URI);
		Adaptionneo4jPackageImpl theAdaptionneo4jPackage = (Adaptionneo4jPackageImpl)(registeredPackage instanceof Adaptionneo4jPackageImpl ? registeredPackage : Adaptionneo4jPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaoperatorsPackage.eNS_URI);
		JavaoperatorsPackageImpl theJavaoperatorsPackage = (JavaoperatorsPackageImpl)(registeredPackage instanceof JavaoperatorsPackageImpl ? registeredPackage : JavaoperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaqueryPackage.eNS_URI);
		JavaqueryPackageImpl theJavaqueryPackage = (JavaqueryPackageImpl)(registeredPackage instanceof JavaqueryPackageImpl ? registeredPackage : JavaqueryPackage.eINSTANCE);

		// Create package meta-data objects
		theJavaqueryoutputPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theTextrepresentationPackage.createPackageContents();
		theAdaptionrdfPackage.createPackageContents();
		theAdaptionneo4jPackage.createPackageContents();
		theJavaoperatorsPackage.createPackageContents();
		theJavaqueryPackage.createPackageContents();

		// Initialize created meta-data
		theJavaqueryoutputPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theTextrepresentationPackage.initializePackageContents();
		theAdaptionrdfPackage.initializePackageContents();
		theAdaptionneo4jPackage.initializePackageContents();
		theJavaoperatorsPackage.initializePackageContents();
		theJavaqueryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaqueryoutputPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaqueryoutputPackage.eNS_URI, theJavaqueryoutputPackage);
		return theJavaqueryoutputPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterimResultStructure() {
		return interimResultStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterimResultStructure_Substructure() {
		return (EReference)interimResultStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterimResultStructure_Record() {
		return (EReference)interimResultStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecordInterim() {
		return recordInterimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterimResultPart() {
		return interimResultPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterimResultParam() {
		return interimResultParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerInterim() {
		return containerInterimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerInterim_Contained() {
		return (EReference)containerInterimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueInterim() {
		return valueInterimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableContainerInterim() {
		return variableContainerInterimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedContainerInterim() {
		return fixedContainerInterimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaqueryoutputFactory getJavaqueryoutputFactory() {
		return (JavaqueryoutputFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		interimResultStructureEClass = createEClass(INTERIM_RESULT_STRUCTURE);
		createEReference(interimResultStructureEClass, INTERIM_RESULT_STRUCTURE__SUBSTRUCTURE);
		createEReference(interimResultStructureEClass, INTERIM_RESULT_STRUCTURE__RECORD);

		recordInterimEClass = createEClass(RECORD_INTERIM);

		interimResultPartEClass = createEClass(INTERIM_RESULT_PART);

		interimResultParamEClass = createEClass(INTERIM_RESULT_PARAM);

		containerInterimEClass = createEClass(CONTAINER_INTERIM);
		createEReference(containerInterimEClass, CONTAINER_INTERIM__CONTAINED);

		valueInterimEClass = createEClass(VALUE_INTERIM);

		variableContainerInterimEClass = createEClass(VARIABLE_CONTAINER_INTERIM);

		fixedContainerInterimEClass = createEClass(FIXED_CONTAINER_INTERIM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		recordInterimEClass.getESuperTypes().add(this.getInterimResultPart());
		interimResultParamEClass.getESuperTypes().add(this.getInterimResultPart());
		containerInterimEClass.getESuperTypes().add(this.getInterimResultParam());
		valueInterimEClass.getESuperTypes().add(this.getInterimResultParam());
		variableContainerInterimEClass.getESuperTypes().add(this.getContainerInterim());
		fixedContainerInterimEClass.getESuperTypes().add(this.getContainerInterim());

		// Initialize classes, features, and operations; add parameters
		initEClass(interimResultStructureEClass, InterimResultStructure.class, "InterimResultStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterimResultStructure_Substructure(), this.getInterimResultParam(), null, "substructure", null, 0, 1, InterimResultStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterimResultStructure_Record(), this.getRecordInterim(), null, "record", null, 1, 1, InterimResultStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordInterimEClass, RecordInterim.class, "RecordInterim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interimResultPartEClass, InterimResultPart.class, "InterimResultPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interimResultParamEClass, InterimResultParam.class, "InterimResultParam", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerInterimEClass, ContainerInterim.class, "ContainerInterim", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerInterim_Contained(), this.getInterimResultParam(), null, "contained", null, 1, -1, ContainerInterim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueInterimEClass, ValueInterim.class, "ValueInterim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableContainerInterimEClass, VariableContainerInterim.class, "VariableContainerInterim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixedContainerInterimEClass, FixedContainerInterim.class, "FixedContainerInterim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //JavaqueryoutputPackageImpl
