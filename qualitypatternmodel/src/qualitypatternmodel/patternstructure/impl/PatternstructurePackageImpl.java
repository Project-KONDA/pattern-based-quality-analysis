/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.functions.FunctionsPackage;

import qualitypatternmodel.functions.impl.FunctionsPackageImpl;

import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl;

import qualitypatternmodel.inputfields.InputfieldsPackage;

import qualitypatternmodel.inputfields.impl.InputfieldsPackageImpl;

import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.InvalidTranslationException;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.Mapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.RelationMapping;
import qualitypatternmodel.patternstructure.SingleElementMapping;
import qualitypatternmodel.patternstructure.TranslationLocation;
import qualitypatternmodel.patternstructure.True;
import qualitypatternmodel.patternstructure.VariableList;

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
	private EClass singleElementMappingEClass = null;

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
	private EClass trueEClass = null;

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
	private EClass variableListEClass = null;

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
	private EEnum translationLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidTranslationExceptionWrapperEDataType = null;

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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InputfieldsPackage.eNS_URI);
		InputfieldsPackageImpl theInputfieldsPackage = (InputfieldsPackageImpl)(registeredPackage instanceof InputfieldsPackageImpl ? registeredPackage : InputfieldsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);
		FunctionsPackageImpl theFunctionsPackage = (FunctionsPackageImpl)(registeredPackage instanceof FunctionsPackageImpl ? registeredPackage : FunctionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);
		GraphstructurePackageImpl theGraphstructurePackage = (GraphstructurePackageImpl)(registeredPackage instanceof GraphstructurePackageImpl ? registeredPackage : GraphstructurePackage.eINSTANCE);

		// Create package meta-data objects
		thePatternstructurePackage.createPackageContents();
		theInputfieldsPackage.createPackageContents();
		theFunctionsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();

		// Initialize created meta-data
		thePatternstructurePackage.initializePackageContents();
		theInputfieldsPackage.initializePackageContents();
		theFunctionsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();

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
	public EClass getRelationMapping() {
		return relationMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationMapping_To() {
		return (EReference)relationMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationMapping_From() {
		return (EReference)relationMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifiedCondition() {
		return quantifiedConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedCondition_Condition() {
		return (EReference)quantifiedConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedCondition_Graph() {
		return (EReference)quantifiedConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedCondition_Morphism() {
		return (EReference)quantifiedConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantifiedCondition_Quantifier() {
		return (EAttribute)quantifiedConditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMorphism() {
		return morphismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMorphism_Mappings() {
		return (EReference)morphismEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMorphism_From() {
		return (EReference)morphismEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMorphism_To() {
		return (EReference)morphismEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleElementMapping() {
		return singleElementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleElementMapping_From() {
		return (EReference)singleElementMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleElementMapping_To() {
		return (EReference)singleElementMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormula() {
		return formulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormula_Arguments() {
		return (EReference)formulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormula_Operator() {
		return (EAttribute)formulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrue() {
		return trueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_ReturnGraph() {
		return (EReference)patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_Condition() {
		return (EReference)patternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPattern_VariableList() {
		return (EReference)patternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternElement() {
		return patternElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternElement_Id() {
		return (EAttribute)patternElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatternElement__ToXQuery__TranslationLocation() {
		return patternElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatternElement__IsValid__boolean() {
		return patternElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPatternElement__GetAllVariables() {
		return patternElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableList() {
		return variableListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableList_Variables() {
		return (EReference)variableListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableList_Pattern() {
		return (EReference)variableListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOperator() {
		return logicalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantifier() {
		return quantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTranslationLocation() {
		return translationLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidTranslationExceptionWrapper() {
		return invalidTranslationExceptionWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		createEReference(quantifiedConditionEClass, QUANTIFIED_CONDITION__CONDITION);
		createEReference(quantifiedConditionEClass, QUANTIFIED_CONDITION__GRAPH);
		createEReference(quantifiedConditionEClass, QUANTIFIED_CONDITION__MORPHISM);
		createEAttribute(quantifiedConditionEClass, QUANTIFIED_CONDITION__QUANTIFIER);

		conditionEClass = createEClass(CONDITION);

		morphismEClass = createEClass(MORPHISM);
		createEReference(morphismEClass, MORPHISM__MAPPINGS);
		createEReference(morphismEClass, MORPHISM__FROM);
		createEReference(morphismEClass, MORPHISM__TO);

		singleElementMappingEClass = createEClass(SINGLE_ELEMENT_MAPPING);
		createEReference(singleElementMappingEClass, SINGLE_ELEMENT_MAPPING__FROM);
		createEReference(singleElementMappingEClass, SINGLE_ELEMENT_MAPPING__TO);

		mappingEClass = createEClass(MAPPING);

		formulaEClass = createEClass(FORMULA);
		createEReference(formulaEClass, FORMULA__ARGUMENTS);
		createEAttribute(formulaEClass, FORMULA__OPERATOR);

		trueEClass = createEClass(TRUE);

		patternEClass = createEClass(PATTERN);
		createEReference(patternEClass, PATTERN__RETURN_GRAPH);
		createEReference(patternEClass, PATTERN__CONDITION);
		createEReference(patternEClass, PATTERN__VARIABLE_LIST);

		patternElementEClass = createEClass(PATTERN_ELEMENT);
		createEAttribute(patternElementEClass, PATTERN_ELEMENT__ID);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___IS_VALID__BOOLEAN);
		createEOperation(patternElementEClass, PATTERN_ELEMENT___GET_ALL_VARIABLES);

		variableListEClass = createEClass(VARIABLE_LIST);
		createEReference(variableListEClass, VARIABLE_LIST__VARIABLES);
		createEReference(variableListEClass, VARIABLE_LIST__PATTERN);

		// Create enums
		logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
		quantifierEEnum = createEEnum(QUANTIFIER);
		translationLocationEEnum = createEEnum(TRANSLATION_LOCATION);

		// Create data types
		invalidTranslationExceptionWrapperEDataType = createEDataType(INVALID_TRANSLATION_EXCEPTION_WRAPPER);
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
		InputfieldsPackage theInputfieldsPackage = (InputfieldsPackage)EPackage.Registry.INSTANCE.getEPackage(InputfieldsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationMappingEClass.getESuperTypes().add(this.getMapping());
		quantifiedConditionEClass.getESuperTypes().add(this.getCondition());
		conditionEClass.getESuperTypes().add(this.getPatternElement());
		morphismEClass.getESuperTypes().add(this.getPatternElement());
		singleElementMappingEClass.getESuperTypes().add(this.getMapping());
		mappingEClass.getESuperTypes().add(this.getPatternElement());
		formulaEClass.getESuperTypes().add(this.getCondition());
		trueEClass.getESuperTypes().add(this.getCondition());
		patternEClass.getESuperTypes().add(this.getPatternElement());
		variableListEClass.getESuperTypes().add(this.getPatternElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(relationMappingEClass, RelationMapping.class, "RelationMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationMapping_To(), theGraphstructurePackage.getRelation(), theGraphstructurePackage.getRelation_MappingTo(), "to", null, 1, 1, RelationMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationMapping_From(), theGraphstructurePackage.getRelation(), theGraphstructurePackage.getRelation_MappingFrom(), "from", null, 1, 1, RelationMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifiedConditionEClass, QuantifiedCondition.class, "QuantifiedCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantifiedCondition_Condition(), this.getCondition(), null, "condition", null, 1, 1, QuantifiedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedCondition_Graph(), theGraphstructurePackage.getGraph(), null, "graph", null, 1, 1, QuantifiedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedCondition_Morphism(), this.getMorphism(), null, "morphism", null, 1, 1, QuantifiedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuantifiedCondition_Quantifier(), this.getQuantifier(), "quantifier", null, 0, 1, QuantifiedCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(morphismEClass, Morphism.class, "Morphism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMorphism_Mappings(), this.getMapping(), null, "mappings", null, 0, -1, Morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMorphism_From(), theGraphstructurePackage.getGraph(), null, "from", null, 1, 1, Morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMorphism_To(), theGraphstructurePackage.getGraph(), null, "to", null, 1, 1, Morphism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleElementMappingEClass, SingleElementMapping.class, "SingleElementMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleElementMapping_From(), theGraphstructurePackage.getSingleElement(), theGraphstructurePackage.getSingleElement_MappingFrom(), "from", null, 1, 1, SingleElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleElementMapping_To(), theGraphstructurePackage.getSingleElement(), theGraphstructurePackage.getSingleElement_MappingTo(), "to", null, 1, 1, SingleElementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formulaEClass, Formula.class, "Formula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormula_Arguments(), this.getCondition(), null, "arguments", null, 1, -1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormula_Operator(), this.getLogicalOperator(), "operator", null, 0, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trueEClass, True.class, "True", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPattern_ReturnGraph(), theGraphstructurePackage.getGraph(), null, "returnGraph", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Condition(), this.getCondition(), null, "condition", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_VariableList(), this.getVariableList(), this.getVariableList_Pattern(), "variableList", null, 1, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternElementEClass, PatternElement.class, "PatternElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternElement_Id(), ecorePackage.getEInt(), "id", null, 0, 1, PatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPatternElement__ToXQuery__TranslationLocation(), ecorePackage.getEString(), "toXQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTranslationLocation(), "tranlsationLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidTranslationExceptionWrapper());

		op = initEOperation(getPatternElement__IsValid__boolean(), null, "isValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isDefinedPattern", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidTranslationExceptionWrapper());

		op = initEOperation(getPatternElement__GetAllVariables(), theInputfieldsPackage.getInput(), "getAllVariables", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInvalidTranslationExceptionWrapper());

		initEClass(variableListEClass, VariableList.class, "VariableList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableList_Variables(), theInputfieldsPackage.getInput(), theInputfieldsPackage.getInput_VariableList(), "variables", null, 0, -1, VariableList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableList_Pattern(), this.getPattern(), this.getPattern_VariableList(), "pattern", null, 1, 1, VariableList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.NOT);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.IMPLIES);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.XOR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.EQUIVALENT);

		initEEnum(quantifierEEnum, Quantifier.class, "Quantifier");
		addEEnumLiteral(quantifierEEnum, Quantifier.EXISTS);
		addEEnumLiteral(quantifierEEnum, Quantifier.FORALL);

		initEEnum(translationLocationEEnum, TranslationLocation.class, "TranslationLocation");
		addEEnumLiteral(translationLocationEEnum, TranslationLocation.RETURN);
		addEEnumLiteral(translationLocationEEnum, TranslationLocation.OUTSIDE);
		addEEnumLiteral(translationLocationEEnum, TranslationLocation.EXISTS);
		addEEnumLiteral(translationLocationEEnum, TranslationLocation.FORALL);

		// Initialize data types
		initEDataType(invalidTranslationExceptionWrapperEDataType, InvalidTranslationException.class, "InvalidTranslationExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PatternstructurePackageImpl
