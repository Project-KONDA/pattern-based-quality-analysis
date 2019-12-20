/**
 */
package qualitypatternmodel.functions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Match;

import qualitypatternmodel.graphstructure.Property;

import qualitypatternmodel.inputfields.Option;
import qualitypatternmodel.inputfields.Text;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.impl.MatchImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.MatchImpl#getRegularExpression <em>Regular Expression</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.MatchImpl#isNegate <em>Negate</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.MatchImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends BooleanOperatorImpl implements Match {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * The cached value of the '{@link #getRegularExpression() <em>Regular Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularExpression()
	 * @generated
	 * @ordered
	 */
	protected Text regularExpression;

	/**
	 * The default value of the '{@link #isNegate() <em>Negate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegate() <em>Negate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegate()
	 * @generated
	 * @ordered
	 */
	protected boolean negate = NEGATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Option<qualitypatternmodel.inputfields.Boolean> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Property)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.MATCH__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty) {
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getRegularExpression() {
		if (regularExpression != null && regularExpression.eIsProxy()) {
			InternalEObject oldRegularExpression = (InternalEObject)regularExpression;
			regularExpression = (Text)eResolveProxy(oldRegularExpression);
			if (regularExpression != oldRegularExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.MATCH__REGULAR_EXPRESSION, oldRegularExpression, regularExpression));
			}
		}
		return regularExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetRegularExpression() {
		return regularExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegularExpression(Text newRegularExpression) {
		Text oldRegularExpression = regularExpression;
		regularExpression = newRegularExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__REGULAR_EXPRESSION, oldRegularExpression, regularExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegate() {
		return negate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegate(boolean newNegate) {
		boolean oldNegate = negate;
		negate = newNegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__NEGATE, oldNegate, negate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Option<qualitypatternmodel.inputfields.Boolean> getOptions() {
		if (options != null && options.eIsProxy()) {
			InternalEObject oldOptions = (InternalEObject)options;
			options = (Option<qualitypatternmodel.inputfields.Boolean>)eResolveProxy(oldOptions);
			if (options != oldOptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.MATCH__OPTIONS, oldOptions, options));
			}
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option<qualitypatternmodel.inputfields.Boolean> basicGetOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(Option<qualitypatternmodel.inputfields.Boolean> newOptions) {
		Option<qualitypatternmodel.inputfields.Boolean> oldOptions = options;
		options = newOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.MATCH__OPTIONS, oldOptions, options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.MATCH__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
				if (resolve) return getRegularExpression();
				return basicGetRegularExpression();
			case FunctionsPackage.MATCH__NEGATE:
				return isNegate();
			case FunctionsPackage.MATCH__OPTIONS:
				if (resolve) return getOptions();
				return basicGetOptions();
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
			case FunctionsPackage.MATCH__PROPERTY:
				setProperty((Property)newValue);
				return;
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
				setRegularExpression((Text)newValue);
				return;
			case FunctionsPackage.MATCH__NEGATE:
				setNegate((Boolean)newValue);
				return;
			case FunctionsPackage.MATCH__OPTIONS:
				setOptions((Option<qualitypatternmodel.inputfields.Boolean>)newValue);
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
			case FunctionsPackage.MATCH__PROPERTY:
				setProperty((Property)null);
				return;
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
				setRegularExpression((Text)null);
				return;
			case FunctionsPackage.MATCH__NEGATE:
				setNegate(NEGATE_EDEFAULT);
				return;
			case FunctionsPackage.MATCH__OPTIONS:
				setOptions((Option<qualitypatternmodel.inputfields.Boolean>)null);
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
			case FunctionsPackage.MATCH__PROPERTY:
				return property != null;
			case FunctionsPackage.MATCH__REGULAR_EXPRESSION:
				return regularExpression != null;
			case FunctionsPackage.MATCH__NEGATE:
				return negate != NEGATE_EDEFAULT;
			case FunctionsPackage.MATCH__OPTIONS:
				return options != null;
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
		result.append(" (negate: ");
		result.append(negate);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
