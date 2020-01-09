/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.SetElement;
import qualitypatternmodel.patternstructure.InvalidTranslationException;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SetElementImpl#getNext <em>Next</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SetElementImpl#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetElementImpl extends ElementImpl implements SetElement {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<SetElement> next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Element previous;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetElementImpl() {
		super();
	}


	@Override
	public void isValid(boolean isDefinedPattern, Location loc) throws InvalidTranslationException {
		if (loc == Location.RETURN)
			throw new InvalidTranslationException("SetElement in ReturnGraph");
		super.isValid(isDefinedPattern, loc);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.SET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetElement> getNext() {
		if (next == null) {
			next = new EObjectContainmentEList<SetElement>(SetElement.class, this, GraphstructurePackage.SET_ELEMENT__NEXT);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (Element)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.SET_ELEMENT__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(Element newPrevious) {
		Element oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SET_ELEMENT__PREVIOUS, oldPrevious, previous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
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
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				return getNext();
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
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
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends SetElement>)newValue);
				return;
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS:
				setPrevious((Element)newValue);
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
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				getNext().clear();
				return;
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS:
				setPrevious((Element)null);
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
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				return next != null && !next.isEmpty();
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS:
				return previous != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public EList<Element> getNextElements() {
		EList<Element> elementListNext = new BasicEList<Element>();
		for(Element element : getNext()) {
			elementListNext.add(element);
		}		
		return elementListNext;
	}

	@Override
	public Element getPreviousElement() {
		return getPrevious();
	}
	

} //SetElementImpl
