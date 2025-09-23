/**
 */
package qualitypatternmodel.parameters;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.TextParam#getContains <em>Contains</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.TextParam#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.parameters.ParametersPackage#getTextParam()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TextParam extends ParameterValue {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Contains}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Contains#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextParam_Contains()
	 * @see qualitypatternmodel.operators.Contains#getContent
	 * @model opposite="content"
	 * @generated
	 */
	EList<Contains> getContains();

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Match}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Match#getRegularExpression <em>Regular Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' reference list.
	 * @see qualitypatternmodel.parameters.ParametersPackage#getTextParam_Matches()
	 * @see qualitypatternmodel.operators.Match#getRegularExpression
	 * @model opposite="regularExpression"
	 * @generated
	 */
	EList<Match> getMatches();

} // TextParam
