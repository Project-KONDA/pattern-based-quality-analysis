/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.Element;
import QualityPatternModel.Graph;
import QualityPatternModel.QualityPatternModelPackage;
import QualityPatternModel.VariableList;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QualityPatternModel.impl.GraphImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link QualityPatternModel.impl.GraphImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link QualityPatternModel.impl.GraphImpl#getVariablelist <em>Variablelist</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends MinimalEObjectImpl.Container implements Graph {
	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> return_;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Element root;

	/**
	 * The cached value of the '{@link #getVariablelist() <em>Variablelist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariablelist()
	 * @generated
	 * @ordered
	 */
	protected VariableList variablelist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityPatternModelPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getReturn() {
		if (return_ == null) {
			return_ = new EObjectResolvingEList<Element>(Element.class, this, QualityPatternModelPackage.GRAPH__RETURN);
		}
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (Element)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityPatternModelPackage.GRAPH__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Element newRoot) {
		Element oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.GRAPH__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableList getVariablelist() {
		return variablelist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariablelist(VariableList newVariablelist, NotificationChain msgs) {
		VariableList oldVariablelist = variablelist;
		variablelist = newVariablelist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.GRAPH__VARIABLELIST, oldVariablelist, newVariablelist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariablelist(VariableList newVariablelist) {
		if (newVariablelist != variablelist) {
			NotificationChain msgs = null;
			if (variablelist != null)
				msgs = ((InternalEObject)variablelist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QualityPatternModelPackage.GRAPH__VARIABLELIST, null, msgs);
			if (newVariablelist != null)
				msgs = ((InternalEObject)newVariablelist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QualityPatternModelPackage.GRAPH__VARIABLELIST, null, msgs);
			msgs = basicSetVariablelist(newVariablelist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityPatternModelPackage.GRAPH__VARIABLELIST, newVariablelist, newVariablelist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityPatternModelPackage.GRAPH__VARIABLELIST:
				return basicSetVariablelist(null, msgs);
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
			case QualityPatternModelPackage.GRAPH__RETURN:
				return getReturn();
			case QualityPatternModelPackage.GRAPH__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case QualityPatternModelPackage.GRAPH__VARIABLELIST:
				return getVariablelist();
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
			case QualityPatternModelPackage.GRAPH__RETURN:
				getReturn().clear();
				getReturn().addAll((Collection<? extends Element>)newValue);
				return;
			case QualityPatternModelPackage.GRAPH__ROOT:
				setRoot((Element)newValue);
				return;
			case QualityPatternModelPackage.GRAPH__VARIABLELIST:
				setVariablelist((VariableList)newValue);
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
			case QualityPatternModelPackage.GRAPH__RETURN:
				getReturn().clear();
				return;
			case QualityPatternModelPackage.GRAPH__ROOT:
				setRoot((Element)null);
				return;
			case QualityPatternModelPackage.GRAPH__VARIABLELIST:
				setVariablelist((VariableList)null);
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
			case QualityPatternModelPackage.GRAPH__RETURN:
				return return_ != null && !return_.isEmpty();
			case QualityPatternModelPackage.GRAPH__ROOT:
				return root != null;
			case QualityPatternModelPackage.GRAPH__VARIABLELIST:
				return variablelist != null;
		}
		return super.eIsSet(featureID);
	}

} //GraphImpl
