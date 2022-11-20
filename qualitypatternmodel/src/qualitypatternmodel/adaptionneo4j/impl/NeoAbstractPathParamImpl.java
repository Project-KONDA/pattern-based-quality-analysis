/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoAbstractPathParam;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Abstract Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoAbstractPathParamImpl#getNeoPathPart <em>Neo Path Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NeoAbstractPathParamImpl extends ParameterImpl implements NeoAbstractPathParam {
	/**
	 * The cached value of the '{@link #getNeoPathPart() <em>Neo Path Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPathPart()
	 * @generated
	 * @ordered
	 */
	protected NeoPathPart neoPathPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoAbstractPathParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_ABSTRACT_PATH_PARAM;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPathPart getNeoPathPart() {
		return neoPathPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoPathPart(NeoPathPart newNeoPathPart, NotificationChain msgs) {
		NeoPathPart oldNeoPathPart = neoPathPart;
		neoPathPart = newNeoPathPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM__NEO_PATH_PART, oldNeoPathPart, newNeoPathPart);
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
	public void setNeoPathPart(NeoPathPart newNeoPathPart) {
		if (newNeoPathPart != neoPathPart) {
			NotificationChain msgs = null;
			if (neoPathPart != null)
				msgs = ((InternalEObject)neoPathPart).eInverseRemove(this, Adaptionneo4jPackage.NEO_PATH_PART__NEO_PARAM, NeoPathPart.class, msgs);
			if (newNeoPathPart != null)
				msgs = ((InternalEObject)newNeoPathPart).eInverseAdd(this, Adaptionneo4jPackage.NEO_PATH_PART__NEO_PARAM, NeoPathPart.class, msgs);
			msgs = basicSetNeoPathPart(newNeoPathPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM__NEO_PATH_PART, newNeoPathPart, newNeoPathPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public String getCypherReturnVariable() throws InvalidityException {
		String cypher = getNeoPathPart().getCypherVariable();	
		return cypher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getReturnInnerEdgeNodes() throws InvalidityException {
		String cypher;
		if (getNeoPathPart() == null) {
			return null;
		}
		cypher = getNeoPathPart().getCypherInnerEdgeNodes(true);
		return cypher;
	}
	
	protected boolean existsTargetNode(NeoSimpleEdge neoSimpleEdge) {
		return neoSimpleEdge.getNeoTargetNodeLabels() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void createParameters() {
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
	public void removeParametersFromParameterList() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM__NEO_PATH_PART:
				if (neoPathPart != null)
					msgs = ((InternalEObject)neoPathPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM__NEO_PATH_PART, null, msgs);
				return basicSetNeoPathPart((NeoPathPart)otherEnd, msgs);
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
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM__NEO_PATH_PART:
				return basicSetNeoPathPart(null, msgs);
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
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM__NEO_PATH_PART:
				return getNeoPathPart();
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
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM__NEO_PATH_PART:
				setNeoPathPart((NeoPathPart)newValue);
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
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM__NEO_PATH_PART:
				setNeoPathPart((NeoPathPart)null);
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
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM__NEO_PATH_PART:
				return neoPathPart != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean inputIsValid() {
		try{
			getNeoPathPart().isValid(AbstractionLevel.CONCRETE);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM___GET_RETURN_INNER_EDGE_NODES:
				try {
					return getReturnInnerEdgeNodes();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM___GET_CYPHER_RETURN_VARIABLE:
				try {
					return getCypherReturnVariable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM___CREATE_PARAMETERS:
				createParameters();
				return null;
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	//Add to ECORE
	protected abstract int getRelationNumber();
} //NeoAbstractPathParamImpl
