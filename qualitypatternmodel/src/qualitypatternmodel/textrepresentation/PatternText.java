/**
 */
package qualitypatternmodel.textrepresentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.patternstructure.CompletePattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.textrepresentation.PatternText#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.PatternText#getTextfragment <em>Textfragment</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getPatternText()
 * @model
 * @generated
 */
public interface PatternText extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CompletePattern#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' container reference.
	 * @see #setPattern(CompletePattern)
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getPatternText_Pattern()
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getText
	 * @model opposite="text" required="true" transient="false"
	 * @generated
	 */
	CompletePattern getPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.textrepresentation.PatternText#getPattern <em>Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' container reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(CompletePattern value);

	/**
	 * Returns the value of the '<em><b>Textfragment</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.textrepresentation.Fragment}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.textrepresentation.Fragment#getPatternText <em>Pattern Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textfragment</em>' containment reference list.
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getPatternText_Textfragment()
	 * @see qualitypatternmodel.textrepresentation.Fragment#getPatternText
	 * @model opposite="patternText" containment="true" required="true"
	 * @generated
	 */
	EList<Fragment> getTextfragment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String generateJSON();

} // PatternText
