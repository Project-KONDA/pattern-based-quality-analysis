/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.Axis;
import QualityPatternModel.Comparison;
import QualityPatternModel.ComparisonOperator;
import QualityPatternModel.Condition;
import QualityPatternModel.Element;
import QualityPatternModel.Formula;
import QualityPatternModel.Graph;
import QualityPatternModel.Location;
import QualityPatternModel.LogicalOperator;
import QualityPatternModel.Mapping;
import QualityPatternModel.Match;
import QualityPatternModel.Morphism;
import QualityPatternModel.Option;
import QualityPatternModel.Pattern;
import QualityPatternModel.Property;
import QualityPatternModel.QualityPatternModelFactory;
import QualityPatternModel.QualityPatternModelPackage;
import QualityPatternModel.QuantifiedCondition;
import QualityPatternModel.Quantifier;
import QualityPatternModel.Relation;
import QualityPatternModel.RelationMapping;
import QualityPatternModel.SetElement;
import QualityPatternModel.SingleElement;
import QualityPatternModel.SingleElementMapping;
import QualityPatternModel.Text;
import QualityPatternModel.True;
import QualityPatternModel.VariableList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualityPatternModelFactoryImpl extends EFactoryImpl implements QualityPatternModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QualityPatternModelFactory init() {
		try {
			QualityPatternModelFactory theQualityPatternModelFactory = (QualityPatternModelFactory)EPackage.Registry.INSTANCE.getEFactory(QualityPatternModelPackage.eNS_URI);
			if (theQualityPatternModelFactory != null) {
				return theQualityPatternModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QualityPatternModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityPatternModelFactoryImpl() {
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
			case QualityPatternModelPackage.PATTERN: return createPattern();
			case QualityPatternModelPackage.CONDITION: return createCondition();
			case QualityPatternModelPackage.QUANTIFIED_CONDITION: return createQuantifiedCondition();
			case QualityPatternModelPackage.FORMULA: return createFormula();
			case QualityPatternModelPackage.TRUE: return createTrue();
			case QualityPatternModelPackage.GRAPH: return createGraph();
			case QualityPatternModelPackage.ELEMENT: return createElement();
			case QualityPatternModelPackage.SET_ELEMENT: return createSetElement();
			case QualityPatternModelPackage.SINGLE_ELEMENT: return createSingleElement();
			case QualityPatternModelPackage.PROPERTY: return createProperty();
			case QualityPatternModelPackage.TEXT: return createText();
			case QualityPatternModelPackage.NUMBER: return createNumber();
			case QualityPatternModelPackage.BOOLEAN: return createBoolean();
			case QualityPatternModelPackage.OPTION: return createOption();
			case QualityPatternModelPackage.MAPPING: return createMapping();
			case QualityPatternModelPackage.MORPHISM: return createMorphism();
			case QualityPatternModelPackage.VARIABLE_LIST: return createVariableList();
			case QualityPatternModelPackage.RELATION: return createRelation();
			case QualityPatternModelPackage.COMPARISON: return createComparison();
			case QualityPatternModelPackage.MATCH: return createMatch();
			case QualityPatternModelPackage.SINGLE_ELEMENT_MAPPING: return createSingleElementMapping();
			case QualityPatternModelPackage.RELATION_MAPPING: return createRelationMapping();
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
			case QualityPatternModelPackage.AXIS:
				return createAxisFromString(eDataType, initialValue);
			case QualityPatternModelPackage.LOCATION:
				return createLocationFromString(eDataType, initialValue);
			case QualityPatternModelPackage.LOGICAL_OPERATOR:
				return createLogicalOperatorFromString(eDataType, initialValue);
			case QualityPatternModelPackage.QUANTIFIER:
				return createQuantifierFromString(eDataType, initialValue);
			case QualityPatternModelPackage.COMPARISON_OPERATOR:
				return createComparisonOperatorFromString(eDataType, initialValue);
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
			case QualityPatternModelPackage.AXIS:
				return convertAxisToString(eDataType, instanceValue);
			case QualityPatternModelPackage.LOCATION:
				return convertLocationToString(eDataType, instanceValue);
			case QualityPatternModelPackage.LOGICAL_OPERATOR:
				return convertLogicalOperatorToString(eDataType, instanceValue);
			case QualityPatternModelPackage.QUANTIFIER:
				return convertQuantifierToString(eDataType, instanceValue);
			case QualityPatternModelPackage.COMPARISON_OPERATOR:
				return convertComparisonOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiedCondition createQuantifiedCondition() {
		QuantifiedConditionImpl quantifiedCondition = new QuantifiedConditionImpl();
		return quantifiedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formula createFormula() {
		FormulaImpl formula = new FormulaImpl();
		return formula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public True createTrue() {
		TrueImpl true_ = new TrueImpl();
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetElement createSetElement() {
		SetElementImpl setElement = new SetElementImpl();
		return setElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElement createSingleElement() {
		SingleElementImpl singleElement = new SingleElementImpl();
		return singleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityPatternModel.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityPatternModel.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Morphism createMorphism() {
		MorphismImpl morphism = new MorphismImpl();
		return morphism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableList createVariableList() {
		VariableListImpl variableList = new VariableListImpl();
		return variableList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison createComparison() {
		ComparisonImpl comparison = new ComparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElementMapping createSingleElementMapping() {
		SingleElementMappingImpl singleElementMapping = new SingleElementMappingImpl();
		return singleElementMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationMapping createRelationMapping() {
		RelationMappingImpl relationMapping = new RelationMappingImpl();
		return relationMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis createAxisFromString(EDataType eDataType, String initialValue) {
		Axis result = Axis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocationFromString(EDataType eDataType, String initialValue) {
		Location result = Location.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public ComparisonOperator createComparisonOperatorFromString(EDataType eDataType, String initialValue) {
		ComparisonOperator result = ComparisonOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityPatternModelPackage getQualityPatternModelPackage() {
		return (QualityPatternModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QualityPatternModelPackage getPackage() {
		return QualityPatternModelPackage.eINSTANCE;
	}

} //QualityPatternModelFactoryImpl
