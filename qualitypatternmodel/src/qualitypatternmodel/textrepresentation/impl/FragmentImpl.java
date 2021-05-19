/**
 */
package qualitypatternmodel.textrepresentation.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.textrepresentation.Fragment;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.textrepresentation.impl.FragmentImpl#getPatternText <em>Pattern Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FragmentImpl extends MinimalEObjectImpl.Container implements Fragment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextrepresentationPackage.Literals.FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternText getPatternText() {
		if (eContainerFeatureID() != TextrepresentationPackage.FRAGMENT__PATTERN_TEXT) return null;
		return (PatternText)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternText(PatternText newPatternText, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPatternText, TextrepresentationPackage.FRAGMENT__PATTERN_TEXT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternText(PatternText newPatternText) {
		if (newPatternText != eInternalContainer() || (eContainerFeatureID() != TextrepresentationPackage.FRAGMENT__PATTERN_TEXT && newPatternText != null)) {
			if (EcoreUtil.isAncestor(this, newPatternText))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPatternText != null)
				msgs = ((InternalEObject)newPatternText).eInverseAdd(this, TextrepresentationPackage.PATTERN_TEXT__TEXTFRAGMENT, PatternText.class, msgs);
			msgs = basicSetPatternText(newPatternText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextrepresentationPackage.FRAGMENT__PATTERN_TEXT, newPatternText, newPatternText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String generateJSON() {
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
			case TextrepresentationPackage.FRAGMENT__PATTERN_TEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPatternText((PatternText)otherEnd, msgs);
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
			case TextrepresentationPackage.FRAGMENT__PATTERN_TEXT:
				return basicSetPatternText(null, msgs);
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
			case TextrepresentationPackage.FRAGMENT__PATTERN_TEXT:
				return eInternalContainer().eInverseRemove(this, TextrepresentationPackage.PATTERN_TEXT__TEXTFRAGMENT, PatternText.class, msgs);
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
			case TextrepresentationPackage.FRAGMENT__PATTERN_TEXT:
				return getPatternText();
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
			case TextrepresentationPackage.FRAGMENT__PATTERN_TEXT:
				setPatternText((PatternText)newValue);
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
			case TextrepresentationPackage.FRAGMENT__PATTERN_TEXT:
				setPatternText((PatternText)null);
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
			case TextrepresentationPackage.FRAGMENT__PATTERN_TEXT:
				return getPatternText() != null;
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
			case TextrepresentationPackage.FRAGMENT___GENERATE_JSON:
				return generateJSON();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FragmentImpl
