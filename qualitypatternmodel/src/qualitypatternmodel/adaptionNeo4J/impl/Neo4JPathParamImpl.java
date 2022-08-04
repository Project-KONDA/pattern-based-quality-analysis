/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.Neo4JPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPath;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.parameters.impl.ParameterImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo4 JPath Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.Neo4JPathParamImpl#getNeoedge <em>Neoedge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.Neo4JPathParamImpl#getNeopath <em>Neopath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Neo4JPathParamImpl extends ParameterImpl implements Neo4JPathParam {
	/**
	 * The cached value of the '{@link #getNeoedge() <em>Neoedge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoedge()
	 * @generated
	 * @ordered
	 */
	protected NeoEdge neoedge;

	/**
	 * The cached value of the '{@link #getNeopath() <em>Neopath</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeopath()
	 * @generated
	 * @ordered
	 */
	protected NeoPath neopath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Neo4JPathParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO4_JPATH_PARAM;
	}

	@Override
	public String generateCypher() throws InvalidityException {
		String cypher = ""; //Add here the code
		
		return cypher;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoEdge getNeoedge() {
		if (neoedge != null && neoedge.eIsProxy()) {
			InternalEObject oldNeoedge = (InternalEObject)neoedge;
			neoedge = (NeoEdge)eResolveProxy(oldNeoedge);
			if (neoedge != oldNeoedge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOEDGE, oldNeoedge, neoedge));
			}
		}
		return neoedge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoEdge basicGetNeoedge() {
		return neoedge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoedge(NeoEdge newNeoedge, NotificationChain msgs) {
		NeoEdge oldNeoedge = neoedge;
		neoedge = newNeoedge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOEDGE, oldNeoedge, newNeoedge);
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
	public void setNeoedge(NeoEdge newNeoedge) {
		if (newNeoedge != neoedge) {
			NotificationChain msgs = null;
			if (neoedge != null)
				msgs = ((InternalEObject)neoedge).eInverseRemove(this, AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM, NeoEdge.class, msgs);
			if (newNeoedge != null)
				msgs = ((InternalEObject)newNeoedge).eInverseAdd(this, AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM, NeoEdge.class, msgs);
			msgs = basicSetNeoedge(newNeoedge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOEDGE, newNeoedge, newNeoedge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPath getNeopath() {
		if (neopath != null && neopath.eIsProxy()) {
			InternalEObject oldNeopath = (InternalEObject)neopath;
			neopath = (NeoPath)eResolveProxy(oldNeopath);
			if (neopath != oldNeopath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOPATH, oldNeopath, neopath));
			}
		}
		return neopath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoPath basicGetNeopath() {
		return neopath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeopath(NeoPath newNeopath) {
		NeoPath oldNeopath = neopath;
		neopath = newNeopath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOPATH, oldNeopath, neopath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void createParameters() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeParametersFromParameterList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOEDGE:
				if (neoedge != null)
					msgs = ((InternalEObject)neoedge).eInverseRemove(this, AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM, NeoEdge.class, msgs);
				return basicSetNeoedge((NeoEdge)otherEnd, msgs);
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
			case AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOEDGE:
				return basicSetNeoedge(null, msgs);
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
			case AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOEDGE:
				if (resolve) return getNeoedge();
				return basicGetNeoedge();
			case AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOPATH:
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
			case AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOEDGE:
				setNeoedge((NeoEdge)newValue);
				return;
			case AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOPATH:
				setNeopath((NeoPath)newValue);
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
			case AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOEDGE:
				setNeoedge((NeoEdge)null);
				return;
			case AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOPATH:
				setNeopath((NeoPath)null);
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
			case AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOEDGE:
				return neoedge != null;
			case AdaptionNeo4JPackage.NEO4_JPATH_PARAM__NEOPATH:
				return neopath != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return AdaptionNeo4JPackage.NEO4_JPATH_PARAM___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return AdaptionNeo4JPackage.NEO4_JPATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionNeo4JPackage.NEO4_JPATH_PARAM___CREATE_PARAMETERS:
				createParameters();
				return null;
			case AdaptionNeo4JPackage.NEO4_JPATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public boolean inputIsValid() {
		//TODO
		try {
			return true; 
		} catch (Exception e) {
			return false;
		}
	}

	@Override 
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}
		
	
	@Override
	public String myToString() {
		String result = "";
		
		return result;
	}
} //Neo4JPathParamImpl
