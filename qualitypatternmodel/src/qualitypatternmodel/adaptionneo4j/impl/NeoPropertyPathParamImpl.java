/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNameParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.ConstantsError;
import qualitypatternmodel.utility.ConstantsNeo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Attribute Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoPropertyPathParamImpl#getNeoPropertyEdge <em>Neo Property Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoPropertyPathParamImpl#getNeoPropertyName <em>Neo Property Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPropertyPathParamImpl extends NeoPathParamImpl implements NeoPropertyPathParam {
	private static final String NEO_PROPERTY_EDGE_TARGET_NODES_CAN_NOT_BE_NULL = "TargetNodes can not be null";
	private static final String NEO_PROPERTY_EDGE_LAST_EDGE_HAS_TO_BE_SET = "Last Edge has to be set";
	private static final String NEO_PROPERTY_PATH_PARAM = "NeoPropertyPathParam [%s]";

	/**
	 * The cached value of the '{@link #getNeoPropertyEdge() <em>Neo Property Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPropertyEdge()
	 * @generated
	 * @ordered
	 */
	protected NeoPropertyEdge neoPropertyEdge;

	/**
	 * The cached value of the '{@link #getNeoPropertyName() <em>Neo Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPropertyName()
	 * @generated
	 * @ordered
	 */
	protected NeoPropertyNameParam neoPropertyName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoPropertyPathParamImpl() {
		super();
	}

	@Override
	public String getValueAsString() {
		JSONObject jobj = new JSONObject();
		try {
			if (getNeoPathPart() != null) {
				jobj.put(ConstantsNeo.JSON_NEO_PATH_PART, getNeoPathPart().getValueAsString());
			}
			if (getNeoPropertyName() != null) {
				jobj.put(ConstantsNeo.JSON_NEO_PROPERTY_NAME, getNeoPropertyName().getValueAsString());
			}
		} catch (JSONException e) {}
		if (jobj.length() < 1) {
			return null;
		}
		return jobj.toString();
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		if (value == null) {
			clear();
			return;
		}
		try {
			JSONObject jobj = new JSONObject(value);
			String partstring = jobj.get(ConstantsNeo.JSON_NEO_PATH_PART).toString();
			NeoPathPart part = NeoPathPartImpl.createNewNeoPathPart(partstring);

			String propertystring = jobj.get(ConstantsNeo.JSON_NEO_PROPERTY_NAME).toString();
			NeoPropertyNameParam property = new NeoPropertyNameParamImpl();
			property.setValueFromString(propertystring);

			setNeoPathPart(part);
			setNeoPropertyName(property);
			return;
		} catch (JSONException e) {
			checkLabel(value);
        	newVals.add(value);
//			throw new InvalidityException(ConstantsError.INVALID_VALUE + " '" + value + "'", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_PROPERTY_PATH_PARAM;
	}

	@Override
	public void clear() {
		setNeoPropertyName((NeoPropertyNameParam) null);
		setNeoPathPart(null);
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @exception InvalidityException
	 * Checks if a NeoPathPart is set. There is no need for setting it.
	 * If set then:
	 * 	Checks the NeoPathParts for correctness.
	 * 	If correct then the NeoPathPart will be build.
	 * 	Else an Exception is thrown.
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		String cypher = new String();
		if (getNeoPathPart() != null) {
			validateNeoPropertyEdge();
			cypher = getNeoPathPart().generateCypher();
		}
		return cypher;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * Check if the check for ComplexEdge.
	 * At least a NeoSimpleEdge is set.
	 */
	private void validateNeoPropertyEdge() throws InvalidityException {
		final NeoPathPart neoPathPart = getNeoPathPart();
		if (neoPathPart instanceof NeoComplexEdge) {
			final NeoPathPart neoLastEdge = neoPathPart.getNeoLastEdge();
			if (neoLastEdge == null) {
				throw new InvalidityException(NEO_PROPERTY_EDGE_LAST_EDGE_HAS_TO_BE_SET);
			}
		}
		if (!innerEdgesHaveTargets(getNeoPathPart().getNeoPathPartEdgeLeafs())) {
			targetNodesCanNotBeNull();
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param EList<NeoPathPart>
	 * @return boolean.class
	 * Checks if all innerEdges have a TargetNode specified.
	 */
	private boolean innerEdgesHaveTargets(final EList<NeoPathPart> parts)  {
		boolean innerEdgesHaveTargets = true;
		NeoSimpleEdge neoSimpleEdge = null;
		for (NeoPathPart part : parts) {
			if (part instanceof NeoComplexEdge) {
				this.innerEdgesHaveTargets(part.getNeoPathPartEdgeLeafs());
			} else {
				if(part instanceof NeoSimpleEdge) {
					neoSimpleEdge = (NeoSimpleEdge) part;
					if (!existsTargetNode(neoSimpleEdge)) {
						innerEdgesHaveTargets = false;
					}
				}
			}
		}
		return innerEdgesHaveTargets;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * Throws a InvalidityException(NEO_PROPERTY_EDGE_TARGET_NODES_CAN_NOT_BE_NULL)
	 */
	private void targetNodesCanNotBeNull() throws InvalidityException {
		throw new InvalidityException(NEO_PROPERTY_EDGE_TARGET_NODES_CAN_NOT_BE_NULL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Sets a NeoSimpleEdge
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		setNeoPathPart(new NeoSimpleEdgeImpl());
		setNeoPropertyName(new NeoPropertyNameParamImpl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPropertyEdge getNeoPropertyEdge() {
		if (neoPropertyEdge != null && neoPropertyEdge.eIsProxy()) {
			InternalEObject oldNeoPropertyEdge = (InternalEObject)neoPropertyEdge;
			neoPropertyEdge = (NeoPropertyEdge)eResolveProxy(oldNeoPropertyEdge);
			if (neoPropertyEdge != oldNeoPropertyEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, oldNeoPropertyEdge, neoPropertyEdge));
			}
		}
		return neoPropertyEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoPropertyEdge basicGetNeoPropertyEdge() {
		return neoPropertyEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoPropertyEdge(NeoPropertyEdge newNeoPropertyEdge, NotificationChain msgs) {
		NeoPropertyEdge oldNeoPropertyEdge = neoPropertyEdge;
		neoPropertyEdge = newNeoPropertyEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, oldNeoPropertyEdge, newNeoPropertyEdge);
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
	public void setNeoPropertyEdge(NeoPropertyEdge newNeoPropertyEdge) {
		if (newNeoPropertyEdge != neoPropertyEdge) {
			NotificationChain msgs = null;
			if (neoPropertyEdge != null)
				msgs = ((InternalEObject)neoPropertyEdge).eInverseRemove(this, Adaptionneo4jPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, NeoPropertyEdge.class, msgs);
			if (newNeoPropertyEdge != null)
				msgs = ((InternalEObject)newNeoPropertyEdge).eInverseAdd(this, Adaptionneo4jPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, NeoPropertyEdge.class, msgs);
			msgs = basicSetNeoPropertyEdge(newNeoPropertyEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, newNeoPropertyEdge, newNeoPropertyEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NeoPropertyNameParam getNeoPropertyName() {
		if (neoPropertyName != null && neoPropertyName.eIsProxy()) {
			InternalEObject oldNeoPropertyName = (InternalEObject)neoPropertyName;
			neoPropertyName = (NeoPropertyNameParam)eResolveProxy(oldNeoPropertyName);
			if (neoPropertyName != oldNeoPropertyName) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME, oldNeoPropertyName, neoPropertyName));
				}
			}
		}
		return neoPropertyName != null ? neoPropertyName : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoPropertyName(NeoPropertyNameParam newNeoPropertyName, NotificationChain msgs) {
		NeoPropertyNameParam oldNeoPropertyName = neoPropertyName;
		neoPropertyName = newNeoPropertyName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME, oldNeoPropertyName, newNeoPropertyName);
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
	public void setNeoPropertyName(NeoPropertyNameParam newNeoPropertyName) {
		if (newNeoPropertyName != neoPropertyName) {
			NotificationChain msgs = null;
			if (neoPropertyName != null)
				msgs = ((InternalEObject)neoPropertyName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME, null, msgs);
			if (newNeoPropertyName != null)
				msgs = ((InternalEObject)newNeoPropertyName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME, null, msgs);
			msgs = basicSetNeoPropertyName(newNeoPropertyName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME, newNeoPropertyName, newNeoPropertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException
	 * @generated NOT
	 */
	@Override
	public void setNeoPropertyName(String neoPropertyName) throws InvalidityException {
		if (neoPropertyName != null) {
			NeoPropertyNameParam literalNeoPropertyName = new NeoPropertyNameParamImpl();
			literalNeoPropertyName.setValueIfValid(neoPropertyName);
			this.neoPropertyName = literalNeoPropertyName;
		} else if (neoPropertyName == null) {
			this.neoPropertyName = null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				if (neoPropertyEdge != null)
					msgs = ((InternalEObject)neoPropertyEdge).eInverseRemove(this, Adaptionneo4jPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, NeoPropertyEdge.class, msgs);
				return basicSetNeoPropertyEdge((NeoPropertyEdge)otherEnd, msgs);
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
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				return basicSetNeoPropertyEdge(null, msgs);
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
				return basicSetNeoPropertyName(null, msgs);
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
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				if (resolve) return getNeoPropertyEdge();
				return basicGetNeoPropertyEdge();
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
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
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				setNeoPropertyEdge((NeoPropertyEdge)newValue);
				return;
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
				setNeoPropertyName((NeoPropertyNameParam)newValue);
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
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				setNeoPropertyEdge((NeoPropertyEdge)null);
				return;
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
				setNeoPropertyName((NeoPropertyNameParam)null);
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
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				return neoPropertyEdge != null;
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
				return neoPropertyName != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM___SET_NEO_PROPERTY_NAME__STRING:
				try {
					setNeoPropertyName((String)arguments.get(0));
				} catch (InvalidityException e) {
					throw new RuntimeException(e.getMessage());
				}
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return boolean.class
	 * Checks the AbstractionLevel for this instance.
	 */
	@Override
	public boolean inputIsValid() {
		try{
			getNeoPathPart().isValid(AbstractionLevel.CONCRETE);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	@Override
	protected int getRelationNumber() {
		if (getNeoPropertyEdge() == null) {
			return -1;
		}
		return getNeoPropertyEdge().getInternalId();
	}

	@Override
	protected String getEdgeNaming() {
		return ConstantsNeo.VARIABLE_PROPERTY_EGDE;
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUsed() {
		return getNeoPropertyEdge() != null;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * Creates the myString for the NeoPropertyPathParam.
	 */
	@Override
	public String myToString() {
		String result = String.format(NEO_PROPERTY_PATH_PARAM, getInternalId());
		try {
			String temp = generateCypher();
			if (!temp.isEmpty()) {
				result += ConstantsNeo.ONE_WHITESPACE + generateCypher();
			} else if (neoPropertyName != null) {
				result += ConstantsNeo.ONE_WHITESPACE + getNeoPropertyEdge().generateCypherPropertyAddressing();
			}
		} catch (InvalidityException e) {}
		return result;
	}
} //NeoAttributePathParamImpl