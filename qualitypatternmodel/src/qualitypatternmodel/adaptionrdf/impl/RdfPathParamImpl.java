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
import qualitypatternmodel.adaptionrdf.RdfAxisPair;
import qualitypatternmodel.adaptionrdf.RdfPathParam;

import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.parameters.impl.ParameterImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl#getRdfAxisPair <em>Rdf Axis Pair</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl#getRdfPredicate <em>Rdf Predicate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfPathParamImpl extends ParameterImpl implements RdfPathParam {
	/**
	 * The cached value of the '{@link #getRdfAxisPair() <em>Rdf Axis Pair</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfAxisPair()
	 * @generated
	 * @ordered
	 */
	protected RdfAxisPair rdfAxisPair;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfPathParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.RDF_PATH_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfAxisPair getRdfAxisPair() {
		return rdfAxisPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfAxisPair(RdfAxisPair newRdfAxisPair, NotificationChain msgs) {
		RdfAxisPair oldRdfAxisPair = rdfAxisPair;
		rdfAxisPair = newRdfAxisPair;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR, oldRdfAxisPair, newRdfAxisPair);
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
	public void setRdfAxisPair(RdfAxisPair newRdfAxisPair) {
		if (newRdfAxisPair != rdfAxisPair) {
			NotificationChain msgs = null;
			if (rdfAxisPair != null)
				msgs = ((InternalEObject)rdfAxisPair).eInverseRemove(this, AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM, RdfAxisPair.class, msgs);
			if (newRdfAxisPair != null)
				msgs = ((InternalEObject)newRdfAxisPair).eInverseAdd(this, AdaptionrdfPackage.RDF_AXIS_PAIR__RDF_PATH_PARAM, RdfAxisPair.class, msgs);
			msgs = basicSetRdfAxisPair(newRdfAxisPair, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR, newRdfAxisPair, newRdfAxisPair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfPredicate getRdfPredicate() {
		if (eContainerFeatureID() != AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE) return null;
		return (RdfPredicate)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfPredicate(RdfPredicate newRdfPredicate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdfPredicate, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRdfPredicate(RdfPredicate newRdfPredicate) {
		if (newRdfPredicate != eInternalContainer() || (eContainerFeatureID() != AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE && newRdfPredicate != null)) {
			if (EcoreUtil.isAncestor(this, newRdfPredicate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdfPredicate != null)
				msgs = ((InternalEObject)newRdfPredicate).eInverseAdd(this, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, RdfPredicate.class, msgs);
			msgs = basicSetRdfPredicate(newRdfPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE, newRdfPredicate, newRdfPredicate));
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR:
				if (rdfAxisPair != null)
					msgs = ((InternalEObject)rdfAxisPair).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR, null, msgs);
				return basicSetRdfAxisPair((RdfAxisPair)otherEnd, msgs);
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRdfPredicate((RdfPredicate)otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR:
				return basicSetRdfAxisPair(null, msgs);
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				return basicSetRdfPredicate(null, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				return eInternalContainer().eInverseRemove(this, AdaptionrdfPackage.RDF_PREDICATE__RDF_PATH_PARAM, RdfPredicate.class, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR:
				return getRdfAxisPair();
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				return getRdfPredicate();
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR:
				setRdfAxisPair((RdfAxisPair)newValue);
				return;
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				setRdfPredicate((RdfPredicate)newValue);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR:
				setRdfAxisPair((RdfAxisPair)null);
				return;
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				setRdfPredicate((RdfPredicate)null);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_AXIS_PAIR:
				return rdfAxisPair != null;
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PREDICATE:
				return getRdfPredicate() != null;
		}
		return super.eIsSet(featureID);
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

} //RdfPathParamImpl
