/**
 */
package qualitypatternmodel.javaquery.impl;

import java.util.List;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
import qualitypatternmodel.javaquery.BooleanFilterElement;
import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.CountFilterElement;
import qualitypatternmodel.javaquery.CountFilterPart;
import qualitypatternmodel.javaquery.FormulaFilterPart;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.javaquery.JavaqueryFactory;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.ListFilterPart;
import qualitypatternmodel.javaquery.NotFilterPart;
import qualitypatternmodel.javaquery.NumberFilterElement;
import qualitypatternmodel.javaquery.NumberFilterPart;
import qualitypatternmodel.javaquery.NumberValueFilterElement;
import qualitypatternmodel.javaquery.OneArgFunctionFilterPart;
import qualitypatternmodel.javaquery.QuantifierFilterPart;
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
	private EClass numberValueFilterElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifierFilterPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringListWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectListWrapperEDataType = null;

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
	private EClass booleanFilterElementEClass = null;

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
	private EClass notFilterPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countFilterPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberFilterPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countFilterElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberFilterElementEClass = null;

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
	public EReference getJavaFilter_InterimResults() {
		return (EReference)javaFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaFilter_Query() {
		return (EAttribute)javaFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaFilter_Language() {
		return (EAttribute)javaFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaFilter__FilterQueryResults() {
		return javaFilterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaFilter__CreateInterimResultContainer__List() {
		return javaFilterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJavaFilter__ExecuteXQueryJava__String_String() {
		return javaFilterEClass.getEOperations().get(2);
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
	public EOperation getJavaFilterPart__GetArguments() {
		return javaFilterPartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberValueFilterElement() {
		return numberValueFilterElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberValueFilterElement_Number() {
		return (EAttribute)numberValueFilterElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantifierFilterPart() {
		return quantifierFilterPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantifierFilterPart_Subfilter() {
		return (EReference)quantifierFilterPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantifierFilterPart_Argument() {
		return (EReference)quantifierFilterPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantifierFilterPart_Quantifier() {
		return (EAttribute)quantifierFilterPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStringListWrapper() {
		return stringListWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getObjectListWrapper() {
		return objectListWrapperEDataType;
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
	public EAttribute getFormulaFilterPart_Operator() {
		return (EAttribute)formulaFilterPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormulaFilterPart_Argument() {
		return (EReference)formulaFilterPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanFilterElement() {
		return booleanFilterElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanFilterElement_Argument() {
		return (EReference)booleanFilterElementEClass.getEStructuralFeatures().get(0);
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
	public EOperation getBooleanFilterPart__Apply__InterimResult() {
		return booleanFilterPartEClass.getEOperations().get(0);
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
	public EReference getOneArgFunctionFilterPart_Argument() {
		return (EReference)oneArgFunctionFilterPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOneArgFunctionFilterPart_Negate() {
		return (EAttribute)oneArgFunctionFilterPartEClass.getEStructuralFeatures().get(1);
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
	public EReference getListFilterPart_Subfilter() {
		return (EReference)listFilterPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListFilterPart_Argument() {
		return (EReference)listFilterPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListFilterPart_Quantifier() {
		return (EAttribute)listFilterPartEClass.getEStructuralFeatures().get(2);
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
	public EReference getTwoArgFunctionFilterPart_Argument1() {
		return (EReference)twoArgFunctionFilterPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTwoArgFunctionFilterPart_Argument2() {
		return (EReference)twoArgFunctionFilterPartEClass.getEStructuralFeatures().get(1);
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
	public EClass getCountFilterPart() {
		return countFilterPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountFilterPart_Subfilter1() {
		return (EReference)countFilterPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountFilterPart_Subfilter2() {
		return (EReference)countFilterPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCountFilterPart_Operator() {
		return (EAttribute)countFilterPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountFilterPart_Argument() {
		return (EReference)countFilterPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberFilterPart() {
		return numberFilterPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNumberFilterPart__Apply__InterimResult() {
		return numberFilterPartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountFilterElement() {
		return countFilterElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountFilterElement_Subfilter() {
		return (EReference)countFilterElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountFilterElement_Argument() {
		return (EReference)countFilterElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberFilterElement() {
		return numberFilterElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumberFilterElement_Argument() {
		return (EReference)numberFilterElementEClass.getEStructuralFeatures().get(0);
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
		createEReference(javaFilterEClass, JAVA_FILTER__INTERIM_RESULTS);
		createEAttribute(javaFilterEClass, JAVA_FILTER__QUERY);
		createEAttribute(javaFilterEClass, JAVA_FILTER__LANGUAGE);
		createEOperation(javaFilterEClass, JAVA_FILTER___FILTER_QUERY_RESULTS);
		createEOperation(javaFilterEClass, JAVA_FILTER___CREATE_INTERIM_RESULT_CONTAINER__LIST);
		createEOperation(javaFilterEClass, JAVA_FILTER___EXECUTE_XQUERY_JAVA__STRING_STRING);

		booleanFilterPartEClass = createEClass(BOOLEAN_FILTER_PART);
		createEOperation(booleanFilterPartEClass, BOOLEAN_FILTER_PART___APPLY__INTERIMRESULT);

		formulaFilterPartEClass = createEClass(FORMULA_FILTER_PART);
		createEReference(formulaFilterPartEClass, FORMULA_FILTER_PART__SUBFILTER1);
		createEReference(formulaFilterPartEClass, FORMULA_FILTER_PART__SUBFILTER2);
		createEAttribute(formulaFilterPartEClass, FORMULA_FILTER_PART__OPERATOR);
		createEReference(formulaFilterPartEClass, FORMULA_FILTER_PART__ARGUMENT);

		booleanFilterElementEClass = createEClass(BOOLEAN_FILTER_ELEMENT);
		createEReference(booleanFilterElementEClass, BOOLEAN_FILTER_ELEMENT__ARGUMENT);

		oneArgFunctionFilterPartEClass = createEClass(ONE_ARG_FUNCTION_FILTER_PART);
		createEReference(oneArgFunctionFilterPartEClass, ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT);
		createEAttribute(oneArgFunctionFilterPartEClass, ONE_ARG_FUNCTION_FILTER_PART__NEGATE);
		createEOperation(oneArgFunctionFilterPartEClass, ONE_ARG_FUNCTION_FILTER_PART___APPLY__STRING);

		listFilterPartEClass = createEClass(LIST_FILTER_PART);
		createEReference(listFilterPartEClass, LIST_FILTER_PART__SUBFILTER);
		createEReference(listFilterPartEClass, LIST_FILTER_PART__ARGUMENT);
		createEAttribute(listFilterPartEClass, LIST_FILTER_PART__QUANTIFIER);

		twoArgFunctionFilterPartEClass = createEClass(TWO_ARG_FUNCTION_FILTER_PART);
		createEReference(twoArgFunctionFilterPartEClass, TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1);
		createEReference(twoArgFunctionFilterPartEClass, TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2);
		createEOperation(twoArgFunctionFilterPartEClass, TWO_ARG_FUNCTION_FILTER_PART___APPLY__STRING_STRING);

		notFilterPartEClass = createEClass(NOT_FILTER_PART);
		createEReference(notFilterPartEClass, NOT_FILTER_PART__SUBFILTER);

		countFilterPartEClass = createEClass(COUNT_FILTER_PART);
		createEReference(countFilterPartEClass, COUNT_FILTER_PART__SUBFILTER1);
		createEReference(countFilterPartEClass, COUNT_FILTER_PART__SUBFILTER2);
		createEAttribute(countFilterPartEClass, COUNT_FILTER_PART__OPERATOR);
		createEReference(countFilterPartEClass, COUNT_FILTER_PART__ARGUMENT);

		numberFilterPartEClass = createEClass(NUMBER_FILTER_PART);
		createEOperation(numberFilterPartEClass, NUMBER_FILTER_PART___APPLY__INTERIMRESULT);

		countFilterElementEClass = createEClass(COUNT_FILTER_ELEMENT);
		createEReference(countFilterElementEClass, COUNT_FILTER_ELEMENT__SUBFILTER);
		createEReference(countFilterElementEClass, COUNT_FILTER_ELEMENT__ARGUMENT);

		numberFilterElementEClass = createEClass(NUMBER_FILTER_ELEMENT);
		createEReference(numberFilterElementEClass, NUMBER_FILTER_ELEMENT__ARGUMENT);

		javaFilterPartEClass = createEClass(JAVA_FILTER_PART);
		createEOperation(javaFilterPartEClass, JAVA_FILTER_PART___GET_ARGUMENTS);

		numberValueFilterElementEClass = createEClass(NUMBER_VALUE_FILTER_ELEMENT);
		createEAttribute(numberValueFilterElementEClass, NUMBER_VALUE_FILTER_ELEMENT__NUMBER);

		quantifierFilterPartEClass = createEClass(QUANTIFIER_FILTER_PART);
		createEReference(quantifierFilterPartEClass, QUANTIFIER_FILTER_PART__SUBFILTER);
		createEReference(quantifierFilterPartEClass, QUANTIFIER_FILTER_PART__ARGUMENT);
		createEAttribute(quantifierFilterPartEClass, QUANTIFIER_FILTER_PART__QUANTIFIER);

		// Create data types
		stringListWrapperEDataType = createEDataType(STRING_LIST_WRAPPER);
		objectListWrapperEDataType = createEDataType(OBJECT_LIST_WRAPPER);
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
		booleanFilterPartEClass.getESuperTypes().add(this.getJavaFilterPart());
		formulaFilterPartEClass.getESuperTypes().add(this.getBooleanFilterPart());
		booleanFilterElementEClass.getESuperTypes().add(this.getBooleanFilterPart());
		oneArgFunctionFilterPartEClass.getESuperTypes().add(this.getBooleanFilterPart());
		listFilterPartEClass.getESuperTypes().add(this.getBooleanFilterPart());
		twoArgFunctionFilterPartEClass.getESuperTypes().add(this.getBooleanFilterPart());
		notFilterPartEClass.getESuperTypes().add(this.getBooleanFilterPart());
		countFilterPartEClass.getESuperTypes().add(this.getBooleanFilterPart());
		numberFilterPartEClass.getESuperTypes().add(this.getJavaFilterPart());
		countFilterElementEClass.getESuperTypes().add(this.getNumberFilterPart());
		numberFilterElementEClass.getESuperTypes().add(this.getNumberFilterPart());
		numberValueFilterElementEClass.getESuperTypes().add(this.getNumberFilterPart());
		quantifierFilterPartEClass.getESuperTypes().add(this.getBooleanFilterPart());

		// Initialize classes, features, and operations; add parameters
		initEClass(javaFilterEClass, JavaFilter.class, "JavaFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaFilter_Filter(), this.getBooleanFilterPart(), null, "filter", null, 0, 1, JavaFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaFilter_Structure(), theJavaqueryoutputPackage.getInterimResultStructure(), null, "structure", null, 1, 1, JavaFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaFilter_InterimResults(), theJavaqueryoutputPackage.getInterimResultContainer(), null, "interimResults", null, 0, -1, JavaFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaFilter_Query(), ecorePackage.getEString(), "query", null, 0, 1, JavaFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaFilter_Language(), thePatternstructurePackage.getLanguage(), "language", null, 0, 1, JavaFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getJavaFilter__FilterQueryResults(), ecorePackage.getEString(), "filterQueryResults", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getJavaFilter__CreateInterimResultContainer__List(), null, "createInterimResultContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObjectListWrapper(), "objectList", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getJavaFilter__ExecuteXQueryJava__String_String(), this.getStringListWrapper(), "executeXQueryJava", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "databasename", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "datapath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(booleanFilterPartEClass, BooleanFilterPart.class, "BooleanFilterPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBooleanFilterPart__Apply__InterimResult(), ecorePackage.getEBooleanObject(), "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaqueryoutputPackage.getInterimResult(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(formulaFilterPartEClass, FormulaFilterPart.class, "FormulaFilterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormulaFilterPart_Subfilter1(), this.getBooleanFilterPart(), null, "subfilter1", null, 1, 1, FormulaFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormulaFilterPart_Subfilter2(), this.getBooleanFilterPart(), null, "subfilter2", null, 1, 1, FormulaFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormulaFilterPart_Operator(), thePatternstructurePackage.getLogicalOperator(), "operator", null, 0, 1, FormulaFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormulaFilterPart_Argument(), theJavaqueryoutputPackage.getFixedContainerInterim(), null, "argument", null, 1, 1, FormulaFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanFilterElementEClass, BooleanFilterElement.class, "BooleanFilterElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanFilterElement_Argument(), theJavaqueryoutputPackage.getFixedContainerInterim(), null, "argument", null, 1, 1, BooleanFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneArgFunctionFilterPartEClass, OneArgFunctionFilterPart.class, "OneArgFunctionFilterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOneArgFunctionFilterPart_Argument(), theJavaqueryoutputPackage.getValueInterim(), null, "argument", null, 1, 1, OneArgFunctionFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOneArgFunctionFilterPart_Negate(), ecorePackage.getEBoolean(), "negate", null, 0, 1, OneArgFunctionFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOneArgFunctionFilterPart__Apply__String(), ecorePackage.getEBooleanObject(), "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "param1", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listFilterPartEClass, ListFilterPart.class, "ListFilterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListFilterPart_Subfilter(), this.getBooleanFilterPart(), null, "subfilter", null, 1, 1, ListFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListFilterPart_Argument(), theJavaqueryoutputPackage.getVariableContainerInterim(), null, "argument", null, 1, 1, ListFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListFilterPart_Quantifier(), thePatternstructurePackage.getQuantifier(), "quantifier", null, 0, 1, ListFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twoArgFunctionFilterPartEClass, TwoArgFunctionFilterPart.class, "TwoArgFunctionFilterPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTwoArgFunctionFilterPart_Argument1(), theJavaqueryoutputPackage.getValueInterim(), null, "argument1", null, 1, 1, TwoArgFunctionFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTwoArgFunctionFilterPart_Argument2(), theJavaqueryoutputPackage.getValueInterim(), null, "argument2", null, 1, 1, TwoArgFunctionFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTwoArgFunctionFilterPart__Apply__String_String(), ecorePackage.getEBooleanObject(), "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "param1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "param2", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(notFilterPartEClass, NotFilterPart.class, "NotFilterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotFilterPart_Subfilter(), this.getBooleanFilterPart(), null, "subfilter", null, 1, 1, NotFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countFilterPartEClass, CountFilterPart.class, "CountFilterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountFilterPart_Subfilter1(), this.getNumberFilterPart(), null, "subfilter1", null, 1, 1, CountFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountFilterPart_Subfilter2(), this.getNumberFilterPart(), null, "subfilter2", null, 1, 1, CountFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountFilterPart_Operator(), theOperatorsPackage.getComparisonOperator(), "operator", null, 0, 1, CountFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountFilterPart_Argument(), theJavaqueryoutputPackage.getFixedContainerInterim(), null, "argument", null, 1, 1, CountFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberFilterPartEClass, NumberFilterPart.class, "NumberFilterPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getNumberFilterPart__Apply__InterimResult(), ecorePackage.getEDoubleObject(), "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJavaqueryoutputPackage.getInterimResult(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(countFilterElementEClass, CountFilterElement.class, "CountFilterElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountFilterElement_Subfilter(), this.getBooleanFilterPart(), null, "subfilter", null, 1, 1, CountFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountFilterElement_Argument(), theJavaqueryoutputPackage.getVariableContainerInterim(), null, "argument", null, 1, 1, CountFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberFilterElementEClass, NumberFilterElement.class, "NumberFilterElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumberFilterElement_Argument(), theJavaqueryoutputPackage.getValueInterim(), null, "argument", null, 1, 1, NumberFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaFilterPartEClass, JavaFilterPart.class, "JavaFilterPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getJavaFilterPart__GetArguments(), theJavaqueryoutputPackage.getInterimResultPart(), "getArguments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(numberValueFilterElementEClass, NumberValueFilterElement.class, "NumberValueFilterElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberValueFilterElement_Number(), ecorePackage.getEDoubleObject(), "number", null, 0, 1, NumberValueFilterElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifierFilterPartEClass, QuantifierFilterPart.class, "QuantifierFilterPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantifierFilterPart_Subfilter(), this.getBooleanFilterPart(), null, "subfilter", null, 1, -1, QuantifierFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifierFilterPart_Argument(), theJavaqueryoutputPackage.getFixedContainerInterim(), null, "argument", null, 1, 1, QuantifierFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantifierFilterPart_Quantifier(), thePatternstructurePackage.getQuantifier(), "quantifier", null, 0, 1, QuantifierFilterPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(stringListWrapperEDataType, List.class, "StringListWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<String>");
		initEDataType(objectListWrapperEDataType, List.class, "ObjectListWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<Object>");

		// Create resource
		createResource(eNS_URI);
	}

} //JavaqueryPackageImpl
