/**
 */
package qualitypatternmodel.parameters.impl;

import static qualitypatternmodel.utility.Constants.LET;
import static qualitypatternmodel.utility.Constants.LISTVARIABLE;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import qualitypatternmodel.exceptions.InvalidityException;

import qualitypatternmodel.parameters.ListParam;
import qualitypatternmodel.parameters.ParametersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract List Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.ListParamImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ListParamImpl extends ParameterValueImpl implements ListParam {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.LIST_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this, ParametersPackage.LIST_PARAM__VALUES);
		}
		return values;
	}

	@Override
	public boolean inputIsValid() {
		if (getValues() == null || getValues().isEmpty()) {
			return false;	
		}
		return true;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueIfValid(EList<String> newValue) throws InvalidityException {
		EList<String> oldValue = getValues();
		getValues().clear();
		getValues().addAll(newValue);	
		try {
			checkComparisonConsistency();
		} catch (Exception e) {
			getValues().clear();
			getValues().addAll(oldValue);
			throw e;
		}			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getListVar() {
		return LISTVARIABLE + getInternalId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getListDeclaration() {
		String res = LET + getListVar() + " := (";
		for (int i = 0; i<getValues().size(); i++) {
			if (i!=0) res += ", ";
			res += "'" + getValues().get(i) + "'";
		}
		return res + ")";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addStringValue(String value) {
		if (this.values == null) {
			this.values = new BasicEList<String>();
		}
		if (!this.values.contains(value)) {
			this.values.add(value);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.LIST_PARAM__VALUES:
				return getValues();
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
			case ParametersPackage.LIST_PARAM__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends String>)newValue);
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
			case ParametersPackage.LIST_PARAM__VALUES:
				getValues().clear();
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
			case ParametersPackage.LIST_PARAM__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ParametersPackage.LIST_PARAM___SET_VALUE_IF_VALID__ELIST:
				try {
					setValueIfValid((EList<String>)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ParametersPackage.LIST_PARAM___GET_LIST_VAR:
				return getListVar();
			case ParametersPackage.LIST_PARAM___GET_LIST_DECLARATION:
				return getListDeclaration();
			case ParametersPackage.LIST_PARAM___ADD_STRING_VALUE__STRING:
				addStringValue((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}

} //AbstractListParamImpl
