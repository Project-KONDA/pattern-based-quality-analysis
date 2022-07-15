/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.Neo4PathParam;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;

import qualitypatternmodel.graphstructure.impl.RelationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoEdgeImpl#getNeopath <em>Neopath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoEdgeImpl extends RelationImpl implements NeoEdge {
	/**
	 * The cached value of the '{@link #getNeopath() <em>Neopath</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeopath()
	 * @generated
	 * @ordered
	 */
	protected Neo4PathParam neopath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Neo4PathParam getNeopath() {
		if (neopath != null && neopath.eIsProxy()) {
			InternalEObject oldNeopath = (InternalEObject)neopath;
			neopath = (Neo4PathParam)eResolveProxy(oldNeopath);
			if (neopath != oldNeopath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_EDGE__NEOPATH, oldNeopath, neopath));
			}
		}
		return neopath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neo4PathParam basicGetNeopath() {
		return neopath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeopath(Neo4PathParam newNeopath, NotificationChain msgs) {
		Neo4PathParam oldNeopath = neopath;
		neopath = newNeopath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_EDGE__NEOPATH, oldNeopath, newNeopath);
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
	public void setNeopath(Neo4PathParam newNeopath) {
		if (newNeopath != neopath) {
			NotificationChain msgs = null;
			if (neopath != null)
				msgs = ((InternalEObject)neopath).eInverseRemove(this, AdaptionNeo4JPackage.NEO4_PATH_PARAM__NEOEDGE, Neo4PathParam.class, msgs);
			if (newNeopath != null)
				msgs = ((InternalEObject)newNeopath).eInverseAdd(this, AdaptionNeo4JPackage.NEO4_PATH_PARAM__NEOEDGE, Neo4PathParam.class, msgs);
			msgs = basicSetNeopath(newNeopath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_EDGE__NEOPATH, newNeopath, newNeopath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_EDGE__NEOPATH:
				if (neopath != null)
					msgs = ((InternalEObject)neopath).eInverseRemove(this, AdaptionNeo4JPackage.NEO4_PATH_PARAM__NEOEDGE, Neo4PathParam.class, msgs);
				return basicSetNeopath((Neo4PathParam)otherEnd, msgs);
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
			case AdaptionNeo4JPackage.NEO_EDGE__NEOPATH:
				return basicSetNeopath(null, msgs);
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
			case AdaptionNeo4JPackage.NEO_EDGE__NEOPATH:
				if (resolve) return getNeopath();
				return basicGetNeopath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_EDGE__NEOPATH:
				setNeopath((Neo4PathParam)newValue);
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
			case AdaptionNeo4JPackage.NEO_EDGE__NEOPATH:
				setNeopath((Neo4PathParam)null);
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
			case AdaptionNeo4JPackage.NEO_EDGE__NEOPATH:
				return neopath != null;
		}
		return super.eIsSet(featureID);
	}

} //NeoEdgeImpl
