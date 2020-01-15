/**
 */
package qualitypatternmodel.inputfields.impl;

import java.lang.Boolean;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.Option;
import qualitypatternmodel.patternstructure.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.impl.OptionImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.impl.OptionImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionImpl<T> extends InputImpl implements Option<T> {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<T> options;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected T selection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionImpl() {
		super();
	}
	
	@Override
	public void isValid(boolean isDefinedPattern, int depth, Class cls) throws InvalidityException {
		if(selection != null && selection.getClass() != cls || options.get(0).getClass() != cls) {
			throw new InvalidityException("options of wrong type");
		}
		this.isValid(isDefinedPattern, depth);
	}
	
	@Override
	public void isValid(boolean isDefinedPattern, int depth) throws InvalidityException {
		if (options == null) 
			throw new InvalidityException("options null");
		if (options.size() < 1) 
			throw new InvalidityException("not enough options");
		super.isValid(isDefinedPattern, depth);
	}
	
	@Override
	public boolean inputIsValid() {
		return selection != null && options.contains(selection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputfieldsPackage.Literals.OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<T>(Object.class, this, InputfieldsPackage.OPTION__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(T newSelection) {
		T oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.OPTION__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InputfieldsPackage.OPTION__OPTIONS:
				return getOptions();
			case InputfieldsPackage.OPTION__SELECTION:
				return getSelection();
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
			case InputfieldsPackage.OPTION__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends T>)newValue);
				return;
			case InputfieldsPackage.OPTION__SELECTION:
				setSelection((T)newValue);
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
			case InputfieldsPackage.OPTION__OPTIONS:
				getOptions().clear();
				return;
			case InputfieldsPackage.OPTION__SELECTION:
				setSelection((T)null);
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
			case InputfieldsPackage.OPTION__OPTIONS:
				return options != null && !options.isEmpty();
			case InputfieldsPackage.OPTION__SELECTION:
				return selection != null;
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
			case InputfieldsPackage.OPTION___IS_VALID__BOOLEAN_INT_CLASS:
				try {
					isValid((Boolean)arguments.get(0), (Integer)arguments.get(1), (Class)arguments.get(2));
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
		result.append(", selection: ");
		result.append(selection);
		result.append(')');
		return result.toString();
	}

} //OptionImpl
