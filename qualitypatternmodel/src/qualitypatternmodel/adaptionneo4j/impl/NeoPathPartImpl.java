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
import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoPathParam;
import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.impl.NeoComplexEdgeImpl.InternalCount;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Path Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoPathPartImpl#getNeoPathParam <em>Neo Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionneo4j.impl.NeoPathPartImpl#getNeoComplexEdge <em>Neo Complex Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NeoPathPartImpl extends PatternElementImpl implements NeoPathPart {
	
	private static final String NO_NEO_PATH_PARAM_IS_SET = "No NeoAbstractPathParam is set";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoPathPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_PATH_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NeoPathParam getNeoPathParam() throws InvalidityException {
		NeoComplexEdge neoComplexEdge = null;
		NeoComplexEdge nextNeoComplexEdge = getNeoComplexEdge();
		if (nextNeoComplexEdge != null) {
			do {
				neoComplexEdge = nextNeoComplexEdge;
				nextNeoComplexEdge = neoComplexEdge.getNeoComplexEdge();
			} while (nextNeoComplexEdge != null);			
		}
		if (neoComplexEdge == null) {
			if (eContainerFeatureID() != Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM) throw new InvalidityException(NO_NEO_PATH_PARAM_IS_SET);
			final NeoPathParam neoPathParam = (NeoPathParam)eInternalContainer();
			return neoPathParam;		
		} else {
			return neoComplexEdge.getNeoPathParam();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoPathParam(NeoPathParam newNeoPathParam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNeoPathParam, Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoPathParam(NeoPathParam newNeoPathParam) {
		if (newNeoPathParam != eInternalContainer() || (eContainerFeatureID() != Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM && newNeoPathParam != null)) {
			if (EcoreUtil.isAncestor(this, newNeoPathParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNeoPathParam != null)
				msgs = ((InternalEObject)newNeoPathParam).eInverseAdd(this, Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_PATH_PART, NeoPathParam.class, msgs);
			msgs = basicSetNeoPathParam(newNeoPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM, newNeoPathParam, newNeoPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoComplexEdge getNeoComplexEdge() {
		if (eContainerFeatureID() != Adaptionneo4jPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE) return null;
		return (NeoComplexEdge)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoComplexEdge(NeoComplexEdge newNeoComplexEdge, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNeoComplexEdge, Adaptionneo4jPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoComplexEdge(NeoComplexEdge newNeoComplexEdge) {
		if (newNeoComplexEdge != eInternalContainer() || (eContainerFeatureID() != Adaptionneo4jPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE && newNeoComplexEdge != null)) {
			if (EcoreUtil.isAncestor(this, newNeoComplexEdge))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNeoComplexEdge != null)
				msgs = ((InternalEObject)newNeoComplexEdge).eInverseAdd(this, Adaptionneo4jPackage.NEO_COMPLEX_EDGE__NEO_PATH_PARTS, NeoComplexEdge.class, msgs);
			msgs = basicSetNeoComplexEdge(newNeoComplexEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Adaptionneo4jPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE, newNeoComplexEdge, newNeoComplexEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NeoPathPart> getNeoPathPartEdgeLeafs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	@Override
	public String getCypherVariable() throws InvalidityException {
		return ((NeoPathParamImpl) getNeoPathParam()).getEdgeNaming();
	}

	protected boolean isLastEdge() {
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
	public String getCypherInnerEdgeNodes(boolean isReturn) throws InvalidityException {
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
	public NeoPathPart getNeoLastEdge() throws InvalidityException {
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
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNeoPathParam((NeoPathParam)otherEnd, msgs);
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNeoComplexEdge((NeoComplexEdge)otherEnd, msgs);
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
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				return basicSetNeoPathParam(null, msgs);
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
				return basicSetNeoComplexEdge(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				return eInternalContainer().eInverseRemove(this, Adaptionneo4jPackage.NEO_PATH_PARAM__NEO_PATH_PART, NeoPathParam.class, msgs);
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
				return eInternalContainer().eInverseRemove(this, Adaptionneo4jPackage.NEO_COMPLEX_EDGE__NEO_PATH_PARTS, NeoComplexEdge.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				try {
					return getNeoPathParam();					
				} catch (Exception e) {
					throw new RuntimeException(e.getCause());
				}
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
				return getNeoComplexEdge();
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
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				setNeoPathParam((NeoPathParam)newValue);
				return;
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
				setNeoComplexEdge((NeoComplexEdge)newValue);
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
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				setNeoPathParam((NeoPathParam)null);
				return;
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
				setNeoComplexEdge((NeoComplexEdge)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				try {
					return getNeoPathParam() != null;
				} catch (Exception e) {
					throw new RuntimeException(e.getCause());
				}
			case Adaptionneo4jPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
				return getNeoComplexEdge() != null;
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
			case Adaptionneo4jPackage.NEO_PATH_PART___GET_NEO_PATH_PART_EDGE_LEAFS:
				return getNeoPathPartEdgeLeafs();
			case Adaptionneo4jPackage.NEO_PATH_PART___GET_CYPHER_VARIABLE:
				try {
					return getCypherVariable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_PATH_PART___GET_CYPHER_INNER_EDGE_NODES__BOOLEAN:
				try {
					return getCypherInnerEdgeNodes((Boolean)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_PATH_PART___GET_NEO_LAST_EDGE:
				try {
					return getNeoLastEdge();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}
	
	
	//for the counting
	protected abstract void setCount(InternalCount count);
} //NeoPathPartImpl
