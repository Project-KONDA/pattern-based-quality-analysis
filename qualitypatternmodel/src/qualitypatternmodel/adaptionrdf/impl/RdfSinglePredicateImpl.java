/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Axis Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfSinglePredicateImpl#getIriParam <em>Iri Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RdfSinglePredicateImpl extends RdfPathPartImpl implements RdfSinglePredicate {
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
	 * @generated not
	 */
	public RdfSinglePredicateImpl() {
		super();
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		if(getIriParam() == null) {
			return "(<>|!<>)";
		}
		String iri = getIriParam().generateSparql();
		if(iri == null) {
			return null;
//			return super.generateSparql();
		} else {
			return (invert ? "^" : "" ) + iri + getQuantifier().getLiteral();
		}
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE__IRI_PARAM:
				return iriParam != null;
		}
		return super.eIsSet(featureID);
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

} //RdfAxisPairImpl
