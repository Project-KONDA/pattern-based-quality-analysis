/**
 */
package qualitypatternmodel.textrepresentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.textrepresentation.Fragment#getPatternText <em>Pattern Text</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getFragment()
 * @model abstract="true"
 * @generated
 */
public interface Fragment extends EObject {

	/**
	 * Returns the value of the '<em><b>Pattern Text</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.textrepresentation.PatternText#getTextfragment <em>Textfragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Text</em>' container reference.
	 * @see #setPatternText(PatternText)
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getFragment_PatternText()
	 * @see qualitypatternmodel.textrepresentation.PatternText#getTextfragment
	 * @model opposite="textfragment" required="true" transient="false"
	 * @generated
	 */
	PatternText getPatternText();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.textrepresentation.Fragment#getPatternText <em>Pattern Text</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Text</em>' container reference.
	 * @see #getPatternText()
	 * @generated
	 */
	void setPatternText(PatternText value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String generateJSON();
} // Fragment
