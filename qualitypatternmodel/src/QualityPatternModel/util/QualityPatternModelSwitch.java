/**
 */
package QualityPatternModel.util;

import QualityPatternModel.BooleanOperator;
import QualityPatternModel.Comparison;
import QualityPatternModel.Condition;
import QualityPatternModel.Count;
import QualityPatternModel.Element;
import QualityPatternModel.Formula;
import QualityPatternModel.Graph;
import QualityPatternModel.GraphElement;
import QualityPatternModel.Input;
import QualityPatternModel.Mapping;
import QualityPatternModel.Match;
import QualityPatternModel.Morphism;
import QualityPatternModel.NumberOperators;
import QualityPatternModel.Operator;
import QualityPatternModel.Option;
import QualityPatternModel.OtherOperators;
import QualityPatternModel.Pattern;
import QualityPatternModel.PatternElement;
import QualityPatternModel.Property;
import QualityPatternModel.QualityPatternModelPackage;
import QualityPatternModel.QuantifiedCondition;
import QualityPatternModel.Relation;
import QualityPatternModel.RelationMapping;
import QualityPatternModel.SetElement;
import QualityPatternModel.SingleElement;
import QualityPatternModel.SingleElementMapping;
import QualityPatternModel.Text;
import QualityPatternModel.ToNumber;
import QualityPatternModel.True;
import QualityPatternModel.VariableList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see QualityPatternModel.QualityPatternModelPackage
 * @generated
 */
