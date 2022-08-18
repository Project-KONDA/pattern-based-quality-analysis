/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;

import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Path Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NeoPathPartImpl extends PatternElementImpl implements NeoPathPart {
	
	//BEGIN -- For Counting the Edges for the nameing in Neo4J
	protected static final int COUNTER_EDEFAULT = 0;
	protected static int COUNTER = NeoPathPartImpl.COUNTER_EDEFAULT;
	//protected static List<NeoSimpleEdgeImpl> EDGES = new ArrayList<>();
	//END -- For Counting the Edges for the nameing in Neo4J

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoPathPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_PATH_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NeoSimpleEdge> getSimpleEdges() {
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
	public String getCypherVariable() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionNeo4JPackage.NEO_PATH_PART___GET_SIMPLE_EDGES:
				return getSimpleEdges();
			case AdaptionNeo4JPackage.NEO_PATH_PART___GET_CYPHER_VARIABLE:
				return getCypherVariable();
		}
		return super.eInvoke(operationID, arguments);
	}
	
	
	
	//BEGIN -- COUNTER METHODS
	public void unsetCOUNTER() {
		NeoPathPartImpl.COUNTER = NeoPathPartImpl.COUNTER_EDEFAULT;
	}
	
	protected int getCOUNTER() {
		return NeoPathPartImpl.COUNTER;
	}
	
	protected void setCOUNTER(int newCOUNTER) {
		NeoPathPartImpl.COUNTER = newCOUNTER;
	}
	
	protected void increaseClassCounter() {
		if (NeoPathPartImpl.COUNTER == Integer.MAX_VALUE) {
			System.out.println("No new NeoEdges can be created. First delete some of your existing eges!");
			return;
		}
		NeoPathPartImpl.COUNTER++;
	}
	
//	protected void fillTheGapWithLastElement(NeoSimpleEdgeImpl edgeRemove) {
//		int ix = NeoPathPartImpl.EDGES.indexOf(edgeRemove);
//		int edgeCounterNumber = NeoPathPartImpl.EDGES.get(ix).getEdgeNumber();
//		if (ix != (NeoPathPartImpl.EDGES.size() - 1)) {
//			NeoPathPartImpl.EDGES.set(ix, NeoPathPartImpl.EDGES.get((NeoPathPartImpl.EDGES.size() - 1)));
//			NeoPathPartImpl.EDGES.get(ix).setEdgeNumber(edgeCounterNumber);
//		} else {
//			NeoPathPartImpl.EDGES.remove(edgeRemove);
//		}
//	}
	//END
} //NeoPathPartImpl
