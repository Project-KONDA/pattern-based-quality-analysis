/**
 */
package qualitypatternmodel.javaquery.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.FormulaFilterPart;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.patternstructure.LogicalOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formula Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.FormulaFilterPartImpl#getSubfilter1 <em>Subfilter1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.FormulaFilterPartImpl#getSubfilter2 <em>Subfilter2</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.FormulaFilterPartImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaFilterPartImpl extends BooleanFilterPartImpl implements FormulaFilterPart {
	/**
	 * The cached value of the '{@link #getSubfilter1() <em>Subfilter1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfilter1()
	 * @generated
	 * @ordered
	 */
	protected BooleanFilterPart subfilter1;

	/**
	 * The cached value of the '{@link #getSubfilter2() <em>Subfilter2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfilter2()
	 * @generated
	 * @ordered
	 */
	protected BooleanFilterPart subfilter2;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperator OPERATOR_EDEFAULT = LogicalOperator.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulaFilterPartImpl() {
		super();
	}
	
	public FormulaFilterPartImpl(LogicalOperator op, BooleanFilterPart booleanFilterPart,
			BooleanFilterPart booleanFilterPart2) {
		super();
		setOperator(op);
		setSubfilter1(booleanFilterPart);
		setSubfilter2(booleanFilterPart2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.FORMULA_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanFilterPart getSubfilter1() {
		return subfilter1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubfilter1(BooleanFilterPart newSubfilter1, NotificationChain msgs) {
		BooleanFilterPart oldSubfilter1 = subfilter1;
		subfilter1 = newSubfilter1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER1, oldSubfilter1, newSubfilter1);
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
	public void setSubfilter1(BooleanFilterPart newSubfilter1) {
		if (newSubfilter1 != subfilter1) {
			NotificationChain msgs = null;
			if (subfilter1 != null)
				msgs = ((InternalEObject)subfilter1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER1, null, msgs);
			if (newSubfilter1 != null)
				msgs = ((InternalEObject)newSubfilter1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER1, null, msgs);
			msgs = basicSetSubfilter1(newSubfilter1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER1, newSubfilter1, newSubfilter1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanFilterPart getSubfilter2() {
		return subfilter2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubfilter2(BooleanFilterPart newSubfilter2, NotificationChain msgs) {
		BooleanFilterPart oldSubfilter2 = subfilter2;
		subfilter2 = newSubfilter2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER2, oldSubfilter2, newSubfilter2);
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
	public void setSubfilter2(BooleanFilterPart newSubfilter2) {
		if (newSubfilter2 != subfilter2) {
			NotificationChain msgs = null;
			if (subfilter2 != null)
				msgs = ((InternalEObject)subfilter2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER2, null, msgs);
			if (newSubfilter2 != null)
				msgs = ((InternalEObject)newSubfilter2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER2, null, msgs);
			msgs = basicSetSubfilter2(newSubfilter2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER2, newSubfilter2, newSubfilter2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(LogicalOperator newOperator) {
		LogicalOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.FORMULA_FILTER_PART__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER1:
				return basicSetSubfilter1(null, msgs);
			case JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER2:
				return basicSetSubfilter2(null, msgs);
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
			case JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER1:
				return getSubfilter1();
			case JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER2:
				return getSubfilter2();
			case JavaqueryPackage.FORMULA_FILTER_PART__OPERATOR:
				return getOperator();
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
			case JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER1:
				setSubfilter1((BooleanFilterPart)newValue);
				return;
			case JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER2:
				setSubfilter2((BooleanFilterPart)newValue);
				return;
			case JavaqueryPackage.FORMULA_FILTER_PART__OPERATOR:
				setOperator((LogicalOperator)newValue);
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
			case JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER1:
				setSubfilter1((BooleanFilterPart)null);
				return;
			case JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER2:
				setSubfilter2((BooleanFilterPart)null);
				return;
			case JavaqueryPackage.FORMULA_FILTER_PART__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER1:
				return subfilter1 != null;
			case JavaqueryPackage.FORMULA_FILTER_PART__SUBFILTER2:
				return subfilter2 != null;
			case JavaqueryPackage.FORMULA_FILTER_PART__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //FormulaFilterPartImpl
