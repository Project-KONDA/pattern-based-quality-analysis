/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoElement;
import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.impl.ComplexNodeImpl;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoElementNodeImpl#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoElementNodeImpl#getNeoNodeLabels <em>Neo Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoElementNodeImpl#getNeoPlace <em>Neo Place</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoElementNodeImpl extends ComplexNodeImpl implements NeoElementNode {
	private static final String PARAMETER_HAS_NOT_BEEN_CREATED_IN_NEO_ELEMENT_NODE = "Parameter has not been created in NeoElementNode";
	private static final String A_LABEL_CAN_NOT_CONTAIN_WHITESPACE_S = "A Label can not contain Whitespace(s)";
	private static final int CYPHER_RETURN_ID = 0;
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
	 * The cached value of the '{@link #getNeoNodeLabels() <em>Neo Node Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoNodeLabels()
	 * @generated
	 * @ordered
	 */
	protected TextListParam neoNodeLabels;
	/**
	 * The default value of the '{@link #getNeoPlace() <em>Neo Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPlace()
	 * @generated
	 * @ordered
	 */
	protected static final NeoPlace NEO_PLACE_EDEFAULT = NeoPlace.FOLLOWING;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoElementNodeImpl() {
		super();
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * @returns String
	 * Creates the NeoElementNode.
	 * If not already printed it will add the label(s) to the Node.
	 * If already printed it will not add the label(s) to the Node.
	 * It returns the Node in the format for the MATCH-Clause in in a clamped version.
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		if (getIncomingMapping() == null) {
			StringBuilder cypher = new StringBuilder();
			cypher.append(CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET);
			cypher.append(CypherSpecificConstants.VARIABLE_ELEMENT_NODE);
			cypher.append(getOriginalID());
			TextListParam labels = this.getNeoNodeLabels();
			if((!translated)) { 
				if (getNeoNodeLabels() != null) {
					for (String label : labels.getValues()) {
						if (!label.isEmpty()) { 
							cypher.append(CypherSpecificConstants.CYPHER_COMPARISON_OPERATOR_EQUAL_IN_GRAPH_MATCHING_LABELING);
							cypher.append(label);
						}
					}
				}
				translated = true;
			}
			cypher.append(CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
			return cypher.toString();
		}
		return ((NeoElementNode) getOriginalNode()).generateCypher();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Returns just the alias for the Variable.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override 
	public String getCypherVariable() throws InvalidityException {
		if (getIncomingMapping() == null) {
			String var;
			var = CypherSpecificConstants.VARIABLE_ELEMENT_NODE;
			var += getOriginalID();
			return var;
		}
		return ((NeoElementNode) getOriginalNode()).getCypherVariable();	
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the Variable in the format for the Return-Clause.
	 * If the variable is not distinct in use it will add the DISTINCT function for the Variable.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EMap<Integer, String> getCypherReturnVariable() throws InvalidityException {
		EMap<Integer, String> returnElement = new BasicEMap<Integer, String>();
		String cypher;
		if (getIncomingMapping() == null) {
			if (isVariableDistinctInUse) {
				cypher = this.getCypherVariable();
			} else {
				cypher = CypherSpecificConstants.CYPHER_SPECIAL_FUNCTION_DISTINCT + " (" + this.getCypherVariable() + ")";
			}
			returnElement.put(NeoElementNodeImpl.CYPHER_RETURN_ID, cypher);
		} else {
			returnElement = ((NeoElementNode) getOriginalNode()).getCypherReturnVariable();
		}
		return returnElement;
	}

	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}

	@Override
	public NeoElementNode adaptAsNeoElementNode() throws InvalidityException {
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
		return Adaptionneo4jPackage.Literals.NEO_ELEMENT_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_ELEMENT_NODE__NEO_PLACE, oldNeoPlace, neoPlace));
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
	
	@Override
	public void setGraph(Graph newGraph) {
		super.setGraph(newGraph);
		createParameters();
	}
	
	//Since NeoLabel should be a Parameter
	/**
	 * @author Lukas Sebastian Hofmann
	 * 
	 */
	@Override
	public void createParameters() {
		if (getIncomingMapping() == null) {
			ParameterList pList = getParameterList();
			if (pList != null) {
				TextListParam labels = getNeoNodeLabels();
				if (labels == null) {
					labels = new TextListParamImpl();
					try {
						setNeoNodeLabels(labels);
					} catch (InvalidityException e) {
						throw new RuntimeException(PARAMETER_HAS_NOT_BEEN_CREATED_IN_NEO_ELEMENT_NODE, e);
					}
					pList.add(labels);	
				}
				if (!pList.equals(labels.getParameterList())) {
					pList.add(labels);
				}
			}
		}
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
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_ELEMENT_NODE__IS_VARIABLE_DISTINCT_IN_USE, oldIsVariableDistinctInUse, isVariableDistinctInUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextListParam getNeoNodeLabels() {
		if (neoNodeLabels != null && neoNodeLabels.eIsProxy()) {
			InternalEObject oldNeoNodeLabels = (InternalEObject)neoNodeLabels;
			neoNodeLabels = (TextListParam)eResolveProxy(oldNeoNodeLabels);
			if (neoNodeLabels != oldNeoNodeLabels) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Adaptionneo4jPackage.NEO_ELEMENT_NODE__NEO_NODE_LABELS, oldNeoNodeLabels, neoNodeLabels));
			}
		}
		return neoNodeLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextListParam basicGetNeoNodeLabels() {
		return neoNodeLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public void addNeoLabel(String label) throws InvalidityException {
		if (this.neoNodeLabels == null) {
			this.neoNodeLabels = new TextListParamImpl();
		}
		if (!this.neoNodeLabels.getValues().contains(label)) {
			if (label.contains(CypherSpecificConstants.ONE_WHITESPACE)) {
				throw new InvalidityException(A_LABEL_CAN_NOT_CONTAIN_WHITESPACE_S);
			}
			this.neoNodeLabels.addStringValue(label);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setNeoNodeLabels(TextListParam newNeoNodeLabels) throws InvalidityException {
		if (newNeoNodeLabels != null) {
			for (String value : newNeoNodeLabels.getValues()) { 
				checkForWhiteSpacesInLabel(value);
			}
		}
		
		TextListParam oldNeoNodeLabels = neoNodeLabels;
		neoNodeLabels = newNeoNodeLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_ELEMENT_NODE__NEO_NODE_LABELS, oldNeoNodeLabels, neoNodeLabels));
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param value
	 * @throws InvalidityException
	 * Checks if whitespace(s) are contained in the label.
	 */
	private void checkForWhiteSpacesInLabel(String value) throws InvalidityException {
		if (value.contains(CypherSpecificConstants.ONE_WHITESPACE)) {
			throw new InvalidityException(A_LABEL_CAN_NOT_CONTAIN_WHITESPACE_S);
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
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				return isIsVariableDistinctInUse();
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE__NEO_NODE_LABELS:
				if (resolve) return getNeoNodeLabels();
				return basicGetNeoNodeLabels();
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE__NEO_PLACE:
				return getNeoPlace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				setIsVariableDistinctInUse((Boolean)newValue);
				return;
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE__NEO_NODE_LABELS:
				try {
					setNeoNodeLabels((TextListParam)newValue);
				} catch (InvalidityException e) {
					throw new RuntimeException(e.getCause());
				}
				return;
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE__NEO_PLACE:
				setNeoPlace((NeoPlace)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				setIsVariableDistinctInUse(IS_VARIABLE_DISTINCT_IN_USE_EDEFAULT);
				return;
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE__NEO_NODE_LABELS:
				try {
					setNeoNodeLabels((TextListParam) null);
				} catch (InvalidityException e) {
					throw new RuntimeException(e.getCause());
				}
				return;
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE__NEO_PLACE:
				setNeoPlace(NEO_PLACE_EDEFAULT);
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
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				return isVariableDistinctInUse != IS_VARIABLE_DISTINCT_IN_USE_EDEFAULT;
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE__NEO_NODE_LABELS:
				return neoNodeLabels != null;
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE__NEO_PLACE:
				return neoPlace != NEO_PLACE_EDEFAULT;
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
				case Adaptionneo4jPackage.NEO_ELEMENT_NODE__IS_VARIABLE_DISTINCT_IN_USE: return Adaptionneo4jPackage.NEO_NODE__IS_VARIABLE_DISTINCT_IN_USE;
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
				case Adaptionneo4jPackage.NEO_NODE__IS_VARIABLE_DISTINCT_IN_USE: return Adaptionneo4jPackage.NEO_ELEMENT_NODE__IS_VARIABLE_DISTINCT_IN_USE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
				case Adaptionneo4jPackage.NEO_ELEMENT___GET_CYPHER_RETURN_VARIABLE: return Adaptionneo4jPackage.NEO_ELEMENT_NODE___GET_CYPHER_RETURN_VARIABLE;
				default: return -1;
			}
		}
		if (baseClass == NeoNode.class) {
			switch (baseOperationID) {
				case Adaptionneo4jPackage.NEO_NODE___GET_CYPHER_VARIABLE: return Adaptionneo4jPackage.NEO_ELEMENT_NODE___GET_CYPHER_VARIABLE;
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
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE___ADD_NEO_LABEL__STRING:
				try {
					addNeoLabel((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE___GET_CYPHER_VARIABLE:
				try {
					return getCypherVariable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE___GET_CYPHER_RETURN_VARIABLE:
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
	 * 		- neoPlace
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isVariableDistinctInUse: ");
		result.append(isVariableDistinctInUse);
		result.append(", neoPlace: ");
		result.append(neoPlace);
		result.append(')');
		return result.toString();
	}
} //NeoNodeImpl
