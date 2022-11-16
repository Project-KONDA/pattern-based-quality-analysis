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
import qualitypatternmodel.adaptionneo4j.NeoInterfaceNode;
import qualitypatternmodel.adaptionneo4j.NeoInterfaceElement;
import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoPathParam;
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
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoNodeImpl#isIsVariableDistinctInUse <em>Is Variable Distinct In Use</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoNodeImpl#getNeoNodeLabels <em>Neo Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoNodeImpl#getNeoPlace <em>Neo Place</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoNodeImpl extends ComplexNodeImpl implements NeoNode {
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
	protected NeoNodeImpl() {
		super();
	}

	@Override
	public String generateCypher() throws InvalidityException {
		//TODO --> Optimization --> Future Work
		if (getIncomingMapping() == null) {
			StringBuilder cypher = new StringBuilder();
			cypher.append("(");
			cypher.append(CypherSpecificConstants.VARIABLE_NODE);
			cypher.append(getOriginalID());
			TextListParam labels = this.getNeoNodeLabels();
			if((!translated)) { 
				if (getNeoNodeLabels() != null) {
					for (String label : labels.getValues()) {
						if (!label.isEmpty()) { 
							cypher.append(":");
							cypher.append(label);
						}
					}
				}
				//Wie komme ich an die Operator List
				//Graph g; 
				translated = true;
			}
			cypher.append(")");
			return cypher.toString();
		}
		return ((NeoNode) getOriginalNode()).generateCypher();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override 
	public String getCypherVariable() throws InvalidityException {
		if (getIncomingMapping() == null) {
			String var;
			var = CypherSpecificConstants.VARIABLE_NODE;
			var += getOriginalID();
			return var;
		}
		return ((NeoNode) getOriginalNode()).getCypherVariable();	
	}

	/**
	 * <!-- begin-user-doc -->
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
			returnElement.put(NeoNodeImpl.CYPHER_RETURN_ID, cypher);
		} else {
			returnElement = ((NeoNode) getOriginalNode()).getCypherReturnVariable();
		}
		return returnElement;
	}

	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}

	@Override
	public NeoNode adaptAsNeoNode() throws InvalidityException {
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
		return Adaptionneo4jPackage.Literals.NEO_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_NODE__NEO_PLACE, oldNeoPlace, neoPlace));
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
						// TODO Auto-generated catch block
						e.printStackTrace();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_NODE__IS_VARIABLE_DISTINCT_IN_USE, oldIsVariableDistinctInUse, isVariableDistinctInUse));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Adaptionneo4jPackage.NEO_NODE__NEO_NODE_LABELS, oldNeoNodeLabels, neoNodeLabels));
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
			if (label.contains(" ")) {
				throw new InvalidityException("Label can not contain Whitespace(s)");
			}
			this.neoNodeLabels.addStringValue(label);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void setNeoNodeLabels(TextListParam newNeoNodeLabels) throws InvalidityException {
		if (newNeoNodeLabels != null) {
			for (String value : newNeoNodeLabels.getValues()) { //Same has to be done for the other classes
				if (value.contains(CypherSpecificConstants.ONE_WHITESPACE)) { //--> The redunancy check is done in the TextListParam
					//However that would not be a problem in Neo4J (r:Action:Action) [multi times the same label]
					throw new InvalidityException("A Label can not contain Whitespace(s)");
				}
			}
		}
		TextListParam oldNeoNodeLabels = neoNodeLabels;
		neoNodeLabels = newNeoNodeLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_NODE__NEO_NODE_LABELS, oldNeoNodeLabels, neoNodeLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				return isIsVariableDistinctInUse();
			case Adaptionneo4jPackage.NEO_NODE__NEO_NODE_LABELS:
				if (resolve) return getNeoNodeLabels();
				return basicGetNeoNodeLabels();
			case Adaptionneo4jPackage.NEO_NODE__NEO_PLACE:
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
			case Adaptionneo4jPackage.NEO_NODE__NEO_PLACE:
				setNeoPlace((NeoPlace)newValue);
				return;
			case Adaptionneo4jPackage.NEO_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				setIsVariableDistinctInUse((Boolean)newValue);
				return;
			case Adaptionneo4jPackage.NEO_NODE__NEO_NODE_LABELS:
				try {
					setNeoNodeLabels((TextListParam)newValue);
				} catch (InvalidityException e) {
					throw new RuntimeException(e.getCause());
				}
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
			case Adaptionneo4jPackage.NEO_NODE__NEO_PLACE:
				setNeoPlace(NEO_PLACE_EDEFAULT);
				return;
			case Adaptionneo4jPackage.NEO_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				setIsVariableDistinctInUse(IS_VARIABLE_DISTINCT_IN_USE_EDEFAULT);
				return;
			case Adaptionneo4jPackage.NEO_NODE__NEO_NODE_LABELS:
				try {
					setNeoNodeLabels((TextListParam) null);
				} catch (InvalidityException e) {
					throw new RuntimeException(e.getCause());
				}
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
			case Adaptionneo4jPackage.NEO_NODE__IS_VARIABLE_DISTINCT_IN_USE:
				return isVariableDistinctInUse != IS_VARIABLE_DISTINCT_IN_USE_EDEFAULT;
			case Adaptionneo4jPackage.NEO_NODE__NEO_NODE_LABELS:
				return neoNodeLabels != null;
			case Adaptionneo4jPackage.NEO_NODE__NEO_PLACE:
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
		if (baseClass == NeoInterfaceElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NeoInterfaceNode.class) {
			switch (derivedFeatureID) {
				case Adaptionneo4jPackage.NEO_NODE__IS_VARIABLE_DISTINCT_IN_USE: return Adaptionneo4jPackage.NEO_INTERFACE_NODE__IS_VARIABLE_DISTINCT_IN_USE;
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
				case Adaptionneo4jPackage.NEO_INTERFACE_NODE__IS_VARIABLE_DISTINCT_IN_USE: return Adaptionneo4jPackage.NEO_NODE__IS_VARIABLE_DISTINCT_IN_USE;
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
		if (baseClass == NeoInterfaceElement.class) {
			switch (baseOperationID) {
				case Adaptionneo4jPackage.NEO_INTERFACE_ELEMENT___GET_CYPHER_RETURN_VARIABLE: return Adaptionneo4jPackage.NEO_NODE___GET_CYPHER_RETURN_VARIABLE;
				default: return -1;
			}
		}
		if (baseClass == NeoInterfaceNode.class) {
			switch (baseOperationID) {
				case Adaptionneo4jPackage.NEO_INTERFACE_NODE___GET_CYPHER_VARIABLE: return Adaptionneo4jPackage.NEO_NODE___GET_CYPHER_VARIABLE;
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
			case Adaptionneo4jPackage.NEO_NODE___ADD_NEO_LABEL__STRING:
				try {
					addNeoLabel((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_NODE___GET_CYPHER_VARIABLE:
				try {
					return getCypherVariable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_NODE___GET_CYPHER_RETURN_VARIABLE:
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
		result.append(" (isVariableDistinctInUse: ");
		result.append(isVariableDistinctInUse);
		result.append(", neoPlace: ");
		result.append(neoPlace);
		result.append(')');
		return result.toString();
	}
} //NeoNodeImpl
