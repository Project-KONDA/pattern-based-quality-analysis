/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONArray;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl#getComparisons <em>Comparisons</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl#getCountConditions <em>Count Conditions</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl#getStringLength <em>String Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonOptionParamImpl extends ParameterImpl implements ComparisonOptionParam {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * A subset of all comparison operators to choose from during the concretization.
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ComparisonOperator> options;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 *
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated NOT
	 * @ordered
	 */
	protected static final ComparisonOperator VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The chosen concrete comparison operator.
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComparisons() <em>Comparisons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <code>Comparisons</code> that are specified through <code>this</code>.
	 * <!-- end-user-doc -->
	 * @see #getComparisons()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparisons;

	/**
	 * The cached value of the '{@link #getCountConditions() <em>Count Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <code>CountConditions</code> that are specified through <code>this</code>.
	 * <!-- end-user-doc -->
	 * @see #getCountConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<CountCondition> countConditions;

	/**
	 * The cached value of the '{@link #getStringLength() <em>String Length</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringLength()
	 * @generated
	 * @ordered
	 */
	protected EList<StringLength> stringLength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComparisonOptionParamImpl() {
		super();
		getOptions().addAll(ComparisonOperator.VALUES);
	}

	@Override
	public String getValueAsString() {
		if (getValue() == null) {
			return null;
		}
		return getValue().getName();
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		if (value == null) {
			clear();
			return;
		}
		for(ComparisonOperator operator : getOptions()) {
			if(operator.getName().equals(value)) {
				setValueIfValid(operator);
				return;
			}
		}
		for(ComparisonOperator operator : ComparisonOperator.values()) {
			if(operator.getName().equals(value)) {
				throw new InvalidityException("value '" + value + "' is not allowed");
			}
		}
		throw new InvalidityException("value '" + value + "' is not valid");
	}

	@Override
	public void clear() {
		setValue(null);
	}

	@Override
	public JSONArray getOptionsAsJsonArray() {
		JSONArray jarray = new JSONArray();
		for (ComparisonOperator comp: getOptions()) {
			jarray.put(comp.getName());
		}
		return jarray;
	}

	@Override
	public void checkComparisonConsistency() throws InvalidityException {
		for(Comparison comp : getComparisons()) {
			if(comp.getArgument1() instanceof PrimitiveNode) {
				PrimitiveNode p = (PrimitiveNode) comp.getArgument1();
				p.checkComparisonConsistency(comp);
			}
			if(comp.getArgument2() instanceof PrimitiveNode) {
				PrimitiveNode p = (PrimitiveNode) comp.getArgument2();
				p.checkComparisonConsistency(comp);
			}

			if(comp.getArgument1() instanceof Node) {
				Node e = (Node) comp.getArgument1();
				e.checkComparisonConsistency(comp);
			}
			if(comp.getArgument2() instanceof Node) {
				Node e = (Node) comp.getArgument2();
				e.checkComparisonConsistency(comp);
			}
		}
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (getOptions() == null) {
			throw new InvalidityException("options null");
		}
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && getOptions().isEmpty()) {
			throw new InvalidityException("not enough options");
		}
		super.isValidLocal(abstractionLevel);
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		return getValue().getLiteral();
	}

	@Override
	public boolean inputIsValid() {
		return getValue() != null && options.contains(getValue());
	}

	@Override
	public boolean isUsed() {
		return !getComparisons().isEmpty() || !getCountConditions().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.COMPARISON_OPTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain basicSetParameterList(ParameterList newVariableList, NotificationChain msgs) {
		if(newVariableList == null) {
			getComparisons().clear();
		}

		return super.basicSetParameterList(newVariableList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ComparisonOperator> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<ComparisonOperator>(ComparisonOperator.class, this, ParametersPackage.COMPARISON_OPTION_PARAM__OPTIONS);
		}
		else if (options.size() > 1){
			EList<ComparisonOperator> options2 = new EDataTypeUniqueEList<ComparisonOperator>(ComparisonOperator.class, this, ParametersPackage.COMPARISON_OPTION_PARAM__OPTIONS);
			for (ComparisonOperator cop: options) {
				if (!options2.contains(cop)) {
					options2.add(cop);
				}
			}
			options = options2;
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOperator getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(ComparisonOperator newValue) {
		ComparisonOperator oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.COMPARISON_OPTION_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparisons() {
		if (comparisons == null) {
			comparisons = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS, OperatorsPackage.COMPARISON__OPTION);
		}
		return comparisons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CountCondition> getCountConditions() {
		if (countConditions == null) {
			countConditions = new EObjectWithInverseResolvingEList<CountCondition>(CountCondition.class, this, ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS, PatternstructurePackage.COUNT_CONDITION__OPTION);
		}
		return countConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringLength> getStringLength() {
		if (stringLength == null) {
			stringLength = new EObjectWithInverseResolvingEList<StringLength>(StringLength.class, this, ParametersPackage.COMPARISON_OPTION_PARAM__STRING_LENGTH, OperatorsPackage.STRING_LENGTH__OPTION);
		}
		return stringLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueIfValid(ComparisonOperator newValue) throws InvalidityException {
		ComparisonOperator oldValue = getValue();
		setValue(newValue);
		try {
			checkComparisonConsistency();
		} catch (Exception e) {
			setValue(oldValue);
			throw e;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparisons()).basicAdd(otherEnd, msgs);
			case ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCountConditions()).basicAdd(otherEnd, msgs);
			case ParametersPackage.COMPARISON_OPTION_PARAM__STRING_LENGTH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStringLength()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS:
				return ((InternalEList<?>)getComparisons()).basicRemove(otherEnd, msgs);
			case ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS:
				return ((InternalEList<?>)getCountConditions()).basicRemove(otherEnd, msgs);
			case ParametersPackage.COMPARISON_OPTION_PARAM__STRING_LENGTH:
				return ((InternalEList<?>)getStringLength()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM__OPTIONS:
				return getOptions();
			case ParametersPackage.COMPARISON_OPTION_PARAM__VALUE:
				return getValue();
			case ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS:
				return getComparisons();
			case ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS:
				return getCountConditions();
			case ParametersPackage.COMPARISON_OPTION_PARAM__STRING_LENGTH:
				return getStringLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends ComparisonOperator>)newValue);
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__VALUE:
				setValue((ComparisonOperator)newValue);
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS:
				getComparisons().clear();
				getComparisons().addAll((Collection<? extends Comparison>)newValue);
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS:
				getCountConditions().clear();
				getCountConditions().addAll((Collection<? extends CountCondition>)newValue);
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__STRING_LENGTH:
				getStringLength().clear();
				getStringLength().addAll((Collection<? extends StringLength>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS:
				getComparisons().clear();
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS:
				getCountConditions().clear();
				return;
			case ParametersPackage.COMPARISON_OPTION_PARAM__STRING_LENGTH:
				getStringLength().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM__OPTIONS:
				return options != null && !options.isEmpty();
			case ParametersPackage.COMPARISON_OPTION_PARAM__VALUE:
				return value != VALUE_EDEFAULT;
			case ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS:
				return comparisons != null && !comparisons.isEmpty();
			case ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS:
				return countConditions != null && !countConditions.isEmpty();
			case ParametersPackage.COMPARISON_OPTION_PARAM__STRING_LENGTH:
				return stringLength != null && !stringLength.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ParametersPackage.COMPARISON_OPTION_PARAM___SET_VALUE_IF_VALID__COMPARISONOPERATOR:
				try {
					setValueIfValid((ComparisonOperator)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (options: ");
		result.append(options);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		return "comp [" + getInternalId() + "] " + getValue();
	}

	@Override
	public String generateDescription() {
		String res = "Angabe des Vergleichsoperators";
		try {
			for(Comparison comp : getComparisons()) {
				Comparable arg1 = comp.getArgument1();
				Comparable arg2 = comp.getArgument2();
				String argument1 = arg1.getClass().getCanonicalName() + " " + arg1.getInternalId();
				String argument2 = arg2.getClass().getCanonicalName() + " " + arg1.getInternalId();
				res += " zum Vergleich von " + argument1 + " und " + argument2;
			}
		} catch (Exception e) {}
		return res;
//		setDescription(res);
	}

} //CompOptionImpl
