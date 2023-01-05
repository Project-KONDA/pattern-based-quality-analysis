/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoElement;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
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
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoPropertyNodeImpl#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPropertyNodeImpl extends PrimitiveNodeImpl implements NeoPropertyNode {
	private static final String NO_VALID_NEO_PROPERTY_EDGE = "No valid NeoPropertyEdge";
	private static final String NO_PROPERTY_NAME_IS_SPECIFIED = "No Property-Name is specified";
	private static final String NO_IMCOMING_EDGE_SPEZIFIED = "No imcoming edge spezified";
	private static final String THIS_NODE_IS_NOT_SUITED_TO_BE_A_RETURN_NODE = "This Node is not suited to be a Return Node";
	private static final String WRONG_INCOMING_NEO_PROPERTY_EDGE_SPECIFIED = "Wrong incoming NeoPropertyEdge specified";
	private static final String NO_INCOMING_NEO_PROPERTY_EDGE_SPECIFIED = "No incoming NeoPropertyEdge specified";
	private static final int CYPHER_RETURN_ID = 1;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoPropertyNodeImpl() {
		super();
	}
	
	/**
	 *@author Lukas Sebastian Hofmann
	 *@return Returns a String with multiple NeoPropertyNodes which are seperated by ";". In comparison to the other genrateCyphers in the Adaption-Package.
	 * This method should <b> primarily be used internally <\b>. Since the return type in this Child is different to the other .generateCypher()-Methods in this Package.
	 * However, if used then <b>split the String by the literal <i>";"<\i><\b>.
	 * It also only returns the distinct String-Array. 
	 * Translated is here not used since the labels of a NeoPropertyNode are build in the NeoSimpleEdge.
	 * Implemented to get the same behaviour as for the NeoElementNode.
	 */
	@Override 
	public String generateCypher() throws InvalidityException, UnsupportedOperationException {	
		if (getIncomingMapping() == null) {
			String[] temp = getCypherPropertyNodeVariable().split(CypherSpecificConstants.SEPERATOR);
			temp = Arrays.stream(temp).distinct().toArray(String[]::new);
			String cypher = new String();
			if (temp != null) {
				boolean multi = false;
				for (String s : temp) {
					if (multi) cypher += CypherSpecificConstants.SEPERATOR;
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
	 * Generates a EList of all properties which can be addressed. 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> generateCypherPropertyAddressing() throws InvalidityException {
		EList<String> cypherResult = new BasicEList<String>();
		if (getIncomingMapping() == null) {
			cypherResult.addAll(gatherCypherPropertyAddressings());
		} else {
			final EList<String> currentEdgeList = new BasicEList<String>();
			gatherNotMorphedPropertyAddressings(currentEdgeList);
			cypherResult = gatherPropertyAddressingsFromMorphing(currentEdgeList);
			currentEdgeList.clear();
		}
		checkForExistenceOfPropertyAddressings(cypherResult);
		return cypherResult;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypherResult
	 * @throws InvalidityException
	 * Checks if any Property can be addressed.
	 * If not an InvalidityException is thrown.
	 */
	private void checkForExistenceOfPropertyAddressings(EList<String> cypherResult) throws InvalidityException {
		if (getOutgoingMappings().size() == 0) {
			if (cypherResult.size() == 0) {
				throw new InvalidityException(NO_PROPERTY_NAME_IS_SPECIFIED);
			}
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return EList<String>
	 * @throws InvalidityException
	 * Creates internally the CypherPropertyAddressing.
	 */
	private EList<String> gatherCypherPropertyAddressings() throws InvalidityException {
		final EList<String> cypherList = new BasicEList<String>();
		EList<String> cypherResult;
		NeoPropertyEdge edge = null;
		String cypher = new String();
		for (int i = 0; i < getIncoming().size(); i++) {
			if (checkForValidIncomings()) {
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
		cypherResult = cypherList;
		return cypherResult;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return EList<String>
	 * @throws InvalidityException
	 * Gathers all NotMorphedPropertyAddressings.
	 * Works similar to the private method CypherPropertyAddressing.
	 */
	private void gatherNotMorphedPropertyAddressings(final EList<String> currentEdgeList) throws InvalidityException {
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
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param currentEdgeList
	 * @return EList<String>
	 * @throws InvalidityException
	 * Gathers recursively all Property-Addressings from the previews NeoPropertyNodes.
	 * Adds just one Property-Addressing from the previews PrimitiveNodes to reduce the redundancy for multiple times checking is the value is the same. 
	 */
	private EList<String> gatherPropertyAddressingsFromMorphing(final EList<String> currentEdgeList) throws InvalidityException {
		EList<String> cypherList = null;
		EList<String> cypherResult = null;
		cypherList = new BasicEList<String>();
		try {
			cypherList = ((NeoPropertyNodeImpl) getOriginalNode()).generateCypherPropertyAddressing();
		} catch (Exception e) {
			//DO NOTHING --> SINCE NO EXCEPTION WILL BE THROWN --> SEE  IN generateCypherPropertyAddressing THE CONDTION WHEN SOMETHING WILL BE THROWEN
			//Always a list will be returned. Thus there is no need for creating one. --> Could also be solved with an annotation to suppress the warning
			//Do nothing --> need of less checks, since an exception is thrown. The structure has not to be iterated twice in the worst case --> Check of valid and if valid then generat it
			//Actually if configured everything correctly there should be no exception
			//generateCypherPropertyAddressing() is throwing an Exception since in the case of direct addressings in the Operators at least one Element has to exists
			//"It's easier to ask forgiveness than it is to get permission" & "Ask forgiveness, not permission" --> Grace Hopper
			//https://medium.com/nerd-for-tech/look-before-you-leap-vs-easier-to-ask-for-forgiveness-than-permission-in-programming-85d17a5f48c8
		}
		//Not in all cases the original NeoPropertyNode has a Property specified. Thus also other previews NeoPropertyNodes could contain a valid Property-Addressing.
		if (cypherList.size() >= 1) {
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
		cypherResult = cypherList;
		cypherResult.addAll(currentEdgeList);
		return cypherResult;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param cypherList
	 * @param cypher
	 * @return boolean.class
	 * Checks if a Property-Addressing is already contained in a list.
	 */
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
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * Gets the first Comparison Varaible a Preview Nodes. 
	 * Until Now it is filled with the first Property-Addressing. 
	 */
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
	 * @author Lukas Sebastian Hofmann
	 * @return
	 * @throws InvalidityException
	 * Gets all Property-Node-Variables.
	 * The single Property-Node-Variables are separated by the CypherSpecificConstants.SEPERATOR.
	 */
	private String getCypherPropertyNodeVariable() throws InvalidityException {
		if (getIncomingMapping() == null) {
			if (!checkForValidIncomings())
				throw new InvalidityException(NO_INCOMING_NEO_PROPERTY_EDGE_SPECIFIED);
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
		return ((NeoPropertyNodeImpl) getOriginalNode()).getCypherPropertyNodeVariable();
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return boolean.class
	 * @throws InvalidityException
	 * This method checks if all incoming relations are of the correct type.
	 */
	private boolean checkForValidIncomings() throws InvalidityException {
		boolean result = !(getIncoming() == null || getIncoming().size() == 0);
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
	 * Returns the correct Cypher-Node-Variable. The Cypher-Node-Variable are seperated by CypherSpecificConstants.SEPERATOR.
	 * It has to be distinguished between the addressing which connects the Cypher-Node-Variable + Property-Name and just the Cypher-Node-Variable.
	 * We choose to take the Cypher-Node-Variable(-s) as a return value fur further extensions to the adaption that not only the Property can be accessed vai the NeoPropertyNode. 
	 * Moreover the Node shall be accessable, if it is needed in a Subquery statement and the Variable is not in the Scope of the Subquery.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCypherVariable() throws InvalidityException {
		if (getIncomingMapping() == null) {	
			final String[] temp = generateCypher().split(CypherSpecificConstants.SEPERATOR);
			String cypher = new String();
			if (temp != null) {
				for (String s : temp) {
					cypher += s;
					cypher = cypher.replace(CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET, "");
					cypher = cypher.replace(CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET, "");
					cypher += CypherSpecificConstants.SEPERATOR;
				}
				
			}
			return cypher;
		}
		return ((NeoPropertyNode) getOriginalNode()).getCypherVariable(); 
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * This method returns the Property-Addressing of all NeoPropertyNode-Names.
	 * The implicit Nodes have no further value for the NeoPropertyNode in the current stage of the approach.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EMap<Integer, String> getCypherReturnVariable() throws InvalidityException {
		final EMap<Integer, String> returnElement = new BasicEMap<Integer, String>();
		final String[] temp = (String[]) generateCypherPropertyAddressing().toArray(String[]::new);
		final StringBuilder cypher = new StringBuilder();
		for (String s : temp) {
			cypher.append(s + CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACE);
		}
		//Removes the last CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.CYPHER_SEPERATOR
		//Otherwise redundancy in separators can be produced
		cypher.replace(cypher.length() - 2, cypher.length(), new String());
		returnElement.put(NeoPropertyNodeImpl.CYPHER_RETURN_ID, cypher.toString());
		return returnElement;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param ix
	 * @return boolea.class
	 * @throws InvalidityException
	 * Checks if a Node aka the NeoElementNode in which the NeoPropertyNode is stored can be returned.
	 */
	private boolean isNodeReturnable(int ix) throws InvalidityException {
		NeoPropertyEdge neoPropertyEdge = null;
		NeoPropertyPathParam neoPropertyPathParam = null;
		
		if (!checkForValidIncomings()) {
			throw new InvalidityException(NO_IMCOMING_EDGE_SPEZIFIED);
		} else if (getIncoming().get(ix) == null) {
			throw new InvalidityException(WRONG_INCOMING_NEO_PROPERTY_EDGE_SPECIFIED);
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
			case Adaptionneo4jPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				return isIsVariableDistinctInUse();
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
			case Adaptionneo4jPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				setIsVariableDistinctInUse((Boolean)newValue);
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
			case Adaptionneo4jPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				setIsVariableDistinctInUse(IS_VARIABLE_DISTINCT_IN_USE_EDEFAULT);
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
			case Adaptionneo4jPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				return isVariableDistinctInUse != IS_VARIABLE_DISTINCT_IN_USE_EDEFAULT;
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
		if (baseClass == NeoElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NeoNode.class) {
			switch (derivedFeatureID) {
				case Adaptionneo4jPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE: return Adaptionneo4jPackage.NEO_NODE__IS_VARIABLE_DISTINCT_IN_USE;
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
		if (baseClass == NeoElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NeoNode.class) {
			switch (baseFeatureID) {
				case Adaptionneo4jPackage.NEO_NODE__IS_VARIABLE_DISTINCT_IN_USE: return Adaptionneo4jPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE;
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
		return Adaptionneo4jPackage.Literals.NEO_PROPERTY_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PROPERTY_NODE__IS_VARIABLE_DISTINCT_IN_USE, oldIsVariableDistinctInUse, isVariableDistinctInUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NeoElement.class) {
			switch (baseOperationID) {
				case Adaptionneo4jPackage.NEO_ELEMENT___GET_CYPHER_RETURN_VARIABLE: return Adaptionneo4jPackage.NEO_PROPERTY_NODE___GET_CYPHER_RETURN_VARIABLE;
				default: return -1;
			}
		}
		if (baseClass == NeoNode.class) {
			switch (baseOperationID) {
				case Adaptionneo4jPackage.NEO_NODE___GET_CYPHER_VARIABLE: return Adaptionneo4jPackage.NEO_PROPERTY_NODE___GET_CYPHER_VARIABLE;
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
			case Adaptionneo4jPackage.NEO_PROPERTY_NODE___GENERATE_CYPHER_PROPERTY_ADDRESSING:
				try {
					return generateCypherPropertyAddressing();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_PROPERTY_NODE___GET_CYPHER_VARIABLE:
				try {
					return getCypherVariable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_PROPERTY_NODE___GET_CYPHER_RETURN_VARIABLE:
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
	 * Creates the myString for the NeoElementNode with:
	 * 		- isVariableDistinctInUse
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isVariableDistinctInUse: ");
		result.append(isVariableDistinctInUse);
		result.append(')');
		return result.toString();
	}

} //NeoAttributeNodeImpl
