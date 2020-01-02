/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.functions.BooleanOperator;

import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getPredicates <em>Predicates</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#getRelationFromPrevious <em>Relation From Previous</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#isIsTranslated <em>Is Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ElementImpl#isIsRoot <em>Is Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends GraphElementImpl implements Element {
	/**
	 * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicates()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanOperator> predicates;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelationFromPrevious() <em>Relation From Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationFromPrevious()
	 * @generated
	 * @ordered
	 */
	protected Relation relationFromPrevious;

	/**
	 * The default value of the '{@link #isIsTranslated() <em>Is Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRANSLATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTranslated() <em>Is Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTranslated()
	 * @generated
	 * @ordered
	 */
	protected boolean isTranslated = IS_TRANSLATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean isRoot = IS_ROOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}
	
	@Override
	public boolean isValid(boolean isDefinedPattern) {
		for(Element next : getNextElements()) {
			if(!(next.isValid(isDefinedPattern) && next.getPreviousElement().equals(this))) {
				return false;
			}
		}
		return getPreviousElement() != null  && relationFromPrevious.isValid(isDefinedPattern) || isRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BooleanOperator> getPredicates() {
		if (predicates == null) {
			predicates = new EObjectContainmentEList<BooleanOperator>(BooleanOperator.class, this, GraphstructurePackage.ELEMENT__PREDICATES);
		}
		return predicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getRelationFromPrevious() {
		return relationFromPrevious;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTranslated() {
		return isTranslated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTranslated(boolean newIsTranslated) {
		boolean oldIsTranslated = isTranslated;
		isTranslated = newIsTranslated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__IS_TRANSLATED, oldIsTranslated, isTranslated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRoot() {
		return isRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public String generateXPredicates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String generateXPathExpression() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public abstract EList<Element> getNextElements();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public abstract Element getPreviousElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.ELEMENT__PREDICATES:
				return ((InternalEList<?>)getPredicates()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				return basicSetRelationFromPrevious(null, msgs);
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
			case GraphstructurePackage.ELEMENT__PREDICATES:
				return getPredicates();
			case GraphstructurePackage.ELEMENT__ID:
				return getId();
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				return getRelationFromPrevious();
			case GraphstructurePackage.ELEMENT__IS_TRANSLATED:
				return isIsTranslated();
			case GraphstructurePackage.ELEMENT__IS_ROOT:
				return isIsRoot();
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
			case GraphstructurePackage.ELEMENT__PREDICATES:
				getPredicates().clear();
				getPredicates().addAll((Collection<? extends BooleanOperator>)newValue);
				return;
			case GraphstructurePackage.ELEMENT__ID:
				setId((Integer)newValue);
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
			case GraphstructurePackage.ELEMENT__PREDICATES:
				getPredicates().clear();
				return;
			case GraphstructurePackage.ELEMENT__ID:
				setId(ID_EDEFAULT);
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
			case GraphstructurePackage.ELEMENT__PREDICATES:
				return predicates != null && !predicates.isEmpty();
			case GraphstructurePackage.ELEMENT__ID:
				return id != ID_EDEFAULT;
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				return relationFromPrevious != null;
			case GraphstructurePackage.ELEMENT__IS_TRANSLATED:
				return isTranslated != IS_TRANSLATED_EDEFAULT;
			case GraphstructurePackage.ELEMENT__IS_ROOT:
				return isRoot != IS_ROOT_EDEFAULT;
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
			case GraphstructurePackage.ELEMENT___GENERATE_XPREDICATES:
				return generateXPredicates();
			case GraphstructurePackage.ELEMENT___GENERATE_XPATH_EXPRESSION:
				return generateXPathExpression();
			case GraphstructurePackage.ELEMENT___GET_NEXT_ELEMENTS:
				return getNextElements();
			case GraphstructurePackage.ELEMENT___GET_PREVIOUS_ELEMENT:
				return getPreviousElement();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", isTranslated: ");
		result.append(isTranslated);
		result.append(", isRoot: ");
		result.append(isRoot);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
