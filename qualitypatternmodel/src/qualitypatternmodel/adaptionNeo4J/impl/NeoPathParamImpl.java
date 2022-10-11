/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo4 JPath Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl#getNeoEdge <em>Neo Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPathParamImpl#getNeoPathPart <em>Neo Path Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPathParamImpl extends NeoAbstractPathParamImpl implements NeoPathParam {
	private static final String NEO_PATH_PARAM = "NeoPathParam [%s]";

	/**
	 * The cached value of the '{@link #getNeoEdge() <em>Neo Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoEdge()
	 * @generated
	 * @ordered
	 */
	protected NeoEdge neoEdge;

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
	 * @generated NOT
	 */
	protected NeoPathParamImpl() {
		super();
		setNeoPathPart(new NeoSimpleEdgeImpl());
	}

	// --> Specific behaviour which can not be necessarily generalised
	@Override
	public String generateCypher() throws InvalidityException {
		if (neoPathPart != null) {
			final StringBuilder cypher = new StringBuilder();
			EList<NeoPathPart> neoPathParts = getNeoPathPart().getNeoPathPartEdges();
			
			if (neoPathParts == null || neoPathParts.size() == 0) throw new InvalidityException("NeoEdge - NeoParts can not be empty");
			if (neoPathParts.size() > 1) {
					generateMultiEdgeCypher(cypher);
			} else {
				generateSingeEdgeCypher(cypher, neoPathParts);
			} 
			return cypher.toString();
		}
		return CypherSpecificConstants.SPECIAL_CYPHER_MULTIPLE_EDGES_NODES;	
	}

	private void generateSingeEdgeCypher(final StringBuilder cypher, final EList<NeoPathPart> neoPathParts)
			throws InvalidityException {
		if (!(neoPathParts.get(0) instanceof NeoSimpleEdgeImpl))
				throw new InvalidityException("Wrong type of Edge");
		cypher.append(neoPathParts.get(0).generateCypher());
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParts.get(0);
		if (checkTargetNodes(neoSimpleEdge)) { 
			cypher.append(CypherSpecificConstants.SPECIAL_CYPHER_MULTIPLE_EDGES_NODES); 
		}
	}

	private void generateMultiEdgeCypher(final StringBuilder cypher) throws InvalidityException {
		final NeoPathPart neoPathPart = getNeoPathPart();
		cypher.append(neoPathPart.generateCypher());

		NeoPathPart lastEdge = null;
		//Every ComplexEdge needs a last SimpleEdge 
		//--> Maybe can be checked in the Container 
		//--> Specific check which can not be out outsourced
		lastEdge = neoPathPart.getNeoLastEdge();
		if (lastEdge != null) {
			NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) lastEdge;
			if (checkTargetNodes(neoSimpleEdge)) {
				cypher.append(CypherSpecificConstants.SPECIAL_CYPHER_MULTIPLE_EDGES_NODES);
			}
		} else {
			throw new InvalidityException("NeoEdge - The last NeoPathPart has to be specified as lastEdge");
		}
	}

	private boolean checkTargetNodes(NeoSimpleEdge neoSimpleEdge) {
		//Letzter Branch ist nicht testbar, da wenn == null kann es nicht X Element haben
		return neoSimpleEdge.getNeoTargetNodeLabels() != null && 
					neoSimpleEdge.getNeoTargetNodeLabels().getValues().size() != 0;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		NeoSimpleEdgeImpl nse = new NeoSimpleEdgeImpl();
		setNeoPathPart(nse);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public NotificationChain basicSetNeoEdge(NeoEdge newNeoEdge, NotificationChain msgs) {
		triggerParameterUpdates(newNeoEdge);
		NeoEdge oldNeoEdge = neoEdge;
		neoEdge = newNeoEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE, oldNeoEdge, newNeoEdge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}
	
	@Override
	public boolean inputIsValid() {
		try {
			getNeoPathPart().isValid(AbstractionLevel.CONCRETE);
			return true; 
		} catch (Exception e) {
			return false;
		}
	}

	@Override 
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String myToString() {
		String result = String.format(NEO_PATH_PARAM, getInternalId());
		try {
			result += " " + generateCypher();
		} catch (InvalidityException e) {}
		return result;
	}

	//
	@Override
	protected int getRelationNumber() {
		if (getNeoEdge() == null) {
			return -1;
		}
		return getNeoEdge().getOriginalID();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_PATH_PARAM;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoEdge getNeoEdge() {
		if (neoEdge != null && neoEdge.eIsProxy()) {
			InternalEObject oldNeoEdge = (InternalEObject)neoEdge;
			neoEdge = (NeoEdge)eResolveProxy(oldNeoEdge);
			if (neoEdge != oldNeoEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE, oldNeoEdge, neoEdge));
			}
		}
		return neoEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoEdge basicGetNeoEdge() {
		return neoEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoEdge(NeoEdge newNeoEdge) {
		if (newNeoEdge != neoEdge) {
			NotificationChain msgs = null;
			if (neoEdge != null)
				msgs = ((InternalEObject)neoEdge).eInverseRemove(this, AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM, NeoEdge.class, msgs);
			if (newNeoEdge != null)
				msgs = ((InternalEObject)newNeoEdge).eInverseAdd(this, AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM, NeoEdge.class, msgs);
			msgs = basicSetNeoEdge(newNeoEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE, newNeoEdge, newNeoEdge));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH_PART, oldNeoPathPart, newNeoPathPart);
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
				msgs = ((InternalEObject)neoPathPart).eInverseRemove(this, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM, NeoPathPart.class, msgs);
			if (newNeoPathPart != null)
				msgs = ((InternalEObject)newNeoPathPart).eInverseAdd(this, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PATH_PARAM, NeoPathPart.class, msgs);
			msgs = basicSetNeoPathPart(newNeoPathPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH_PART, newNeoPathPart, newNeoPathPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE:
				if (neoEdge != null)
					msgs = ((InternalEObject)neoEdge).eInverseRemove(this, AdaptionNeo4JPackage.NEO_EDGE__NEO_PATH_PARAM, NeoEdge.class, msgs);
				return basicSetNeoEdge((NeoEdge)otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH_PART:
				if (neoPathPart != null)
					msgs = ((InternalEObject)neoPathPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH_PART, null, msgs);
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
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE:
				return basicSetNeoEdge(null, msgs);
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH_PART:
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
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE:
				if (resolve) return getNeoEdge();
				return basicGetNeoEdge();
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH_PART:
				return getNeoPathPart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE:
				setNeoEdge((NeoEdge)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH_PART:
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
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE:
				setNeoEdge((NeoEdge)null);
				return;
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH_PART:
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
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_EDGE:
				return neoEdge != null;
			case AdaptionNeo4JPackage.NEO_PATH_PARAM__NEO_PATH_PART:
				return neoPathPart != null;
		}
		return super.eIsSet(featureID);
	}
} //Neo4JPathParamImpl
