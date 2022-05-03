/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.AxisOptionParam;
import qualitypatternmodel.adaptionxml.AxisPair;
import qualitypatternmodel.adaptionxml.PathParam;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.PropertyOptionParam;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.XmlRoot;

import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.impl.ExecutionPackageImpl;
import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl;

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
	private EClass xmlNavigationEClass = null;

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
	private EClass axisOptionParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyOptionParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass axisPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum axisKindEEnum = null;

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

		// Create package meta-data objects
		theAdaptionxmlPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theTextrepresentationPackage.createPackageContents();

		// Initialize created meta-data
		theAdaptionxmlPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theTextrepresentationPackage.initializePackageContents();

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
	public EOperation getXmlElement__GetXQueryRepresentation() {
		return xmlElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlElement__GetXQueryVariable() {
		return xmlElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlElement__TranslatePredicates() {
		return xmlElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlElement__GetTagComparisons() {
		return xmlElementEClass.getEOperations().get(3);
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
	public EReference getXmlNavigation_PathParam() {
		return (EReference)xmlNavigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlNavigation__GetOriginalOption() {
		return xmlNavigationEClass.getEOperations().get(0);
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
	public EClass getXmlProperty() {
		return xmlPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlProperty_AttributeName() {
		return (EReference)xmlPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlProperty_References() {
		return (EReference)xmlPropertyEClass.getEStructuralFeatures().get(1);
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
	public EReference getXmlPropertyNavigation_PathParam() {
		return (EReference)xmlPropertyNavigationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAxisOptionParam() {
		return axisOptionParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAxisOptionParam_Options() {
		return (EAttribute)axisOptionParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAxisOptionParam_Value() {
		return (EAttribute)axisOptionParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAxisOptionParam_AxisPair() {
		return (EReference)axisOptionParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAxisOptionParam__InferSuggestions() {
		return axisOptionParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAxisOptionParam__SetValueIfValid__AxisKind() {
		return axisOptionParamEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyOptionParam() {
		return propertyOptionParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyOptionParam_Options() {
		return (EAttribute)propertyOptionParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyOptionParam_Value() {
		return (EAttribute)propertyOptionParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyOptionParam_PathParam() {
		return (EReference)propertyOptionParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPropertyOptionParam__SetValueIfValid__PropertyKind() {
		return propertyOptionParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathParam() {
		return pathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathParam_XmlNavigation() {
		return (EReference)pathParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathParam_PropertyOptionParam() {
		return (EReference)pathParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathParam_AxisPair() {
		return (EReference)pathParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathParam_XmlPropertyNavigation() {
		return (EReference)pathParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAxisPair() {
		return axisPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAxisPair_TextLiteralParam() {
		return (EReference)axisPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAxisPair_AxisOptionParam() {
		return (EReference)axisPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAxisPair_PathParam() {
		return (EReference)axisPairEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPropertyKind() {
		return propertyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAxisKind() {
		return axisKindEEnum;
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
		createEOperation(xmlElementEClass, XML_ELEMENT___GET_XQUERY_REPRESENTATION);
		createEOperation(xmlElementEClass, XML_ELEMENT___GET_XQUERY_VARIABLE);
		createEOperation(xmlElementEClass, XML_ELEMENT___TRANSLATE_PREDICATES);
		createEOperation(xmlElementEClass, XML_ELEMENT___GET_TAG_COMPARISONS);

		xmlNavigationEClass = createEClass(XML_NAVIGATION);
		createEReference(xmlNavigationEClass, XML_NAVIGATION__PATH_PARAM);
		createEOperation(xmlNavigationEClass, XML_NAVIGATION___GET_ORIGINAL_OPTION);

		xmlReferenceEClass = createEClass(XML_REFERENCE);
		createEAttribute(xmlReferenceEClass, XML_REFERENCE__TYPE);
		createEReference(xmlReferenceEClass, XML_REFERENCE__PROPERTY);
		createEOperation(xmlReferenceEClass, XML_REFERENCE___IS_TRANSLATABLE);

		xmlPropertyEClass = createEClass(XML_PROPERTY);
		createEReference(xmlPropertyEClass, XML_PROPERTY__ATTRIBUTE_NAME);
		createEReference(xmlPropertyEClass, XML_PROPERTY__REFERENCES);

		xmlRootEClass = createEClass(XML_ROOT);

		xmlPropertyNavigationEClass = createEClass(XML_PROPERTY_NAVIGATION);
		createEReference(xmlPropertyNavigationEClass, XML_PROPERTY_NAVIGATION__PATH_PARAM);

		axisOptionParamEClass = createEClass(AXIS_OPTION_PARAM);
		createEAttribute(axisOptionParamEClass, AXIS_OPTION_PARAM__OPTIONS);
		createEAttribute(axisOptionParamEClass, AXIS_OPTION_PARAM__VALUE);
		createEReference(axisOptionParamEClass, AXIS_OPTION_PARAM__AXIS_PAIR);
		createEOperation(axisOptionParamEClass, AXIS_OPTION_PARAM___INFER_SUGGESTIONS);
		createEOperation(axisOptionParamEClass, AXIS_OPTION_PARAM___SET_VALUE_IF_VALID__AXISKIND);

		propertyOptionParamEClass = createEClass(PROPERTY_OPTION_PARAM);
		createEAttribute(propertyOptionParamEClass, PROPERTY_OPTION_PARAM__OPTIONS);
		createEAttribute(propertyOptionParamEClass, PROPERTY_OPTION_PARAM__VALUE);
		createEReference(propertyOptionParamEClass, PROPERTY_OPTION_PARAM__PATH_PARAM);
		createEOperation(propertyOptionParamEClass, PROPERTY_OPTION_PARAM___SET_VALUE_IF_VALID__PROPERTYKIND);

		pathParamEClass = createEClass(PATH_PARAM);
		createEReference(pathParamEClass, PATH_PARAM__XML_NAVIGATION);
		createEReference(pathParamEClass, PATH_PARAM__PROPERTY_OPTION_PARAM);
		createEReference(pathParamEClass, PATH_PARAM__AXIS_PAIR);
		createEReference(pathParamEClass, PATH_PARAM__XML_PROPERTY_NAVIGATION);

		axisPairEClass = createEClass(AXIS_PAIR);
		createEReference(axisPairEClass, AXIS_PAIR__TEXT_LITERAL_PARAM);
		createEReference(axisPairEClass, AXIS_PAIR__AXIS_OPTION_PARAM);
		createEReference(axisPairEClass, AXIS_PAIR__PATH_PARAM);

		// Create enums
		propertyKindEEnum = createEEnum(PROPERTY_KIND);
		axisKindEEnum = createEEnum(AXIS_KIND);
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
		OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xmlElementEClass.getESuperTypes().add(theGraphstructurePackage.getComplexNode());
		xmlNavigationEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());
		xmlReferenceEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());
		xmlPropertyEClass.getESuperTypes().add(theGraphstructurePackage.getPrimitiveNode());
		xmlRootEClass.getESuperTypes().add(theGraphstructurePackage.getComplexNode());
		xmlPropertyNavigationEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());
		axisOptionParamEClass.getESuperTypes().add(theParametersPackage.getParameter());
		propertyOptionParamEClass.getESuperTypes().add(theParametersPackage.getParameter());
		pathParamEClass.getESuperTypes().add(theParametersPackage.getParameterValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(xmlElementEClass, XmlElement.class, "XmlElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getXmlElement__GetXQueryRepresentation(), ecorePackage.getEString(), "getXQueryRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getXmlElement__GetXQueryVariable(), ecorePackage.getEString(), "getXQueryVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlElement__TranslatePredicates(), ecorePackage.getEString(), "translatePredicates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getXmlElement__GetTagComparisons(), theOperatorsPackage.getComparison(), "getTagComparisons", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlNavigationEClass, XmlNavigation.class, "XmlNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlNavigation_PathParam(), this.getPathParam(), this.getPathParam_XmlNavigation(), "pathParam", null, 1, 1, XmlNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getXmlNavigation__GetOriginalOption(), this.getAxisOptionParam(), "getOriginalOption", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlReferenceEClass, XmlReference.class, "XmlReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlReference_Type(), theGraphstructurePackage.getReturnType(), "type", null, 0, 1, XmlReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlReference_Property(), this.getXmlProperty(), this.getXmlProperty_References(), "property", null, 1, 1, XmlReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getXmlReference__IsTranslatable(), ecorePackage.getEBoolean(), "isTranslatable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(xmlPropertyEClass, XmlProperty.class, "XmlProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlProperty_AttributeName(), theParametersPackage.getTextLiteralParam(), theParametersPackage.getTextLiteralParam_Properties(), "attributeName", null, 0, 1, XmlProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlProperty_References(), this.getXmlReference(), this.getXmlReference_Property(), "references", null, 0, -1, XmlProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlRootEClass, XmlRoot.class, "XmlRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlPropertyNavigationEClass, XmlPropertyNavigation.class, "XmlPropertyNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlPropertyNavigation_PathParam(), this.getPathParam(), this.getPathParam_XmlPropertyNavigation(), "pathParam", null, 1, 1, XmlPropertyNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axisOptionParamEClass, AxisOptionParam.class, "AxisOptionParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAxisOptionParam_Options(), this.getAxisKind(), "options", null, 0, -1, AxisOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAxisOptionParam_Value(), this.getAxisKind(), "value", null, 1, 1, AxisOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxisOptionParam_AxisPair(), this.getAxisPair(), this.getAxisPair_AxisOptionParam(), "axisPair", null, 1, 1, AxisOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAxisOptionParam__InferSuggestions(), this.getAxisKind(), "inferSuggestions", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAxisOptionParam__SetValueIfValid__AxisKind(), null, "setValueIfValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAxisKind(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(propertyOptionParamEClass, PropertyOptionParam.class, "PropertyOptionParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyOptionParam_Options(), this.getPropertyKind(), "options", null, 0, -1, PropertyOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyOptionParam_Value(), this.getPropertyKind(), "value", null, 1, 1, PropertyOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyOptionParam_PathParam(), this.getPathParam(), this.getPathParam_PropertyOptionParam(), "pathParam", null, 1, 1, PropertyOptionParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPropertyOptionParam__SetValueIfValid__PropertyKind(), null, "setValueIfValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPropertyKind(), "newValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(pathParamEClass, PathParam.class, "PathParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathParam_XmlNavigation(), this.getXmlNavigation(), this.getXmlNavigation_PathParam(), "xmlNavigation", null, 0, 1, PathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathParam_PropertyOptionParam(), this.getPropertyOptionParam(), this.getPropertyOptionParam_PathParam(), "propertyOptionParam", null, 0, 1, PathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathParam_AxisPair(), this.getAxisPair(), this.getAxisPair_PathParam(), "axisPair", null, 1, -1, PathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathParam_XmlPropertyNavigation(), this.getXmlPropertyNavigation(), this.getXmlPropertyNavigation_PathParam(), "xmlPropertyNavigation", null, 0, 1, PathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(axisPairEClass, AxisPair.class, "AxisPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAxisPair_TextLiteralParam(), theParametersPackage.getTextLiteralParam(), theParametersPackage.getTextLiteralParam_AxisPair(), "textLiteralParam", null, 1, 1, AxisPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxisPair_AxisOptionParam(), this.getAxisOptionParam(), this.getAxisOptionParam_AxisPair(), "axisOptionParam", null, 1, 1, AxisPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAxisPair_PathParam(), this.getPathParam(), this.getPathParam_AxisPair(), "pathParam", null, 1, 1, AxisPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(propertyKindEEnum, PropertyKind.class, "PropertyKind");
		addEEnumLiteral(propertyKindEEnum, PropertyKind.DATA);
		addEEnumLiteral(propertyKindEEnum, PropertyKind.TAG);
		addEEnumLiteral(propertyKindEEnum, PropertyKind.ATTRIBUTE);

		initEEnum(axisKindEEnum, AxisKind.class, "AxisKind");
		addEEnumLiteral(axisKindEEnum, AxisKind.CHILD);
		addEEnumLiteral(axisKindEEnum, AxisKind.DESCENDANT);
		addEEnumLiteral(axisKindEEnum, AxisKind.PARENT);
		addEEnumLiteral(axisKindEEnum, AxisKind.ANCESTOR);
		addEEnumLiteral(axisKindEEnum, AxisKind.FOLLOWING);
		addEEnumLiteral(axisKindEEnum, AxisKind.FOLLOWING_SIBLING);
		addEEnumLiteral(axisKindEEnum, AxisKind.PRECEDING);
		addEEnumLiteral(axisKindEEnum, AxisKind.PRECEDING_SIBLING);
		addEEnumLiteral(axisKindEEnum, AxisKind.ANCESTOR_OR_SELF);
		addEEnumLiteral(axisKindEEnum, AxisKind.DESCENDANT_OR_SELF);
		addEEnumLiteral(axisKindEEnum, AxisKind.SELF);

		// Create resource
		createResource(eNS_URI);
	}

} //AdaptionxmlPackageImpl
