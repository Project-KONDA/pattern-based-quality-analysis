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
import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoComplexEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.impl.NeoComplexEdgeImpl.InternalCount;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Path Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl#getNeoPathParam <em>Neo Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl#getNeoPropertyPathParam <em>Neo Property Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl#getNeoComplexEdge <em>Neo Complex Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NeoPathPartImpl extends PatternElementImpl implements NeoPathPart {
	
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
		return AdaptionNeo4JPackage.Literals.NEO_PATH_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPathParam getNeoPathParam() {
		if (eContainerFeatureID() != AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM) return null;
		return (NeoPathParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoPathParam(NeoPathParam newNeoPathParam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNeoPathParam, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoPathParam(NeoPathParam newNeoPathParam) {
		if (newNeoPathParam != eInternalContainer() || (eContainerFeatureID() != AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM && newNeoPathParam != null)) {
			if (EcoreUtil.isAncestor(this, newNeoPathParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNeoPathParam != null)
				msgs = ((InternalEObject)newNeoPathParam).eInverseAdd(this, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH_PART, NeoPathParam.class, msgs);
			msgs = basicSetNeoPathParam(newNeoPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM, newNeoPathParam, newNeoPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPropertyPathParam getNeoPropertyPathParam() {
		if (eContainerFeatureID() != AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM) return null;
		return (NeoPropertyPathParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoPropertyPathParam(NeoPropertyPathParam newNeoPropertyPathParam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNeoPropertyPathParam, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoPropertyPathParam(NeoPropertyPathParam newNeoPropertyPathParam) {
		if (newNeoPropertyPathParam != eInternalContainer() || (eContainerFeatureID() != AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM && newNeoPropertyPathParam != null)) {
			if (EcoreUtil.isAncestor(this, newNeoPropertyPathParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNeoPropertyPathParam != null)
				msgs = ((InternalEObject)newNeoPropertyPathParam).eInverseAdd(this, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART, NeoPropertyPathParam.class, msgs);
			msgs = basicSetNeoPropertyPathParam(newNeoPropertyPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM, newNeoPropertyPathParam, newNeoPropertyPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoComplexEdge getNeoComplexEdge() {
		if (eContainerFeatureID() != AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE) return null;
		return (NeoComplexEdge)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoComplexEdge(NeoComplexEdge newNeoComplexEdge, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNeoComplexEdge, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoComplexEdge(NeoComplexEdge newNeoComplexEdge) {
		if (newNeoComplexEdge != eInternalContainer() || (eContainerFeatureID() != AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE && newNeoComplexEdge != null)) {
			if (EcoreUtil.isAncestor(this, newNeoComplexEdge))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNeoComplexEdge != null)
				msgs = ((InternalEObject)newNeoComplexEdge).eInverseAdd(this, AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART, NeoComplexEdge.class, msgs);
			msgs = basicSetNeoComplexEdge(newNeoComplexEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE, newNeoComplexEdge, newNeoComplexEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NeoPathPart> getNeoPathPartEdges() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCypherVariable() {
		return CypherSpecificConstants.VARIABLE_EGDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLastEdge() {
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
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNeoPathParam((NeoPathParam)otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNeoPropertyPathParam((NeoPropertyPathParam)otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
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
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				return basicSetNeoPathParam(null, msgs);
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM:
				return basicSetNeoPropertyPathParam(null, msgs);
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
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
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH_PART, NeoPathParam.class, msgs);
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART, NeoPropertyPathParam.class, msgs);
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
				return eInternalContainer().eInverseRemove(this, AdaptionNeo4JPackage.NEO_COMPLEX_EDGE__NEO_PATH_PART, NeoComplexEdge.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				return getNeoPathParam();
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM:
				return getNeoPropertyPathParam();
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
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
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				setNeoPathParam((NeoPathParam)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM:
				setNeoPropertyPathParam((NeoPropertyPathParam)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
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
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				setNeoPathParam((NeoPathParam)null);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM:
				setNeoPropertyPathParam((NeoPropertyPathParam)null);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
				setNeoComplexEdge((NeoComplexEdge)null);
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
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				return getNeoPathParam() != null;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM:
				return getNeoPropertyPathParam() != null;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
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
			case AdaptionNeo4JPackage.NEO_PATH_PART___GET_NEO_PATH_PART_EDGES:
				return getNeoPathPartEdges();
			case AdaptionNeo4JPackage.NEO_PATH_PART___GET_CYPHER_VARIABLE:
				return getCypherVariable();
			case AdaptionNeo4JPackage.NEO_PATH_PART___IS_LAST_EDGE:
				return isLastEdge();
			case AdaptionNeo4JPackage.NEO_PATH_PART___GET_CYPHER_INNER_EDGE_NODES__BOOLEAN:
				try {
					return getCypherInnerEdgeNodes((Boolean)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_PATH_PART___GET_NEO_LAST_EDGE:
				try {
					return getNeoLastEdge();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}
	
	
	
	//Add to ecore?
	protected abstract NeoAbstractPathParam getNeoAbstractPathParam();
	
	//for the counting
	protected abstract void setCount(InternalCount count);
//	protected void fillTheGapWithLastElement(NeoSimpleEdgeImpl edgeRemove) {
//		int ix = NeoPathPartImpl.EDGES.indexOf(edgeRemove);
//		int edgeCounterNumber = NeoPathPartImpl.EDGES.get(ix).getEdgeNumber();
//		if (ix != (NeoPathPartImpl.EDGES.size() - 1)) {
//			NeoPathPartImpl.EDGES.set(ix, NeoPathPartImpl.EDGES.get((NeoPathPartImpl.EDGES.size() - 1)));
//			NeoPathPartImpl.EDGES.get(ix).setEdgeNumber(edgeCounterNumber);
//		} else {
//			NeoPathPartImpl.EDGES.remove(edgeRemove);
//		}
//	}
	//END
} //NeoPathPartImpl
