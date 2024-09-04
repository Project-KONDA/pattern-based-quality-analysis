/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.IriListParam;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.impl.ParameterValueImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iri Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriParamImpl#getRdfSinglePredicate <em>Rdf Single Predicate</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriParamImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriParamImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriParamImpl#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriParamImpl#getIriListParam <em>Iri List Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IriParamImpl extends ParameterValueImpl implements IriParam {
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;
	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected String suffix = SUFFIX_EDEFAULT;

	public static Map<String, String> standardIris;
	static {
		standardIris = new HashMap<>();
		standardIris.put("rdf"		, "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
		standardIris.put("rdfs"		, "http://www.w3.org/2000/01/rdf-schema#");
		standardIris.put("xsd"		, "http://www.w3.org/2001/XMLSchema#");
		standardIris.put("wikibase"	, "http://wikiba.se/ontology#");
		standardIris.put("wd"		, "http://www.wikidata.org/entity/");
		standardIris.put("wdt"		, "http://www.wikidata.org/prop/direct/");
		standardIris.put("p"		, "http://www.wikidata.org/prop/>");
		standardIris.put("ps"		, "http://www.wikidata.org/prop/statement/");
		standardIris.put("pq"		, "http://www.wikidata.org/prop/qualifier/");
		standardIris.put("bd"		, "http://www.bigdata.com/rdf#");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IriParamImpl() {
		super();
	}

	public IriParamImpl(String value) throws InvalidityException {
		super();
		setValueFromString(value);
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.STRING;
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		int b = (prefix != null ? 1 : 0) + (suffix != null ? 1 : 0) + (uri != null ? 1 : 0);
		if((b == 1 && uri == null || b > 1 && uri != null || b == 0) && abstractionLevel == AbstractionLevel.CONCRETE) {
			throw new InvalidityException("invalid iri");
		}
	}

	@Override
	public String getValueAsString() {
		if (prefix == null && suffix == null && uri == null) {
			return null;
		}
		try {
			return generateSparql();
		} catch (InvalidityException e) {
			return null;
		}
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		if (value == null) {
			clear();
			return;
		}
		if (value.matches("[a-z]+:[a-zA-Z0-9]+")) {
			String[] parts = value.split(":");
			if (parts.length == 2) {
				setPrefix(parts[0]);
				setSuffix(parts[1]);
				return;
			}
		}
		else if (value.matches("<[a-zA-A0-9]+>")) {
			setUri(value.substring(1, value.length()-1));
			return;
		}
		throw new InvalidityException("Value \"" + value + "\" not valid for IriParam");
	}

	@Override
	public void clear() {
		setPrefix(null);
		setSuffix(null);
		setUri(null);
	}

	@Override
	public String generateSparql() throws InvalidityException {
		if(prefix != null && suffix != null) {
//			return "<" + standardIri + suffix + ">";
			return prefix + ":" + suffix;
		} else if (uri != null) {
			return "<" + uri + ">";
		} else if (getRdfSinglePredicate() != null) {
			return null;
		} else {
			return super.generateSparql();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.IRI_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfSinglePredicate getRdfSinglePredicate() {
		if (eContainerFeatureID() != AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE) return null;
		return (RdfSinglePredicate)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfSinglePredicate(RdfSinglePredicate newRdfSinglePredicate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdfSinglePredicate, AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRdfSinglePredicate(RdfSinglePredicate newRdfSinglePredicate) {
		if (newRdfSinglePredicate != eInternalContainer() || (eContainerFeatureID() != AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE && newRdfSinglePredicate != null)) {
			if (EcoreUtil.isAncestor(this, newRdfSinglePredicate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdfSinglePredicate != null)
				msgs = ((InternalEObject)newRdfSinglePredicate).eInverseAdd(this, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__IRI_PARAM, RdfSinglePredicate.class, msgs);
			msgs = basicSetRdfSinglePredicate(newRdfSinglePredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE, newRdfSinglePredicate, newRdfSinglePredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.IRI_PARAM__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.IRI_PARAM__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffix(String newSuffix) {
		String oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.IRI_PARAM__SUFFIX, oldSuffix, suffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IriListParam getIriListParam() {
		if (eContainerFeatureID() != AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM) return null;
		return (IriListParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIriListParam(IriListParam newIriListParam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIriListParam, AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIriListParam(IriListParam newIriListParam) {
		if (newIriListParam != eInternalContainer() || (eContainerFeatureID() != AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM && newIriListParam != null)) {
			if (EcoreUtil.isAncestor(this, newIriListParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIriListParam != null)
				msgs = ((InternalEObject)newIriListParam).eInverseAdd(this, AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAMS, IriListParam.class, msgs);
			msgs = basicSetIriListParam(newIriListParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM, newIriListParam, newIriListParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getStandardIri() {
		return standardIris.get(prefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRdfSinglePredicate((RdfSinglePredicate)otherEnd, msgs);
			case AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIriListParam((IriListParam)otherEnd, msgs);
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
			case AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE:
				return basicSetRdfSinglePredicate(null, msgs);
			case AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM:
				return basicSetIriListParam(null, msgs);
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
			case AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE:
				return eInternalContainer().eInverseRemove(this, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__IRI_PARAM, RdfSinglePredicate.class, msgs);
			case AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionrdfPackage.IRI_LIST_PARAM__IRI_PARAMS, IriListParam.class, msgs);
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
			case AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE:
				return getRdfSinglePredicate();
			case AdaptionrdfPackage.IRI_PARAM__PREFIX:
				return getPrefix();
			case AdaptionrdfPackage.IRI_PARAM__URI:
				return getUri();
			case AdaptionrdfPackage.IRI_PARAM__SUFFIX:
				return getSuffix();
			case AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM:
				return getIriListParam();
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
			case AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE:
				setRdfSinglePredicate((RdfSinglePredicate)newValue);
				return;
			case AdaptionrdfPackage.IRI_PARAM__PREFIX:
				setPrefix((String)newValue);
				return;
			case AdaptionrdfPackage.IRI_PARAM__URI:
				setUri((String)newValue);
				return;
			case AdaptionrdfPackage.IRI_PARAM__SUFFIX:
				setSuffix((String)newValue);
				return;
			case AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM:
				setIriListParam((IriListParam)newValue);
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
			case AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE:
				setRdfSinglePredicate((RdfSinglePredicate)null);
				return;
			case AdaptionrdfPackage.IRI_PARAM__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case AdaptionrdfPackage.IRI_PARAM__URI:
				setUri(URI_EDEFAULT);
				return;
			case AdaptionrdfPackage.IRI_PARAM__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
				return;
			case AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM:
				setIriListParam((IriListParam)null);
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
			case AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE:
				return getRdfSinglePredicate() != null;
			case AdaptionrdfPackage.IRI_PARAM__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case AdaptionrdfPackage.IRI_PARAM__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case AdaptionrdfPackage.IRI_PARAM__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
			case AdaptionrdfPackage.IRI_PARAM__IRI_LIST_PARAM:
				return getIriListParam() != null;
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
			case AdaptionrdfPackage.IRI_PARAM___GET_STANDARD_IRI:
				return getStandardIri();
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
		result.append(" (prefix: ");
		result.append(prefix);
		result.append(", uri: ");
		result.append(uri);
		result.append(", suffix: ");
		result.append(suffix);
		result.append(')');
		return result.toString();
	}

	@Override
	public String generateDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String myToString() {
		String result = "iri [" + getInternalId() + "] ";
		try {
			result += generateSparql();
		} catch (InvalidityException e) {}
		return result;
	}

	@Override
	public boolean inputIsValid() {
		// TODO Auto-generated method stub
		return false;
	}

} //IriParamImpl
