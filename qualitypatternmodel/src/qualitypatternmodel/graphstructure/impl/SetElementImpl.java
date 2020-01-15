/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;
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

import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.SetElement;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Set
 * Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SetElementImpl#getNext <em>Next</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SetElementImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SetElementImpl#getNestingDepth <em>Nesting Depth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetElementImpl extends ElementImpl implements SetElement {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<SetElement> next;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Element previous;

	/**
	 * The default value of the '{@link #getNestingDepth() <em>Nesting Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestingDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int NESTING_DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNestingDepth() <em>Nesting Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestingDepth()
	 * @generated
	 * @ordered
	 */
	protected int nestingDepth = NESTING_DEPTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SetElementImpl() {
		super();
	}

	@Override
	public void isValid(boolean isDefinedPattern, int depth) throws InvalidityException {
		if (depth == 0)
			throw new InvalidityException("SetElement in ReturnGraph");
		super.isValid(isDefinedPattern, depth);
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		return toXQuery(location, 1);
	}
	
	public String toXQuery(Location location, int depth) throws InvalidityException {
		translated = true;
		nestingDepth = depth;
		if (previous == null) {
			throw new InvalidityException("previous null");
		}
		if (previous instanceof SingleElement) {
			return ((SingleElement) previous).getXQueryRepresentation(location, depth);
		}
		String xPathExpression = translatePathFromPrevious(depth);		
		xPathExpression += translatePredicates(location, depth+1);		
		xPathExpression += translateElementExistencePredicates(location, depth+1);	
		return previous.toXQuery(location) + xPathExpression;
	}

	@Override
	public boolean isTranslatable() {
		return previous.isTranslatable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param depth 
	 * 
	 */
	public String translatePredicates(Location location, int depth) throws InvalidityException {
		String xPredicates = "";
		predicatesAreBeingTranslated = true;
		for (BooleanOperator predicate : predicates){
			if (predicate.isTranslatable()){
				xPredicates += "[" + predicate.toXQuery(location, depth) + "]";
			}
		}
		predicatesAreBeingTranslated = false;
		return xPredicates;
	}
	
	@Override
	public String translatePathFromPrevious(int depth) {
		return "/" + relationFromPrevious.getAxis() + "::*";
	}

	@Override
	public String getXQueryRepresentation(Location location, int depth) throws InvalidityException {
		if (predicatesAreBeingTranslated) {
			
			return getContextRepresentation(depth-nestingDepth);
		} else {
			if (translated) {
				return toXQuery(location, depth);
			} else {
				throw new InvalidityException("element not yet translated");
			}
		}
	}

//	@Override
//	public String getXQueryRepresentation() throws InvalidityException {		
//		return ".";		
//	}

	public String translateElementExistencePredicates(Location location, int depth) throws InvalidityException {
		String predicates = "";
		for (SetElement nextSetElement : next) {
			if (!nextSetElement.isTranslated()) {
				nextSetElement.setTranslated(true);
				predicates += "[." + nextSetElement.translatePathFromPrevious(depth)
						+ nextSetElement.translatePredicates(location, depth)
						+ nextSetElement.translateElementExistencePredicates(location, depth) + "]";
			}
		}
		return predicates;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.SET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetElement> getNext() {
		if (next == null) {
			next = new EObjectContainmentEList<SetElement>(SetElement.class, this, GraphstructurePackage.SET_ELEMENT__NEXT);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public int getNestingDepth() {
		return nestingDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingDepth(int newNestingDepth) {
		int oldNestingDepth = nestingDepth;
		nestingDepth = newNestingDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SET_ELEMENT__NESTING_DEPTH, oldNestingDepth, nestingDepth));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
			case GraphstructurePackage.SET_ELEMENT__NESTING_DEPTH:
				return getNestingDepth();
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
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends SetElement>)newValue);
				return;
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS:
				setPrevious((Element)newValue);
				return;
			case GraphstructurePackage.SET_ELEMENT__NESTING_DEPTH:
				setNestingDepth((Integer)newValue);
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
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				getNext().clear();
				return;
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS:
				setPrevious((Element)null);
				return;
			case GraphstructurePackage.SET_ELEMENT__NESTING_DEPTH:
				setNestingDepth(NESTING_DEPTH_EDEFAULT);
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
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				return next != null && !next.isEmpty();
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS:
				return previous != null;
			case GraphstructurePackage.SET_ELEMENT__NESTING_DEPTH:
				return nestingDepth != NESTING_DEPTH_EDEFAULT;
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
			case GraphstructurePackage.SET_ELEMENT___TRANSLATE_ELEMENT_EXISTENCE_PREDICATES__LOCATION_INT:
				try {
					return translateElementExistencePredicates((Location)arguments.get(0), (Integer)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SET_ELEMENT___TRANSLATE_PATH_FROM_PREVIOUS__INT:
				return translatePathFromPrevious((Integer)arguments.get(0));
			case GraphstructurePackage.SET_ELEMENT___TRANSLATE_PREDICATES__LOCATION_INT:
				try {
					return translatePredicates((Location)arguments.get(0), (Integer)arguments.get(1));
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
		result.append(" (nestingDepth: ");
		result.append(nestingDepth);
		result.append(')');
		return result.toString();
	}

	@Override
	public EList<Element> getNextElements() {
		EList<Element> elementListNext = new BasicEList<Element>();
		for (Element element : getNext()) {
			elementListNext.add(element);
		}
		return elementListNext;
	}

	@Override
	public Element getPreviousElement() {
		return getPrevious();
	}

} // SetElementImpl
