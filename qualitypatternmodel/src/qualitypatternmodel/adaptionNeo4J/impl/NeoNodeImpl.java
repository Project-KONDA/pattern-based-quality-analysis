/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import qualitypatternmodel.adaptionNeo4J.AbstractNeoNode;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoLabel;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.impl.ComplexNodeImpl;
import qualitypatternmodel.parameters.TextLiteralParam;
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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getNodeLabels <em>Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoNodeImpl#getNeoNeoLabels <em>Neo Neo Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoNodeImpl extends ComplexNodeImpl implements NeoNode {
	/**
	 * The cached value of the '{@link #getNodeLabels() <em>Node Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<TextLiteralParam> nodeLabels;
	/**
	 * The cached value of the '{@link #getNeoNeoLabels() <em>Neo Neo Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoNeoLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<NeoLabel> neoNeoLabels;

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
		StringBuilder cypher = new StringBuilder();
		cypher.append("(");
		cypher.append(CypherSpecificConstants.VARIABLE_NODE);
		cypher.append(getOriginalID());
		EList<NeoLabel> labels = getNeoNeoLabels();
		for (int i = 0; i < labels.size(); i++) {
			cypher.append(labels.get(i).generateCypher());
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
	public EList<NeoLabel> getNeoNeoLabels() {
		if (neoNeoLabels == null) {
			neoNeoLabels = new EObjectResolvingEList<NeoLabel>(NeoLabel.class, this, AdaptionNeo4JPackage.NEO_NODE__NEO_NEO_LABELS);
		}
		return neoNeoLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_NODE__NODE_LABELS:
				return getNodeLabels();
			case AdaptionNeo4JPackage.NEO_NODE__NEO_NEO_LABELS:
				return getNeoNeoLabels();
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
			case AdaptionNeo4JPackage.NEO_NODE__NODE_LABELS:
				getNodeLabels().clear();
				getNodeLabels().addAll((Collection<? extends TextLiteralParam>)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_NODE__NEO_NEO_LABELS:
				getNeoNeoLabels().clear();
				getNeoNeoLabels().addAll((Collection<? extends NeoLabel>)newValue);
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
			case AdaptionNeo4JPackage.NEO_NODE__NODE_LABELS:
				getNodeLabels().clear();
				return;
			case AdaptionNeo4JPackage.NEO_NODE__NEO_NEO_LABELS:
				getNeoNeoLabels().clear();
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
			case AdaptionNeo4JPackage.NEO_NODE__NODE_LABELS:
				return nodeLabels != null && !nodeLabels.isEmpty();
			case AdaptionNeo4JPackage.NEO_NODE__NEO_NEO_LABELS:
				return neoNeoLabels != null && !neoNeoLabels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AbstractNeoNode.class) {
			switch (baseOperationID) {
				case AdaptionNeo4JPackage.ABSTRACT_NEO_NODE___GET_CYPHER_VARIABLE: return AdaptionNeo4JPackage.NEO_NODE___GET_CYPHER_VARIABLE;
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

	@Override
	public EList<TextLiteralParam> getNodeLabels() {
		// TODO Auto-generated method stub
		return null;
	}

} //NeoNodeImpl
