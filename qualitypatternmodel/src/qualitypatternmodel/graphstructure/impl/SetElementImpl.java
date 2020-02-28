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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.Count;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.SetElement;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Set
 * Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SetElementImpl#getNestingDepth <em>Nesting Depth</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SetElementImpl#getNext <em>Next</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SetElementImpl#getPreviousSet <em>Previous Set</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SetElementImpl#getPreviousSingle <em>Previous Single</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SetElementImpl#isBeingTranslated <em>Being Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SetElementImpl#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetElementImpl extends ElementImpl implements SetElement {
	/**
	 * The default value of the '{@link #getNestingDepth() <em>Nesting Depth</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNestingDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int NESTING_DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNestingDepth() <em>Nesting Depth</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNestingDepth()
	 * @generated
	 * @ordered
	 */
	protected int nestingDepth = NESTING_DEPTH_EDEFAULT;

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
	 * The default value of the '{@link #isBeingTranslated() <em>Being Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeingTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEING_TRANSLATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBeingTranslated() <em>Being Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeingTranslated()
	 * @generated
	 * @ordered
	 */
	protected boolean beingTranslated = BEING_TRANSLATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected Count count;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SetElementImpl() {
		super();
	}

	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		super.isValidLocal(isDefinedPattern);
		if (getGraphDepth() == 0)
			throw new InvalidityException("SetElement in ReturnGraph");
		if (getPreviousSingle() == null && getPreviousSet() == null)
			throw new InvalidityException("previous null");
		if (getPreviousSet() != null && getPreviousSingle() != null) 
			throw new InvalidityException("previous invalid");		
		if (getRelationFromPrevious() == null)
			throw new InvalidityException("relation not specified");
		
		// TODO: delete the following, if we allow other set operators than count
//		boolean countExists = false;
//		ListOfElements listOfElements = getPathToPreviousSingleElement();
//		for(Element element : listOfElements) {
//			if(element instanceof SetElement) {
//				SetElement setElement = (SetElement) element;
//				if(setElement.getCount() != null){
//					countExists = true;
//				}
//			}
//		}
		// TODO: or next* has count
