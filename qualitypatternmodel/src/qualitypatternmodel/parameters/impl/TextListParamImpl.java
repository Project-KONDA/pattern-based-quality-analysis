/**
 */
package qualitypatternmodel.parameters.impl;

import org.eclipse.emf.ecore.EClass;
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
public class TextListParamImpl extends AbstractListParamImpl implements TextListParam {
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
		String s = "[";
		for(String value : values) {
			s += "\"" + value + "\", ";
		}
		s = s.substring(0, s.length()-1);
		s += "]";
		return s;
	}
	
	@Override
	public void setValueFromString(String value) {
		throw new UnsupportedOperationException();
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
	
	@Override 
	public String generateCypher() throws InvalidityException {
		if(getValues().isEmpty()) {
			return super.generateCypher();
		} 
		StringBuilder cypher = new StringBuilder();
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
