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
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;

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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl#isTranslated <em>Translated</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl#getNeoPathParam <em>Neo Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathPartImpl#getNeoPropertyPathParam <em>Neo Property Path Param</em>}</li>
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
	//BEGIN -- For Counting the Edges for the nameing in Neo4J
	protected static final int COUNTER_EDEFAULT = 0;
	protected static int COUNTER = NeoPathPartImpl.COUNTER_EDEFAULT;
	//protected static List<NeoSimpleEdgeImpl> EDGES = new ArrayList<>();
	//END -- For Counting the Edges for the nameing in Neo4J

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
	public EList<NeoSimpleEdge> getSimpleEdges() {
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
	public String getCypherVariable() {
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
			case AdaptionNeo4JPackage.NEO_PATH_PART___GET_SIMPLE_EDGES:
				return getSimpleEdges();
			case AdaptionNeo4JPackage.NEO_PATH_PART___GET_CYPHER_VARIABLE:
				return getCypherVariable();
			case AdaptionNeo4JPackage.NEO_PATH_PART___GENERATE_CYPHER_WITHOUT_LABELS:
				try {
					return generateCypherWithoutLabels();
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
		result.append(')');
		return result.toString();
	}

	//BEGIN -- COUNTER METHODS
	public void unsetCOUNTER() {
		NeoPathPartImpl.COUNTER = NeoPathPartImpl.COUNTER_EDEFAULT;
	}
	
	protected int getCOUNTER() {
		return NeoPathPartImpl.COUNTER;
	}
	
	protected void setCOUNTER(int newCOUNTER) {
		NeoPathPartImpl.COUNTER = newCOUNTER;
	}
	
	protected void increaseClassCounter() {
		if (NeoPathPartImpl.COUNTER == Integer.MAX_VALUE) {
			System.out.println("No new NeoEdges can be created. First delete some of your existing eges!");
			return;
		}
		NeoPathPartImpl.COUNTER++;
	}
	
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
