/**
 */
package qualitypatternmodel.inputfields.impl;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import qualitypatternmodel.functions.ComparisonOperator;
import qualitypatternmodel.inputfields.CompOption;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.patternstructure.InvalidityException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Comp
 * Option</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.impl.CompOptionImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.impl.CompOptionImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompOptionImpl extends InputImpl implements CompOption {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOptions()
	 * @ordered
	 */
	protected EList<ComparisonOperator> options = new BasicEList<ComparisonOperator>();

	/**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator SELECTION_EDEFAULT = ComparisonOperator.EQUAL;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator selection = SELECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected CompOptionImpl() {
		super();
		eSet(InputfieldsPackage.COMP_OPTION__OPTIONS,
				Arrays.asList(ComparisonOperator.EQUAL, ComparisonOperator.NOTEQUAL));
	}

	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (options == null)
			throw new InvalidityException("options null");
		if (options.size() < 1)
			throw new InvalidityException("not enough options");
		super.isValidLocal(isDefinedPattern);
	}

	@Override
	public boolean inputIsValid() {
		return selection != null && options.contains(selection);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputfieldsPackage.Literals.COMP_OPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComparisonOperator> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<ComparisonOperator>(ComparisonOperator.class, this, InputfieldsPackage.COMP_OPTION__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOperator getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelection(ComparisonOperator newSelection) {
		ComparisonOperator oldSelection = selection;
		selection = newSelection == null ? SELECTION_EDEFAULT : newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.COMP_OPTION__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InputfieldsPackage.COMP_OPTION__OPTIONS:
				return getOptions();
			case InputfieldsPackage.COMP_OPTION__SELECTION:
				return getSelection();
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
			case InputfieldsPackage.COMP_OPTION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends ComparisonOperator>)newValue);
				return;
			case InputfieldsPackage.COMP_OPTION__SELECTION:
				setSelection((ComparisonOperator)newValue);
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
			case InputfieldsPackage.COMP_OPTION__OPTIONS:
				getOptions().clear();
				return;
			case InputfieldsPackage.COMP_OPTION__SELECTION:
				setSelection(SELECTION_EDEFAULT);
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
			case InputfieldsPackage.COMP_OPTION__OPTIONS:
				return options != null && !options.isEmpty();
			case InputfieldsPackage.COMP_OPTION__SELECTION:
				return selection != SELECTION_EDEFAULT;
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
		result.append(" (options: ");
		result.append(options);
		result.append(", selection: ");
		result.append(selection);
		result.append(')');
		return result.toString();
	}

} // CompOptionImpl
