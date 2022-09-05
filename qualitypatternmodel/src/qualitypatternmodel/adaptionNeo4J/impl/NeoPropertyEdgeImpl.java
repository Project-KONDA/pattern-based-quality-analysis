/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
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
		NeoPropertyPathParam neoPropertyPathParam = getNeoPropertyPathParam();
		String cypher = null;
		
		if (getIncomingMapping() == null) {
			if (neoPropertyPathParam.getNeoPathPart() != null) {
				NeoPathPart neoPathPart = neoPropertyPathParam.getNeoPathPart();
				if (neoPathPart instanceof NeoSimpleEdge) {
					NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathPart;
					if (neoSimpleEdge.getNeoTargetNodeLabels() != null) {
						cypher = neoPropertyPathParam.generateCypher();
					} else {
						targetNodesCanNotBeNull();
					}
				} else if (neoPathPart instanceof NeoComplexEdge) {
					NeoSimpleEdge neoSimpleEdge = null;
					for (NeoPathPart part : neoPathPart.getNeoPathPartEdges()) {
						if (((NeoSimpleEdge)part).isIsLastEdge()) {
							neoSimpleEdge = (NeoSimpleEdge) part;
						}
					}
					if (neoSimpleEdge != null) {
						if (neoSimpleEdge.getNeoTargetNodeLabels() != null) {
							cypher = neoPropertyPathParam.generateCypher();
						} else {
							targetNodesCanNotBeNull();
						}
					} else {
						throw new InvalidityException("Last Edge has to be set");
					}
				}
				
			} else {
				cypher = null;
			}
		} else {
			NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) getIncomingMapping();
			while (neoPropertyEdge.getIncomingMapping() != null) {
				neoPropertyEdge = (NeoPropertyEdge) getIncomingMapping();
			}
			NeoPropertyPathParam neoPathParam = neoPropertyEdge.getNeoPropertyPathParam();
			if (neoPathParam != null && neoPathParam.getNeoPathPart() != null) {
				NeoPathPart neoPathPart = neoPathParam.getNeoPathPart();
				cypher = neoPathPart.generateCypherWithoutLabels();
			} else {
				cypher = null;
			}
			
		}
		return cypher;
	}

	private void targetNodesCanNotBeNull() throws InvalidityException {
		throw new InvalidityException("TargetNodes can not be null");
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateCypherPropertyAddressing() throws InvalidityException {
		NeoPropertyPathParam neoPropertyPathParam = getNeoPropertyPathParam();
		if (neoPropertyPathParam != null) {
			String cypher;
			String variable; 
			if (neoPropertyPathParam.getNeoPathPart() == null) {
				NeoNode neoNode = (NeoNode) getSource();
				variable = neoNode.getCypherVariable();
			} else {
				NeoPathPart neoPathPart = neoPropertyPathParam.getNeoPathPart();
				if (neoPathPart instanceof NeoSimpleEdgeImpl) {
					
				} else if (neoPathPart instanceof NeoComplexEdgeImpl) {
					for (NeoPathPart neoPathPart2 : neoPathPart.getNeoPathPartEdges()) {
						if (neoPathPart2.isIsLastEdge()) {
							neoPathPart = neoPathPart2;
						}
					}
				} else {
					return null;
				}
				variable = ((NeoSimpleEdge) neoPathPart).getCypherInnerEdgeVariable();
			}
			
			cypher = variable + "." + getNeoPropertyPathParam().getNeoPropertyName();
			return cypher;
		}
		
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateCypherMatchNodeVariable() throws InvalidityException {
		//TODO what to do if MAPPING plays a part? 
		NeoPropertyPathParam neoPropertyPathParam = getNeoPropertyPathParam();
		if (neoPropertyPathParam != null) {
			String cypher;
			if (neoPropertyPathParam.getNeoPathPart() == null) {
				NeoNode neoNode = (NeoNode) getSource();
				cypher = neoNode.getCypherVariable();
			} else {
				NeoSimpleEdge neoSimpleEdge = null;
				if (neoPropertyPathParam.getNeoPathPart() instanceof NeoComplexEdge) {
					NeoComplexEdge neoComplexEdge = (NeoComplexEdge) neoPropertyPathParam.getNeoPathPart();
					for (NeoPathPart part : neoComplexEdge.getNeoPathPartEdges()) {
						if (((NeoSimpleEdge) part).isIsLastEdge()) {
							neoSimpleEdge = (NeoSimpleEdge) part;
						}
					}
				} else if (neoPropertyPathParam.getNeoPathPart() instanceof NeoSimpleEdge) {
					neoSimpleEdge = (NeoSimpleEdge) neoPropertyPathParam.getNeoPathPart();
				} else {
					throw new InvalidityException("The is no NeoSimpleEdge for the target type");
				}
				cypher = neoSimpleEdge.getCypherInnerEdgeVariable();
			}
			
			return cypher;
		}
		
		return null;
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE___GENERATE_CYPHER_MATCH_NODE_VARIABLE:
				try {
					return generateCypherMatchNodeVariable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //NeoAttributeEdgeImpl
