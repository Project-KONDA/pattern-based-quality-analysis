/**
 */
package qualitypatternmodel.parameters.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.MultiListParam;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi List Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MultiListParamImpl extends AbstractListParamImpl implements MultiListParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MultiListParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.MULTI_LIST_PARAM;
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * Generates the sub-query for MultiListParam.
	 */
	@Override 
	public String generateCypher() throws InvalidityException {
		if(getValues().isEmpty()) {
			return super.generateCypher();
		} 
		// I do not use an else Statement since either the if is correct and the methods end or the methods goes on
		//Do to this if or without the else the semantics stays the same --> Compare it to .generateSparql()
		StringBuilder cypher = new StringBuilder();
		int i = 0;
		cypher.append("[");
		for(String s : getValues()) {
			if (i > 0) {
				cypher.append(CypherSpecificConstants.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE);
			}
			if (areValuesInts(s)) {
				cypher.append(s); 	
			} else if (areValuesFloat(s)) {
				cypher.append(s); 
			} else if (areValuesTime(s)) {
				cypher.append("time(\'" + s + "\')"); 
			} else if (areValuesDateTime(s)) {
				cypher.append("datetime(\'" + s + "\')"); 
			} else if (areValuesDate(s)) {
				cypher.append("date(\'" + s + "\')"); 
			} else {
				cypher.append("\"" + s +"\""); 
			}
			i++;
		}
	
		cypher.append("]");
		return cypher.toString();
	}
	
	private boolean matching(String value, boolean areValuesInts, String regex) {
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(value);
		if (!(m.find() && m.group().equals(value))) {
			areValuesInts = false;
		}
		return areValuesInts;
	}
	
	private boolean areValuesDate(String value) {
		boolean areValuesInts = true;
		String regex = "\\d{4}-\\d{2}-\\d{2}";
		areValuesInts = matching(value, areValuesInts, regex);
		return areValuesInts;
	}

	private boolean areValuesDateTime(String value) {
		boolean areValuesInts = true;
		String regex = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}";
		areValuesInts = matching(value, areValuesInts, regex);
		return areValuesInts;
	}


	private boolean areValuesTime(String value) {
		boolean areValuesInts = true;
		String regex = "\\d{2}:\\d{2}:\\d{2}";
		areValuesInts = matching(value, areValuesInts, regex);
		return areValuesInts;
	}

	private boolean areValuesInts(String value) {
		boolean areValuesInts = true;
		String regex = "[+-]?[0-9]+";
		areValuesInts = matching(value, areValuesInts, regex);
		return areValuesInts;
	}
	
	private boolean areValuesFloat(String value) {
		boolean areValuesInts = true;
		String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
		areValuesInts = matching(value, areValuesInts, regex);
		return areValuesInts;
	}

	@Override 
	public String myToString() {
		String res = "MulitListParam: list [" + getInternalId() + "] (";
		for (int i = 0; i < getValues().size(); i++) {
			if (i>0) res += ", ";
			res += "'" + getValues().get(i) + "'";
		}
		return res + ")";
	}

	@Override
	public String generateDescription() {
		String res = "Input of a String List which will be converted to the fitting datatyp";
		return res;
	}
	
	@Override
	public void setValueFromString(String value) {
		throw new UnsupportedOperationException();
	}

} //MultiListParamImpl
