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
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo4 JPath Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl#getNeoEdge <em>Neo Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl#getNeoPath <em>Neo Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPathParamImpl extends ParameterImpl implements NeoPathParam {
	/**
	 * The cached value of the '{@link #getNeoEdge() <em>Neo Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoEdge()
	 * @generated
	 * @ordered
	 */
	protected NeoEdge neoEdge;

	/**
	 * The cached value of the '{@link #getNeoPath() <em>Neo Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPath()
	 * @generated
	 * @ordered
	 */
	protected NeoPathPart neoPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoPathParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_PATH_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoEdge getNeoEdge() {
		if (neoEdge != null && neoEdge.eIsProxy()) {
			InternalEObject oldNeoEdge = (InternalEObject)neoEdge;
			neoEdge = (NeoEdge)eResolveProxy(oldNeoEdge);
			if (neoEdge != oldNeoEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE, oldNeoEdge, neoEdge));
			}
		}
		return neoEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoEdge basicGetNeoEdge() {
		return neoEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public NotificationChain basicSetNeoEdge(NeoEdge newNeoEdge, NotificationChain msgs) {
		triggerParameterUpdates(newNeoEdge);
		NeoEdge oldNeoEdge = neoEdge;
		neoEdge = newNeoEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE, oldNeoEdge, newNeoEdge);
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
	public void setNeoEdge(NeoEdge newNeoEdge) {
		if (newNeoEdge != neoEdge) {
			NotificationChain msgs = null;
			if (neoEdge != null)
				msgs = ((InternalEObject)neoEdge).eInverseRemove(this, AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM, NeoEdge.class, msgs);
			if (newNeoEdge != null)
				msgs = ((InternalEObject)newNeoEdge).eInverseAdd(this, AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM, NeoEdge.class, msgs);
			msgs = basicSetNeoEdge(newNeoEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE, newNeoEdge, newNeoEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPathPart getNeoPath() {
		if (neoPath != null && neoPath.eIsProxy()) {
			InternalEObject oldNeoPath = (InternalEObject)neoPath;
			neoPath = (NeoPathPart)eResolveProxy(oldNeoPath);
			if (neoPath != oldNeoPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH, oldNeoPath, neoPath));
			}
		}
		return neoPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoPathPart basicGetNeoPath() {
		return neoPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoPath(NeoPathPart newNeoPath) {
		NeoPathPart oldNeoPath = neoPath;
		neoPath = newNeoPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH, oldNeoPath, neoPath));
	}

	@Override
	public String generateCypher() throws InvalidityException {
		String cypher = getNeoPath().generateCypher();
		if (cypher == null) {
			cypher = super.generateCypher();
		}
		return cypher;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		NeoSimpleEdgeImpl nse = new NeoSimpleEdgeImpl();
		setNeoPath(nse);
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
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE:
				if (neoEdge != null)
					msgs = ((InternalEObject)neoEdge).eInverseRemove(this, AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM, NeoEdge.class, msgs);
				return basicSetNeoEdge((NeoEdge)otherEnd, msgs);
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
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE:
				return basicSetNeoEdge(null, msgs);
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
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE:
				if (resolve) return getNeoEdge();
				return basicGetNeoEdge();
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH:
				if (resolve) return getNeoPath();
				return basicGetNeoPath();
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
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE:
				setNeoEdge((NeoEdge)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH:
				setNeoPath((NeoPathPart)newValue);
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
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE:
				setNeoEdge((NeoEdge)null);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH:
				setNeoPath((NeoPathPart)null);
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
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE:
				return neoEdge != null;
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH:
				return neoPath != null;
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
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return AdaptionNeo4JPackage.NEO_PATH_PARAM___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return AdaptionNeo4JPackage.NEO_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
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
			case AdaptionNeo4JPackage.NEO_PATH_PARAM___CREATE_PARAMETERS:
				createParameters();
				return null;
			case AdaptionNeo4JPackage.NEO_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public boolean inputIsValid() {
		try {
			getNeoPath().isValid(AbstractionLevel.CONCRETE);
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
		String result = "neopath [" + getInternalId() + "] ";
		try {
			result += " " + generateCypher();
		} catch (InvalidityException e) {}
		return result;
	}
} //Neo4JPathParamImpl
