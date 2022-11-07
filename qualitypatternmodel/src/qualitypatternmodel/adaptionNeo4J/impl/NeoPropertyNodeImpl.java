/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
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
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Attribute Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl#getNeoPlace <em>Neo Place</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyNodeImpl#isReturnProperty <em>Return Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPropertyNodeImpl extends PrimitiveNodeImpl implements NeoPropertyNode {
	private static final String NO_CYPHER_PROPERTY_ADDRESSINGS_COULD_BE_GENERATED = "No Cypher-Property-Addressings could be generated";
	private static final String NO_VALID_NEO_PROPERTY_EDGE = "No valid NeoPropertyEdge";
	/**
	 * The default value of the '{@link #getNeoPlace() <em>Neo Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPlace()
	 * @generated
	 * @ordered
	 */
	protected static final NeoPlace NEO_PLACE_EDEFAULT = NeoPlace.FOLLOWING;
	private static final String NO_PROPERTY_NAME_IS_SPECIFIED = "No Property-Name is specified";
	private static final String NO_IMCOMING_EDGE_SPEZIFIED = "No imcoming edge spezified";
	private static final String THIS_NODE_IS_NOT_SUITED_TO_BE_A_RETURN_NODE = "This Node is not suited to be a Return Node";
	private static final String WRONG_INCOMING_NEO_PROPERTY_EDGE_SPECIFIED = "Wrong incoming NeoPropertyEdge specified";
	private static final String NO_INCOMING_NEO_PROPERTY_EDGE_SPECIFIED = "No incoming NeoPropertyEdge specified";
	private static final int CYPHER_RETURN_ID = 1;
	/**
	 * The cached value of the '{@link #getNeoPlace() <em>Neo Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPlace()
	 * @generated
	 * @ordered
	 */
	protected NeoPlace neoPlace = NEO_PLACE_EDEFAULT;

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
		if (getIncomingMapping() == null) {
			final String[] temp = generateCypherNodeVariable().split(CypherSpecificConstants.SEPERATOR);
			String cypher = new String();
			if (temp != null) {
				boolean multi = false;
				for (String s : temp) {
					if (multi) cypher += CypherSpecificConstants.SEPERATOR + CypherSpecificConstants.ONE_WHITESPACE;
					cypher += CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + s + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET;		
				}
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> generateCypherPropertyAddressing() throws InvalidityException {
		EList<String> cypherList = new BasicEList<String>();
		EList<String> cypherResult = null;
		if (getIncomingMapping() == null) {
			NeoPropertyEdge edge = null;
			String cypher = new String();
			for (int i = 0; i < getIncoming().size(); i++) {
				if (checkForValidIncoming()) {
					edge = (NeoPropertyEdge) getIncoming().get(i);
					if (edge.getNeoPropertyPathParam() == null || edge.getNeoPropertyPathParam().getNeoPropertyName() == null) {
						throw new InvalidityException(NO_PROPERTY_NAME_IS_SPECIFIED);
					}
					cypher = edge.generateCypherPropertyAddressing();
					if (!alreadyContainedInCypherPropertyAddressingList(cypherList, cypher)) {						
						cypherList.add(cypher);
					}
				}
			}
			cypher = null;
			cypherResult = cypherList;
		} else {
			final EList<String> currentEdgeList = new BasicEList<String>();
			NeoPropertyEdge neoPropertyEdge = null;
			String cypher = null;
			for (Relation r : getIncoming()) {
				neoPropertyEdge = (NeoPropertyEdge) r;
				if (neoPropertyEdge.getIncomingMapping() == null) {
					cypher = neoPropertyEdge.generateCypherPropertyAddressing();
					if (!alreadyContainedInCypherPropertyAddressingList(currentEdgeList, cypher)) {						
						currentEdgeList.add(cypher);
					}
				}
			}
			if (currentEdgeList.size() != 0) {
				cypherList = new BasicEList<String>();
				try {
					cypherList = ((NeoPropertyNodeImpl) getOriginalNode()).generateCypherPropertyAddressing();
				} catch (Exception e) {}
				if (cypherList.size() > 1) {
					final String adressing = cypherList.get(CypherSpecificConstants.FIRST_CYPHER_PROPERTY_ADDRESSING);
					cypherList.clear();
					cypherList.add(adressing);
				} else if (getIncomingMapping() != null) {
					final Node node = (Node) getIncomingMapping().getSource();
					final String adressing = ((NeoPropertyNodeImpl) node).getCypherComparisonVariableFromPreviewsNodes();
					if (adressing != null) {
						cypherList.add(adressing);
					}
				}
			}	
			cypherResult = cypherList;
			cypherResult.addAll(currentEdgeList);
		}
		cypherList = null;
		if (getOutgoingMappings().size() == 0) {
			if (cypherResult.size() == 0) {
				throw new InvalidityException(NO_PROPERTY_NAME_IS_SPECIFIED);
			}
		}
		return cypherResult;
	}
	
	private boolean alreadyContainedInCypherPropertyAddressingList(EList<String> cypherList, String cypher) {
		boolean isContained = false;
		String temp = null;
		for (int i = 0; i < cypherList.size(); i++) {
			temp = cypherList.get(i);
			if (temp.compareTo(cypher) == 0) {
				isContained = true;
				i = cypherList.size();
			}
		}
		return isContained;
	}

	//Checking every previews Mapping in Case the original has no incoming relation
	private String getCypherComparisonVariableFromPreviewsNodes() throws InvalidityException {
		String adressing = null;
		if (getIncomingMapping() != null && adressing == null) {
			NeoPropertyEdge edge = null;
			String temp = null;
			for (Relation r : getIncoming()) {
				edge = (NeoPropertyEdge) r;
				if (edge.getOriginalRelation() == null) {
					temp = edge.generateCypherPropertyAddressing();
					if (!temp.isEmpty()) {
						adressing = temp;
						break;
					}					
				}
			}
			if (adressing == null) {
				adressing = getCypherComparisonVariableFromPreviewsNodes();
			}
		}
		return adressing;
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
			final StringBuilder cypher = new StringBuilder();
			int countReturnables = 0;
			for (int i = 0; i < getIncoming().size(); i++) {
				if (isNodeReturnable(i)) {					
					NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) getIncoming().get(i);
					cypher.append(neoPropertyEdge.generateCypherNodeVariable());
					cypher.append(CypherSpecificConstants.SEPERATOR);
				} else {
					countReturnables++;
				}
			}
			if (countReturnables == getIncoming().size()) {
				throw new InvalidityException(NeoPropertyNodeImpl.THIS_NODE_IS_NOT_SUITED_TO_BE_A_RETURN_NODE);
			}
			return cypher.toString();
		}
		return ((NeoPropertyNode) getOriginalNode()).generateCypherNodeVariable();
	}

	//Check if this check is in the other classes similar or need similar adaption
	private boolean checkForValidIncoming() throws InvalidityException {
		boolean result = !(getIncoming() == null && getIncoming().size() == 0);
		if (result) {
			for (Relation r : getIncoming()) {
				if (!(r instanceof NeoPropertyEdge)) {
					result = false;
					break;
				}
			}			
		}
		if (!result) {
			throw new InvalidityException(NeoPropertyNodeImpl.NO_VALID_NEO_PROPERTY_EDGE);
		}
		return result;
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
			final String[] temp = generateCypher().split(CypherSpecificConstants.SEPERATOR);
			String cypher = "";
			if (temp != null) {
				for (String s : temp) {
					cypher += s;
					cypher = cypher.replace("(", "");
					cypher = cypher.replace(")", "");
					cypher += CypherSpecificConstants.SEPERATOR;
				}
				
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
		final EMap<Integer, String> returnElement = new BasicEMap<Integer, String>();
		final String[] temp = getCypherVariable().split(CypherSpecificConstants.SEPERATOR);
		final StringBuilder cypher = new StringBuilder();
		for (String s : temp) {
			cypher.append(s + CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.CYPHER_SEPERATOR);
		}
		//Removes the last CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.CYPHER_SEPERATOR
		//Otherwise redundancy in separators can be produced
		cypher.replace(cypher.length() - 2, cypher.length(), new String());
		if (getIncomingMapping() == null) {	
			returnElement.put(NeoPropertyNodeImpl.CYPHER_RETURN_ID, cypher.toString());
			return returnElement;
		} else {
			returnElement.put(NeoPropertyNodeImpl.CYPHER_RETURN_ID, cypher.toString());
		}
		return returnElement;
	}

	private boolean isNodeReturnable(int ix) throws InvalidityException {
		NeoPropertyEdge neoPropertyEdge;
		NeoPropertyPathParam neoPropertyPathParam;
		
		if (!checkForValidIncoming()) {
			throw new InvalidityException(NO_IMCOMING_EDGE_SPEZIFIED);
		}
		boolean result = true;
		neoPropertyEdge = (NeoPropertyEdge) getIncoming().get(ix);
		neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		if (neoPropertyPathParam == null || neoPropertyPathParam.getNeoPathPart() == null) {
			result = false;
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NEO_PLACE:
				return getNeoPlace();
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NEO_PLACE:
				setNeoPlace((NeoPlace)newValue);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NEO_PLACE:
				setNeoPlace(NEO_PLACE_EDEFAULT);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NEO_PLACE:
				return neoPlace != NEO_PLACE_EDEFAULT;
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
				case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NEO_PLACE: return AdaptionNeo4JPackage.NEO_INTERFACE_NODE__NEO_PLACE;
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
				case AdaptionNeo4JPackage.NEO_INTERFACE_NODE__NEO_PLACE: return AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NEO_PLACE;
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
	public NeoPlace getNeoPlace() {
		return neoPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoPlace(NeoPlace newNeoPlace) {
		NeoPlace oldNeoPlace = neoPlace;
		neoPlace = newNeoPlace == null ? NEO_PLACE_EDEFAULT : newNeoPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NEO_PLACE, oldNeoPlace, neoPlace));
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
		result.append(" (neoPlace: ");
		result.append(neoPlace);
		result.append(", isVariableDistinctInUse: ");
		result.append(isVariableDistinctInUse);
		result.append(", returnProperty: ");
		result.append(returnProperty);
		result.append(')');
		return result.toString();
	}

} //NeoAttributeNodeImpl
