/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
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
 * </ul>
 *
 * @generated
 */
public class NeoPropertyNodeImpl extends PrimitiveNodeImpl implements NeoPropertyNode {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoPropertyNodeImpl() {
		super();
	}
	
	@Override 
	public String generateCypher() throws InvalidityException {
		//Im Match von Cypher ein genauen Wert zuordnen) 
		//Umsetzung schauen 
		//The thing with the params
		
		
		return "";
		
		//has to be modified 
//		if (!(getIncoming().get(0) instanceof NeoPropertyEdge)) 
//			throw new InvalidityException("Incoming relation is no NeoEdge");
//		NeoPropertyEdge nae = (NeoPropertyEdge) getIncoming().get(0);
//		String propertyName = nae.getNeoPropertyPathParam().getNeoPropertyName().getValue();
//		
//		StringBuilder cypher = new StringBuilder();
//		try {
//				//In the case there is no NeoPath for further specification
//				if (nae.basicGetNeoPropertyPathParam().getNeoPath() == null) {
//					NeoNodeImpl nni = (NeoNodeImpl) getOriginalNode();
//					cypher.append(nni.getCypherVariable());
//				} else {
//					throw new InvalidityException("In NeoProperty went something wronge");
//				}
//		} catch (Exception e) {
//			throw new InvalidityException("In NeoProperty went something wronge");
//		}
//		cypher.append("." + propertyName);
//		return cypher.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCypherVariable() {
		try {
			return this.generateCypher();
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoPlaceOfNode(NeoPlace startNode) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
				case AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NODE_PLACE: return AdaptionNeo4JPackage.NEO_ABSTRACT_NODE__NODE_PLACE;
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
				case AdaptionNeo4JPackage.NEO_ABSTRACT_NODE__NODE_PLACE: return AdaptionNeo4JPackage.NEO_PROPERTY_NODE__NODE_PLACE;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NeoAbstractNode.class) {
			switch (baseOperationID) {
				case AdaptionNeo4JPackage.NEO_ABSTRACT_NODE___GET_CYPHER_VARIABLE: return AdaptionNeo4JPackage.NEO_PROPERTY_NODE___GET_CYPHER_VARIABLE;
				case AdaptionNeo4JPackage.NEO_ABSTRACT_NODE___SET_NEO_PLACE_OF_NODE__NEOPLACE: return AdaptionNeo4JPackage.NEO_PROPERTY_NODE___SET_NEO_PLACE_OF_NODE__NEOPLACE;
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE___GET_CYPHER_VARIABLE:
				return getCypherVariable();
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE___SET_NEO_PLACE_OF_NODE__NEOPLACE:
				setNeoPlaceOfNode((NeoPlace)arguments.get(0));
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
		result.append(" (nodePlace: ");
		result.append(nodePlace);
		result.append(')');
		return result.toString();
	}

} //NeoAttributeNodeImpl
