/**
 */
package qualitypatternmodel.patternstructure;

import de.gwdg.metadataqa.api.schema.BaseSchema;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.textrepresentation.PatternText;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complete Pattern</b></em>'.
 * A pattern defined by a name. Serves as the root container of model instances.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getDatabase <em>Database</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getText <em>Text</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getPatternId <em>Pattern Id</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getAbstractName <em>Abstract Name</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getDescription <em>Description</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getLanguage <em>Language</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getDataModelName <em>Data Model Name</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getParameterCounter <em>Parameter Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getCounter <em>Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getElementCounter <em>Element Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getRelationCounter <em>Relation Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getOperatorCounter <em>Operator Counter</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern()
 * @model
 * @generated
 */
public interface CompletePattern extends Pattern {
	/**
	 * Returns the value of the '<em><b>Parameter List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.parameters.ParameterList#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * The ParameterList contains all Parameters, which are used in the CompletePattern.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter List</em>' containment reference.
	 * @see #setParameterList(ParameterList)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_ParameterList()
	 * @see qualitypatternmodel.parameters.ParameterList#getPattern
	 * @model opposite="pattern" containment="true" required="true"
	 * @generated
	 */
	ParameterList getParameterList();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getParameterList <em>Parameter List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter List</em>' containment reference.
	 * @see #getParameterList()
	 * @generated
	 */
	void setParameterList(ParameterList value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Database</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.execution.Database#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' reference.
	 * @see #setDatabase(Database)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_Database()
	 * @see qualitypatternmodel.execution.Database#getPatterns
	 * @model opposite="patterns"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getDatabase <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * Returns the value of the '<em><b>Element Counter</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Counter</em>' attribute.
	 * @see #setElementCounter(Integer)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_ElementCounter()
	 * @model default="1" required="true"
	 * @generated
	 */
	Integer getElementCounter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getElementCounter <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Counter</em>' attribute.
	 * @see #getElementCounter()
	 * @generated
	 */
	void setElementCounter(Integer value);

	/**
	 * Returns the value of the '<em><b>Relation Counter</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Counter</em>' attribute.
	 * @see #setRelationCounter(Integer)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_RelationCounter()
	 * @model default="1" required="true"
	 * @generated
	 */
	Integer getRelationCounter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getRelationCounter <em>Relation Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Counter</em>' attribute.
	 * @see #getRelationCounter()
	 * @generated
	 */
	void setRelationCounter(Integer value);

	/**
	 * Returns the value of the '<em><b>Parameter Counter</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Counter</em>' attribute.
	 * @see #setParameterCounter(Integer)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_ParameterCounter()
	 * @model default="1" required="true"
	 * @generated
	 */
	Integer getParameterCounter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getParameterCounter <em>Parameter Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Counter</em>' attribute.
	 * @see #getParameterCounter()
	 * @generated
	 */
	void setParameterCounter(Integer value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link qualitypatternmodel.patternstructure.Language}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Language
	 * @see #setLanguage(Language)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_Language()
	 * @model
	 * @generated
	 */
	Language getLanguage();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see qualitypatternmodel.patternstructure.Language
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Language value);

	/**
	 * Returns the value of the '<em><b>Data Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Model Name</em>' attribute.
	 * @see #setDataModelName(String)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_DataModelName()
	 * @model
	 * @generated
	 */
	String getDataModelName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getDataModelName <em>Data Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Model Name</em>' attribute.
	 * @see #getDataModelName()
	 * @generated
	 */
	void setDataModelName(String value);

