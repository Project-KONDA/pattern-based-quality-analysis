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
import qualitypatternmodel.adaptionNeo4J.NeoAttributeEdge;
import qualitypatternmodel.adaptionNeo4J.NeoAttributePathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;

import qualitypatternmodel.parameters.impl.ParameterImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Attribute Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoAttributePathParamImpl#getNeoPath <em>Neo Path</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoAttributePathParamImpl#getNeoAttributeEdge <em>Neo Attribute Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoAttributePathParamImpl#getNeoPropertyName <em>Neo Property Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoAttributePathParamImpl extends ParameterImpl implements NeoAttributePathParam {
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
	 * The cached value of the '{@link #getNeoAttributeEdge() <em>Neo Attribute Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoAttributeEdge()
	 * @generated
	 * @ordered
	 */
	protected NeoAttributeEdge neoAttributeEdge;

	/**
	 * The default value of the '{@link #getNeoPropertyName() <em>Neo Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEO_PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeoPropertyName() <em>Neo Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String neoPropertyName = NEO_PROPERTY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoAttributePathParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_ATTRIBUTE_PATH_PARAM;
	}
	
	@Override 
	public String generateCypher() throws InvalidityException {
		String cypher = "";
		//If there is no NeoPath the NeoProperty is inside of the NeoNode
		//Else diffrent constellations are possible how to build the relation between the origin node and the node for the property
		if (getNeoPath() != null) {
			NeoPathPartImpl np = (NeoPathPartImpl) getNeoPath();
			cypher += np.generateCypher();
		}
		return cypher;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_PATH, oldNeoPath, neoPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_PATH, oldNeoPath, neoPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoAttributeEdge getNeoAttributeEdge() {
		if (neoAttributeEdge != null && neoAttributeEdge.eIsProxy()) {
			InternalEObject oldNeoAttributeEdge = (InternalEObject)neoAttributeEdge;
			neoAttributeEdge = (NeoAttributeEdge)eResolveProxy(oldNeoAttributeEdge);
			if (neoAttributeEdge != oldNeoAttributeEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE, oldNeoAttributeEdge, neoAttributeEdge));
			}
		}
		return neoAttributeEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoAttributeEdge basicGetNeoAttributeEdge() {
		return neoAttributeEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoAttributeEdge(NeoAttributeEdge newNeoAttributeEdge, NotificationChain msgs) {
		NeoAttributeEdge oldNeoAttributeEdge = neoAttributeEdge;
		neoAttributeEdge = newNeoAttributeEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE, oldNeoAttributeEdge, newNeoAttributeEdge);
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
	public void setNeoAttributeEdge(NeoAttributeEdge newNeoAttributeEdge) {
		if (newNeoAttributeEdge != neoAttributeEdge) {
			NotificationChain msgs = null;
			if (neoAttributeEdge != null)
				msgs = ((InternalEObject)neoAttributeEdge).eInverseRemove(this, AdaptionNeo4JPackage.NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM, NeoAttributeEdge.class, msgs);
			if (newNeoAttributeEdge != null)
				msgs = ((InternalEObject)newNeoAttributeEdge).eInverseAdd(this, AdaptionNeo4JPackage.NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM, NeoAttributeEdge.class, msgs);
			msgs = basicSetNeoAttributeEdge(newNeoAttributeEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE, newNeoAttributeEdge, newNeoAttributeEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNeoPropertyName() {
		return neoPropertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoPropertyName(String newNeoPropertyName) {
		String oldNeoPropertyName = neoPropertyName;
		neoPropertyName = newNeoPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_PROPERTY_NAME, oldNeoPropertyName, neoPropertyName));
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE:
				if (neoAttributeEdge != null)
					msgs = ((InternalEObject)neoAttributeEdge).eInverseRemove(this, AdaptionNeo4JPackage.NEO_ATTRIBUTE_EDGE__NEO_ATTRIBUTE_PATH_PARAM, NeoAttributeEdge.class, msgs);
				return basicSetNeoAttributeEdge((NeoAttributeEdge)otherEnd, msgs);
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE:
				return basicSetNeoAttributeEdge(null, msgs);
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_PATH:
				if (resolve) return getNeoPath();
				return basicGetNeoPath();
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE:
				if (resolve) return getNeoAttributeEdge();
				return basicGetNeoAttributeEdge();
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_PROPERTY_NAME:
				return getNeoPropertyName();
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_PATH:
				setNeoPath((NeoPathPart)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE:
				setNeoAttributeEdge((NeoAttributeEdge)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_PROPERTY_NAME:
				setNeoPropertyName((String)newValue);
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_PATH:
				setNeoPath((NeoPathPart)null);
				return;
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE:
				setNeoAttributeEdge((NeoAttributeEdge)null);
				return;
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_PROPERTY_NAME:
				setNeoPropertyName(NEO_PROPERTY_NAME_EDEFAULT);
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_PATH:
				return neoPath != null;
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_ATTRIBUTE_EDGE:
				return neoAttributeEdge != null;
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM__NEO_PROPERTY_NAME:
				return NEO_PROPERTY_NAME_EDEFAULT == null ? neoPropertyName != null : !NEO_PROPERTY_NAME_EDEFAULT.equals(neoPropertyName);
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
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
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
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM___CREATE_PARAMETERS:
				createParameters();
				return null;
			case AdaptionNeo4JPackage.NEO_ATTRIBUTE_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
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
		result.append(" (neoPropertyName: ");
		result.append(neoPropertyName);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean inputIsValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

} //NeoAttributePathParamImpl
