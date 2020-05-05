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

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.util.GraphstructureValidator;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.OperatorsPackageImpl;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ParametersPackageImpl;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

import qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl;

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
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

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

		// Create package meta-data objects
		theGraphstructurePackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();

		// Initialize created meta-data
		theGraphstructurePackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();

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
	public EReference getRelation_MappingTo() {
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
	public EReference getRelation_MappingFrom() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__RemoveRelationFromPreviousGraphs() {
		return relationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__RemoveMappingsToNext() {
		return relationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__CopyToNewNextGraphs__Element() {
		return relationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__AdaptAsXMLNavigation() {
		return relationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__AdaptAsXMLReference() {
		return relationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__SetGraphSimple__Graph() {
		return relationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_Element() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProperty__Copy() {
		return propertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_Match() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_MappingTo() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_MappingFrom() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Graph() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_ResultOf() {
		return (EReference)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Name() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Translated() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_PredicatesAreBeingTranslated() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Properties() {
		return (EReference)elementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Predicates() {
		return (EReference)elementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Outgoing() {
		return (EReference)elementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Incoming() {
		return (EReference)elementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__CopyNextElementsToNextGraphs() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__CopyNextElementToNextGraphs__Element() {
		return elementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__CopyNextElementToPreviousGraphs__Element_boolean() {
		return elementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__CopyNextElementsToPreviousGraphs__boolean() {
		return elementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__ClearMatchRecursively() {
		return elementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__ClearPredicatesRecursively() {
		return elementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__GetOriginalID() {
		return elementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__AddPrimitiveMatch__String() {
		return elementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__AddPrimitiveComparison__String() {
		return elementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__AddPrimitiveMatch() {
		return elementEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__AddPrimitiveComparison() {
		return elementEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__GetAllOperators() {
		return elementEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__AddPrimitiveComparison__ComparisonOperator_ParameterValue() {
		return elementEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__AddPrimitiveComparison__ParameterValue() {
		return elementEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__ClearComparisonRecursively() {
		return elementEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__ClearPropertyRecursively() {
		return elementEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__CopyProperty__Property() {
		return elementEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__CopyPrimitiveComparison__Comparison() {
		return elementEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__CopyMatch__Match() {
		return elementEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__AddNewProperty() {
		return elementEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__SetGraphSimple__Graph() {
		return elementEClass.getEOperations().get(20);
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
	public EReference getGraph_Elements() {
		return (EReference)graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_ReturnElements() {
		return (EReference)graphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_MorphismTo() {
		return (EReference)graphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_MorphismFrom() {
		return (EReference)graphEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Relations() {
		return (EReference)graphEClass.getEStructuralFeatures().get(8);
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
	public EAttribute getGraph_GraphDepth() {
		return (EAttribute)graphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_QuantifiedCondition() {
		return (EReference)graphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Pattern() {
		return (EReference)graphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__GetAllOperators() {
		return graphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__CopyGraph__Graph() {
		return graphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__IsReturnGraph() {
		return graphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__AddRelation__Element_Element() {
		return graphEClass.getEOperations().get(3);
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
		return comparableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__IsTranslatable() {
		return comparableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__GetAllArgumentElements() {
		return comparableEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getComparable__Validate__DiagnosticChain_Map() {
		return comparableEClass.getEOperations().get(3);
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
		return adaptableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdaptable__CreateParameters() {
		return adaptableEClass.getEOperations().get(1);
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
		createEReference(relationEClass, RELATION__MAPPING_FROM);
		createEReference(relationEClass, RELATION__MAPPING_TO);
		createEReference(relationEClass, RELATION__GRAPH);
		createEReference(relationEClass, RELATION__SOURCE);
		createEReference(relationEClass, RELATION__TARGET);
		createEOperation(relationEClass, RELATION___REMOVE_RELATION_FROM_PREVIOUS_GRAPHS);
		createEOperation(relationEClass, RELATION___REMOVE_MAPPINGS_TO_NEXT);
		createEOperation(relationEClass, RELATION___COPY_TO_NEW_NEXT_GRAPHS__ELEMENT);
		createEOperation(relationEClass, RELATION___ADAPT_AS_XML_NAVIGATION);
		createEOperation(relationEClass, RELATION___ADAPT_AS_XML_REFERENCE);
		createEOperation(relationEClass, RELATION___SET_GRAPH_SIMPLE__GRAPH);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__ELEMENT);
		createEReference(propertyEClass, PROPERTY__MATCH);
		createEOperation(propertyEClass, PROPERTY___COPY);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__MAPPING_TO);
		createEReference(elementEClass, ELEMENT__MAPPING_FROM);
		createEReference(elementEClass, ELEMENT__GRAPH);
		createEReference(elementEClass, ELEMENT__RESULT_OF);
		createEAttribute(elementEClass, ELEMENT__NAME);
		createEAttribute(elementEClass, ELEMENT__TRANSLATED);
		createEAttribute(elementEClass, ELEMENT__PREDICATES_ARE_BEING_TRANSLATED);
		createEReference(elementEClass, ELEMENT__PROPERTIES);
		createEReference(elementEClass, ELEMENT__PREDICATES);
		createEReference(elementEClass, ELEMENT__OUTGOING);
		createEReference(elementEClass, ELEMENT__INCOMING);
		createEOperation(elementEClass, ELEMENT___COPY_NEXT_ELEMENTS_TO_NEXT_GRAPHS);
		createEOperation(elementEClass, ELEMENT___COPY_NEXT_ELEMENT_TO_NEXT_GRAPHS__ELEMENT);
		createEOperation(elementEClass, ELEMENT___COPY_NEXT_ELEMENT_TO_PREVIOUS_GRAPHS__ELEMENT_BOOLEAN);
		createEOperation(elementEClass, ELEMENT___COPY_NEXT_ELEMENTS_TO_PREVIOUS_GRAPHS__BOOLEAN);
		createEOperation(elementEClass, ELEMENT___CLEAR_MATCH_RECURSIVELY);
		createEOperation(elementEClass, ELEMENT___CLEAR_PREDICATES_RECURSIVELY);
		createEOperation(elementEClass, ELEMENT___GET_ORIGINAL_ID);
		createEOperation(elementEClass, ELEMENT___ADD_PRIMITIVE_MATCH__STRING);
		createEOperation(elementEClass, ELEMENT___ADD_PRIMITIVE_COMPARISON__STRING);
		createEOperation(elementEClass, ELEMENT___ADD_PRIMITIVE_MATCH);
		createEOperation(elementEClass, ELEMENT___ADD_PRIMITIVE_COMPARISON);
		createEOperation(elementEClass, ELEMENT___GET_ALL_OPERATORS);
		createEOperation(elementEClass, ELEMENT___ADD_PRIMITIVE_COMPARISON__COMPARISONOPERATOR_PARAMETERVALUE);
		createEOperation(elementEClass, ELEMENT___ADD_PRIMITIVE_COMPARISON__PARAMETERVALUE);
		createEOperation(elementEClass, ELEMENT___CLEAR_COMPARISON_RECURSIVELY);
		createEOperation(elementEClass, ELEMENT___CLEAR_PROPERTY_RECURSIVELY);
		createEOperation(elementEClass, ELEMENT___COPY_PROPERTY__PROPERTY);
		createEOperation(elementEClass, ELEMENT___COPY_PRIMITIVE_COMPARISON__COMPARISON);
		createEOperation(elementEClass, ELEMENT___COPY_MATCH__MATCH);
		createEOperation(elementEClass, ELEMENT___ADD_NEW_PROPERTY);
		createEOperation(elementEClass, ELEMENT___SET_GRAPH_SIMPLE__GRAPH);

		graphEClass = createEClass(GRAPH);
		createEReference(graphEClass, GRAPH__ELEMENTS);
		createEReference(graphEClass, GRAPH__OPERATOR_LIST);
		createEAttribute(graphEClass, GRAPH__GRAPH_DEPTH);
		createEReference(graphEClass, GRAPH__QUANTIFIED_CONDITION);
		createEReference(graphEClass, GRAPH__PATTERN);
		createEReference(graphEClass, GRAPH__RETURN_ELEMENTS);
		createEReference(graphEClass, GRAPH__MORPHISM_TO);
		createEReference(graphEClass, GRAPH__MORPHISM_FROM);
		createEReference(graphEClass, GRAPH__RELATIONS);
		createEOperation(graphEClass, GRAPH___GET_ALL_OPERATORS);
		createEOperation(graphEClass, GRAPH___COPY_GRAPH__GRAPH);
		createEOperation(graphEClass, GRAPH___IS_RETURN_GRAPH);
		createEOperation(graphEClass, GRAPH___ADD_RELATION__ELEMENT_ELEMENT);

		comparableEClass = createEClass(COMPARABLE);
		createEReference(comparableEClass, COMPARABLE__COMPARISON1);
		createEReference(comparableEClass, COMPARABLE__COMPARISON2);
		createEOperation(comparableEClass, COMPARABLE___GET_RETURN_TYPE);
		createEOperation(comparableEClass, COMPARABLE___IS_TRANSLATABLE);
		createEOperation(comparableEClass, COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS);
		createEOperation(comparableEClass, COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP);

		adaptableEClass = createEClass(ADAPTABLE);
		createEOperation(adaptableEClass, ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST);
		createEOperation(adaptableEClass, ADAPTABLE___CREATE_PARAMETERS);

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
		OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		relationEClass.getESuperTypes().add(this.getAdaptable());
		propertyEClass.getESuperTypes().add(this.getComparable());
		propertyEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		propertyEClass.getESuperTypes().add(this.getAdaptable());
		elementEClass.getESuperTypes().add(this.getComparable());
		elementEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		elementEClass.getESuperTypes().add(this.getAdaptable());
		graphEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		comparableEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		adaptableEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_MappingFrom(), thePatternstructurePackage.getRelationMapping(), thePatternstructurePackage.getRelationMapping_To(), "mappingFrom", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_MappingTo(), thePatternstructurePackage.getRelationMapping(), thePatternstructurePackage.getRelationMapping_From(), "mappingTo", null, 0, -1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Graph(), this.getGraph(), this.getGraph_Relations(), "graph", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Source(), this.getElement(), this.getElement_Outgoing(), "source", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Target(), this.getElement(), this.getElement_Incoming(), "target", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRelation__RemoveRelationFromPreviousGraphs(), null, "removeRelationFromPreviousGraphs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRelation__RemoveMappingsToNext(), null, "removeMappingsToNext", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getRelation__CopyToNewNextGraphs__Element(), null, "copyToNewNextGraphs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElement(), "newRelationTo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRelation__AdaptAsXMLNavigation(), theAdaptionxmlPackage.getXmlNavigation(), "adaptAsXMLNavigation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRelation__AdaptAsXMLReference(), theAdaptionxmlPackage.getXmlReference(), "adaptAsXMLReference", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRelation__SetGraphSimple__Graph(), null, "setGraphSimple", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraph(), "newGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Element(), this.getElement(), this.getElement_Properties(), "element", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Match(), theOperatorsPackage.getMatch(), theOperatorsPackage.getMatch_Property(), "match", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProperty__Copy(), this.getProperty(), "copy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_MappingTo(), thePatternstructurePackage.getElementMapping(), thePatternstructurePackage.getElementMapping_From(), "mappingTo", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_MappingFrom(), thePatternstructurePackage.getElementMapping(), thePatternstructurePackage.getElementMapping_To(), "mappingFrom", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Graph(), this.getGraph(), this.getGraph_Elements(), "graph", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_ResultOf(), this.getGraph(), this.getGraph_ReturnElements(), "resultOf", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_Translated(), ecorePackage.getEBoolean(), "translated", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElement_PredicatesAreBeingTranslated(), ecorePackage.getEBoolean(), "predicatesAreBeingTranslated", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Properties(), this.getProperty(), this.getProperty_Element(), "properties", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Predicates(), theOperatorsPackage.getBooleanOperator(), theOperatorsPackage.getBooleanOperator_Elements(), "predicates", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Outgoing(), this.getRelation(), this.getRelation_Source(), "outgoing", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Incoming(), this.getRelation(), this.getRelation_Target(), "incoming", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getElement__CopyNextElementsToNextGraphs(), null, "copyNextElementsToNextGraphs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());

		op = initEOperation(getElement__CopyNextElementToNextGraphs__Element(), null, "copyNextElementToNextGraphs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElement(), "nextElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());

		op = initEOperation(getElement__CopyNextElementToPreviousGraphs__Element_boolean(), null, "copyNextElementToPreviousGraphs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElement(), "nextElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "recursive", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__CopyNextElementsToPreviousGraphs__boolean(), null, "copyNextElementsToPreviousGraphs", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "recursive", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__ClearMatchRecursively(), null, "clearMatchRecursively", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__ClearPredicatesRecursively(), null, "clearPredicatesRecursively", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__GetOriginalID(), ecorePackage.getEInt(), "getOriginalID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__AddPrimitiveMatch__String(), null, "addPrimitiveMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "regex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__AddPrimitiveComparison__String(), null, "addPrimitiveComparison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__AddPrimitiveMatch(), null, "addPrimitiveMatch", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__AddPrimitiveComparison(), theParametersPackage.getUnknownParameterValue(), "addPrimitiveComparison", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__GetAllOperators(), theOperatorsPackage.getOperator(), "getAllOperators", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getElement__AddPrimitiveComparison__ComparisonOperator_ParameterValue(), null, "addPrimitiveComparison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatorsPackage.getComparisonOperator(), "operator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theParametersPackage.getParameterValue(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__AddPrimitiveComparison__ParameterValue(), null, "addPrimitiveComparison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theParametersPackage.getParameterValue(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__ClearComparisonRecursively(), null, "clearComparisonRecursively", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__ClearPropertyRecursively(), null, "clearPropertyRecursively", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__CopyProperty__Property(), this.getProperty(), "copyProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__CopyPrimitiveComparison__Comparison(), null, "copyPrimitiveComparison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatorsPackage.getComparison(), "comparison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getElement__CopyMatch__Match(), null, "copyMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatorsPackage.getMatch(), "match", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__AddNewProperty(), this.getProperty(), "addNewProperty", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElement__SetGraphSimple__Graph(), null, "setGraphSimple", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraph(), "newGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraph_Elements(), this.getElement(), this.getElement_Graph(), "elements", null, 1, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_OperatorList(), theOperatorsPackage.getOperatorList(), theOperatorsPackage.getOperatorList_Graph(), "operatorList", null, 1, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraph_GraphDepth(), ecorePackage.getEInt(), "graphDepth", "-1", 1, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_QuantifiedCondition(), thePatternstructurePackage.getQuantifiedCondition(), thePatternstructurePackage.getQuantifiedCondition_Graph(), "quantifiedCondition", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Pattern(), thePatternstructurePackage.getPattern(), thePatternstructurePackage.getPattern_Graph(), "pattern", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_ReturnElements(), this.getElement(), this.getElement_ResultOf(), "returnElements", null, 1, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_MorphismTo(), thePatternstructurePackage.getMorphism(), thePatternstructurePackage.getMorphism_From(), "morphismTo", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_MorphismFrom(), thePatternstructurePackage.getMorphism(), thePatternstructurePackage.getMorphism_To(), "morphismFrom", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Relations(), this.getRelation(), this.getRelation_Graph(), "relations", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGraph__GetAllOperators(), theOperatorsPackage.getOperator(), "getAllOperators", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getGraph__CopyGraph__Graph(), null, "copyGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());

		initEOperation(getGraph__IsReturnGraph(), ecorePackage.getEBoolean(), "isReturnGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__AddRelation__Element_Element(), this.getRelation(), "addRelation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElement(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElement(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(comparableEClass, qualitypatternmodel.graphstructure.Comparable.class, "Comparable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparable_Comparison1(), theOperatorsPackage.getComparison(), theOperatorsPackage.getComparison_Argument1(), "comparison1", null, 0, -1, qualitypatternmodel.graphstructure.Comparable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComparable_Comparison2(), theOperatorsPackage.getComparison(), theOperatorsPackage.getComparison_Argument2(), "comparison2", null, 0, -1, qualitypatternmodel.graphstructure.Comparable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getComparable__GetReturnType(), this.getReturnType(), "getReturnType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComparable__IsTranslatable(), ecorePackage.getEBoolean(), "isTranslatable", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getComparable__GetAllArgumentElements(), this.getElement(), "getAllArgumentElements", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getComparable__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(adaptableEClass, Adaptable.class, "Adaptable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAdaptable__RemoveParametersFromParameterList(), null, "removeParametersFromParameterList", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAdaptable__CreateParameters(), null, "createParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

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
