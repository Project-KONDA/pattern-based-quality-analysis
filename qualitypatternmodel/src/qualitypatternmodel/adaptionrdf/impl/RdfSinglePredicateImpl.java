/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfQuantifier;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.textrepresentation.ParameterReference;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Axis Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl#isPredefined <em>Predefined</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl#getParameterReferences <em>Parameter References</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl#getRdfPredicate <em>Rdf Predicate</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl#isInvert <em>Invert</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl#getIriParam <em>Iri Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfSinglePredicateImpl extends PatternElementImpl implements RdfSinglePredicate {
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
	 * The cached value of the '{@link #getRdfPredicate() <em>Rdf Predicate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfPredicate()
	 * @generated
	 * @ordered
	 */
	protected RdfPredicate rdfPredicate;

	/**
	 * The default value of the '{@link #isInvert() <em>Invert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvert()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvert() <em>Invert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvert()
	 * @generated
	 * @ordered
	 */
	protected boolean invert = INVERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected static final RdfQuantifier QUANTIFIER_EDEFAULT = RdfQuantifier.ONE;

	/**
	 * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected RdfQuantifier quantifier = QUANTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIriParam() <em>Iri Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIriParam()
	 * @generated
	 * @ordered
	 */
	protected IriParam iriParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfSinglePredicateImpl() {
		super();
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		if(getIriParam() == null) {
			return "(<>|!<>)";
		}
		return (invert ? "^" : "" ) + getIriParam().generateSparql() + getQuantifier().getLiteral();
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.RDF_SINGLE_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterList getParameterList() {
		if (eContainerFeatureID() != AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST) return null;
		return (ParameterList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParameterList, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterList(ParameterList newParameterList) {
		if (newParameterList != eInternalContainer() || (eContainerFeatureID() != AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST && newParameterList != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST, newParameterList, newParameterList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PREDEFINED, oldPredefined, predefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterReference> getParameterReferences() {
		if (parameterReferences == null) {
			parameterReferences = new EObjectWithInverseResolvingEList.ManyInverse<ParameterReference>(ParameterReference.class, this, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_REFERENCES, TextrepresentationPackage.PARAMETER_REFERENCE__PARAMETER);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfPredicate getRdfPredicate() {
		if (rdfPredicate != null && rdfPredicate.eIsProxy()) {
			InternalEObject oldRdfPredicate = (InternalEObject)rdfPredicate;
			rdfPredicate = (RdfPredicate)eResolveProxy(oldRdfPredicate);
			if (rdfPredicate != oldRdfPredicate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__RDF_PREDICATE, oldRdfPredicate, rdfPredicate));
			}
		}
		return rdfPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfPredicate basicGetRdfPredicate() {
		return rdfPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfPredicate(RdfPredicate newRdfPredicate, NotificationChain msgs) {
		RdfPredicate oldRdfPredicate = rdfPredicate;
		rdfPredicate = newRdfPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__RDF_PREDICATE, oldRdfPredicate, newRdfPredicate);
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
	public void setRdfPredicate(RdfPredicate newRdfPredicate) {
		if (newRdfPredicate != rdfPredicate) {
			NotificationChain msgs = null;
			if (rdfPredicate != null)
				msgs = ((InternalEObject)rdfPredicate).eInverseRemove(this, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, RdfPredicate.class, msgs);
			if (newRdfPredicate != null)
				msgs = ((InternalEObject)newRdfPredicate).eInverseAdd(this, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, RdfPredicate.class, msgs);
			msgs = basicSetRdfPredicate(newRdfPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__RDF_PREDICATE, newRdfPredicate, newRdfPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInvert() {
		return invert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvert(boolean newInvert) {
		boolean oldInvert = invert;
		invert = newInvert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__INVERT, oldInvert, invert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfQuantifier getQuantifier() {
		return quantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantifier(RdfQuantifier newQuantifier) {
		RdfQuantifier oldQuantifier = quantifier;
		quantifier = newQuantifier == null ? QUANTIFIER_EDEFAULT : newQuantifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__QUANTIFIER, oldQuantifier, quantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IriParam getIriParam() {
		return iriParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIriParam(IriParam newIriParam, NotificationChain msgs) {
		IriParam oldIriParam = iriParam;
		iriParam = newIriParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__IRI_PARAM, oldIriParam, newIriParam);
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
	public void setIriParam(IriParam newIriParam) {
		if (newIriParam != iriParam) {
			NotificationChain msgs = null;
			if (iriParam != null)
				msgs = ((InternalEObject)iriParam).eInverseRemove(this, AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE, IriParam.class, msgs);
			if (newIriParam != null)
				msgs = ((InternalEObject)newIriParam).eInverseAdd(this, AdaptionrdfPackage.IRI_PARAM__RDF_SINGLE_PREDICATE, IriParam.class, msgs);
			msgs = basicSetIriParam(newIriParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_SINGLE_PREDICATE__IRI_PARAM, newIriParam, newIriParam));
	}

	@Override
	public EList<RdfSinglePredicate> getRdfSinglePredicates() {	
		EList<RdfSinglePredicate> list = new BasicEList<RdfSinglePredicate>();
		list.add(this);
		return list;
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
	public boolean inputIsValid() {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String generateDescription() {
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
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParameterList((ParameterList)otherEnd, msgs);
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterReferences()).basicAdd(otherEnd, msgs);
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__RDF_PREDICATE:
				if (rdfPredicate != null)
					msgs = ((InternalEObject)rdfPredicate).eInverseRemove(this, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, RdfPredicate.class, msgs);
				return basicSetRdfPredicate((RdfPredicate)otherEnd, msgs);
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__IRI_PARAM:
				if (iriParam != null)
					msgs = ((InternalEObject)iriParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionrdfPackage.RDF_SINGLE_PREDICATE__IRI_PARAM, null, msgs);
				return basicSetIriParam((IriParam)otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST:
				return basicSetParameterList(null, msgs);
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_REFERENCES:
				return ((InternalEList<?>)getParameterReferences()).basicRemove(otherEnd, msgs);
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__RDF_PREDICATE:
				return basicSetRdfPredicate(null, msgs);
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__IRI_PARAM:
				return basicSetIriParam(null, msgs);
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
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST:
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
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST:
				return getParameterList();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PREDEFINED:
				return isPredefined();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_REFERENCES:
				return getParameterReferences();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__DESCRIPTION:
				return getDescription();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__RDF_PREDICATE:
				if (resolve) return getRdfPredicate();
				return basicGetRdfPredicate();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__INVERT:
				return isInvert();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__QUANTIFIER:
				return getQuantifier();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__IRI_PARAM:
				return getIriParam();
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
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST:
				setParameterList((ParameterList)newValue);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PREDEFINED:
				setPredefined((Boolean)newValue);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_REFERENCES:
				getParameterReferences().clear();
				getParameterReferences().addAll((Collection<? extends ParameterReference>)newValue);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__RDF_PREDICATE:
				setRdfPredicate((RdfPredicate)newValue);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__INVERT:
				setInvert((Boolean)newValue);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__QUANTIFIER:
				setQuantifier((RdfQuantifier)newValue);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__IRI_PARAM:
				setIriParam((IriParam)newValue);
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
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST:
				setParameterList((ParameterList)null);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PREDEFINED:
				setPredefined(PREDEFINED_EDEFAULT);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_REFERENCES:
				getParameterReferences().clear();
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__RDF_PREDICATE:
				setRdfPredicate((RdfPredicate)null);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__INVERT:
				setInvert(INVERT_EDEFAULT);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
				return;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__IRI_PARAM:
				setIriParam((IriParam)null);
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
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST:
				return getParameterList() != null;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PREDEFINED:
				return predefined != PREDEFINED_EDEFAULT;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_REFERENCES:
				return parameterReferences != null && !parameterReferences.isEmpty();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__RDF_PREDICATE:
				return rdfPredicate != null;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__INVERT:
				return invert != INVERT_EDEFAULT;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__IRI_PARAM:
				return iriParam != null;
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
				case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST: return ParametersPackage.PARAMETER__PARAMETER_LIST;
				case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PREDEFINED: return ParametersPackage.PARAMETER__PREDEFINED;
				case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_REFERENCES: return ParametersPackage.PARAMETER__PARAMETER_REFERENCES;
				case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__DESCRIPTION: return ParametersPackage.PARAMETER__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Adaptable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RdfPathParam.class) {
			switch (derivedFeatureID) {
				case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__RDF_PREDICATE: return AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE;
				case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__INVERT: return AdaptionrdfPackage.RDF_PATH_PARAM__INVERT;
				case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__QUANTIFIER: return AdaptionrdfPackage.RDF_PATH_PARAM__QUANTIFIER;
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
				case ParametersPackage.PARAMETER__PARAMETER_LIST: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_LIST;
				case ParametersPackage.PARAMETER__PREDEFINED: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PREDEFINED;
				case ParametersPackage.PARAMETER__PARAMETER_REFERENCES: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE__PARAMETER_REFERENCES;
				case ParametersPackage.PARAMETER__DESCRIPTION: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Adaptable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == RdfPathParam.class) {
			switch (baseFeatureID) {
				case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE__RDF_PREDICATE;
				case AdaptionrdfPackage.RDF_PATH_PARAM__INVERT: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE__INVERT;
				case AdaptionrdfPackage.RDF_PATH_PARAM__QUANTIFIER: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE__QUANTIFIER;
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
				case ParametersPackage.PARAMETER___VALIDATE__DIAGNOSTICCHAIN_MAP: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___VALIDATE__DIAGNOSTICCHAIN_MAP;
				case ParametersPackage.PARAMETER___VALIDATE_AGAINST_SCHEMA: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___VALIDATE_AGAINST_SCHEMA;
				case ParametersPackage.PARAMETER___VALIDATE_EXAMPLE_VALUE__STRING: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___VALIDATE_EXAMPLE_VALUE__STRING;
				case ParametersPackage.PARAMETER___INPUT_IS_VALID: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___INPUT_IS_VALID;
				case ParametersPackage.PARAMETER___IS_USED: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___IS_USED;
				case ParametersPackage.PARAMETER___SET_VALUE_FROM_STRING__STRING: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___SET_VALUE_FROM_STRING__STRING;
				case ParametersPackage.PARAMETER___GET_VALUE_AS_STRING: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___GET_VALUE_AS_STRING;
				case ParametersPackage.PARAMETER___CHECK_COMPARISON_CONSISTENCY: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___CHECK_COMPARISON_CONSISTENCY;
				case ParametersPackage.PARAMETER___GET_OPTIONS_AS_STRING_LIST: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___GET_OPTIONS_AS_STRING_LIST;
				case ParametersPackage.PARAMETER___GENERATE_DESCRIPTION: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___GENERATE_DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				default: return -1;
			}
		}
		if (baseClass == RdfPathParam.class) {
			switch (baseOperationID) {
				case AdaptionrdfPackage.RDF_PATH_PARAM___GET_RDF_SINGLE_PREDICATES: return AdaptionrdfPackage.RDF_SINGLE_PREDICATE___GET_RDF_SINGLE_PREDICATES;
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
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE___GET_RDF_SINGLE_PREDICATES:
				return getRdfSinglePredicates();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE___CREATE_PARAMETERS:
				createParameters();
				return null;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE___VALIDATE_AGAINST_SCHEMA:
				return validateAgainstSchema();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE___VALIDATE_EXAMPLE_VALUE__STRING:
				try {
					validateExampleValue((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE___INPUT_IS_VALID:
				return inputIsValid();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE___IS_USED:
				return isUsed();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE___SET_VALUE_FROM_STRING__STRING:
				try {
					setValueFromString((String)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE___GET_VALUE_AS_STRING:
				return getValueAsString();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE___CHECK_COMPARISON_CONSISTENCY:
				try {
					checkComparisonConsistency();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE___GET_OPTIONS_AS_STRING_LIST:
				return getOptionsAsStringList();
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE___GENERATE_DESCRIPTION:
				return generateDescription();
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
		result.append(", invert: ");
		result.append(invert);
		result.append(", quantifier: ");
		result.append(quantifier);
		result.append(')');
		return result.toString();
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

} //RdfAxisPairImpl
