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
		if (validateComplexEdge()) {
			String cypher = generateInternalCypher(true);			
			return cypher;
		}
		throw new InvalidityException("The ComplexEdge is not correct");
	}
	
	@Override
	public String generateCypherWithoutLabels() throws InvalidityException {
		if (this.validateComplexEdge()) {
			String cypher = generateInternalCypher(false);			
			return cypher;
		}		
		throw new InvalidityException("The ComplexEdge is not correct");
	}
	
	private String generateInternalCypher(boolean withLabels) throws InvalidityException {
		StringBuilder cypher = new StringBuilder();
		if (withLabels) {
			for(NeoPathPart part : getNeoPathPartEdges()) cypher.append(part.generateCypher());
		} else {
			for(NeoPathPart part : getNeoPathPartEdges()) cypher.append(part.generateCypherWithoutLabels());
		}
		return cypher.toString();
	}
	
	//GETS ALL INNER EDGES ALIASES 
	@Override
	public String getCypherVariable() {
		try {
			this.validateComplexEdge();
			StringBuilder variables = new StringBuilder();
			EList<NeoPathPart> neoPath = this.getNeoPathPart();
			for(NeoPathPart path : neoPath) {
				if (variables.length() != 0) variables.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACES); 
				variables.append(path.getCypherVariable());
			}
			return variables.toString();
		} catch (Exception e) {
			return null;
		}
	}
	
	
	//DO I NEED THE DIFFRENCE BETWEEN THIS TO METHODS?
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCypherInnerEdgeNodes() throws InvalidityException {
		if (validateComplexEdge()) {
			StringBuilder cypher = new StringBuilder();
			String innerEdgeNode;
			for (NeoPathPart part : neoPathPart) {
				innerEdgeNode = part.getCypherInnerEdgeNodes();
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
		throw new InvalidityException("ComplexEdge is not valid");
	}
	
	//AddToEcore
	//GETS ALL INNER EDGE NODES
	@Override
	public String getReturnCypherInnerEdgeNodes() throws InvalidityException {
		return this.getCypherInnerEdgeNodes();
	}
	
	//Talk about with Arno
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getNeoPathPart() == null || !validateComplexEdge())
			throw new InvalidityException("NeoComplexPath " + getId() + " contains not enough NeoPathParts");
		
	}

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
	public boolean validateComplexEdge() throws InvalidityException {
		boolean valid = true;
		if (!(countOfEdges() >= 2)) {
			valid = false;
		}
		//Introduce check for multiple End Elements && check if the end really the end
		return valid;
	}
	
	//PUT THIS TO THE ABSTRACT CLASS of COMPLEXEDGE
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
		getNeoPathPart().add(neoPathPart);
		if (getNeoComplexEdge() != null) {
			((NeoPathPartImpl) neoPathPart).setCount(this.getHighestComplexEdge().getCount());
		} else {
			((NeoPathPartImpl) neoPathPart).setCount(getCount());
		}
	}

	@Override
	public String myToString() {
		String result = "NeoComplexEdge [" + getId() + "] (";
		int i = 0;
		for (NeoPathPart part : getNeoPathPart()) {
			if (i > 0)
				result += ",";
			result += part.myToString();
		}
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
					return validateComplexEdge();
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
		}
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
	
	//For resetting the counting if a ComplexEdge has been created at the same time as an other Complex Edge but is in his container
	@Override
	public void setNeoComplexEdge(NeoComplexEdge newNeoComplexEdge) {
		super.setNeoComplexEdge(newNeoComplexEdge);
		setCount(((NeoComplexEdgeImpl) newNeoComplexEdge).getCount());
		for (NeoPathPart part : getNeoPathPart()) ((NeoPathPartImpl) part).setCount(getCount());
	}
	
	//BEGIN - For counting the inner Edges
	protected InternalCount count = null;
	protected InternalCount getCount() {
		if (count == null) {
			count = createInternalCounter();
		}
		return count;
	}
	
	protected void setCount(InternalCount count) {
		this.count = count;
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
