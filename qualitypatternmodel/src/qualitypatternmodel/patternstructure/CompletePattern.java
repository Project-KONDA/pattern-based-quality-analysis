/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.parameters.ParameterList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * Root class for Pattern. Contains the general UI Interfaces for external use.
 * Basic container class for all model elements for the structural representation of a Pattern. 
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getElementCounter <em>Element Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getDatabases <em>Databases</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getQuery <em>Query</em>}</li>
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
	 * Returns the value of the '<em><b>Element Counter</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Counter</em>' attribute.
	 * @see #setElementCounter(int)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_ElementCounter()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getElementCounter();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getElementCounter <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Counter</em>' attribute.
	 * @see #getElementCounter()
	 * @generated
	 */
	void setElementCounter(int value);

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
	 * Returns the value of the '<em><b>Databases</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.execution.Database#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databases</em>' reference.
	 * @see #setDatabases(Database)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_Databases()
	 * @see qualitypatternmodel.execution.Database#getPatterns
	 * @model opposite="patterns"
	 * @generated
	 */
	Database getDatabases();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getDatabases <em>Databases</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databases</em>' reference.
	 * @see #getDatabases()
	 * @generated
	 */
	void setDatabases(Database value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getCompletePattern_Query()
	 * @model
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.patternstructure.CompletePattern#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Basic Element counter: generates smallest locally unique (inside of patter) integer id
	 * secures small representation variables for the translation to XQuery     
	 * @return next Integer Value, which was not returned in the lifetime of the pattern before
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getNewRefNo() throws InvalidityException;

} // Pattern
