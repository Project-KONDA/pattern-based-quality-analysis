/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.utility.Constants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UntypedParameterValue</b></em>'.
 * A parameter of unknown type.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class UntypedParameterValueImpl extends ParameterValueImpl implements UntypedParameterValue {
	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public UntypedParameterValueImpl() {
		super();
		setTypeModifiable(true);
	}
	
	@Override
	public String getValueAsString() {
		return null;
	}
	
	@Override
	public void setValueFromString(String value) {
		// TODO
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.UNSPECIFIED;
	}
	
	@Override
	public boolean isUsed() {
		return !getComparison1().isEmpty() || !getComparison2().isEmpty();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.UNTYPED_PARAMETER_VALUE;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValue(String val) {
		replace(new TextLiteralParamImpl(val));	
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void replaceViaValue(String[] values, String type) throws InvalidityException {
		if(type.equals(Constants.PARAMETER_TYPE_TEXT_LIST)) {
			TextListParam textList = ParametersFactory.eINSTANCE.createTextListParam();
			textList.getValues().clear();
			textList.getValues().addAll(Arrays.asList(values));			
			replace(textList);
		} else if(values.length == 1) {
			switch (type) {
			case Constants.PARAMETER_TYPE_TEXT:
				TextLiteralParam text = ParametersFactory.eINSTANCE.createTextLiteralParam();
				text.setValueFromString(values[0]);
				replace(text);
				break;			
			case Constants.PARAMETER_TYPE_NUMBER:
				NumberParam number = ParametersFactory.eINSTANCE.createNumberParam();
				number.setValueFromString(values[0]);
				replace(number);
				break;
			case Constants.PARAMETER_TYPE_BOOLEAN:
				BooleanParam bool = ParametersFactory.eINSTANCE.createBooleanParam();
				bool.setValueFromString(values[0]);
				replace(bool);
				break;
			case Constants.PARAMETER_TYPE_DATE:
				DateParam date = ParametersFactory.eINSTANCE.createDateParam();
				date.setValueFromString(values[0]);
				replace(date);
				break;
			case Constants.PARAMETER_TYPE_TIME:
				TimeParam time = ParametersFactory.eINSTANCE.createTimeParam();
				time.setValueFromString(values[0]);
				replace(time);
				break;
			case Constants.PARAMETER_TYPE_DATE_TIME:
				DateTimeParam dateTime = ParametersFactory.eINSTANCE.createDateTimeParam();
				dateTime.setValueFromString(values[0]);
				replace(dateTime);
				break;

			default:
				throw new InvalidityException("Parameter type invalid");
			}
		} else {
			throw new InvalidityException("Too many values passed.");
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ParametersPackage.UNTYPED_PARAMETER_VALUE___SET_VALUE__STRING:
				setValue((String)arguments.get(0));
				return null;
			case ParametersPackage.UNTYPED_PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING:
				try {
					replaceViaValue((String[])arguments.get(0), (String)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}



	@Override
	public boolean inputIsValid() {
		return false;
	}
	
	@Override 
	public String myToString() {
		return "unknown" + " [" + getInternalId() + "]";
	}
	
	@Override
	public String generateDescription() {
		String res = "Eingabe eines unspezifizierten Datentypes";
		return res;
//		try {} catch (Exception e) {}
//		setDescription(res);
	}

} //UnknownInputValueImpl
