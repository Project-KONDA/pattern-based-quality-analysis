/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl;
import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlAxisOptionParam;
import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlNode;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.impl.ExecutionPackageImpl;
import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl;

import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl;
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
public class AdaptionxmlPackageImpl extends EPackageImpl implements AdaptionxmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlElementNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPropertyNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAxisOptionParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPropertyOptionParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPathParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAxisPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xmlPropertyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xmlAxisKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xmlAxisKindArrayEDataType = null;

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
	 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdaptionxmlPackageImpl() {
		super(eNS_URI, AdaptionxmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdaptionxmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdaptionxmlPackage init() {
		if (isInited) return (AdaptionxmlPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptionxmlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdaptionxmlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdaptionxmlPackageImpl theAdaptionxmlPackage = registeredAdaptionxmlPackage instanceof AdaptionxmlPackageImpl ? (AdaptionxmlPackageImpl)registeredAdaptionxmlPackage : new AdaptionxmlPackageImpl();

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

		// Create package meta-data objects
		theAdaptionxmlPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theTextrepresentationPackage.createPackageContents();
		theAdaptionrdfPackage.createPackageContents();
		theAdaptionneo4jPackage.createPackageContents();
		theJavaoperatorsPackage.createPackageContents();

		// Initialize created meta-data
		theAdaptionxmlPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theTextrepresentationPackage.initializePackageContents();
		theAdaptionrdfPackage.initializePackageContents();
		theAdaptionneo4jPackage.initializePackageContents();
		theJavaoperatorsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdaptionxmlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdaptionxmlPackage.eNS_URI, theAdaptionxmlPackage);
		return theAdaptionxmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlElement() {
		return xmlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlElement_XQueryDeepEqual() {
		return (EAttribute)xmlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlElement__GetTagFromComparisons() {
		return xmlElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlElementNavigation() {
		return xmlElementNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlReference() {
		return xmlReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlReference_Type() {
		return (EAttribute)xmlReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlReference_Property() {
		return (EReference)xmlReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlReference__IsTranslatable() {
		return xmlReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlReference__GetSourcePropertyPath() {
		return xmlReferenceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlReference__GetTargetPropertyPath() {
		return xmlReferenceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlProperty() {
		return xmlPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlProperty_References() {
		return (EReference)xmlPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlRoot() {
		return xmlRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlPropertyNavigation() {
		return xmlPropertyNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlAxisOptionParam() {
		return xmlAxisOptionParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlAxisOptionParam_Options() {
		return (EAttribute)xmlAxisOptionParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlAxisOptionParam_Value() {
		return (EAttribute)xmlAxisOptionParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlAxisOptionParam_XmlAxisPart() {
		return (EReference)xmlAxisOptionParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlAxisOptionParam__SetValueIfValid__XmlAxisKind() {
		return xmlAxisOptionParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlAxisOptionParam__InferSuggestions() {
		return xmlAxisOptionParamEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlPropertyOptionParam() {
		return xmlPropertyOptionParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlPropertyOptionParam_Options() {
		return (EAttribute)xmlPropertyOptionParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlPropertyOptionParam_Value() {
		return (EAttribute)xmlPropertyOptionParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlPropertyOptionParam_XmlPathParam() {
		return (EReference)xmlPropertyOptionParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlPropertyOptionParam_AttributeName() {
		return (EReference)xmlPropertyOptionParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlPropertyOptionParam_XmlAxisPart() {
		return (EReference)xmlPropertyOptionParamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlPropertyOptionParam__SetValueIfValid__XmlPropertyKind() {
		return xmlPropertyOptionParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlPathParam() {
		return xmlPathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlPathParam_XmlPropertyOptionParam() {
		return (EReference)xmlPathParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlPathParam_XmlAxisParts() {
		return (EReference)xmlPathParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlPathParam_XmlNavigation() {
		return (EReference)xmlPathParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlPathParam__SetXmlAxis__XmlAxisKind_String() {
		return xmlPathParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlPathParam__AddXmlAxis__XmlAxisKind_String() {
		return xmlPathParamEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlPathParam__SetXmlAxis__XmlAxisKind() {
		return xmlPathParamEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlPathParam__SetXmlAxis__XmlAxisKind_String_1() {
		return xmlPathParamEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlPathParam__SpecifyAxis__XmlAxisKind_XmlPropertyKind_String_String() {
		return xmlPathParamEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlAxisPart() {
		return xmlAxisPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlAxisPart_TextLiteralParam() {
		return (EReference)xmlAxisPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlAxisPart_XmlAxisOptionParam() {
		return (EReference)xmlAxisPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlAxisPart_XmlPathParam() {
		return (EReference)xmlAxisPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlAxisPart_XmlPropertyOption() {
		return (EReference)xmlAxisPartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlAxisPart__GetNextXmlAxisPairs() {
		return xmlAxisPartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlAxisPart__GetPreviousXmlAxisPairs() {
		return xmlAxisPartEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlAxisPart__InferAxisSuggestions() {
		return xmlAxisPartEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlAxisPart__InferElementTagSuggestions() {
		return xmlAxisPartEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlAxisPart__InferElementTagSuggestionsFromIncomingRelations() {
		return xmlAxisPartEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlAxisPart__InferElementTagSuggestionsFromOutgoingRelations() {
		return xmlAxisPartEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlNavigation() {
		return xmlNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlNavigation_XmlPathParam() {
		return (EReference)xmlNavigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlNavigation_SourceVariable() {
		return (EAttribute)xmlNavigationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlNavigation_VariableCounter() {
		return (EAttribute)xmlNavigationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlNode() {
		return xmlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlNode_Variables() {
		return (EAttribute)xmlNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlNode__TranslatePredicates() {
		return xmlNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlNode__GetXQueryRepresentation() {
		return xmlNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlNode__TranslateMultipleIncoming() {
		return xmlNodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getXmlPropertyKind() {
		return xmlPropertyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getXmlAxisKind() {
		return xmlAxisKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getXmlAxisKindArray() {
		return xmlAxisKindArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdaptionxmlFactory getAdaptionxmlFactory() {
		return (AdaptionxmlFactory)getEFactoryInstance();
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
		xmlElementEClass = createEClass(XML_ELEMENT);
		createEAttribute(xmlElementEClass, XML_ELEMENT__XQUERY_DEEP_EQUAL);
		createEOperation(xmlElementEClass, XML_ELEMENT___GET_TAG_FROM_COMPARISONS);

		xmlElementNavigationEClass = createEClass(XML_ELEMENT_NAVIGATION);

		xmlReferenceEClass = createEClass(XML_REFERENCE);
		createEAttribute(xmlReferenceEClass, XML_REFERENCE__TYPE);
		createEReference(xmlReferenceEClass, XML_REFERENCE__PROPERTY);
		createEOperation(xmlReferenceEClass, XML_REFERENCE___IS_TRANSLATABLE);
		createEOperation(xmlReferenceEClass, XML_REFERENCE___GET_SOURCE_PROPERTY_PATH);
		createEOperation(xmlReferenceEClass, XML_REFERENCE___GET_TARGET_PROPERTY_PATH);

		xmlPropertyEClass = createEClass(XML_PROPERTY);
		createEReference(xmlPropertyEClass, XML_PROPERTY__REFERENCES);

		xmlRootEClass = createEClass(XML_ROOT);

		xmlPropertyNavigationEClass = createEClass(XML_PROPERTY_NAVIGATION);

		xmlAxisOptionParamEClass = createEClass(XML_AXIS_OPTION_PARAM);
		createEAttribute(xmlAxisOptionParamEClass, XML_AXIS_OPTION_PARAM__OPTIONS);
		createEAttribute(xmlAxisOptionParamEClass, XML_AXIS_OPTION_PARAM__VALUE);
		createEReference(xmlAxisOptionParamEClass, XML_AXIS_OPTION_PARAM__XML_AXIS_PART);
		createEOperation(xmlAxisOptionParamEClass, XML_AXIS_OPTION_PARAM___SET_VALUE_IF_VALID__XMLAXISKIND);
		createEOperation(xmlAxisOptionParamEClass, XML_AXIS_OPTION_PARAM___INFER_SUGGESTIONS);

		xmlPropertyOptionParamEClass = createEClass(XML_PROPERTY_OPTION_PARAM);
		createEAttribute(xmlPropertyOptionParamEClass, XML_PROPERTY_OPTION_PARAM__OPTIONS);
		createEAttribute(xmlPropertyOptionParamEClass, XML_PROPERTY_OPTION_PARAM__VALUE);
		createEReference(xmlPropertyOptionParamEClass, XML_PROPERTY_OPTION_PARAM__XML_PATH_PARAM);
		createEReference(xmlPropertyOptionParamEClass, XML_PROPERTY_OPTION_PARAM__ATTRIBUTE_NAME);
		createEReference(xmlPropertyOptionParamEClass, XML_PROPERTY_OPTION_PARAM__XML_AXIS_PART);
		createEOperation(xmlPropertyOptionParamEClass, XML_PROPERTY_OPTION_PARAM___SET_VALUE_IF_VALID__XMLPROPERTYKIND);

		xmlPathParamEClass = createEClass(XML_PATH_PARAM);
		createEReference(xmlPathParamEClass, XML_PATH_PARAM__XML_PROPERTY_OPTION_PARAM);
		createEReference(xmlPathParamEClass, XML_PATH_PARAM__XML_AXIS_PARTS);
		createEReference(xmlPathParamEClass, XML_PATH_PARAM__XML_NAVIGATION);
		createEOperation(xmlPathParamEClass, XML_PATH_PARAM___SET_XML_AXIS__XMLAXISKIND_STRING);
		createEOperation(xmlPathParamEClass, XML_PATH_PARAM___ADD_XML_AXIS__XMLAXISKIND_STRING);
		createEOperation(xmlPathParamEClass, XML_PATH_PARAM___SET_XML_AXIS__XMLAXISKIND);
		createEOperation(xmlPathParamEClass, XML_PATH_PARAM___SET_XML_AXIS__XMLAXISKIND_STRING_1);
		createEOperation(xmlPathParamEClass, XML_PATH_PARAM___SPECIFY_AXIS__XMLAXISKIND_XMLPROPERTYKIND_STRING_STRING);

		xmlAxisPartEClass = createEClass(XML_AXIS_PART);
		createEReference(xmlAxisPartEClass, XML_AXIS_PART__TEXT_LITERAL_PARAM);
		createEReference(xmlAxisPartEClass, XML_AXIS_PART__XML_AXIS_OPTION_PARAM);
		createEReference(xmlAxisPartEClass, XML_AXIS_PART__XML_PATH_PARAM);
		createEReference(xmlAxisPartEClass, XML_AXIS_PART__XML_PROPERTY_OPTION);
		createEOperation(xmlAxisPartEClass, XML_AXIS_PART___GET_NEXT_XML_AXIS_PAIRS);
		createEOperation(xmlAxisPartEClass, XML_AXIS_PART___GET_PREVIOUS_XML_AXIS_PAIRS);
		createEOperation(xmlAxisPartEClass, XML_AXIS_PART___INFER_AXIS_SUGGESTIONS);
		createEOperation(xmlAxisPartEClass, XML_AXIS_PART___INFER_ELEMENT_TAG_SUGGESTIONS);
		createEOperation(xmlAxisPartEClass, XML_AXIS_PART___INFER_ELEMENT_TAG_SUGGESTIONS_FROM_INCOMING_RELATIONS);
		createEOperation(xmlAxisPartEClass, XML_AXIS_PART___INFER_ELEMENT_TAG_SUGGESTIONS_FROM_OUTGOING_RELATIONS);

		xmlNavigationEClass = createEClass(XML_NAVIGATION);
		createEReference(xmlNavigationEClass, XML_NAVIGATION__XML_PATH_PARAM);
		createEAttribute(xmlNavigationEClass, XML_NAVIGATION__SOURCE_VARIABLE);
		createEAttribute(xmlNavigationEClass, XML_NAVIGATION__VARIABLE_COUNTER);

		xmlNodeEClass = createEClass(XML_NODE);
		createEAttribute(xmlNodeEClass, XML_NODE__VARIABLES);
		createEOperation(xmlNodeEClass, XML_NODE___TRANSLATE_PREDICATES);
		createEOperation(xmlNodeEClass, XML_NODE___GET_XQUERY_REPRESENTATION);
		createEOperation(xmlNodeEClass, XML_NODE___TRANSLATE_MULTIPLE_INCOMING);

		// Create enums
		xmlPropertyKindEEnum = createEEnum(XML_PROPERTY_KIND);
		xmlAxisKindEEnum = createEEnum(XML_AXIS_KIND);

		// Create data types
		xmlAxisKindArrayEDataType = createEDataType(XML_AXIS_KIND_ARRAY);
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
		GraphstructurePackage theGraphstructurePackage = (GraphstructurePackage)EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);
		PatternstructurePackage thePatternstructurePackage = (PatternstructurePackage)EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xmlElementEClass.getESuperTypes().add(theGraphstructurePackage.getComplexNode());
		xmlElementEClass.getESuperTypes().add(this.getXmlNode());
		xmlElementNavigationEClass.getESuperTypes().add(this.getXmlNavigation());
		xmlReferenceEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());
		xmlPropertyEClass.getESuperTypes().add(theGraphstructurePackage.getPrimitiveNode());
		xmlPropertyEClass.getESuperTypes().add(this.getXmlNode());
		xmlRootEClass.getESuperTypes().add(theGraphstructurePackage.getComplexNode());
		xmlPropertyNavigationEClass.getESuperTypes().add(this.getXmlNavigation());
		xmlAxisOptionParamEClass.getESuperTypes().add(theParametersPackage.getParameter());
		xmlPropertyOptionParamEClass.getESuperTypes().add(theParametersPackage.getParameter());
		xmlPropertyOptionParamEClass.getESuperTypes().add(theGraphstructurePackage.getAdaptable());
		xmlPathParamEClass.getESuperTypes().add(theGraphstructurePackage.getAdaptable());
		xmlPathParamEClass.getESuperTypes().add(theParametersPackage.getParameter());
		xmlAxisPartEClass.getESuperTypes().add(theGraphstructurePackage.getAdaptable());
		xmlAxisPartEClass.getESuperTypes().add(theParametersPackage.getParameter());
		xmlNavigationEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());

		// Initialize classes, features, and operations; add parameters
		initEClass(xmlElementEClass, XmlElement.class, "XmlElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlElement_XQueryDeepEqual(), ecorePackage.getEBoolean(), "xQueryDeepEqual", "true", 0, 1, XmlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getXmlElement__GetTagFromComparisons(), ecorePackage.getEString(), "getTagFromComparisons", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlElementNavigationEClass, XmlElementNavigation.class, "XmlElementNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlReferenceEClass, XmlReference.class, "XmlReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlReference_Type(), theGraphstructurePackage.getReturnType(), "type", null, 0, 1, XmlReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlReference_Property(), this.getXmlProperty(), this.getXmlProperty_References(), "property", null, 1, 1, XmlReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getXmlReference__IsTranslatable(), ecorePackage.getEBoolean(), "isTranslatable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getXmlReference__GetSourcePropertyPath(), this.getXmlPathParam(), "getSourcePropertyPath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getXmlReference__GetTargetPropertyPath(), this.getXmlPathParam(), "getTargetPropertyPath", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlPropertyEClass, XmlProperty.class, "XmlProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlProperty_References(), this.getXmlReference(), this.getXmlReference_Property(), "references", null, 0, -1, XmlProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlRootEClass, XmlRoot.class, "XmlRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlPropertyNavigationEClass, XmlPropertyNavigation.class, "XmlPropertyNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlAxisOptionParamEClass, XmlAxisOptionParam.class, "XmlAxisOptionParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlAxisOptionParam_Options(), this.getXmlAxisKind(), "options", null, 0, -1, XmlAxisOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlAxisOptionParam_Value(), this.getXmlAxisKind(), "value", null, 1, 1, XmlAxisOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlAxisOptionParam_XmlAxisPart(), this.getXmlAxisPart(), this.getXmlAxisPart_XmlAxisOptionParam(), "xmlAxisPart", null, 1, 1, XmlAxisOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getXmlAxisOptionParam__SetValueIfValid__XmlAxisKind(), null, "setValueIfValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXmlAxisKind(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getXmlAxisOptionParam__InferSuggestions(), this.getXmlAxisKind(), "inferSuggestions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlPropertyOptionParamEClass, XmlPropertyOptionParam.class, "XmlPropertyOptionParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlPropertyOptionParam_Options(), this.getXmlPropertyKind(), "options", null, 0, -1, XmlPropertyOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlPropertyOptionParam_Value(), this.getXmlPropertyKind(), "value", null, 1, 1, XmlPropertyOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlPropertyOptionParam_XmlPathParam(), this.getXmlPathParam(), this.getXmlPathParam_XmlPropertyOptionParam(), "xmlPathParam", null, 1, 1, XmlPropertyOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlPropertyOptionParam_AttributeName(), theParametersPackage.getTextLiteralParam(), theParametersPackage.getTextLiteralParam_XmlPropertyOptionParam(), "attributeName", null, 0, 1, XmlPropertyOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlPropertyOptionParam_XmlAxisPart(), this.getXmlAxisPart(), this.getXmlAxisPart_XmlPropertyOption(), "xmlAxisPart", null, 0, 1, XmlPropertyOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getXmlPropertyOptionParam__SetValueIfValid__XmlPropertyKind(), null, "setValueIfValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXmlPropertyKind(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(xmlPathParamEClass, XmlPathParam.class, "XmlPathParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlPathParam_XmlPropertyOptionParam(), this.getXmlPropertyOptionParam(), this.getXmlPropertyOptionParam_XmlPathParam(), "xmlPropertyOptionParam", null, 0, 1, XmlPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlPathParam_XmlAxisParts(), this.getXmlAxisPart(), this.getXmlAxisPart_XmlPathParam(), "xmlAxisParts", null, 0, -1, XmlPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlPathParam_XmlNavigation(), this.getXmlNavigation(), this.getXmlNavigation_XmlPathParam(), "xmlNavigation", null, 0, 1, XmlPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getXmlPathParam__SetXmlAxis__XmlAxisKind_String(), null, "setXmlAxis", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXmlAxisKind(), "axis", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlPathParam__AddXmlAxis__XmlAxisKind_String(), null, "addXmlAxis", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXmlAxisKind(), "axis", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlPathParam__SetXmlAxis__XmlAxisKind(), null, "setXmlAxis", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXmlAxisKindArray(), "axis", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlPathParam__SetXmlAxis__XmlAxisKind_String_1(), null, "setXmlAxis", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXmlAxisKindArray(), "axis", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlPathParam__SpecifyAxis__XmlAxisKind_XmlPropertyKind_String_String(), null, "specifyAxis", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXmlAxisKindArray(), "axes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXmlPropertyKind(), "propertyKind", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attributeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlAxisPartEClass, XmlAxisPart.class, "XmlAxisPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlAxisPart_TextLiteralParam(), theParametersPackage.getTextLiteralParam(), theParametersPackage.getTextLiteralParam_XmlAxisPart(), "textLiteralParam", null, 1, 1, XmlAxisPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlAxisPart_XmlAxisOptionParam(), this.getXmlAxisOptionParam(), this.getXmlAxisOptionParam_XmlAxisPart(), "xmlAxisOptionParam", null, 1, 1, XmlAxisPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlAxisPart_XmlPathParam(), this.getXmlPathParam(), this.getXmlPathParam_XmlAxisParts(), "xmlPathParam", null, 1, 1, XmlAxisPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlAxisPart_XmlPropertyOption(), this.getXmlPropertyOptionParam(), this.getXmlPropertyOptionParam_XmlAxisPart(), "xmlPropertyOption", null, 0, 1, XmlAxisPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getXmlAxisPart__GetNextXmlAxisPairs(), this.getXmlAxisPart(), "getNextXmlAxisPairs", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getXmlAxisPart__GetPreviousXmlAxisPairs(), this.getXmlAxisPart(), "getPreviousXmlAxisPairs", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getXmlAxisPart__InferAxisSuggestions(), this.getXmlAxisKind(), "inferAxisSuggestions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getXmlAxisPart__InferElementTagSuggestions(), ecorePackage.getEString(), "inferElementTagSuggestions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getXmlAxisPart__InferElementTagSuggestionsFromIncomingRelations(), ecorePackage.getEString(), "inferElementTagSuggestionsFromIncomingRelations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getXmlAxisPart__InferElementTagSuggestionsFromOutgoingRelations(), ecorePackage.getEString(), "inferElementTagSuggestionsFromOutgoingRelations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlNavigationEClass, XmlNavigation.class, "XmlNavigation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlNavigation_XmlPathParam(), this.getXmlPathParam(), this.getXmlPathParam_XmlNavigation(), "xmlPathParam", null, 0, 1, XmlNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlNavigation_SourceVariable(), ecorePackage.getEString(), "sourceVariable", "", 0, 1, XmlNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlNavigation_VariableCounter(), ecorePackage.getEInt(), "variableCounter", "0", 0, 1, XmlNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlNodeEClass, XmlNode.class, "XmlNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlNode_Variables(), ecorePackage.getEString(), "variables", null, 0, -1, XmlNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getXmlNode__TranslatePredicates(), ecorePackage.getEString(), "translatePredicates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getXmlNode__GetXQueryRepresentation(), ecorePackage.getEString(), "getXQueryRepresentation", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getXmlNode__TranslateMultipleIncoming(), ecorePackage.getEString(), "translateMultipleIncoming", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(xmlPropertyKindEEnum, XmlPropertyKind.class, "XmlPropertyKind");
		addEEnumLiteral(xmlPropertyKindEEnum, XmlPropertyKind.DATA);
		addEEnumLiteral(xmlPropertyKindEEnum, XmlPropertyKind.TAG);
		addEEnumLiteral(xmlPropertyKindEEnum, XmlPropertyKind.ATTRIBUTE);

		initEEnum(xmlAxisKindEEnum, XmlAxisKind.class, "XmlAxisKind");
		addEEnumLiteral(xmlAxisKindEEnum, XmlAxisKind.CHILD);
		addEEnumLiteral(xmlAxisKindEEnum, XmlAxisKind.DESCENDANT);
		addEEnumLiteral(xmlAxisKindEEnum, XmlAxisKind.PARENT);
		addEEnumLiteral(xmlAxisKindEEnum, XmlAxisKind.ANCESTOR);
		addEEnumLiteral(xmlAxisKindEEnum, XmlAxisKind.FOLLOWING);
		addEEnumLiteral(xmlAxisKindEEnum, XmlAxisKind.FOLLOWING_SIBLING);
		addEEnumLiteral(xmlAxisKindEEnum, XmlAxisKind.PRECEDING);
		addEEnumLiteral(xmlAxisKindEEnum, XmlAxisKind.PRECEDING_SIBLING);
		addEEnumLiteral(xmlAxisKindEEnum, XmlAxisKind.ANCESTOR_OR_SELF);
		addEEnumLiteral(xmlAxisKindEEnum, XmlAxisKind.DESCENDANT_OR_SELF);
		addEEnumLiteral(xmlAxisKindEEnum, XmlAxisKind.SELF);

		// Initialize data types
		initEDataType(xmlAxisKindArrayEDataType, XmlAxisKind[].class, "XmlAxisKindArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AdaptionxmlPackageImpl
