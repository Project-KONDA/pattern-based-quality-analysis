/**
 */
package qualitypatternmodel.graphstructure.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JPackageImpl;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.impl.ExecutionPackageImpl;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.util.GraphstructureValidator;
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
public class GraphstructurePackageImpl extends EPackageImpl implements GraphstructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum returnTypeEEnum = null;

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
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphstructurePackageImpl() {
		super(eNS_URI, GraphstructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GraphstructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphstructurePackage init() {
		if (isInited) return (GraphstructurePackage)EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGraphstructurePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GraphstructurePackageImpl theGraphstructurePackage = registeredGraphstructurePackage instanceof GraphstructurePackageImpl ? (GraphstructurePackageImpl)registeredGraphstructurePackage : new GraphstructurePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(registeredPackage instanceof ParametersPackageImpl ? registeredPackage : ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl)(registeredPackage instanceof OperatorsPackageImpl ? registeredPackage : OperatorsPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdaptionNeo4JPackage.eNS_URI);
		AdaptionNeo4JPackageImpl theAdaptionNeo4JPackage = (AdaptionNeo4JPackageImpl)(registeredPackage instanceof AdaptionNeo4JPackageImpl ? registeredPackage : AdaptionNeo4JPackage.eINSTANCE);

		// Create package meta-data objects
		theGraphstructurePackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theTextrepresentationPackage.createPackageContents();
		theAdaptionrdfPackage.createPackageContents();
		theAdaptionNeo4JPackage.createPackageContents();

		// Initialize created meta-data
		theGraphstructurePackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theTextrepresentationPackage.initializePackageContents();
		theAdaptionrdfPackage.initializePackageContents();
		theAdaptionNeo4JPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGraphstructurePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return GraphstructureValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGraphstructurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphstructurePackage.eNS_URI, theGraphstructurePackage);
		return theGraphstructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_IncomingMapping() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_OutgoingMappings() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_Graph() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_Source() {
		return (EReference)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelation_Target() {
		return (EReference)relationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelation_Name() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelation_Translated() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelation_PredicatesAreBeingTranslated() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__RemoveRelationFromPreviousGraphs() {
		return relationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__RemoveMappingsToNext() {
		return relationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__AdaptAsXmlElementNavigation() {
		return relationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__AdaptAsXmlPropertyNavigation() {
		return relationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__AdaptAsXmlReference() {
		return relationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__AdaptAsRdfPredicate() {
		return relationEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__AdaptAsNeoEdge() {
		return relationEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__SetGraphSimple__Graph() {
		return relationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__GetOriginalID() {
		return relationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__GetOriginalRelation() {
		return relationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveNode() {
		return primitiveNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveNode_Match() {
		return (EReference)primitiveNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveNode_Contains() {
		return (EReference)primitiveNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveNode__CheckComparisonConsistency__ParameterValue() {
		return primitiveNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_OutgoingMappings() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_IncomingMapping() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Graph() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Translated() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_PredicatesAreBeingTranslated() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Predicates() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Incoming() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_TypeModifiable() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_ReturnNode() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__GetOriginalID() {
		return nodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AddPrimitiveMatch__String() {
		return nodeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AddPrimitiveContains() {
		return nodeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AddPrimitiveContains__String() {
		return nodeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AddPrimitiveComparison__String() {
		return nodeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AddPrimitiveMatch() {
		return nodeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AddPrimitiveComparison() {
		return nodeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__GetAllOperators() {
		return nodeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AddPrimitiveComparison__ComparisonOperator_ParameterValue() {
		return nodeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AddPrimitiveComparison__ParameterValue() {
		return nodeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__SetGraphSimple__Graph() {
		return nodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__CheckComparisonConsistency__Comparison() {
		return nodeEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__GetEquivalentNodes() {
		return nodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__MakePrimitive() {
		return nodeEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__MakeComplex() {
		return nodeEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AddOutgoing() {
		return nodeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AddOutgoing__Node() {
		return nodeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__GetOriginalNode() {
		return nodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__MakeComplexRecursive() {
		return nodeEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__MakePrimitiveRecursive() {
		return nodeEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__MakeGeneric() {
		return nodeEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__MakeGenericRecursive() {
		return nodeEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__CheckGeneric() {
		return nodeEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__CheckPrimitive() {
		return nodeEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__CheckComplex() {
		return nodeEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AddIncomming__ComplexNode() {
		return nodeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AdaptAsXmlElement() {
		return nodeEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AdaptAsXmlProperty() {
		return nodeEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AdaptAsRdfIriNode() {
		return nodeEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AdaptAsRdfLiteralNode() {
		return nodeEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AddComparison__Node() {
		return nodeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AdaptAsNeoNode() {
		return nodeEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__AdaptAsNeoAttributeNode() {
		return nodeEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__CheckComparisonConsistency() {
		return nodeEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__GetRelationsTo__Node() {
		return nodeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Nodes() {
		return (EReference)graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_OutgoingMorphisms() {
		return (EReference)graphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_IncomingMorphism() {
		return (EReference)graphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Relations() {
		return (EReference)graphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_OperatorList() {
		return (EReference)graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_QuantifiedCondition() {
		return (EReference)graphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Pattern() {
		return (EReference)graphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__GetAllOperators() {
		return graphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__CopyGraph__Graph() {
		return graphEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__IsReturnGraph() {
		return graphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__AddRelation__ComplexNode_Node() {
		return graphEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__AddNode() {
		return graphEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__AddComplexNode() {
		return graphEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__AddPrimitiveNode() {
		return graphEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__GetReturnNodes() {
		return graphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparable() {
		return comparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparable_Comparison1() {
		return (EReference)comparableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComparable_Comparison2() {
		return (EReference)comparableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__GetReturnType() {
		return comparableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__IsTranslatable() {
		return comparableEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__GetAllArgumentElements() {
		return comparableEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__Validate__DiagnosticChain_Map() {
		return comparableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__IsOperatorArgument() {
		return comparableEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdaptable() {
		return adaptableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdaptable__RemoveParametersFromParameterList() {
		return adaptableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdaptable__CreateParameters() {
		return adaptableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplexNode() {
		return complexNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplexNode_Outgoing() {
		return (EReference)complexNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReturnType() {
		return returnTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphstructureFactory getGraphstructureFactory() {
		return (GraphstructureFactory)getEFactoryInstance();
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
		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__INCOMING_MAPPING);
		createEReference(relationEClass, RELATION__OUTGOING_MAPPINGS);
		createEReference(relationEClass, RELATION__GRAPH);
		createEReference(relationEClass, RELATION__SOURCE);
		createEReference(relationEClass, RELATION__TARGET);
		createEAttribute(relationEClass, RELATION__NAME);
		createEAttribute(relationEClass, RELATION__TRANSLATED);
		createEAttribute(relationEClass, RELATION__PREDICATES_ARE_BEING_TRANSLATED);
		createEOperation(relationEClass, RELATION___GET_ORIGINAL_ID);
		createEOperation(relationEClass, RELATION___GET_ORIGINAL_RELATION);
		createEOperation(relationEClass, RELATION___SET_GRAPH_SIMPLE__GRAPH);
		createEOperation(relationEClass, RELATION___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS);
		createEOperation(relationEClass, RELATION___REMOVE_MAPPINGS_TO_NEXT);
		createEOperation(relationEClass, RELATION___ADAPT_AS_XML_ELEMENT_NAVIGATION);
		createEOperation(relationEClass, RELATION___ADAPT_AS_XML_PROPERTY_NAVIGATION);
		createEOperation(relationEClass, RELATION___ADAPT_AS_XML_REFERENCE);
		createEOperation(relationEClass, RELATION___ADAPT_AS_RDF_PREDICATE);
		createEOperation(relationEClass, RELATION___ADAPT_AS_NEO_EDGE);

		primitiveNodeEClass = createEClass(PRIMITIVE_NODE);
		createEReference(primitiveNodeEClass, PRIMITIVE_NODE__MATCH);
		createEReference(primitiveNodeEClass, PRIMITIVE_NODE__CONTAINS);
		createEOperation(primitiveNodeEClass, PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__OUTGOING_MAPPINGS);
		createEReference(nodeEClass, NODE__INCOMING_MAPPING);
		createEReference(nodeEClass, NODE__GRAPH);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__PREDICATES);
		createEReference(nodeEClass, NODE__INCOMING);
		createEAttribute(nodeEClass, NODE__RETURN_NODE);
		createEAttribute(nodeEClass, NODE__TYPE_MODIFIABLE);
		createEAttribute(nodeEClass, NODE__TRANSLATED);
		createEAttribute(nodeEClass, NODE__PREDICATES_ARE_BEING_TRANSLATED);
		createEOperation(nodeEClass, NODE___GET_ORIGINAL_ID);
		createEOperation(nodeEClass, NODE___GET_ORIGINAL_NODE);
		createEOperation(nodeEClass, NODE___GET_EQUIVALENT_NODES);
		createEOperation(nodeEClass, NODE___SET_GRAPH_SIMPLE__GRAPH);
		createEOperation(nodeEClass, NODE___GET_RELATIONS_TO__NODE);
		createEOperation(nodeEClass, NODE___GET_ALL_OPERATORS);
		createEOperation(nodeEClass, NODE___ADD_OUTGOING);
		createEOperation(nodeEClass, NODE___ADD_OUTGOING__NODE);
		createEOperation(nodeEClass, NODE___ADD_INCOMMING__COMPLEXNODE);
		createEOperation(nodeEClass, NODE___ADD_COMPARISON__NODE);
		createEOperation(nodeEClass, NODE___ADD_PRIMITIVE_COMPARISON);
		createEOperation(nodeEClass, NODE___ADD_PRIMITIVE_COMPARISON__STRING);
		createEOperation(nodeEClass, NODE___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE);
		createEOperation(nodeEClass, NODE___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE);
		createEOperation(nodeEClass, NODE___ADD_PRIMITIVE_MATCH);
		createEOperation(nodeEClass, NODE___ADD_PRIMITIVE_MATCH__STRING);
		createEOperation(nodeEClass, NODE___ADD_PRIMITIVE_CONTAINS);
		createEOperation(nodeEClass, NODE___ADD_PRIMITIVE_CONTAINS__STRING);
		createEOperation(nodeEClass, NODE___CHECK_COMPARISON_CONSISTENCY);
		createEOperation(nodeEClass, NODE___CHECK_COMPARISON_CONSISTENCY__COMPARISON);
		createEOperation(nodeEClass, NODE___CHECK_GENERIC);
		createEOperation(nodeEClass, NODE___MAKE_GENERIC);
		createEOperation(nodeEClass, NODE___MAKE_GENERIC_RECURSIVE);
		createEOperation(nodeEClass, NODE___CHECK_COMPLEX);
		createEOperation(nodeEClass, NODE___MAKE_COMPLEX);
		createEOperation(nodeEClass, NODE___MAKE_COMPLEX_RECURSIVE);
		createEOperation(nodeEClass, NODE___CHECK_PRIMITIVE);
		createEOperation(nodeEClass, NODE___MAKE_PRIMITIVE);
		createEOperation(nodeEClass, NODE___MAKE_PRIMITIVE_RECURSIVE);
		createEOperation(nodeEClass, NODE___ADAPT_AS_XML_ELEMENT);
		createEOperation(nodeEClass, NODE___ADAPT_AS_XML_PROPERTY);
		createEOperation(nodeEClass, NODE___ADAPT_AS_RDF_IRI_NODE);
		createEOperation(nodeEClass, NODE___ADAPT_AS_RDF_LITERAL_NODE);
		createEOperation(nodeEClass, NODE___ADAPT_AS_NEO_NODE);
		createEOperation(nodeEClass, NODE___ADAPT_AS_NEO_ATTRIBUTE_NODE);

		graphEClass = createEClass(GRAPH);
		createEReference(graphEClass, GRAPH__NODES);
		createEReference(graphEClass, GRAPH__OPERATOR_LIST);
		createEReference(graphEClass, GRAPH__QUANTIFIED_CONDITION);
		createEReference(graphEClass, GRAPH__PATTERN);
		createEReference(graphEClass, GRAPH__OUTGOING_MORPHISMS);
		createEReference(graphEClass, GRAPH__INCOMING_MORPHISM);
		createEReference(graphEClass, GRAPH__RELATIONS);
		createEOperation(graphEClass, GRAPH___IS_RETURN_GRAPH);
		createEOperation(graphEClass, GRAPH___GET_RETURN_NODES);
		createEOperation(graphEClass, GRAPH___GET_ALL_OPERATORS);
		createEOperation(graphEClass, GRAPH___COPY_GRAPH__GRAPH);
		createEOperation(graphEClass, GRAPH___ADD_RELATION__COMPLEXNODE_NODE);
		createEOperation(graphEClass, GRAPH___ADD_NODE);
		createEOperation(graphEClass, GRAPH___ADD_COMPLEX_NODE);
		createEOperation(graphEClass, GRAPH___ADD_PRIMITIVE_NODE);

		comparableEClass = createEClass(COMPARABLE);
		createEReference(comparableEClass, COMPARABLE__COMPARISON1);
		createEReference(comparableEClass, COMPARABLE__COMPARISON2);
		createEOperation(comparableEClass, COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(comparableEClass, COMPARABLE___GET_RETURN_TYPE);
		createEOperation(comparableEClass, COMPARABLE___IS_TRANSLATABLE);
		createEOperation(comparableEClass, COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS);
		createEOperation(comparableEClass, COMPARABLE___IS_OPERATOR_ARGUMENT);

		adaptableEClass = createEClass(ADAPTABLE);
		createEOperation(adaptableEClass, ADAPTABLE___CREATE_PARAMETERS);
		createEOperation(adaptableEClass, ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST);

		complexNodeEClass = createEClass(COMPLEX_NODE);
		createEReference(complexNodeEClass, COMPLEX_NODE__OUTGOING);

		// Create enums
		returnTypeEEnum = createEEnum(RETURN_TYPE);
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
		AdaptionxmlPackage theAdaptionxmlPackage = (AdaptionxmlPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptionxmlPackage.eNS_URI);
		AdaptionrdfPackage theAdaptionrdfPackage = (AdaptionrdfPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptionrdfPackage.eNS_URI);
		AdaptionNeo4JPackage theAdaptionNeo4JPackage = (AdaptionNeo4JPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptionNeo4JPackage.eNS_URI);
		OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		relationEClass.getESuperTypes().add(this.getAdaptable());
		primitiveNodeEClass.getESuperTypes().add(this.getNode());
		nodeEClass.getESuperTypes().add(this.getComparable());
		nodeEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		nodeEClass.getESuperTypes().add(this.getAdaptable());
		graphEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		comparableEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		adaptableEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		complexNodeEClass.getESuperTypes().add(this.getNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_IncomingMapping(), thePatternstructurePackage.getRelationMapping(), thePatternstructurePackage.getRelationMapping_Target(), "incomingMapping", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_OutgoingMappings(), thePatternstructurePackage.getRelationMapping(), thePatternstructurePackage.getRelationMapping_Source(), "outgoingMappings", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Graph(), this.getGraph(), this.getGraph_Relations(), "graph", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Source(), this.getComplexNode(), this.getComplexNode_Outgoing(), "source", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Target(), this.getNode(), this.getNode_Incoming(), "target", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Translated(), ecorePackage.getEBoolean(), "translated", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_PredicatesAreBeingTranslated(), ecorePackage.getEBoolean(), "predicatesAreBeingTranslated", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRelation__GetOriginalID(), ecorePackage.getEInt(), "getOriginalID", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRelation__GetOriginalRelation(), this.getRelation(), "getOriginalRelation", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getRelation__SetGraphSimple__Graph(), null, "setGraphSimple", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraph(), "newGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRelation__RemoveRelationFromPreviousGraphs(), null, "removeRelationFromPreviousGraphs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRelation__RemoveMappingsToNext(), null, "removeMappingsToNext", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRelation__AdaptAsXmlElementNavigation(), theAdaptionxmlPackage.getXmlElementNavigation(), "adaptAsXmlElementNavigation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getRelation__AdaptAsXmlPropertyNavigation(), theAdaptionxmlPackage.getXmlPropertyNavigation(), "adaptAsXmlPropertyNavigation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getRelation__AdaptAsXmlReference(), theAdaptionxmlPackage.getXmlReference(), "adaptAsXmlReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getRelation__AdaptAsRdfPredicate(), theAdaptionrdfPackage.getRdfPredicate(), "adaptAsRdfPredicate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getRelation__AdaptAsNeoEdge(), theAdaptionNeo4JPackage.getNeoEdge(), "adaptAsNeoEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(primitiveNodeEClass, PrimitiveNode.class, "PrimitiveNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveNode_Match(), theOperatorsPackage.getMatch(), theOperatorsPackage.getMatch_PrimitiveNode(), "match", null, 0, -1, PrimitiveNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveNode_Contains(), theOperatorsPackage.getContains(), theOperatorsPackage.getContains_PrimitiveNode(), "contains", null, 0, -1, PrimitiveNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPrimitiveNode__CheckComparisonConsistency__ParameterValue(), null, "checkComparisonConsistency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theParametersPackage.getParameterValue(), "parameterValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_OutgoingMappings(), thePatternstructurePackage.getElementMapping(), thePatternstructurePackage.getElementMapping_Source(), "outgoingMappings", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_IncomingMapping(), thePatternstructurePackage.getElementMapping(), thePatternstructurePackage.getElementMapping_Target(), "incomingMapping", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Graph(), this.getGraph(), this.getGraph_Nodes(), "graph", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Predicates(), theOperatorsPackage.getBooleanOperator(), theOperatorsPackage.getBooleanOperator_Nodes(), "predicates", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Incoming(), this.getRelation(), this.getRelation_Target(), "incoming", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_ReturnNode(), ecorePackage.getEBoolean(), "returnNode", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_TypeModifiable(), ecorePackage.getEBoolean(), "typeModifiable", "true", 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Translated(), ecorePackage.getEBoolean(), "translated", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_PredicatesAreBeingTranslated(), ecorePackage.getEBoolean(), "predicatesAreBeingTranslated", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNode__GetOriginalID(), ecorePackage.getEInt(), "getOriginalID", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNode__GetOriginalNode(), this.getNode(), "getOriginalNode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNode__GetEquivalentNodes(), this.getNode(), "getEquivalentNodes", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__SetGraphSimple__Graph(), null, "setGraphSimple", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraph(), "newGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__GetRelationsTo__Node(), this.getRelation(), "getRelationsTo", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNode__GetAllOperators(), theOperatorsPackage.getOperator(), "getAllOperators", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__AddOutgoing(), this.getRelation(), "addOutgoing", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AddOutgoing__Node(), this.getRelation(), "addOutgoing", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AddIncomming__ComplexNode(), this.getRelation(), "addIncomming", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComplexNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__AddComparison__Node(), theOperatorsPackage.getComparison(), "addComparison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__AddPrimitiveComparison(), theParametersPackage.getUntypedParameterValue(), "addPrimitiveComparison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AddPrimitiveComparison__String(), theParametersPackage.getTextLiteralParam(), "addPrimitiveComparison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AddPrimitiveComparison__ParameterValue(), theParametersPackage.getParameterValue(), "addPrimitiveComparison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theParametersPackage.getParameterValue(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AddPrimitiveComparison__ComparisonOperator_ParameterValue(), theParametersPackage.getParameterValue(), "addPrimitiveComparison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatorsPackage.getComparisonOperator(), "operator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theParametersPackage.getParameterValue(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AddPrimitiveMatch(), theParametersPackage.getTextLiteralParam(), "addPrimitiveMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AddPrimitiveMatch__String(), theParametersPackage.getTextLiteralParam(), "addPrimitiveMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "regex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getNode__AddPrimitiveContains(), theParametersPackage.getTextLiteralParam(), "addPrimitiveContains", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__AddPrimitiveContains__String(), theParametersPackage.getTextLiteralParam(), "addPrimitiveContains", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "content", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__CheckComparisonConsistency(), null, "checkComparisonConsistency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__CheckComparisonConsistency__Comparison(), null, "checkComparisonConsistency", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatorsPackage.getComparison(), "comp", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__CheckGeneric(), null, "checkGeneric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__MakeGeneric(), this.getNode(), "makeGeneric", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__MakeGenericRecursive(), this.getNode(), "makeGenericRecursive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__CheckComplex(), null, "checkComplex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__MakeComplex(), this.getComplexNode(), "makeComplex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__MakeComplexRecursive(), this.getComplexNode(), "makeComplexRecursive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__CheckPrimitive(), null, "checkPrimitive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__MakePrimitive(), this.getPrimitiveNode(), "makePrimitive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__MakePrimitiveRecursive(), this.getPrimitiveNode(), "makePrimitiveRecursive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AdaptAsXmlElement(), theAdaptionxmlPackage.getXmlElement(), "adaptAsXmlElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AdaptAsXmlProperty(), theAdaptionxmlPackage.getXmlProperty(), "adaptAsXmlProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AdaptAsRdfIriNode(), theAdaptionrdfPackage.getRdfIriNode(), "adaptAsRdfIriNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AdaptAsRdfLiteralNode(), theAdaptionrdfPackage.getRdfLiteralNode(), "adaptAsRdfLiteralNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AdaptAsNeoNode(), theAdaptionNeo4JPackage.getNeoNode(), "adaptAsNeoNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNode__AdaptAsNeoAttributeNode(), theAdaptionNeo4JPackage.getNeoPropertyNode(), "adaptAsNeoAttributeNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraph_Nodes(), this.getNode(), this.getNode_Graph(), "nodes", null, 1, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_OperatorList(), theOperatorsPackage.getOperatorList(), theOperatorsPackage.getOperatorList_Graph(), "operatorList", null, 1, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_QuantifiedCondition(), thePatternstructurePackage.getQuantifiedCondition(), thePatternstructurePackage.getQuantifiedCondition_Graph(), "quantifiedCondition", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Pattern(), thePatternstructurePackage.getPattern(), thePatternstructurePackage.getPattern_Graph(), "pattern", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_OutgoingMorphisms(), thePatternstructurePackage.getMorphism(), thePatternstructurePackage.getMorphism_Source(), "outgoingMorphisms", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_IncomingMorphism(), thePatternstructurePackage.getMorphism(), thePatternstructurePackage.getMorphism_Target(), "incomingMorphism", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Relations(), this.getRelation(), this.getRelation_Graph(), "relations", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGraph__IsReturnGraph(), ecorePackage.getEBoolean(), "isReturnGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__GetReturnNodes(), this.getNode(), "getReturnNodes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__GetAllOperators(), theOperatorsPackage.getOperator(), "getAllOperators", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__CopyGraph__Graph(), null, "copyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());

		op = initEOperation(getGraph__AddRelation__ComplexNode_Node(), this.getRelation(), "addRelation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComplexNode(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__AddNode(), this.getNode(), "addNode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__AddComplexNode(), this.getComplexNode(), "addComplexNode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraph__AddPrimitiveNode(), this.getPrimitiveNode(), "addPrimitiveNode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(comparableEClass, qualitypatternmodel.graphstructure.Comparable.class, "Comparable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparable_Comparison1(), theOperatorsPackage.getComparison(), theOperatorsPackage.getComparison_Argument1(), "comparison1", null, 0, -1, qualitypatternmodel.graphstructure.Comparable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparable_Comparison2(), theOperatorsPackage.getComparison(), theOperatorsPackage.getComparison_Argument2(), "comparison2", null, 0, -1, qualitypatternmodel.graphstructure.Comparable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getComparable__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComparable__GetReturnType(), this.getReturnType(), "getReturnType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComparable__IsTranslatable(), ecorePackage.getEBoolean(), "isTranslatable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComparable__GetAllArgumentElements(), this.getNode(), "getAllArgumentElements", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComparable__IsOperatorArgument(), ecorePackage.getEBoolean(), "isOperatorArgument", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(adaptableEClass, Adaptable.class, "Adaptable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAdaptable__CreateParameters(), null, "createParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAdaptable__RemoveParametersFromParameterList(), null, "removeParametersFromParameterList", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(complexNodeEClass, ComplexNode.class, "ComplexNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexNode_Outgoing(), this.getRelation(), this.getRelation_Source(), "outgoing", null, 0, -1, ComplexNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(returnTypeEEnum, ReturnType.class, "ReturnType");
		addEEnumLiteral(returnTypeEEnum, ReturnType.UNSPECIFIED);
		addEEnumLiteral(returnTypeEEnum, ReturnType.STRING);
		addEEnumLiteral(returnTypeEEnum, ReturnType.BOOLEAN);
		addEEnumLiteral(returnTypeEEnum, ReturnType.ELEMENT);
		addEEnumLiteral(returnTypeEEnum, ReturnType.DATE);
		addEEnumLiteral(returnTypeEEnum, ReturnType.TIME);
		addEEnumLiteral(returnTypeEEnum, ReturnType.NUMBER);
		addEEnumLiteral(returnTypeEEnum, ReturnType.DATETIME);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphstructurePackageImpl
