/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl#getRdfaxispair <em>Rdfaxispair</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathParamImpl#getRdfreference <em>Rdfreference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfPathParamImpl extends ParameterImpl implements RdfPathParam {
	/**
	 * The cached value of the '{@link #getRdfaxispair() <em>Rdfaxispair</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfaxispair()
	 * @generated
	 * @ordered
	 */
	protected EList<RdfAxisPair> rdfaxispair;

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
	public EList<RdfAxisPair> getRdfaxispair() {
		if (rdfaxispair == null) {
			rdfaxispair = new EObjectContainmentWithInverseEList<RdfAxisPair>(RdfAxisPair.class, this, AdaptionrdfPackage.RDF_PATH_PARAM__RDFAXISPAIR, AdaptionrdfPackage.RDF_AXIS_PAIR__RDFPATHPARAM);
		}
		return rdfaxispair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfPredicate getRdfreference() {
		if (eContainerFeatureID() != AdaptionrdfPackage.RDF_PATH_PARAM__RDFREFERENCE) return null;
		return (RdfPredicate)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfreference(RdfPredicate newRdfreference, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdfreference, AdaptionrdfPackage.RDF_PATH_PARAM__RDFREFERENCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRdfreference(RdfPredicate newRdfreference) {
		if (newRdfreference != eInternalContainer() || (eContainerFeatureID() != AdaptionrdfPackage.RDF_PATH_PARAM__RDFREFERENCE && newRdfreference != null)) {
			if (EcoreUtil.isAncestor(this, newRdfreference))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdfreference != null)
				msgs = ((InternalEObject)newRdfreference).eInverseAdd(this, AdaptionrdfPackage.RDF_PREDICATE__RDFPATHPARAM, RdfPredicate.class, msgs);
			msgs = basicSetRdfreference(newRdfreference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PARAM__RDFREFERENCE, newRdfreference, newRdfreference));
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFAXISPAIR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdfaxispair()).basicAdd(otherEnd, msgs);
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFREFERENCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRdfreference((RdfPredicate)otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFAXISPAIR:
				return ((InternalEList<?>)getRdfaxispair()).basicRemove(otherEnd, msgs);
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFREFERENCE:
				return basicSetRdfreference(null, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFREFERENCE:
				return eInternalContainer().eInverseRemove(this, AdaptionrdfPackage.RDF_PREDICATE__RDFPATHPARAM, RdfPredicate.class, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFAXISPAIR:
				return getRdfaxispair();
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFREFERENCE:
				return getRdfreference();
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFAXISPAIR:
				getRdfaxispair().clear();
				getRdfaxispair().addAll((Collection<? extends RdfAxisPair>)newValue);
				return;
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFREFERENCE:
				setRdfreference((RdfPredicate)newValue);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFAXISPAIR:
				getRdfaxispair().clear();
				return;
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFREFERENCE:
				setRdfreference((RdfPredicate)null);
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
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFAXISPAIR:
				return rdfaxispair != null && !rdfaxispair.isEmpty();
			case AdaptionrdfPackage.RDF_PATH_PARAM__RDFREFERENCE:
				return getRdfreference() != null;
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