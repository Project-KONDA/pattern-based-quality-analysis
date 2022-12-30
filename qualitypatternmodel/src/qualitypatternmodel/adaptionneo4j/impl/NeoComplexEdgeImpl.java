/**
 */
package qualitypatternmodel.adaptionneo4j.impl;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.CypherSpecificConstants;
import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoComplexEdgeImpl#getNeoPathParts <em>Neo Path Parts</em>}</li>
 * </ul>
 *
 * @generated
 */

public class NeoComplexEdgeImpl extends NeoPathPartImpl implements NeoComplexEdge {
	private static final String NOT_A_VALID_COMPLEX_EDGE = "Not a valid ComplexEdge";
	private static final String NEO_COMPLEX_EDGE_S = "NeoComplexEdge [%s] ";
	private static final String CONTAINS_NOT_ENOUGH_NEO_PATH_PARTS = " contains not enough NeoPathParts";
	private static final String NEO_COMPLEX_PATH = "NeoComplexPath ";
	private static final String NEO_COMPLEX_PATH_CONTAINS_NOT_ENOUGH_NEO_PATH_PARTS = NEO_COMPLEX_PATH + "%s" + CONTAINS_NOT_ENOUGH_NEO_PATH_PARTS;
	private static final String TO_LESS_PRIMITIVE_EDGES_AT_LEAST_2 = NOT_A_VALID_COMPLEX_EDGE + " - To less Primitive Edges - At least 2";
	/**
	 * The cached value of the '{@link #getNeoPathParts() <em>Neo Path Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPathParts()
	 * @generated
	 * @ordered
	 */
	protected EList<NeoPathPart> neoPathParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoComplexEdgeImpl() {
		super();
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @exception InvalidityException
	 * Checks and builds the internal Cypher Edge.
	 * Then it returns the internal Cypher Edge between two Nodes.
	 * 
	 */
	@Override 
	public String generateCypher() throws InvalidityException {
		validateComplexEdge();
		String cypher = generateInternalCypher();			
		return cypher;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String 
	 * @throws InvalidityException
	 * It builds internally the Cypher edge contained in the NeoComplexEdge.
	 */
	private final String generateInternalCypher() throws InvalidityException {
		final StringBuilder cypher = new StringBuilder();
		for(NeoPathPart part : getNeoPathPartEdgeLeafs()) {
			cypher.append(part.generateCypher());
		}
		return cypher.toString();
	}
	//GETS ALL INNER EDGES ALIASES 

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * This methods gets all inner edge alias aka Variables used.
	 * Furthermore it checks if the structure if the NeoComplexEdge is correct.
	 */
	@Override
	public String getCypherVariable() throws InvalidityException {
		validateComplexEdge();
		
		final StringBuilder variables = new StringBuilder();
		final EList<NeoPathPart> neoPath = this.getNeoPathPartEdgeLeafs();
		for(NeoPathPart path : neoPath) {
			if (variables.length() != 0) variables.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACE); 
			variables.append(path.getCypherVariable());
		}
		return variables.toString();
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * Returns the inner edge Nodes. In contary to the getCypherVariable this Method is used to return the Variables for the Return format. 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCypherInnerEdgeNodes(boolean isReturn) throws InvalidityException {
		validateComplexEdge();
		
		StringBuilder cypher = new StringBuilder();
		String innerEdgeNode;
		for (NeoPathPart part : getNeoPathPartEdgeLeafs()) {
			innerEdgeNode = part.getCypherInnerEdgeNodes(isReturn);
			if (innerEdgeNode != null) {
				if (innerEdgeNode.contains(CypherSpecificConstants.INTERNAL_EDGE_NODE)) {
					if (cypher.length() != 0) {
						cypher.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACE);
					}
					cypher.append(innerEdgeNode);
				}
			}
		}
		return cypher.toString();
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException, OperatorCycleException, MissingPatternContainerException
	 * Checks if the NeoComplexEdge is locally valid.
	 */
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		try {
			validateComplexEdge();
			if (getNeoPathParts() == null)
				throw new RuntimeException();
		} catch (Exception e) {
			throw new InvalidityException(String.format(NEO_COMPLEX_PATH_CONTAINS_NOT_ENOUGH_NEO_PATH_PARTS, getId()));
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return EList<NeoPathPart>
	 * Flattens the container and just returns the leaf elements.
	 */
	@Override
	public EList<NeoPathPart> getNeoPathPartEdgeLeafs() {
		EList<NeoPathPart> list = new BasicEList<NeoPathPart>();
		for(NeoPathPart neoPath : getNeoPathParts()) {
			if (neoPath != null && neoPath.getNeoPathPartEdgeLeafs() != null) {
				list.addAll(neoPath.getNeoPathPartEdgeLeafs());
			}
		}
		return list;
	}

	//The container just checks if enough elements are given to build a ComplexEdge
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * The container checks if enough elements are given to build a ComplexEdge.
	 * Thus it will be checked if the NeoComplexEdge has the correct amount of NeoSimpleEdges. 
	 */
	protected void validateComplexEdge() throws InvalidityException {
		if (!(countOfEdges() >= 2) && (getNeoComplexEdge() == null) && getNeoComplexEdge() != this) {
			throw new InvalidityException(TO_LESS_PRIMITIVE_EDGES_AT_LEAST_2);
		}		
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * Reorganises the flag of the last edge since it will be handled automatically. 
	 */
	private void reorganiseLastEdgeFlagging() {
		final NeoComplexEdge neoComplexEdge = getHighestComplexEdge();
		final EList<NeoPathPart> parts = neoComplexEdge.getNeoPathPartEdgeLeafs();
		final NeoSimpleEdgeImpl lastEge = (NeoSimpleEdgeImpl) parts.get(parts.size() - 1);
		if (!lastEge.isLastEdge) {
			lastEge.setIsLastEdge(true);
		}
	}
		
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param neoPathPart
	 * Checks if a NeoPathPart is a last Edge.
	 * If it is the last Edge (which just can be leafs) it will set the flag to true.
	 * Furthermore the previews last edge will be flagged not as last edge.
	 */
	private void checkAndSetIfIsLastEdge (NeoPathPart neoPathPart) {
		final NeoComplexEdge neoComplexEdge = getHighestComplexEdge();
		final EList<NeoPathPart> l = neoComplexEdge.getNeoPathPartEdgeLeafs();
		if (neoPathPart instanceof NeoSimpleEdge) {
			final int ix = l.indexOf(neoPathPart); //Check what happens if not contained - how to behavour?
			final int listSize = l.size();
			NeoSimpleEdgeImpl neoSimpleEdgeImpl = null;
			if (ix == listSize -1) {
				if (listSize > 1) {
					neoSimpleEdgeImpl = (NeoSimpleEdgeImpl) l.get(listSize - 2);
					neoSimpleEdgeImpl.setIsLastEdge(false);
				}
			} else {
				neoSimpleEdgeImpl = (NeoSimpleEdgeImpl) neoPathPart;
				neoSimpleEdgeImpl.setIsLastEdge(false);
			}
		}
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * A NeoComplexeEdge can not be a last edge. 
	 */
	@Override
	protected boolean isLastEdge() {
		return false;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return int.class
	 * This method returns the count for an edge. It consideres the whole composite structure.
	 */
	private int countOfEdges() {
		int count = 0;
		for (NeoPathPart part : getNeoPathParts()) {
			if (part instanceof NeoComplexEdge) {
				count += ((NeoComplexEdgeImpl) part).countOfEdges();
			} else {
				count++;
			}
		}
		return count;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addNeoPathPart(NeoPathPart neoPathPart) {
		if (neoPathPart != null) {
			if (neoPathPart != null) {
				getNeoPathParts().add(neoPathPart);
				if (getNeoComplexEdge() != null) {
					((NeoPathPartImpl) neoPathPart).setCount(this.getHighestComplexEdge().getCount());
				} else if(neoPathPart instanceof NeoComplexEdge) {
					((NeoComplexEdgeImpl) neoPathPart).setCount(getCount(), this);
				} else {
					((NeoPathPartImpl) neoPathPart).setCount(getCount());
					checkAndSetIfIsLastEdge(neoPathPart);
				}
			}
			
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void removeNeoPathPart(NeoPathPart neoPathPart) {
		this.neoPathParts.remove(neoPathPart);
		this.reorganiseLastEdgeFlagging();
		if (neoPathPart instanceof NeoComplexEdge) {
			reogranizeCounting();
		}
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * This method reorganizes the counting starting by the highest Container.
	 * For all subcontainers it changes the setting as well. 
	 */
	private void reogranizeCounting() {
		NeoComplexEdgeImpl highest = getHighestComplexEdge();
		highest.unsetCount();
		createInternalCounter();
		for (NeoPathPart part : getNeoPathParts()) {
			((NeoPathPartImpl)part).setCount(getCount());
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @exception InvalidityException
	 * Retrieves the last Edge in the container structure. 
	 * The last edge can not be an instance of a container structure.
	 * It validates the container structure before it returns the last edge.
	 */
	@Override
	public NeoPathPart getNeoLastEdge() throws InvalidityException {
		validateComplexEdge();
		final EList<NeoPathPart> parts = getNeoPathPartEdgeLeafs();
		return parts.size() != 0 ? parts.get(parts.size() - 1) : null;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann 
	 * @return String
	 * Builds the myString for the NeoComplexEdge. Used for printing the reporting.
	 */
	@Override
	public String myToString() {
		final String temp = NEO_COMPLEX_EDGE_S + CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET;
		final StringBuilder result = new StringBuilder(String.format(temp, getId()));
		boolean isFirst = true;
		for (NeoPathPart part : getNeoPathParts()) {
			if (!isFirst) {
				result.append(CypherSpecificConstants.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE);
			}
			result.append(part.myToString());
			isFirst = false;
		}
		result.append(CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_COMPLEX_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NeoPathPart> getNeoPathParts() {
		if (neoPathParts == null) {
			neoPathParts = new EObjectContainmentWithInverseEList<NeoPathPart>(NeoPathPart.class, this, Adaptionneo4jPackage.NEO_COMPLEX_EDGE__NEO_PATH_PARTS, Adaptionneo4jPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE);
		}
		return neoPathParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_COMPLEX_EDGE__NEO_PATH_PARTS:
				return ((InternalEList<?>)getNeoPathParts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_COMPLEX_EDGE__NEO_PATH_PARTS:
				return getNeoPathParts();
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
			case Adaptionneo4jPackage.NEO_COMPLEX_EDGE__NEO_PATH_PARTS:
				getNeoPathParts().clear();
				getNeoPathParts().addAll((Collection<? extends NeoPathPart>)newValue);
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
			case Adaptionneo4jPackage.NEO_COMPLEX_EDGE__NEO_PATH_PARTS:
				getNeoPathParts().clear();
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
			case Adaptionneo4jPackage.NEO_COMPLEX_EDGE__NEO_PATH_PARTS:
				return neoPathParts != null && !neoPathParts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Adaptionneo4jPackage.NEO_COMPLEX_EDGE___ADD_NEO_PATH_PART__NEOPATHPART:
				addNeoPathPart((NeoPathPart)arguments.get(0));
				return null;
			case Adaptionneo4jPackage.NEO_COMPLEX_EDGE___REMOVE_NEO_PATH_PART__NEOPATHPART:
				removeNeoPathPart((NeoPathPart)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_COMPLEX_EDGE__NEO_PATH_PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNeoPathParts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return
	 * This method returns the highest container in the composite-structure.
	 * Primarily used for counting the inner edges.
	 */
	private NeoComplexEdgeImpl getHighestComplexEdge() {
		NeoComplexEdge neoComplexEdge = this;
		while (neoComplexEdge.getNeoComplexEdge() != null) {
			neoComplexEdge = neoComplexEdge.getNeoComplexEdge();
		}
		return (NeoComplexEdgeImpl) neoComplexEdge;
	}
	
	//For resetting the counting if a ComplexEdge has been created at the same time as an other Complex Edge but is in his container --> handlet by EMF
	//Improve that the setNeoComplexEdge does not allow to set a NeoComplexEdge below or the same! --> handlet by EMF
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * This method sets the regarding NeoComplexEdge of a higher level.
	 */
	@Override
	public void setNeoComplexEdge(NeoComplexEdge newNeoComplexEdge) {
		super.setNeoComplexEdge(newNeoComplexEdge);
		setCount(getHighestComplexEdge().getCount());
		for (NeoPathPart part : getNeoPathParts()) {
			((NeoPathPartImpl) part).setCount(getCount());
		}
	}
	
	//BEGIN - For counting the inner Edges
	protected InternalCount count = null;
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return InternalCount
	 * Get the internal counter for the Counting of the Edges.
	 */
	protected InternalCount getCount() {
		if (count == null) {
			count = createInternalCounter();
		}
		return count;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * Sets the counter for the Counting of the Edges.
	 */
	protected void setCount(InternalCount count) {
		this.count = count;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * Sets the counter for every element in a NeoComplexEdge for the Counting of the Edges.
	 */
	protected void setCount(InternalCount count, NeoComplexEdge neoComplexEdge) {
		this.count = count;
		for (NeoPathPart part : getNeoPathParts()) {
			if (part instanceof NeoComplexEdge) {
				((NeoComplexEdgeImpl) part).setCount(count, this);
			} else {
				((NeoPathPartImpl) part).setCount(count);
			}
		}
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * Unsets the Counter for innerEdge counting.
	 */
	protected void unsetCount() {
		count = null;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return InternalCount
	 * Creates the internal Counter.
	 */
	private InternalCount createInternalCounter() {
		return new InternalCount();
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 *	This inner class provides the functionalities for the innerEdge counting. 
	 */
	protected final class InternalCount {
		int counter = -1; 
		private InternalCount() {
			super();
		}
		
		/**
		 * @author Lukas Sebastian Hofmann
		 * @return int.class
		 * Returns the count for the class InternalCount
		 */
		protected int getCount() {
			if (Integer.MAX_VALUE == counter)
				throw new IndexOutOfBoundsException("ComplexEdge" + getId() + "is to long");
			counter = counter + 1;
			return counter;
		}
	}
	//END - For counting the inner Edges
} //NeoComplexEdgeImpl
