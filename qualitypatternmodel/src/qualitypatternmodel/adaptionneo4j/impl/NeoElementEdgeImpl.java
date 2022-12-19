/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.adaptionneo4j.NeoElementEdge;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoElementEdgeImpl#getNeoElementPathParam <em>Neo Element Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoElementEdgeImpl extends NeoEdgeImpl implements NeoElementEdge {
	private static final String NEO_EDGE_NEEDS_A_NEO_PATH_PARAM = "NeoEdge needs a NeoPathParam";
	private static final String NEO_PATH_PARAM_NEED_TO_BE_SET = "NeoPathParam need to be set";
	/**
	 * The cached value of the '{@link #getNeoElementPathParam() <em>Neo Element Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoElementPathParam()
	 * @generated
	 * @ordered
	 */
	protected NeoElementPathParam neoElementPathParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoElementEdgeImpl() {
		super();
	}
	
	 @Override
	 public PatternElement createNeo4jAdaption() throws InvalidityException {
		 return this;
	 }
	
	 @Override
	 public NeoElementEdge adaptAsNeoEdge() throws InvalidityException {
		 return this;
	 }
	
	
	@Override
	public String generateCypher() throws InvalidityException {
		String cypher = "";
		if (getIncomingMapping() == null) {
			if(!translated && getNeoElementPathParam() != null) {
				cypher = getNeoElementPathParam().generateCypher();
				this.translated = true;
			} else if(getNeoElementPathParam() == null) {
				throw new InvalidityException(NEO_EDGE_NEEDS_A_NEO_PATH_PARAM);
			}
		}
		return cypher;
	}
	
	@Override
	public EMap<Integer, String> getCypherReturnVariable() throws InvalidityException {
		EMap<Integer, String> returnElement;
		if (getNeoElementPathParam() != null) {
			if (getNeoElementPathParam().getNeoPathPart() == null) {
				returnElement = null;
			} else {
				returnElement = super.getCypherReturnVariable();
				String cypher = getNeoElementPathParam().getCypherReturnVariable();
				returnElement.put(NeoEdgeImpl.CYPHER_RETURN_ID, cypher);
			}
		} else {
			throw new InvalidityException(NEO_PATH_PARAM_NEED_TO_BE_SET);
		}
		return returnElement;
	}
	
	@Override
	public String getReturnInnerEdgeNodes() throws InvalidityException {
		String cypher = null;
		if (getNeoElementPathParam() != null) {
			cypher = getNeoElementPathParam().getReturnInnerEdgeNodes();
		}
		return cypher;
	}
	
	@Override 
	public void createParameters() {
		if (getIncomingMapping() == null) {
			ParameterList pList = getParameterList();
			if (pList != null) {
				NeoElementPathParam neoPathParam = getNeoElementPathParam();
				if (neoPathParam == null) {
					neoPathParam = new NeoElementPathParamImpl();
					setNeoElementPathParam(neoPathParam);
					pList.add(neoPathParam);	
				}
				if (!pList.equals(neoPathParam.getParameterList())) {
					pList.add(neoPathParam);
				}
			}
		}
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_ELEMENT_EDGE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoElementPathParam getNeoElementPathParam() {
		if (neoElementPathParam != null && neoElementPathParam.eIsProxy()) {
			InternalEObject oldNeoElementPathParam = (InternalEObject)neoElementPathParam;
			neoElementPathParam = (NeoElementPathParam)eResolveProxy(oldNeoElementPathParam);
			if (neoElementPathParam != oldNeoElementPathParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Adaptionneo4jPackage.NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM, oldNeoElementPathParam, neoElementPathParam));
			}
		}
		return neoElementPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoElementPathParam basicGetNeoElementPathParam() {
		return neoElementPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoElementPathParam(NeoElementPathParam newNeoElementPathParam, NotificationChain msgs) {
		NeoElementPathParam oldNeoElementPathParam = neoElementPathParam;
		neoElementPathParam = newNeoElementPathParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM, oldNeoElementPathParam, newNeoElementPathParam);
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
	public void setNeoElementPathParam(NeoElementPathParam newNeoElementPathParam) {
		if (newNeoElementPathParam != neoElementPathParam) {
			NotificationChain msgs = null;
			if (neoElementPathParam != null)
				msgs = ((InternalEObject)neoElementPathParam).eInverseRemove(this, Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE, NeoElementPathParam.class, msgs);
			if (newNeoElementPathParam != null)
				msgs = ((InternalEObject)newNeoElementPathParam).eInverseAdd(this, Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE, NeoElementPathParam.class, msgs);
			msgs = basicSetNeoElementPathParam(newNeoElementPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM, newNeoElementPathParam, newNeoElementPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM:
				if (neoElementPathParam != null)
					msgs = ((InternalEObject)neoElementPathParam).eInverseRemove(this, Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE, NeoElementPathParam.class, msgs);
				return basicSetNeoElementPathParam((NeoElementPathParam)otherEnd, msgs);
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
			case Adaptionneo4jPackage.NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM:
				return basicSetNeoElementPathParam(null, msgs);
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
			case Adaptionneo4jPackage.NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM:
				if (resolve) return getNeoElementPathParam();
				return basicGetNeoElementPathParam();
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
			case Adaptionneo4jPackage.NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM:
				setNeoElementPathParam((NeoElementPathParam)newValue);
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
			case Adaptionneo4jPackage.NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM:
				setNeoElementPathParam((NeoElementPathParam)null);
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
			case Adaptionneo4jPackage.NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM:
				return neoElementPathParam != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String myToString() {
		String result = super.myToString();
		if (getNeoElementPathParam() != null) 
			result += " " + getNeoElementPathParam().myToString(); 
		return result;
	}
} //NeoEdgeImpl