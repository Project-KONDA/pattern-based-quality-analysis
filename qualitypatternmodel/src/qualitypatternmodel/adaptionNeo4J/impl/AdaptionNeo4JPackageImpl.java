/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionNeo4J.AbstractNeoNode;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoAttributeEdge;
import qualitypatternmodel.adaptionNeo4J.NeoAttributeNode;
import qualitypatternmodel.adaptionNeo4J.NeoAttributePathParam;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoInEdgeTargedNode;
import qualitypatternmodel.adaptionNeo4J.NeoLabel;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoQuantifier;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;

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
public class AdaptionNeo4JPackageImpl extends EPackageImpl implements AdaptionNeo4JPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNeoNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoComplexEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoSimpleEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPathPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoAttributeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPathParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoAttributePathParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoAttributeEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoInEdgeTargedNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum neoQuantifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum neoDirectionEEnum = null;

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
	 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdaptionNeo4JPackageImpl() {
		super(eNS_URI, AdaptionNeo4JFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdaptionNeo4JPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdaptionNeo4JPackage init() {
		if (isInited) return (AdaptionNeo4JPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptionNeo4JPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdaptionNeo4JPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AdaptionNeo4JPackageImpl theAdaptionNeo4JPackage = registeredAdaptionNeo4JPackage instanceof AdaptionNeo4JPackageImpl ? (AdaptionNeo4JPackageImpl)registeredAdaptionNeo4JPackage : new AdaptionNeo4JPackageImpl();

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

		// Create package meta-data objects
		theAdaptionNeo4JPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theTextrepresentationPackage.createPackageContents();
		theAdaptionrdfPackage.createPackageContents();

		// Initialize created meta-data
		theAdaptionNeo4JPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theTextrepresentationPackage.initializePackageContents();
		theAdaptionrdfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdaptionNeo4JPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdaptionNeo4JPackage.eNS_URI, theAdaptionNeo4JPackage);
		return theAdaptionNeo4JPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractNeoNode() {
		return abstractNeoNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAbstractNeoNode__GetCypherVariable() {
		return abstractNeoNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoNode() {
		return neoNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoNode_NodeLabels() {
		return (EReference)neoNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoNode_NeoNeoLabels() {
		return (EReference)neoNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoEdge() {
		return neoEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoEdge_NeoPathParam() {
		return (EReference)neoEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoComplexEdge() {
		return neoComplexEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoComplexEdge_NeoPath() {
		return (EReference)neoComplexEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoComplexEdge_NeoTargedEdge() {
		return (EReference)neoComplexEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoComplexEdge__ValidateComplexEdge() {
		return neoComplexEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoSimpleEdge() {
		return neoSimpleEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoSimpleEdge_Keyvalueparam() {
		return (EReference)neoSimpleEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoSimpleEdge_NeoEdgeLabel() {
		return (EReference)neoSimpleEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPathPart() {
		return neoPathPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathPart__GetSimpleEdges() {
		return neoPathPartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathPart__GetCypherVariable() {
		return neoPathPartEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathPart__GetNeoInEdgeTargedNode() {
		return neoPathPartEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoSimpleEdge_NeoDirection() {
		return (EAttribute)neoSimpleEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoSimpleEdge_EdgeNumber() {
		return (EAttribute)neoSimpleEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoSimpleEdge__SetNeoDirection__NeoDirection() {
		return neoSimpleEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoAttributeNode() {
		return neoAttributeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPathParam() {
		return neoPathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPathParam_NeoEdge() {
		return (EReference)neoPathParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPathParam_NeoPath() {
		return (EReference)neoPathParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoLabel() {
		return neoLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoLabel_NeoLabel() {
		return (EAttribute)neoLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoAttributePathParam() {
		return neoAttributePathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoAttributePathParam_NeoPath() {
		return (EReference)neoAttributePathParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoAttributePathParam_NeoAttributeEdge() {
		return (EReference)neoAttributePathParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoAttributePathParam_NeoPropertyName() {
		return (EAttribute)neoAttributePathParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoAttributeEdge() {
		return neoAttributeEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoAttributeEdge_NeoAttributePathParam() {
		return (EReference)neoAttributeEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoInEdgeTargedNode() {
		return neoInEdgeTargedNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoInEdgeTargedNode_NeoSimpleEdgeSource() {
		return (EReference)neoInEdgeTargedNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoInEdgeTargedNode__SetSourceEdge__NeoSimpleEdge() {
		return neoInEdgeTargedNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNeoQuantifier() {
		return neoQuantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNeoDirection() {
		return neoDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdaptionNeo4JFactory getAdaptionNeo4JFactory() {
		return (AdaptionNeo4JFactory)getEFactoryInstance();
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
		abstractNeoNodeEClass = createEClass(ABSTRACT_NEO_NODE);
		createEOperation(abstractNeoNodeEClass, ABSTRACT_NEO_NODE___GET_CYPHER_VARIABLE);

		neoNodeEClass = createEClass(NEO_NODE);
		createEReference(neoNodeEClass, NEO_NODE__NODE_LABELS);
		createEReference(neoNodeEClass, NEO_NODE__NEO_NEO_LABELS);

		neoEdgeEClass = createEClass(NEO_EDGE);
		createEReference(neoEdgeEClass, NEO_EDGE__NEO_PATH_PARAM);

		neoComplexEdgeEClass = createEClass(NEO_COMPLEX_EDGE);
		createEReference(neoComplexEdgeEClass, NEO_COMPLEX_EDGE__NEO_PATH);
		createEReference(neoComplexEdgeEClass, NEO_COMPLEX_EDGE__NEO_TARGED_EDGE);
		createEOperation(neoComplexEdgeEClass, NEO_COMPLEX_EDGE___VALIDATE_COMPLEX_EDGE);

		neoSimpleEdgeEClass = createEClass(NEO_SIMPLE_EDGE);
		createEReference(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__KEYVALUEPARAM);
		createEReference(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__NEO_EDGE_LABEL);
		createEAttribute(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__NEO_DIRECTION);
		createEAttribute(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__EDGE_NUMBER);
		createEOperation(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE___SET_NEO_DIRECTION__NEODIRECTION);

		neoPathPartEClass = createEClass(NEO_PATH_PART);
		createEOperation(neoPathPartEClass, NEO_PATH_PART___GET_SIMPLE_EDGES);
		createEOperation(neoPathPartEClass, NEO_PATH_PART___GET_CYPHER_VARIABLE);
		createEOperation(neoPathPartEClass, NEO_PATH_PART___GET_NEO_IN_EDGE_TARGED_NODE);

		neoAttributeNodeEClass = createEClass(NEO_ATTRIBUTE_NODE);

		neoPathParamEClass = createEClass(NEO_PATH_PARAM);
		createEReference(neoPathParamEClass, NEO_PATH_PARAM__NEO_EDGE);
		createEReference(neoPathParamEClass, NEO_PATH_PARAM__NEO_PATH);

		neoLabelEClass = createEClass(NEO_LABEL);
		createEAttribute(neoLabelEClass, NEO_LABEL__NEO_LABEL);

		neoAttributePathParamEClass = createEClass(NEO_ATTRIBUTE_PATH_PARAM);
		createEReference(neoAttributePathParamEClass, NEO_ATTRIBUTE_PATH_PARAM__NEO_PATH);
		createEReference(neoAttributePathParamEClass, NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE);
		createEAttribute(neoAttributePathParamEClass, NEO_ATTRIBUTE_PATH_PARAM__NEO_PROPERTY_NAME);

		neoAttributeEdgeEClass = createEClass(NEO_ATTRIBUTE_EDGE);
		createEReference(neoAttributeEdgeEClass, NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM);

		neoInEdgeTargedNodeEClass = createEClass(NEO_IN_EDGE_TARGED_NODE);
		createEReference(neoInEdgeTargedNodeEClass, NEO_IN_EDGE_TARGED_NODE__NEO_SIMPLE_EDGE_SOURCE);
		createEOperation(neoInEdgeTargedNodeEClass, NEO_IN_EDGE_TARGED_NODE___SET_SOURCE_EDGE__NEOSIMPLEEDGE);

		// Create enums
		neoQuantifierEEnum = createEEnum(NEO_QUANTIFIER);
		neoDirectionEEnum = createEEnum(NEO_DIRECTION);
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
		neoNodeEClass.getESuperTypes().add(theGraphstructurePackage.getComplexNode());
		neoNodeEClass.getESuperTypes().add(this.getAbstractNeoNode());
		neoEdgeEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());
		neoComplexEdgeEClass.getESuperTypes().add(this.getNeoPathPart());
		neoSimpleEdgeEClass.getESuperTypes().add(this.getNeoPathPart());
		neoPathPartEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		neoAttributeNodeEClass.getESuperTypes().add(theGraphstructurePackage.getPrimitiveNode());
		neoAttributeNodeEClass.getESuperTypes().add(this.getAbstractNeoNode());
		neoPathParamEClass.getESuperTypes().add(theParametersPackage.getParameter());
		neoPathParamEClass.getESuperTypes().add(theGraphstructurePackage.getAdaptable());
		neoLabelEClass.getESuperTypes().add(theParametersPackage.getParameterValue());
		neoAttributePathParamEClass.getESuperTypes().add(theParametersPackage.getParameter());
		neoAttributePathParamEClass.getESuperTypes().add(theGraphstructurePackage.getAdaptable());
		neoAttributeEdgeEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());
		neoInEdgeTargedNodeEClass.getESuperTypes().add(this.getNeoNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractNeoNodeEClass, AbstractNeoNode.class, "AbstractNeoNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAbstractNeoNode__GetCypherVariable(), ecorePackage.getEString(), "getCypherVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoNodeEClass, NeoNode.class, "NeoNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoNode_NodeLabels(), theParametersPackage.getTextLiteralParam(), null, "nodeLabels", null, 0, -1, NeoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoNode_NeoNeoLabels(), this.getNeoLabel(), null, "neoNeoLabels", null, 0, -1, NeoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neoEdgeEClass, NeoEdge.class, "NeoEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoEdge_NeoPathParam(), this.getNeoPathParam(), this.getNeoPathParam_NeoEdge(), "neoPathParam", null, 0, 1, NeoEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neoComplexEdgeEClass, NeoComplexEdge.class, "NeoComplexEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoComplexEdge_NeoPath(), this.getNeoPathPart(), null, "neoPath", null, 2, -1, NeoComplexEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoComplexEdge_NeoTargedEdge(), this.getNeoInEdgeTargedNode(), null, "neoTargedEdge", null, 0, -1, NeoComplexEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNeoComplexEdge__ValidateComplexEdge(), ecorePackage.getEBoolean(), "validateComplexEdge", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoSimpleEdgeEClass, NeoSimpleEdge.class, "NeoSimpleEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoSimpleEdge_Keyvalueparam(), theParametersPackage.getKeyValueParam(), null, "keyvalueparam", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoSimpleEdge_NeoEdgeLabel(), this.getNeoLabel(), null, "neoEdgeLabel", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeoSimpleEdge_NeoDirection(), this.getNeoDirection(), "neoDirection", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeoSimpleEdge_EdgeNumber(), ecorePackage.getEInt(), "edgeNumber", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getNeoSimpleEdge__SetNeoDirection__NeoDirection(), null, "setNeoDirection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNeoDirection(), "neoDirection", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoPathPartEClass, NeoPathPart.class, "NeoPathPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNeoPathPart__GetSimpleEdges(), this.getNeoSimpleEdge(), "getSimpleEdges", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNeoPathPart__GetCypherVariable(), ecorePackage.getEString(), "getCypherVariable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNeoPathPart__GetNeoInEdgeTargedNode(), this.getNeoInEdgeTargedNode(), "getNeoInEdgeTargedNode", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoAttributeNodeEClass, NeoAttributeNode.class, "NeoAttributeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(neoPathParamEClass, NeoPathParam.class, "NeoPathParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoPathParam_NeoEdge(), this.getNeoEdge(), this.getNeoEdge_NeoPathParam(), "neoEdge", null, 0, 1, NeoPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoPathParam_NeoPath(), this.getNeoPathPart(), null, "neoPath", null, 1, 1, NeoPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neoLabelEClass, NeoLabel.class, "NeoLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeoLabel_NeoLabel(), ecorePackage.getEString(), "neoLabel", null, 0, 1, NeoLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neoAttributePathParamEClass, NeoAttributePathParam.class, "NeoAttributePathParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoAttributePathParam_NeoPath(), this.getNeoPathPart(), null, "neoPath", null, 0, 1, NeoAttributePathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoAttributePathParam_NeoAttributeEdge(), this.getNeoAttributeEdge(), this.getNeoAttributeEdge_NeoAttributePathParam(), "neoAttributeEdge", null, 0, 1, NeoAttributePathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeoAttributePathParam_NeoPropertyName(), ecorePackage.getEString(), "neoPropertyName", null, 1, 1, NeoAttributePathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neoAttributeEdgeEClass, NeoAttributeEdge.class, "NeoAttributeEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoAttributeEdge_NeoAttributePathParam(), this.getNeoAttributePathParam(), this.getNeoAttributePathParam_NeoAttributeEdge(), "neoAttributePathParam", null, 0, 1, NeoAttributeEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neoInEdgeTargedNodeEClass, NeoInEdgeTargedNode.class, "NeoInEdgeTargedNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoInEdgeTargedNode_NeoSimpleEdgeSource(), this.getNeoSimpleEdge(), null, "neoSimpleEdgeSource", null, 1, 1, NeoInEdgeTargedNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNeoInEdgeTargedNode__SetSourceEdge__NeoSimpleEdge(), null, "setSourceEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNeoSimpleEdge(), "neoSimpleEdgeSource", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(neoQuantifierEEnum, NeoQuantifier.class, "NeoQuantifier");

		initEEnum(neoDirectionEEnum, NeoDirection.class, "NeoDirection");
		addEEnumLiteral(neoDirectionEEnum, NeoDirection.IMPLICIT);
		addEEnumLiteral(neoDirectionEEnum, NeoDirection.RIGHT);
		addEEnumLiteral(neoDirectionEEnum, NeoDirection.LEFT);

		// Create resource
		createResource(eNS_URI);
	}

} //AdaptionNeo4JPackageImpl
