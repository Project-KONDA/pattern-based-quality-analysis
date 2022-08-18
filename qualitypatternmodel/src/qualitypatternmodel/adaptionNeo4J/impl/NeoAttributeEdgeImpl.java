/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoAttributeEdge;
import qualitypatternmodel.adaptionNeo4J.NeoAttributePathParam;
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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoAttributeEdgeImpl#getNeoAttributePathParam <em>Neo Attribute Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoAttributeEdgeImpl extends RelationImpl implements NeoAttributeEdge {
	/**
	 * The cached value of the '{@link #getNeoAttributePathParam() <em>Neo Attribute Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoAttributePathParam()
	 * @generated
	 * @ordered
	 */
	protected NeoAttributePathParam neoAttributePathParam;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoAttributeEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_ATTRIBUTE_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoAttributePathParam getNeoAttributePathParam() {
		if (neoAttributePathParam != null && neoAttributePathParam.eIsProxy()) {
			InternalEObject oldNeoAttributePathParam = (InternalEObject)neoAttributePathParam;
			neoAttributePathParam = (NeoAttributePathParam)eResolveProxy(oldNeoAttributePathParam);
			if (neoAttributePathParam != oldNeoAttributePathParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM, oldNeoAttributePathParam, neoAttributePathParam));
			}
		}
		return neoAttributePathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoAttributePathParam basicGetNeoAttributePathParam() {
		return neoAttributePathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoAttributePathParam(NeoAttributePathParam newNeoAttributePathParam, NotificationChain msgs) {
		NeoAttributePathParam oldNeoAttributePathParam = neoAttributePathParam;
		neoAttributePathParam = newNeoAttributePathParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM, oldNeoAttributePathParam, newNeoAttributePathParam);
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
	public void setNeoAttributePathParam(NeoAttributePathParam newNeoAttributePathParam) {
		if (newNeoAttributePathParam != neoAttributePathParam) {
			NotificationChain msgs = null;
			if (neoAttributePathParam != null)
				msgs = ((InternalEObject)neoAttributePathParam).eInverseRemove(this, AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE, NeoAttributePathParam.class, msgs);
			if (newNeoAttributePathParam != null)
				msgs = ((InternalEObject)newNeoAttributePathParam).eInverseAdd(this, AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE, NeoAttributePathParam.class, msgs);
			msgs = basicSetNeoAttributePathParam(newNeoAttributePathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM, newNeoAttributePathParam, newNeoAttributePathParam));
	}

	@Override
	public String generateCypher() throws InvalidityException {
		String cypher = "";
		cypher += getNeoAttributePathParam().generateCypher();
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM:
				if (neoAttributePathParam != null)
					msgs = ((InternalEObject)neoAttributePathParam).eInverseRemove(this, AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE, NeoAttributePathParam.class, msgs);
				return basicSetNeoAttributePathParam((NeoAttributePathParam)otherEnd, msgs);
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM:
				return basicSetNeoAttributePathParam(null, msgs);
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM:
				if (resolve) return getNeoAttributePathParam();
				return basicGetNeoAttributePathParam();
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM:
				setNeoAttributePathParam((NeoAttributePathParam)newValue);
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM:
				setNeoAttributePathParam((NeoAttributePathParam)null);
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM:
				return neoAttributePathParam != null;
		}
		return super.eIsSet(featureID);
	}

} //NeoAttributeEdgeImpl
