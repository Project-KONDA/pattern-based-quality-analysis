/**
 */
package qualitypatternmodel.textrepresentation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.json.JSONArray;
import org.json.JSONObject;
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
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl;
import qualitypatternmodel.operators.OperatorsPackage;

import qualitypatternmodel.operators.impl.OperatorsPackageImpl;
import qualitypatternmodel.parameters.ParametersPackage;

import qualitypatternmodel.parameters.impl.ParametersPackageImpl;

import qualitypatternmodel.patternstructure.PatternstructurePackage;

import qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl;

import qualitypatternmodel.textrepresentation.Fragment;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;
import qualitypatternmodel.textrepresentation.ParameterReference;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextFragment;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;
import qualitypatternmodel.textrepresentation.ValueMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextrepresentationPackageImpl extends EPackageImpl implements TextrepresentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterPredefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonObjectWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonArrayWrapperEDataType = null;

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
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TextrepresentationPackageImpl() {
		super(eNS_URI, TextrepresentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TextrepresentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TextrepresentationPackage init() {
		if (isInited) return (TextrepresentationPackage)EPackage.Registry.INSTANCE.getEPackage(TextrepresentationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTextrepresentationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TextrepresentationPackageImpl theTextrepresentationPackage = registeredTextrepresentationPackage instanceof TextrepresentationPackageImpl ? (TextrepresentationPackageImpl)registeredTextrepresentationPackage : new TextrepresentationPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdaptionrdfPackage.eNS_URI);
		AdaptionrdfPackageImpl theAdaptionrdfPackage = (AdaptionrdfPackageImpl)(registeredPackage instanceof AdaptionrdfPackageImpl ? registeredPackage : AdaptionrdfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Adaptionneo4jPackage.eNS_URI);
		Adaptionneo4jPackageImpl theAdaptionneo4jPackage = (Adaptionneo4jPackageImpl)(registeredPackage instanceof Adaptionneo4jPackageImpl ? registeredPackage : Adaptionneo4jPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaoperatorsPackage.eNS_URI);
		JavaoperatorsPackageImpl theJavaoperatorsPackage = (JavaoperatorsPackageImpl)(registeredPackage instanceof JavaoperatorsPackageImpl ? registeredPackage : JavaoperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaqueryPackage.eNS_URI);
		JavaqueryPackageImpl theJavaqueryPackage = (JavaqueryPackageImpl)(registeredPackage instanceof JavaqueryPackageImpl ? registeredPackage : JavaqueryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaqueryoutputPackage.eNS_URI);
		JavaqueryoutputPackageImpl theJavaqueryoutputPackage = (JavaqueryoutputPackageImpl)(registeredPackage instanceof JavaqueryoutputPackageImpl ? registeredPackage : JavaqueryoutputPackage.eINSTANCE);

		// Create package meta-data objects
		theTextrepresentationPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theAdaptionrdfPackage.createPackageContents();
		theAdaptionneo4jPackage.createPackageContents();
		theJavaoperatorsPackage.createPackageContents();
		theJavaqueryPackage.createPackageContents();
		theJavaqueryoutputPackage.createPackageContents();

		// Initialize created meta-data
		theTextrepresentationPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theAdaptionrdfPackage.initializePackageContents();
		theAdaptionneo4jPackage.initializePackageContents();
		theJavaoperatorsPackage.initializePackageContents();
		theJavaqueryPackage.initializePackageContents();
		theJavaqueryoutputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTextrepresentationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TextrepresentationPackage.eNS_URI, theTextrepresentationPackage);
		return theTextrepresentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatternText() {
		return patternTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatternText_Pattern() {
		return (EReference)patternTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatternText_Fragments() {
		return (EReference)patternTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatternText_Name() {
		return (EAttribute)patternTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatternText_ParameterPredefinitions() {
		return (EReference)patternTextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatternText_FragmentsOrdered() {
		return (EReference)patternTextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternText__GenerateJSON() {
		return patternTextEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternText__IsValid__AbstractionLevel() {
		return patternTextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternText__Instantiate() {
		return patternTextEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternText__GenerateSparqlTemplate() {
		return patternTextEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternText__GenerateJSONObject() {
		return patternTextEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternText__GenerateVariantJSONObject() {
		return patternTextEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternText__Delete() {
		return patternTextEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternText__GetPreview() {
		return patternTextEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternText__AddFragment__Fragment() {
		return patternTextEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterFragment() {
		return parameterFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterFragment_ExampleValue() {
		return (EAttribute)parameterFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterFragment_Name() {
		return (EAttribute)parameterFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterFragment_ValueMap() {
		return (EReference)parameterFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterFragment_Id() {
		return (EAttribute)parameterFragmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterFragment_UserValue() {
		return (EAttribute)parameterFragmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterFragment_Description() {
		return (EAttribute)parameterFragmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterFragment_Plural() {
		return (EAttribute)parameterFragmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterFragment_AttributeMap() {
		return (EReference)parameterFragmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterFragment__GetType() {
		return parameterFragmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterFragment__GetRole() {
		return parameterFragmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterFragment__SetValue__String() {
		return parameterFragmentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterFragment__GetValue() {
		return parameterFragmentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterFragment__SetDefaultValueMap__String() {
		return parameterFragmentEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterFragment__SetAttributeValue__String_String() {
		return parameterFragmentEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterFragment__GetAttributeValue__String() {
		return parameterFragmentEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterFragment__ClearValue() {
		return parameterFragmentEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFragment() {
		return fragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFragment_PatternText() {
		return (EReference)fragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFragment__GenerateJSON() {
		return fragmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFragment__GetPreview() {
		return fragmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFragment__GenerateSparqlTemplate() {
		return fragmentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFragment__GenerateJSONObject() {
		return fragmentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFragment__GenerateVariantJSONObject() {
		return fragmentEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextFragment() {
		return textFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextFragment_Text() {
		return (EAttribute)textFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterPredefinition() {
		return parameterPredefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterPredefinition_Value() {
		return (EAttribute)parameterPredefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterReference() {
		return parameterReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterReference_Parameter() {
		return (EReference)parameterReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterReference__IsValid__AbstractionLevel() {
		return parameterReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getParameterReference__GenerateVariantJSONObject() {
		return parameterReferenceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueMap() {
		return valueMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueMap_Keys() {
		return (EAttribute)valueMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueMap_Values() {
		return (EAttribute)valueMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValueMap__Put__String_String() {
		return valueMapEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValueMap__GetValuesAsJsonArray() {
		return valueMapEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValueMap__Get__String() {
		return valueMapEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValueMap__GetKey__String() {
		return valueMapEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValueMap__AddAll__Map() {
		return valueMapEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValueMap__GenerateVariantJSONObject() {
		return valueMapEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getValueMap__Clear() {
		return valueMapEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getObjectWrapper() {
		return objectWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJSONObjectWrapper() {
		return jsonObjectWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getJSONArrayWrapper() {
		return jsonArrayWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextrepresentationFactory getTextrepresentationFactory() {
		return (TextrepresentationFactory)getEFactoryInstance();
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
		patternTextEClass = createEClass(PATTERN_TEXT);
		createEReference(patternTextEClass, PATTERN_TEXT__PATTERN);
		createEReference(patternTextEClass, PATTERN_TEXT__FRAGMENTS);
		createEAttribute(patternTextEClass, PATTERN_TEXT__NAME);
		createEReference(patternTextEClass, PATTERN_TEXT__PARAMETER_PREDEFINITIONS);
		createEReference(patternTextEClass, PATTERN_TEXT__FRAGMENTS_ORDERED);
		createEOperation(patternTextEClass, PATTERN_TEXT___IS_VALID__ABSTRACTIONLEVEL);
		createEOperation(patternTextEClass, PATTERN_TEXT___ADD_FRAGMENT__FRAGMENT);
		createEOperation(patternTextEClass, PATTERN_TEXT___GENERATE_JSON);
		createEOperation(patternTextEClass, PATTERN_TEXT___GET_PREVIEW);
		createEOperation(patternTextEClass, PATTERN_TEXT___DELETE);
		createEOperation(patternTextEClass, PATTERN_TEXT___INSTANTIATE);
		createEOperation(patternTextEClass, PATTERN_TEXT___GENERATE_SPARQL_TEMPLATE);
		createEOperation(patternTextEClass, PATTERN_TEXT___GENERATE_JSON_OBJECT);
		createEOperation(patternTextEClass, PATTERN_TEXT___GENERATE_VARIANT_JSON_OBJECT);

		parameterFragmentEClass = createEClass(PARAMETER_FRAGMENT);
		createEAttribute(parameterFragmentEClass, PARAMETER_FRAGMENT__EXAMPLE_VALUE);
		createEAttribute(parameterFragmentEClass, PARAMETER_FRAGMENT__NAME);
		createEReference(parameterFragmentEClass, PARAMETER_FRAGMENT__VALUE_MAP);
		createEAttribute(parameterFragmentEClass, PARAMETER_FRAGMENT__ID);
		createEAttribute(parameterFragmentEClass, PARAMETER_FRAGMENT__USER_VALUE);
		createEAttribute(parameterFragmentEClass, PARAMETER_FRAGMENT__DESCRIPTION);
		createEAttribute(parameterFragmentEClass, PARAMETER_FRAGMENT__PLURAL);
		createEReference(parameterFragmentEClass, PARAMETER_FRAGMENT__ATTRIBUTE_MAP);
		createEOperation(parameterFragmentEClass, PARAMETER_FRAGMENT___GET_TYPE);
		createEOperation(parameterFragmentEClass, PARAMETER_FRAGMENT___GET_ROLE);
		createEOperation(parameterFragmentEClass, PARAMETER_FRAGMENT___SET_VALUE__STRING);
		createEOperation(parameterFragmentEClass, PARAMETER_FRAGMENT___GET_VALUE);
		createEOperation(parameterFragmentEClass, PARAMETER_FRAGMENT___SET_DEFAULT_VALUE_MAP__STRING);
		createEOperation(parameterFragmentEClass, PARAMETER_FRAGMENT___SET_ATTRIBUTE_VALUE__STRING_STRING);
		createEOperation(parameterFragmentEClass, PARAMETER_FRAGMENT___GET_ATTRIBUTE_VALUE__STRING);
		createEOperation(parameterFragmentEClass, PARAMETER_FRAGMENT___CLEAR_VALUE);

		fragmentEClass = createEClass(FRAGMENT);
		createEReference(fragmentEClass, FRAGMENT__PATTERN_TEXT);
		createEOperation(fragmentEClass, FRAGMENT___GENERATE_JSON);
		createEOperation(fragmentEClass, FRAGMENT___GET_PREVIEW);
		createEOperation(fragmentEClass, FRAGMENT___GENERATE_SPARQL_TEMPLATE);
		createEOperation(fragmentEClass, FRAGMENT___GENERATE_JSON_OBJECT);
		createEOperation(fragmentEClass, FRAGMENT___GENERATE_VARIANT_JSON_OBJECT);

		textFragmentEClass = createEClass(TEXT_FRAGMENT);
		createEAttribute(textFragmentEClass, TEXT_FRAGMENT__TEXT);

		parameterPredefinitionEClass = createEClass(PARAMETER_PREDEFINITION);
		createEAttribute(parameterPredefinitionEClass, PARAMETER_PREDEFINITION__VALUE);

		parameterReferenceEClass = createEClass(PARAMETER_REFERENCE);
		createEReference(parameterReferenceEClass, PARAMETER_REFERENCE__PARAMETER);
		createEOperation(parameterReferenceEClass, PARAMETER_REFERENCE___IS_VALID__ABSTRACTIONLEVEL);
		createEOperation(parameterReferenceEClass, PARAMETER_REFERENCE___GENERATE_VARIANT_JSON_OBJECT);

		valueMapEClass = createEClass(VALUE_MAP);
		createEAttribute(valueMapEClass, VALUE_MAP__KEYS);
		createEAttribute(valueMapEClass, VALUE_MAP__VALUES);
		createEOperation(valueMapEClass, VALUE_MAP___PUT__STRING_STRING);
		createEOperation(valueMapEClass, VALUE_MAP___GET_VALUES_AS_JSON_ARRAY);
		createEOperation(valueMapEClass, VALUE_MAP___GET__STRING);
		createEOperation(valueMapEClass, VALUE_MAP___GET_KEY__STRING);
		createEOperation(valueMapEClass, VALUE_MAP___ADD_ALL__MAP);
		createEOperation(valueMapEClass, VALUE_MAP___GENERATE_VARIANT_JSON_OBJECT);
		createEOperation(valueMapEClass, VALUE_MAP___CLEAR);

		// Create data types
		objectWrapperEDataType = createEDataType(OBJECT_WRAPPER);
		jsonObjectWrapperEDataType = createEDataType(JSON_OBJECT_WRAPPER);
		jsonArrayWrapperEDataType = createEDataType(JSON_ARRAY_WRAPPER);
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
		OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterFragmentEClass.getESuperTypes().add(this.getFragment());
		parameterFragmentEClass.getESuperTypes().add(this.getParameterReference());
		textFragmentEClass.getESuperTypes().add(this.getFragment());
		parameterPredefinitionEClass.getESuperTypes().add(this.getParameterReference());

		// Initialize classes, features, and operations; add parameters
		initEClass(patternTextEClass, PatternText.class, "PatternText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternText_Pattern(), thePatternstructurePackage.getCompletePattern(), thePatternstructurePackage.getCompletePattern_Text(), "pattern", null, 1, 1, PatternText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternText_Fragments(), this.getFragment(), this.getFragment_PatternText(), "fragments", null, 1, -1, PatternText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternText_Name(), ecorePackage.getEString(), "name", null, 0, 1, PatternText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternText_ParameterPredefinitions(), this.getParameterPredefinition(), null, "parameterPredefinitions", null, 0, -1, PatternText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternText_FragmentsOrdered(), this.getFragment(), null, "fragmentsOrdered", null, 1, -1, PatternText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPatternText__IsValid__AbstractionLevel(), null, "isValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getAbstractionLevel(), "abstractionLevel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getPatternText__AddFragment__Fragment(), null, "addFragment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFragment(), "fragment", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPatternText__GenerateJSON(), ecorePackage.getEString(), "generateJSON", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPatternText__GetPreview(), ecorePackage.getEString(), "getPreview", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPatternText__Delete(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternText__Instantiate(), null, "instantiate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getPatternText__GenerateSparqlTemplate(), ecorePackage.getEString(), "generateSparqlTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());
		addEException(op, theOperatorsPackage.getOperatorCycleExceptionWrapper());
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());

		initEOperation(getPatternText__GenerateJSONObject(), this.getJSONObjectWrapper(), "generateJSONObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPatternText__GenerateVariantJSONObject(), this.getJSONObjectWrapper(), "generateVariantJSONObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterFragmentEClass, ParameterFragment.class, "ParameterFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterFragment_ExampleValue(), ecorePackage.getEString(), "exampleValue", null, 0, 1, ParameterFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterFragment_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParameterFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterFragment_ValueMap(), this.getValueMap(), null, "valueMap", null, 0, 1, ParameterFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterFragment_Id(), ecorePackage.getEString(), "id", null, 0, 1, ParameterFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterFragment_UserValue(), ecorePackage.getEString(), "userValue", null, 0, 1, ParameterFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterFragment_Description(), ecorePackage.getEString(), "description", null, 0, 1, ParameterFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterFragment_Plural(), ecorePackage.getEBoolean(), "plural", null, 0, 1, ParameterFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterFragment_AttributeMap(), this.getValueMap(), null, "attributeMap", null, 0, 1, ParameterFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getParameterFragment__GetType(), ecorePackage.getEString(), "getType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameterFragment__GetRole(), ecorePackage.getEString(), "getRole", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterFragment__SetValue__String(), null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getParameterFragment__GetValue(), ecorePackage.getEString(), "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterFragment__SetDefaultValueMap__String(), null, "setDefaultValueMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getParameterFragment__SetAttributeValue__String_String(), ecorePackage.getEBoolean(), "setAttributeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterFragment__GetAttributeValue__String(), ecorePackage.getEString(), "getAttributeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getParameterFragment__ClearValue(), null, "clearValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fragmentEClass, Fragment.class, "Fragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFragment_PatternText(), this.getPatternText(), this.getPatternText_Fragments(), "patternText", null, 1, 1, Fragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFragment__GenerateJSON(), ecorePackage.getEString(), "generateJSON", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFragment__GetPreview(), ecorePackage.getEString(), "getPreview", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFragment__GenerateSparqlTemplate(), ecorePackage.getEString(), "generateSparqlTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getFragment__GenerateJSONObject(), this.getJSONObjectWrapper(), "generateJSONObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFragment__GenerateVariantJSONObject(), this.getJSONObjectWrapper(), "generateVariantJSONObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(textFragmentEClass, TextFragment.class, "TextFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextFragment_Text(), ecorePackage.getEString(), "text", null, 0, 1, TextFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterPredefinitionEClass, ParameterPredefinition.class, "ParameterPredefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterPredefinition_Value(), ecorePackage.getEString(), "value", null, 0, 1, ParameterPredefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterReferenceEClass, ParameterReference.class, "ParameterReference", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterReference_Parameter(), theParametersPackage.getParameter(), theParametersPackage.getParameter_ParameterReferences(), "parameter", null, 1, -1, ParameterReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getParameterReference__IsValid__AbstractionLevel(), null, "isValid", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getAbstractionLevel(), "abstractionLevel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getParameterReference__GenerateVariantJSONObject(), this.getJSONObjectWrapper(), "generateVariantJSONObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueMapEClass, ValueMap.class, "ValueMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueMap_Keys(), ecorePackage.getEString(), "keys", null, 0, -1, ValueMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueMap_Values(), ecorePackage.getEString(), "values", null, 0, -1, ValueMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getValueMap__Put__String_String(), null, "put", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getValueMap__GetValuesAsJsonArray(), this.getJSONArrayWrapper(), "getValuesAsJsonArray", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueMap__Get__String(), ecorePackage.getEString(), "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueMap__GetKey__String(), ecorePackage.getEString(), "getKey", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueMap__AddAll__Map(), null, "addAll", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "collection", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getValueMap__GenerateVariantJSONObject(), this.getJSONObjectWrapper(), "generateVariantJSONObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getValueMap__Clear(), null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(objectWrapperEDataType, Object.class, "ObjectWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jsonObjectWrapperEDataType, JSONObject.class, "JSONObjectWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jsonArrayWrapperEDataType, JSONArray.class, "JSONArrayWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TextrepresentationPackageImpl
