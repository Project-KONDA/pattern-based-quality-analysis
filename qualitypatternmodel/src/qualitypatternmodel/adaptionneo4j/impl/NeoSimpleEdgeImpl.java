/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoDirection;
import qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.adaptionneo4j.impl.NeoComplexEdgeImpl.InternalCounter;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.KeyValueParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsNeo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl#getNeoDirection <em>Neo Direction</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl#getNeoEdgeLabel <em>Neo Edge Label</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl#getEdgeNumber <em>Edge Number</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoSimpleEdgeImpl#getKeyValueParam <em>Key Value Param</em>}</li>
 * </ul>
 *
 * @generated
 */

public class NeoSimpleEdgeImpl extends NeoPathPartImpl implements NeoSimpleEdge {
	private static final String AN_EDGE_JUST_CAN_HAVE_ONE_LABEL_IF_A_NEW_ONE_SHALL_BE_USE_THE_SET_METHOD = "An Edge just can have one label. If a new one shall be use the set method";
	private static final String EDGE_TARGET_NODE_LABELS = "Edge-Target-Node-Labels";
	private static final String EDGE_LABELS = "Edge-Labels:";
	private static final String NEO_DIRECTION_CAN_NOT_BE_NULL = "NeoDirection can not be null";
	private static final String SOMETHING_WENT_WRONG_IN_THE_SIMPLE_NEO_EDGE_DIRECTION_HAS_NOT_BEEN_SET_CORRECTLY = "Something went wrong in the SimpleNeoEdge - direction has not been set correctly";
	private static final String NEO_SIMPLE_EDGE = "NeoSimpleEdge [%s] ";
	
	/**
	 * The default value of the '{@link #getNeoDirection() <em>Neo Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoDirection()
	 * @generated
	 * @ordered
	 */
	protected static final NeoDirection NEO_DIRECTION_EDEFAULT = NeoDirection.IMPLICIT;
	/**
	 * The cached value of the '{@link #getNeoDirection() <em>Neo Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoDirection()
	 * @generated
	 * @ordered
	 */
	protected NeoDirection neoDirection = NEO_DIRECTION_EDEFAULT;
	/**
	 * The cached value of the '{@link #getNeoTargetNodeLabels() <em>Neo Target Node Labels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoTargetNodeLabels()
	 * @generated
	 * @ordered
	 */
	protected NeoNodeLabelsParam neoTargetNodeLabels;

	/**
	 * The cached value of the '{@link #getNeoEdgeLabel() <em>Neo Edge Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoEdgeLabel()
	 * @generated
	 * @ordered
	 */
	protected NeoEdgeLabelParam neoEdgeLabel;
	/**
	 * The default value of the '{@link #getEdgeNumber() <em>Edge Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int EDGE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEdgeNumber() <em>Edge Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeNumber()
	 * @generated
	 * @ordered
	 */
	protected int edgeNumber = EDGE_NUMBER_EDEFAULT;

	/**
	 * This is true if the Edge Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean edgeNumberESet;
	/**
	 * The cached value of the '{@link #getKeyValueParam() <em>Key Value Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValueParam()
	 * @generated
	 * @ordered
	 */
	protected KeyValueParam keyValueParam;

	protected static final boolean IS_LAST_EDGE_EDEFAULT = true;

	protected boolean isLastEdge = IS_LAST_EDGE_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NeoSimpleEdgeImpl() {
		super();
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * @returns String
	 * This generateCypher generates the NeoSimpleEdge.
	 * If a NeoTargetNode is specified it will also be generated here. 
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		StringBuilder cypher = new StringBuilder();		
		generateInternalCypher(cypher, true);
		return cypher.toString();
	}
	
		
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param withLabels
	 * @throws InvalidityException
	 * Build the Edge depending one the direction. 
	 * OPT: WITH Labels has been introduced if in future versions multiprinting should become a thing --> Further relation dev --> However can not be called from the outside
	 */
	private void generateInternalCypher(StringBuilder cypher, Boolean withLabels) throws InvalidityException {
		switch (this.neoDirection) {
		case IMPLICIT:
			cypher.append(ConstantsNeo.EDGE_CONNECTOR_LINE);
			this.generateInternalCypherLabelGenerator(cypher, withLabels);
			cypher.append(ConstantsNeo.EDGE_CONNECTOR_LINE);
			break;
		case LEFT:
			cypher.append(ConstantsNeo.EDGE_CONNECTOR_LEFT);
			this.generateInternalCypherLabelGenerator(cypher, withLabels);
			cypher.append(ConstantsNeo.EDGE_CONNECTOR_LINE);
			break;
		case RIGHT:
			cypher.append(ConstantsNeo.EDGE_CONNECTOR_LINE);
			this.generateInternalCypherLabelGenerator(cypher, withLabels);
			cypher.append(ConstantsNeo.EDGE_CONNECTOR_RIGHT);
			break;
		default:
			throw new InvalidityException(SOMETHING_WENT_WRONG_IN_THE_SIMPLE_NEO_EDGE_DIRECTION_HAS_NOT_BEEN_SET_CORRECTLY);
		}
		
		generateTargetNode(cypher, withLabels);
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param withLabels
	 * @throws InvalidityException
	 * Generates the NeoTargetNode.
	 */
	private void generateTargetNode(StringBuilder cypher, Boolean withLabels) throws InvalidityException {
		//Always when a TextListParam exists create the NeoPropertyNode
		if (getNeoTargetNodeLabels() != null) {
			cypher.append(ConstantsNeo.SIGNLE_OPENING_ROUND_BRACKET);
			cypher.append(getCypherInnerEdgeNodes(false));
			if (withLabels) {
				final String tempLabels = getNeoTargetNodeLabels().generateCypher();
				cypher.append(tempLabels);
			}
			cypher.append(ConstantsNeo.SIGNLE_CLOSING_ROUND_BRACKET);
		}
	}
	

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypher
	 * @param withLabels
	 * @throws InvalidityException
	 * It build the labels for an NeoSimpleEdge.
	 * OPT: Considering the SOLID-Principle: If this methods need change then extend from NeoSimpleEdge and Override it,
	 * e.g., in future versions multi-labels in a Edge are Possible or the properties as labels should be considered
	 */
	private void generateInternalCypherLabelGenerator(StringBuilder cypher, Boolean withLabels) throws InvalidityException {
		cypher.append(ConstantsNeo.EDGE_OPENING_BRACKET);
		cypher.append(getCypherVariable());
				
		if (getNeoEdgeLabel() != null && withLabels) {
			cypher.append(getNeoEdgeLabel().generateCypher());
		}
		
		cypher.append(ConstantsNeo.EDGE_CLOSING_BRACKET);
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * Returns the NeoSimpleEdge in the format of a Variable which can be used in Neo4J/Cypher.
	 * If it is the first edge, besides the node edge no further edge numbering is needed.
	 */
	@Override
	public String getCypherVariable() throws InvalidityException {
		String cypher = null;
		cypher = super.getCypherVariable() + ((NeoPathParamImpl) (NeoPathParamImpl) getNeoPathParam()).getRelationNumber();
		if (edgeNumber != 0) {
			cypher += ConstantsNeo.LOCAL_ID_SEPERATOR + getEdgeNumber();
		}
		return cypher;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Lukas Sebastian Hofmann
	 * Returns the InnerEdge used. However, the NeoPropertyNode is a special inner edge. For that reason is the isReturn argument.
	 * If the Method is used in the context of building the the string for the match clause all possible return elements will be returned.
	 * In the case that it is used in the RETURN-CLAUSE the NeoPropertyNode will be build first and not listed with the other intEdgeNodes.
	 * It has a higher significance as the other intEdgeNodes.
	 */
	@Override
	public String getCypherInnerEdgeNodes(boolean isReturn) throws InvalidityException {
		final NeoPathParamImpl neoAbstractPathParam = (NeoPathParamImpl) getNeoPathParam();
		String cypher = null;

		if (getNeoTargetNodeLabels() == null) {
			cypher =  null;
		} else if (isLastEdge && !isReturn && neoAbstractPathParam instanceof NeoPropertyPathParam) {
			//The relation number is needed since multiple relations can go into a NeoPropertyNode
			cypher = ConstantsNeo.VARIABLE_PROPERTY_NODE + ((NeoPropertyPathParam) neoAbstractPathParam).getNeoPropertyEdge().getTarget().getInternalId() + ConstantsNeo.LOCAL_ID_SEPERATOR+ neoAbstractPathParam.getRelationNumber();
		}  else if (isLastEdge && neoAbstractPathParam instanceof NeoElementPathParam) {
			cypher = createInnerEdgeNumberingNames(neoAbstractPathParam);
		} else if (!isLastEdge){
			cypher = createInnerEdgeNumberingNames(neoAbstractPathParam);
		}
		return cypher;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param neoAbstractPathParam
	 * @return String
	 * Creates the internal Edge numbering.
	 * If the it is the first edge just the relation number will be added.
	 * Else the relation number and the count of the edges will be added.
	 */
	protected String createInnerEdgeNumberingNames(final NeoPathParamImpl neoAbstractPathParam) {
		String cypher = new String();
		if (edgeNumber != 0) {
			cypher = ConstantsNeo.INTERNAL_EDGE_NODE + neoAbstractPathParam.getRelationNumber() + ConstantsNeo.LOCAL_ID_SEPERATOR + getEdgeNumber();
		} else {
			cypher = ConstantsNeo.INTERNAL_EDGE_NODE + neoAbstractPathParam.getRelationNumber();
		}
		return cypher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void addNeoEdgeLabel(String label) throws InvalidityException {
		if (this.neoEdgeLabel == null) {
			this.neoEdgeLabel = new NeoEdgeLabelParamImpl();
		} else if (this.neoEdgeLabel.getValue() != null) {
			throw new InvalidityException(AN_EDGE_JUST_CAN_HAVE_ONE_LABEL_IF_A_NEW_ONE_SHALL_BE_USE_THE_SET_METHOD);
		}
		this.neoEdgeLabel.setValueIfValid(label);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				if (keyValueParam != null)
					msgs = ((InternalEObject)keyValueParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM, null, msgs);
				return basicSetKeyValueParam((KeyValueParam)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		try {
			JSONObject object = new JSONObject(value);
			
			@SuppressWarnings("unchecked")
			Iterator<String> keys = object.keys();
			List<String> allowedKeys = Arrays.asList(Constants.JSON_NEO_EDGE, Constants.JSON_NEO_TARGETS, Constants.JSON_NEO_KEYVALUE);
			while (keys.hasNext()) {
				String next = keys.next();
				if (!allowedKeys.contains(next))
					throw new InvalidityException(next + " is not an allowed key");
			}
			
			if (object.has(Constants.JSON_NEO_EDGE)) {
				NeoEdgeLabelParam edgelabel = new NeoEdgeLabelParamImpl();
				edgelabel.setValueFromString(object.get(Constants.JSON_NEO_EDGE).toString());
				setNeoEdgeLabel(edgelabel);
			}
			if (object.has(Constants.JSON_NEO_TARGETS)) {
				NeoNodeLabelsParam targets = new NeoNodeLabelsParamImpl();
				targets.setValueFromString(object.get(Constants.JSON_NEO_TARGETS).toString());
				setNeoTargetNodeLabels(targets);
			}
			if (object.has(Constants.JSON_NEO_KEYVALUE)) {
				throw new InvalidityException("KeyValueParams are not supported");
//				KeyValueParam keyvalue = new KeyValueParamImpl();
//				keyvalue.setValueFromString(object.get(Constants.JSON_NEO_KEYVALUE).toString());
//				setKeyValueParam(keyvalue);
			}
		} catch (JSONException e) {
			throw new InvalidityException("Invalid Value ", e);
		}
	}

	@Override
	public String getValueAsString() {
		JSONObject object = new JSONObject();
		try {
			if (getNeoEdgeLabel() != null && getNeoEdgeLabel().getValueAsString() != null)
				object.put(Constants.JSON_NEO_EDGE, getNeoEdgeLabel().getValueAsString().toString());
			if (getNeoTargetNodeLabels() != null && getNeoTargetNodeLabels().getValueAsString() != null)
				object.put(Constants.JSON_NEO_TARGETS, getNeoTargetNodeLabels().getValueAsString().toString());
			if (getKeyValueParam() != null && getKeyValueParam().getValueAsString() != null)
				object.put(Constants.JSON_NEO_KEYVALUE, getKeyValueParam().getValueAsString().toString());
		} catch (JSONException e) {}
		return object.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				return basicSetNeoTargetNodeLabels(null, msgs);
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				return basicSetNeoEdgeLabel(null, msgs);
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				return basicSetKeyValueParam(null, msgs);
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
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_DIRECTION:
				return getNeoDirection();
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				return getNeoTargetNodeLabels();
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				return getNeoEdgeLabel();
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				return getEdgeNumber();
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				return getKeyValueParam();
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
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				setNeoTargetNodeLabels((NeoNodeLabelsParam)newValue);
				return;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				setNeoEdgeLabel((NeoEdgeLabelParam)newValue);
				return;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				setEdgeNumber((Integer)newValue);
				return;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				setKeyValueParam((KeyValueParam)newValue);
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
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				setNeoTargetNodeLabels((NeoNodeLabelsParam)null);
				return;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				setNeoEdgeLabel((NeoEdgeLabelParam)null);
				return;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				unsetEdgeNumber();
				return;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				setKeyValueParam((KeyValueParam)null);
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
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_DIRECTION:
				return neoDirection != NEO_DIRECTION_EDEFAULT;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				return neoTargetNodeLabels != null;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				return neoEdgeLabel != null;
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				return isSetEdgeNumber();
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				return keyValueParam != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return NeoPathPart
	 * Returns the null if the NeoPathPart is not the Last Edge.
	 * If it is the last Edge it returns the instance it is called on.
	 */
	@Override
	public NeoPathPart getNeoLastEdge() {
		NeoPathPart lastEdge = null;
		if (isLastEdge) {
			lastEdge = this;
		}
		return lastEdge;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_SIMPLE_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValueParam getKeyValueParam() {
		return keyValueParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyValueParam(KeyValueParam newKeyValueParam, NotificationChain msgs) {
		KeyValueParam oldKeyValueParam = keyValueParam;
		keyValueParam = newKeyValueParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM, oldKeyValueParam, newKeyValueParam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Fur future opts for detecting data quality problems in edges.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setKeyValueParam(KeyValueParam newKeyValueParam) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoEdgeLabelParam getNeoEdgeLabel() {
		return neoEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoEdgeLabel(NeoEdgeLabelParam newNeoEdgeLabel, NotificationChain msgs) {
		NeoEdgeLabelParam oldNeoEdgeLabel = neoEdgeLabel;
		neoEdgeLabel = newNeoEdgeLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL, oldNeoEdgeLabel, newNeoEdgeLabel);
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
	public void setNeoEdgeLabel(NeoEdgeLabelParam newNeoEdgeLabel) {
		if (newNeoEdgeLabel != neoEdgeLabel) {
			NotificationChain msgs = null;
			if (neoEdgeLabel != null)
				msgs = ((InternalEObject)neoEdgeLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL, null, msgs);
			if (newNeoEdgeLabel != null)
				msgs = ((InternalEObject)newNeoEdgeLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL, null, msgs);
			msgs = basicSetNeoEdgeLabel(newNeoEdgeLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL, newNeoEdgeLabel, newNeoEdgeLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEdgeNumber() {
		return edgeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdgeNumber(int newEdgeNumber) {
		int oldEdgeNumber = edgeNumber;
		edgeNumber = newEdgeNumber;
		boolean oldEdgeNumberESet = edgeNumberESet;
		edgeNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER, oldEdgeNumber, edgeNumber, !oldEdgeNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEdgeNumber() {
		int oldEdgeNumber = edgeNumber;
		boolean oldEdgeNumberESet = edgeNumberESet;
		edgeNumber = EDGE_NUMBER_EDEFAULT;
		edgeNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER, oldEdgeNumber, EDGE_NUMBER_EDEFAULT, oldEdgeNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEdgeNumber() {
		return edgeNumberESet;
	}
	
	protected void setIsLastEdge(boolean newIsLastEdge) {
		isLastEdge = newIsLastEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoDirection getNeoDirection() {
		return neoDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoNodeLabelsParam getNeoTargetNodeLabels() {
		return neoTargetNodeLabels;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoTargetNodeLabels(NeoNodeLabelsParam newNeoTargetNodeLabels, NotificationChain msgs) {
		NeoNodeLabelsParam oldNeoTargetNodeLabels = neoTargetNodeLabels;
		neoTargetNodeLabels = newNeoTargetNodeLabels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS, oldNeoTargetNodeLabels, newNeoTargetNodeLabels);
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
	public void setNeoTargetNodeLabels(NeoNodeLabelsParam newNeoTargetNodeLabels) {
		if (newNeoTargetNodeLabels != neoTargetNodeLabels) {
			NotificationChain msgs = null;
			if (neoTargetNodeLabels != null)
				msgs = ((InternalEObject)neoTargetNodeLabels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS, null, msgs);
			if (newNeoTargetNodeLabels != null)
				msgs = ((InternalEObject)newNeoTargetNodeLabels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS, null, msgs);
			msgs = basicSetNeoTargetNodeLabels(newNeoTargetNodeLabels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS, newNeoTargetNodeLabels, newNeoTargetNodeLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setNeoDirection(NeoDirection neoDirection) throws InvalidityException {
		if (neoDirection == null) {
			throw new InvalidityException(NEO_DIRECTION_CAN_NOT_BE_NULL);
		}
		this.neoDirection = neoDirection;
	}

	@Override
	protected boolean isLastEdge() {
		return isLastEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addNeoTargetNodeLabel(String label) throws InvalidityException {
		if (this.neoTargetNodeLabels == null) {
			this.neoTargetNodeLabels = new NeoNodeLabelsParamImpl();
		}
		
		if (!this.neoTargetNodeLabels.getValues().contains(label)) {
			this.neoTargetNodeLabels.addStringValue(label);
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return EList<NeoPathPart>
	 * Returns this instance.
	 */
	@Override 
	public EList<NeoPathPart> getNeoPathPartEdgeLeafs() {
		EList<NeoPathPart> l = new BasicEList<NeoPathPart>();
		l.add(this);
		return  l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE___SET_NEO_DIRECTION__NEODIRECTION:
				try {
					setNeoDirection((NeoDirection)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE___ADD_NEO_TARGET_NODE_LABEL__STRING:
				try {
					addNeoTargetNodeLabel((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE___ADD_NEO_EDGE_LABEL__STRING:
				try {
					addNeoEdgeLabel((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
		result.append(" (neoDirection: ");
		result.append(neoDirection);
		result.append(", edgeNumber: ");
		if (edgeNumberESet) result.append(edgeNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * Builds myString of the instance called for the report.
	 */
	@Override
	public String myToString() {
		final String temp = NEO_SIMPLE_EDGE + ConstantsNeo.SIGNLE_OPENING_ROUND_BRACKET;
		final StringBuilder cypher = new StringBuilder(String.format(temp, getId()));
		if (neoEdgeLabel != null) {
			if (!neoEdgeLabel.getValueAsString().isEmpty()) {
				cypher.append(EDGE_LABELS + ConstantsNeo.EDGE_OPENING_BRACKET + neoEdgeLabel.getValueAsString() + ConstantsNeo.EDGE_CLOSING_BRACKET);
				cypher.append(ConstantsNeo.ONE_WHITESPACE);
			}			
		}
		if (getNeoTargetNodeLabels() != null) {
			boolean isFirst = true;
			for (String label : getNeoTargetNodeLabels().getValues()) {
				if (!isFirst) {
					cypher.append(ConstantsNeo.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE);
				} else {
					cypher.append(EDGE_TARGET_NODE_LABELS + ConstantsNeo.EDGE_OPENING_BRACKET);
				}
				cypher.append(label);
				isFirst = false;
			}
			if (cypher.toString().contains(EDGE_TARGET_NODE_LABELS)) {
				cypher.append(ConstantsNeo.EDGE_CLOSING_BRACKET);
			}			
		}
		cypher.append(ConstantsNeo.SIGNLE_CLOSING_ROUND_BRACKET);
		
		final String emptyBrackets = "()";
		if(cypher.toString().endsWith(emptyBrackets)) {
			cypher.replace(cypher.length() - 3 , cypher.length(), new String());
		}
		return cypher.toString();
	}

	@Override 
	public void isValidLocal(AbstractionLevel abstractionLevel) 
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		// TODO Auto-generated method stub
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param InternalCounter
	 * Given by the given InternalCount the edge count for this instance will be set.
	 */
	@Override
	protected void setCount(InternalCounter count) {
		setEdgeNumber(count.getCount());		
	}
} //SimpleEdgeImpl
