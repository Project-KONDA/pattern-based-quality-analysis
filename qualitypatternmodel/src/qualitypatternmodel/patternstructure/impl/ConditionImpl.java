/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getCondDepth <em>Cond Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getQuantifiedCondition <em>Quantified Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getFormula1 <em>Formula1</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getFormula2 <em>Formula2</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.ConditionImpl#getNotCondition <em>Not Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionImpl extends PatternElementImpl implements Condition {
	/**
	 * The default value of the '{@link #getCondDepth() <em>Cond Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int COND_DEPTH_EDEFAULT = -1;
	/**
	 * The cached value of the '{@link #getCondDepth() <em>Cond Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondDepth()
	 * @generated
	 * @ordered
	 */
	protected int condDepth = COND_DEPTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCondDepth() {
		return condDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondDepth(int newCondDepth) {
		int oldCondDepth = condDepth;
		condDepth = newCondDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.CONDITION__COND_DEPTH, oldCondDepth, condDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern getPattern() {
		if (eContainerFeatureID() != PatternstructurePackage.CONDITION__PATTERN) return null;
		return (Pattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPattern, PatternstructurePackage.CONDITION__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(Pattern newPattern) {
		if (newPattern != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.CONDITION__PATTERN && newPattern != null)) {
			if (EcoreUtil.isAncestor(this, newPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, PatternstructurePackage.PATTERN__CONDITION, Pattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.CONDITION__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantifiedCondition getQuantifiedCondition() {
		if (eContainerFeatureID() != PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION) return null;
		return (QuantifiedCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantifiedCondition(QuantifiedCondition newQuantifiedCondition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQuantifiedCondition, PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantifiedCondition(QuantifiedCondition newQuantifiedCondition) {
		if (newQuantifiedCondition != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION && newQuantifiedCondition != null)) {
			if (EcoreUtil.isAncestor(this, newQuantifiedCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQuantifiedCondition != null)
				msgs = ((InternalEObject)newQuantifiedCondition).eInverseAdd(this, PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION, QuantifiedCondition.class, msgs);
			msgs = basicSetQuantifiedCondition(newQuantifiedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION, newQuantifiedCondition, newQuantifiedCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Formula getFormula1() {
		if (eContainerFeatureID() != PatternstructurePackage.CONDITION__FORMULA1) return null;
		return (Formula)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormula1(Formula newFormula1, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFormula1, PatternstructurePackage.CONDITION__FORMULA1, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormula1(Formula newFormula1) {
		if (newFormula1 != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.CONDITION__FORMULA1 && newFormula1 != null)) {
			if (EcoreUtil.isAncestor(this, newFormula1))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFormula1 != null)
				msgs = ((InternalEObject)newFormula1).eInverseAdd(this, PatternstructurePackage.FORMULA__CONDITION1, Formula.class, msgs);
			msgs = basicSetFormula1(newFormula1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.CONDITION__FORMULA1, newFormula1, newFormula1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Formula getFormula2() {
		if (eContainerFeatureID() != PatternstructurePackage.CONDITION__FORMULA2) return null;
		return (Formula)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormula2(Formula newFormula2, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFormula2, PatternstructurePackage.CONDITION__FORMULA2, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormula2(Formula newFormula2) {
		if (newFormula2 != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.CONDITION__FORMULA2 && newFormula2 != null)) {
			if (EcoreUtil.isAncestor(this, newFormula2))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFormula2 != null)
				msgs = ((InternalEObject)newFormula2).eInverseAdd(this, PatternstructurePackage.FORMULA__CONDITION2, Formula.class, msgs);
			msgs = basicSetFormula2(newFormula2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.CONDITION__FORMULA2, newFormula2, newFormula2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotCondition getNotCondition() {
		if (eContainerFeatureID() != PatternstructurePackage.CONDITION__NOT_CONDITION) return null;
		return (NotCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotCondition(NotCondition newNotCondition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNotCondition, PatternstructurePackage.CONDITION__NOT_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotCondition(NotCondition newNotCondition) {
		if (newNotCondition != eInternalContainer() || (eContainerFeatureID() != PatternstructurePackage.CONDITION__NOT_CONDITION && newNotCondition != null)) {
			if (EcoreUtil.isAncestor(this, newNotCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNotCondition != null)
				msgs = ((InternalEObject)newNotCondition).eInverseAdd(this, PatternstructurePackage.NOT_CONDITION__CONDITION, NotCondition.class, msgs);
			msgs = basicSetNotCondition(newNotCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.CONDITION__NOT_CONDITION, newNotCondition, newNotCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MorphismContainer> getNextMorphismContainers() throws InvalidityException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.CONDITION__PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPattern((Pattern)otherEnd, msgs);
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQuantifiedCondition((QuantifiedCondition)otherEnd, msgs);
			case PatternstructurePackage.CONDITION__FORMULA1:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFormula1((Formula)otherEnd, msgs);
			case PatternstructurePackage.CONDITION__FORMULA2:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFormula2((Formula)otherEnd, msgs);
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNotCondition((NotCondition)otherEnd, msgs);
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
			case PatternstructurePackage.CONDITION__PATTERN:
				return basicSetPattern(null, msgs);
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				return basicSetQuantifiedCondition(null, msgs);
			case PatternstructurePackage.CONDITION__FORMULA1:
				return basicSetFormula1(null, msgs);
			case PatternstructurePackage.CONDITION__FORMULA2:
				return basicSetFormula2(null, msgs);
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				return basicSetNotCondition(null, msgs);
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
			case PatternstructurePackage.CONDITION__PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.PATTERN__CONDITION, Pattern.class, msgs);
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.QUANTIFIED_CONDITION__CONDITION, QuantifiedCondition.class, msgs);
			case PatternstructurePackage.CONDITION__FORMULA1:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.FORMULA__CONDITION1, Formula.class, msgs);
			case PatternstructurePackage.CONDITION__FORMULA2:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.FORMULA__CONDITION2, Formula.class, msgs);
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.NOT_CONDITION__CONDITION, NotCondition.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternstructurePackage.CONDITION__COND_DEPTH:
				return getCondDepth();
			case PatternstructurePackage.CONDITION__PATTERN:
				return getPattern();
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				return getQuantifiedCondition();
			case PatternstructurePackage.CONDITION__FORMULA1:
				return getFormula1();
			case PatternstructurePackage.CONDITION__FORMULA2:
				return getFormula2();
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				return getNotCondition();
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
			case PatternstructurePackage.CONDITION__COND_DEPTH:
				setCondDepth((Integer)newValue);
				return;
			case PatternstructurePackage.CONDITION__PATTERN:
				setPattern((Pattern)newValue);
				return;
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				setQuantifiedCondition((QuantifiedCondition)newValue);
				return;
			case PatternstructurePackage.CONDITION__FORMULA1:
				setFormula1((Formula)newValue);
				return;
			case PatternstructurePackage.CONDITION__FORMULA2:
				setFormula2((Formula)newValue);
				return;
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				setNotCondition((NotCondition)newValue);
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
			case PatternstructurePackage.CONDITION__COND_DEPTH:
				setCondDepth(COND_DEPTH_EDEFAULT);
				return;
			case PatternstructurePackage.CONDITION__PATTERN:
				setPattern((Pattern)null);
				return;
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				setQuantifiedCondition((QuantifiedCondition)null);
				return;
			case PatternstructurePackage.CONDITION__FORMULA1:
				setFormula1((Formula)null);
				return;
			case PatternstructurePackage.CONDITION__FORMULA2:
				setFormula2((Formula)null);
				return;
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				setNotCondition((NotCondition)null);
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
			case PatternstructurePackage.CONDITION__COND_DEPTH:
				return condDepth != COND_DEPTH_EDEFAULT;
			case PatternstructurePackage.CONDITION__PATTERN:
				return getPattern() != null;
			case PatternstructurePackage.CONDITION__QUANTIFIED_CONDITION:
				return getQuantifiedCondition() != null;
			case PatternstructurePackage.CONDITION__FORMULA1:
				return getFormula1() != null;
			case PatternstructurePackage.CONDITION__FORMULA2:
				return getFormula2() != null;
			case PatternstructurePackage.CONDITION__NOT_CONDITION:
				return getNotCondition() != null;
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
			case PatternstructurePackage.CONDITION___GET_NEXT_MORPHISM_CONTAINERS:
				try {
					return getNextMorphismContainers();
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
		result.append(" (condDepth: ");
		result.append(condDepth);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
