/**
 */
package qualitypatternmodel.textrepresentation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Text</b></em>'.
 * A textual representation of a pattern consisting of text fragments and parameters in between.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.textrepresentation.PatternText#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.PatternText#getFragments <em>Fragments</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.PatternText#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.PatternText#getParameterPredefinitions <em>Parameter Predefinitions</em>}</li>
 *   <li>{@link qualitypatternmodel.textrepresentation.PatternText#getFragmentsOrdered <em>Fragments Ordered</em>}</li>
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
	 * Returns the value of the '<em><b>Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.textrepresentation.Fragment}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.textrepresentation.Fragment#getPatternText <em>Pattern Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments</em>' containment reference list.
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getPatternText_Fragments()
	 * @see qualitypatternmodel.textrepresentation.Fragment#getPatternText
	 * @model opposite="patternText" containment="true" required="true"
	 * @generated
	 */
	EList<Fragment> getFragments();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getPatternText_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.textrepresentation.PatternText#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Predefinitions</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.textrepresentation.ParameterPredefinition}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.textrepresentation.ParameterPredefinition#getPatterntext <em>Patterntext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Predefinitions</em>' containment reference list.
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getPatternText_ParameterPredefinitions()
	 * @see qualitypatternmodel.textrepresentation.ParameterPredefinition#getPatterntext
	 * @model opposite="patterntext" containment="true"
	 * @generated
	 */
	EList<ParameterPredefinition> getParameterPredefinitions();

	/**
	 * Returns the value of the '<em><b>Fragments Ordered</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.textrepresentation.Fragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fragments Ordered</em>' reference list.
	 * @see qualitypatternmodel.textrepresentation.TextrepresentationPackage#getPatternText_FragmentsOrdered()
	 * @model required="true"
	 * @generated
	 */
	EList<Fragment> getFragmentsOrdered();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a JSON representation of <code>this</code> <code>PatternText</code> and its contents.
	 *
	 * @return a JSON representation of <code>this</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String generateJSON();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void isValid(AbstractionLevel abstractionLevel) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void instantiate() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Generates a SPARQL template that can be automatically transformed into a gap text by the Query Helper of the Wikidata Query Service
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.operators.OperatorCycleExceptionWrapper qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	String generateSparqlTemplate() throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="qualitypatternmodel.textrepresentation.JSONObjectWrapper"
	 * @generated
	 */
	JSONObject generateJSONObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="qualitypatternmodel.textrepresentation.JSONObjectWrapper"
	 * @generated
	 */
	JSONObject generateVariantJSONObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void delete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getPreview();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addFragment(Fragment fragment);

} // PatternText
