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
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
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
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#getNeoPath <em>Neo Path</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#getNeoPropertyEdge <em>Neo Property Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#getNeoPropertyName <em>Neo Property Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPropertyPathParamImpl extends NeoAbstractPathParamImpl implements NeoPropertyPathParam {
	/**
	 * The cached value of the '{@link #getNeoPath() <em>Neo Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoPath()
	 * @generated
	 * @ordered
	 */
	protected NeoPathPart neoPath;

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
	
	@Override 
	public String generateCypher() throws InvalidityException {
		String cypher = "";
		//If there is no NeoPath the NeoProperty is inside of the NeoNode
		//Else diffrent constellations are possible how to build the relation between the origin node and the node for the property
		if (getNeoPath() != null) {
			NeoPathPartImpl np = (NeoPathPartImpl) getNeoPath();
			cypher += np.generateCypher();
		}
		return cypher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPathPart getNeoPath() {
		if (neoPath != null && neoPath.eIsProxy()) {
			InternalEObject oldNeoPath = (InternalEObject)neoPath;
			neoPath = (NeoPathPart)eResolveProxy(oldNeoPath);
			if (neoPath != oldNeoPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH, oldNeoPath, neoPath));
			}
		}
		return neoPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoPathPart basicGetNeoPath() {
		return neoPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoPath(NeoPathPart newNeoPath) {
		NeoPathPart oldNeoPath = neoPath;
		neoPath = newNeoPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH, oldNeoPath, neoPath));
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
	 * @generated
	 */
	@Override
	public TextLiteralParam getNeoPropertyName() {
		if (neoPropertyName != null && neoPropertyName.eIsProxy()) {
			InternalEObject oldNeoPropertyName = (InternalEObject)neoPropertyName;
			neoPropertyName = (TextLiteralParam)eResolveProxy(oldNeoPropertyName);
			if (neoPropertyName != oldNeoPropertyName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME, oldNeoPropertyName, neoPropertyName));
			}
		}
		return neoPropertyName;
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH:
				if (resolve) return getNeoPath();
				return basicGetNeoPath();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				if (resolve) return getNeoPropertyEdge();
				return basicGetNeoPropertyEdge();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
				if (resolve) return getNeoPropertyName();
				return basicGetNeoPropertyName();
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH:
				setNeoPath((NeoPathPart)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				setNeoPropertyEdge((NeoPropertyEdge)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
				setNeoPropertyName((TextLiteralParam)newValue);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH:
				setNeoPath((NeoPathPart)null);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				setNeoPropertyEdge((NeoPropertyEdge)null);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
				setNeoPropertyName((TextLiteralParam)null);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PATH:
				return neoPath != null;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE:
				return neoPropertyEdge != null;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME:
				return neoPropertyName != null;
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

	@Override
	public boolean inputIsValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}
} //NeoAttributePathParamImpl
