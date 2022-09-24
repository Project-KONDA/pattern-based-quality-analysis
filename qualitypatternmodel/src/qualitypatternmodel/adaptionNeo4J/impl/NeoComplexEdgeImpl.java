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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoComplexEdgeImpl#getNeoPath <em>Neo Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoComplexEdgeImpl extends NeoPathPartImpl implements NeoComplexEdge {
	/**
	 * The cached value of the '{@link #getNeoPath() <em>Neo Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPath()
	 * @generated
	 * @ordered
	 */
	protected EList<NeoPathPart> neoPath;

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
		if (this.validateComplexEdge()) {
			String cypher = generateInternalCypher(true);			
			return cypher;
		}
		throw new InvalidityException("The ComplexEdge is not correct");
	}
	
	@Override
	public String generateCypherWithoutLabels() throws InvalidityException {
		if (this.validateComplexEdge()) {
			String cypher = generateInternalCypher(true);			
			return cypher;
		}
		throw new InvalidityException("The ComplexEdge is not correct");
	}
	
	private String generateInternalCypher(boolean withLabels) throws InvalidityException {
		if (getNeoPath().size() < 2) 
			return null;
		StringBuilder cypher = new StringBuilder();
		if (withLabels) {
			for(NeoPathPart part : getNeoPathPartEdges()) cypher.append(part.generateCypher());
		} else {
			for(NeoPathPart part : getNeoPathPartEdges()) cypher.append(part.generateCypherWithoutLabels());
		}
		return cypher.toString();
	}
	
	@Override
	public String getCypherVariable() {
		try {
			this.validateComplexEdge();
			StringBuilder variables = new StringBuilder();
			EList<NeoPathPart> neoPath = this.getNeoPath();
			for(NeoPathPart path : neoPath) {
				if (variables.length() != 0) variables.append(CypherSpecificConstants.CYPHER_SEPERATOR + CypherSpecificConstants.ONE_WHITESPACES); 
				variables.append(path.getCypherVariable());
			}
			return variables.toString();
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCypherInnerEdgeVariable() throws InvalidityException {
		if (validateComplexEdge()) {
			StringBuilder cypher = new StringBuilder();
			String innerEdgeNode;
			for (NeoPathPart part : neoPath) {
				innerEdgeNode = part.getCypherInnerEdgeVariable();
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
	
	@Override
	public String getReturnCypherInnerEdgeVariable() throws InvalidityException {
		return this.getCypherInnerEdgeVariable();
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
	public EList<NeoPathPart> getNeoPath() {
		if (neoPath == null) {
			neoPath = new EObjectContainmentEList<NeoPathPart>(NeoPathPart.class, this, AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH);
		}
		return neoPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH:
				return ((InternalEList<?>)getNeoPath()).basicRemove(otherEnd, msgs);
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH:
				return getNeoPath();
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH:
				getNeoPath().clear();
				edgeNumber = 0;
				getNeoPath().addAll((Collection<? extends NeoPathPart>)newValue);
				for (NeoPathPart part : getNeoPath()) {
					part.setEdgeNumber(edgeNumber);
					edgeNumber++;
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH:
				edgeNumber = 0;
				getNeoPath().clear();
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
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH:
				return neoPath != null && !neoPath.isEmpty();
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

	//Talk about with Arno
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getNeoPath() == null || getNeoPath().size() < 2)
			throw new InvalidityException("NeoComplexPath " + getId() + " contains not enough NeoPathParts");
		
	}

	@Override
	public EList<NeoPathPart> getNeoPathPartEdges() {
		EList<NeoPathPart> list = new BasicEList<NeoPathPart>();
		for(NeoPathPart neoPath : getNeoPath()) {
			list.addAll(neoPath.getNeoPathPartEdges());
		}
		return list;
	}
	
	@Override
	public String myToString() {
		String result = "NeoComplexEdge [" + getId() + "] (";
		int i = 0;
		for (NeoPathPart part : getNeoPath()) {
			if (i > 0)
				result += ",";
			result += part.myToString();
		}
		return result;
	}

	@Override
	public boolean validateComplexEdge() throws InvalidityException {
		for (NeoPathPart part : getNeoPath()) {
			NeoPropertyPathParam neoPropertyPathParam = getNeoPropertyPathParam();
			if (neoPropertyPathParam != null) {
				if (part instanceof NeoSimpleEdge && !(((NeoSimpleEdge) part).isIsLastEdge())) {
					if (((NeoSimpleEdge) part).getNeoTargetNodeLabels() == null) {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addNeoPathPart(NeoPathPart neoPathPart) {
		if (this.neoPath == null) {
			this.neoPath = new BasicEList<NeoPathPart>();
		}
		this.neoPath.add(neoPathPart);
		neoPathPart.setNeoComplexEdge(this);
		neoPathPart.setEdgeNumber(this.edgeNumber);
		edgeNumber++;
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


} //NeoComplexEdgeImpl
