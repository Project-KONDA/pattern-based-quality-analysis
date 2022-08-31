/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.KeyValueParam;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getKeyValueParam <em>Key Value Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getNeoDirection <em>Neo Direction</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getEdgeNumber <em>Edge Number</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getNeoEdgeLabel <em>Neo Edge Label</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#isIsLastSimpleEdge <em>Is Last Simple Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoSimpleEdgeImpl extends NeoPathPartImpl implements NeoSimpleEdge {
	/**
	 * The cached value of the '{@link #getKeyValueParam() <em>Key Value Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValueParam()
	 * @generated
	 * @ordered
	 */
	protected KeyValueParam keyValueParam;

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
	 * The cached value of the '{@link #getNeoTargetNodeLabels() <em>Neo Target Node Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoTargetNodeLabels()
	 * @generated
	 * @ordered
	 */
	protected TextListParam neoTargetNodeLabels;

	/**
	 * The cached value of the '{@link #getNeoEdgeLabel() <em>Neo Edge Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoEdgeLabel()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam neoEdgeLabel;
	/**
	 * The default value of the '{@link #isIsLastSimpleEdge() <em>Is Last Simple Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLastSimpleEdge()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LAST_SIMPLE_EDGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLastSimpleEdge() <em>Is Last Simple Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLastSimpleEdge()
	 * @generated
	 * @ordered
	 */
	protected boolean isLastSimpleEdge = IS_LAST_SIMPLE_EDGE_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected NeoSimpleEdgeImpl() {
		super();
		this.setEdgeNumber(NeoPathPartImpl.COUNTER);
		increaseClassCounter();
		//NeoPathPartImpl.EDGES.add(this);
	} 
	
	@Override
	public String generateCypher() throws InvalidityException {
		StringBuilder cypher = new StringBuilder();		
		generateInternalCypher(cypher, true);
		return cypher.toString();
	}
	
	@Override
	public String generateCypherWithoutLabels() throws InvalidityException {
		StringBuilder cypher = new StringBuilder();
		generateInternalCypher(cypher, false);
		return cypher.toString();
	}

	
	private void generateInternalCypher(StringBuilder cypher, Boolean withLabels) throws InvalidityException {
		switch (this.neoDirection) {
		case IMPLICIT:
			cypher.append("-");
			this.generateInternalCypherLabelGenerator(cypher, withLabels);
			cypher.append("-");
			break;
		case LEFT:
			cypher.append("<-");
			this.generateInternalCypherLabelGenerator(cypher, withLabels);
			cypher.append("-");
			break;
		case RIGHT:
			cypher.append("-");
			this.generateInternalCypherLabelGenerator(cypher, withLabels);
			cypher.append("->");
			break;
		default:
			throw new InvalidityException("Something went wronge in the SimpleNeoEdge - direction has not been set correctly");
		}
		
		if (getNeoTargetNodeLabels() != null && getNeoTargetNodeLabels().getValues().size() != 0) {
			cypher.append("(");
			cypher.append(getCypherInnerEdgeVariable());
			if (withLabels) {
				EList<String> labels = getNeoTargetNodeLabels().getValues();
				for (String label : labels) {
					if (label != "") {
						cypher.append(":" + label);
					}
				}
			}
			cypher.append(")");
		}
	}
	
	//Considering the SOLID-Principle: If this methods need change then extend from NeoSimpleEdge and Override it, 
	//e.g., in future versions multi-labels in a Edge are Possible or the properties as labels should be considered
	private void generateInternalCypherLabelGenerator(StringBuilder cypher, Boolean withLabels) throws InvalidityException {
		cypher.append("[");
		cypher.append(CypherSpecificConstants.VARIABLE_EGDE);
		cypher.append(getEdgeNumber());
		if (withLabels) {
			if (getNeoEdgeLabel() != null) { //!translated &&
				cypher.append(":" + getNeoEdgeLabel().getValue());
				//translated = true;
				
			}
		}
		cypher.append("]");
	}
	
	@Override
	public String getCypherVariable() {
		return super.getCypherVariable() + edgeNumber;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCypherInnerEdgeVariable() throws InvalidityException {
		return CypherSpecificConstants.INTERNAL_EDGE_NODE + getEdgeNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addNeoEdgeLabel(String label) {
		if (this.neoEdgeLabel == null) {
			this.neoEdgeLabel = new TextLiteralParamImpl();
		}
		if (this.neoEdgeLabel.getValue() == null || this.neoEdgeLabel.getValue().compareTo(label) != 0) {
			this.neoEdgeLabel.setValue(label);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_SIMPLE_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValueParam getKeyValueParam() {
		if (keyValueParam != null && keyValueParam.eIsProxy()) {
			InternalEObject oldKeyValueParam = (InternalEObject)keyValueParam;
			keyValueParam = (KeyValueParam)eResolveProxy(oldKeyValueParam);
			if (keyValueParam != oldKeyValueParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM, oldKeyValueParam, keyValueParam));
			}
		}
		return keyValueParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueParam basicGetKeyValueParam() {
		return keyValueParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyValueParam(KeyValueParam newKeyValueParam) {
		KeyValueParam oldKeyValueParam = keyValueParam;
		keyValueParam = newKeyValueParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM, oldKeyValueParam, keyValueParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteralParam getNeoEdgeLabel() {
		if (neoEdgeLabel != null && neoEdgeLabel.eIsProxy()) {
			InternalEObject oldNeoEdgeLabel = (InternalEObject)neoEdgeLabel;
			neoEdgeLabel = (TextLiteralParam)eResolveProxy(oldNeoEdgeLabel);
			if (neoEdgeLabel != oldNeoEdgeLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL, oldNeoEdgeLabel, neoEdgeLabel));
			}
		}
		return neoEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteralParam basicGetNeoEdgeLabel() {
		return neoEdgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoEdgeLabel(TextLiteralParam newNeoEdgeLabel) {
		TextLiteralParam oldNeoEdgeLabel = neoEdgeLabel;
		neoEdgeLabel = newNeoEdgeLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL, oldNeoEdgeLabel, neoEdgeLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsLastSimpleEdge() {
		return isLastSimpleEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLastSimpleEdge(boolean newIsLastSimpleEdge) {
		boolean oldIsLastSimpleEdge = isLastSimpleEdge;
		isLastSimpleEdge = newIsLastSimpleEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__IS_LAST_SIMPLE_EDGE, oldIsLastSimpleEdge, isLastSimpleEdge));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER, oldEdgeNumber, edgeNumber, !oldEdgeNumberESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER, oldEdgeNumber, EDGE_NUMBER_EDEFAULT, oldEdgeNumberESet));
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextListParam getNeoTargetNodeLabels() {
		if (neoTargetNodeLabels != null && neoTargetNodeLabels.eIsProxy()) {
			InternalEObject oldNeoTargetNodeLabels = (InternalEObject)neoTargetNodeLabels;
			neoTargetNodeLabels = (TextListParam)eResolveProxy(oldNeoTargetNodeLabels);
			if (neoTargetNodeLabels != oldNeoTargetNodeLabels) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS, oldNeoTargetNodeLabels, neoTargetNodeLabels));
			}
		}
		return neoTargetNodeLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextListParam basicGetNeoTargetNodeLabels() {
		return neoTargetNodeLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoTargetNodeLabels(TextListParam newNeoTargetNodeLabels) {
		TextListParam oldNeoTargetNodeLabels = neoTargetNodeLabels;
		neoTargetNodeLabels = newNeoTargetNodeLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS, oldNeoTargetNodeLabels, neoTargetNodeLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setNeoDirection(NeoDirection neoDirection) {
		if (neoDirection == null)
			return;
		this.neoDirection = neoDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isLastSimpleEdge() {
		return this.isLastSimpleEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addStringTargetNodeLabel(String label) {
		if (this.neoTargetNodeLabels == null) {
			this.neoTargetNodeLabels = new TextListParamImpl();
		}
		this.neoTargetNodeLabels.addStringValue(label);
	}

	//Inserted Method
	@Override 
	public EList<NeoSimpleEdge> getSimpleEdges() {
		EList<NeoSimpleEdge> l = new BasicEList<NeoSimpleEdge>();
		l.add(this);
		return  l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				if (resolve) return getKeyValueParam();
				return basicGetKeyValueParam();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_DIRECTION:
				return getNeoDirection();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				return getEdgeNumber();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				if (resolve) return getNeoTargetNodeLabels();
				return basicGetNeoTargetNodeLabels();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				if (resolve) return getNeoEdgeLabel();
				return basicGetNeoEdgeLabel();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__IS_LAST_SIMPLE_EDGE:
				return isIsLastSimpleEdge();
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
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				setKeyValueParam((KeyValueParam)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				setEdgeNumber((Integer)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				setNeoTargetNodeLabels((TextListParam)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				setNeoEdgeLabel((TextLiteralParam)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__IS_LAST_SIMPLE_EDGE:
				setIsLastSimpleEdge((Boolean)newValue);
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
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				setKeyValueParam((KeyValueParam)null);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				unsetEdgeNumber();
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				setNeoTargetNodeLabels((TextListParam)null);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				setNeoEdgeLabel((TextLiteralParam)null);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__IS_LAST_SIMPLE_EDGE:
				setIsLastSimpleEdge(IS_LAST_SIMPLE_EDGE_EDEFAULT);
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
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEY_VALUE_PARAM:
				return keyValueParam != null;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_DIRECTION:
				return neoDirection != NEO_DIRECTION_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__EDGE_NUMBER:
				return isSetEdgeNumber();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS:
				return neoTargetNodeLabels != null;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__NEO_EDGE_LABEL:
				return neoEdgeLabel != null;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__IS_LAST_SIMPLE_EDGE:
				return isLastSimpleEdge != IS_LAST_SIMPLE_EDGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE___SET_NEO_DIRECTION__NEODIRECTION:
				setNeoDirection((NeoDirection)arguments.get(0));
				return null;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE___IS_LAST_SIMPLE_EDGE:
				return isLastSimpleEdge();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE___ADD_STRING_TARGET_NODE_LABEL__STRING:
				addStringTargetNodeLabel((String)arguments.get(0));
				return null;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE___GET_CYPHER_INNER_EDGE_VARIABLE:
				try {
					return getCypherInnerEdgeVariable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE___ADD_NEO_EDGE_LABEL__STRING:
				addNeoEdgeLabel((String)arguments.get(0));
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
		result.append(" (neoDirection: ");
		result.append(neoDirection);
		result.append(", edgeNumber: ");
		if (edgeNumberESet) result.append(edgeNumber); else result.append("<unset>");
		result.append(", isLastSimpleEdge: ");
		result.append(isLastSimpleEdge);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override 
	public void isValidLocal(AbstractionLevel abstractionLevel) 
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		//TODO
	}
	
//	  It can not just be done like this, since the id's of the other edges also have to be changed
//	  Maybe introduce something like an observer? 	
//	@Override
//    protected void finalize() {
//        System.out.print("Set the counter down by 1.");
//        fillTheGapWithLastElement(this);
//        NeoPathPartImpl.COUNTER--;
//    }
} //SimpleEdgeImpl
