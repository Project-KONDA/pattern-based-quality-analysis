/**
 */
package qualitypatternmodel.parameters.impl;

import static qualitypatternmodel.utility.Constants.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Text
 * List</b></em>'.
 * A parameter consisting of a list of <code>Strings</code>.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.TextListParamImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextListParamImpl extends ParameterValueImpl implements TextListParam {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * Concrete values of this parameter specified during concretization.
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> values;

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
		// I do not use an else Statement since either the if is correct and the methods end or the methods goes on
		//Do to this if or without the else the semantics stays the same --> Compare it to .generateSparql()
		StringBuilder cypher = new StringBuilder();
		int i = 0;
		cypher.append("[");
		for(String s : getValues()) {
			if (i > 0) {
				cypher.append(", ");
			}
			if (areValuesInts(s)) {
				cypher.append(s); 	
			} else if (areValuesFloat(s)) {
				cypher.append(s); 
			} else {
				cypher.append("\"" + s +"\""); 
			}
			i++;
		}
	
		cypher.append("]");
		return cypher.toString();
	}
	
	private boolean areValuesInts(String value) {
		boolean areValuesInts = true;
		String regex = "[+-]?[0-9]+";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(value);
		if (!(m.find() && m.group().equals(value))) {
			areValuesInts = false;
		}
		return areValuesInts;
	}
	
//	private List<Integer> convertToInteger() {
//		
//		return null;
//	}
	
	private boolean areValuesFloat(String value) {
		boolean areValuesInts = true;
		String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(value);
		if (!(m.find() && m.group().equals(value))) {
			areValuesInts = false;
		}
		return areValuesInts;
	}
	
//	private List<Float> convertToFloat() {
//		
//		return null;
//	}

	@Override
	public boolean inputIsValid() {
		if (getValues() == null || getValues().isEmpty())
			return false;

		return true;
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
	public EList<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this, ParametersPackage.TEXT_LIST_PARAM__VALUES);
		}
		return values;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.TEXT_LIST_PARAM__VALUES:
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
			case ParametersPackage.TEXT_LIST_PARAM__VALUES:
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
			case ParametersPackage.TEXT_LIST_PARAM__VALUES:
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
			case ParametersPackage.TEXT_LIST_PARAM__VALUES:
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
			case ParametersPackage.TEXT_LIST_PARAM___SET_VALUE_IF_VALID__ELIST:
				try {
					setValueIfValid((EList<String>)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ParametersPackage.TEXT_LIST_PARAM___GET_LIST_VAR:
				return getListVar();
			case ParametersPackage.TEXT_LIST_PARAM___GET_LIST_DECLARATION:
				return getListDeclaration();
			case ParametersPackage.TEXT_LIST_PARAM___ADD_STRING_VALUE__STRING:
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
	
	@Override 
	public String myToString() {
		String res = "list [" + getInternalId() + "] (";
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
