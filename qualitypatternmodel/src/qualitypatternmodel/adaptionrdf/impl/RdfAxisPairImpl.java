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
import qualitypatternmodel.adaptionrdf.RdfQuantifier;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
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
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfAxisPairImpl#getTextliteralparam <em>Textliteralparam</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionrdf.impl.RdfAxisPairImpl#getRdfpathparam <em>Rdfpathparam</em>}</li>
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
	 * The cached value of the '{@link #getTextliteralparam() <em>Textliteralparam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextliteralparam()
	 * @generated
	 * @ordered
	 */
	protected EList<TextLiteralParam> textliteralparam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfAxisPairImpl() {
		super();
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
	public EList<TextLiteralParam> getTextliteralparam() {
		if (textliteralparam == null) {
			textliteralparam = new EObjectContainmentWithInverseEList<TextLiteralParam>(TextLiteralParam.class, this, AdaptionrdfPackage.RDF_AXIS_PAIR__TEXTLITERALPARAM, ParametersPackage.TEXT_LITERAL_PARAM__RDFAXISPAIR);
		}
		return textliteralparam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RdfPathParam getRdfpathparam() {
		if (eContainerFeatureID() != AdaptionrdfPackage.RDF_AXIS_PAIR__RDFPATHPARAM) return null;
		return (RdfPathParam)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRdfpathparam(RdfPathParam newRdfpathparam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRdfpathparam, AdaptionrdfPackage.RDF_AXIS_PAIR__RDFPATHPARAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRdfpathparam(RdfPathParam newRdfpathparam) {
		if (newRdfpathparam != eInternalContainer() || (eContainerFeatureID() != AdaptionrdfPackage.RDF_AXIS_PAIR__RDFPATHPARAM && newRdfpathparam != null)) {
			if (EcoreUtil.isAncestor(this, newRdfpathparam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRdfpathparam != null)
				msgs = ((InternalEObject)newRdfpathparam).eInverseAdd(this, AdaptionrdfPackage.RDF_PATH_PARAM__RDFAXISPAIR, RdfPathParam.class, msgs);
			msgs = basicSetRdfpathparam(newRdfpathparam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionrdfPackage.RDF_AXIS_PAIR__RDFPATHPARAM, newRdfpathparam, newRdfpathparam));
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__TEXTLITERALPARAM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTextliteralparam()).basicAdd(otherEnd, msgs);
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDFPATHPARAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRdfpathparam((RdfPathParam)otherEnd, msgs);
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__TEXTLITERALPARAM:
				return ((InternalEList<?>)getTextliteralparam()).basicRemove(otherEnd, msgs);
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDFPATHPARAM:
				return basicSetRdfpathparam(null, msgs);
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDFPATHPARAM:
				return eInternalContainer().eInverseRemove(this, AdaptionrdfPackage.RDF_PATH_PARAM__RDFAXISPAIR, RdfPathParam.class, msgs);
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__TEXTLITERALPARAM:
				return getTextliteralparam();
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDFPATHPARAM:
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__QUANTIFIER:
				setQuantifier((RdfQuantifier)newValue);
				return;
			case AdaptionrdfPackage.RDF_AXIS_PAIR__TEXTLITERALPARAM:
				getTextliteralparam().clear();
				getTextliteralparam().addAll((Collection<? extends TextLiteralParam>)newValue);
				return;
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDFPATHPARAM:
				setRdfpathparam((RdfPathParam)newValue);
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__TEXTLITERALPARAM:
				getTextliteralparam().clear();
				return;
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDFPATHPARAM:
				setRdfpathparam((RdfPathParam)null);
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
			case AdaptionrdfPackage.RDF_AXIS_PAIR__TEXTLITERALPARAM:
				return textliteralparam != null && !textliteralparam.isEmpty();
			case AdaptionrdfPackage.RDF_AXIS_PAIR__RDFPATHPARAM:
				return getRdfpathparam() != null;
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
