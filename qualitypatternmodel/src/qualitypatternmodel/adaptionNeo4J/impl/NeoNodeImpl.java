/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractNode;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.impl.ComplexNodeImpl;
import qualitypatternmodel.parameters.TextListParam;
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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getNodePlace <em>Node Place</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getNeoNodeLabels <em>Neo Node Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoNodeImpl extends ComplexNodeImpl implements NeoNode {
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
	 * The cached value of the '{@link #getNeoNodeLabels() <em>Neo Node Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoNodeLabels()
	 * @generated
	 * @ordered
	 */
	protected TextListParam neoNodeLabels;
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
		//TODO --> Optimization
		
		StringBuilder cypher = new StringBuilder();
		cypher.append("(");
		cypher.append(CypherSpecificConstants.VARIABLE_NODE);
		cypher.append(getOriginalID());
		TextListParam labels = this.getNeoNodeLabels();
		//prüft ob es eine original node
		//Falls es original dann labels
		//TODO Auch für Edge einfügen
		if((!translated) && getIncomingMapping() == null) { 
			if (getNeoNodeLabels() != null) {
				for (String label : labels.getValues()) {
					cypher.append(":");
					cypher.append(label);
				}
			}
				
			
			//Wie komme ich an die Operator List
			Graph g; 
			
			
			
			translated = true;
		}
		cypher.append(")");
		return cypher.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override 
	public String getCypherVariable() {
		String var;
		var = CypherSpecificConstants.VARIABLE_NODE;
		var += getOriginalID();
		return var;
	}

	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
		return AdaptionNeo4JPackage.Literals.NEO_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_NODE__NODE_PLACE, oldNodePlace, nodePlace));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_NODE__NEO_NODE_LABELS, oldNeoNodeLabels, neoNodeLabels));
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
	 * @generated
	 */
	@Override
	public void setNeoNodeLabels(TextListParam newNeoNodeLabels) {
		TextListParam oldNeoNodeLabels = neoNodeLabels;
		neoNodeLabels = newNeoNodeLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_NODE__NEO_NODE_LABELS, oldNeoNodeLabels, neoNodeLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_NODE__NODE_PLACE:
				return getNodePlace();
			case AdaptionNeo4JPackage.NEO_NODE__NEO_NODE_LABELS:
				if (resolve) return getNeoNodeLabels();
				return basicGetNeoNodeLabels();
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
			case AdaptionNeo4JPackage.NEO_NODE__NODE_PLACE:
				setNodePlace((NeoPlace)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__NEO_NODE_LABELS:
				setNeoNodeLabels((TextListParam)newValue);
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
			case AdaptionNeo4JPackage.NEO_NODE__NODE_PLACE:
				setNodePlace(NODE_PLACE_EDEFAULT);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__NEO_NODE_LABELS:
				setNeoNodeLabels((TextListParam)null);
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
			case AdaptionNeo4JPackage.NEO_NODE__NODE_PLACE:
				return nodePlace != NODE_PLACE_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_NODE__NEO_NODE_LABELS:
				return neoNodeLabels != null;
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
		if (baseClass == NeoAbstractNode.class) {
			switch (derivedFeatureID) {
				case AdaptionNeo4JPackage.NEO_NODE__NODE_PLACE: return AdaptionNeo4JPackage.NEO_ABSTRACT_NODE__NODE_PLACE;
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
		if (baseClass == NeoAbstractNode.class) {
			switch (baseFeatureID) {
				case AdaptionNeo4JPackage.NEO_ABSTRACT_NODE__NODE_PLACE: return AdaptionNeo4JPackage.NEO_NODE__NODE_PLACE;
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
		if (baseClass == NeoAbstractNode.class) {
			switch (baseOperationID) {
				case AdaptionNeo4JPackage.NEO_ABSTRACT_NODE___GET_CYPHER_VARIABLE: return AdaptionNeo4JPackage.NEO_NODE___GET_CYPHER_VARIABLE;
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
			case AdaptionNeo4JPackage.NEO_NODE___GET_CYPHER_VARIABLE:
				return getCypherVariable();
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
		result.append(')');
		return result.toString();
	}
} //NeoNodeImpl
