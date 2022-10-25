/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionNeo4J.NeoInterfaceNode;
import qualitypatternmodel.adaptionNeo4J.NeoInterfaceElement;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Attribute Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl#getNodePlace <em>Node Place</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl#isReturnProperty <em>Return Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPropertyNodeImpl extends PrimitiveNodeImpl implements NeoPropertyNode {
	private static final String NO_PROPERTY_NAME_IS_SPECIFIED = "No Property Name is specified";
	private static final String NO_IMCOMING_EDGE_SPEZIFIED = "No imcoming edge spezified";
	private static final String THIS_NODE_IS_NOT_SUITED_TO_BE_A_RETURN_NODE = "This Node is not suited to be a Return Node";
	private static final String WRONG_INCOMING_NEO_PROPERTY_EDGE_SPECIFIED = "Wrong incoming NeoPropertyEdge specified";
	private static final String NO_INCOMING_NEO_PROPERTY_EDGE_SPECIFIED = "No incoming NeoPropertyEdge specified";
	private static final int CYPHER_RETURN_ID = 1;
	/**
	 * The default value of the '{@link #getNodePlace() <em>Node Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodePlace()
	 * @generated
	 * @ordered
	 */
	protected static final NeoPlace NODE_PLACE_EDEFAULT = NeoPlace.FOLLOWING;
	/**
	 * The cached value of the '{@link #getNodePlace() <em>Node Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodePlace()
	 * @generated
	 * @ordered
	 */
	protected NeoPlace nodePlace = NODE_PLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVariableDistinctInUse() <em>Is Variable Distinct In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVariableDistinctInUse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VARIABLE_DISTINCT_IN_USE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isIsVariableDistinctInUse() <em>Is Variable Distinct In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVariableDistinctInUse()
	 * @generated
	 * @ordered
	 */
	protected boolean isVariableDistinctInUse = IS_VARIABLE_DISTINCT_IN_USE_EDEFAULT;
	/**
	 * The default value of the '{@link #isReturnProperty() <em>Return Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_PROPERTY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isReturnProperty() <em>Return Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean returnProperty = RETURN_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoPropertyNodeImpl() {
		super();
	}
	
	@Override 
	public String generateCypher() throws InvalidityException, UnsupportedOperationException {
		isNodeReturnable();	
		if (getIncomingMapping() == null) {
			final String temp = generateCypherNodeVariable();
			String cypher = null;
			if (temp != null) {
				cypher = "(" + temp + ")";		
				return cypher;
			}
			return cypher;
		}
		return ((NeoPropertyNode) getOriginalNode()).generateCypher();
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateCypherPropertyAddressing() throws InvalidityException {
		if (getIncomingMapping() == null) {
			String cypher = null;
			if (checkForValidIncoming()) {
				NeoPropertyEdge edge = (NeoPropertyEdge) getIncoming().get(0);
				if (edge.getNeoPropertyPathParam().getNeoPropertyName() == null) {
					throw new InvalidityException(NO_PROPERTY_NAME_IS_SPECIFIED);
				}
				cypher = edge.generateCypherPropertyAddressing();
			}
			return cypher;
		}
		return ((NeoPropertyNode) getOriginalNode()).generateCypherPropertyAddressing();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateCypherNodeVariable() throws InvalidityException {
		if (getIncomingMapping() == null) {
			if (!checkForValidIncoming())
				throw new InvalidityException(NO_INCOMING_NEO_PROPERTY_EDGE_SPECIFIED);
			else if(!(getIncoming().get(0) instanceof NeoPropertyEdge))
				throw new InvalidityException(WRONG_INCOMING_NEO_PROPERTY_EDGE_SPECIFIED);
			NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) getIncoming().get(0);
			String cypher = neoPropertyEdge.generateCypherNodeVariable();
			return cypher;
		}
		return ((NeoPropertyNode) getOriginalNode()).generateCypherNodeVariable();
	}

	//Check if this check is in the other classes similar or need similar adaption
	private boolean checkForValidIncoming() {
		return !(getIncoming() == null || getIncoming().size() != 1 || getIncoming().get(0) == null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setIsReturnProperty(boolean returnProperty) {
		this.returnProperty = returnProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCypherVariable() throws InvalidityException {
		if (getIncomingMapping() == null) {	
			final String temp = generateCypher();
			String cypher = null;
			if (temp != null) {
				cypher = temp;
				cypher = cypher.replace("(", "");
				cypher = cypher.replace(")", "");
			}
			
			return cypher;
		}
		return ((NeoPropertyNode) getOriginalNode()).getCypherVariable(); 
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EMap<Integer, String> getCypherReturnVariable() throws InvalidityException {
		EMap<Integer, String> returnElement = new BasicEMap<Integer, String>();
		String cypher = null;
		if (getIncomingMapping() == null) {	
			cypher = generateCypher();
			returnElement.put(NeoPropertyNodeImpl.CYPHER_RETURN_ID, getCypherVariable());
			return returnElement;
		} else {
			cypher = ((NeoPropertyNode) getOriginalNode()).generateCypherNodeVariable();
			returnElement.put(NeoPropertyNodeImpl.CYPHER_RETURN_ID, getCypherVariable());
		}
		return returnElement;
	}

	private void isNodeReturnable() throws InvalidityException {
		NeoPropertyEdge neoPropertyEdge;
		NeoPropertyPathParam neoPropertyPathParam;
		
		if (!checkForValidIncoming()) {
			throw new InvalidityException(NO_IMCOMING_EDGE_SPEZIFIED);
		}
		neoPropertyEdge = (NeoPropertyEdge) getIncoming().get(0);
		neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		if (neoPropertyPathParam == null || neoPropertyPathParam.getNeoPathPart() == null) {
			throw new InvalidityException(THIS_NODE_IS_NOT_SUITED_TO_BE_A_RETURN_NODE);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NODE_PLACE:
				return getNodePlace();
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				return isIsVariableDistinctInUse();
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__RETURN_PROPERTY:
				return isReturnProperty();
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NODE_PLACE:
				setNodePlace((NeoPlace)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				setIsVariableDistinctInUse((Boolean)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__RETURN_PROPERTY:
				setReturnProperty((Boolean)newValue);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NODE_PLACE:
				setNodePlace(NODE_PLACE_EDEFAULT);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				setIsVariableDistinctInUse(IS_VARIABLE_DISTINCT_IN_USE_EDEFAULT);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__RETURN_PROPERTY:
				setReturnProperty(RETURN_PROPERTY_EDEFAULT);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NODE_PLACE:
				return nodePlace != NODE_PLACE_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				return isVariableDistinctInUse != IS_VARIABLE_DISTINCT_IN_USE_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__RETURN_PROPERTY:
				return returnProperty != RETURN_PROPERTY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NeoInterfaceElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NeoInterfaceNode.class) {
			switch (derivedFeatureID) {
				case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NODE_PLACE: return AdaptionNeo4JPackage.NEO_INTERFACE_NODE__NODE_PLACE;
				case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE: return AdaptionNeo4JPackage.NEO_INTERFACE_NODE__IS_VARIABLE_DISTINCT_IN_USE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NeoInterfaceElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NeoInterfaceNode.class) {
			switch (baseFeatureID) {
				case AdaptionNeo4JPackage.NEO_INTERFACE_NODE__NODE_PLACE: return AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NODE_PLACE;
				case AdaptionNeo4JPackage.NEO_INTERFACE_NODE__IS_VARIABLE_DISTINCT_IN_USE: return AdaptionNeo4JPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException {
		return this;
	}

	@Override
	public NeoPropertyNode adaptAsNeoPropertyNode() throws InvalidityException {
		return this;
	}
	
	@Override
	public Node makeGeneric() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public Node makeGenericRecursive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public void checkGeneric() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public PrimitiveNode makePrimitive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public PrimitiveNode makePrimitiveRecursive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}
	
	@Override
	public void checkPrimitive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_PROPERTY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPlace getNodePlace() {
		return nodePlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNodePlace(NeoPlace newNodePlace) {
		NeoPlace oldNodePlace = nodePlace;
		nodePlace = newNodePlace == null ? NODE_PLACE_EDEFAULT : newNodePlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NODE_PLACE, oldNodePlace, nodePlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsVariableDistinctInUse() {
		return isVariableDistinctInUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsVariableDistinctInUse(boolean newIsVariableDistinctInUse) {
		boolean oldIsVariableDistinctInUse = isVariableDistinctInUse;
		isVariableDistinctInUse = newIsVariableDistinctInUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE, oldIsVariableDistinctInUse, isVariableDistinctInUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReturnProperty() {
		return returnProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnProperty(boolean newReturnProperty) {
		boolean oldReturnProperty = returnProperty;
		returnProperty = newReturnProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_NODE__RETURN_PROPERTY, oldReturnProperty, returnProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NeoInterfaceElement.class) {
			switch (baseOperationID) {
				case AdaptionNeo4JPackage.NEO_INTERFACE_ELEMENT___GET_CYPHER_RETURN_VARIABLE: return AdaptionNeo4JPackage.NEO_PROPERTY_NODE___GET_CYPHER_RETURN_VARIABLE;
				default: return -1;
			}
		}
		if (baseClass == NeoInterfaceNode.class) {
			switch (baseOperationID) {
				case AdaptionNeo4JPackage.NEO_INTERFACE_NODE___GET_CYPHER_VARIABLE: return AdaptionNeo4JPackage.NEO_PROPERTY_NODE___GET_CYPHER_VARIABLE;
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE___GENERATE_CYPHER_PROPERTY_ADDRESSING:
				try {
					return generateCypherPropertyAddressing();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE___GENERATE_CYPHER_NODE_VARIABLE:
				try {
					return generateCypherNodeVariable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE___SET_IS_RETURN_PROPERTY__BOOLEAN:
				setIsReturnProperty((Boolean)arguments.get(0));
				return null;
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE___GET_CYPHER_VARIABLE:
				try {
					return getCypherVariable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE___GET_CYPHER_RETURN_VARIABLE:
				try {
					return getCypherReturnVariable();
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
		result.append(" (nodePlace: ");
		result.append(nodePlace);
		result.append(", isVariableDistinctInUse: ");
		result.append(isVariableDistinctInUse);
		result.append(", returnProperty: ");
		result.append(returnProperty);
		result.append(')');
		return result.toString();
	}

} //NeoAttributeNodeImpl
