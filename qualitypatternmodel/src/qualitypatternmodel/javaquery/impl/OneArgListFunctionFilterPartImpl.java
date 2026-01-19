/**
 */
package qualitypatternmodel.javaquery.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.json.JSONArray;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaoperators.impl.OneArgJavaListOperatorImpl;
import qualitypatternmodel.javaoperators.impl.OneArgJavaOperatorImpl;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.OneArgListFunctionFilterPart;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.ValueInterim;
import qualitypatternmodel.javaqueryoutput.ValueResult;
import qualitypatternmodel.javaqueryoutput.impl.ValueInterimImpl;
import qualitypatternmodel.utility.ConstantsJSON;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>One Arg List Function Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.OneArgListFunctionFilterPartImpl#getList <em>List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OneArgListFunctionFilterPartImpl extends OneArgFunctionFilterPartImpl implements OneArgListFunctionFilterPart {
	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected EList<String> list;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OneArgListFunctionFilterPartImpl() {
		super();
		setArgument(new ValueInterimImpl());
	}

	public OneArgListFunctionFilterPartImpl(Class<? extends OneArgJavaListOperatorImpl> clazz, EList<String> list, Boolean negate) {
		super();
		setArgument(new ValueInterimImpl());
		setNegate(negate);
		functionclassname = clazz.getSimpleName();
		getList().clear();
		getList().addAll(list);
	}

	public OneArgListFunctionFilterPartImpl(JSONObject json, Map<Integer, InterimResultPart> map) throws InvalidityException {
		super();
		try {
			ValueInterim argument = (ValueInterim) map.get(json.getInt(ConstantsJSON.ARGUMENT));
			setArgument(argument);
			setNegate(json.getBoolean(ConstantsJSON.NEGATE));
			functionclassname = json.getString(ConstantsJSON.ARGUMENT_FUNCTION);
			JSONArray list = json.getJSONArray(ConstantsJSON.ARGUMENT_LIST);
			getList().clear();
			for (int i = 0; i<list.length(); i++)
				getList().add(list.getString(i));
		}
		catch (Exception e) {
			throw new InvalidityException("Error creating OneArgListFunctionFilterPartImpl", e);
		}
	}

	@Override
	public Boolean apply(InterimResult parameter) {
		assert(parameter instanceof ValueResult);
		String value = ((ValueResult) parameter).getValue();
		OneArgJavaOperatorImpl functionClass = OneArgJavaListOperatorImpl.getOneInstanceOf(functionclassname, getList(), negate);
		boolean result = functionClass.apply(value);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.ONE_ARG_LIST_FUNCTION_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getList() {
		if (list == null) {
			list = new EDataTypeUniqueEList<String>(String.class, this, JavaqueryPackage.ONE_ARG_LIST_FUNCTION_FILTER_PART__LIST);
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaqueryPackage.ONE_ARG_LIST_FUNCTION_FILTER_PART__LIST:
				return getList();
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
			case JavaqueryPackage.ONE_ARG_LIST_FUNCTION_FILTER_PART__LIST:
				getList().clear();
				getList().addAll((Collection<? extends String>)newValue);
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
			case JavaqueryPackage.ONE_ARG_LIST_FUNCTION_FILTER_PART__LIST:
				getList().clear();
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
			case JavaqueryPackage.ONE_ARG_LIST_FUNCTION_FILTER_PART__LIST:
				return list != null && !list.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public JSONObject toJson() {
		JSONObject result = super.toJson();
		JSONArray list = new JSONArray(getList());
		result.put(ConstantsJSON.ARGUMENT_LIST, list);
		return result;
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
		result.append(" (list: ");
		result.append(list);
		result.append(')');
		return result.toString();
	}

} //OneArgListFunctionFilterPartImpl
