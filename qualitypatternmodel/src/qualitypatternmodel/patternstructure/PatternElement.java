/**
 */
package qualitypatternmodel.patternstructure;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Element</b></em>'.
 * Any component of a pattern.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#getId <em>Id</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.PatternElement#getInternalId <em>Internal Id</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPatternElement()
 * @model abstract="true"
 * @generated
 */
public interface PatternElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPatternElement_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.PatternElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Internal Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Id</em>' attribute.
	 * @see #setInternalId(int)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getPatternElement_InternalId()
	 * @model default="-1" required="true"
	 * @generated
	 */
	int getInternalId();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.PatternElement#getInternalId <em>Internal Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Id</em>' attribute.
	 * @see #getInternalId()
	 * @generated
	 */
	void setInternalId(int value);

	/**
	 * <!-- begin-user-doc -->
	 * Recursively translates <code>this</code> and all contained <code>PatternElements</code> into an XQuery snippet.
	 * 
	 * @return the generated XQuery snippet
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateXQuery() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateSparql() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateCypher() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns all <code>Parameters</code> referenced by <code>this</code> or a contained <code>PatternElement</code>.
	 * 
	 *  @return a list of all parameters referenced by <code>this</code> or a contained <code>PatternElement</code>
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<Parameter> getAllParameters() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Prepares the translation to XQuery. 
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void prepareTranslation();

	/**
	 * <!-- begin-user-doc -->
	 * Validates <code>this</code> against the constraints specified in <code>isValid</code>.
	 * 
	 * @return true if <code>this</code> is valid
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of contained or referenced <code>PatternElements</code> that are <code>Parameters</code> or (in-)directly contain <code>Parameters</code>.
	 * 
	 * @return a list of contained or referenced <code>PatternElements</code> that are <code>Parameters</code> or (in-)directly contain <code>Parameters</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<PatternElement> prepareParameterUpdates();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the <code>ParameterList</code> of the <code>Pattern</code> <code>this</code> is directly or indirectly contained in.
	 * 
	 * @return the <code>ParameterList</code> of the <code>Pattern</code> <code>this</code> is directly or indirectly contained in or null if <code>this</code> is not contained in a <code>Pattern</code>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ParameterList getParameterList();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the <code>OperatorList</code> of the <code>Graph</code> <code>this</code> is directly or indirectly contained in.
	 * 
	 * @return the <code>OperatorList</code> of the <code>Graph</code> <code>this</code> is directly or indirectly contained in or null if <code>this</code> is not contained in a <code>Graph</code>
	 * 
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	OperatorList getOperatorList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<Operator> getAllOperators() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Recursively replaces <code>this</code> and its contents by their XML-specific equivalent.
	 * 
	 * An instance of the corresponding XML-specific subclass in the <code>package</code> <code>adaptionxml</code> is created.
	 * Attributes, references and contents of <code>this</code> are transfered to the new object.
	 * <code>This</code> is removed from its container.
	 * The new object is inserted into the container.
	 * 
	 * @return the XML-specific equivalent of <code>this</code>
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.operators.OperatorCycleExceptionWrapper qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.operators.OperatorCycleExceptionWrapper qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.operators.OperatorCycleExceptionWrapper qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	Boolean containsJavaOperator() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	JavaFilterPart generateQueryFilterPart() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateXQueryJavaReturn() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	Boolean inJavaQueryWhereClause() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateXQueryJava() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * Recursively records all values of contained or referenced <code>Parameters</code> in the <code>XmlDatabase</code>.
	 * 
	 * @param database the <code>XmlDatabase</code> in which the values of <code>Parameters</code> are recorded
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void recordValues(XmlDataDatabase database);

	/**
	 * <!-- begin-user-doc -->
	 * Recursively checks if all directly or indirectly contained <code>Relations</code> have been adapted to XML, thus are of type <code>XmlReference</code> or <code>XmlNavigation</code>.
	 * 
	 * @return true if all contained <code>Relations</code> have been adapted to XML
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean relationsXmlAdapted();

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @model patternElementsMany="true"
	 * @generated
	 */
	void triggerParameterUpdates(PatternElement newContainer, EList<PatternElement> patternElements);

	/**
	 * <!-- begin-user-doc -->
	 * Calls <code>updateParameters</code> with the <code>ParameterList</code> of <code>newContainer</code> passed as <code>newParameterList</code>.
	 * 
	 * @param newContainer the new container <code>this</code> will be moved to
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void triggerParameterUpdates(PatternElement newContainer);

	/**
	 * <!-- begin-user-doc -->
	 * Recursively moves all directly or indirectly contained or referenced <code>Parameters</code> to <code>newParameterList</code>.
	 * 
	 * @param newParameterList the <code>ParameterList</code> that all contained or referenced <code>Parameters</code> are moved to
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateParameters(ParameterList newParameterList);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initializeTranslation();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the <code>PatternElement</code> which directly contains <code>this</code>.
	 * 
	 * @return the <code>PatternElement</code> which directly contains <code>this</code>
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	PatternElement getContainer() throws MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * Recursively validates <code>this</code> and contained <code>PatternElements</code>.
	 * 
	 * @param abstractionLevel the level of abstraction of the <code>CompletePattern</code> <code>this</code> is contained in directly or indirectly
	 * @throws InvalidityException if <code>this</code> or a contained <code>PatternElement</code> is invalid
	 * @throws OperatorCycleException if <code>this</code> or a contained <code>PatternElement</code> is an <code>Operator</code> that references itself as an argument
	 * @throws MissingPatternContainerException <code>this</code> is not contained in a <code>CompletePattern</code> directly or indirectly
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.operators.OperatorCycleExceptionWrapper" abstractionLevelRequired="true"
	 * @generated
	 */
	void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * Validates <code>this</code> concerning constraints.
	 * 
	 * @param abstractionLevel the level of abstraction of the <code>CompletePattern</code> <code>this</code> is contained in directly or indirectly
	 * @throws InvalidityException if <code>this</code> is invalid
	 * @throws OperatorCycleException if <code>this</code> is an <code>Operator</code> that references itself as an argument
	 * @throws MissingPatternContainerException <code>this</code> is not contained in a <code>CompletePattern</code> directly or indirectly
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.operators.OperatorCycleExceptionWrapper" abstractionLevelRequired="true"
	 * @generated
	 */
	void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException;
	
	/**
	 * <!-- begin-user-doc -->
	 * Returns the first ancestor of type <code>cls</code> in the containment hierarchy.
	 * 
	 * @param the type of the desired ancestor
	 * @return the first ancestor of type <code>cls</code>
	 * @throws MissingPatternContainerException if no ancestor of type <code>cls</code> exists
	 * <!-- end-user-doc -->
	 */
	PatternElement getAncestor(Class<?> cls) throws MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns a textual representation of <code>this</code>.
	 * 
	 * @return the textual representation of <code>this</code>
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String myToString();

} // PatternElement
