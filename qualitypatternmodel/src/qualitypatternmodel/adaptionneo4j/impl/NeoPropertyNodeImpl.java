/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoElement;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.utility.ConstantsNeo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Attribute Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NeoPropertyNodeImpl extends PrimitiveNodeImpl implements NeoPropertyNode {
	private static final int CYPHER_RETURN_ID = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoPropertyNodeImpl() {
		super();
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws
	 * This method should not be called for the Pattern Matching of the MATCH-Clause.
	 * The query part is generated via the NeoPropertyEdge.
	 */
	@Override
	public String generateCypher() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Generates a EList of all properties which can be addressed. Gets the first Property Address from morphed graph NeoPropertyEdge.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> generateCypherPropertyAddressing() throws InvalidityException {
		final EList<String> cypherResult = new BasicEList<String>();
		NeoPropertyEdge neoPropertyEdge = null;
		for (Relation r : getIncoming()) {
			neoPropertyEdge = (NeoPropertyEdge) r;
			cypherResult.add(neoPropertyEdge.generateCypherPropertyAddressing());

		}
		return cypherResult;
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
		final StringBuilder cypher = new StringBuilder();
		NeoPropertyEdgeImpl neoPropertyEdge = null;
		for (Relation r : getIncoming()) {
			neoPropertyEdge = (NeoPropertyEdgeImpl) r;
			if (cypher.length() != 0) {
				cypher.append(ConstantsNeo.SEPERATOR);
			}
			cypher.append(neoPropertyEdge.getCypherNodeVariable());
		}
		return cypher.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * This method returns the Property-Addressing of all NeoPropertyNode-Names.
	 * The implicit Nodes have no further value for the NeoPropertyNode in the current stage of the approach.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EMap<Integer, String> getCypherReturn() throws InvalidityException {
		final EMap<Integer, String> returnElement = new BasicEMap<Integer, String>();
		final String[] temp = (String[]) generateCypherPropertyAddressing().toArray(String[]::new);
		final StringBuilder cypher = new StringBuilder();
		for (String s : temp) {
			cypher.append(s + ConstantsNeo.CYPHER_SEPERATOR + ConstantsNeo.ONE_WHITESPACE);
		}
		//Removes the last CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.CYPHER_SEPERATOR
		//Otherwise redundancy in separators can be produced
		cypher.replace(cypher.length() - 2, cypher.length(), new String());
		returnElement.put(NeoPropertyNodeImpl.CYPHER_RETURN_ID, cypher.toString());
		return returnElement;
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
	public void checkGeneric() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}

	@Override
	public PrimitiveNode makePrimitive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}

	@Override
	public void checkPrimitive() throws InvalidityException{
		throw new InvalidityException("This node can not become generic!");
	}

	@Override
	public void createParameters() {
//		ParameterList pList = getParameterList();
//		if (pList != null) {
//		}
	}

	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = super.getAllParameters();
//		res.add();
		return res;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == NeoElement.class) {
			switch (baseOperationID) {
				case Adaptionneo4jPackage.NEO_ELEMENT___GET_CYPHER_RETURN: return Adaptionneo4jPackage.NEO_PROPERTY_NODE___GET_CYPHER_RETURN;
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
			case Adaptionneo4jPackage.NEO_PROPERTY_NODE___GET_CYPHER_RETURN:
				try {
					return getCypherReturn();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //NeoAttributeNodeImpl
