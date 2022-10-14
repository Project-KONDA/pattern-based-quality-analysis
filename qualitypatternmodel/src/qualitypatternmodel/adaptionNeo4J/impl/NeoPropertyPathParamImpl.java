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
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Attribute Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#getNeoPropertyEdge <em>Neo Property Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#getNeoPropertyName <em>Neo Property Name</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#getNeoPathPart <em>Neo Path Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPropertyPathParamImpl extends NeoAbstractPathParamImpl implements NeoPropertyPathParam {
	private static final String NEO_PROPERTY_EDGE_TARGET_NODES_CAN_NOT_BE_NULL = "NeoPropertyEdge - TargetNodes can not be null";
	private static final String NEO_PROPERTY_EDGE_LAST_EDGE_HAS_TO_BE_SET = "NeoPropertyEdge - Last Edge has to be set";
	private static final String NEO_PROPERTY_PATH_PARAM = "NeoPropertyPathParam [%s]";

	/**
	 * The cached value of the '{@link #getNeoPropertyEdge() <em>Neo Property Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPropertyEdge()
	 * @generated
	 * @ordered
	 */
	protected NeoPropertyEdge neoPropertyEdge;

	/**
	 * The cached value of the '{@link #getNeoPropertyName() <em>Neo Property Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPropertyName()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam neoPropertyName;

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
	protected NeoPropertyPathParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_PROPERTY_PATH_PARAM;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART, oldNeoPathPart, newNeoPathPart);
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
				msgs = ((InternalEObject)neoPathPart).eInverseRemove(this, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM, NeoPathPart.class, msgs);
			if (newNeoPathPart != null)
				msgs = ((InternalEObject)newNeoPathPart).eInverseAdd(this, AdaptionNeo4JPackage.NEO_PATH_PART__NEO_PROPERTY_PATH_PARAM, NeoPathPart.class, msgs);
			msgs = basicSetNeoPathPart(newNeoPathPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART, newNeoPathPart, newNeoPathPart));
	}

	//Is it okay that I do the check here or shall I do the check in the Parts?
	//Checks the diffrent Componentes of the PARAM --> Composite
	@Override 
	public String generateCypher() throws InvalidityException {
		String cypher = null;
		if (getNeoPathPart() != null) {
			validateNeoPropertyEdge();
			cypher = getNeoPathPart().generateCypher();
		}
		return cypher;
	}

	//Check if the check for ComplexEdge // NeoSimpleEdge is necessary...
	private void validateNeoPropertyEdge() throws InvalidityException {
		final NeoPathPart neoPathPart = getNeoPathPart();
		if (neoPathPart instanceof NeoComplexEdge) {
			final NeoPathPart neoLastEdge = neoPathPart.getNeoLastEdge();
			if (neoLastEdge == null) {
				throw new InvalidityException(NEO_PROPERTY_EDGE_LAST_EDGE_HAS_TO_BE_SET);
			}
		}
		if (!innerEdgesHaveTargets(getNeoPathPart().getNeoPathPartEdgeLeafs())) {
			targetNodesCanNotBeNull();
		}
	}
	
	private boolean innerEdgesHaveTargets(final EList<NeoPathPart> parts)  {
		boolean innerEdgesHaveTargets = true;
		NeoSimpleEdgeImpl neoSimpleEdge = null;
		for (NeoPathPart part : parts) {
			if (part instanceof NeoComplexEdge) {
				this.innerEdgesHaveTargets(part.getNeoPathPartEdgeLeafs());
			} else {
				if(part instanceof NeoSimpleEdge) {
					neoSimpleEdge = (NeoSimpleEdgeImpl) part;
					if (!neoSimpleEdge.isLastEdge()) {
						if (checkTargetNodes(neoSimpleEdge)) {
							innerEdgesHaveTargets = false;
						}
					}	
				}
			}
		}
		return innerEdgesHaveTargets;
	}
		
	private void targetNodesCanNotBeNull() throws InvalidityException {
		throw new InvalidityException(NEO_PROPERTY_EDGE_TARGET_NODES_CAN_NOT_BE_NULL);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPropertyEdge getNeoPropertyEdge() {
		if (neoPropertyEdge != null && neoPropertyEdge.eIsProxy()) {
			InternalEObject oldNeoPropertyEdge = (InternalEObject)neoPropertyEdge;
			neoPropertyEdge = (NeoPropertyEdge)eResolveProxy(oldNeoPropertyEdge);
			if (neoPropertyEdge != oldNeoPropertyEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, oldNeoPropertyEdge, neoPropertyEdge));
			}
		}
		return neoPropertyEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoPropertyEdge basicGetNeoPropertyEdge() {
		return neoPropertyEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeoPropertyEdge(NeoPropertyEdge newNeoPropertyEdge, NotificationChain msgs) {
		NeoPropertyEdge oldNeoPropertyEdge = neoPropertyEdge;
		neoPropertyEdge = newNeoPropertyEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, oldNeoPropertyEdge, newNeoPropertyEdge);
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
	public void setNeoPropertyEdge(NeoPropertyEdge newNeoPropertyEdge) {
		if (newNeoPropertyEdge != neoPropertyEdge) {
			NotificationChain msgs = null;
			if (neoPropertyEdge != null)
				msgs = ((InternalEObject)neoPropertyEdge).eInverseRemove(this, AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, NeoPropertyEdge.class, msgs);
			if (newNeoPropertyEdge != null)
				msgs = ((InternalEObject)newNeoPropertyEdge).eInverseAdd(this, AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, NeoPropertyEdge.class, msgs);
			msgs = basicSetNeoPropertyEdge(newNeoPropertyEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE, newNeoPropertyEdge, newNeoPropertyEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public String getNeoPropertyName() {
		if (neoPropertyName != null && neoPropertyName.eIsProxy()) {
			InternalEObject oldNeoPropertyName = (InternalEObject)neoPropertyName;
			neoPropertyName = (TextLiteralParam)eResolveProxy(oldNeoPropertyName);
			if (neoPropertyName != oldNeoPropertyName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME, oldNeoPropertyName, neoPropertyName));
			}
		}
		return neoPropertyName != null ? neoPropertyName.getValue() : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteralParam basicGetNeoPropertyName() {
		return neoPropertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoPropertyName(TextLiteralParam newNeoPropertyName) {
		TextLiteralParam oldNeoPropertyName = neoPropertyName;
		neoPropertyName = newNeoPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME, oldNeoPropertyName, neoPropertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setNeoPropertyName(String neoPropertyName) {
		if (neoPropertyName != null  && neoPropertyName.length() != 0) {
			TextLiteralParam literalNeoPropertyName = new TextLiteralParamImpl(neoPropertyName);
			this.neoPropertyName = literalNeoPropertyName;
		} else if (neoPropertyName == null) {
			setNeoPropertyName((TextLiteralParam) null);
		}
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				if (neoPropertyEdge != null)
					msgs = ((InternalEObject)neoPropertyEdge).eInverseRemove(this, AdaptionNeo4JPackage.NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM, NeoPropertyEdge.class, msgs);
				return basicSetNeoPropertyEdge((NeoPropertyEdge)otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART:
				if (neoPathPart != null)
					msgs = ((InternalEObject)neoPathPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART, null, msgs);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				return basicSetNeoPropertyEdge(null, msgs);
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART:
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				if (resolve) return getNeoPropertyEdge();
				return basicGetNeoPropertyEdge();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
				if (resolve) return getNeoPropertyName();
				return basicGetNeoPropertyName();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART:
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				setNeoPropertyEdge((NeoPropertyEdge)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
				setNeoPropertyName((TextLiteralParam)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART:
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				setNeoPropertyEdge((NeoPropertyEdge)null);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
				setNeoPropertyName((TextLiteralParam)null);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART:
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				return neoPropertyEdge != null;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
				return neoPropertyName != null;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH_PART:
				return neoPathPart != null;
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___SET_NEO_PROPERTY_NAME__STRING:
				setNeoPropertyName((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	//Speak with Arno
	@Override
	public boolean inputIsValid() {
		try{
			getNeoPathPart().isValid(AbstractionLevel.CONCRETE);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	//Speak with Arno
	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String myToString() {
		String result = String.format(NEO_PROPERTY_PATH_PARAM, getInternalId());
		try {
			String temp = generateCypher();
			if (temp != null) {
				result += " " + generateCypher();
			} else if (neoPropertyName != null) {
				result += " " + getNeoPropertyEdge().generateCypherPropertyAddressing();
			}
		} catch (InvalidityException e) {
			System.out.println(e);
		} 
		return result;
	}

	@Override
	protected int getRelationNumber() {
		if (getNeoPropertyEdge() == null) {
			return -1;
		}
		return getNeoPropertyEdge().getOriginalID();
	}
} //NeoAttributePathParamImpl
