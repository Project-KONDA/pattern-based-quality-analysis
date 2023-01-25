/**
 */
package qualitypatternmodel.adaptionneo4j;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Label</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#getNeoLabel()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface NeoLabel extends EObject {
	public static final String A_LABEL_CAN_ONLY_CONSIST_OF_NUMERIC_AND_ALPHANUMERIC_VALUES_AND_UNDERSCORES = "A label can only consist of numeric and alphanumeric values and underscores.";
	public static final String A_LABEL_CAN_NOT_BE_EMPTY = "A Label can not be empty";
	static final String A_LABEL_CAN_NOT_CONTAIN_WHITESPACE_S = "A Label can not contain Whitespace(s)";
	//alpa, numerical and _
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * @model dataType="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated NOT
	 */
	default void checkLabel(String value) throws InvalidityException {
		if (value != null && !(value.isEmpty())) {
			if (value.contains(CypherSpecificConstants.ONE_WHITESPACE)) {
				throw new InvalidityException(A_LABEL_CAN_NOT_CONTAIN_WHITESPACE_S);
			}
			if (!value.matches("[A-Za-z_0-9]+")) {
				throw new InvalidityException(A_LABEL_CAN_ONLY_CONSIST_OF_NUMERIC_AND_ALPHANUMERIC_VALUES_AND_UNDERSCORES);
			}			
		}
	}
} // NeoLabel
