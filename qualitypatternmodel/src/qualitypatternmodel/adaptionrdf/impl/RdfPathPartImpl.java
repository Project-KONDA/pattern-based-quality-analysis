/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.IriListParam;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathComponent;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfPathPart;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsRdf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Path Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl#getRdfPathParam <em>Rdf Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl#getRdfPath <em>Rdf Path</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl#getTargetNodeTypes <em>Target Node Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfPathPartImpl extends PatternElementImpl implements RdfPathPart {
	/**
	 * The cached value of the '{@link #getRdfPath() <em>Rdf Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfPath()
	 * @generated
	 * @ordered
	 */
	protected RdfPathComponent rdfPath;

	/**
	 * The cached value of the '{@link #getTargetNodeTypes() <em>Target Node Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNodeTypes()
	 * @generated
	 * @ordered
	 */
	protected IriListParam targetNodeTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RdfPathPartImpl() {
		super();
		setRdfPath(new RdfSinglePredicateImpl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.RDF_PATH_PART;
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		if (getRdfPath() == null)
			return ConstantsRdf.WILDCARD;
		return getRdfPath().generateSparql();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String generateRdfPartTypes(String variable) throws InvalidityException {
		String result = "";
		if (getTargetNodeTypes() != null)
			for (IriParam iri: getTargetNodeTypes().getIriParams()) {
				result += "\n" + variable + " " + RdfIriNodeImpl.RDF_PREDICATE + " " + iri.generateSparql() + "."; 
			}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getValueAsString() {
		String path = getRdfPath().getValueAsString();
		if (getTargetNodeTypes() == null || getTargetNodeTypes().getIriParams().isEmpty())
			return path;
		
		JSONObject job = new JSONObject();
		try {
			job.put(Constants.JSON_RDF_PATH, path);
			if (getTargetNodeTypes() != null)
				job.put(Constants.JSON_RDF_NODE_TYPE, getTargetNodeTypes().getValueAsString());
		} catch (JSONException e) {
			// never happens
		}
		return job.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueFromString(String value) throws InvalidityException {
		RdfPathComponent path;
		IriListParamImpl iri = null;
		try {
			JSONObject job = new JSONObject(value);
			path = RdfPathComponent.createNewRdfPathComponent(job.getString(Constants.JSON_RDF_PATH));
			if (job.has(Constants.JSON_RDF_NODE_TYPE)) {
				iri = new IriListParamImpl();
				iri.setValueFromString(job.getString(Constants.JSON_RDF_NODE_TYPE));
			}
		} catch (JSONException | InvalidityException e) {
			try {
				path = RdfPathComponent.createNewRdfPathComponent(value);
			} catch (InvalidityException f) {
				throw new InvalidityException("Cannot build a correct RdfPathComponent from '" + value + "'", f);
			}
		}
		if (path == null)
			throw new InvalidityException("Path cannot be null in RdfPathPart (" + value + ")");
		setRdfPath(path);
		setTargetNodeTypes(iri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfPathParam getRdfPathParam() {
		if (eContainerFeatureID() != AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM) return null;
		return (RdfPathParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfPathParam(RdfPathParam newRdfPathParam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdfPathParam, AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRdfPathParam(RdfPathParam newRdfPathParam) {
		if (newRdfPathParam != eInternalContainer() || (eContainerFeatureID() != AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM && newRdfPathParam != null)) {
			if (EcoreUtil.isAncestor(this, newRdfPathParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdfPathParam != null)
				msgs = ((InternalEObject)newRdfPathParam).eInverseAdd(this, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PARTS, RdfPathParam.class, msgs);
			msgs = basicSetRdfPathParam(newRdfPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM, newRdfPathParam, newRdfPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfPathComponent getRdfPath() {
		return rdfPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfPath(RdfPathComponent newRdfPath, NotificationChain msgs) {
		RdfPathComponent oldRdfPath = rdfPath;
		rdfPath = newRdfPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH, oldRdfPath, newRdfPath);
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
	public void setRdfPath(RdfPathComponent newRdfPath) {
		if (newRdfPath != rdfPath) {
			NotificationChain msgs = null;
			if (rdfPath != null)
				msgs = ((InternalEObject)rdfPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH, null, msgs);
			if (newRdfPath != null)
				msgs = ((InternalEObject)newRdfPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH, null, msgs);
			msgs = basicSetRdfPath(newRdfPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH, newRdfPath, newRdfPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public IriListParam getTargetNodeTypes() {
		if (targetNodeTypes == null) {
			setTargetNodeTypes(new IriListParamImpl());
		}
		return targetNodeTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetNodeTypes(IriListParam newTargetNodeTypes, NotificationChain msgs) {
		IriListParam oldTargetNodeTypes = targetNodeTypes;
		targetNodeTypes = newTargetNodeTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PART__TARGET_NODE_TYPES, oldTargetNodeTypes, newTargetNodeTypes);
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
	public void setTargetNodeTypes(IriListParam newTargetNodeTypes) {
		if (newTargetNodeTypes != targetNodeTypes) {
			NotificationChain msgs = null;
			if (targetNodeTypes != null)
				msgs = ((InternalEObject)targetNodeTypes).eInverseRemove(this, AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART, IriListParam.class, msgs);
			if (newTargetNodeTypes != null)
				msgs = ((InternalEObject)newTargetNodeTypes).eInverseAdd(this, AdaptionrdfPackage.IRI_LIST_PARAM__RDF_PATH_PART, IriListParam.class, msgs);
			msgs = basicSetTargetNodeTypes(newTargetNodeTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PART__TARGET_NODE_TYPES, newTargetNodeTypes, newTargetNodeTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRdfPathParam((RdfPathParam)otherEnd, msgs);
			case AdaptionrdfPackage.RDF_PATH_PART__TARGET_NODE_TYPES:
				if (targetNodeTypes != null)
					msgs = ((InternalEObject)targetNodeTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionrdfPackage.RDF_PATH_PART__TARGET_NODE_TYPES, null, msgs);
				return basicSetTargetNodeTypes((IriListParam)otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
				return basicSetRdfPathParam(null, msgs);
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH:
				return basicSetRdfPath(null, msgs);
			case AdaptionrdfPackage.RDF_PATH_PART__TARGET_NODE_TYPES:
				return basicSetTargetNodeTypes(null, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PARTS, RdfPathParam.class, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
				return getRdfPathParam();
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH:
				return getRdfPath();
			case AdaptionrdfPackage.RDF_PATH_PART__TARGET_NODE_TYPES:
				return getTargetNodeTypes();
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
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
				setRdfPathParam((RdfPathParam)newValue);
				return;
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH:
				setRdfPath((RdfPathComponent)newValue);
				return;
			case AdaptionrdfPackage.RDF_PATH_PART__TARGET_NODE_TYPES:
				setTargetNodeTypes((IriListParam)newValue);
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
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
				setRdfPathParam((RdfPathParam)null);
				return;
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH:
				setRdfPath((RdfPathComponent)null);
				return;
			case AdaptionrdfPackage.RDF_PATH_PART__TARGET_NODE_TYPES:
				setTargetNodeTypes((IriListParam)null);
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
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
				return getRdfPathParam() != null;
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH:
				return rdfPath != null;
			case AdaptionrdfPackage.RDF_PATH_PART__TARGET_NODE_TYPES:
				return targetNodeTypes != null;
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
			case AdaptionrdfPackage.RDF_PATH_PART___GENERATE_RDF_PART_TYPES__STRING:
				try {
					return generateRdfPartTypes((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionrdfPackage.RDF_PATH_PART___GET_VALUE_AS_STRING:
				return getValueAsString();
			case AdaptionrdfPackage.RDF_PATH_PART___SET_VALUE_FROM_STRING__STRING:
				try {
					setValueFromString((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String myToString() {
		String result = "rdfpathpart [" + getInternalId() + "]";
		try {
			result += " ";
			result += generateSparql();
		} catch (InvalidityException e) {
		}
		return result;
	}

} //RdfPathPartImpl
