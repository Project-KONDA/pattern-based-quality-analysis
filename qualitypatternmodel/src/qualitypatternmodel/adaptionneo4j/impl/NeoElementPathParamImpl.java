/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoElementEdge;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsNeo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo4 JPath Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoElementPathParamImpl#getNeoElementEdge <em>Neo Element Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoElementPathParamImpl extends NeoPathParamImpl implements NeoElementPathParam {
	private static final String WRONG_TYPE_OF_EDGE = "Wrong type of Edge";
	private static final String NEO_PARTS_CAN_NOT_BE_EMPTY = "NeoParts can not be empty";
	private static final String NEO_PATH_PARAM = "NeoPathParam [%s]";

	/**
	 * The cached value of the '{@link #getNeoElementEdge() <em>Neo Element Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoElementEdge()
	 * @generated
	 * @ordered
	 */
	protected NeoElementEdge neoElementEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoElementPathParamImpl() {
		super();
	}

	// --> Specific behaviour which can not be necessarily generalised
	/**
	 * @author Lukas Sebastian Hofmann
	 * @exception InvalidityException
	 * @return String
	 * Generates the NeoElementPath.
	 * If no NeoPathPart is specified for the NeoElementPathParam the Cypher equivalent "--" for a not specified edge shall be added.
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		if (neoPathPart != null) {
			final StringBuilder cypher = new StringBuilder();
			final EList<NeoPathPart> neoPathParts = getNeoPathPart().getNeoPathPartEdgeLeafs();

			if (neoPathParts == null || neoPathParts.size() == 0) {
				throw new InvalidityException(NEO_PARTS_CAN_NOT_BE_EMPTY);
			}

			if (neoPathParts.size() > 1) {
					generateMultiEdgeCypher(cypher);
			} else {
				generateSingleEdgeCypher(cypher, neoPathParts);
			}
			return cypher.toString();
		}
		return ConstantsNeo.SPECIAL_CYPHER_MULTIPLE_EDGES_NODES;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param neoPathParts
	 * @throws InvalidityException
	 * Generates from the composites structure the Neo4J-Edge structure between two Neo4J-Nodes.
	 * Just for one element in the Composite-structure.
	 * If the element has a NeoTargetNode the unspecified edge between to Neo4J-Nodes will be set "--".
	 */
	private void generateSingleEdgeCypher(final StringBuilder cypher, final EList<NeoPathPart> neoPathParts)
			throws InvalidityException {
		if (!(neoPathParts.get(0) instanceof NeoSimpleEdgeImpl)) {
			throw new InvalidityException(WRONG_TYPE_OF_EDGE);
		}
		cypher.append(neoPathParts.get(0).generateCypher());
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParts.get(0);
		if (existsTargetNode(neoSimpleEdge)) {
			cypher.append(ConstantsNeo.SPECIAL_CYPHER_MULTIPLE_EDGES_NODES);
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @throws InvalidityException
	 * Generates from the composites structure the Neo4J-Edge structure between two Neo4J-Nodes.
	 * Just for multiple element in the Composite-structure.
	 * If the last element has a NeoTargetNode the unspecified edge between to Neo4J-Nodes will be set "--".
	 */
	private void generateMultiEdgeCypher(final StringBuilder cypher) throws InvalidityException {
		final NeoPathPart neoPathPart = getNeoPathPart();
		cypher.append(neoPathPart.generateCypher());

		NeoPathPart lastEdge = null;
		lastEdge = neoPathPart.getNeoLastEdge();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) lastEdge;
		if (existsTargetNode(neoSimpleEdge)) {
			cypher.append(ConstantsNeo.SPECIAL_CYPHER_MULTIPLE_EDGES_NODES);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Creates a NeoSimpleEdge for the NeoPathPart.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		NeoSimpleEdgeImpl nse = new NeoSimpleEdgeImpl();
		setNeoPathPart(nse);
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return boolean.class
	 * Checks if the abstraction level of an NeoPathPart is correct.
	 */
	@Override
	public boolean inputIsValid() {
		try {
			getNeoPathPart().isValid(AbstractionLevel.CONCRETE);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public String getValueAsString() {
		if (getNeoPathPart() == null) {
			return null;
		}
		return getNeoPathPart().getValueAsString();
//		JSONObject jobj = new JSONObject();
//		try {
//			if (getNeoPathPart() != null)
//				jobj.put(Constants.JSON_NEO_PATH_PART, getNeoPathPart().getValueAsString());
//		} catch (JSONException e) {}
//		return jobj.toString();
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		try {
			NeoPathPart part = NeoPathPartImpl.createNewNeoPathPart(value);
			setNeoPathPart(part);
			return;
		} catch (InvalidityException e) {}

		try {
			JSONObject jobj = new JSONObject(value);
			String val = jobj.get(ConstantsNeo.JSON_NEO_PATH_PART).toString();
			NeoPathPart part = NeoPathPartImpl.createNewNeoPathPart(val);
			setNeoPathPart(part);
			return;
		} catch (JSONException e) {
			throw new InvalidityException(Constants.INVALID_VALUE + ": '" + value + "'", e);
		}
	}

	@Override
	public void clear() {
		setNeoPathPart(null);
	}

	@Override
	public boolean isUsed() {
		return getNeoElementEdge() != null;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * Creates the needed report description for the NeoElementPathParam.
	 * Equal to the RdfParam describtion.
	 */
	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * Returns the myString for the Composite-Structure hold by the NeoElementPathParam.
	 */
	@Override
	public String myToString() {
		String result = String.format(NEO_PATH_PARAM, getInternalId());
		try {
			result += ConstantsNeo.ONE_WHITESPACE + generateCypher();
		} catch (InvalidityException e) {}
		return result;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return int.class
	 * Returns the relation Id.
	 */
	@Override
	protected int getRelationNumber() {
		if (getNeoElementEdge() == null) {
			return -1;
		}
		return getNeoElementEdge().getInternalId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_ELEMENT_PATH_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoElementEdge getNeoElementEdge() {
		if (neoElementEdge != null && neoElementEdge.eIsProxy()) {
			InternalEObject oldNeoElementEdge = (InternalEObject)neoElementEdge;
			neoElementEdge = (NeoElementEdge)eResolveProxy(oldNeoElementEdge);
			if (neoElementEdge != oldNeoElementEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE, oldNeoElementEdge, neoElementEdge));
			}
		}
		return neoElementEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoElementEdge basicGetNeoElementEdge() {
		return neoElementEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetNeoElementEdge(NeoElementEdge newNeoElementEdge, NotificationChain msgs) {
		triggerParameterUpdates(newNeoElementEdge);
		NeoElementEdge oldNeoElementEdge = neoElementEdge;
		neoElementEdge = newNeoElementEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE, oldNeoElementEdge, newNeoElementEdge);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoElementEdge(NeoElementEdge newNeoElementEdge) {
		if (newNeoElementEdge != neoElementEdge) {
			NotificationChain msgs = null;
			if (neoElementEdge != null)
				msgs = ((InternalEObject)neoElementEdge).eInverseRemove(this, Adaptionneo4jPackage.NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM, NeoElementEdge.class, msgs);
			if (newNeoElementEdge != null)
				msgs = ((InternalEObject)newNeoElementEdge).eInverseAdd(this, Adaptionneo4jPackage.NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM, NeoElementEdge.class, msgs);
			msgs = basicSetNeoElementEdge(newNeoElementEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE, newNeoElementEdge, newNeoElementEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE:
				if (neoElementEdge != null)
					msgs = ((InternalEObject)neoElementEdge).eInverseRemove(this, Adaptionneo4jPackage.NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM, NeoElementEdge.class, msgs);
				return basicSetNeoElementEdge((NeoElementEdge)otherEnd, msgs);
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
			case Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE:
				return basicSetNeoElementEdge(null, msgs);
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
			case Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE:
				if (resolve) return getNeoElementEdge();
				return basicGetNeoElementEdge();
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
			case Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE:
				setNeoElementEdge((NeoElementEdge)newValue);
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
			case Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE:
				setNeoElementEdge((NeoElementEdge)null);
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
			case Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE:
				return neoElementEdge != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * Returns CypherSpecificConstants.VARIABLE_ELEMENT_EGDE.
	 */
	@Override
	protected String getEdgeNaming() {
		return ConstantsNeo.VARIABLE_ELEMENT_EGDE;
	}
} //Neo4JPathParamImpl
