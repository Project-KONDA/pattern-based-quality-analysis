/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.Boolean;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Input</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.ParameterImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ParameterImpl#isIsPredefined <em>Is Predefined</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ParameterImpl#isDescribed <em>Described</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParameterImpl extends PatternElementImpl implements Parameter {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsPredefined() <em>Is Predefined</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsPredefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PREDEFINED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsPredefined() <em>Is Predefined</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsPredefined()
	 * @generated
	 * @ordered
	 */
	protected boolean isPredefined = IS_PREDEFINED_EDEFAULT;
	/**
	 * The default value of the '{@link #isDescribed() <em>Described</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDescribed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESCRIBED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDescribed() <em>Described</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDescribed()
	 * @generated
	 * @ordered
	 */
	protected boolean described = DESCRIBED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

//	@Override
//	public String toXQuery(Location location, int depth) throws InvalidityException {
//		return toXQuery(location);
//	}

	@Override
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		res.add(this);
		return res;
	}

//	@Override
//	public boolean isTranslatable() throws InvalidityException {
//		return true;
//	}

	@Override
	public void updateParameters(ParameterList newParameterList) {
		setParameterList(newParameterList);
//		Pattern oldPattern = null;
//		try {
//			oldPattern = (Pattern) getAncestor(PatternImpl.class);			
//			if(!oldPattern.equals(newParameterList)) {
//				oldPattern.getParameterList().getParameters().removeAll(parameters);
//				newParameterList.getParameterList().getParameters().addAll(parameters);
//			} else if(newParameterList == null) {
//				oldPattern.getParameterList().getParameters().removeAll(parameters);
//			}
//			
//		} catch (MissingPatternContainerException e) {
//			if(newParameterList != null) {					
//				newParameterList.getParameterList().getParameters().addAll(parameters);
//			} 
//		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterList getParameterList() {
		if (eContainerFeatureID() != ParametersPackage.PARAMETER__PARAMETER_LIST) return null;
		return (ParameterList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParameterList, ParametersPackage.PARAMETER__PARAMETER_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterList(ParameterList newParameterList) {
		if (newParameterList != eInternalContainer() || (eContainerFeatureID() != ParametersPackage.PARAMETER__PARAMETER_LIST && newParameterList != null)) {
			if (EcoreUtil.isAncestor(this, newParameterList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParameterList != null)
				msgs = ((InternalEObject)newParameterList).eInverseAdd(this, ParametersPackage.PARAMETER_LIST__PARAMETERS, ParameterList.class, msgs);
			msgs = basicSetParameterList(newParameterList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PARAMETER__PARAMETER_LIST, newParameterList, newParameterList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getDescription() {
		if (!isDescribed())
			generateDescription();
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		if (oldDescription != newDescription && newDescription != "")
			setDescribed(true);
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PARAMETER__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPredefined() {
		return isPredefined;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPredefined(boolean newIsPredefined) {
		boolean oldIsPredefined = isPredefined;
		isPredefined = newIsPredefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PARAMETER__IS_PREDEFINED, oldIsPredefined, isPredefined));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDescribed() {
		return described;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescribed(boolean newDescribed) {
		boolean oldDescribed = described;
		described = newDescribed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PARAMETER__DESCRIBED, oldDescribed, described));
	}

	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (getParameterList() == null)
			throw new InvalidityException("variableList null" + " (" + getInternalId() + ")");
		if ((isDefinedPattern && !inputIsValid()))
			throw new InvalidityException("input missing or invalid" + " (" + getInternalId() + ")");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	public abstract boolean inputIsValid();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public abstract void generateDescription();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.PARAMETER__PARAMETER_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParameterList((ParameterList)otherEnd, msgs);
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
			case ParametersPackage.PARAMETER__PARAMETER_LIST:
				return basicSetParameterList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ParametersPackage.PARAMETER__PARAMETER_LIST:
				return eInternalContainer().eInverseRemove(this, ParametersPackage.PARAMETER_LIST__PARAMETERS, ParameterList.class, msgs);
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
			case ParametersPackage.PARAMETER__PARAMETER_LIST:
				return getParameterList();
			case ParametersPackage.PARAMETER__DESCRIPTION:
				return getDescription();
			case ParametersPackage.PARAMETER__IS_PREDEFINED:
				return isIsPredefined();
			case ParametersPackage.PARAMETER__DESCRIBED:
				return isDescribed();
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
			case ParametersPackage.PARAMETER__PARAMETER_LIST:
				setParameterList((ParameterList)newValue);
				return;
			case ParametersPackage.PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ParametersPackage.PARAMETER__IS_PREDEFINED:
				setIsPredefined((Boolean)newValue);
				return;
			case ParametersPackage.PARAMETER__DESCRIBED:
				setDescribed((Boolean)newValue);
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
			case ParametersPackage.PARAMETER__PARAMETER_LIST:
				setParameterList((ParameterList)null);
				return;
			case ParametersPackage.PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ParametersPackage.PARAMETER__IS_PREDEFINED:
				setIsPredefined(IS_PREDEFINED_EDEFAULT);
				return;
			case ParametersPackage.PARAMETER__DESCRIBED:
				setDescribed(DESCRIBED_EDEFAULT);
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
			case ParametersPackage.PARAMETER__PARAMETER_LIST:
				return getParameterList() != null;
			case ParametersPackage.PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ParametersPackage.PARAMETER__IS_PREDEFINED:
				return isPredefined != IS_PREDEFINED_EDEFAULT;
			case ParametersPackage.PARAMETER__DESCRIBED:
				return described != DESCRIBED_EDEFAULT;
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
			case ParametersPackage.PARAMETER___INPUT_IS_VALID:
				return inputIsValid();
			case ParametersPackage.PARAMETER___GENERATE_DESCRIPTION:
				generateDescription();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		result.append(", described: ");
		result.append(described);
		result.append(')');
		return result.toString();
	}

} // InputImpl
