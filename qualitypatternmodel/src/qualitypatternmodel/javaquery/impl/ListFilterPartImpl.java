/**
 */
package qualitypatternmodel.javaquery.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.javaquery.Combinator;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.ListFilterPart;
import qualitypatternmodel.javaqueryoutput.ContainerInterimResultPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.ListFilterPartImpl#getCombinator <em>Combinator</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.ListFilterPartImpl#getSubfilter <em>Subfilter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.ListFilterPartImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListFilterPartImpl extends JavaFilterPartImpl implements ListFilterPart {
	/**
	 * The cached value of the '{@link #getCombinator() <em>Combinator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinator()
	 * @generated
	 * @ordered
	 */
	protected Combinator combinator;

	/**
	 * The cached value of the '{@link #getSubfilter() <em>Subfilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfilter()
	 * @generated
	 * @ordered
	 */
	protected JavaFilterPart subfilter;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected ContainerInterimResultPart argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListFilterPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.LIST_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Combinator getCombinator() {
		return combinator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCombinator(Combinator newCombinator, NotificationChain msgs) {
		Combinator oldCombinator = combinator;
		combinator = newCombinator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.LIST_FILTER_PART__COMBINATOR, oldCombinator, newCombinator);
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
	public void setCombinator(Combinator newCombinator) {
		if (newCombinator != combinator) {
			NotificationChain msgs = null;
			if (combinator != null)
				msgs = ((InternalEObject)combinator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.LIST_FILTER_PART__COMBINATOR, null, msgs);
			if (newCombinator != null)
				msgs = ((InternalEObject)newCombinator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.LIST_FILTER_PART__COMBINATOR, null, msgs);
			msgs = basicSetCombinator(newCombinator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.LIST_FILTER_PART__COMBINATOR, newCombinator, newCombinator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaFilterPart getSubfilter() {
		return subfilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubfilter(JavaFilterPart newSubfilter, NotificationChain msgs) {
		JavaFilterPart oldSubfilter = subfilter;
		subfilter = newSubfilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.LIST_FILTER_PART__SUBFILTER, oldSubfilter, newSubfilter);
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
	public void setSubfilter(JavaFilterPart newSubfilter) {
		if (newSubfilter != subfilter) {
			NotificationChain msgs = null;
			if (subfilter != null)
				msgs = ((InternalEObject)subfilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.LIST_FILTER_PART__SUBFILTER, null, msgs);
			if (newSubfilter != null)
				msgs = ((InternalEObject)newSubfilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.LIST_FILTER_PART__SUBFILTER, null, msgs);
			msgs = basicSetSubfilter(newSubfilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.LIST_FILTER_PART__SUBFILTER, newSubfilter, newSubfilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerInterimResultPart getArgument() {
		if (argument != null && argument.eIsProxy()) {
			InternalEObject oldArgument = (InternalEObject)argument;
			argument = (ContainerInterimResultPart)eResolveProxy(oldArgument);
			if (argument != oldArgument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.LIST_FILTER_PART__ARGUMENT, oldArgument, argument));
			}
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInterimResultPart basicGetArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument(ContainerInterimResultPart newArgument) {
		ContainerInterimResultPart oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.LIST_FILTER_PART__ARGUMENT, oldArgument, argument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryPackage.LIST_FILTER_PART__COMBINATOR:
				return basicSetCombinator(null, msgs);
			case JavaqueryPackage.LIST_FILTER_PART__SUBFILTER:
				return basicSetSubfilter(null, msgs);
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
			case JavaqueryPackage.LIST_FILTER_PART__COMBINATOR:
				return getCombinator();
			case JavaqueryPackage.LIST_FILTER_PART__SUBFILTER:
				return getSubfilter();
			case JavaqueryPackage.LIST_FILTER_PART__ARGUMENT:
				if (resolve) return getArgument();
				return basicGetArgument();
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
			case JavaqueryPackage.LIST_FILTER_PART__COMBINATOR:
				setCombinator((Combinator)newValue);
				return;
			case JavaqueryPackage.LIST_FILTER_PART__SUBFILTER:
				setSubfilter((JavaFilterPart)newValue);
				return;
			case JavaqueryPackage.LIST_FILTER_PART__ARGUMENT:
				setArgument((ContainerInterimResultPart)newValue);
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
			case JavaqueryPackage.LIST_FILTER_PART__COMBINATOR:
				setCombinator((Combinator)null);
				return;
			case JavaqueryPackage.LIST_FILTER_PART__SUBFILTER:
				setSubfilter((JavaFilterPart)null);
				return;
			case JavaqueryPackage.LIST_FILTER_PART__ARGUMENT:
				setArgument((ContainerInterimResultPart)null);
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
			case JavaqueryPackage.LIST_FILTER_PART__COMBINATOR:
				return combinator != null;
			case JavaqueryPackage.LIST_FILTER_PART__SUBFILTER:
				return subfilter != null;
			case JavaqueryPackage.LIST_FILTER_PART__ARGUMENT:
				return argument != null;
		}
		return super.eIsSet(featureID);
	}

} //ListFilterPartImpl