public class QualityPatternModelSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QualityPatternModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityPatternModelSwitch() {
		if (modelPackage == null) {
			modelPackage = QualityPatternModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QualityPatternModelPackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T1 result = casePattern(pattern);
				if (result == null) result = casePatternElement(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T1 result = caseCondition(condition);
				if (result == null) result = casePatternElement(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.QUANTIFIED_CONDITION: {
				QuantifiedCondition quantifiedCondition = (QuantifiedCondition)theEObject;
				T1 result = caseQuantifiedCondition(quantifiedCondition);
				if (result == null) result = caseCondition(quantifiedCondition);
				if (result == null) result = casePatternElement(quantifiedCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.FORMULA: {
				Formula formula = (Formula)theEObject;
				T1 result = caseFormula(formula);
				if (result == null) result = caseCondition(formula);
				if (result == null) result = casePatternElement(formula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.TRUE: {
				True true_ = (True)theEObject;
				T1 result = caseTrue(true_);
				if (result == null) result = caseCondition(true_);
				if (result == null) result = casePatternElement(true_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.GRAPH: {
				Graph graph = (Graph)theEObject;
				T1 result = caseGraph(graph);
				if (result == null) result = casePatternElement(graph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T1 result = caseElement(element);
				if (result == null) result = caseGraphElement(element);
				if (result == null) result = casePatternElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.SET_ELEMENT: {
				SetElement setElement = (SetElement)theEObject;
				T1 result = caseSetElement(setElement);
				if (result == null) result = caseElement(setElement);
				if (result == null) result = caseGraphElement(setElement);
				if (result == null) result = casePatternElement(setElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.SINGLE_ELEMENT: {
				SingleElement singleElement = (SingleElement)theEObject;
				T1 result = caseSingleElement(singleElement);
				if (result == null) result = caseElement(singleElement);
				if (result == null) result = caseGraphElement(singleElement);
				if (result == null) result = casePatternElement(singleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T1 result = caseProperty(property);
				if (result == null) result = caseGraphElement(property);
				if (result == null) result = casePatternElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T1 result = caseOperator(operator);
				if (result == null) result = caseGraphElement(operator);
				if (result == null) result = casePatternElement(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.BOOLEAN_OPERATOR: {
				BooleanOperator booleanOperator = (BooleanOperator)theEObject;
				T1 result = caseBooleanOperator(booleanOperator);
				if (result == null) result = caseOperator(booleanOperator);
				if (result == null) result = caseGraphElement(booleanOperator);
				if (result == null) result = casePatternElement(booleanOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.INPUT: {
				Input input = (Input)theEObject;
				T1 result = caseInput(input);
				if (result == null) result = caseGraphElement(input);
				if (result == null) result = casePatternElement(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.TEXT: {
				Text text = (Text)theEObject;
				T1 result = caseText(text);
				if (result == null) result = caseInput(text);
				if (result == null) result = caseGraphElement(text);
				if (result == null) result = casePatternElement(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.NUMBER: {
				QualityPatternModel.Number number = (QualityPatternModel.Number)theEObject;
				T1 result = caseNumber(number);
				if (result == null) result = caseInput(number);
				if (result == null) result = caseGraphElement(number);
				if (result == null) result = casePatternElement(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.BOOLEAN: {
				QualityPatternModel.Boolean boolean_ = (QualityPatternModel.Boolean)theEObject;
				T1 result = caseBoolean(boolean_);
				if (result == null) result = caseInput(boolean_);
				if (result == null) result = caseGraphElement(boolean_);
				if (result == null) result = casePatternElement(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.OPTION: {
				Option<?> option = (Option<?>)theEObject;
				T1 result = caseOption(option);
				if (result == null) result = caseInput(option);
				if (result == null) result = caseGraphElement(option);
				if (result == null) result = casePatternElement(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.GRAPH_ELEMENT: {
				GraphElement graphElement = (GraphElement)theEObject;
				T1 result = caseGraphElement(graphElement);
				if (result == null) result = casePatternElement(graphElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T1 result = caseMapping(mapping);
				if (result == null) result = casePatternElement(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.MORPHISM: {
				Morphism morphism = (Morphism)theEObject;
				T1 result = caseMorphism(morphism);
				if (result == null) result = casePatternElement(morphism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.VARIABLE_LIST: {
				VariableList variableList = (VariableList)theEObject;
				T1 result = caseVariableList(variableList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T1 result = caseRelation(relation);
				if (result == null) result = casePatternElement(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.COMPARISON: {
				Comparison comparison = (Comparison)theEObject;
				T1 result = caseComparison(comparison);
				if (result == null) result = caseBooleanOperator(comparison);
				if (result == null) result = caseOperator(comparison);
				if (result == null) result = caseGraphElement(comparison);
				if (result == null) result = casePatternElement(comparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.MATCH: {
				Match match = (Match)theEObject;
				T1 result = caseMatch(match);
				if (result == null) result = caseBooleanOperator(match);
				if (result == null) result = caseOperator(match);
				if (result == null) result = caseGraphElement(match);
				if (result == null) result = casePatternElement(match);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.NUMBER_OPERATORS: {
				NumberOperators numberOperators = (NumberOperators)theEObject;
				T1 result = caseNumberOperators(numberOperators);
				if (result == null) result = caseOperator(numberOperators);
				if (result == null) result = caseGraphElement(numberOperators);
				if (result == null) result = casePatternElement(numberOperators);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.SINGLE_ELEMENT_MAPPING: {
				SingleElementMapping singleElementMapping = (SingleElementMapping)theEObject;
				T1 result = caseSingleElementMapping(singleElementMapping);
				if (result == null) result = caseMapping(singleElementMapping);
				if (result == null) result = casePatternElement(singleElementMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.RELATION_MAPPING: {
				RelationMapping relationMapping = (RelationMapping)theEObject;
				T1 result = caseRelationMapping(relationMapping);
				if (result == null) result = caseMapping(relationMapping);
				if (result == null) result = casePatternElement(relationMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.PATTERN_ELEMENT: {
				PatternElement patternElement = (PatternElement)theEObject;
				T1 result = casePatternElement(patternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.COUNT: {
				Count count = (Count)theEObject;
				T1 result = caseCount(count);
				if (result == null) result = caseNumberOperators(count);
				if (result == null) result = caseOperator(count);
				if (result == null) result = caseGraphElement(count);
				if (result == null) result = casePatternElement(count);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.OTHER_OPERATORS: {
				OtherOperators otherOperators = (OtherOperators)theEObject;
				T1 result = caseOtherOperators(otherOperators);
				if (result == null) result = caseOperator(otherOperators);
				if (result == null) result = caseGraphElement(otherOperators);
				if (result == null) result = casePatternElement(otherOperators);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QualityPatternModelPackage.TO_NUMBER: {
				ToNumber toNumber = (ToNumber)theEObject;
				T1 result = caseToNumber(toNumber);
				if (result == null) result = caseNumberOperators(toNumber);
				if (result == null) result = caseOperator(toNumber);
				if (result == null) result = caseGraphElement(toNumber);
				if (result == null) result = casePatternElement(toNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantified Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantified Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQuantifiedCondition(QuantifiedCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFormula(Formula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTrue(True object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraph(Graph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSetElement(SetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSingleElement(SingleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanOperator(BooleanOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNumber(QualityPatternModel.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBoolean(QualityPatternModel.Boolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseOption(Option<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraphElement(GraphElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Morphism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Morphism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMorphism(Morphism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableList(VariableList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseComparison(Comparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMatch(Match object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Operators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Operators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNumberOperators(NumberOperators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Operators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Operators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOtherOperators(OtherOperators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>To Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>To Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseToNumber(ToNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Element Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Element Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSingleElementMapping(SingleElementMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelationMapping(RelationMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePatternElement(PatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCount(Count object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //QualityPatternModelSwitch
