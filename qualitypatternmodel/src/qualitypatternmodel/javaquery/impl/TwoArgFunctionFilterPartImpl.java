/**
 */
package qualitypatternmodel.javaquery.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.TwoArgFunctionFilterPart;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.ValueInterim;
import qualitypatternmodel.javaqueryoutput.impl.ValueInterimImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Two Arg Function Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.TwoArgFunctionFilterPartImpl#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TwoArgFunctionFilterPartImpl extends BooleanFilterPartImpl implements TwoArgFunctionFilterPart {	
	
	protected Function function;
	
	@Override
	public void setFunction(Function f) {
		function = f;
	}
	/**
	 * The cached value of the '{@link #getArgument1() <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument1()
	 * @generated
	 * @ordered
	 */
	protected ValueInterim argument1;

	/**
	 * The cached value of the '{@link #getArgument2() <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument2()
	 * @generated
	 * @ordered
	 */
	protected ValueInterim argument2;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected TwoArgFunctionFilterPartImpl() {
		super();
		setArgument1(new ValueInterimImpl());
		setArgument2(new ValueInterimImpl());
	}
	
	protected TwoArgFunctionFilterPartImpl(Function f) {
		super();
		setFunction(f);
		setArgument1(new ValueInterimImpl());
		setArgument2(new ValueInterimImpl());
	}
	
	@Override
	public Boolean apply(InterimResult parameter) {return true;};

	@Override
	public EList<InterimResultPart> getArguments() {
		EList<InterimResultPart> result = new BasicEList<InterimResultPart>();
		result.add(getArgument1());
		result.add(getArgument2());
		return result;
	}
	
	@Override
	public String toString() {
		return "(oneArg " + getJavaFilterPartId() + " <" + getArgument1().getInterimPartId() + "x" + getArgument2().getInterimPartId() + ">)";
	}
	
	
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.TWO_ARG_FUNCTION_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueInterim getArgument1() {
		if (argument1 != null && argument1.eIsProxy()) {
			InternalEObject oldArgument1 = (InternalEObject)argument1;
			argument1 = (ValueInterim)eResolveProxy(oldArgument1);
			if (argument1 != oldArgument1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1, oldArgument1, argument1));
			}
		}
		return argument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueInterim basicGetArgument1() {
		return argument1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument1(ValueInterim newArgument1) {
		ValueInterim oldArgument1 = argument1;
		argument1 = newArgument1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1, oldArgument1, argument1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueInterim getArgument2() {
		if (argument2 != null && argument2.eIsProxy()) {
			InternalEObject oldArgument2 = (InternalEObject)argument2;
			argument2 = (ValueInterim)eResolveProxy(oldArgument2);
			if (argument2 != oldArgument2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2, oldArgument2, argument2));
			}
		}
		return argument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueInterim basicGetArgument2() {
		return argument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument2(ValueInterim newArgument2) {
		ValueInterim oldArgument2 = argument2;
		argument2 = newArgument2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2, oldArgument2, argument2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean apply(String param1, String param2) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1:
				if (resolve) return getArgument1();
				return basicGetArgument1();
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2:
				if (resolve) return getArgument2();
				return basicGetArgument2();
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1:
				setArgument1((ValueInterim)newValue);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2:
				setArgument2((ValueInterim)newValue);
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1:
				setArgument1((ValueInterim)null);
				return;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2:
				setArgument2((ValueInterim)null);
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT1:
				return argument1 != null;
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART__ARGUMENT2:
				return argument2 != null;
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
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART___APPLY__STRING_STRING:
				return apply((String)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
} //TwoArgFunctionFilterPartImpl
