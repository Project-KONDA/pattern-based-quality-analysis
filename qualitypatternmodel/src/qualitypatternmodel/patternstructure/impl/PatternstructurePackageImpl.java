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
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.functions.FunctionsPackage;

import qualitypatternmodel.functions.impl.FunctionsPackageImpl;

import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ParametersPackageImpl;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountConditionArgument;
import qualitypatternmodel.patternstructure.Count;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.GraphContainer;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.Mapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.Pattern;
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
	private EClass patternEClass = null;

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
	private EClass countEClass = null;

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
	private EClass graphContainerEClass = null;

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(registeredPackage instanceof FunctionsPackageImpl ? registeredPackage : FunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);
		GraphstructurePackageImpl theGraphstructurePackage = (GraphstructurePackageImpl)(registeredPackage instanceof GraphstructurePackageImpl ? registeredPackage : GraphstructurePackage.eINSTANCE);

		// Create package meta-data objects
		thePatternstructurePackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();

		// Initialize created meta-data
		thePatternstructurePackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();

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
	public EReference getRelationMapping_To() {
		return (EReference)relationMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationMapping_From() {
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
	public EReference getQuantifiedCondition_Morphism() {
		return (EReference)quantifiedConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantifiedCondition_CountCondition() {
		return (EReference)quantifiedConditionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuantifiedCondition__CopyPreviousGraph() {
		return quantifiedConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQuantifiedCondition__CheckMorphismOfNextGraph() {
		return quantifiedConditionEClass.getEOperations().get(1);
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
	public EAttribute getCondition_CondDepth() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_Pattern() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_Quantifiedcondition() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_Formula1() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_Formula2() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondition_NotCondition() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCondition__GetNextQuantifiedConditions() {
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
		return (EReference)morphismEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMorphism_From() {
		return (EReference)morphismEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMorphism_To() {
		return (EReference)morphismEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMorphism_Count() {
		return (EReference)morphismEClass.getEStructuralFeatures().get(4);
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
	public EClass getElementMapping() {
		return elementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementMapping_From() {
		return (EReference)elementMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementMapping_To() {
		return (EReference)elementMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMorphism_MorphDepth() {
		return (EAttribute)morphismEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getMapping_MappingDepth() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_Morphism() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
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
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPattern_ParameterList() {
		return (EReference)patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPattern_Condition() {
		return (EReference)patternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_ElementCounter() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPattern_Name() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPattern_Count() {
		return (EReference)patternEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPattern__GenerateQuery() {
		return patternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPattern_Graph() {
		return (EReference)patternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPattern__GetNewRefNo() {
		return patternEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPattern__CheckMorphismOfNextGraph() {
		return patternEClass.getEOperations().get(2);
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
	public EOperation getPatternElement__GenerateQuery__Location() {
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
	public EOperation getPatternElement__Validate__DiagnosticChain_Map() {
		return patternElementEClass.getEOperations().get(8);
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
	public EReference getCountCondition_Count1() {
		return (EReference)countConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountCondition_NumberParam() {
		return (EReference)countConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountCondition_QuantifiedConditionCount() {
		return (EReference)countConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountCondition_Count2() {
		return (EReference)countConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountCondition_Option() {
		return (EReference)countConditionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCountCondition_OptionParam() {
		return (EReference)countConditionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCountCondition__GetArgument1() {
		return countConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCountCondition__GetArgument2() {
		return countConditionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCount() {
		return countEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCount_CountCondition1() {
		return (EReference)countEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCount_Pattern() {
		return (EReference)countEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCount_Morphism() {
		return (EReference)countEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCount_CountCondition2() {
		return (EReference)countEClass.getEStructuralFeatures().get(3);
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
	public EClass getGraphContainer() {
		return graphContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraphContainer__GetGraph() {
		return graphContainerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraphContainer__GetMorphism() {
		return graphContainerEClass.getEOperations().get(1);
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
	public EOperation getPatternElement__IsValid__boolean() {
		return patternElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPatternElement__IsValidLocal__boolean() {
		return patternElementEClass.getEOperations().get(4);
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
		createEReference(relationMappingEClass, RELATION_MAPPING__TO);
		createEReference(relationMappingEClass, RELATION_MAPPING__FROM);

		quantifiedConditionEClass = createEClass(QUANTIFIED_CONDITION);
		createEAttribute(quantifiedConditionEClass, QUANTIFIED_CONDITION__QUANTIFIER);
		createEReference(quantifiedConditionEClass, QUANTIFIED_CONDITION__GRAPH);
		createEReference(quantifiedConditionEClass, QUANTIFIED_CONDITION__CONDITION);
		createEReference(quantifiedConditionEClass, QUANTIFIED_CONDITION__MORPHISM);
		createEReference(quantifiedConditionEClass, QUANTIFIED_CONDITION__COUNT_CONDITION);
		createEOperation(quantifiedConditionEClass, QUANTIFIED_CONDITION___COPY_PREVIOUS_GRAPH);
		createEOperation(quantifiedConditionEClass, QUANTIFIED_CONDITION___CHECK_MORPHISM_OF_NEXT_GRAPH);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__COND_DEPTH);
		createEReference(conditionEClass, CONDITION__PATTERN);
		createEReference(conditionEClass, CONDITION__QUANTIFIEDCONDITION);
		createEReference(conditionEClass, CONDITION__FORMULA1);
		createEReference(conditionEClass, CONDITION__FORMULA2);
		createEReference(conditionEClass, CONDITION__NOT_CONDITION);
		createEOperation(conditionEClass, CONDITION___GET_NEXT_QUANTIFIED_CONDITIONS);

		morphismEClass = createEClass(MORPHISM);
		createEAttribute(morphismEClass, MORPHISM__MORPH_DEPTH);
		createEReference(morphismEClass, MORPHISM__MAPPINGS);
		createEReference(morphismEClass, MORPHISM__FROM);
		createEReference(morphismEClass, MORPHISM__TO);
		createEReference(morphismEClass, MORPHISM__COUNT);
		createEOperation(morphismEClass, MORPHISM___CHECK_ELEMENT_MAPPINGS);
		createEOperation(morphismEClass, MORPHISM___CHECK_RELATION_MAPPINGS);
		createEOperation(morphismEClass, MORPHISM___CHECK_RELATION_MAPPINGS_UNIQUENESS);
		createEOperation(morphismEClass, MORPHISM___CHECK_ELEMENT_MAPPINGS_UNIQUENESS);

		elementMappingEClass = createEClass(ELEMENT_MAPPING);
		createEReference(elementMappingEClass, ELEMENT_MAPPING__FROM);
		createEReference(elementMappingEClass, ELEMENT_MAPPING__TO);

		mappingEClass = createEClass(MAPPING);
		createEAttribute(mappingEClass, MAPPING__MAPPING_DEPTH);
		createEReference(mappingEClass, MAPPING__MORPHISM);

		formulaEClass = createEClass(FORMULA);
		createEAttribute(formulaEClass, FORMULA__OPERATOR);
		createEReference(formulaEClass, FORMULA__CONDITION1);
		createEReference(formulaEClass, FORMULA__CONDITION2);

		trueElementEClass = createEClass(TRUE_ELEMENT);

		patternEClass = createEClass(PATTERN);
		createEReference(patternEClass, PATTERN__PARAMETER_LIST);
		createEReference(patternEClass, PATTERN__GRAPH);
		createEReference(patternEClass, PATTERN__CONDITION);
		createEAttribute(patternEClass, PATTERN__ELEMENT_COUNTER);
		createEAttribute(patternEClass, PATTERN__NAME);
		createEReference(patternEClass, PATTERN__COUNT);
		createEOperation(patternEClass, PATTERN___GENERATE_QUERY);
		createEOperation(patternEClass, PATTERN___GET_NEW_REF_NO);
		createEOperation(patternEClass, PATTERN___CHECK_MORPHISM_OF_NEXT_GRAPH);

		patternElementEClass = createEClass(PATTERN_ELEMENT);
		createEAttribute(patternElementEClass, PATTERN_ELEMENT__ID);
		createEAttribute(patternElementEClass, PATTERN_ELEMENT__INTERNAL_ID);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___GENERATE_QUERY__LOCATION);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___GET_ALL_INPUTS);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___PREPARE_TRANSLATION);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___IS_VALID__BOOLEAN);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___GET_CONTAINER);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___GET_ANCESTOR__CLASS);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___MY_TO_STRING);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP);

		notConditionEClass = createEClass(NOT_CONDITION);
		createEReference(notConditionEClass, NOT_CONDITION__CONDITION);

		countConditionEClass = createEClass(COUNT_CONDITION);
		createEReference(countConditionEClass, COUNT_CONDITION__COUNT1);
		createEReference(countConditionEClass, COUNT_CONDITION__NUMBER_PARAM);
		createEReference(countConditionEClass, COUNT_CONDITION__QUANTIFIED_CONDITION_COUNT);
		createEReference(countConditionEClass, COUNT_CONDITION__COUNT2);
		createEReference(countConditionEClass, COUNT_CONDITION__OPTION);
		createEReference(countConditionEClass, COUNT_CONDITION__OPTION_PARAM);
		createEOperation(countConditionEClass, COUNT_CONDITION___GET_ARGUMENT1);
		createEOperation(countConditionEClass, COUNT_CONDITION___GET_ARGUMENT2);

		countEClass = createEClass(COUNT);
		createEReference(countEClass, COUNT__COUNT_CONDITION1);
		createEReference(countEClass, COUNT__PATTERN);
		createEReference(countEClass, COUNT__MORPHISM);
		createEReference(countEClass, COUNT__COUNT_CONDITION2);

		countConditionArgumentEClass = createEClass(COUNT_CONDITION_ARGUMENT);

		graphContainerEClass = createEClass(GRAPH_CONTAINER);
		createEOperation(graphContainerEClass, GRAPH_CONTAINER___GET_GRAPH);
		createEOperation(graphContainerEClass, GRAPH_CONTAINER___GET_MORPHISM);

		// Create enums
		logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
		quantifierEEnum = createEEnum(QUANTIFIER);
		locationEEnum = createEEnum(LOCATION);

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
		FunctionsPackage theFunctionsPackage = (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationMappingEClass.getESuperTypes().add(this.getMapping());
		quantifiedConditionEClass.getESuperTypes().add(this.getCondition());
		quantifiedConditionEClass.getESuperTypes().add(this.getGraphContainer());
		conditionEClass.getESuperTypes().add(this.getPatternElement());
		morphismEClass.getESuperTypes().add(this.getPatternElement());
		elementMappingEClass.getESuperTypes().add(this.getMapping());
		mappingEClass.getESuperTypes().add(this.getPatternElement());
		formulaEClass.getESuperTypes().add(this.getCondition());
		trueElementEClass.getESuperTypes().add(this.getCondition());
		patternEClass.getESuperTypes().add(this.getPatternElement());
		notConditionEClass.getESuperTypes().add(this.getCondition());
		countConditionEClass.getESuperTypes().add(this.getCondition());
		countEClass.getESuperTypes().add(this.getPatternElement());
		countEClass.getESuperTypes().add(this.getCountConditionArgument());
		countEClass.getESuperTypes().add(this.getGraphContainer());
		countConditionArgumentEClass.getESuperTypes().add(this.getPatternElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(relationMappingEClass, RelationMapping.class, "RelationMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationMapping_To(), theGraphstructurePackage.getRelation(), theGraphstructurePackage.getRelation_MappingFrom(), "to", null, 1, 1, RelationMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationMapping_From(), theGraphstructurePackage.getRelation(), theGraphstructurePackage.getRelation_MappingTo(), "from", null, 1, 1, RelationMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifiedConditionEClass, QuantifiedCondition.class, "QuantifiedCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuantifiedCondition_Quantifier(), this.getQuantifier(), "quantifier", null, 0, 1, QuantifiedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedCondition_Graph(), theGraphstructurePackage.getGraph(), theGraphstructurePackage.getGraph_QuantifiedCondition(), "graph", null, 1, 1, QuantifiedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedCondition_Condition(), this.getCondition(), this.getCondition_Quantifiedcondition(), "condition", null, 1, 1, QuantifiedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedCondition_Morphism(), this.getMorphism(), null, "morphism", null, 1, 1, QuantifiedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedCondition_CountCondition(), this.getCountCondition(), this.getCountCondition_QuantifiedConditionCount(), "countCondition", null, 0, 1, QuantifiedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getQuantifiedCondition__CopyPreviousGraph(), null, "copyPreviousGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getMissingPatternContainerException());

		op = initEOperation(getQuantifiedCondition__CheckMorphismOfNextGraph(), null, "checkMorphismOfNextGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_CondDepth(), ecorePackage.getEInt(), "condDepth", "-1", 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Pattern(), this.getPattern(), this.getPattern_Condition(), "pattern", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Quantifiedcondition(), this.getQuantifiedCondition(), this.getQuantifiedCondition_Condition(), "quantifiedcondition", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Formula1(), this.getFormula(), this.getFormula_Condition1(), "formula1", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_Formula2(), this.getFormula(), this.getFormula_Condition2(), "formula2", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_NotCondition(), this.getNotCondition(), this.getNotCondition_Condition(), "notCondition", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCondition__GetNextQuantifiedConditions(), this.getGraphContainer(), "getNextQuantifiedConditions", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		initEClass(morphismEClass, Morphism.class, "Morphism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMorphism_MorphDepth(), ecorePackage.getEInt(), "morphDepth", "-1", 1, 1, Morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMorphism_Mappings(), this.getMapping(), this.getMapping_Morphism(), "mappings", null, 0, -1, Morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMorphism_From(), theGraphstructurePackage.getGraph(), theGraphstructurePackage.getGraph_MorphismTo(), "from", null, 1, 1, Morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMorphism_To(), theGraphstructurePackage.getGraph(), theGraphstructurePackage.getGraph_MorphismFrom(), "to", null, 1, 1, Morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMorphism_Count(), this.getCount(), this.getCount_Morphism(), "count", null, 0, 1, Morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMorphism__CheckElementMappings(), null, "checkElementMappings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		op = initEOperation(getMorphism__CheckRelationMappings(), null, "checkRelationMappings", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		op = initEOperation(getMorphism__CheckRelationMappingsUniqueness(), null, "checkRelationMappingsUniqueness", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		op = initEOperation(getMorphism__CheckElementMappingsUniqueness(), null, "checkElementMappingsUniqueness", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		initEClass(elementMappingEClass, ElementMapping.class, "ElementMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementMapping_From(), theGraphstructurePackage.getElement(), theGraphstructurePackage.getElement_MappingTo(), "from", null, 1, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementMapping_To(), theGraphstructurePackage.getElement(), theGraphstructurePackage.getElement_MappingFrom(), "to", null, 1, 1, ElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapping_MappingDepth(), ecorePackage.getEInt(), "mappingDepth", "-1", 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_Morphism(), this.getMorphism(), this.getMorphism_Mappings(), "morphism", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formulaEClass, Formula.class, "Formula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormula_Operator(), this.getLogicalOperator(), "operator", null, 1, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormula_Condition1(), this.getCondition(), this.getCondition_Formula1(), "condition1", null, 1, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormula_Condition2(), this.getCondition(), this.getCondition_Formula2(), "condition2", null, 1, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueElementEClass, TrueElement.class, "TrueElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPattern_ParameterList(), theParametersPackage.getParameterList(), theParametersPackage.getParameterList_Pattern(), "parameterList", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Graph(), theGraphstructurePackage.getGraph(), theGraphstructurePackage.getGraph_Pattern(), "graph", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Condition(), this.getCondition(), this.getCondition_Pattern(), "condition", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_ElementCounter(), ecorePackage.getEInt(), "elementCounter", "0", 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPattern_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Count(), this.getCount(), this.getCount_Pattern(), "count", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPattern__GenerateQuery(), ecorePackage.getEString(), "generateQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		initEOperation(getPattern__GetNewRefNo(), ecorePackage.getEInt(), "getNewRefNo", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPattern__CheckMorphismOfNextGraph(), null, "checkMorphismOfNextGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		initEClass(patternElementEClass, PatternElement.class, "PatternElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, PatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatternElement_InternalId(), ecorePackage.getEInt(), "internalId", "-1", 1, 1, PatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPatternElement__GenerateQuery__Location(), ecorePackage.getEString(), "generateQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLocation(), "location", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		op = initEOperation(getPatternElement__GetAllInputs(), theParametersPackage.getParameter(), "getAllInputs", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		initEOperation(getPatternElement__PrepareTranslation(), null, "prepareTranslation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPatternElement__IsValid__boolean(), null, "isValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isDefinedPattern", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());
		addEException(op, theFunctionsPackage.getOperatorCycleExceptionWrapper());

		op = initEOperation(getPatternElement__IsValidLocal__boolean(), null, "isValidLocal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isDefinedPattern", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());
		addEException(op, theFunctionsPackage.getOperatorCycleExceptionWrapper());

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

		initEClass(notConditionEClass, NotCondition.class, "NotCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotCondition_Condition(), this.getCondition(), this.getCondition_NotCondition(), "condition", null, 1, 1, NotCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countConditionEClass, CountCondition.class, "CountCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountCondition_Count1(), this.getCount(), this.getCount_CountCondition1(), "count1", null, 1, 1, CountCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountCondition_NumberParam(), theParametersPackage.getNumberParam(), theParametersPackage.getNumberParam_CountComparison(), "numberParam", null, 0, 1, CountCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountCondition_QuantifiedConditionCount(), this.getQuantifiedCondition(), this.getQuantifiedCondition_CountCondition(), "quantifiedConditionCount", null, 0, 1, CountCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountCondition_Count2(), this.getCount(), this.getCount_CountCondition2(), "count2", null, 0, 1, CountCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountCondition_Option(), theParametersPackage.getComparisonOptionParam(), theParametersPackage.getComparisonOptionParam_CountCondition(), "option", null, 1, 1, CountCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCountCondition_OptionParam(), theParametersPackage.getOptionParam(), theParametersPackage.getOptionParam_Countcondition(), "optionParam", null, 1, 1, CountCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCountCondition__GetArgument1(), this.getCountConditionArgument(), "getArgument1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		op = initEOperation(getCountCondition__GetArgument2(), this.getCountConditionArgument(), "getArgument2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidityExceptionWrapper());

		initEClass(countEClass, Count.class, "Count", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCount_CountCondition1(), this.getCountCondition(), this.getCountCondition_Count1(), "countCondition1", null, 0, 1, Count.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCount_Pattern(), this.getPattern(), this.getPattern_Count(), "pattern", null, 1, 1, Count.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCount_Morphism(), this.getMorphism(), this.getMorphism_Count(), "morphism", null, 1, 1, Count.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCount_CountCondition2(), this.getCountCondition(), this.getCountCondition_Count2(), "countCondition2", null, 0, 1, Count.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countConditionArgumentEClass, CountConditionArgument.class, "CountConditionArgument", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphContainerEClass, GraphContainer.class, "GraphContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getGraphContainer__GetGraph(), theGraphstructurePackage.getGraph(), "getGraph", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGraphContainer__GetMorphism(), this.getMorphism(), "getMorphism", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		// Initialize data types
		initEDataType(invalidityExceptionWrapperEDataType, InvalidityException.class, "InvalidityExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(classWrapperEDataType, Class.class, "ClassWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(missingPatternContainerExceptionEDataType, MissingPatternContainerException.class, "MissingPatternContainerException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PatternstructurePackageImpl
