/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link qualitypatternmodel.graphstructure.impl.SetElementImpl#getNestingDepth <em>Nesting Depth</em>}</li>
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SetElementImpl() {
		super();
	}

	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (getGraphDepth() == 0)
			throw new InvalidityException("SetElement in ReturnGraph");
		if (getPreviousElement() == null)
			throw new InvalidityException("previousElement null");
		for( Element element : getNext()) if (element instanceof SingleElement) throw new InvalidityException("SingleElement as Child of SetElement");
		super.isValidLocal(isDefinedPattern);
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		return toXQuery(location, 1);
	}

	public String toXQuery(Location location, int depth) throws InvalidityException {
		translated = true;
		nestingDepth = depth;
		if (getPrevious() == null) {
			throw new InvalidityException("previous null");
		}
		if (getPrevious() instanceof SingleElement) {
			return ((SingleElement) getPrevious()).getXQueryRepresentation(location, depth);
		}
		String xPathExpression = translatePathFromPrevious(depth);
		xPathExpression += translatePredicates(location, depth + 1);
		xPathExpression += translateElementExistencePredicates(location, depth + 1);
		return getPrevious().toXQuery(location) + xPathExpression;
	}

	@Override
	public boolean isTranslatable() {
		return getPrevious().isTranslatable();
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

	@Override
	public String translatePathFromPrevious(int depth) {
		return "/" + relationFromPrevious.getAxis() + "::*";
	}

	@Override
	public String getXQueryRepresentation(Location location, int depth) throws InvalidityException {
		if (predicatesAreBeingTranslated) {

			return getContextRepresentation(depth - nestingDepth);
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
		for (Element nextElement : next) {
			if (! (next instanceof SetElement)) throw new InvalidityException("singleElement is child of setElement");
			if (!nextElement.isTranslated()) {
				nextElement.setTranslated(true);
				predicates += "[." + ((SetElement) nextElement).translatePathFromPrevious(depth)
						+ ((SetElement) nextElement).translatePredicates(location, depth)
						+ ((SetElement) nextElement).translateElementExistencePredicates(location, depth) + "]";
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

//	/**
//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
//	 */
//	public void setPrevious(Element newPrevious) {
//		Element oldPrevious = previous;
//		previous = newPrevious;
//		if (eNotificationRequired())
//			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.SET_ELEMENT__PREVIOUS,
//					oldPrevious, previous));
//	}

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
