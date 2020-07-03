/**
 */
package qualitypatternmodel.patternstructure;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
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
 *   <li>{@link qualitypatternmodel.patternstructure.CompletePattern#getDatabase <em>Database</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * Basic Element counter: generates smallest locally unique (inside of patter) integer id
	 * secures small representation variables for the translation to XQuery     
	 * @return next Integer Value, which was not returned in the lifetime of the pattern before
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	int getNewRefNo() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.operators.OperatorCycleExceptionWrapper qualitypatternmodel.patternstructure.MissingPatternContainerException"
	 * @generated
	 */
	void recordValues() throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

} // Pattern
