/**
 */
package qualitypatternmodel.execution;

import org.basex.core.BaseXException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

import qualitypatternmodel.patternstructure.CompletePattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.Database#getResults <em>Results</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Database#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.Database#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.execution.ExecutionPackage#getDatabase()
 * @model abstract="true"
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link qualitypatternmodel.execution.Result}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.execution.Result#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see qualitypatternmodel.execution.ExecutionPackage#getDatabase_Results()
	 * @see qualitypatternmodel.execution.Result#getDatabase
	 * @model opposite="database" containment="true"
	 * @generated
	 */
	EList<Result> getResults();

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.patternstructure.CompletePattern#getDatabases <em>Databases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' reference.
	 * @see #setPatterns(CompletePattern)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getDatabase_Patterns()
	 * @see qualitypatternmodel.patternstructure.CompletePattern#getDatabases
	 * @model opposite="databases"
	 * @generated
	 */
	CompletePattern getPatterns();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.Database#getPatterns <em>Patterns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patterns</em>' reference.
	 * @see #getPatterns()
	 * @generated
	 */
	void setPatterns(CompletePattern value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see qualitypatternmodel.execution.ExecutionPackage#getDatabase_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link qualitypatternmodel.execution.Database#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper qualitypatternmodel.operators.OperatorCycleExceptionWrapper qualitypatternmodel.patternstructure.MissingPatternContainerException qualitypatternmodel.execution.BaseXExceptionWrapper"
	 * @generated
	 */
	Result execute(CompletePattern pattern, String name, String person) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int countProblems(CompletePattern pattern);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int countMatches(CompletePattern pattern);

} // Database
