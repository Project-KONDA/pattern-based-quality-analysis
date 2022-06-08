/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import java.util.Map;
import static java.util.Map.entry;    


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.IriParam;

import qualitypatternmodel.adaptionrdf.RdfAxisPair;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iri Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriParamImpl#getRdfAxisPair <em>Rdf Axis Pair</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriParamImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriParamImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.IriParamImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IriParamImpl extends ParameterImpl implements IriParam {
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
	
	static Map<String, String> standardIris = Map.ofEntries(
		entry("wd"		, "http://www.wikidata.org/entity/"),
		entry("wdt"		, "http://www.wikidata.org/prop/direct/"),
		entry("wikibase", "http://wikiba.se/ontology#"),
		entry("p"		, "http://www.wikidata.org/prop/>"),
		entry("ps"		, "http://www.wikidata.org/prop/statement/"),
		entry("pq"		, "http://www.wikidata.org/prop/qualifier/"),
		entry("rdfs"	, "http://www.w3.org/2000/01/rdf-schema#"),
		entry("bd"		, "http://www.bigdata.com/rdf#")
	);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IriParamImpl() {
		super();
	}
	
	@Override
	public void isValid (AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		int b = (prefix == null ? 1 : 0) + (suffix == null ? 1 : 0) + (uri == null ? 1 : 0);
		if(b == 1 && uri == null || b > 1 && uri != null || b == 0) {
			throw new InvalidityException("invalid iri");
		}
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		if(prefix != null && suffix != null) {
			String standardIri = standardIris.get(prefix);
			if(standardIri == null) {
				throw new InvalidityException("Invalid prefix");
			}
			return "<" + standardIri + suffix + ">";
		} else if (uri != null) {
			return "<" + uri + ">";
		} else {
			throw new InvalidityException("Invalid uri");
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
	public RdfAxisPair getRdfAxisPair() {
		if (eContainerFeatureID() != AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR) return null;
		return (RdfAxisPair)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfAxisPair(RdfAxisPair newRdfAxisPair, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdfAxisPair, AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRdfAxisPair(RdfAxisPair newRdfAxisPair) {
		if (newRdfAxisPair != eInternalContainer() || (eContainerFeatureID() != AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR && newRdfAxisPair != null)) {
			if (EcoreUtil.isAncestor(this, newRdfAxisPair))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdfAxisPair != null)
				msgs = ((InternalEObject)newRdfAxisPair).eInverseAdd(this, AdaptionrdfPackage.RDF_AXIS_PAIR__IRI_PARAM, RdfAxisPair.class, msgs);
			msgs = basicSetRdfAxisPair(newRdfAxisPair, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR, newRdfAxisPair, newRdfAxisPair));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRdfAxisPair((RdfAxisPair)otherEnd, msgs);
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
			case AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR:
				return basicSetRdfAxisPair(null, msgs);
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
			case AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR:
				return eInternalContainer().eInverseRemove(this, AdaptionrdfPackage.RDF_AXIS_PAIR__IRI_PARAM, RdfAxisPair.class, msgs);
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
			case AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR:
				return getRdfAxisPair();
			case AdaptionrdfPackage.IRI_PARAM__PREFIX:
				return getPrefix();
			case AdaptionrdfPackage.IRI_PARAM__URI:
				return getUri();
			case AdaptionrdfPackage.IRI_PARAM__SUFFIX:
				return getSuffix();
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
			case AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR:
				setRdfAxisPair((RdfAxisPair)newValue);
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
			case AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR:
				setRdfAxisPair((RdfAxisPair)null);
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
			case AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR:
				return getRdfAxisPair() != null;
			case AdaptionrdfPackage.IRI_PARAM__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case AdaptionrdfPackage.IRI_PARAM__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case AdaptionrdfPackage.IRI_PARAM__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
		}
		return super.eIsSet(featureID);
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean inputIsValid() {
		// TODO Auto-generated method stub
		return false;
	}

} //IriParamImpl
