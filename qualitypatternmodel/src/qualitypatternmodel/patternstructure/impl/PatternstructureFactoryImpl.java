/**
 */
package qualitypatternmodel.patternstructure.impl;

import de.gwdg.metadataqa.api.schema.BaseSchema;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.patternstructure.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternstructureFactoryImpl extends EFactoryImpl implements PatternstructureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PatternstructureFactory init() {
		try {
			PatternstructureFactory thePatternstructureFactory = (PatternstructureFactory)EPackage.Registry.INSTANCE.getEFactory(PatternstructurePackage.eNS_URI);
			if (thePatternstructureFactory != null) {
				return thePatternstructureFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PatternstructureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternstructureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PatternstructurePackage.QUANTIFIED_CONDITION: return createQuantifiedCondition();
			case PatternstructurePackage.MORPHISM: return createMorphism();
			case PatternstructurePackage.FORMULA: return createFormula();
			case PatternstructurePackage.TRUE_ELEMENT: return createTrueElement();
			case PatternstructurePackage.COMPLETE_PATTERN: return createCompletePattern();
			case PatternstructurePackage.NOT_CONDITION: return createNotCondition();
			case PatternstructurePackage.COUNT_CONDITION: return createCountCondition();
			case PatternstructurePackage.COUNT_PATTERN: return createCountPattern();
			case PatternstructurePackage.NUMBER_ELEMENT: return createNumberElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PatternstructurePackage.LOGICAL_OPERATOR:
				return createLogicalOperatorFromString(eDataType, initialValue);
			case PatternstructurePackage.QUANTIFIER:
				return createQuantifierFromString(eDataType, initialValue);
			case PatternstructurePackage.ABSTRACTION_LEVEL:
				return createAbstractionLevelFromString(eDataType, initialValue);
			case PatternstructurePackage.LANGUAGE:
				return createLanguageFromString(eDataType, initialValue);
			case PatternstructurePackage.INVALIDITY_EXCEPTION_WRAPPER:
				return createInvalidityExceptionWrapperFromString(eDataType, initialValue);
			case PatternstructurePackage.CLASS_WRAPPER:
				return createClassWrapperFromString(eDataType, initialValue);
			case PatternstructurePackage.MISSING_PATTERN_CONTAINER_EXCEPTION:
				return createMissingPatternContainerExceptionFromString(eDataType, initialValue);
			case PatternstructurePackage.BASE_SCHEMA_WRAPPER:
				return createBaseSchemaWrapperFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PatternstructurePackage.LOGICAL_OPERATOR:
				return convertLogicalOperatorToString(eDataType, instanceValue);
			case PatternstructurePackage.QUANTIFIER:
				return convertQuantifierToString(eDataType, instanceValue);
			case PatternstructurePackage.ABSTRACTION_LEVEL:
				return convertAbstractionLevelToString(eDataType, instanceValue);
			case PatternstructurePackage.LANGUAGE:
				return convertLanguageToString(eDataType, instanceValue);
			case PatternstructurePackage.INVALIDITY_EXCEPTION_WRAPPER:
				return convertInvalidityExceptionWrapperToString(eDataType, instanceValue);
			case PatternstructurePackage.CLASS_WRAPPER:
				return convertClassWrapperToString(eDataType, instanceValue);
			case PatternstructurePackage.MISSING_PATTERN_CONTAINER_EXCEPTION:
				return convertMissingPatternContainerExceptionToString(eDataType, instanceValue);
			case PatternstructurePackage.BASE_SCHEMA_WRAPPER:
				return convertBaseSchemaWrapperToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifiedCondition createQuantifiedCondition() {
		QuantifiedConditionImpl quantifiedCondition = new QuantifiedConditionImpl();
		return quantifiedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Morphism createMorphism() {
		MorphismImpl morphism = new MorphismImpl();
		return morphism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Formula createFormula() {
		FormulaImpl formula = new FormulaImpl();
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrueElement createTrueElement() {
		TrueElementImpl trueElement = new TrueElementImpl();
		return trueElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompletePattern createCompletePattern() {
		CompletePatternImpl completePattern = new CompletePatternImpl();
		return completePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotCondition createNotCondition() {
		NotConditionImpl notCondition = new NotConditionImpl();
		return notCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountCondition createCountCondition() {
		CountConditionImpl countCondition = new CountConditionImpl();
		return countCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountPattern createCountPattern() {
		CountPatternImpl countPattern = new CountPatternImpl();
		return countPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberElement createNumberElement() {
		NumberElementImpl numberElement = new NumberElementImpl();
		return numberElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue) {
		LogicalOperator result = LogicalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier createQuantifierFromString(EDataType eDataType, String initialValue) {
		Quantifier result = Quantifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractionLevel createAbstractionLevelFromString(EDataType eDataType, String initialValue) {
		AbstractionLevel result = AbstractionLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractionLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguageFromString(EDataType eDataType, String initialValue) {
		Language result = Language.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidityException createInvalidityExceptionWrapperFromString(EDataType eDataType, String initialValue) {
		return (InvalidityException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvalidityExceptionWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	public Class createClassWrapperFromString(EDataType eDataType, String initialValue) {
		return (Class)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissingPatternContainerException createMissingPatternContainerExceptionFromString(EDataType eDataType, String initialValue) {
		return (MissingPatternContainerException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMissingPatternContainerExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseSchema createBaseSchemaWrapperFromString(EDataType eDataType, String initialValue) {
		return (BaseSchema)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaseSchemaWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternstructurePackage getPatternstructurePackage() {
		return (PatternstructurePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PatternstructurePackage getPackage() {
		return PatternstructurePackage.eINSTANCE;
	}

} //PatternstructureFactoryImpl
