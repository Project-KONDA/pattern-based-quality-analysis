/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Attribute Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoPropertyEdgeImpl#getNeoPropertyPathParam <em>Neo Property Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPropertyEdgeImpl extends NeoEdgeImpl implements NeoPropertyEdge {
	private static final String VARIABLE_PROPERTY_SEPERATOR = ".";
	private static final String NO_NEO_PROPERTY_PATH_PARAM_NEED_TO_BE_SET = "No NeoPropertyPathParam need to be set";
	private static final String NO_NEO_PROPERTY_NAME_WAS_SPECIFIED = "No NeoPropertyName was specified";
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
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * @return String
	 * Translation of the NeoPropertyEdge.
	 * If it is a second time printed, it will be printed without any labels.
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		String cypher = new String();
		if(!translated && getNeoPropertyPathParam() != null) {
			cypher = getNeoPropertyPathParam().generateCypher();
			this.translated = true;
		} else if (getNeoPropertyPathParam() == null){
			throw new InvalidityException(NEO_PROPERTY_EDGE_NEEDS_A_NEO_PROPERTY_PATH_PARAM);
		}
		//ELSE: An empty String will be returned as an indicator for not appending the translation.
		return cypher;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * @return EMap<Integer, String> the integer is for the place in the Return-Clause and the String is the value which shall be added.
	 * It is a prototype function for returning the Edges. FUTURE WORK is needed. 
	 * It is for returning the Edge variables.
	 */
	@Override
	public EMap<Integer, String> getCypherReturn() throws InvalidityException {
		EMap<Integer, String> returnElement = null;
		if (getNeoPropertyPathParam() != null) {
			if (getNeoPropertyPathParam().getNeoPathPart() == null) {
				returnElement = null;
			} else {
				returnElement = super.getCypherReturn();
				String cypher = getNeoPropertyPathParam().getCypherReturnVariable();
				returnElement.put(NeoEdgeImpl.CYPHER_RETURN_ID, cypher);
			}
		} else {
			throw new InvalidityException(NO_NEO_PROPERTY_PATH_PARAM_NEED_TO_BE_SET); 
		}
		return returnElement;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * @return String
	 * It is a prototype function for returning the inner Edge Nodes. FUTURE WORK is needed. 
	 * It is for returning the inner Edge Nodes variables.
	 */
	@Override
	public String getReturnInnerEdgeNodes() throws InvalidityException {
		String cypher = null;
		if (getNeoPropertyPathParam() != null) {
			cypher = getNeoPropertyPathParam().getReturnInnerEdgeNodes();
		}
		return cypher;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * Build the myString for the NeoPropertyEdge.
	 */
	@Override
	public String myToString() {
		String result = super.myToString();
		if (getNeoPropertyPathParam() != null) {
			result += CypherSpecificConstants.ONE_WHITESPACE + getNeoPropertyPathParam().myToString(); 
		}
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Generates the CypherProertyAddressing.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateCypherPropertyAddressing() throws InvalidityException {
		String result = new String();
		final NeoPropertyPathParam neoPropertyPathParam = getNeoPropertyPathParam();
		if (neoPropertyPathParam != null) {
			String cypher = null;
			String variable = null; 
			if (neoPropertyPathParam.getNeoPathPart() == null) {
				if (getSource() != null) {
					NeoElementNode neoNode = (NeoElementNode) getSource();
					variable = neoNode.getCypherVariable();
				} else throw new InvalidityException(THE_SOURCE_NEEDS_TO_BE_SET);
			} else {
				NeoPathPart neoPathPart = neoPropertyPathParam.getNeoPathPart();
				neoPathPart = neoPathPart.getNeoLastEdge();
				variable = neoPathPart.getCypherInnerEdgeNodes(false);
			}
			if (getNeoPropertyPathParam().getNeoPropertyName() == null) {
				throw new InvalidityException(NO_NEO_PROPERTY_NAME_WAS_SPECIFIED);
			}
			cypher = variable + VARIABLE_PROPERTY_SEPERATOR + getNeoPropertyPathParam().getNeoPropertyName();
			result = cypher;
		}
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Gets the Node in which the Property is stored. Can be used in FUTURE WORK.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCypherNodeVariable() throws InvalidityException {
		//Used in the CompletePattern to get the PrimitiveTargetNodes
		NeoPropertyPathParam neoPropertyPathParam = getNeoPropertyPathParam();
		if (neoPropertyPathParam != null) {
			String cypher;
			if (neoPropertyPathParam.getNeoPathPart() == null) {
				NeoElementNode neoNode = (NeoElementNode) getSource();
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
		return new String();
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * Creates the Parameter for the NeoPropertyEdge.
	 * Thus it creates the NeoPropertyPathParam and adds it to the ParameterList.
	 */
	@Override 
	public void createParameters() {
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
	

	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = super.getAllParameters();
		res.add(getNeoPropertyPathParam());
		return res;
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
		return Adaptionneo4jPackage.Literals.NEO_PROPERTY_EDGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Adaptionneo4jPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, oldNeoPropertyPathParam, neoPropertyPathParam));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, oldNeoPropertyPathParam, newNeoPropertyPathParam);
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
				msgs = ((InternalEObject)neoPropertyPathParam).eInverseRemove(this, Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, NeoPropertyPathParam.class, msgs);
			if (newNeoPropertyPathParam != null)
				msgs = ((InternalEObject)newNeoPropertyPathParam).eInverseAdd(this, Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, NeoPropertyPathParam.class, msgs);
			msgs = basicSetNeoPropertyPathParam(newNeoPropertyPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, newNeoPropertyPathParam, newNeoPropertyPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
				if (neoPropertyPathParam != null)
					msgs = ((InternalEObject)neoPropertyPathParam).eInverseRemove(this, Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, NeoPropertyPathParam.class, msgs);
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
			case Adaptionneo4jPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
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
			case Adaptionneo4jPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
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
			case Adaptionneo4jPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
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
			case Adaptionneo4jPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
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
			case Adaptionneo4jPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM:
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
			case Adaptionneo4jPackage.NEO_PROPERTY_EDGE___GENERATE_CYPHER_PROPERTY_ADDRESSING:
				try {
					return generateCypherPropertyAddressing();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_PROPERTY_EDGE___GET_CYPHER_NODE_VARIABLE:
				try {
					return getCypherNodeVariable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //NeoAttributeEdgeImpl
