/**
 */
package qualitypatternmodel.patternstructure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.SingleElementMapping;
/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Single
 * Element Mapping</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.SingleElementMappingImpl#getFrom <em>From</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.SingleElementMappingImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleElementMappingImpl extends MappingImpl implements SingleElementMapping {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Element from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Element to;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SingleElementMappingImpl() {
		super();
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (from == null)
			throw new InvalidityException("SingleElementMapping " + getInternalId() + ": from-element null");
		if (to == null)
			throw new InvalidityException("SingleElementMapping " + getInternalId() + ": to null");
//		if (from.getGraphDepth() + 1 != to.getGraphDepth() && to.getGraphDepth() != getMappingDepth()) {
//			throw new InvalidityException("SingleElementMapping " + getInternalId() + ": invalid target elements: " + from.getId() + "(" + from.getGraphDepth() + ")"
//					+ " -> " + to.getId() + " (" + to.getGraphDepth() + ")" + " map: " + getMappingDepth());
//		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.SINGLE_ELEMENT_MAPPING;
	}
	
	@Override
	public NotificationChain basicSetMorphism(Morphism newMorphism, NotificationChain msgs) {
		if (getFrom() != null) getFrom().getMappingTo().remove(this);
		if (getTo() != null) getTo().setMappingFrom(null);
		return super.basicSetMorphism(newMorphism, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Element)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.SINGLE_ELEMENT_MAPPING__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetFrom(Element newFrom, NotificationChain msgs) {
		Element oldFrom = from;
		from = newFrom;
		if (newFrom != null && getTo() != null) {
			newFrom.setName(getTo().getName());
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.SINGLE_ELEMENT_MAPPING__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(Element newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, GraphstructurePackage.ELEMENT__MAPPING_TO, Element.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, GraphstructurePackage.ELEMENT__MAPPING_TO, Element.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.SINGLE_ELEMENT_MAPPING__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Element)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.SINGLE_ELEMENT_MAPPING__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTo(Element newTo, NotificationChain msgs) {
		Element oldTo = to;
		to = newTo;
		if (newTo != null && getFrom() != null) {
			newTo.setName(getFrom().getName());
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.SINGLE_ELEMENT_MAPPING__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(Element newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, GraphstructurePackage.ELEMENT__MAPPING_FROM, Element.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, GraphstructurePackage.ELEMENT__MAPPING_FROM, Element.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.SINGLE_ELEMENT_MAPPING__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, GraphstructurePackage.ELEMENT__MAPPING_TO, Element.class, msgs);
				return basicSetFrom((Element)otherEnd, msgs);
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, GraphstructurePackage.ELEMENT__MAPPING_FROM, Element.class, msgs);
				return basicSetTo((Element)otherEnd, msgs);
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
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING__FROM:
				return basicSetFrom(null, msgs);
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING__TO:
				return basicSetTo(null, msgs);
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
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING__FROM:
				setFrom((Element)newValue);
				return;
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING__TO:
				setTo((Element)newValue);
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
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING__FROM:
				setFrom((Element)null);
				return;
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING__TO:
				setTo((Element)null);
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
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING__FROM:
				return from != null;
			case PatternstructurePackage.SINGLE_ELEMENT_MAPPING__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String myToString() {
		String res = "SingleElementMapping (" + getInternalId() + ") ";
		res += "[";
		if (getFrom()!= null) res += getFrom().getInternalId();
		else res += "-";		
		res += " -> ";
		if (getTo()!= null) res += getTo().getInternalId() ;
		else res += "-";	
		res += "]";
		return res;
	}

} // SingleElementMappingImpl
