/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.impl.RelationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Attribute Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyEdgeImpl#getNeoPropertyPathParam <em>Neo Property Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPropertyEdgeImpl extends RelationImpl implements NeoPropertyEdge {
	/**
	 * The cached value of the '{@link #getNeoPropertyPathParam() <em>Neo Property Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPropertyPathParam()
	 * @generated
	 * @ordered
	 */
	protected NeoPropertyPathParam neoPropertyPathParam;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoPropertyEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_PROPERTY_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPropertyPathParam getNeoPropertyPathParam() {
		if (neoPropertyPathParam != null && neoPropertyPathParam.eIsProxy()) {
			InternalEObject oldNeoPropertyPathParam = (InternalEObject)neoPropertyPathParam;
			neoPropertyPathParam = (NeoPropertyPathParam)eResolveProxy(oldNeoPropertyPathParam);
			if (neoPropertyPathParam != oldNeoPropertyPathParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, oldNeoPropertyPathParam, neoPropertyPathParam));
			}
		}
		return neoPropertyPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoPropertyPathParam basicGetNeoPropertyPathParam() {
		return neoPropertyPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoPropertyPathParam(NeoPropertyPathParam newNeoPropertyPathParam, NotificationChain msgs) {
		NeoPropertyPathParam oldNeoPropertyPathParam = neoPropertyPathParam;
		neoPropertyPathParam = newNeoPropertyPathParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, oldNeoPropertyPathParam, newNeoPropertyPathParam);
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
	public void setNeoPropertyPathParam(NeoPropertyPathParam newNeoPropertyPathParam) {
		if (newNeoPropertyPathParam != neoPropertyPathParam) {
			NotificationChain msgs = null;
			if (neoPropertyPathParam != null)
				msgs = ((InternalEObject)neoPropertyPathParam).eInverseRemove(this, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, NeoPropertyPathParam.class, msgs);
			if (newNeoPropertyPathParam != null)
				msgs = ((InternalEObject)newNeoPropertyPathParam).eInverseAdd(this, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, NeoPropertyPathParam.class, msgs);
			msgs = basicSetNeoPropertyPathParam(newNeoPropertyPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, newNeoPropertyPathParam, newNeoPropertyPathParam));
	}

	@Override
	public String generateCypher() throws InvalidityException {
		String cypher = "";
		cypher += getNeoPropertyPathParam().generateCypher();
		return cypher;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				if (neoPropertyPathParam != null)
					msgs = ((InternalEObject)neoPropertyPathParam).eInverseRemove(this, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, NeoPropertyPathParam.class, msgs);
				return basicSetNeoPropertyPathParam((NeoPropertyPathParam)otherEnd, msgs);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				return basicSetNeoPropertyPathParam(null, msgs);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				if (resolve) return getNeoPropertyPathParam();
				return basicGetNeoPropertyPathParam();
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				setNeoPropertyPathParam((NeoPropertyPathParam)newValue);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				setNeoPropertyPathParam((NeoPropertyPathParam)null);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				return neoPropertyPathParam != null;
		}
		return super.eIsSet(featureID);
	}

} //NeoAttributeEdgeImpl
