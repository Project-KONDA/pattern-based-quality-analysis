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
	public static final String LABEL_REGEX = "[A-Za-zäöüß_0-9]+";
	public static final String A_LABEL_CAN_NOT_BE_EMPTY = "A Label can not be empty";
	static final String A_LABEL_CAN_NOT_CONTAIN_WHITESPACE_S = "A Label can not contain Whitespace(s)";
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException 
	 * Checks for if a label is valid. 
	 * Null and an empty String are not handled.
	 */
	default void checkLabel(String value) throws InvalidityException {
		if (value != null && !(value.isEmpty())) {
			if (value.contains(CypherSpecificConstants.ONE_WHITESPACE)) {
				throw new InvalidityException(A_LABEL_CAN_NOT_CONTAIN_WHITESPACE_S);
			}
			if (!value.matches(LABEL_REGEX)) {
				throw new InvalidityException(CypherSpecificConstants.ONLY_ALPHANUMERICAL_VALUES_AND_UNDERSCORE);
			}			
		}
	}
} // NeoLabel
