/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPathPart;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.textrepresentation.ParameterReference;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Attribute Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#isPredefined <em>Predefined</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#getParameterReferences <em>Parameter References</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#getNeoPath <em>Neo Path</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#getNeoPropertyEdge <em>Neo Property Edge</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoPropertyPathParamImpl#getNeoPropertyName <em>Neo Property Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoPropertyPathParamImpl extends PatternElementImpl implements NeoPropertyPathParam {
	/**
	 * The default value of the '{@link #isPredefined() <em>Predefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREDEFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPredefined() <em>Predefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredefined()
	 * @generated
	 * @ordered
	 */
	protected boolean predefined = PREDEFINED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterReferences() <em>Parameter References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterReference> parameterReferences;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterList getParameterList() {
		if (eContainerFeatureID() != AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST) return null;
		return (ParameterList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParameterList, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterList(ParameterList newParameterList) {
		if (newParameterList != eInternalContainer() || (eContainerFeatureID() != AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST && newParameterList != null)) {
			if (EcoreUtil.isAncestor(this, newParameterList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParameterList != null)
				msgs = ((InternalEObject)newParameterList).eInverseAdd(this, ParametersPackage.PARAMETER_LIST__PARAMETERS, ParameterList.class, msgs);
			msgs = basicSetParameterList(newParameterList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST, newParameterList, newParameterList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPredefined() {
		return predefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPredefined(boolean newPredefined) {
		boolean oldPredefined = predefined;
		predefined = newPredefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PREDEFINED, oldPredefined, predefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterReference> getParameterReferences() {
		if (parameterReferences == null) {
			parameterReferences = new EObjectWithInverseResolvingEList.ManyInverse<ParameterReference>(ParameterReference.class, this, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_REFERENCES, TextrepresentationPackage.PARAMETER_REFERENCE__PARAMETER);
		}
		return parameterReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__DESCRIPTION, oldDescription, description));
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
	@Override
	public EList<NeoAbstractEdge> getLastRelations() {
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
	public EList<Parameter> validateAgainstSchema() {
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
	public void validateExampleValue(String val) throws InvalidityException {
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParameterList((ParameterList)otherEnd, msgs);
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterReferences()).basicAdd(otherEnd, msgs);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST:
				return basicSetParameterList(null, msgs);
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_REFERENCES:
				return ((InternalEList<?>)getParameterReferences()).basicRemove(otherEnd, msgs);
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST:
				return eInternalContainer().eInverseRemove(this, ParametersPackage.PARAMETER_LIST__PARAMETERS, ParameterList.class, msgs);
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST:
				return getParameterList();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PREDEFINED:
				return isPredefined();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_REFERENCES:
				return getParameterReferences();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__DESCRIPTION:
				return getDescription();
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST:
				setParameterList((ParameterList)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PREDEFINED:
				setPredefined((Boolean)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_REFERENCES:
				getParameterReferences().clear();
				getParameterReferences().addAll((Collection<? extends ParameterReference>)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__DESCRIPTION:
				setDescription((String)newValue);
				return;
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST:
				setParameterList((ParameterList)null);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PREDEFINED:
				setPredefined(PREDEFINED_EDEFAULT);
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_REFERENCES:
				getParameterReferences().clear();
				return;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST:
				return getParameterList() != null;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PREDEFINED:
				return predefined != PREDEFINED_EDEFAULT;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_REFERENCES:
				return parameterReferences != null && !parameterReferences.isEmpty();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Parameter.class) {
			switch (derivedFeatureID) {
				case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST: return ParametersPackage.PARAMETER__PARAMETER_LIST;
				case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PREDEFINED: return ParametersPackage.PARAMETER__PREDEFINED;
				case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_REFERENCES: return ParametersPackage.PARAMETER__PARAMETER_REFERENCES;
				case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__DESCRIPTION: return ParametersPackage.PARAMETER__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == NeoAbstractPathParam.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Parameter.class) {
			switch (baseFeatureID) {
				case ParametersPackage.PARAMETER__PARAMETER_LIST: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_LIST;
				case ParametersPackage.PARAMETER__PREDEFINED: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PREDEFINED;
				case ParametersPackage.PARAMETER__PARAMETER_REFERENCES: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__PARAMETER_REFERENCES;
				case ParametersPackage.PARAMETER__DESCRIPTION: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == NeoAbstractPathParam.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Parameter.class) {
			switch (baseOperationID) {
				case ParametersPackage.PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___VALIDATE__DIAGNOSTICCHAIN_MAP;
				case ParametersPackage.PARAMETER___VALIDATE_AGAINST_SCHEMA: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___VALIDATE_AGAINST_SCHEMA;
				case ParametersPackage.PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING;
				case ParametersPackage.PARAMETER___INPUT_IS_VALID: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___INPUT_IS_VALID;
				case ParametersPackage.PARAMETER___IS_USED: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___IS_USED;
				case ParametersPackage.PARAMETER___SET_VALUE_FROM_STRING__STRING: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___SET_VALUE_FROM_STRING__STRING;
				case ParametersPackage.PARAMETER___GET_VALUE_AS_STRING: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___GET_VALUE_AS_STRING;
				case ParametersPackage.PARAMETER___CHECK_COMPARISON_CONSISTENCY: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY;
				case ParametersPackage.PARAMETER___GET_OPTIONS_AS_STRING_LIST: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST;
				case ParametersPackage.PARAMETER___GENERATE_DESCRIPTION: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___GENERATE_DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == NeoAbstractPathParam.class) {
			switch (baseOperationID) {
				case AdaptionNeo4JPackage.NEO_ABSTRACT_PATH_PARAM___GET_LAST_RELATIONS: return AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___GET_LAST_RELATIONS;
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
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___SET_NEO_PROPERTY_NAME__STRING:
				setNeoPropertyName((String)arguments.get(0));
				return null;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___GET_LAST_RELATIONS:
				return getLastRelations();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___VALIDATE_AGAINST_SCHEMA:
				return validateAgainstSchema();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___VALIDATE_EXAMPLE_VALUE__STRING:
				try {
					validateExampleValue((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___INPUT_IS_VALID:
				return inputIsValid();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___IS_USED:
				return isUsed();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___SET_VALUE_FROM_STRING__STRING:
				try {
					setValueFromString((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___GET_VALUE_AS_STRING:
				return getValueAsString();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___CHECK_COMPARISON_CONSISTENCY:
				try {
					checkComparisonConsistency();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___GET_OPTIONS_AS_STRING_LIST:
				return getOptionsAsStringList();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___GENERATE_DESCRIPTION:
				return generateDescription();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___CREATE_PARAMETERS:
				createParameters();
				return null;
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
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
		result.append(" (predefined: ");
		result.append(predefined);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean inputIsValid() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUsed() {
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
	public void setValueFromString(String value) throws InvalidityException {
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
	public String getValueAsString() {
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
	public void checkComparisonConsistency() throws InvalidityException {
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
	public String getOptionsAsStringList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

} //NeoAttributePathParamImpl
