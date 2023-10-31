/**
 */
package qualitypatternmodel.javaquery.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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

import qualitypatternmodel.javaquery.AnyCombinator;
import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.Combinator;
import qualitypatternmodel.javaquery.CountCombinator;
import qualitypatternmodel.javaquery.EveryCombinator;
import qualitypatternmodel.javaquery.FormulaFilterPart;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.javaquery.JavaqueryFactory;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.ListFilterPart;
import qualitypatternmodel.javaquery.NoneCombinator;
import qualitypatternmodel.javaquery.NotFilterPart;
import qualitypatternmodel.javaquery.OneArgFunctionFilterPart;
import qualitypatternmodel.javaquery.TwoArgFunctionFilterPart;

import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl;
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
public class JavaqueryPackageImpl extends EPackageImpl implements JavaqueryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaFilterPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaFilterPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanFilterPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneArgFunctionFilterPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listFilterPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoArgFunctionFilterPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass everyCombinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyCombinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noneCombinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countCombinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notFilterPartEClass = null;

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
	 * @see qualitypatternmodel.javaquery.JavaqueryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaqueryPackageImpl() {
		super(eNS_URI, JavaqueryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JavaqueryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaqueryPackage init() {
		if (isInited) return (JavaqueryPackage)EPackage.Registry.INSTANCE.getEPackage(JavaqueryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJavaqueryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JavaqueryPackageImpl theJavaqueryPackage = registeredJavaqueryPackage instanceof JavaqueryPackageImpl ? (JavaqueryPackageImpl)registeredJavaqueryPackage : new JavaqueryPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaqueryoutputPackage.eNS_URI);
		JavaqueryoutputPackageImpl theJavaqueryoutputPackage = (JavaqueryoutputPackageImpl)(registeredPackage instanceof JavaqueryoutputPackageImpl ? registeredPackage : JavaqueryoutputPackage.eINSTANCE);

		// Create package meta-data objects
		theJavaqueryPackage.createPackageContents();
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
		theJavaqueryoutputPackage.createPackageContents();

		// Initialize created meta-data
		theJavaqueryPackage.initializePackageContents();
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
		theJavaqueryoutputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaqueryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaqueryPackage.eNS_URI, theJavaqueryPackage);
		return theJavaqueryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaFilter() {
		return javaFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJavaFilter_Filter() {
		return (EReference)javaFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJavaFilter_Structure() {
		return (EReference)javaFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaFilterPart() {
		return javaFilterPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaFilterPart__Apply() {
		return javaFilterPartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaFilterPart__GetArguments() {
		return javaFilterPartEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormulaFilterPart() {
		return formulaFilterPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormulaFilterPart_Subfilter1() {
		return (EReference)formulaFilterPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormulaFilterPart_Subfilter2() {
		return (EReference)formulaFilterPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanFilterPart() {
		return booleanFilterPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanFilterPart_Argument() {
		return (EReference)booleanFilterPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOneArgFunctionFilterPart() {
		return oneArgFunctionFilterPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOneArgFunctionFilterPart_Combinator() {
		return (EReference)oneArgFunctionFilterPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOneArgFunctionFilterPart_Argument() {
		return (EReference)oneArgFunctionFilterPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOneArgFunctionFilterPart__Apply__String() {
		return oneArgFunctionFilterPartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListFilterPart() {
		return listFilterPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListFilterPart_Combinator() {
		return (EReference)listFilterPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListFilterPart_Subfilter() {
		return (EReference)listFilterPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListFilterPart_Argument() {
		return (EReference)listFilterPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTwoArgFunctionFilterPart() {
		return twoArgFunctionFilterPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTwoArgFunctionFilterPart_Combinator2() {
		return (EReference)twoArgFunctionFilterPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTwoArgFunctionFilterPart_Combinator1() {
		return (EReference)twoArgFunctionFilterPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTwoArgFunctionFilterPart_Argument1() {
		return (EReference)twoArgFunctionFilterPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTwoArgFunctionFilterPart_Argument2() {
		return (EReference)twoArgFunctionFilterPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTwoArgFunctionFilterPart__Apply__String_String() {
		return twoArgFunctionFilterPartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCombinator() {
		return combinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEveryCombinator() {
		return everyCombinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnyCombinator() {
		return anyCombinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoneCombinator() {
		return noneCombinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountCombinator() {
		return countCombinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCountCombinator_Operator() {
		return (EAttribute)countCombinatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCountCombinator_Number() {
		return (EAttribute)countCombinatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotFilterPart() {
		return notFilterPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotFilterPart_Subfilter() {
		return (EReference)notFilterPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaqueryFactory getJavaqueryFactory() {
		return (JavaqueryFactory)getEFactoryInstance();
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
		javaFilterEClass = createEClass(JAVA_FILTER);
		createEReference(javaFilterEClass, JAVA_FILTER__FILTER);
		createEReference(javaFilterEClass, JAVA_FILTER__STRUCTURE);

		javaFilterPartEClass = createEClass(JAVA_FILTER_PART);
		createEOperation(javaFilterPartEClass, JAVA_FILTER_PART___APPLY);
		createEOperation(javaFilterPartEClass, JAVA_FILTER_PART___GET_ARGUMENTS);

		formulaFilterPartEClass = createEClass(FORMULA_FILTER_PART);
		createEReference(formulaFilterPartEClass, FORMULA_FILTER_PART__SUBFILTER1);
		createEReference(formulaFilterPartEClass, FORMULA_FILTER_PART__SUBFILTER2);

		booleanFilterPartEClass = createEClass(BOOLEAN_FILTER_PART);
		createEReference(booleanFilterPartEClass, BOOLEAN_FILTER_PART__ARGUMENT);

		oneArgFunctionFilterPartEClass = createEClass(ONE_ARG_FUNCTION_FILTER_PART);
		createEReference(oneArgFunctionFilterPartEClass, ONE_ARG_FUNCTION_FILTER_PART__COMBINATOR);
		createEReference(oneArgFunctionFilterPartEClass, ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT);
		createEOperation(oneArgFunctionFilterPartEClass, ONE_ARG_FUNCTION_FILTER_PART___APPLY__STRING);

		listFilterPartEClass = createEClass(LIST_FILTER_PART);
		createEReference(listFilterPartEClass, LIST_FILTER_PART__COMBINATOR);
		createEReference(listFilterPartEClass, LIST_FILTER_PART__SUBFILTER);
		createEReference(listFilterPartEClass, LIST_FILTER_PART__ARGUMENT);

		twoArgFunctionFilterPartEClass = createEClass(TWO_ARG_FUNCTION_FILTER_PART);
		createEReference(twoArgFunctionFilterPartEClass, TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR2);
		createEReference(twoArgFunctionFilterPartEClass, TWO_ARG_FUNCTION_FILTER_PART__COMBINATOR1);
		createEReference(twoArgFunctionFilterPartEClass, TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1);
		createEReference(twoArgFunctionFilterPartEClass, TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2);
		createEOperation(twoArgFunctionFilterPartEClass, TWO_ARG_FUNCTION_FILTER_PART___APPLY__STRING_STRING);

		combinatorEClass = createEClass(COMBINATOR);

		everyCombinatorEClass = createEClass(EVERY_COMBINATOR);

		anyCombinatorEClass = createEClass(ANY_COMBINATOR);

		noneCombinatorEClass = createEClass(NONE_COMBINATOR);

		countCombinatorEClass = createEClass(COUNT_COMBINATOR);
		createEAttribute(countCombinatorEClass, COUNT_COMBINATOR__OPERATOR);
		createEAttribute(countCombinatorEClass, COUNT_COMBINATOR__NUMBER);

		notFilterPartEClass = createEClass(NOT_FILTER_PART);
		createEReference(notFilterPartEClass, NOT_FILTER_PART__SUBFILTER);
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

		// Obtain other dependent packages
		JavaqueryoutputPackage theJavaqueryoutputPackage = (JavaqueryoutputPackage)EPackage.Registry.INSTANCE.getEPackage(JavaqueryoutputPackage.eNS_URI);
		PatternstructurePackage thePatternstructurePackage = (PatternstructurePackage)EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		formulaFilterPartEClass.getESuperTypes().add(this.getJavaFilterPart());
		booleanFilterPartEClass.getESuperTypes().add(this.getJavaFilterPart());
		oneArgFunctionFilterPartEClass.getESuperTypes().add(this.getJavaFilterPart());
		listFilterPartEClass.getESuperTypes().add(this.getJavaFilterPart());
		twoArgFunctionFilterPartEClass.getESuperTypes().add(this.getJavaFilterPart());
		everyCombinatorEClass.getESuperTypes().add(this.getCombinator());
		anyCombinatorEClass.getESuperTypes().add(this.getCombinator());
		noneCombinatorEClass.getESuperTypes().add(this.getCombinator());
		countCombinatorEClass.getESuperTypes().add(this.getCombinator());
		notFilterPartEClass.getESuperTypes().add(this.getJavaFilterPart());

		// Initialize classes, features, and operations; add parameters
		initEClass(javaFilterEClass, JavaFilter.class, "JavaFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaFilter_Filter(), this.getJavaFilterPart(), null, "filter", null, 0, 1, JavaFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaFilter_Structure(), theJavaqueryoutputPackage.getInterimResultsStructure(), null, "structure", null, 1, 1, JavaFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaFilterPartEClass, JavaFilterPart.class, "JavaFilterPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getJavaFilterPart__Apply(), ecorePackage.getEBooleanObject(), "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getJavaFilterPart__GetArguments(), this.getJavaFilterPart(), "getArguments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(formulaFilterPartEClass, FormulaFilterPart.class, "FormulaFilterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormulaFilterPart_Subfilter1(), this.getJavaFilterPart(), null, "subfilter1", null, 1, 1, FormulaFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormulaFilterPart_Subfilter2(), this.getJavaFilterPart(), null, "subfilter2", null, 1, 1, FormulaFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanFilterPartEClass, BooleanFilterPart.class, "BooleanFilterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanFilterPart_Argument(), theJavaqueryoutputPackage.getBooleanInterimResultParam(), null, "argument", null, 1, 1, BooleanFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneArgFunctionFilterPartEClass, OneArgFunctionFilterPart.class, "OneArgFunctionFilterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOneArgFunctionFilterPart_Combinator(), this.getCombinator(), null, "combinator", null, 1, 1, OneArgFunctionFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneArgFunctionFilterPart_Argument(), theJavaqueryoutputPackage.getValueListInterimResultPart(), null, "argument", null, 1, 1, OneArgFunctionFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOneArgFunctionFilterPart__Apply__String(), ecorePackage.getEBooleanObject(), "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "param1", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listFilterPartEClass, ListFilterPart.class, "ListFilterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListFilterPart_Combinator(), this.getCombinator(), null, "combinator", null, 1, 1, ListFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListFilterPart_Subfilter(), this.getJavaFilterPart(), null, "subfilter", null, 1, 1, ListFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListFilterPart_Argument(), theJavaqueryoutputPackage.getContainerInterimResultPart(), null, "argument", null, 1, 1, ListFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twoArgFunctionFilterPartEClass, TwoArgFunctionFilterPart.class, "TwoArgFunctionFilterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTwoArgFunctionFilterPart_Combinator2(), this.getCombinator(), null, "combinator2", null, 1, 1, TwoArgFunctionFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwoArgFunctionFilterPart_Combinator1(), this.getCombinator(), null, "combinator1", null, 1, 1, TwoArgFunctionFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwoArgFunctionFilterPart_Argument1(), theJavaqueryoutputPackage.getValueListInterimResultPart(), null, "argument1", null, 1, 1, TwoArgFunctionFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwoArgFunctionFilterPart_Argument2(), theJavaqueryoutputPackage.getValueListInterimResultPart(), null, "argument2", null, 1, 1, TwoArgFunctionFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTwoArgFunctionFilterPart__Apply__String_String(), ecorePackage.getEBooleanObject(), "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "param1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "param2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(combinatorEClass, Combinator.class, "Combinator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(everyCombinatorEClass, EveryCombinator.class, "EveryCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anyCombinatorEClass, AnyCombinator.class, "AnyCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noneCombinatorEClass, NoneCombinator.class, "NoneCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(countCombinatorEClass, CountCombinator.class, "CountCombinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountCombinator_Operator(), theOperatorsPackage.getComparisonOperator(), "operator", null, 0, 1, CountCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountCombinator_Number(), ecorePackage.getEDoubleObject(), "number", null, 0, 1, CountCombinator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notFilterPartEClass, NotFilterPart.class, "NotFilterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotFilterPart_Subfilter(), this.getJavaFilterPart(), null, "subfilter", null, 1, 1, NotFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JavaqueryPackageImpl
