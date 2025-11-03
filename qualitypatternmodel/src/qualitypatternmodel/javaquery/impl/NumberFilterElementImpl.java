/**
 */
package qualitypatternmodel.javaquery.impl;

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
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.NumberFilterElement;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.ValueInterim;
import qualitypatternmodel.javaqueryoutput.ValueResult;
import qualitypatternmodel.javaqueryoutput.impl.ValueInterimImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Filter Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.NumberFilterElementImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberFilterElementImpl extends NumberFilterPartImpl implements NumberFilterElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NumberFilterElementImpl() {
		super();
		setArgument(new ValueInterimImpl());
	}

	public NumberFilterElementImpl(JSONObject json, Map<Integer, InterimResultPart> map) throws InvalidityException {
		super();
		try {
			ValueInterim argument = (ValueInterim) map.get(json.getInt("argument"));
			setArgument(argument);
		}
		catch (Exception e) {
			throw new InvalidityException();
		}
	}

	@Override
	public Double apply(InterimResult parameter) throws InvalidityException{
		assert(parameter instanceof ValueResult);
		String value = ((ValueResult) parameter).getValue();
		Double result;
		try {
			result = Double.parseDouble(value);
		} catch (Exception e) {
			throw new InvalidityException(e.getMessage());
		}
		return result;
	}

	@Override
	public EList<InterimResultPart> getArguments() {
		EList<InterimResultPart> result = new BasicEList<>();
		result.add(getArgument());
		return result;
	}

	@Override
	public JSONObject toJson() {
		JSONObject result = new JSONObject();
		try {
			result.put("class", getClass().getSimpleName());
			result.put("argument", getArgument().getInterimPartId());
		} catch (JSONException e) {
		}
		return result;
	}

	@Override
	public String toString() {
		return "(number " + getJavaFilterPartId() + " <" + getArgument().getInterimPartId() + ">)";
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.NUMBER_FILTER_ELEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.NUMBER_FILTER_ELEMENT__ARGUMENT, oldArgument, argument));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.NUMBER_FILTER_ELEMENT__ARGUMENT, oldArgument, argument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaqueryPackage.NUMBER_FILTER_ELEMENT__ARGUMENT:
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
			case JavaqueryPackage.NUMBER_FILTER_ELEMENT__ARGUMENT:
				setArgument((ValueInterim)newValue);
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
			case JavaqueryPackage.NUMBER_FILTER_ELEMENT__ARGUMENT:
				setArgument((ValueInterim)null);
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
			case JavaqueryPackage.NUMBER_FILTER_ELEMENT__ARGUMENT:
				return argument != null;
		}
		return super.eIsSet(featureID);
	}

} //NumberFilterElementImpl
