/**
 */
package qualitypatternmodel.parameters.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qualitypatternmodel.parameters.AxisOption;
import qualitypatternmodel.parameters.ComparisonOption;
import qualitypatternmodel.parameters.Date;
import qualitypatternmodel.parameters.DateTime;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.PropertyOption;
import qualitypatternmodel.parameters.Text;
import qualitypatternmodel.parameters.TextList;
import qualitypatternmodel.parameters.TextLiteral;
import qualitypatternmodel.parameters.Time;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.patternstructure.PatternElement;

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
 * @see qualitypatternmodel.parameters.ParametersPackage
 * @generated
 */
public class ParametersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ParametersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersSwitch() {
		if (modelPackage == null) {
			modelPackage = ParametersPackage.eINSTANCE;
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ParametersPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseComparable(parameter);
				if (result == null) result = casePatternElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.COMPARISON_OPTION: {
				ComparisonOption comparisonOption = (ComparisonOption)theEObject;
				T result = caseComparisonOption(comparisonOption);
				if (result == null) result = caseParameter(comparisonOption);
				if (result == null) result = caseComparable(comparisonOption);
				if (result == null) result = casePatternElement(comparisonOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.PROPERTY_OPTION: {
				PropertyOption propertyOption = (PropertyOption)theEObject;
				T result = casePropertyOption(propertyOption);
				if (result == null) result = caseParameter(propertyOption);
				if (result == null) result = caseComparable(propertyOption);
				if (result == null) result = casePatternElement(propertyOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.PARAMETER_LIST: {
				ParameterList parameterList = (ParameterList)theEObject;
				T result = caseParameterList(parameterList);
				if (result == null) result = casePatternElement(parameterList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.BOOLEAN: {
				qualitypatternmodel.parameters.Boolean boolean_ = (qualitypatternmodel.parameters.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseParameterValue(boolean_);
				if (result == null) result = caseParameter(boolean_);
				if (result == null) result = caseComparable(boolean_);
				if (result == null) result = casePatternElement(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.TEXT: {
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseParameterValue(text);
				if (result == null) result = caseParameter(text);
				if (result == null) result = caseComparable(text);
				if (result == null) result = casePatternElement(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.TEXT_LIST: {
				TextList textList = (TextList)theEObject;
				T result = caseTextList(textList);
				if (result == null) result = caseText(textList);
				if (result == null) result = caseParameterValue(textList);
				if (result == null) result = caseParameter(textList);
				if (result == null) result = caseComparable(textList);
				if (result == null) result = casePatternElement(textList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.TEXT_LITERAL: {
				TextLiteral textLiteral = (TextLiteral)theEObject;
				T result = caseTextLiteral(textLiteral);
				if (result == null) result = caseText(textLiteral);
				if (result == null) result = caseParameterValue(textLiteral);
				if (result == null) result = caseParameter(textLiteral);
				if (result == null) result = caseComparable(textLiteral);
				if (result == null) result = casePatternElement(textLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.NUMBER: {
				qualitypatternmodel.parameters.Number number = (qualitypatternmodel.parameters.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = caseParameterValue(number);
				if (result == null) result = caseParameter(number);
				if (result == null) result = caseComparable(number);
				if (result == null) result = casePatternElement(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.PARAMETER_VALUE: {
				ParameterValue parameterValue = (ParameterValue)theEObject;
				T result = caseParameterValue(parameterValue);
				if (result == null) result = caseParameter(parameterValue);
				if (result == null) result = caseComparable(parameterValue);
				if (result == null) result = casePatternElement(parameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.DATE: {
				Date date = (Date)theEObject;
				T result = caseDate(date);
				if (result == null) result = caseParameterValue(date);
				if (result == null) result = caseParameter(date);
				if (result == null) result = caseComparable(date);
				if (result == null) result = casePatternElement(date);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.TIME: {
				Time time = (Time)theEObject;
				T result = caseTime(time);
				if (result == null) result = caseParameterValue(time);
				if (result == null) result = caseParameter(time);
				if (result == null) result = caseComparable(time);
				if (result == null) result = casePatternElement(time);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.UNKNOWN_PARAMETER_VALUE: {
				UnknownParameterValue unknownParameterValue = (UnknownParameterValue)theEObject;
				T result = caseUnknownParameterValue(unknownParameterValue);
				if (result == null) result = caseParameter(unknownParameterValue);
				if (result == null) result = caseComparable(unknownParameterValue);
				if (result == null) result = casePatternElement(unknownParameterValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.DATE_TIME: {
				DateTime dateTime = (DateTime)theEObject;
				T result = caseDateTime(dateTime);
				if (result == null) result = caseParameterValue(dateTime);
				if (result == null) result = caseParameter(dateTime);
				if (result == null) result = caseComparable(dateTime);
				if (result == null) result = casePatternElement(dateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParametersPackage.AXIS_OPTION: {
				AxisOption axisOption = (AxisOption)theEObject;
				T result = caseAxisOption(axisOption);
				if (result == null) result = caseParameter(axisOption);
				if (result == null) result = caseComparable(axisOption);
				if (result == null) result = casePatternElement(axisOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonOption(ComparisonOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyOption(PropertyOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterList(ParameterList object) {
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
	public T caseBoolean(qualitypatternmodel.parameters.Boolean object) {
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
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextList(TextList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextLiteral(TextLiteral object) {
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
	public T caseNumber(qualitypatternmodel.parameters.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValue(ParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDate(Date object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unknown Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unknown Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnknownParameterValue(UnknownParameterValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTime(DateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axis Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxisOption(AxisOption object) {
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
	public T casePatternElement(PatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparable(qualitypatternmodel.graphstructure.Comparable object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //InputfieldsSwitch
