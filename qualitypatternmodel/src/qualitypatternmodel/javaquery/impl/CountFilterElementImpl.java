/**
 */
package qualitypatternmodel.javaquery.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.CountFilterElement;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaqueryoutput.ContainerResult;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.VariableContainerInterim;
import qualitypatternmodel.javaqueryoutput.impl.VariableContainerInterimImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Filter Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.CountFilterElementImpl#getSubfilter <em>Subfilter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.CountFilterElementImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountFilterElementImpl extends NumberFilterPartImpl implements CountFilterElement {
	/**
	 * The cached value of the '{@link #getSubfilter() <em>Subfilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfilter()
	 * @generated
	 * @ordered
	 */
	protected BooleanFilterPart subfilter;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected VariableContainerInterim argument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CountFilterElementImpl() {
		super();
		setArgument(new VariableContainerInterimImpl());
	}

	public CountFilterElementImpl(BooleanFilterPart subfilter) {
		super();
		setArgument(new VariableContainerInterimImpl());
		setSubfilter(subfilter);
	}
	
	@Override
	public Double apply(InterimResult parameter) throws InvalidityException {
		assert (parameter instanceof ContainerResult);
		ContainerResult param = (ContainerResult) parameter;
		EList<InterimResult> arguments = param.getSubresult();
		int i = 0;
		for (InterimResult argument: arguments)
			if (getSubfilter().apply(argument))
				i++;
		return (double) i;
		
	};

	@Override
	public EList<InterimResultPart> getArguments() {
		EList<InterimResultPart> result = new BasicEList<InterimResultPart>();
		result.add(getArgument());
		return result;
	}
	
	protected void updateArgument() throws InvalidityException {
		EList<InterimResultPart> contained = getSubfilter().getArguments();
		if (contained == null)
			getArgument().setContained(null);
		else if (contained.size() == 1)
			getArgument().setContained(contained.get(0));
		else 
			throw new InvalidityException("CountFilterElement has too much arguments");
	}
	
	@Override
	public String toString() {
		return "[count " + getJavaFilterPartId() + " <" + getArgument().getInterimPartId() + "> " + getSubfilter().toString() + "]";
	}
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.COUNT_FILTER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanFilterPart getSubfilter() {
		return subfilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetSubfilter(BooleanFilterPart newSubfilter, NotificationChain msgs) {
		BooleanFilterPart oldSubfilter = subfilter;
		subfilter = newSubfilter;
		try {
			updateArgument();
		} catch (InvalidityException e) {
			e.printStackTrace();
		}
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_ELEMENT__SUBFILTER, oldSubfilter, newSubfilter);
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
	public void setSubfilter(BooleanFilterPart newSubfilter) {
		if (newSubfilter != subfilter) {
			NotificationChain msgs = null;
			if (subfilter != null)
				msgs = ((InternalEObject)subfilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.COUNT_FILTER_ELEMENT__SUBFILTER, null, msgs);
			if (newSubfilter != null)
				msgs = ((InternalEObject)newSubfilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.COUNT_FILTER_ELEMENT__SUBFILTER, null, msgs);
			msgs = basicSetSubfilter(newSubfilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_ELEMENT__SUBFILTER, newSubfilter, newSubfilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableContainerInterim getArgument() {
		if (argument != null && argument.eIsProxy()) {
			InternalEObject oldArgument = (InternalEObject)argument;
			argument = (VariableContainerInterim)eResolveProxy(oldArgument);
			if (argument != oldArgument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.COUNT_FILTER_ELEMENT__ARGUMENT, oldArgument, argument));
			}
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableContainerInterim basicGetArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument(VariableContainerInterim newArgument) {
		VariableContainerInterim oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.COUNT_FILTER_ELEMENT__ARGUMENT, oldArgument, argument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryPackage.COUNT_FILTER_ELEMENT__SUBFILTER:
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
			case JavaqueryPackage.COUNT_FILTER_ELEMENT__SUBFILTER:
				return getSubfilter();
			case JavaqueryPackage.COUNT_FILTER_ELEMENT__ARGUMENT:
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
			case JavaqueryPackage.COUNT_FILTER_ELEMENT__SUBFILTER:
				setSubfilter((BooleanFilterPart)newValue);
				return;
			case JavaqueryPackage.COUNT_FILTER_ELEMENT__ARGUMENT:
				setArgument((VariableContainerInterim)newValue);
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
			case JavaqueryPackage.COUNT_FILTER_ELEMENT__SUBFILTER:
				setSubfilter((BooleanFilterPart)null);
				return;
			case JavaqueryPackage.COUNT_FILTER_ELEMENT__ARGUMENT:
				setArgument((VariableContainerInterim)null);
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
			case JavaqueryPackage.COUNT_FILTER_ELEMENT__SUBFILTER:
				return subfilter != null;
			case JavaqueryPackage.COUNT_FILTER_ELEMENT__ARGUMENT:
				return argument != null;
		}
		return super.eIsSet(featureID);
	}

} //CountFilterElementImpl
