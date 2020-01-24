/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Formula</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.FormulaImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.FormulaImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaImpl extends ConditionImpl implements Formula {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperator OPERATOR_EDEFAULT = LogicalOperator.NOT;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> arguments;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulaImpl() {
		super();
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		if (operator != null) {
			if (operator == LogicalOperator.NOT) {
				if (arguments.size() == 1 && arguments.get(0) != null) {
					return "not(" + arguments.get(0).toXQuery(location) + ")";
				} else {
					throw new InvalidityException("invalid argument");
				}
			} else {
				if (arguments.size() == 2 && arguments.get(0) != null && arguments.get(1) != null) {
					return "((" + arguments.get(0).toXQuery(location) + ")" + operator.getLiteral() + "("
							+ arguments.get(1).toXQuery(location) + "))";
				} else {
					throw new InvalidityException("invalid arguments");
				}
			}
		} else {
			throw new InvalidityException("operator null");
		}
	}

	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException {
		isValidLocal(isDefinedPattern);

		if (operator == LogicalOperator.NOT)
			arguments.get(0).isValid(isDefinedPattern);
		else
			arguments.get(0).isValid(isDefinedPattern);
		arguments.get(1).isValid(isDefinedPattern);
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (operator == null)
			throw new InvalidityException("operator null");
		if (arguments == null)
			throw new InvalidityException("arguments null");
		if (operator == LogicalOperator.NOT)
			if (arguments.size() != 1 || arguments.get(0) == null)
				throw new InvalidityException("argument invalid (op:NOT)");
			else if (arguments.size() != 2 || arguments.get(0) == null || arguments.get(1) == null)
				throw new InvalidityException("arguments invalid");
	}

	@Override
	public void prepareTranslation() {
		for (Condition condition : arguments) {
			condition.prepareTranslation();
		}
	}

	@Override
	public EList<Input> getAllInputs() throws InvalidityException {
		EList<Input> inputs = new BasicEList<Input>();
		for (Condition condition : arguments) {
			inputs.addAll(condition.getAllInputs());
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.FORMULA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Condition> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentWithInverseEList<Condition>(Condition.class, this, PatternstructurePackage.FORMULA__ARGUMENTS, PatternstructurePackage.CONDITION__FORMULA);
		}
		return arguments;
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
			case PatternstructurePackage.FORMULA__ARGUMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArguments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(LogicalOperator newOperator) {
		LogicalOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.FORMULA__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.FORMULA__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternstructurePackage.FORMULA__OPERATOR:
				return getOperator();
			case PatternstructurePackage.FORMULA__ARGUMENTS:
				return getArguments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternstructurePackage.FORMULA__OPERATOR:
				setOperator((LogicalOperator)newValue);
				return;
			case PatternstructurePackage.FORMULA__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Condition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternstructurePackage.FORMULA__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case PatternstructurePackage.FORMULA__ARGUMENTS:
				getArguments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternstructurePackage.FORMULA__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case PatternstructurePackage.FORMULA__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} // FormulaImpl
