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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.functions.BooleanOperator;

import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.patternstructure.InvalidTranslationException;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getRelationFromPrevious <em>Relation From Previous</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#isIsTranslated <em>Is Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#isIsRoot <em>Is Root</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends GraphElementImpl implements Element {
	/**
	 * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanOperator> predicates;

	/**
	 * The cached value of the '{@link #getRelationFromPrevious() <em>Relation From Previous</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getRelationFromPrevious()
	 * @generated
	 * @ordered
	 */
	protected Relation relationFromPrevious;

	/**
	 * The default value of the '{@link #isIsTranslated() <em>Is Translated</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRANSLATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTranslated() <em>Is Translated</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsTranslated()
	 * @generated
	 * @ordered
	 */
	protected boolean isTranslated = IS_TRANSLATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean isRoot = IS_ROOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	@Override
	public void isValid(boolean isDefinedPattern, Location loc) throws InvalidTranslationException {
		
		for (Element next : getNextElements()) {
			if (next == null) 
				throw new InvalidTranslationException("nextElement null (" + next + ")");
			next.isValid(isDefinedPattern, loc);
			if (!next.getPreviousElement().equals(this))
				throw new InvalidTranslationException("nextElement not valid (" + next + ")");
		}
		
		for(BooleanOperator predicate : getPredicates()) {
			if (predicate == null) 
				throw new InvalidTranslationException("predicate null (" + predicate + ")");
			predicate.isValid(isDefinedPattern, loc);
		}

		if (!isRoot && getPreviousElement() == null) 
			throw new InvalidTranslationException("previousElement null");
		if (!isRoot) relationFromPrevious.isValid(isDefinedPattern, loc);
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Operator> getAllOperators() throws InvalidTranslationException {
		EList<Operator> res = new BasicEList<Operator>();
		for(Element element : getNextElements()) {
			res.addAll(element.getAllOperators());
		}	
		res.addAll(getPredicates());
		for (Operator op : getPredicates()) {
			res.addAll(op.getAllOperators());
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Input> getAllVariables() throws InvalidTranslationException {
		EList<Input> res = new BasicEList<Input>();
		for(Element element : getNextElements()) {
			res.addAll(element.getAllVariables());
		}
		res.addAll(getRelationFromPrevious().getAllVariables());
		for(Property p : properties) {
			res.addAll(p.getAllVariables());
		}
		for (Operator op : getPredicates()) {
			res.addAll(op.getAllVariables());
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanOperator> getPredicates() {
		if (predicates == null) {
			predicates = new EObjectResolvingEList<BooleanOperator>(BooleanOperator.class, this, GraphstructurePackage.ELEMENT__PREDICATES);
		}
		return predicates;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getRelationFromPrevious() {
		return relationFromPrevious;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationFromPrevious(Relation newRelationFromPrevious, NotificationChain msgs) {
		Relation oldRelationFromPrevious = relationFromPrevious;
		relationFromPrevious = newRelationFromPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, oldRelationFromPrevious, newRelationFromPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationFromPrevious(Relation newRelationFromPrevious) {
		if (newRelationFromPrevious != relationFromPrevious) {
			NotificationChain msgs = null;
			if (relationFromPrevious != null)
				msgs = ((InternalEObject)relationFromPrevious).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, null, msgs);
			if (newRelationFromPrevious != null)
				msgs = ((InternalEObject)newRelationFromPrevious).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, null, msgs);
			msgs = basicSetRelationFromPrevious(newRelationFromPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, newRelationFromPrevious, newRelationFromPrevious));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTranslated() {
		return isTranslated;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTranslated(boolean newIsTranslated) {
		boolean oldIsTranslated = isTranslated;
		isTranslated = newIsTranslated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__IS_TRANSLATED, oldIsTranslated, isTranslated));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRoot() {
		return isRoot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoot(boolean newIsRoot) {
		boolean oldIsRoot = isRoot;
		isRoot = newIsRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__IS_ROOT, oldIsRoot, isRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentWithInverseEList<Property>(Property.class, this, GraphstructurePackage.ELEMENT__PROPERTIES, GraphstructurePackage.PROPERTY__ELEMENT);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String generateXPredicates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String generateXPathExpression() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public abstract EList<Element> getNextElements();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public abstract Element getPreviousElement();


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProperties()).basicAdd(otherEnd, msgs);
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
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				return basicSetRelationFromPrevious(null, msgs);
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case GraphstructurePackage.ELEMENT__PREDICATES:
				return getPredicates();
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				return getRelationFromPrevious();
			case GraphstructurePackage.ELEMENT__IS_TRANSLATED:
				return isIsTranslated();
			case GraphstructurePackage.ELEMENT__IS_ROOT:
				return isIsRoot();
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return getProperties();
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
			case GraphstructurePackage.ELEMENT__PREDICATES:
				getPredicates().clear();
				getPredicates().addAll((Collection<? extends BooleanOperator>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				setRelationFromPrevious((Relation)newValue);
				return;
			case GraphstructurePackage.ELEMENT__IS_TRANSLATED:
				setIsTranslated((Boolean)newValue);
				return;
			case GraphstructurePackage.ELEMENT__IS_ROOT:
				setIsRoot((Boolean)newValue);
				return;
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
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
			case GraphstructurePackage.ELEMENT__PREDICATES:
				getPredicates().clear();
				return;
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				setRelationFromPrevious((Relation)null);
				return;
			case GraphstructurePackage.ELEMENT__IS_TRANSLATED:
				setIsTranslated(IS_TRANSLATED_EDEFAULT);
				return;
			case GraphstructurePackage.ELEMENT__IS_ROOT:
				setIsRoot(IS_ROOT_EDEFAULT);
				return;
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				getProperties().clear();
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
			case GraphstructurePackage.ELEMENT__PREDICATES:
				return predicates != null && !predicates.isEmpty();
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				return relationFromPrevious != null;
			case GraphstructurePackage.ELEMENT__IS_TRANSLATED:
				return isTranslated != IS_TRANSLATED_EDEFAULT;
			case GraphstructurePackage.ELEMENT__IS_ROOT:
				return isRoot != IS_ROOT_EDEFAULT;
			case GraphstructurePackage.ELEMENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
			case GraphstructurePackage.ELEMENT___GENERATE_XPREDICATES:
				return generateXPredicates();
			case GraphstructurePackage.ELEMENT___GENERATE_XPATH_EXPRESSION:
				return generateXPathExpression();
			case GraphstructurePackage.ELEMENT___GET_NEXT_ELEMENTS:
				return getNextElements();
			case GraphstructurePackage.ELEMENT___GET_PREVIOUS_ELEMENT:
				return getPreviousElement();
			case GraphstructurePackage.ELEMENT___GET_ALL_OPERATORS:
				try {
					return getAllOperators();
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
		result.append(" (isTranslated: ");
		result.append(isTranslated);
		result.append(", isRoot: ");
		result.append(isRoot);
		result.append(')');
		return result.toString();
	}

} // ElementImpl
