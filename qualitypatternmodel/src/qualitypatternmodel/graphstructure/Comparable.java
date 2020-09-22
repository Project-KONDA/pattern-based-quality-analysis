/**
 */
package qualitypatternmodel.graphstructure;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Element</b></em>'.
 * An argument of a <code>Comparison</code>.
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
	 * The list contents are of type {@link qualitypatternmodel.operators.Comparison}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Comparison#getArgument1 <em>Argument1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison1</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getComparable_Comparison1()
	 * @see qualitypatternmodel.operators.Comparison#getArgument1
	 * @model opposite="argument1"
	 * @generated
	 */
	EList<Comparison> getComparison1();

	/**
	 * Returns the value of the '<em><b>Comparison2</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.operators.Comparison}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.operators.Comparison#getArgument2 <em>Argument2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison2</em>' reference list.
	 * @see qualitypatternmodel.graphstructure.GraphstructurePackage#getComparable_Comparison2()
	 * @see qualitypatternmodel.operators.Comparison#getArgument2
	 * @model opposite="argument2"
	 * @generated
	 */
	EList<Comparison> getComparison2();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the type of <code>this</code> comparison argument.
	 * 
	 * @return the <code>ReturnType</code> of <code>this</code> comparison argument
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ReturnType getReturnType();

	/**
	 * <!-- begin-user-doc -->
	 * Returns <code>true</code> if <code>this</code> comparison argument can be translated to XQuery
	 * 
	 * @return <code>true</code> if <code>this</code> comparison argument can be translated to XQuery
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isTranslatable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of all <code>Elements</code> that directly or indirectly (via a <code>Property</code>) represent <code>this</code> comparison argument.
	 * 
	 * @return a list of all <code>Elements</code> that directly or indirectly (via a <code>Property</code>) represent <code>this</code> comparison argument
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Element> getAllArgumentElements();

} // GraphElement
