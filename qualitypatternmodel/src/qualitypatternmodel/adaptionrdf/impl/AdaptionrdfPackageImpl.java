/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.RdfAxisPair;
import qualitypatternmodel.adaptionrdf.RdfIriNode;
import qualitypatternmodel.adaptionrdf.RdfLiteralNode;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfQuantifier;
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
	private EClass rdfAxisPairEClass = null;

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
	public EReference getRdfPredicate_Rdfpathparam() {
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
	public EReference getRdfPathParam_Rdfaxispair() {
		return (EReference)rdfPathParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRdfPathParam_Rdfreference() {
		return (EReference)rdfPathParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRdfAxisPair() {
		return rdfAxisPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRdfAxisPair_Quantifier() {
		return (EAttribute)rdfAxisPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRdfAxisPair_Textliteralparam() {
		return (EReference)rdfAxisPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRdfAxisPair_Rdfpathparam() {
		return (EReference)rdfAxisPairEClass.getEStructuralFeatures().get(2);
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
		createEReference(rdfPredicateEClass, RDF_PREDICATE__RDFPATHPARAM);

		rdfIriNodeEClass = createEClass(RDF_IRI_NODE);

		rdfPathParamEClass = createEClass(RDF_PATH_PARAM);
		createEReference(rdfPathParamEClass, RDF_PATH_PARAM__RDFAXISPAIR);
		createEReference(rdfPathParamEClass, RDF_PATH_PARAM__RDFREFERENCE);

		rdfAxisPairEClass = createEClass(RDF_AXIS_PAIR);
		createEAttribute(rdfAxisPairEClass, RDF_AXIS_PAIR__QUANTIFIER);
		createEReference(rdfAxisPairEClass, RDF_AXIS_PAIR__TEXTLITERALPARAM);
		createEReference(rdfAxisPairEClass, RDF_AXIS_PAIR__RDFPATHPARAM);

		rdfLiteralNodeEClass = createEClass(RDF_LITERAL_NODE);

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
		PatternstructurePackage thePatternstructurePackage = (PatternstructurePackage)EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rdfPredicateEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());
		rdfIriNodeEClass.getESuperTypes().add(theGraphstructurePackage.getComplexNode());
		rdfPathParamEClass.getESuperTypes().add(theParametersPackage.getParameter());
		rdfAxisPairEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		rdfLiteralNodeEClass.getESuperTypes().add(theGraphstructurePackage.getPrimitiveNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(rdfPredicateEClass, RdfPredicate.class, "RdfPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdfPredicate_Rdfpathparam(), this.getRdfPathParam(), this.getRdfPathParam_Rdfreference(), "rdfpathparam", null, 0, -1, RdfPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfIriNodeEClass, RdfIriNode.class, "RdfIriNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rdfPathParamEClass, RdfPathParam.class, "RdfPathParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdfPathParam_Rdfaxispair(), this.getRdfAxisPair(), this.getRdfAxisPair_Rdfpathparam(), "rdfaxispair", null, 0, -1, RdfPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdfPathParam_Rdfreference(), this.getRdfPredicate(), this.getRdfPredicate_Rdfpathparam(), "rdfreference", null, 0, 1, RdfPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfAxisPairEClass, RdfAxisPair.class, "RdfAxisPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRdfAxisPair_Quantifier(), this.getRdfQuantifier(), "quantifier", null, 0, 1, RdfAxisPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdfAxisPair_Textliteralparam(), theParametersPackage.getTextLiteralParam(), theParametersPackage.getTextLiteralParam_Rdfaxispair(), "textliteralparam", null, 0, -1, RdfAxisPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdfAxisPair_Rdfpathparam(), this.getRdfPathParam(), this.getRdfPathParam_Rdfaxispair(), "rdfpathparam", null, 0, 1, RdfAxisPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdfLiteralNodeEClass, RdfLiteralNode.class, "RdfLiteralNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(rdfQuantifierEEnum, RdfQuantifier.class, "RdfQuantifier");
		addEEnumLiteral(rdfQuantifierEEnum, RdfQuantifier.ONCE);
		addEEnumLiteral(rdfQuantifierEEnum, RdfQuantifier.ZEROPLUS);
		addEEnumLiteral(rdfQuantifierEEnum, RdfQuantifier.ONEPLUS);

		// Create resource
		createResource(eNS_URI);
	}

} //AdaptionrdfPackageImpl
