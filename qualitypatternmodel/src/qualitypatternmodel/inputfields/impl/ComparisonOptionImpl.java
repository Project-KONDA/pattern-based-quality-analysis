/**
 */
package qualitypatternmodel.inputfields.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.ComparisonOperator;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.inputfields.ComparisonOption;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.ParameterList;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.impl.ComparisonOptionImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.impl.ComparisonOptionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.impl.ComparisonOptionImpl#getComparison <em>Comparison</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonOptionImpl extends ParameterImpl implements ComparisonOption {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ComparisonOperator> options;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator VALUE_EDEFAULT = ComparisonOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComparison() <em>Comparison</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected Comparison comparison;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComparisonOptionImpl() {
		super();
		getOptions().add(ComparisonOperator.EQUAL);
//		getOptions().add(ComparisonOperator.LESS);
//		getOptions().add(ComparisonOperator.GREATER);
//		getOptions().add(ComparisonOperator.GREATEROREQUAL);
//		getOptions().add(ComparisonOperator.LESSOREQUAL);
		getOptions().add(ComparisonOperator.NOTEQUAL);
	}
	
	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (getOptions() == null) 
			throw new InvalidityException("options null");
		if (getOptions().size() < 1) 
			throw new InvalidityException("not enough options");
		super.isValidLocal(isDefinedPattern);
	}
	
	@Override
	public String toXQuery(Location location) throws InvalidityException {
		return getValue().getLiteral();
	}
	
	@Override
	public boolean inputIsValid() {
		return getValue() != null && options.contains(getValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputfieldsPackage.Literals.COMPARISON_OPTION;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetVariableList(ParameterList newVariableList, NotificationChain msgs) {
		setComparison(null);
		return super.basicSetParameterList(newVariableList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComparisonOperator> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<ComparisonOperator>(ComparisonOperator.class, this, InputfieldsPackage.COMPARISON_OPTION__OPTIONS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.COMPARISON_OPTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comparison getComparison() {
		if (comparison != null && comparison.eIsProxy()) {
			InternalEObject oldComparison = (InternalEObject)comparison;
			comparison = (Comparison)eResolveProxy(oldComparison);
			if (comparison != oldComparison) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InputfieldsPackage.COMPARISON_OPTION__COMPARISON, oldComparison, comparison));
			}
		}
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparison basicGetComparison() {
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparison(Comparison newComparison, NotificationChain msgs) {
		Comparison oldComparison = comparison;
		comparison = newComparison;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InputfieldsPackage.COMPARISON_OPTION__COMPARISON, oldComparison, newComparison);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComparison(Comparison newComparison) {
		if (newComparison != comparison) {
			NotificationChain msgs = null;
			if (comparison != null)
				msgs = ((InternalEObject)comparison).eInverseRemove(this, FunctionsPackage.COMPARISON__OPTION, Comparison.class, msgs);
			if (newComparison != null)
				msgs = ((InternalEObject)newComparison).eInverseAdd(this, FunctionsPackage.COMPARISON__OPTION, Comparison.class, msgs);
			msgs = basicSetComparison(newComparison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.COMPARISON_OPTION__COMPARISON, newComparison, newComparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InputfieldsPackage.COMPARISON_OPTION__COMPARISON:
				if (comparison != null)
					msgs = ((InternalEObject)comparison).eInverseRemove(this, FunctionsPackage.COMPARISON__OPTION, Comparison.class, msgs);
				return basicSetComparison((Comparison)otherEnd, msgs);
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
			case InputfieldsPackage.COMPARISON_OPTION__COMPARISON:
				return basicSetComparison(null, msgs);
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
			case InputfieldsPackage.COMPARISON_OPTION__OPTIONS:
				return getOptions();
			case InputfieldsPackage.COMPARISON_OPTION__VALUE:
				return getValue();
			case InputfieldsPackage.COMPARISON_OPTION__COMPARISON:
				if (resolve) return getComparison();
				return basicGetComparison();
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
			case InputfieldsPackage.COMPARISON_OPTION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends ComparisonOperator>)newValue);
				return;
			case InputfieldsPackage.COMPARISON_OPTION__VALUE:
				setValue((ComparisonOperator)newValue);
				return;
			case InputfieldsPackage.COMPARISON_OPTION__COMPARISON:
				setComparison((Comparison)newValue);
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
			case InputfieldsPackage.COMPARISON_OPTION__OPTIONS:
				getOptions().clear();
				return;
			case InputfieldsPackage.COMPARISON_OPTION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case InputfieldsPackage.COMPARISON_OPTION__COMPARISON:
				setComparison((Comparison)null);
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
			case InputfieldsPackage.COMPARISON_OPTION__OPTIONS:
				return options != null && !options.isEmpty();
			case InputfieldsPackage.COMPARISON_OPTION__VALUE:
				return value != VALUE_EDEFAULT;
			case InputfieldsPackage.COMPARISON_OPTION__COMPARISON:
				return comparison != null;
		}
		return super.eIsSet(featureID);
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
		return "comp " + getInternalId() + " " + getValue();
	}

} //CompOptionImpl
