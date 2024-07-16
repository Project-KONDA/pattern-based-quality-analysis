/**
 */
package qualitypatternmodel.execution;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.patternstructure.CompletePattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result</b></em>'.
 * The result of an application of a concrete <code>CompletePattern</code> to a <code>Database</code>.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.Result#getDatabase <em>Database</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Result#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Result#getPerson <em>Person</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Result#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Result#getEndDate <em>End Date</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Result#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Result#getSplitResult <em>Split Result</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Result#getProblemNumber <em>Problem Number</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Result#getMatchNumber <em>Match Number</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Result#getRuntime <em>Runtime</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getResult()
 * @model abstract="true"
 * @generated
 */
public interface Result extends EObject {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.execution.Database#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' container reference.
	 * @see #setDatabase(Database)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getResult_Database()
	 * @see qualitypatternmodel.execution.Database#getResults
	 * @model opposite="results" transient="false"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.Result#getDatabase <em>Database</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' container reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getResult_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.Result#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' attribute.
	 * @see #setPerson(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getResult_Person()
	 * @model
	 * @generated
	 */
	String getPerson();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.Result#getPerson <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' attribute.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getResult_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.Result#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see #setRuntime(long)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getResult_Runtime()
	 * @model
	 * @generated
	 */
	long getRuntime();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.Result#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(long value);

	/**
	 * Returns the value of the '<em><b>Problem Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Number</em>' attribute.
	 * @see #setProblemNumber(int)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getResult_ProblemNumber()
	 * @model
	 * @generated
	 */
	int getProblemNumber();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.Result#getProblemNumber <em>Problem Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Number</em>' attribute.
	 * @see #getProblemNumber()
	 * @generated
	 */
	void setProblemNumber(int value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getResult_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.Result#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' reference.
	 * @see #setPattern(CompletePattern)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getResult_Pattern()
	 * @model required="true"
	 * @generated
	 */
	CompletePattern getPattern();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.Result#getPattern <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(CompletePattern value);

	/**
	 * Returns the value of the '<em><b>Match Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Number</em>' attribute.
	 * @see #setMatchNumber(int)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getResult_MatchNumber()
	 * @model
	 * @generated
	 */
	int getMatchNumber();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.Result#getMatchNumber <em>Match Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Number</em>' attribute.
	 * @see #getMatchNumber()
	 * @generated
	 */
	void setMatchNumber(int value);

	/**
	 * Returns the value of the '<em><b>Split Result</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split Result</em>' attribute list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getResult_SplitResult()
	 * @model
	 * @generated
	 */
	EList<String> getSplitResult();

	/**
	 * <!-- begin-user-doc -->
	 * Exports <code>this</code> to a file at <code>path</code>.
	 * TODO: note file format
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void export(String path);

} // Result
