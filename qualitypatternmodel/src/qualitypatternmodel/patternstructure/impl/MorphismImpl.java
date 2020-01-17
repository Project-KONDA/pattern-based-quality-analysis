/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.Mapping;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Morphism</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getFrom <em>From</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getTo <em>To</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.MorphismImpl#getMorphDepth <em>Morph Depth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MorphismImpl extends PatternElementImpl implements Morphism {
	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<Mapping> mappings;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Graph from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Graph to;

	/**
	 * The default value of the '{@link #getMorphDepth() <em>Morph Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorphDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int MORPH_DEPTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMorphDepth() <em>Morph Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorphDepth()
	 * @generated
	 * @ordered
	 */
	protected int morphDepth = MORPH_DEPTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MorphismImpl() {
		super();
	}

	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException {
		isValidLocal(isDefinedPattern);
		for (Mapping mapping : mappings) {
			mapping.isValid(isDefinedPattern);
		}
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (from == null)
			throw new InvalidityException("from null");
		if (to == null)
			throw new InvalidityException("to null");
		if (from.getGraphDepth() + 1 != to.getGraphDepth() && to.getGraphDepth() != getMorphDepth())
			throw new InvalidityException("invalid target graphs");
		for (Mapping mapping : mappings)
			if (mapping == null)
				throw new InvalidityException("mapping invalid (" + mapping + ")");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.MORPHISM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Mapping> getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList<Mapping>(Mapping.class, this, PatternstructurePackage.MORPHISM__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Graph)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.MORPHISM__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(Graph newFrom) {
		Graph oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Graph)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.MORPHISM__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(Graph newTo) {
		Graph oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMorphDepth() {
		return morphDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMorphDepth(int newMorphDepth) {
		int oldMorphDepth = morphDepth;
		morphDepth = newMorphDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.MORPHISM__MORPH_DEPTH, oldMorphDepth, morphDepth));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				return ((InternalEList<?>)getMappings()).basicRemove(otherEnd, msgs);
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
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				return getMappings();
			case PatternstructurePackage.MORPHISM__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case PatternstructurePackage.MORPHISM__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case PatternstructurePackage.MORPHISM__MORPH_DEPTH:
				return getMorphDepth();
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
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection<? extends Mapping>)newValue);
				return;
			case PatternstructurePackage.MORPHISM__FROM:
				setFrom((Graph)newValue);
				return;
			case PatternstructurePackage.MORPHISM__TO:
				setTo((Graph)newValue);
				return;
			case PatternstructurePackage.MORPHISM__MORPH_DEPTH:
				setMorphDepth((Integer)newValue);
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
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				getMappings().clear();
				return;
			case PatternstructurePackage.MORPHISM__FROM:
				setFrom((Graph)null);
				return;
			case PatternstructurePackage.MORPHISM__TO:
				setTo((Graph)null);
				return;
			case PatternstructurePackage.MORPHISM__MORPH_DEPTH:
				setMorphDepth(MORPH_DEPTH_EDEFAULT);
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
			case PatternstructurePackage.MORPHISM__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
			case PatternstructurePackage.MORPHISM__FROM:
				return from != null;
			case PatternstructurePackage.MORPHISM__TO:
				return to != null;
			case PatternstructurePackage.MORPHISM__MORPH_DEPTH:
				return morphDepth != MORPH_DEPTH_EDEFAULT;
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
		result.append(" (morphDepth: ");
		result.append(morphDepth);
		result.append(')');
		return result.toString();
	}

} // MorphismImpl
