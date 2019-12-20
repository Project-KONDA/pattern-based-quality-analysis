/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends GraphElementImpl implements Element {
	/**
	 * The cached value of the '{@link #getPredicates() <em>Predicates</em>}' reference list.
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
	 * The cached value of the '{@link #getRelationFromPrevious() <em>Relation From Previous</em>}' reference.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
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
			predicates = new EObjectResolvingEList<BooleanOperator>(BooleanOperator.class, this, GraphstructurePackage.ELEMENT__PREDICATES);
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
		if (relationFromPrevious != null && relationFromPrevious.eIsProxy()) {
			InternalEObject oldRelationFromPrevious = (InternalEObject)relationFromPrevious;
			relationFromPrevious = (Relation)eResolveProxy(oldRelationFromPrevious);
			if (relationFromPrevious != oldRelationFromPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, oldRelationFromPrevious, relationFromPrevious));
			}
		}
		return relationFromPrevious;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetRelationFromPrevious() {
		return relationFromPrevious;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationFromPrevious(Relation newRelationFromPrevious) {
		Relation oldRelationFromPrevious = relationFromPrevious;
		relationFromPrevious = newRelationFromPrevious;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS, oldRelationFromPrevious, relationFromPrevious));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphstructurePackage.ELEMENT__PREDICATES:
				return getPredicates();
			case GraphstructurePackage.ELEMENT__ID:
				return getId();
			case GraphstructurePackage.ELEMENT__RELATION_FROM_PREVIOUS:
				if (resolve) return getRelationFromPrevious();
				return basicGetRelationFromPrevious();
			case GraphstructurePackage.ELEMENT__IS_TRANSLATED:
				return isIsTranslated();
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
		result.append(')');
		return result.toString();
	}

} //ElementImpl
