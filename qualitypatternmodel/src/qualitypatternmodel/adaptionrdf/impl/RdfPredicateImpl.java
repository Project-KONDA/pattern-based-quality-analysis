/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfPredicate;

import qualitypatternmodel.graphstructure.impl.RelationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPredicateImpl#getRdfpathparam <em>Rdfpathparam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfPredicateImpl extends RelationImpl implements RdfPredicate {
	/**
	 * The cached value of the '{@link #getRdfpathparam() <em>Rdfpathparam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRdfpathparam()
	 * @generated
	 * @ordered
	 */
	protected EList<RdfPathParam> rdfpathparam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RdfPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.RDF_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RdfPathParam> getRdfpathparam() {
		if (rdfpathparam == null) {
			rdfpathparam = new EObjectContainmentWithInverseEList<RdfPathParam>(RdfPathParam.class, this, AdaptionrdfPackage.RDF_PREDICATE__RDFPATHPARAM, AdaptionrdfPackage.RDF_PATH_PARAM__RDFREFERENCE);
		}
		return rdfpathparam;
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
			case AdaptionrdfPackage.RDF_PREDICATE__RDFPATHPARAM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRdfpathparam()).basicAdd(otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_PREDICATE__RDFPATHPARAM:
				return ((InternalEList<?>)getRdfpathparam()).basicRemove(otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_PREDICATE__RDFPATHPARAM:
				return getRdfpathparam();
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
			case AdaptionrdfPackage.RDF_PREDICATE__RDFPATHPARAM:
				getRdfpathparam().clear();
				getRdfpathparam().addAll((Collection<? extends RdfPathParam>)newValue);
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
			case AdaptionrdfPackage.RDF_PREDICATE__RDFPATHPARAM:
				getRdfpathparam().clear();
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
			case AdaptionrdfPackage.RDF_PREDICATE__RDFPATHPARAM:
				return rdfpathparam != null && !rdfpathparam.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RdfPredicateImpl
