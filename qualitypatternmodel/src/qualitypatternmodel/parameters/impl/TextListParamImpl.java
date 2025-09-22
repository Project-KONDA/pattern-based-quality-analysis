/**
 */
package qualitypatternmodel.parameters.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONArray;
import org.json.JSONException;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextParam;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Text
 * List</b></em>'.
 * A parameter consisting of a list of <code>Strings</code>.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextListParamImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextListParamImpl#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextListParamImpl extends ListParamImpl implements TextListParam {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Contains> contains;
	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TextListParamImpl() {
		super();
	}

	@Override
	public String getValueAsString() {
		if (values == null) {
			return null;
		}
		JSONArray jarray = new JSONArray(getValues());
		return jarray.toString();
	}

	@Override
	public void setValueFromString(String value) throws InvalidityException {
		if (value == null) {
			this.clear();
			return;
		}
		try {
			JSONArray jarray = new JSONArray(value);
	        getValues().clear();
	        for (int i = 0; i<jarray.length();i++) {
	        	String v = jarray.getString(i);
	        	getValues().add(v);
	        }
		}
		catch (JSONException e) {
	        getValues().clear();
	        getValues().add(value);
//			value = value.trim();
//			if (value.startsWith("[") && value.endsWith("]"))
//				value = value.substring(1, value.length() - 1);
//	        String[] values = value.split(",");
//	        getValues().clear();
//	        for (String val: values) {
//	        	String v = val.trim().replaceAll("\"",  "").trim();
//	        	getValues().add(v);
//	        }
		}
	}

	@Override
	public void clear() {
		values = null;
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		return getListVar();
	}

	@Override
	public String generateSparql() throws InvalidityException {
		if(getValues().isEmpty()) {
			return super.generateSparql();
		} else {
			String regex = "";
			int i = 0;
			for(String s : getValues()) {
				if(i > 0) {
					regex += "|";
				}
				regex += s;
				i++;
			}
			return regex;
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * Generates the sub-query for TextListParam.
	 */
	@Override
	public String generateCypher() throws InvalidityException {
		if(!super.inputIsValid()) {
			return super.generateCypher();
		}
		final StringBuilder cypher = new StringBuilder();
		int i = 0;
		cypher.append("[");
		for(String s : getValues()) {
			if (i > 0) {
				cypher.append(", ");
			}
			cypher.append("\"" + s + "\"");
			i++;
		}

		cypher.append("]");
		return cypher.toString();
	}


	@Override
	public ReturnType getReturnType() {
		return ReturnType.STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.TEXT_LIST_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contains> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList<Contains>(Contains.class, this, ParametersPackage.TEXT_LIST_PARAM__CONTAINS, OperatorsPackage.CONTAINS__CONTENT);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectWithInverseResolvingEList<Match>(Match.class, this, ParametersPackage.TEXT_LIST_PARAM__MATCHES, OperatorsPackage.MATCH__REGULAR_EXPRESSION);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.TEXT_LIST_PARAM__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case ParametersPackage.TEXT_LIST_PARAM__MATCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatches()).basicAdd(otherEnd, msgs);
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
			case ParametersPackage.TEXT_LIST_PARAM__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case ParametersPackage.TEXT_LIST_PARAM__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
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
			case ParametersPackage.TEXT_LIST_PARAM__CONTAINS:
				return getContains();
			case ParametersPackage.TEXT_LIST_PARAM__MATCHES:
				return getMatches();
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
			case ParametersPackage.TEXT_LIST_PARAM__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Contains>)newValue);
				return;
			case ParametersPackage.TEXT_LIST_PARAM__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
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
			case ParametersPackage.TEXT_LIST_PARAM__CONTAINS:
				getContains().clear();
				return;
			case ParametersPackage.TEXT_LIST_PARAM__MATCHES:
				getMatches().clear();
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
			case ParametersPackage.TEXT_LIST_PARAM__CONTAINS:
				return contains != null && !contains.isEmpty();
			case ParametersPackage.TEXT_LIST_PARAM__MATCHES:
				return matches != null && !matches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TextParam.class) {
			switch (derivedFeatureID) {
				case ParametersPackage.TEXT_LIST_PARAM__CONTAINS: return ParametersPackage.TEXT_PARAM__CONTAINS;
				case ParametersPackage.TEXT_LIST_PARAM__MATCHES: return ParametersPackage.TEXT_PARAM__MATCHES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TextParam.class) {
			switch (baseFeatureID) {
				case ParametersPackage.TEXT_PARAM__CONTAINS: return ParametersPackage.TEXT_LIST_PARAM__CONTAINS;
				case ParametersPackage.TEXT_PARAM__MATCHES: return ParametersPackage.TEXT_LIST_PARAM__MATCHES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	public String myToString() {
		String res = "TextListParam [" + getInternalId() + "] (";
		for (int i = 0; i < getValues().size(); i++) {
			if (i>0) {
				res += ", ";
			}
			res += "'" + getValues().get(i) + "'";
		}
		return res + ")";
	}

	@Override
	public String generateDescription() {
		String res = "Eingabe einer Liste von Strings";
		return res;
//		try {} catch (Exception e) {}
//		setDescription(res);
	}

} // TextListImpl
