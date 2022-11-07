/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Attribute Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyEdgeImpl#getNeoPropertyPathParam <em>Neo Property Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPropertyEdgeImpl extends NeoAbstractEdgeImpl implements NeoPropertyEdge {
	private static final String THE_SOURCE_NEEDS_TO_BE_SET = "The Source needs to be set";
	private static final String NEO_PROPERTY_EDGE_NEEDS_A_NEO_PROPERTY_PATH_PARAM = "NeoPropertyEdge needs a NeoPropertyPathParam";
	private static final String THERE_IS_NO_NEO_SIMPLE_EDGE_FOR_THE_TARGET_TYPE = "There is no NeoSimpleEdge for the target type";
	/**
	 * The cached value of the '{@link #getNeoPropertyPathParam() <em>Neo Property Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPropertyPathParam()
	 * @generated
	 * @ordered
	 */
	protected NeoPropertyPathParam neoPropertyPathParam;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoPropertyEdgeImpl() {
		super();
	}

	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException {
		return this;
	}

	@Override
	public NeoPropertyEdge adaptAsPropertyEdge() throws InvalidityException {
		return this;
	}
	
	//Translation of the neoPropertyEdge
	@Override
	public String generateCypher() throws InvalidityException {
		String cypher = ""; //Null will be returned because it is used as an indicator in the morphisems
		if (getIncomingMapping() == null) {
			if(!translated && getNeoPropertyPathParam() != null) {
				cypher = getNeoPropertyPathParam().generateCypher();
				this.translated = true;
			} else if (getNeoPropertyPathParam() == null){
				throw new InvalidityException(NEO_PROPERTY_EDGE_NEEDS_A_NEO_PROPERTY_PATH_PARAM);
			}
		} 
		return cypher;
	}
	
	@Override
	public EMap<Integer, String> getCypherReturnVariable() throws InvalidityException {
		EMap<Integer, String> returnElement = null;
		if (getNeoPropertyPathParam() != null) {
			if (getNeoPropertyPathParam().getNeoPathPart() == null) {
				returnElement = null;
			} else {
				returnElement = super.getCypherReturnVariable();
				String cypher = getNeoPropertyPathParam().getCypherReturnVariable();
				returnElement.put(NeoAbstractEdgeImpl.CYPHER_RETURN_ID, cypher);
			}
		} else {
			throw new InvalidityException("No NeoPropertyPathParam need to be set"); 
		}
		return returnElement;
	}
	
	@Override
	public String getReturnInnerEdgeNodes() throws InvalidityException {
		String cypher = null;
		if (getNeoPropertyPathParam() != null) {
			cypher = getNeoPropertyPathParam().getReturnInnerEdgeNodes();
		}
		return cypher;
	}
	
	@Override
	public String myToString() {
		String result = super.myToString();
		if (getNeoPropertyPathParam() != null) {
			result += " " + getNeoPropertyPathParam().myToString(); 
		}
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateCypherPropertyAddressing() throws InvalidityException {
		String result = new String();
		if (getIncomingMapping() == null) {
			final NeoPropertyPathParam neoPropertyPathParam = getNeoPropertyPathParam();
			if (neoPropertyPathParam != null) {
				String cypher = null;
				String variable = null; 
				if (neoPropertyPathParam.getNeoPathPart() == null) {
					if (getSource() != null) {
						NeoNode neoNode = (NeoNode) getSource();
						variable = neoNode.getCypherVariable();
					} else throw new InvalidityException(THE_SOURCE_NEEDS_TO_BE_SET);
				} else {
					NeoPathPart neoPathPart = neoPropertyPathParam.getNeoPathPart();
					neoPathPart = neoPathPart.getNeoLastEdge();
					variable = neoPathPart.getCypherInnerEdgeNodes(false);
				}
				
				cypher = variable + "." + getNeoPropertyPathParam().getNeoPropertyName();
				result = cypher;
			}
		} else {
			NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) getOriginalRelation();
			result = neoPropertyEdge.generateCypherPropertyAddressing();
		}
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateCypherNodeVariable() throws InvalidityException {
		//Used in the CompletePattern to get the PrimitiveTargetNodes
		if (getIncomingMapping() == null) {
			NeoPropertyPathParam neoPropertyPathParam = getNeoPropertyPathParam();
			if (neoPropertyPathParam != null) {
				String cypher;
				if (neoPropertyPathParam.getNeoPathPart() == null) {
					NeoNode neoNode = (NeoNode) getSource();
					cypher = neoNode.getCypherVariable();
				} else {
					NeoPathPart neoLastEdge = neoPropertyPathParam.getNeoPathPart().getNeoLastEdge();
					if (neoLastEdge == null) {
						throw new InvalidityException(THERE_IS_NO_NEO_SIMPLE_EDGE_FOR_THE_TARGET_TYPE);
					}
					cypher = neoLastEdge.getCypherInnerEdgeNodes(false);
				}
				
				return cypher;
			}
			return "";
		}
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) getOriginalRelation();
		return neoPropertyEdge.generateCypherNodeVariable();
	}

	@Override 
	public void createParameters() {
		if (getIncomingMapping() == null) {
			ParameterList pList = getParameterList();
			if (pList != null) {
				NeoPropertyPathParam neoPropertyPathParam = getNeoPropertyPathParam();
				if (neoPropertyPathParam == null) {
					neoPropertyPathParam = new NeoPropertyPathParamImpl();
					setNeoPropertyPathParam(neoPropertyPathParam);
					pList.add(neoPropertyPathParam);	
				}
				if (!pList.equals(neoPropertyPathParam.getParameterList())) {
					pList.add(neoPropertyPathParam);
				}
			}
		}
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoPropertyPathParam basicGetNeoPropertyPathParam() {
		return neoPropertyPathParam;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_PROPERTY_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPropertyPathParam getNeoPropertyPathParam() {
		if (neoPropertyPathParam != null && neoPropertyPathParam.eIsProxy()) {
			InternalEObject oldNeoPropertyPathParam = (InternalEObject)neoPropertyPathParam;
			neoPropertyPathParam = (NeoPropertyPathParam)eResolveProxy(oldNeoPropertyPathParam);
			if (neoPropertyPathParam != oldNeoPropertyPathParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, oldNeoPropertyPathParam, neoPropertyPathParam));
			}
		}
		return neoPropertyPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoPropertyPathParam(NeoPropertyPathParam newNeoPropertyPathParam, NotificationChain msgs) {
		NeoPropertyPathParam oldNeoPropertyPathParam = neoPropertyPathParam;
		neoPropertyPathParam = newNeoPropertyPathParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, oldNeoPropertyPathParam, newNeoPropertyPathParam);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoPropertyPathParam(NeoPropertyPathParam newNeoPropertyPathParam) {
		if (newNeoPropertyPathParam != neoPropertyPathParam) {
			NotificationChain msgs = null;
			if (neoPropertyPathParam != null)
				msgs = ((InternalEObject)neoPropertyPathParam).eInverseRemove(this, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, NeoPropertyPathParam.class, msgs);
			if (newNeoPropertyPathParam != null)
				msgs = ((InternalEObject)newNeoPropertyPathParam).eInverseAdd(this, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, NeoPropertyPathParam.class, msgs);
			msgs = basicSetNeoPropertyPathParam(newNeoPropertyPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, newNeoPropertyPathParam, newNeoPropertyPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				if (neoPropertyPathParam != null)
					msgs = ((InternalEObject)neoPropertyPathParam).eInverseRemove(this, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, NeoPropertyPathParam.class, msgs);
				return basicSetNeoPropertyPathParam((NeoPropertyPathParam)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				return basicSetNeoPropertyPathParam(null, msgs);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				if (resolve) return getNeoPropertyPathParam();
				return basicGetNeoPropertyPathParam();
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				setNeoPropertyPathParam((NeoPropertyPathParam)newValue);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				setNeoPropertyPathParam((NeoPropertyPathParam)null);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				return neoPropertyPathParam != null;
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE___GENERATE_CYPHER_PROPERTY_ADDRESSING:
				try {
					return generateCypherPropertyAddressing();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE___GENERATE_CYPHER_NODE_VARIABLE:
				try {
					return generateCypherNodeVariable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //NeoAttributeEdgeImpl
