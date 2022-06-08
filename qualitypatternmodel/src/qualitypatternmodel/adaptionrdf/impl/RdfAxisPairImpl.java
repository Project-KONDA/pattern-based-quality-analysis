/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfAxisPair;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfQuantifier;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Axis Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfAxisPairImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfAxisPairImpl#getIriParam <em>Iri Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfAxisPairImpl#getRdfPathParam <em>Rdf Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfAxisPairImpl extends PatternElementImpl implements RdfAxisPair {
	/**
	 * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected static final RdfQuantifier QUANTIFIER_EDEFAULT = RdfQuantifier.ONCE;

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
	protected RdfAxisPairImpl() {
		super();
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		if(getIriParam() == null) {
			return "?var" + getInternalId();
		}
		return getIriParam().generateSparql();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.RDF_AXIS_PAIR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_AXIS_PAIR__QUANTIFIER, oldQuantifier, quantifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_AXIS_PAIR__IRI_PARAM, oldIriParam, newIriParam);
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
				msgs = ((InternalEObject)iriParam).eInverseRemove(this, AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR, IriParam.class, msgs);
			if (newIriParam != null)
				msgs = ((InternalEObject)newIriParam).eInverseAdd(this, AdaptionrdfPackage.IRI_PARAM__RDF_AXIS_PAIR, IriParam.class, msgs);
			msgs = basicSetIriParam(newIriParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_AXIS_PAIR__IRI_PARAM, newIriParam, newIriParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfPathParam getRdfPathParam() {
		if (eContainerFeatureID() != AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM) return null;
		return (RdfPathParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfPathParam(RdfPathParam newRdfPathParam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdfPathParam, AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRdfPathParam(RdfPathParam newRdfPathParam) {
		if (newRdfPathParam != eInternalContainer() || (eContainerFeatureID() != AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM && newRdfPathParam != null)) {
			if (EcoreUtil.isAncestor(this, newRdfPathParam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdfPathParam != null)
				msgs = ((InternalEObject)newRdfPathParam).eInverseAdd(this, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR, RdfPathParam.class, msgs);
			msgs = basicSetRdfPathParam(newRdfPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM, newRdfPathParam, newRdfPathParam));
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__IRI_PARAM:
				if (iriParam != null)
					msgs = ((InternalEObject)iriParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionrdfPackage.RDF_AXIS_PAIR__IRI_PARAM, null, msgs);
				return basicSetIriParam((IriParam)otherEnd, msgs);
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRdfPathParam((RdfPathParam)otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__IRI_PARAM:
				return basicSetIriParam(null, msgs);
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM:
				return basicSetRdfPathParam(null, msgs);
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR, RdfPathParam.class, msgs);
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__QUANTIFIER:
				return getQuantifier();
			case AdaptionrdfPackage.RDF_AXIS_PAIR__IRI_PARAM:
				return getIriParam();
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM:
				return getRdfPathParam();
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__QUANTIFIER:
				setQuantifier((RdfQuantifier)newValue);
				return;
			case AdaptionrdfPackage.RDF_AXIS_PAIR__IRI_PARAM:
				setIriParam((IriParam)newValue);
				return;
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM:
				setRdfPathParam((RdfPathParam)newValue);
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
				return;
			case AdaptionrdfPackage.RDF_AXIS_PAIR__IRI_PARAM:
				setIriParam((IriParam)null);
				return;
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM:
				setRdfPathParam((RdfPathParam)null);
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
			case AdaptionrdfPackage.RDF_AXIS_PAIR__IRI_PARAM:
				return iriParam != null;
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM:
				return getRdfPathParam() != null;
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
		result.append(" (quantifier: ");
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
