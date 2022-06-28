/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.IriListParam;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.RdfIriNode;
import qualitypatternmodel.adaptionrdf.RdfLiteralNode;
import qualitypatternmodel.adaptionrdf.RdfNode;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfQuantifier;
import qualitypatternmodel.adaptionrdf.RdfSequence;
import qualitypatternmodel.adaptionrdf.RdfXor;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;

import qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl;

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
public class AdaptionrdfPackageImpl extends EPackageImpl implements AdaptionrdfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfIriNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfPathParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfSinglePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfLiteralNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iriParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfXorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdfSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iriListParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rdfQuantifierEEnum = null;

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
	 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdaptionrdfPackageImpl() {
		super(eNS_URI, AdaptionrdfFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdaptionrdfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdaptionrdfPackage init() {
		if (isInited) return (AdaptionrdfPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptionrdfPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdaptionrdfPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdaptionrdfPackageImpl theAdaptionrdfPackage = registeredAdaptionrdfPackage instanceof AdaptionrdfPackageImpl ? (AdaptionrdfPackageImpl)registeredAdaptionrdfPackage : new AdaptionrdfPackageImpl();

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

		// Create package meta-data objects
		theAdaptionrdfPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theTextrepresentationPackage.createPackageContents();

		// Initialize created meta-data
		theAdaptionrdfPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theTextrepresentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdaptionrdfPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdaptionrdfPackage.eNS_URI, theAdaptionrdfPackage);
		return theAdaptionrdfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRdfPredicate() {
		return rdfPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRdfPredicate_RdfPathParam() {
		return (EReference)rdfPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRdfIriNode() {
		return rdfIriNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRdfPathParam() {
		return rdfPathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRdfPathParam_RdfPredicate() {
		return (EReference)rdfPathParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRdfPathParam_Invert() {
		return (EAttribute)rdfPathParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRdfPathParam_Quantifier() {
		return (EAttribute)rdfPathParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRdfPathParam__GetRdfSinglePredicates() {
		return rdfPathParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRdfSinglePredicate() {
		return rdfSinglePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRdfSinglePredicate_IriParam() {
		return (EReference)rdfSinglePredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRdfNode() {
		return rdfNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRdfLiteralNode() {
		return rdfLiteralNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIriParam() {
		return iriParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIriParam_RdfSinglePredicate() {
		return (EReference)iriParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIriParam_Prefix() {
		return (EAttribute)iriParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIriParam_Uri() {
		return (EAttribute)iriParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIriParam_Suffix() {
		return (EAttribute)iriParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIriParam_IriListParam() {
		return (EReference)iriParamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIriParam__GetStandardIri() {
		return iriParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRdfXor() {
		return rdfXorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRdfXor_Items() {
		return (EReference)rdfXorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRdfSequence() {
		return rdfSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRdfSequence_Items() {
		return (EReference)rdfSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIriListParam() {
		return iriListParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIriListParam_IriParam() {
		return (EReference)iriListParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRdfQuantifier() {
		return rdfQuantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdaptionrdfFactory getAdaptionrdfFactory() {
		return (AdaptionrdfFactory)getEFactoryInstance();
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
		rdfPredicateEClass = createEClass(RDF_PREDICATE);
		createEReference(rdfPredicateEClass, RDF_PREDICATE__RDF_PATH_PARAM);

		rdfIriNodeEClass = createEClass(RDF_IRI_NODE);

		rdfPathParamEClass = createEClass(RDF_PATH_PARAM);
		createEReference(rdfPathParamEClass, RDF_PATH_PARAM__RDF_PREDICATE);
		createEAttribute(rdfPathParamEClass, RDF_PATH_PARAM__INVERT);
		createEAttribute(rdfPathParamEClass, RDF_PATH_PARAM__QUANTIFIER);
		createEOperation(rdfPathParamEClass, RDF_PATH_PARAM___GET_RDF_SINGLE_PREDICATES);

		rdfSinglePredicateEClass = createEClass(RDF_SINGLE_PREDICATE);
		createEReference(rdfSinglePredicateEClass, RDF_SINGLE_PREDICATE__IRI_PARAM);

		rdfNodeEClass = createEClass(RDF_NODE);

		rdfLiteralNodeEClass = createEClass(RDF_LITERAL_NODE);

		iriParamEClass = createEClass(IRI_PARAM);
		createEReference(iriParamEClass, IRI_PARAM__RDF_SINGLE_PREDICATE);
		createEAttribute(iriParamEClass, IRI_PARAM__PREFIX);
		createEAttribute(iriParamEClass, IRI_PARAM__URI);
		createEAttribute(iriParamEClass, IRI_PARAM__SUFFIX);
		createEReference(iriParamEClass, IRI_PARAM__IRI_LIST_PARAM);
		createEOperation(iriParamEClass, IRI_PARAM___GET_STANDARD_IRI);

		rdfXorEClass = createEClass(RDF_XOR);
		createEReference(rdfXorEClass, RDF_XOR__ITEMS);

		rdfSequenceEClass = createEClass(RDF_SEQUENCE);
		createEReference(rdfSequenceEClass, RDF_SEQUENCE__ITEMS);

		iriListParamEClass = createEClass(IRI_LIST_PARAM);
		createEReference(iriListParamEClass, IRI_LIST_PARAM__IRI_PARAM);

		// Create enums
		rdfQuantifierEEnum = createEEnum(RDF_QUANTIFIER);
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
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rdfPredicateEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());
		rdfIriNodeEClass.getESuperTypes().add(theGraphstructurePackage.getComplexNode());
		rdfIriNodeEClass.getESuperTypes().add(this.getRdfNode());
		rdfPathParamEClass.getESuperTypes().add(theParametersPackage.getParameter());
		rdfPathParamEClass.getESuperTypes().add(theGraphstructurePackage.getAdaptable());
		rdfSinglePredicateEClass.getESuperTypes().add(this.getRdfPathParam());
		rdfLiteralNodeEClass.getESuperTypes().add(theGraphstructurePackage.getPrimitiveNode());
		rdfLiteralNodeEClass.getESuperTypes().add(this.getRdfNode());
		iriParamEClass.getESuperTypes().add(theParametersPackage.getParameterValue());
		rdfXorEClass.getESuperTypes().add(this.getRdfPathParam());
		rdfSequenceEClass.getESuperTypes().add(this.getRdfPathParam());
		iriListParamEClass.getESuperTypes().add(theParametersPackage.getParameterValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(rdfPredicateEClass, RdfPredicate.class, "RdfPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdfPredicate_RdfPathParam(), this.getRdfPathParam(), this.getRdfPathParam_RdfPredicate(), "rdfPathParam", null, 0, 1, RdfPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfIriNodeEClass, RdfIriNode.class, "RdfIriNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfPathParamEClass, RdfPathParam.class, "RdfPathParam", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdfPathParam_RdfPredicate(), this.getRdfPredicate(), this.getRdfPredicate_RdfPathParam(), "rdfPredicate", null, 0, 1, RdfPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRdfPathParam_Invert(), ecorePackage.getEBoolean(), "invert", null, 0, 1, RdfPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRdfPathParam_Quantifier(), this.getRdfQuantifier(), "quantifier", null, 0, 1, RdfPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRdfPathParam__GetRdfSinglePredicates(), this.getRdfSinglePredicate(), "getRdfSinglePredicates", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(rdfSinglePredicateEClass, RdfSinglePredicate.class, "RdfSinglePredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdfSinglePredicate_IriParam(), this.getIriParam(), this.getIriParam_RdfSinglePredicate(), "iriParam", null, 0, 1, RdfSinglePredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfNodeEClass, RdfNode.class, "RdfNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfLiteralNodeEClass, RdfLiteralNode.class, "RdfLiteralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iriParamEClass, IriParam.class, "IriParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIriParam_RdfSinglePredicate(), this.getRdfSinglePredicate(), this.getRdfSinglePredicate_IriParam(), "rdfSinglePredicate", null, 0, 1, IriParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIriParam_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, IriParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIriParam_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, IriParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIriParam_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, IriParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIriParam_IriListParam(), this.getIriListParam(), this.getIriListParam_IriParam(), "iriListParam", null, 0, 1, IriParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIriParam__GetStandardIri(), ecorePackage.getEString(), "getStandardIri", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rdfXorEClass, RdfXor.class, "RdfXor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdfXor_Items(), this.getRdfPathParam(), null, "items", null, 2, -1, RdfXor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfSequenceEClass, RdfSequence.class, "RdfSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdfSequence_Items(), this.getRdfPathParam(), null, "items", null, 2, -1, RdfSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iriListParamEClass, IriListParam.class, "IriListParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIriListParam_IriParam(), this.getIriParam(), this.getIriParam_IriListParam(), "iriParam", null, 0, -1, IriListParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(rdfQuantifierEEnum, RdfQuantifier.class, "RdfQuantifier");
		addEEnumLiteral(rdfQuantifierEEnum, RdfQuantifier.ONE);
		addEEnumLiteral(rdfQuantifierEEnum, RdfQuantifier.ZERO_PLUS);
		addEEnumLiteral(rdfQuantifierEEnum, RdfQuantifier.ONE_PLUS);
		addEEnumLiteral(rdfQuantifierEEnum, RdfQuantifier.ZERO_OR_ONE);

		// Create resource
		createResource(eNS_URI);
	}

} //AdaptionrdfPackageImpl
