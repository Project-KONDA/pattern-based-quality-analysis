/**
 */
package qualitypatternmodel.patternstructure;

import org.json.JSONObject;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Graph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * A pattern, which contains a <code>Graph</code> and a <code>Condition</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.Pattern#getQueries <em>Queries</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern()
 * @model abstract="true"
 * @generated
 */
public interface Pattern extends PatternElement {

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.Graph#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' containment reference.
	 * @see #setGraph(Graph)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_Graph()
	 * @see qualitypatternmodel.graphstructure.Graph#getPattern
	 * @model opposite="pattern" containment="true" required="true"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Pattern#getGraph <em>Graph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' containment reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.Condition#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_Condition()
	 * @see qualitypatternmodel.patternstructure.Condition#getPattern
	 * @model opposite="pattern" containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Pattern#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' attribute.
	 * @see #setQueries(JSONObject)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPattern_Queries()
	 * @model default="null" dataType="qualitypatternmodel.textrepresentation.JSONObjectWrapper"
	 * @generated
	 */
	JSONObject getQueries();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.Pattern#getQueries <em>Queries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queries</em>' attribute.
	 * @see #getQueries()
	 * @generated
	 */
	void setQueries(JSONObject value);

	/**
	 * <!-- begin-user-doc -->
	 * Validates the <code>source</code> and <code>target</code> attributes of the next <code>MorphismContainer</code>  in the hierarchy of <code>Conditions</code>.
	 *
	 * @throws InvalidityException if <code>source</code> or <code>target</code> of the next <code>MorphismContainer</code> is invalid
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	void checkMorphismOfNextGraph() throws InvalidityException;


} // Pattern
