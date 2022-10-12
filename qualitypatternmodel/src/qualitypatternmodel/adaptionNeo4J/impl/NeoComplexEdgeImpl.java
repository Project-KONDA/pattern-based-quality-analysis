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
import qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
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
	private static final String THE_LAST_EDGE_IS_NOT_AT_THE_END = "The Last Edge is not at the End";
	private static final String HAS_TO_MANY_LAST_EDGES_MAX_1 = "Has to many Last Edges - Max. 1";
	private static final String TO_LESS_PRIMITIVE_EDGES_AT_LEAST_2 = "To less Primitive Edges - At least 2";
	/**
	 * The cached value of the '{@link #getNeoPathPart() <em>Neo Path Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPathPart()
	 * @generated
	 * @ordered
	 */
	protected EList<NeoPathPart> neoPathPart;

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
		for(NeoPathPart part : getNeoPathPartEdges()) {
			cypher.append(part.generateCypher());
		}
		return cypher.toString();
	}
	
	//GETS ALL INNER EDGES ALIASES 
	@Override
	public String getCypherVariable() {
		try {
			validateComplexEdge();
			StringBuilder variables = new StringBuilder();
			EList<NeoPathPart> neoPath = this.getNeoPathPartEdges();
			for(NeoPathPart path : neoPath) {
				if (variables.length() != 0) variables.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACES); 
				variables.append(path.getCypherVariable());
			}
			return variables.toString();
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	
	//DO I NEED THE DIFFRENCE BETWEEN THIS TO METHODS?
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
		for (NeoPathPart part : getNeoPathPartEdges()) {
			innerEdgeNode = part.getCypherInnerEdgeNodes(isReturn);
			if (innerEdgeNode != null) {
				if (innerEdgeNode.contains(CypherSpecificConstants.INTERNAL_EDGE_NODE)) {
					if (cypher.length() != 0) {
						cypher.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACES);
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
		} catch (Exception e) {
			throw new InvalidityException("NeoComplexPath " + getId() + " contains not enough NeoPathParts");
		}
		if (getNeoPathPart() == null)
			throw new InvalidityException("NeoComplexPath " + getId() + " contains not enough NeoPathParts");
	}

	//Consider that all will be flatted to only non container will be returned... outsides there is no need for handling the NeoComplexEdge
	@Override
	public EList<NeoPathPart> getNeoPathPartEdges() {
		EList<NeoPathPart> list = new BasicEList<NeoPathPart>();
		for(NeoPathPart neoPath : getNeoPathPart()) {
			list.addAll(neoPath.getNeoPathPartEdges());
		}
		return list;
	}

	//The container just checks if enough elements are given to build a ComplexEdge
	@Override
	public void validateComplexEdge() throws InvalidityException {
		if (getNeoPathPart().size() != 0 || !(getNeoComplexEdge() == null)) {
			if (!(countOfEdges() >= 2) && (getNeoComplexEdge() == null)) {
				throw new InvalidityException(TO_LESS_PRIMITIVE_EDGES_AT_LEAST_2);
			}
			if (hasMultipleLastEdges()) {
				throw new InvalidityException(HAS_TO_MANY_LAST_EDGES_MAX_1);
			}
			if (!isLastEdgeAtTheEnd()) {
				throw new InvalidityException(THE_LAST_EDGE_IS_NOT_AT_THE_END);
			}
		}
		throw new InvalidityException();
	}
	
	private void setLastEdgeInAllLeaves(boolean isLastEdge) {
		NeoSimpleEdgeImpl neoSimpleEdge = null;
		for (NeoPathPart part : getNeoPathPartEdges()) {
			neoSimpleEdge = (NeoSimpleEdgeImpl) part;
			neoSimpleEdge.setIsLastEdge(isLastEdge);
		}
	}
	
	private boolean isLastEdgeAtTheEnd() {
		final EList<NeoPathPart> neoParts = getNeoPathPart();
		boolean isLastEdgeCorrect = true;
		NeoPathPart neoPart;
		for (int i = (neoParts.size() - 1); i >= 0; i--) {
			neoPart = neoParts.get(i);
			if (neoPart instanceof NeoComplexEdge) {
				((NeoComplexEdgeImpl) neoPart).isLastEdgeAtTheEnd();
			} else {
				if (neoPart.isLastEdge()) {
					if (!(i == (neoParts.size() - 1))) {
						isLastEdgeCorrect = false;
					}
				}
			}
		}
		return isLastEdgeCorrect;
	}
	
	private boolean hasMultipleLastEdges() {
		final EList<NeoPathPart> neoParts = getNeoPathPart();
		boolean multiLastEdges = false;
		int lastEdges = 0;
		for (NeoPathPart neoPart : neoParts) {
			if (neoPart instanceof NeoComplexEdge) {
				lastEdges += ((NeoComplexEdgeImpl) neoPart).countLastEdgesInSubStructure();
			} else if (neoPart.isLastEdge()) {
				lastEdges++;
			}
		}
		if (lastEdges > 1) {
			multiLastEdges = true;
		}
		return multiLastEdges;		
	}
	
	private int countLastEdgesInSubStructure() {
		final EList<NeoPathPart> neoParts = getNeoPathPart();
		int lastEdges = 0;
		for (NeoPathPart neoPart : neoParts) {
			if (neoPart instanceof NeoComplexEdge) {
				lastEdges += ((NeoComplexEdgeImpl) neoPart).countLastEdgesInSubStructure();
			} else if (neoPart.isLastEdge()) {
				lastEdges++;
			}
		}
		return lastEdges;
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

	//Get's all NeoPartsParts
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addNeoPathPart(NeoPathPart neoPathPart) {
		setLastEdgeInAllLeaves(false);
		if (neoPathPart != null) {
			getNeoPathPart().add(neoPathPart);
			if (getNeoComplexEdge() != null) {
				((NeoPathPartImpl) neoPathPart).setCount(this.getHighestComplexEdge().getCount());
			} else if(neoPathPart instanceof NeoComplexEdgeImpl) {
				((NeoComplexEdgeImpl) neoPathPart).setCount(getCount(), this);
			} else {
				((NeoPathPartImpl) neoPathPart).setCount(getCount());
			}
		}
	}
	
	@Override
	public NeoPathPart getNeoLastEdge() throws InvalidityException {
		validateComplexEdge();
		final EList<NeoPathPart> parts = getNeoPathPartEdges();
		return parts.size() != 0 ? parts.get(parts.size() - 1) : null;
	}
	

	@Override
	public String myToString() {
		String result = "NeoComplexEdge [" + getId() + "] (";
		int i = 0;
		for (NeoPathPart part : getNeoPathPart()) {
			if (i > 0)
				result += ", ";
			result += part.myToString();
			i++;
		}
		result += ")";
		return result;
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

	//Returns all NeoEdges... not one Leafs
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NeoPathPart> getNeoPathPart() {
		if (neoPathPart == null) {
			neoPathPart = new EObjectContainmentWithInverseEList<NeoPathPart>(NeoPathPart.class, this, AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE);
		}
		return neoPathPart;
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
				return neoPathPart != null && !neoPathPart.isEmpty();
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE___VALIDATE_COMPLEX_EDGE:
				try {
					validateComplexEdge();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE___ADD_NEO_PATH_PART__NEOPATHPART:
				addNeoPathPart((NeoPathPart)arguments.get(0));
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

	//Rework --> Maybe Pull-Up --> Inculde an Error exception if both Params are set
	@Override
	protected NeoAbstractPathParam getNeoAbstractPathParam() {
		if (getNeoComplexEdge() != null) {
			return ((NeoPathPartImpl) getNeoComplexEdge()).getNeoAbstractPathParam();
		}
		NeoAbstractPathParam neoAbstractPathParam = null;
		if (getNeoPathParam() != null) {
			neoAbstractPathParam = getNeoPathParam();
		} else if (getNeoPropertyPathParam() != null) {
			neoAbstractPathParam = getNeoPropertyPathParam();
		} //Introduce here a runntime exception to chat the 3 case if nothing is set --> or return null?
		return neoAbstractPathParam;	
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
	@Override
	public void setNeoComplexEdge(NeoComplexEdge newNeoComplexEdge) {
		super.setNeoComplexEdge(newNeoComplexEdge);
		setCount(((NeoComplexEdgeImpl) newNeoComplexEdge).getCount());
		for (NeoPathPart part : getNeoPathPart()) {
			((NeoPathPartImpl) part).setCount(getCount());
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
