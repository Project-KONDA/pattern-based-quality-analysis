/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNameParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Property Name Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NeoPropertyNameParamImpl extends TextLiteralParamImpl implements NeoPropertyNameParam {
	private static final String A_PROPERTY_NAME_CAN_NOT_BE_EMPTY = "A Property Name can not be empty";
	private static final String NULL_IS_NOT_A_VALID_PROPERTY_NAME = "Null is not a valid Property Name";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoPropertyNameParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_PROPERTY_NAME_PARAM;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueIfValid(String newValue) throws InvalidityException {
		//For resetting the value
		if (newValue == null) {
			value = null;
			return;
		}
		checkPropertyName(newValue);
		setValue(newValue);
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @param value
	 * @throws InvalidityException
	 *  Checks for if a Property Name is valid. 
	 *  Null is not handled.
	 */
	private void checkPropertyName(String value) throws InvalidityException {
		if (value.isBlank()) {
			throw new InvalidityException(A_PROPERTY_NAME_CAN_NOT_BE_EMPTY);
		}
		value = value.trim();
		if (!value.matches("[A-Za-zäöüß_0-9]+")) {
			throw new InvalidityException(CypherSpecificConstants.ONLY_ALPHANUMERICAL_VALUES_AND_UNDERSCORE);
		}			
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 */
	@Override 
	public String generateCypher() throws InvalidityException {
		if (getValue() == null) {
			throw new InvalidityException(NULL_IS_NOT_A_VALID_PROPERTY_NAME);
		}
		return getValue();
	}
	
	
	@Override
	public String generateXQuery() throws InvalidityException {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		throw new UnsupportedOperationException();
	}
} //NeoPropertyNameParamImpl