//		if(count==null && !countExists) {
//			throw new InvalidityException("missing count for SetElement");
//		}
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		return toXQuery(location, 1);
	}

	public String toXQuery(Location location, int depth) throws InvalidityException {
		translated = true;
		beingTranslated = true;
		nestingDepth = depth;
		if (getPreviousSet() == null && getPreviousSingle() == null) {
			throw new InvalidityException("previous null");
		}
		if (getPreviousSet() != null && getPreviousSingle() != null) {
			throw new InvalidityException("previous invalid");
		}		
		String xPathExpression = translatePathFromPrevious();
		xPathExpression += translatePredicates(location, depth + 1);
		xPathExpression += translateElementExistencePredicates(location, depth + 1);
		beingTranslated = false;
		if (getPreviousSingle() != null) {
			return getPreviousSingle().getXQueryRepresentation(location, depth) + xPathExpression;
		}
		if (getPreviousSet().isTranslatable()) {
			return "." + xPathExpression;
		}
		return getPreviousSet().toXQuery(location) + xPathExpression;
	}

	@Override
	public boolean isTranslatable() throws InvalidityException {
		return beingTranslated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param depth
	 * 
	 */
	public String translatePredicates(Location location, int depth) throws InvalidityException {
		String xPredicates = "";
		predicatesAreBeingTranslated = true;
		for (BooleanOperator predicate : predicates) {
			if (predicate.isTranslatable()) {
				xPredicates += "[" + predicate.toXQuery(location, depth) + "]";
			}
		}
		predicatesAreBeingTranslated = false;
		return xPredicates;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * 
	 */
	@Override
	public ListOfElements getPathToPreviousSingleElement() throws InvalidityException {
		if (getPreviousSingle() != null) {		
			ListOfElements listOfElements = new ListOfElements();
//			listOfElements.add(this);
			listOfElements.add(getPreviousSingle());
			return listOfElements;
		} else if (getPreviousSet() != null) {	
			ListOfElements list = getPreviousSet().getPathToPreviousSingleElement();
			list.add(getPreviousSet());
			return list;
		} else { 
			throw new InvalidityException("previous null");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	@Override
	public EList<ListOfElements> getAllArgumentElementsSetOperation() throws InvalidityException {
		EList<ListOfElements> list = new BasicEList<ListOfElements>();
		list.add(getPathToPreviousSingleElement());
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * 
	 */
	@Override
	public EList<ListOfElements> getAllArgumentElements() throws InvalidityException {		
		EList<ListOfElements> list = new BasicEList<ListOfElements>();		
		ListOfElements listOfElements = new ListOfElements();
		listOfElements.add(this);
		list.add(listOfElements);
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNext()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreviousSet((SetElement)otherEnd, msgs);
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SINGLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPreviousSingle((SingleElement)otherEnd, msgs);
			case GraphstructurePackage.SET_ELEMENT__COUNT:
				if (count != null)
					msgs = ((InternalEObject)count).eInverseRemove(this, FunctionsPackage.COUNT__ARGUMENT, Count.class, msgs);
				return basicSetCount((Count)otherEnd, msgs);
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
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SET:
				return basicSetPreviousSet(null, msgs);
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SINGLE:
				return basicSetPreviousSingle(null, msgs);
			case GraphstructurePackage.SET_ELEMENT__COUNT:
				return basicSetCount(null, msgs);
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
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SET:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.SET_ELEMENT__NEXT, SetElement.class, msgs);
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SINGLE:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.SINGLE_ELEMENT__NEXT_SET, SingleElement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	@Override
	public String translatePathFromPrevious() {
//		System.out.println("translatePathFromPrevious: " + relationFromPrevious.getAxis());
		return "/" + relationFromPrevious.getAxis() + "::*";
	}

	@Override
	public String getXQueryRepresentation(Location location, int depth) throws InvalidityException {
		if (predicatesAreBeingTranslated) {
			return getContextRepresentation(depth - nestingDepth); 
		} else {
			if (translated) { // TODO: check if this is correct
				return toXQuery(location, depth);
			} else {
				throw new InvalidityException("element not yet translated");
			}
		}
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
	@Override
	public int getNestingDepth() {
		return nestingDepth;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNestingDepth(int newNestingDepth) {
		int oldNestingDepth = nestingDepth;
		nestingDepth = newNestingDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SET_ELEMENT__NESTING_DEPTH, oldNestingDepth, nestingDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SetElement> getNext() {
		if (next == null) {
			next = new EObjectContainmentWithInverseEList<SetElement>(SetElement.class, this, GraphstructurePackage.SET_ELEMENT__NEXT, GraphstructurePackage.SET_ELEMENT__PREVIOUS_SET);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetElement getPreviousSet() {
		if (eContainerFeatureID() != GraphstructurePackage.SET_ELEMENT__PREVIOUS_SET) return null;
		return (SetElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousSet(SetElement newPreviousSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPreviousSet, GraphstructurePackage.SET_ELEMENT__PREVIOUS_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousSet(SetElement newPreviousSet) {
		if (newPreviousSet != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.SET_ELEMENT__PREVIOUS_SET && newPreviousSet != null)) {
			if (EcoreUtil.isAncestor(this, newPreviousSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreviousSet != null)
				msgs = ((InternalEObject)newPreviousSet).eInverseAdd(this, GraphstructurePackage.SET_ELEMENT__NEXT, SetElement.class, msgs);
			msgs = basicSetPreviousSet(newPreviousSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SET_ELEMENT__PREVIOUS_SET, newPreviousSet, newPreviousSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleElement getPreviousSingle() {
		if (eContainerFeatureID() != GraphstructurePackage.SET_ELEMENT__PREVIOUS_SINGLE) return null;
		return (SingleElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousSingle(SingleElement newPreviousSingle, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPreviousSingle, GraphstructurePackage.SET_ELEMENT__PREVIOUS_SINGLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreviousSingle(SingleElement newPreviousSingle) {
		if (newPreviousSingle != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.SET_ELEMENT__PREVIOUS_SINGLE && newPreviousSingle != null)) {
			if (EcoreUtil.isAncestor(this, newPreviousSingle))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreviousSingle != null)
				msgs = ((InternalEObject)newPreviousSingle).eInverseAdd(this, GraphstructurePackage.SINGLE_ELEMENT__NEXT_SET, SingleElement.class, msgs);
			msgs = basicSetPreviousSingle(newPreviousSingle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SET_ELEMENT__PREVIOUS_SINGLE, newPreviousSingle, newPreviousSingle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBeingTranslated() {
		return beingTranslated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeingTranslated(boolean newBeingTranslated) {
		boolean oldBeingTranslated = beingTranslated;
		beingTranslated = newBeingTranslated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SET_ELEMENT__BEING_TRANSLATED, oldBeingTranslated, beingTranslated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Count getCount() {
		if (count != null && count.eIsProxy()) {
			InternalEObject oldCount = (InternalEObject)count;
			count = (Count)eResolveProxy(oldCount);
			if (count != oldCount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.SET_ELEMENT__COUNT, oldCount, count));
			}
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count basicGetCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(Count newCount, NotificationChain msgs) {
		Count oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SET_ELEMENT__COUNT, oldCount, newCount);
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
	public void setCount(Count newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, FunctionsPackage.COUNT__ARGUMENT, Count.class, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, FunctionsPackage.COUNT__ARGUMENT, Count.class, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SET_ELEMENT__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphstructurePackage.SET_ELEMENT__NESTING_DEPTH:
				return getNestingDepth();
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				return getNext();
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SET:
				return getPreviousSet();
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SINGLE:
				return getPreviousSingle();
			case GraphstructurePackage.SET_ELEMENT__BEING_TRANSLATED:
				return isBeingTranslated();
			case GraphstructurePackage.SET_ELEMENT__COUNT:
				if (resolve) return getCount();
				return basicGetCount();
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
			case GraphstructurePackage.SET_ELEMENT__NESTING_DEPTH:
				setNestingDepth((Integer)newValue);
				return;
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends SetElement>)newValue);
				return;
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SET:
				setPreviousSet((SetElement)newValue);
				return;
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SINGLE:
				setPreviousSingle((SingleElement)newValue);
				return;
			case GraphstructurePackage.SET_ELEMENT__BEING_TRANSLATED:
				setBeingTranslated((Boolean)newValue);
				return;
			case GraphstructurePackage.SET_ELEMENT__COUNT:
				setCount((Count)newValue);
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
			case GraphstructurePackage.SET_ELEMENT__NESTING_DEPTH:
				setNestingDepth(NESTING_DEPTH_EDEFAULT);
				return;
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				getNext().clear();
				return;
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SET:
				setPreviousSet((SetElement)null);
				return;
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SINGLE:
				setPreviousSingle((SingleElement)null);
				return;
			case GraphstructurePackage.SET_ELEMENT__BEING_TRANSLATED:
				setBeingTranslated(BEING_TRANSLATED_EDEFAULT);
				return;
			case GraphstructurePackage.SET_ELEMENT__COUNT:
				setCount((Count)null);
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
			case GraphstructurePackage.SET_ELEMENT__NESTING_DEPTH:
				return nestingDepth != NESTING_DEPTH_EDEFAULT;
			case GraphstructurePackage.SET_ELEMENT__NEXT:
				return next != null && !next.isEmpty();
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SET:
				return getPreviousSet() != null;
			case GraphstructurePackage.SET_ELEMENT__PREVIOUS_SINGLE:
				return getPreviousSingle() != null;
			case GraphstructurePackage.SET_ELEMENT__BEING_TRANSLATED:
				return beingTranslated != BEING_TRANSLATED_EDEFAULT;
			case GraphstructurePackage.SET_ELEMENT__COUNT:
				return count != null;
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
			case GraphstructurePackage.SET_ELEMENT___TRANSLATE_PREDICATES__LOCATION_INT:
				try {
					return translatePredicates((Location)arguments.get(0), (Integer)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SET_ELEMENT___GET_PATH_TO_PREVIOUS_SINGLE_ELEMENT:
				try {
					return getPathToPreviousSingleElement();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.SET_ELEMENT___GET_ALL_ARGUMENT_ELEMENTS_SET_OPERATION:
				try {
					return getAllArgumentElementsSetOperation();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
		result.append(" (nestingDepth: ");
		result.append(nestingDepth);
		result.append(", beingTranslated: ");
		result.append(beingTranslated);
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
		if (getPreviousSingle() != null && getPreviousSet() != null) {
			return null;
		} else if (getPreviousSingle() != null) {
			return getPreviousSingle();
		} else if (getPreviousSet() != null) {
			return getPreviousSet();
		} else {
			return null;
		}
	}

} // SetElementImpl
