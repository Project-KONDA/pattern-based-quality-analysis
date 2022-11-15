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
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.RdfPathPart;
import qualitypatternmodel.adaptionrdf.RdfQuantifier;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Path Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl#isInvert <em>Invert</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl#getRdfPathParam <em>Rdf Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RdfPathPartImpl extends PatternElementImpl implements RdfPathPart {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfPathPartImpl() {
		super();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PART__INVERT, oldInvert, invert));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_PATH_PART__QUANTIFIER, oldQuantifier, quantifier));
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
				msgs = ((InternalEObject)newRdfPathParam).eInverseAdd(this, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PART, RdfPathParam.class, msgs);
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
	public EList<RdfSinglePredicate> getRdfSinglePredicates() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
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
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
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
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionrdfPackage.RDF_PATH_PARAM__RDF_PATH_PART, RdfPathParam.class, msgs);
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
			case AdaptionrdfPackage.RDF_PATH_PART__INVERT:
				return isInvert();
			case AdaptionrdfPackage.RDF_PATH_PART__QUANTIFIER:
				return getQuantifier();
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
				return getRdfPathParam();
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
			case AdaptionrdfPackage.RDF_PATH_PART__INVERT:
				setInvert((Boolean)newValue);
				return;
			case AdaptionrdfPackage.RDF_PATH_PART__QUANTIFIER:
				setQuantifier((RdfQuantifier)newValue);
				return;
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
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
			case AdaptionrdfPackage.RDF_PATH_PART__INVERT:
				setInvert(INVERT_EDEFAULT);
				return;
			case AdaptionrdfPackage.RDF_PATH_PART__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
				return;
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
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
			case AdaptionrdfPackage.RDF_PATH_PART__INVERT:
				return invert != INVERT_EDEFAULT;
			case AdaptionrdfPackage.RDF_PATH_PART__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
			case AdaptionrdfPackage.RDF_PATH_PART__RDF_PATH_PARAM:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionrdfPackage.RDF_PATH_PART___GET_RDF_SINGLE_PREDICATES:
				return getRdfSinglePredicates();
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
		result.append(" (invert: ");
		result.append(invert);
		result.append(", quantifier: ");
		result.append(quantifier);
		result.append(')');
		return result.toString();
	}

} //RdfPathParamImpl
