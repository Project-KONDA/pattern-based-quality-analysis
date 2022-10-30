/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.CypherSpecificConstants;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoComplexEdgeImpl#getNeoPathPart <em>Neo Path Part</em>}</li>
 * </ul>
 *
 * @generated
 */

public class NeoComplexEdgeImpl extends NeoPathPartImpl implements NeoComplexEdge {
	private static final String NOT_A_VALID_COMPLEX_EDGE = "Not a valid ComplexEdge";
	private static final String CLOSING_BRACKET = ")";
	private static final String OPENING_BRACKET = "(";
	private static final String NEO_COMPLEX_EDGE_S = "NeoComplexEdge [%s] ";
	private static final String CONTAINS_NOT_ENOUGH_NEO_PATH_PARTS = " contains not enough NeoPathParts";
	private static final String NEO_COMPLEX_PATH = "NeoComplexPath ";
	private static final String NEO_COMPLEX_PATH_CONTAINS_NOT_ENOUGH_NEO_PATH_PARTS = NEO_COMPLEX_PATH + "%s" + CONTAINS_NOT_ENOUGH_NEO_PATH_PARTS;
	private static final String TO_LESS_PRIMITIVE_EDGES_AT_LEAST_2 = NOT_A_VALID_COMPLEX_EDGE + " - To less Primitive Edges - At least 2";
	/**
	 * The cached value of the '{@link #getNeoPathPart() <em>Neo Path Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPathPart()
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
	
	@Override 
	public String generateCypher() throws InvalidityException {
		validateComplexEdge();
		String cypher = generateInternalCypher();			
		return cypher;
	}
	
	private String generateInternalCypher() throws InvalidityException {
		StringBuilder cypher = new StringBuilder();
		for(NeoPathPart part : getNeoPathPartEdgeLeafs()) {
			cypher.append(part.generateCypher());
		}
		return cypher.toString();
	}
	
	
	//GETS ALL INNER EDGES ALIASES 
	@Override
	public String getCypherVariable() throws InvalidityException {
		validateComplexEdge();
		
		StringBuilder variables = new StringBuilder();
		EList<NeoPathPart> neoPath = this.getNeoPathPartEdgeLeafs();
		for(NeoPathPart path : neoPath) {
			if (variables.length() != 0) variables.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACE); 
			variables.append(path.getCypherVariable());
		}
		return variables.toString();
	}
	
	
	/**
	 * <!-- begin-user-doc -->
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

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		try {
			validateComplexEdge();
			if (getNeoPathPart() == null)
				throw new RuntimeException();
		} catch (Exception e) {
			throw new InvalidityException(String.format(NEO_COMPLEX_PATH_CONTAINS_NOT_ENOUGH_NEO_PATH_PARTS, getId()));
		}
	}

	//Consider that all will be flatted to only non container will be returned... outsides there is no need for handling the NeoComplexEdge
	@Override
	public EList<NeoPathPart> getNeoPathPartEdgeLeafs() {
		EList<NeoPathPart> list = new BasicEList<NeoPathPart>();
		for(NeoPathPart neoPath : getNeoPathPart()) {
			if (neoPath != null && neoPath.getNeoPathPartEdgeLeafs() != null) {
				list.addAll(neoPath.getNeoPathPartEdgeLeafs());
			}
		}
		return list;
	}

	//The container just checks if enough elements are given to build a ComplexEdge
	protected void validateComplexEdge() throws InvalidityException {
		if (!(countOfEdges() >= 2) && (getNeoComplexEdge() == null) && getNeoComplexEdge() != this) {
			throw new InvalidityException(TO_LESS_PRIMITIVE_EDGES_AT_LEAST_2);
		}		
	}
	
	private void reorganiseLastEdgeFlagging() {
		final NeoComplexEdge neoComplexEdge = getHighestComplexEdge();
		final EList<NeoPathPart> parts = neoComplexEdge.getNeoPathPartEdgeLeafs();
		final NeoSimpleEdgeImpl lastEge = (NeoSimpleEdgeImpl) parts.get(parts.size() - 1);
		if (!lastEge.isLastEdge) {
			lastEge.setIsLastEdge(true);
		}
	}
	
	//Check if this really works
	//Sets the flag of LastEdge in Previews leave to false
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
	
	@Override
	protected boolean isLastEdge() {
		return false;
	}
	
	private int countOfEdges() {
		int count = 0;
		for (NeoPathPart part : getNeoPathPart()) {
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
				getNeoPathPart().add(neoPathPart);
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
	}

	@Override
	public NeoPathPart getNeoLastEdge() throws InvalidityException {
		validateComplexEdge();
		final EList<NeoPathPart> parts = getNeoPathPartEdgeLeafs();
		return parts.size() != 0 ? parts.get(parts.size() - 1) : null;
	}
	

	@Override
	public String myToString() {
		final String temp = NEO_COMPLEX_EDGE_S + OPENING_BRACKET;
		final StringBuilder result = new StringBuilder(String.format(temp, getId()));
		boolean isFirst = true;
		for (NeoPathPart part : getNeoPathPart()) {
			if (!isFirst) { //|| result.length() != String.format(temp, getId()).length()
				result.append(CypherSpecificConstants.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE);
			}
			result.append(part.myToString());
			isFirst = false;
		}
		result.append(CLOSING_BRACKET);
		return result.toString();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_COMPLEX_EDGE;
	}

	//Returns all NeoEdges... not only Leafs
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NeoPathPart> getNeoPathPart() {
		if (neoPathParts == null) {
			neoPathParts = new EObjectContainmentWithInverseEList<NeoPathPart>(NeoPathPart.class, this, AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE);
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART:
				return ((InternalEList<?>)getNeoPathPart()).basicRemove(otherEnd, msgs);
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART:
				return getNeoPathPart();
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART:
				getNeoPathPart().clear();
				getNeoPathPart().addAll((Collection<? extends NeoPathPart>)newValue);
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART:
				getNeoPathPart().clear();
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART:
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE___ADD_NEO_PATH_PART__NEOPATHPART:
				addNeoPathPart((NeoPathPart)arguments.get(0));
				return null;
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE___REMOVE_NEO_PATH_PART__NEOPATHPART:
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNeoPathPart()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	//For Counting the inner Edges
	private NeoComplexEdgeImpl getHighestComplexEdge() {
		NeoComplexEdge neoComplexEdge = this;
		while (neoComplexEdge.getNeoComplexEdge() != null) {
			neoComplexEdge = neoComplexEdge.getNeoComplexEdge();
		}
		return (NeoComplexEdgeImpl) neoComplexEdge;
	}
	
	//Check that no chain is build --> Or maybe needs not to be implemented?
	//For resetting the counting if a ComplexEdge has been created at the same time as an other Complex Edge but is in his container
	//Improve that the setNeoComplexEdge does not allow to set a NeoComplexEdge below or the same!
	@Override
	public void setNeoComplexEdge(NeoComplexEdge newNeoComplexEdge) {
		boolean isAHighLogicalContainer = true;
		//Maybe throw an Exception???
		//Checks if the newNeoComplexEdge is already in the Container-Structure
		if (getNeoComplexEdge() != null) {
			NeoComplexEdge neoComplexEdge = getNeoComplexEdge();
			while (neoComplexEdge != newNeoComplexEdge) {
				neoComplexEdge = neoComplexEdge.getNeoComplexEdge();
				if (neoComplexEdge == newNeoComplexEdge) {
					isAHighLogicalContainer = false;
				}
			}
		}
		if (isAHighLogicalContainer) {
			super.setNeoComplexEdge(newNeoComplexEdge);
			setCount(((NeoComplexEdgeImpl) newNeoComplexEdge).getCount());
			for (NeoPathPart part : getNeoPathPart()) {
				((NeoPathPartImpl) part).setCount(getCount());
			}
		}
	}
	
	//BEGIN - For counting the inner Edges
	protected InternalCount count = null;
	protected InternalCount getCount() {
		if (count == null) {
			count = createInternalCounter();
		}
		return count;
	}
	
	//Needs rework!!!
	protected void setCount(InternalCount count) {
		this.count = count;
	}
	
	//Add to AbstractNeoComplexEdge
	protected void setCount(InternalCount count, NeoComplexEdge neoComplexEdge) {
		this.count = count;
		for (NeoPathPart part : getNeoPathPart()) {
			if (part instanceof NeoComplexEdge) {
				((NeoComplexEdgeImpl) part).setCount(count, this);
			} else {
				((NeoPathPartImpl) part).setCount(count);
			}
		}
	}
	
	protected void unsetCount() {
		count = null;
	}
	
	private InternalCount createInternalCounter() {
		return new InternalCount();
	}
	
	protected final class InternalCount {
		int counter = -1; 
		private InternalCount() {
			super();
		}
		
		protected int getCount() {
			if (Integer.MAX_VALUE == counter)
				throw new IndexOutOfBoundsException("ComplexEdge" + getId() + "is to long");
			counter = counter + 1;
			return counter;
		}
	}
	//END - For counting the inner Edges
} //NeoComplexEdgeImpl
