/**
 */
package qualitypatternmodel.inputfields.impl;

import java.lang.Boolean;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.graphstructure.impl.GraphElementImpl;

import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.VariableList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Input</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.inputfields.impl.InputImpl#getVariableList <em>Variable List</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.impl.InputImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link qualitypatternmodel.inputfields.impl.InputImpl#isIsPredefined <em>Is Predefined</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InputImpl extends GraphElementImpl implements Input {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsPredefined() <em>Is Predefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPredefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PREDEFINED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsPredefined() <em>Is Predefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPredefined()
	 * @generated
	 * @ordered
	 */
	protected boolean isPredefined = IS_PREDEFINED_EDEFAULT;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputfieldsPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VariableList getVariableList() {
		if (eContainerFeatureID() != InputfieldsPackage.INPUT__VARIABLE_LIST) return null;
		return (VariableList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableList(VariableList newVariableList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVariableList, InputfieldsPackage.INPUT__VARIABLE_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableList(VariableList newVariableList) {
		if (newVariableList != eInternalContainer() || (eContainerFeatureID() != InputfieldsPackage.INPUT__VARIABLE_LIST && newVariableList != null)) {
			if (EcoreUtil.isAncestor(this, newVariableList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVariableList != null)
				msgs = ((InternalEObject)newVariableList).eInverseAdd(this, PatternstructurePackage.VARIABLE_LIST__VARIABLES, VariableList.class, msgs);
			msgs = basicSetVariableList(newVariableList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.INPUT__VARIABLE_LIST, newVariableList, newVariableList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.INPUT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPredefined() {
		return isPredefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPredefined(boolean newIsPredefined) {
		boolean oldIsPredefined = isPredefined;
		isPredefined = newIsPredefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.INPUT__IS_PREDEFINED, oldIsPredefined, isPredefined));
	}

	@Override	
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException{
		if (getVariableList() == null)
			throw new InvalidityException("variableList null");
		if ((isDefinedPattern && !inputIsValid()))
			throw new InvalidityException("no defined input");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public abstract boolean inputIsValid();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InputfieldsPackage.INPUT__VARIABLE_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVariableList((VariableList)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InputfieldsPackage.INPUT__VARIABLE_LIST:
				return basicSetVariableList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case InputfieldsPackage.INPUT__VARIABLE_LIST:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.VARIABLE_LIST__VARIABLES, VariableList.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InputfieldsPackage.INPUT__VARIABLE_LIST:
				return getVariableList();
			case InputfieldsPackage.INPUT__DESCRIPTION:
				return getDescription();
			case InputfieldsPackage.INPUT__IS_PREDEFINED:
				return isIsPredefined();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InputfieldsPackage.INPUT__VARIABLE_LIST:
				setVariableList((VariableList)newValue);
				return;
			case InputfieldsPackage.INPUT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InputfieldsPackage.INPUT__IS_PREDEFINED:
				setIsPredefined((Boolean)newValue);
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
			case InputfieldsPackage.INPUT__VARIABLE_LIST:
				setVariableList((VariableList)null);
				return;
			case InputfieldsPackage.INPUT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InputfieldsPackage.INPUT__IS_PREDEFINED:
				setIsPredefined(IS_PREDEFINED_EDEFAULT);
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
			case InputfieldsPackage.INPUT__VARIABLE_LIST:
				return getVariableList() != null;
			case InputfieldsPackage.INPUT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InputfieldsPackage.INPUT__IS_PREDEFINED:
				return isPredefined != IS_PREDEFINED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InputfieldsPackage.INPUT___INPUT_IS_VALID:
				return inputIsValid();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", isPredefined: ");
		result.append(isPredefined);
		result.append(')');
		return result.toString();
	}

} // InputImpl
