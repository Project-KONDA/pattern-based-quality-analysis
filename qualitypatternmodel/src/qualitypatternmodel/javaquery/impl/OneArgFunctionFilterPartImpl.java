/**
 */
package qualitypatternmodel.javaquery.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaoperators.impl.OneArgJavaOperatorImpl;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.OneArgFunctionFilterPart;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.ValueInterim;
import qualitypatternmodel.javaqueryoutput.ValueResult;
import qualitypatternmodel.javaqueryoutput.impl.ValueInterimImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Arg Function Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.OneArgFunctionFilterPartImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.OneArgFunctionFilterPartImpl#isNegate <em>Negate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneArgFunctionFilterPartImpl extends BooleanFilterPartImpl implements OneArgFunctionFilterPart {

	String functionclassname;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected ValueInterim argument;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OneArgFunctionFilterPartImpl() {
		super();
		setArgument(new ValueInterimImpl());
	}

//	public OneArgFunctionFilterPartImpl(Function f) {
//		super();
//		function = f;
//		setArgument(new ValueInterimImpl());
//	}

	public OneArgFunctionFilterPartImpl(JSONObject json, Map<Integer, InterimResultPart> map) throws InvalidityException {
		super();
		try {
			setNegate(json.getBoolean("negate"));
			functionclassname = json.getString("functionclass");
			ValueInterim argument = (ValueInterim) map.get(json.getInt("argument"));
			setArgument(argument);
		}
		catch (Exception e) {
			throw new InvalidityException();
		}
	}

	public OneArgFunctionFilterPartImpl(Class<? extends OneArgJavaOperatorImpl> clazz) {
		super();
	}

	@Override
	public Boolean apply(InterimResult parameter) {
		assert(parameter instanceof ValueResult);
		String value = ((ValueResult) parameter).getValue();
		OneArgJavaOperatorImpl functionClass = OneArgJavaOperatorImpl.getOneInstanceOf(functionclassname);
		return functionClass.apply(value);
	}

	@Override
	public EList<InterimResultPart> getArguments() {
		EList<InterimResultPart> result = new BasicEList<InterimResultPart>();
		result.add(getArgument());
		return result;
	}

	@Override
	public JSONObject toJson() {
		JSONObject result = new JSONObject();
		try {
			result.put("class", getClass().getSimpleName());
			result.put("negate", negate);
			result.put("functionclass", functionclassname);
			if (getArgument() != null)
				result.put("argument", getArgument().getInterimPartId());
		} catch (JSONException e) {
		}
		return result;
	}

	@Override
	public String toString() {
		if (getArgument() != null)
			return "(oneArg " + getJavaFilterPartId() + " <" + getArgument().getInterimPartId() + ">)";
		else
			return "(oneArg " + getJavaFilterPartId() + " < / >)";
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.ONE_ARG_FUNCTION_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueInterim getArgument() {
		if (argument != null && argument.eIsProxy()) {
			InternalEObject oldArgument = (InternalEObject)argument;
			argument = (ValueInterim)eResolveProxy(oldArgument);
			if (argument != oldArgument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT, oldArgument, argument));
			}
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueInterim basicGetArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument(ValueInterim newArgument) {
		ValueInterim oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT, oldArgument, argument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNegate() {
		return negate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegate(boolean newNegate) {
		boolean oldNegate = negate;
		negate = newNegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__NEGATE, oldNegate, negate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean apply(String param1) {
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
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT:
				if (resolve) return getArgument();
				return basicGetArgument();
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__NEGATE:
				return isNegate();
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
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT:
				setArgument((ValueInterim)newValue);
				return;
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__NEGATE:
				setNegate((Boolean)newValue);
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
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT:
				setArgument((ValueInterim)null);
				return;
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__NEGATE:
				setNegate(NEGATE_EDEFAULT);
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
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__ARGUMENT:
				return argument != null;
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART__NEGATE:
				return negate != NEGATE_EDEFAULT;
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
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART___APPLY__STRING:
				return apply((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OneArgFunctionFilterPartImpl
