/**
 */
package qualitypatternmodel.parameters.impl;

import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONException;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Text
 * List</b></em>'.
 * A parameter consisting of a list of <code>Strings</code>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TextListParamImpl extends ListParamImpl implements TextListParam {
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
		if (getValues() == null)
			return null;
		JSONArray jarray = new JSONArray(getValues());
		return jarray.toString();
	}
	
	@Override
	public void setValueFromString(String value) {
		try {
			JSONArray jarray = new JSONArray(value);
	        getValues().clear();   
	        for (int i = 0; i<jarray.length();i++) {
	        	String v = jarray.getString(i);
	        	getValues().add(v);
	        }
		}
		catch (JSONException e){
			value = value.trim();
			String trimmed = value.substring(1, value.length() - 1);
	        String[] values = trimmed.split(",");
	        getValues().clear();
	        for (String val: values) {
	        	String v = val.trim().replaceAll("\"",  "").trim();
	        	getValues().add(v);
	        }
		}
	}

	@Override
	public void clear() {
		if (getValues() != null)
			getValues().clear();
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

	@Override 
	public String myToString() {
		String res = "TextListParam [" + getInternalId() + "] (";
		for (int i = 0; i < getValues().size(); i++) {
			if (i>0) res += ", ";
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