	/**
	 * Returns the value of the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Name</em>' attribute.
	 * @see #setDatabaseName(String)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_DatabaseName()
	 * @model
	 * @generated
	 */
	String getDatabaseName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getDatabaseName <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Name</em>' attribute.
	 * @see #getDatabaseName()
	 * @generated
	 */
	void setDatabaseName(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute list.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_Keywords()
	 * @model
	 * @generated
	 */
	EList<String> getKeywords();

	/**
	 * Returns the value of the '<em><b>Operator Counter</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Counter</em>' attribute.
	 * @see #setOperatorCounter(Integer)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_OperatorCounter()
	 * @model default="1" required="true"
	 * @generated
	 */
	Integer getOperatorCounter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getOperatorCounter <em>Operator Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Counter</em>' attribute.
	 * @see #getOperatorCounter()
	 * @generated
	 */
	void setOperatorCounter(Integer value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(Integer)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_Counter()
	 * @model default="1" required="true"
	 * @generated
	 */
	Integer getCounter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(Integer value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.textrepresentation.PatternText}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.textrepresentation.PatternText#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_Text()
	 * @see qualitypatternmodel.textrepresentation.PatternText#getPattern
	 * @model opposite="pattern" containment="true"
	 * @generated
	 */
	EList<PatternText> getText();

	/**
	 * Returns the value of the '<em><b>Pattern Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Id</em>' attribute.
	 * @see #setPatternId(String)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_PatternId()
	 * @model
	 * @generated
	 */
	String getPatternId();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getPatternId <em>Pattern Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Id</em>' attribute.
	 * @see #getPatternId()
	 * @generated
	 */
	void setPatternId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' attribute.
	 * @see #setShortDescription(String)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_ShortDescription()
	 * @model
	 * @generated
	 */
	String getShortDescription();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getShortDescription <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Description</em>' attribute.
	 * @see #getShortDescription()
	 * @generated
	 */
	void setShortDescription(String value);

	/**
	 * Returns the value of the '<em><b>Abstract Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Name</em>' attribute.
	 * @see #setAbstractName(String)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_AbstractName()
	 * @model
	 * @generated
	 */
	String getAbstractName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getAbstractName <em>Abstract Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Name</em>' attribute.
	 * @see #getAbstractName()
	 * @generated
	 */
	void setAbstractName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Increases the internal id counter for the <code>class</code> of the given <code>type</code> 
	 * (i.e. {@link #getElementCounter elementCounter}, {@link #getRelationCounter relationCounter}, {@link #getPropertyCounter propertyCounter}, {@link #getParameterCounter parameterCounter},
	 * {@link #getOperatorCounter operatorCounter} or {@link #getCounter counter}) by one and returns it.
	 * 
	 * @param type the class for which the corresponding internal id counter is increased and returned
	 * @return the new value of the internal id counter for the <code>class</code> of the given <code>type</code>
	 * <!-- end-user-doc -->
	 * @model required="true" typeDataType="qualitypatternmodel.patternstructure.ClassWrapper"
	 * @generated NOT
	 */
	int getNewRefNo(Class<?> type);

	/**
	 * <!-- begin-user-doc -->
	 * Records all values of <code>Parameters</code> contained in the valid concrete pattern in the <code>database</code>.
	 * 
	 * @throws InvalidityException if <code>this</code> is not a valid concrete pattern
	 * @throws OperatorCycleException if <code>this</code> contains an operator that references itself as an argument
	 * @throws MissingPatternContainerException if <code>this</code> directly or indirectly references <code>PatternElements</code>
	 * that are not directly or indirectly contained in <code>this</code>.
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.operators.OperatorCycleExceptionWrapper qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void recordValues() throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	/**
	 * <!-- begin-user-doc -->
	 * Returns the most narrow <code>AbstractionLevel</code> of <code>this</code>.
	 * 
	 * @return the most narrow <code>AbstractionLevel</code> of <code>this</code>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	AbstractionLevel getAbstractionLevel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	EList<Parameter> validateAgainstSchema() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resetQuery();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateCypherReturn() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String generateWikidataSparql() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="qualitypatternmodel.patternstructure.BaseSchemaWrapper" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	BaseSchema generateXmlConstraintSchema() throws InvalidityException;

	String generateXmlConstraintYAMLFileContent() throws InvalidityException;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.execution.IoExceptionWrapper"
	 * @generated
	 */
	void generateXmlConstraintYAMLFile(String path) throws InvalidityException, IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	JavaFilter generateQueryFilter() throws InvalidityException;

} // Pattern
