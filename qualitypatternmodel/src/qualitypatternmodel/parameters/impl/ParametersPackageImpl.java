/**
 */
package qualitypatternmodel.parameters.impl;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
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
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.OperatorsPackageImpl;
import qualitypatternmodel.parameters.ListParam;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.KeyValueParam;
import qualitypatternmodel.parameters.MultiListParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.util.ParametersValidator;
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
public class ParametersPackageImpl extends EPackageImpl implements ParametersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonOptionParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textListParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textLiteralParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass untypedParameterValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeOptionParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiListParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringToIntEMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringArrayEDataType = null;

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
	 * @see qualitypatternmodel.parameters.ParametersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ParametersPackageImpl() {
		super(eNS_URI, ParametersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ParametersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ParametersPackage init() {
		if (isInited) return (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredParametersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ParametersPackageImpl theParametersPackage = registeredParametersPackage instanceof ParametersPackageImpl ? (ParametersPackageImpl)registeredParametersPackage : new ParametersPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
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

		// Create package meta-data objects
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theTextrepresentationPackage.createPackageContents();
		theAdaptionrdfPackage.createPackageContents();
		theAdaptionneo4jPackage.createPackageContents();

		// Initialize created meta-data
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theTextrepresentationPackage.initializePackageContents();
		theAdaptionrdfPackage.initializePackageContents();
		theAdaptionneo4jPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theParametersPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return ParametersValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theParametersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ParametersPackage.eNS_URI, theParametersPackage);
		return theParametersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_ParameterList() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Description() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Predefined() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_ParameterReferences() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameter__InputIsValid() {
		return parameterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameter__Validate__DiagnosticChain_Map() {
		return parameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameter__IsUsed() {
		return parameterEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameter__GetValueAsString() {
		return parameterEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameter__SetValueFromString__String() {
		return parameterEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameter__GetOptionsAsStringList() {
		return parameterEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameter__ValidateAgainstSchema() {
		return parameterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameter__CheckComparisonConsistency() {
		return parameterEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameter__ValidateExampleValue__String() {
		return parameterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameter__GenerateDescription() {
		return parameterEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparisonOptionParam() {
		return comparisonOptionParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparisonOptionParam_Options() {
		return (EAttribute)comparisonOptionParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparisonOptionParam_Value() {
		return (EAttribute)comparisonOptionParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparisonOptionParam_Comparisons() {
		return (EReference)comparisonOptionParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparisonOptionParam_CountConditions() {
		return (EReference)comparisonOptionParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparisonOptionParam__SetValueIfValid__ComparisonOperator() {
		return comparisonOptionParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterList() {
		return parameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterList_Parameters() {
		return (EReference)parameterListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterList_Pattern() {
		return (EReference)parameterListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterList__Add__Parameter() {
		return parameterListEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterList__Remove__Parameter() {
		return parameterListEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterList__ValidateAgainstSchema() {
		return parameterListEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanParam() {
		return booleanParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanParam_Value() {
		return (EAttribute)booleanParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanParam_Matches() {
		return (EReference)booleanParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanParam_Contains() {
		return (EReference)booleanParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanParam_NullCheck() {
		return (EReference)booleanParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanParam__SetValueIfValid__Boolean() {
		return booleanParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextListParam() {
		return textListParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextLiteralParam() {
		return textLiteralParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextLiteralParam_Value() {
		return (EAttribute)textLiteralParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextLiteralParam_Matches() {
		return (EReference)textLiteralParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextLiteralParam_XmlPropertyOptionParam() {
		return (EReference)textLiteralParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextLiteralParam_XmlAxisPair() {
		return (EReference)textLiteralParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextLiteralParam_Contains() {
		return (EReference)textLiteralParamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTextLiteralParam__SetValueIfValid__String() {
		return textLiteralParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberParam() {
		return numberParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberParam_Value() {
		return (EAttribute)numberParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumberParam_NumberArgument() {
		return (EReference)numberParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNumberParam__SetValueIfValid__Double() {
		return numberParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterValue() {
		return parameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterValue_TypeModifiable() {
		return (EAttribute)parameterValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterValue__IsInTagComparison() {
		return parameterValueEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterValue__IsInAttributeComparison() {
		return parameterValueEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterValue__IsInDataComparison() {
		return parameterValueEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterValue__GetElementTags() {
		return parameterValueEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterValue__GetAttributeNames() {
		return parameterValueEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterValue__GetDataValues() {
		return parameterValueEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterValue__GetAttributeValues() {
		return parameterValueEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterValue__GetSuggestions() {
		return parameterValueEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterValue__InferSuggestions() {
		return parameterValueEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterValue__Replace__ParameterValue() {
		return parameterValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterValue__ReplaceViaValue__String_String() {
		return parameterValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateParam() {
		return dateParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateParam_Value() {
		return (EAttribute)dateParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDateParam__SetValueIfValid__String() {
		return dateParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeParam() {
		return timeParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeParam_Value() {
		return (EAttribute)timeParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimeParam__SetValueIfValid__String() {
		return timeParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUntypedParameterValue() {
		return untypedParameterValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUntypedParameterValue__SetValue__String() {
		return untypedParameterValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTimeParam() {
		return dateTimeParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTimeParam_Value() {
		return (EAttribute)dateTimeParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDateTimeParam__SetValueIfValid__String() {
		return dateTimeParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeOptionParam() {
		return typeOptionParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeOptionParam_Options() {
		return (EAttribute)typeOptionParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeOptionParam_Value() {
		return (EAttribute)typeOptionParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeOptionParam_TypeComparisons() {
		return (EReference)typeOptionParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKeyValueParam() {
		return keyValueParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKeyValueParam_KeyValuePair() {
		return (EAttribute)keyValueParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getKeyValueParam__AddValue__String_String() {
		return keyValueParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getKeyValueParam__SetNewMap__Map() {
		return keyValueParamEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListParam() {
		return listParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getListParam_Values() {
		return (EAttribute)listParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getListParam__SetValueIfValid__EList() {
		return listParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getListParam__GetListVar() {
		return listParamEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getListParam__GetListDeclaration() {
		return listParamEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getListParam__AddStringValue__String() {
		return listParamEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiListParam() {
		return multiListParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStringToIntEMap() {
		return stringToIntEMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStringArray() {
		return stringArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParametersFactory getParametersFactory() {
		return (ParametersFactory)getEFactoryInstance();
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
		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__PARAMETER_LIST);
		createEAttribute(parameterEClass, PARAMETER__PREDEFINED);
		createEReference(parameterEClass, PARAMETER__PARAMETER_REFERENCES);
		createEAttribute(parameterEClass, PARAMETER__DESCRIPTION);
		createEOperation(parameterEClass, PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(parameterEClass, PARAMETER___VALIDATE_AGAINST_SCHEMA);
		createEOperation(parameterEClass, PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING);
		createEOperation(parameterEClass, PARAMETER___INPUT_IS_VALID);
		createEOperation(parameterEClass, PARAMETER___IS_USED);
		createEOperation(parameterEClass, PARAMETER___SET_VALUE_FROM_STRING__STRING);
		createEOperation(parameterEClass, PARAMETER___GET_VALUE_AS_STRING);
		createEOperation(parameterEClass, PARAMETER___CHECK_COMPARISON_CONSISTENCY);
		createEOperation(parameterEClass, PARAMETER___GET_OPTIONS_AS_STRING_LIST);
		createEOperation(parameterEClass, PARAMETER___GENERATE_DESCRIPTION);

		comparisonOptionParamEClass = createEClass(COMPARISON_OPTION_PARAM);
		createEAttribute(comparisonOptionParamEClass, COMPARISON_OPTION_PARAM__OPTIONS);
		createEAttribute(comparisonOptionParamEClass, COMPARISON_OPTION_PARAM__VALUE);
		createEReference(comparisonOptionParamEClass, COMPARISON_OPTION_PARAM__COMPARISONS);
		createEReference(comparisonOptionParamEClass, COMPARISON_OPTION_PARAM__COUNT_CONDITIONS);
		createEOperation(comparisonOptionParamEClass, COMPARISON_OPTION_PARAM___SET_VALUE_IF_VALID__COMPARISONOPERATOR);

		parameterListEClass = createEClass(PARAMETER_LIST);
		createEReference(parameterListEClass, PARAMETER_LIST__PARAMETERS);
		createEReference(parameterListEClass, PARAMETER_LIST__PATTERN);
		createEOperation(parameterListEClass, PARAMETER_LIST___VALIDATE_AGAINST_SCHEMA);
		createEOperation(parameterListEClass, PARAMETER_LIST___ADD__PARAMETER);
		createEOperation(parameterListEClass, PARAMETER_LIST___REMOVE__PARAMETER);

		booleanParamEClass = createEClass(BOOLEAN_PARAM);
		createEAttribute(booleanParamEClass, BOOLEAN_PARAM__VALUE);
		createEReference(booleanParamEClass, BOOLEAN_PARAM__MATCHES);
		createEReference(booleanParamEClass, BOOLEAN_PARAM__CONTAINS);
		createEReference(booleanParamEClass, BOOLEAN_PARAM__NULL_CHECK);
		createEOperation(booleanParamEClass, BOOLEAN_PARAM___SET_VALUE_IF_VALID__BOOLEAN);

		textListParamEClass = createEClass(TEXT_LIST_PARAM);

		textLiteralParamEClass = createEClass(TEXT_LITERAL_PARAM);
		createEAttribute(textLiteralParamEClass, TEXT_LITERAL_PARAM__VALUE);
		createEReference(textLiteralParamEClass, TEXT_LITERAL_PARAM__MATCHES);
		createEReference(textLiteralParamEClass, TEXT_LITERAL_PARAM__XML_PROPERTY_OPTION_PARAM);
		createEReference(textLiteralParamEClass, TEXT_LITERAL_PARAM__XML_AXIS_PAIR);
		createEReference(textLiteralParamEClass, TEXT_LITERAL_PARAM__CONTAINS);
		createEOperation(textLiteralParamEClass, TEXT_LITERAL_PARAM___SET_VALUE_IF_VALID__STRING);

		numberParamEClass = createEClass(NUMBER_PARAM);
		createEAttribute(numberParamEClass, NUMBER_PARAM__VALUE);
		createEReference(numberParamEClass, NUMBER_PARAM__NUMBER_ARGUMENT);
		createEOperation(numberParamEClass, NUMBER_PARAM___SET_VALUE_IF_VALID__DOUBLE);

		parameterValueEClass = createEClass(PARAMETER_VALUE);
		createEAttribute(parameterValueEClass, PARAMETER_VALUE__TYPE_MODIFIABLE);
		createEOperation(parameterValueEClass, PARAMETER_VALUE___REPLACE__PARAMETERVALUE);
		createEOperation(parameterValueEClass, PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING);
		createEOperation(parameterValueEClass, PARAMETER_VALUE___GET_ELEMENT_TAGS);
		createEOperation(parameterValueEClass, PARAMETER_VALUE___GET_DATA_VALUES);
		createEOperation(parameterValueEClass, PARAMETER_VALUE___IS_IN_DATA_COMPARISON);
		createEOperation(parameterValueEClass, PARAMETER_VALUE___IS_IN_TAG_COMPARISON);
		createEOperation(parameterValueEClass, PARAMETER_VALUE___GET_ATTRIBUTE_NAMES);
		createEOperation(parameterValueEClass, PARAMETER_VALUE___GET_ATTRIBUTE_VALUES);
		createEOperation(parameterValueEClass, PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON);
		createEOperation(parameterValueEClass, PARAMETER_VALUE___GET_SUGGESTIONS);
		createEOperation(parameterValueEClass, PARAMETER_VALUE___INFER_SUGGESTIONS);

		dateParamEClass = createEClass(DATE_PARAM);
		createEAttribute(dateParamEClass, DATE_PARAM__VALUE);
		createEOperation(dateParamEClass, DATE_PARAM___SET_VALUE_IF_VALID__STRING);

		timeParamEClass = createEClass(TIME_PARAM);
		createEAttribute(timeParamEClass, TIME_PARAM__VALUE);
		createEOperation(timeParamEClass, TIME_PARAM___SET_VALUE_IF_VALID__STRING);

		untypedParameterValueEClass = createEClass(UNTYPED_PARAMETER_VALUE);
		createEOperation(untypedParameterValueEClass, UNTYPED_PARAMETER_VALUE___SET_VALUE__STRING);

		dateTimeParamEClass = createEClass(DATE_TIME_PARAM);
		createEAttribute(dateTimeParamEClass, DATE_TIME_PARAM__VALUE);
		createEOperation(dateTimeParamEClass, DATE_TIME_PARAM___SET_VALUE_IF_VALID__STRING);

		typeOptionParamEClass = createEClass(TYPE_OPTION_PARAM);
		createEAttribute(typeOptionParamEClass, TYPE_OPTION_PARAM__OPTIONS);
		createEAttribute(typeOptionParamEClass, TYPE_OPTION_PARAM__VALUE);
		createEReference(typeOptionParamEClass, TYPE_OPTION_PARAM__TYPE_COMPARISONS);

		keyValueParamEClass = createEClass(KEY_VALUE_PARAM);
		createEAttribute(keyValueParamEClass, KEY_VALUE_PARAM__KEY_VALUE_PAIR);
		createEOperation(keyValueParamEClass, KEY_VALUE_PARAM___ADD_VALUE__STRING_STRING);
		createEOperation(keyValueParamEClass, KEY_VALUE_PARAM___SET_NEW_MAP__MAP);

		listParamEClass = createEClass(LIST_PARAM);
		createEAttribute(listParamEClass, LIST_PARAM__VALUES);
		createEOperation(listParamEClass, LIST_PARAM___SET_VALUE_IF_VALID__ELIST);
		createEOperation(listParamEClass, LIST_PARAM___GET_LIST_VAR);
		createEOperation(listParamEClass, LIST_PARAM___GET_LIST_DECLARATION);
		createEOperation(listParamEClass, LIST_PARAM___ADD_STRING_VALUE__STRING);

		multiListParamEClass = createEClass(MULTI_LIST_PARAM);

		// Create data types
		stringToIntEMapEDataType = createEDataType(STRING_TO_INT_EMAP);
		stringArrayEDataType = createEDataType(STRING_ARRAY);
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
		PatternstructurePackage thePatternstructurePackage = (PatternstructurePackage)EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		TextrepresentationPackage theTextrepresentationPackage = (TextrepresentationPackage)EPackage.Registry.INSTANCE.getEPackage(TextrepresentationPackage.eNS_URI);
		OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		AdaptionxmlPackage theAdaptionxmlPackage = (AdaptionxmlPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptionxmlPackage.eNS_URI);
		GraphstructurePackage theGraphstructurePackage = (GraphstructurePackage)EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(stringToIntEMapEDataType, "K");
		addETypeParameter(stringToIntEMapEDataType, "V");

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		comparisonOptionParamEClass.getESuperTypes().add(this.getParameter());
		parameterListEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		booleanParamEClass.getESuperTypes().add(this.getParameterValue());
		textListParamEClass.getESuperTypes().add(this.getListParam());
		textLiteralParamEClass.getESuperTypes().add(this.getParameterValue());
		numberParamEClass.getESuperTypes().add(this.getParameterValue());
		parameterValueEClass.getESuperTypes().add(this.getParameter());
		parameterValueEClass.getESuperTypes().add(theGraphstructurePackage.getComparable());
		dateParamEClass.getESuperTypes().add(this.getParameterValue());
		timeParamEClass.getESuperTypes().add(this.getParameterValue());
		untypedParameterValueEClass.getESuperTypes().add(this.getParameterValue());
		dateTimeParamEClass.getESuperTypes().add(this.getParameterValue());
		typeOptionParamEClass.getESuperTypes().add(this.getParameter());
		keyValueParamEClass.getESuperTypes().add(this.getParameter());
		listParamEClass.getESuperTypes().add(this.getParameterValue());
		multiListParamEClass.getESuperTypes().add(this.getListParam());

		// Initialize classes, features, and operations; add parameters
		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_ParameterList(), this.getParameterList(), this.getParameterList_Parameters(), "parameterList", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Predefined(), ecorePackage.getEBoolean(), "predefined", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_ParameterReferences(), theTextrepresentationPackage.getParameterReference(), theTextrepresentationPackage.getParameterReference_Parameter(), "parameterReferences", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Description(), ecorePackage.getEString(), "description", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getParameter__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameter__ValidateAgainstSchema(), this.getParameter(), "validateAgainstSchema", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__ValidateExampleValue__String(), null, "validateExampleValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "val", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getParameter__InputIsValid(), ecorePackage.getEBoolean(), "inputIsValid", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameter__IsUsed(), ecorePackage.getEBoolean(), "isUsed", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__SetValueFromString__String(), null, "setValueFromString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getParameter__GetValueAsString(), ecorePackage.getEString(), "getValueAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__CheckComparisonConsistency(), null, "checkComparisonConsistency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getParameter__GetOptionsAsStringList(), ecorePackage.getEString(), "getOptionsAsStringList", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameter__GenerateDescription(), ecorePackage.getEString(), "generateDescription", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(comparisonOptionParamEClass, ComparisonOptionParam.class, "ComparisonOptionParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparisonOptionParam_Options(), theOperatorsPackage.getComparisonOperator(), "options", null, 0, -1, ComparisonOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonOptionParam_Value(), theOperatorsPackage.getComparisonOperator(), "value", null, 1, 1, ComparisonOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparisonOptionParam_Comparisons(), theOperatorsPackage.getComparison(), theOperatorsPackage.getComparison_Option(), "comparisons", null, 0, -1, ComparisonOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparisonOptionParam_CountConditions(), thePatternstructurePackage.getCountCondition(), thePatternstructurePackage.getCountCondition_Option(), "countConditions", null, 0, -1, ComparisonOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getComparisonOptionParam__SetValueIfValid__ComparisonOperator(), null, "setValueIfValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatorsPackage.getComparisonOperator(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterList_Parameters(), this.getParameter(), this.getParameter_ParameterList(), "parameters", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterList_Pattern(), thePatternstructurePackage.getCompletePattern(), thePatternstructurePackage.getCompletePattern_ParameterList(), "pattern", null, 1, 1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getParameterList__ValidateAgainstSchema(), this.getParameter(), "validateAgainstSchema", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterList__Add__Parameter(), null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterList__Remove__Parameter(), null, "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameter(), "parameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanParamEClass, BooleanParam.class, "BooleanParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanParam_Value(), ecorePackage.getEBooleanObject(), "value", "true", 1, 1, BooleanParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanParam_Matches(), theOperatorsPackage.getMatch(), theOperatorsPackage.getMatch_Option(), "matches", null, 0, -1, BooleanParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanParam_Contains(), theOperatorsPackage.getContains(), theOperatorsPackage.getContains_Option(), "contains", null, 0, -1, BooleanParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanParam_NullCheck(), theOperatorsPackage.getNullCheck(), theOperatorsPackage.getNullCheck_Option(), "nullCheck", null, 0, 1, BooleanParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBooleanParam__SetValueIfValid__Boolean(), null, "setValueIfValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBooleanObject(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(textListParamEClass, TextListParam.class, "TextListParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textLiteralParamEClass, TextLiteralParam.class, "TextLiteralParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextLiteralParam_Value(), ecorePackage.getEString(), "value", "", 0, 1, TextLiteralParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextLiteralParam_Matches(), theOperatorsPackage.getMatch(), theOperatorsPackage.getMatch_RegularExpression(), "matches", null, 0, -1, TextLiteralParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextLiteralParam_XmlPropertyOptionParam(), theAdaptionxmlPackage.getXmlPropertyOptionParam(), theAdaptionxmlPackage.getXmlPropertyOptionParam_AttributeName(), "xmlPropertyOptionParam", null, 0, 1, TextLiteralParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextLiteralParam_XmlAxisPair(), theAdaptionxmlPackage.getXmlAxisPair(), theAdaptionxmlPackage.getXmlAxisPair_TextLiteralParam(), "xmlAxisPair", null, 0, 1, TextLiteralParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextLiteralParam_Contains(), theOperatorsPackage.getContains(), theOperatorsPackage.getContains_Content(), "contains", null, 0, -1, TextLiteralParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTextLiteralParam__SetValueIfValid__String(), null, "setValueIfValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(numberParamEClass, NumberParam.class, "NumberParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberParam_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, NumberParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumberParam_NumberArgument(), thePatternstructurePackage.getNumberElement(), thePatternstructurePackage.getNumberElement_NumberParam(), "numberArgument", null, 0, 1, NumberParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNumberParam__SetValueIfValid__Double(), null, "setValueIfValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDoubleObject(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(parameterValueEClass, ParameterValue.class, "ParameterValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterValue_TypeModifiable(), ecorePackage.getEBoolean(), "typeModifiable", null, 0, 1, ParameterValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getParameterValue__Replace__ParameterValue(), null, "replace", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getParameterValue(), "concreteValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterValue__ReplaceViaValue__String_String(), null, "replaceViaValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStringArray(), "values", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getParameterValue__GetElementTags(), null, "getElementTags", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getStringToIntEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getParameterValue__GetDataValues(), null, "getDataValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getStringToIntEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getParameterValue__IsInDataComparison(), ecorePackage.getEBoolean(), "isInDataComparison", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameterValue__IsInTagComparison(), ecorePackage.getEBoolean(), "isInTagComparison", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterValue__GetAttributeNames(), null, "getAttributeNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getStringToIntEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getParameterValue__GetAttributeValues(), null, "getAttributeValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getStringToIntEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getParameterValue__IsInAttributeComparison(), ecorePackage.getEBoolean(), "isInAttributeComparison", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameterValue__GetSuggestions(), ecorePackage.getEString(), "getSuggestions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameterValue__InferSuggestions(), ecorePackage.getEString(), "inferSuggestions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(dateParamEClass, DateParam.class, "DateParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateParam_Value(), ecorePackage.getEString(), "value", "", 0, 1, DateParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDateParam__SetValueIfValid__String(), null, "setValueIfValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(timeParamEClass, TimeParam.class, "TimeParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeParam_Value(), ecorePackage.getEString(), "value", "", 0, 1, TimeParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTimeParam__SetValueIfValid__String(), null, "setValueIfValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(untypedParameterValueEClass, UntypedParameterValue.class, "UntypedParameterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getUntypedParameterValue__SetValue__String(), null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "val", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dateTimeParamEClass, DateTimeParam.class, "DateTimeParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeParam_Value(), ecorePackage.getEString(), "value", "", 0, 1, DateTimeParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDateTimeParam__SetValueIfValid__String(), null, "setValueIfValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(typeOptionParamEClass, TypeOptionParam.class, "TypeOptionParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeOptionParam_Options(), theGraphstructurePackage.getReturnType(), "options", null, 0, -1, TypeOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeOptionParam_Value(), theGraphstructurePackage.getReturnType(), "value", null, 1, 1, TypeOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeOptionParam_TypeComparisons(), theOperatorsPackage.getComparison(), theOperatorsPackage.getComparison_TypeOption(), "typeComparisons", null, 0, -1, TypeOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyValueParamEClass, KeyValueParam.class, "KeyValueParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValueParam_KeyValuePair(), ecorePackage.getEMap(), "keyValuePair", null, 0, 1, KeyValueParam.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getKeyValueParam__AddValue__String_String(), null, "addValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getKeyValueParam__SetNewMap__Map(), null, "setNewMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEMap(), "newKeyValueMap", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listParamEClass, ListParam.class, "ListParam", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListParam_Values(), ecorePackage.getEString(), "values", "", 0, -1, ListParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getListParam__SetValueIfValid__EList(), null, "setValueIfValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "newValue", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getListParam__GetListVar(), ecorePackage.getEString(), "getListVar", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getListParam__GetListDeclaration(), ecorePackage.getEString(), "getListDeclaration", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getListParam__AddStringValue__String(), ecorePackage.getEString(), "addStringValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(multiListParamEClass, MultiListParam.class, "MultiListParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(stringToIntEMapEDataType, EMap.class, "StringToIntEMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringArrayEDataType, String[].class, "StringArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //InputfieldsPackageImpl
