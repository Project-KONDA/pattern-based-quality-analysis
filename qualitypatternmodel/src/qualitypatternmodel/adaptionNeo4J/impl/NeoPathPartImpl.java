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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl#getNeoPathParam <em>Neo Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl#getNeoPropertyPathParam <em>Neo Property Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl#isIsLastEdge <em>Is Last Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl#getNeoComplexEdge <em>Neo Complex Edge</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NeoPathPartImpl extends PatternElementImpl implements NeoPathPart {
	
	/**
	 * The default value of the '{@link #isTranslated() <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSLATED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTranslated() <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslated()
	 * @generated
	 * @ordered
	 */
	protected boolean translated = TRANSLATED_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsLastEdge() <em>Is Last Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLastEdge()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LAST_EDGE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsLastEdge() <em>Is Last Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLastEdge()
	 * @generated
	 * @ordered
	 */
	protected boolean isLastEdge = IS_LAST_EDGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNeoComplexEdge() <em>Neo Complex Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoComplexEdge()
	 * @generated
	 * @ordered
	 */
	protected NeoComplexEdge neoComplexEdge;

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
	public boolean isTranslated() {
		return translated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTranslated(boolean newTranslated) {
		boolean oldTranslated = translated;
		translated = newTranslated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PART__TRANSLATED, oldTranslated, translated));
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
	public boolean isIsLastEdge() {
		return isLastEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsLastEdge(boolean newIsLastEdge) {
		boolean oldIsLastEdge = isLastEdge;
		isLastEdge = newIsLastEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PART__IS_LAST_EDGE, oldIsLastEdge, isLastEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoComplexEdge getNeoComplexEdge() {
		if (neoComplexEdge != null && neoComplexEdge.eIsProxy()) {
			InternalEObject oldNeoComplexEdge = (InternalEObject)neoComplexEdge;
			neoComplexEdge = (NeoComplexEdge)eResolveProxy(oldNeoComplexEdge);
			if (neoComplexEdge != oldNeoComplexEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE, oldNeoComplexEdge, neoComplexEdge));
			}
		}
		return neoComplexEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoComplexEdge basicGetNeoComplexEdge() {
		return neoComplexEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoComplexEdge(NeoComplexEdge newNeoComplexEdge) {
		NeoComplexEdge oldNeoComplexEdge = neoComplexEdge;
		neoComplexEdge = newNeoComplexEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE, oldNeoComplexEdge, neoComplexEdge));
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
	public String generateCypherWithoutLabels() throws InvalidityException {
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
	public String getCypherInnerEdgeNodes() throws InvalidityException {
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
	public String getReturnCypherInnerEdgeNodes() throws InvalidityException {
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
			case AdaptionNeo4JPackage.NEO_PATH_PART__TRANSLATED:
				return isTranslated();
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				return getNeoPathParam();
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM:
				return getNeoPropertyPathParam();
			case AdaptionNeo4JPackage.NEO_PATH_PART__IS_LAST_EDGE:
				return isIsLastEdge();
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
				if (resolve) return getNeoComplexEdge();
				return basicGetNeoComplexEdge();
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
			case AdaptionNeo4JPackage.NEO_PATH_PART__TRANSLATED:
				setTranslated((Boolean)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				setNeoPathParam((NeoPathParam)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM:
				setNeoPropertyPathParam((NeoPropertyPathParam)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PART__IS_LAST_EDGE:
				setIsLastEdge((Boolean)newValue);
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
			case AdaptionNeo4JPackage.NEO_PATH_PART__TRANSLATED:
				setTranslated(TRANSLATED_EDEFAULT);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				setNeoPathParam((NeoPathParam)null);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM:
				setNeoPropertyPathParam((NeoPropertyPathParam)null);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PART__IS_LAST_EDGE:
				setIsLastEdge(IS_LAST_EDGE_EDEFAULT);
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
			case AdaptionNeo4JPackage.NEO_PATH_PART__TRANSLATED:
				return translated != TRANSLATED_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM:
				return getNeoPathParam() != null;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM:
				return getNeoPropertyPathParam() != null;
			case AdaptionNeo4JPackage.NEO_PATH_PART__IS_LAST_EDGE:
				return isLastEdge != IS_LAST_EDGE_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_PATH_PART__NEO_COMPLEX_EDGE:
				return neoComplexEdge != null;
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
			case AdaptionNeo4JPackage.NEO_PATH_PART___GENERATE_CYPHER_WITHOUT_LABELS:
				try {
					return generateCypherWithoutLabels();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_PATH_PART___IS_LAST_EDGE:
				return isLastEdge();
			case AdaptionNeo4JPackage.NEO_PATH_PART___GET_CYPHER_INNER_EDGE_NODES:
				try {
					return getCypherInnerEdgeNodes();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_PATH_PART___GET_RETURN_CYPHER_INNER_EDGE_NODES:
				try {
					return getReturnCypherInnerEdgeNodes();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (translated: ");
		result.append(translated);
		result.append(", isLastEdge: ");
		result.append(isLastEdge);
		result.append(')');
		return result.toString();
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
