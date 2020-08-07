/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.impl.ExecutionPackageImpl;
import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.OperatorsPackageImpl;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ParametersPackageImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountConditionArgument;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.Mapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.ElementMapping;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.patternstructure.util.PatternstructureValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternstructurePackageImpl extends EPackageImpl implements PatternstructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifiedConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass morphismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countConditionArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass morphismContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum abstractionLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidityExceptionWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType missingPatternContainerExceptionEDataType = null;

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
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternstructurePackageImpl() {
		super(eNS_URI, PatternstructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatternstructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternstructurePackage init() {
		if (isInited) return (PatternstructurePackage)EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPatternstructurePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PatternstructurePackageImpl thePatternstructurePackage = registeredPatternstructurePackage instanceof PatternstructurePackageImpl ? (PatternstructurePackageImpl)registeredPatternstructurePackage : new PatternstructurePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(registeredPackage instanceof ParametersPackageImpl ? registeredPackage : ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl)(registeredPackage instanceof OperatorsPackageImpl ? registeredPackage : OperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);
		GraphstructurePackageImpl theGraphstructurePackage = (GraphstructurePackageImpl)(registeredPackage instanceof GraphstructurePackageImpl ? registeredPackage : GraphstructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdaptionxmlPackage.eNS_URI);
		AdaptionxmlPackageImpl theAdaptionxmlPackage = (AdaptionxmlPackageImpl)(registeredPackage instanceof AdaptionxmlPackageImpl ? registeredPackage : AdaptionxmlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(registeredPackage instanceof ExecutionPackageImpl ? registeredPackage : ExecutionPackage.eINSTANCE);

		// Create package meta-data objects
		thePatternstructurePackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();
		theExecutionPackage.createPackageContents();

		// Initialize created meta-data
		thePatternstructurePackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePatternstructurePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return PatternstructureValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePatternstructurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternstructurePackage.eNS_URI, thePatternstructurePackage);
		return thePatternstructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationMapping() {
		return relationMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationMapping_Target() {
		return (EReference)relationMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationMapping_Source() {
		return (EReference)relationMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantifiedCondition() {
		return quantifiedConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantifiedCondition_Condition() {
		return (EReference)quantifiedConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantifiedCondition_Graph() {
		return (EReference)quantifiedConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuantifiedCondition__CheckMorphismOfNextGraph() {
		return quantifiedConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantifiedCondition_Quantifier() {
		return (EAttribute)quantifiedConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_Pattern() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_QuantifiedCondition() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_Formula1() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_Formula2() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_NotCondition() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCondition__GetNextMorphismContainers() {
		return conditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMorphism() {
		return morphismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMorphism_Mappings() {
		return (EReference)morphismEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMorphism_Source() {
		return (EReference)morphismEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMorphism_Target() {
		return (EReference)morphismEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMorphism_MorphismContainer() {
		return (EReference)morphismEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMorphism__CheckElementMappings() {
		return morphismEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMorphism__CheckRelationMappings() {
		return morphismEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMorphism__CheckRelationMappingsUniqueness() {
		return morphismEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMorphism__CheckElementMappingsUniqueness() {
		return morphismEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMorphism__AddMapping__Element_Element() {
		return morphismEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMorphism__AddMapping__Relation_Relation() {
		return morphismEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMorphism__RemoveInconsistentMappings() {
		return morphismEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementMapping() {
		return elementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementMapping_Source() {
		return (EReference)elementMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementMapping_Target() {
		return (EReference)elementMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_Morphism() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormula() {
		return formulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormula_Operator() {
		return (EAttribute)formulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormula_Condition1() {
		return (EReference)formulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormula_Condition2() {
		return (EReference)formulaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrueElement() {
		return trueElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompletePattern() {
		return completePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompletePattern_ParameterList() {
		return (EReference)completePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompletePattern_ElementCounter() {
		return (EAttribute)completePatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompletePattern_Name() {
		return (EAttribute)completePatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompletePattern_Database() {
		return (EReference)completePatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompletePattern__GetNewRefNo() {
		return completePatternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCompletePattern__RecordValues() {
		return completePatternEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatternElement() {
		return patternElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatternElement_Id() {
		return (EAttribute)patternElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatternElement_InternalId() {
		return (EAttribute)patternElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__GenerateQuery() {
		return patternElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__GetAllInputs() {
		return patternElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__PrepareTranslation() {
		return patternElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__IsValid__AbstractionLevel() {
		return patternElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__IsValidLocal__AbstractionLevel() {
		return patternElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__Validate__DiagnosticChain_Map() {
		return patternElementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__UpdateParameters__ParameterList() {
		return patternElementEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__GetParameterList() {
		return patternElementEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__UpdateOperators__OperatorList() {
		return patternElementEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__GetOperatorList() {
		return patternElementEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__CreateXMLAdaption() {
		return patternElementEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__FinalizeXMLAdaption() {
		return patternElementEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__RecordValues__XmlDatabase() {
		return patternElementEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__RelationsXmlAdapted() {
		return patternElementEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotCondition() {
		return notConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotCondition_Condition() {
		return (EReference)notConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountCondition() {
		return countConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountCondition_CountPattern() {
		return (EReference)countConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountCondition_Option() {
		return (EReference)countConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountCondition_Argument2() {
		return (EReference)countConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountConditionArgument() {
		return countConditionArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountConditionArgument_CountCondition2() {
		return (EReference)countConditionArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMorphismContainer() {
		return morphismContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMorphismContainer_Morphism() {
		return (EReference)morphismContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMorphismContainer__GetGraph() {
		return morphismContainerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMorphismContainer__CopyPreviousGraph() {
		return morphismContainerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCountPattern() {
		return countPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountPattern_CountCondition() {
		return (EReference)countPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPattern_Graph() {
		return (EReference)patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPattern_Condition() {
		return (EReference)patternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_PartialQuery() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_Query() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPattern__CheckMorphismOfNextGraph() {
		return patternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberElement() {
		return numberElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumberElement_NumberParam() {
		return (EReference)numberElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__GetContainer() {
		return patternElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__GetAncestor__Class() {
		return patternElementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__MyToString() {
		return patternElementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLogicalOperator() {
		return logicalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getQuantifier() {
		return quantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLocation() {
		return locationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAbstractionLevel() {
		return abstractionLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInvalidityExceptionWrapper() {
		return invalidityExceptionWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getClassWrapper() {
		return classWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMissingPatternContainerException() {
		return missingPatternContainerExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternstructureFactory getPatternstructureFactory() {
		return (PatternstructureFactory)getEFactoryInstance();
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
		relationMappingEClass = createEClass(RELATION_MAPPING);
		createEReference(relationMappingEClass, RELATION_MAPPING__TARGET);
		createEReference(relationMappingEClass, RELATION_MAPPING__SOURCE);

		quantifiedConditionEClass = createEClass(QUANTIFIED_CONDITION);
		createEAttribute(quantifiedConditionEClass, QUANTIFIED_CONDITION__QUANTIFIER);
		createEReference(quantifiedConditionEClass, QUANTIFIED_CONDITION__GRAPH);
		createEReference(quantifiedConditionEClass, QUANTIFIED_CONDITION__CONDITION);
		createEOperation(quantifiedConditionEClass, QUANTIFIED_CONDITION___CHECK_MORPHISM_OF_NEXT_GRAPH);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__PATTERN);
		createEReference(conditionEClass, CONDITION__QUANTIFIED_CONDITION);
		createEReference(conditionEClass, CONDITION__FORMULA1);
		createEReference(conditionEClass, CONDITION__FORMULA2);
		createEReference(conditionEClass, CONDITION__NOT_CONDITION);
		createEOperation(conditionEClass, CONDITION___GET_NEXT_MORPHISM_CONTAINERS);

		morphismEClass = createEClass(MORPHISM);
		createEReference(morphismEClass, MORPHISM__MAPPINGS);
		createEReference(morphismEClass, MORPHISM__SOURCE);
		createEReference(morphismEClass, MORPHISM__TARGET);
		createEReference(morphismEClass, MORPHISM__MORPHISM_CONTAINER);
		createEOperation(morphismEClass, MORPHISM___CHECK_ELEMENT_MAPPINGS);
		createEOperation(morphismEClass, MORPHISM___CHECK_RELATION_MAPPINGS);
		createEOperation(morphismEClass, MORPHISM___CHECK_RELATION_MAPPINGS_UNIQUENESS);
		createEOperation(morphismEClass, MORPHISM___CHECK_ELEMENT_MAPPINGS_UNIQUENESS);
		createEOperation(morphismEClass, MORPHISM___ADD_MAPPING__ELEMENT_ELEMENT);
		createEOperation(morphismEClass, MORPHISM___ADD_MAPPING__RELATION_RELATION);
		createEOperation(morphismEClass, MORPHISM___REMOVE_INCONSISTENT_MAPPINGS);

		elementMappingEClass = createEClass(ELEMENT_MAPPING);
		createEReference(elementMappingEClass, ELEMENT_MAPPING__SOURCE);
		createEReference(elementMappingEClass, ELEMENT_MAPPING__TARGET);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__MORPHISM);

		formulaEClass = createEClass(FORMULA);
		createEAttribute(formulaEClass, FORMULA__OPERATOR);
		createEReference(formulaEClass, FORMULA__CONDITION1);
		createEReference(formulaEClass, FORMULA__CONDITION2);

		trueElementEClass = createEClass(TRUE_ELEMENT);

		completePatternEClass = createEClass(COMPLETE_PATTERN);
		createEReference(completePatternEClass, COMPLETE_PATTERN__PARAMETER_LIST);
		createEAttribute(completePatternEClass, COMPLETE_PATTERN__ELEMENT_COUNTER);
		createEAttribute(completePatternEClass, COMPLETE_PATTERN__NAME);
		createEReference(completePatternEClass, COMPLETE_PATTERN__DATABASE);
		createEOperation(completePatternEClass, COMPLETE_PATTERN___GET_NEW_REF_NO);
		createEOperation(completePatternEClass, COMPLETE_PATTERN___RECORD_VALUES);

		patternElementEClass = createEClass(PATTERN_ELEMENT);
		createEAttribute(patternElementEClass, PATTERN_ELEMENT__ID);
		createEAttribute(patternElementEClass, PATTERN_ELEMENT__INTERNAL_ID);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___GENERATE_QUERY);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___GET_ALL_INPUTS);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___PREPARE_TRANSLATION);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___IS_VALID__ABSTRACTIONLEVEL);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___IS_VALID_LOCAL__ABSTRACTIONLEVEL);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___GET_CONTAINER);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___GET_ANCESTOR__CLASS);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___MY_TO_STRING);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___UPDATE_PARAMETERS__PARAMETERLIST);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___GET_PARAMETER_LIST);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___UPDATE_OPERATORS__OPERATORLIST);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___GET_OPERATOR_LIST);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___CREATE_XML_ADAPTION);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___FINALIZE_XML_ADAPTION);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___RECORD_VALUES__XMLDATABASE);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___RELATIONS_XML_ADAPTED);

		notConditionEClass = createEClass(NOT_CONDITION);
		createEReference(notConditionEClass, NOT_CONDITION__CONDITION);

		countConditionEClass = createEClass(COUNT_CONDITION);
		createEReference(countConditionEClass, COUNT_CONDITION__COUNT_PATTERN);
		createEReference(countConditionEClass, COUNT_CONDITION__OPTION);
		createEReference(countConditionEClass, COUNT_CONDITION__ARGUMENT2);

		countConditionArgumentEClass = createEClass(COUNT_CONDITION_ARGUMENT);
		createEReference(countConditionArgumentEClass, COUNT_CONDITION_ARGUMENT__COUNT_CONDITION2);

		morphismContainerEClass = createEClass(MORPHISM_CONTAINER);
		createEReference(morphismContainerEClass, MORPHISM_CONTAINER__MORPHISM);
		createEOperation(morphismContainerEClass, MORPHISM_CONTAINER___GET_GRAPH);
		createEOperation(morphismContainerEClass, MORPHISM_CONTAINER___COPY_PREVIOUS_GRAPH);

		countPatternEClass = createEClass(COUNT_PATTERN);
		createEReference(countPatternEClass, COUNT_PATTERN__COUNT_CONDITION);

		patternEClass = createEClass(PATTERN);
		createEReference(patternEClass, PATTERN__GRAPH);
		createEReference(patternEClass, PATTERN__CONDITION);
		createEAttribute(patternEClass, PATTERN__PARTIAL_QUERY);
		createEAttribute(patternEClass, PATTERN__QUERY);
		createEOperation(patternEClass, PATTERN___CHECK_MORPHISM_OF_NEXT_GRAPH);

		numberElementEClass = createEClass(NUMBER_ELEMENT);
		createEReference(numberElementEClass, NUMBER_ELEMENT__NUMBER_PARAM);

		// Create enums
		logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
		quantifierEEnum = createEEnum(QUANTIFIER);
		locationEEnum = createEEnum(LOCATION);
		abstractionLevelEEnum = createEEnum(ABSTRACTION_LEVEL);

		// Create data types
		invalidityExceptionWrapperEDataType = createEDataType(INVALIDITY_EXCEPTION_WRAPPER);
		classWrapperEDataType = createEDataType(CLASS_WRAPPER);
		missingPatternContainerExceptionEDataType = createEDataType(MISSING_PATTERN_CONTAINER_EXCEPTION);
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
		ExecutionPackage theExecutionPackage = (ExecutionPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationMappingEClass.getESuperTypes().add(this.getMapping());
		quantifiedConditionEClass.getESuperTypes().add(this.getCondition());
		quantifiedConditionEClass.getESuperTypes().add(this.getMorphismContainer());
		conditionEClass.getESuperTypes().add(this.getPatternElement());
		morphismEClass.getESuperTypes().add(this.getPatternElement());
		elementMappingEClass.getESuperTypes().add(this.getMapping());
		mappingEClass.getESuperTypes().add(this.getPatternElement());
		formulaEClass.getESuperTypes().add(this.getCondition());
		trueElementEClass.getESuperTypes().add(this.getCondition());
		completePatternEClass.getESuperTypes().add(this.getPattern());
		notConditionEClass.getESuperTypes().add(this.getCondition());
		countConditionEClass.getESuperTypes().add(this.getCondition());
		countConditionArgumentEClass.getESuperTypes().add(this.getPatternElement());
		morphismContainerEClass.getESuperTypes().add(this.getPatternElement());
		countPatternEClass.getESuperTypes().add(this.getPattern());
		countPatternEClass.getESuperTypes().add(this.getMorphismContainer());
		countPatternEClass.getESuperTypes().add(this.getCountConditionArgument());
		patternEClass.getESuperTypes().add(this.getPatternElement());
		numberElementEClass.getESuperTypes().add(this.getCountConditionArgument());

		// Initialize classes, features, and operations; add parameters
		initEClass(relationMappingEClass, RelationMapping.class, "RelationMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationMapping_Target(), theGraphstructurePackage.getRelation(), theGraphstructurePackage.getRelation_IncomingMapping(), "target", null, 1, 1, RelationMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationMapping_Source(), theGraphstructurePackage.getRelation(), theGraphstructurePackage.getRelation_OutgoingMappings(), "source", null, 1, 1, RelationMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifiedConditionEClass, QuantifiedCondition.class, "QuantifiedCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantifiedCondition_Quantifier(), this.getQuantifier(), "quantifier", null, 0, 1, QuantifiedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedCondition_Graph(), theGraphstructurePackage.getGraph(), theGraphstructurePackage.getGraph_QuantifiedCondition(), "graph", null, 1, 1, QuantifiedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedCondition_Condition(), this.getCondition(), this.getCondition_QuantifiedCondition(), "condition", null, 1, 1, QuantifiedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getQuantifiedCondition__CheckMorphismOfNextGraph(), null, "checkMorphismOfNextGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Pattern(), this.getPattern(), this.getPattern_Condition(), "pattern", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_QuantifiedCondition(), this.getQuantifiedCondition(), this.getQuantifiedCondition_Condition(), "quantifiedCondition", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Formula1(), this.getFormula(), this.getFormula_Condition1(), "formula1", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Formula2(), this.getFormula(), this.getFormula_Condition2(), "formula2", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_NotCondition(), this.getNotCondition(), this.getNotCondition_Condition(), "notCondition", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCondition__GetNextMorphismContainers(), this.getMorphismContainer(), "getNextMorphismContainers", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		initEClass(morphismEClass, Morphism.class, "Morphism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMorphism_Mappings(), this.getMapping(), this.getMapping_Morphism(), "mappings", null, 0, -1, Morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMorphism_Source(), theGraphstructurePackage.getGraph(), theGraphstructurePackage.getGraph_OutgoingMorphisms(), "source", null, 1, 1, Morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMorphism_Target(), theGraphstructurePackage.getGraph(), theGraphstructurePackage.getGraph_IncomingMorphism(), "target", null, 1, 1, Morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMorphism_MorphismContainer(), this.getMorphismContainer(), this.getMorphismContainer_Morphism(), "morphismContainer", null, 0, 1, Morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMorphism__CheckElementMappings(), null, "checkElementMappings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		op = initEOperation(getMorphism__CheckRelationMappings(), null, "checkRelationMappings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		op = initEOperation(getMorphism__CheckRelationMappingsUniqueness(), null, "checkRelationMappingsUniqueness", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		op = initEOperation(getMorphism__CheckElementMappingsUniqueness(), null, "checkElementMappingsUniqueness", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		op = initEOperation(getMorphism__AddMapping__Element_Element(), this.getElementMapping(), "addMapping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphstructurePackage.getElement(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphstructurePackage.getElement(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMorphism__AddMapping__Relation_Relation(), this.getRelationMapping(), "addMapping", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphstructurePackage.getRelation(), "from", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theGraphstructurePackage.getRelation(), "to", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMorphism__RemoveInconsistentMappings(), null, "removeInconsistentMappings", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementMappingEClass, ElementMapping.class, "ElementMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementMapping_Source(), theGraphstructurePackage.getElement(), theGraphstructurePackage.getElement_OutgoingMappings(), "source", null, 1, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementMapping_Target(), theGraphstructurePackage.getElement(), theGraphstructurePackage.getElement_IncomingMapping(), "target", null, 1, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_Morphism(), this.getMorphism(), this.getMorphism_Mappings(), "morphism", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formulaEClass, Formula.class, "Formula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormula_Operator(), this.getLogicalOperator(), "operator", null, 1, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormula_Condition1(), this.getCondition(), this.getCondition_Formula1(), "condition1", null, 1, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormula_Condition2(), this.getCondition(), this.getCondition_Formula2(), "condition2", null, 1, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueElementEClass, TrueElement.class, "TrueElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(completePatternEClass, CompletePattern.class, "CompletePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompletePattern_ParameterList(), theParametersPackage.getParameterList(), theParametersPackage.getParameterList_Pattern(), "parameterList", null, 1, 1, CompletePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletePattern_ElementCounter(), ecorePackage.getEInt(), "elementCounter", "0", 1, 1, CompletePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompletePattern_Name(), ecorePackage.getEString(), "name", null, 0, 1, CompletePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompletePattern_Database(), theExecutionPackage.getDatabase(), theExecutionPackage.getDatabase_Patterns(), "database", null, 0, 1, CompletePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCompletePattern__GetNewRefNo(), ecorePackage.getEInt(), "getNewRefNo", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCompletePattern__RecordValues(), null, "recordValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());
		addEException(op, theOperatorsPackage.getOperatorCycleExceptionWrapper());
		addEException(op, this.getMissingPatternContainerException());

		initEClass(patternElementEClass, PatternElement.class, "PatternElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, PatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternElement_InternalId(), ecorePackage.getEInt(), "internalId", "-1", 1, 1, PatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPatternElement__GenerateQuery(), ecorePackage.getEString(), "generateQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		op = initEOperation(getPatternElement__GetAllInputs(), theParametersPackage.getParameter(), "getAllInputs", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		initEOperation(getPatternElement__PrepareTranslation(), null, "prepareTranslation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternElement__IsValid__AbstractionLevel(), null, "isValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractionLevel(), "abstractionLevel", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());
		addEException(op, theOperatorsPackage.getOperatorCycleExceptionWrapper());

		op = initEOperation(getPatternElement__IsValidLocal__AbstractionLevel(), null, "isValidLocal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractionLevel(), "abstractionLevel", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());
		addEException(op, theOperatorsPackage.getOperatorCycleExceptionWrapper());

		op = initEOperation(getPatternElement__GetContainer(), this.getPatternElement(), "getContainer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getMissingPatternContainerException());

		op = initEOperation(getPatternElement__GetAncestor__Class(), this.getPatternElement(), "getAncestor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getClassWrapper(), "cls", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getMissingPatternContainerException());

		initEOperation(getPatternElement__MyToString(), ecorePackage.getEString(), "myToString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternElement__Validate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternElement__UpdateParameters__ParameterList(), null, "updateParameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theParametersPackage.getParameterList(), "newParameterList", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPatternElement__GetParameterList(), theParametersPackage.getParameterList(), "getParameterList", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternElement__UpdateOperators__OperatorList(), null, "updateOperators", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOperatorsPackage.getOperatorList(), "newOperatorList", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPatternElement__GetOperatorList(), theOperatorsPackage.getOperatorList(), "getOperatorList", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPatternElement__CreateXMLAdaption(), this.getPatternElement(), "createXMLAdaption", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPatternElement__FinalizeXMLAdaption(), null, "finalizeXMLAdaption", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternElement__RecordValues__XmlDatabase(), null, "recordValues", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theExecutionPackage.getXmlDatabase(), "database", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPatternElement__RelationsXmlAdapted(), ecorePackage.getEBoolean(), "relationsXmlAdapted", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(notConditionEClass, NotCondition.class, "NotCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotCondition_Condition(), this.getCondition(), this.getCondition_NotCondition(), "condition", null, 1, 1, NotCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countConditionEClass, CountCondition.class, "CountCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountCondition_CountPattern(), this.getCountPattern(), this.getCountPattern_CountCondition(), "countPattern", null, 1, 1, CountCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountCondition_Option(), theParametersPackage.getComparisonOptionParam(), theParametersPackage.getComparisonOptionParam_CountConditions(), "option", null, 1, 1, CountCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountCondition_Argument2(), this.getCountConditionArgument(), this.getCountConditionArgument_CountCondition2(), "argument2", null, 1, 1, CountCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countConditionArgumentEClass, CountConditionArgument.class, "CountConditionArgument", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountConditionArgument_CountCondition2(), this.getCountCondition(), this.getCountCondition_Argument2(), "countCondition2", null, 0, 1, CountConditionArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(morphismContainerEClass, MorphismContainer.class, "MorphismContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMorphismContainer_Morphism(), this.getMorphism(), this.getMorphism_MorphismContainer(), "morphism", null, 0, 1, MorphismContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMorphismContainer__GetGraph(), theGraphstructurePackage.getGraph(), "getGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMorphismContainer__CopyPreviousGraph(), null, "copyPreviousGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getMissingPatternContainerException());

		initEClass(countPatternEClass, CountPattern.class, "CountPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountPattern_CountCondition(), this.getCountCondition(), this.getCountCondition_CountPattern(), "countCondition", null, 0, 1, CountPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternEClass, Pattern.class, "Pattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPattern_Graph(), theGraphstructurePackage.getGraph(), theGraphstructurePackage.getGraph_Pattern(), "graph", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Condition(), this.getCondition(), this.getCondition_Pattern(), "condition", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_PartialQuery(), ecorePackage.getEString(), "partialQuery", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Query(), ecorePackage.getEString(), "query", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPattern__CheckMorphismOfNextGraph(), null, "checkMorphismOfNextGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		initEClass(numberElementEClass, NumberElement.class, "NumberElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNumberElement_NumberParam(), theParametersPackage.getNumberParam(), theParametersPackage.getNumberParam_NumberArgument(), "numberParam", null, 1, 1, NumberElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.IMPLIES);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.XOR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.EQUAL);

		initEEnum(quantifierEEnum, Quantifier.class, "Quantifier");
		addEEnumLiteral(quantifierEEnum, Quantifier.EXISTS);
		addEEnumLiteral(quantifierEEnum, Quantifier.FORALL);

		initEEnum(locationEEnum, Location.class, "Location");
		addEEnumLiteral(locationEEnum, Location.RETURN);
		addEEnumLiteral(locationEEnum, Location.OUTSIDE);
		addEEnumLiteral(locationEEnum, Location.EXISTS);
		addEEnumLiteral(locationEEnum, Location.FORALL);

		initEEnum(abstractionLevelEEnum, AbstractionLevel.class, "AbstractionLevel");
		addEEnumLiteral(abstractionLevelEEnum, AbstractionLevel.GENERIC);
		addEEnumLiteral(abstractionLevelEEnum, AbstractionLevel.ABSTRACT);
		addEEnumLiteral(abstractionLevelEEnum, AbstractionLevel.CONCRETE);

		// Initialize data types
		initEDataType(invalidityExceptionWrapperEDataType, InvalidityException.class, "InvalidityExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(classWrapperEDataType, Class.class, "ClassWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(missingPatternContainerExceptionEDataType, MissingPatternContainerException.class, "MissingPatternContainerException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PatternstructurePackageImpl
