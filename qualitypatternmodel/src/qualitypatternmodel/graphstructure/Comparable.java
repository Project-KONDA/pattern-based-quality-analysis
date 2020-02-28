/**
 */
package qualitypatternmodel.graphstructure;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.Comparable#getComparison2 <em>Comparison2</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getComparable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Comparable extends PatternElement {
	/**
	 * Returns the value of the '<em><b>Comparison1</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.functions.Comparison}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.Comparison#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison1</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getComparable_Comparison1()
	 * @see qualitypatternmodel.functions.Comparison#getArgument1
	 * @model opposite="argument1"
	 * @generated
	 */
	EList<Comparison> getComparison1();

	/**
	 * Returns the value of the '<em><b>Comparison2</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.functions.Comparison}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.functions.Comparison#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison2</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getComparable_Comparison2()
	 * @see qualitypatternmodel.functions.Comparison#getArgument2
	 * @model opposite="argument2"
	 * @generated
	 */
	EList<Comparison> getComparison2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ReturnType getReturnType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	boolean isTranslatable() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="qualitypatternmodel.graphstructure.ListOfElements" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<ListOfElements> getAllArgumentElements() throws InvalidityException;

} // GraphElement
