/**
 */
package qualitypatternmodel.execution.util;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qualitypatternmodel.execution.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.execution.ExecutionPackage
 * @generated
 */
public class ExecutionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExecutionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionSwitch() {
		if (modelPackage == null) {
			modelPackage = ExecutionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExecutionPackage.RESULT: {
				Result result = (Result)theEObject;
				T theResult = caseResult(result);
				if (theResult == null) theResult = defaultCase(theEObject);
				return theResult;
			}
			case ExecutionPackage.XML_RESULT: {
				XmlResult xmlResult = (XmlResult)theEObject;
				T result = caseXmlResult(xmlResult);
				if (result == null) result = caseResult(xmlResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.XML_DATA_DATABASE: {
				XmlDataDatabase xmlDataDatabase = (XmlDataDatabase)theEObject;
				T result = caseXmlDataDatabase(xmlDataDatabase);
				if (result == null) result = caseXmlDatabase(xmlDataDatabase);
				if (result == null) result = caseDatabase(xmlDataDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.LOCAL_XML_DATA_DATABASE: {
				LocalXmlDataDatabase localXmlDataDatabase = (LocalXmlDataDatabase)theEObject;
				T result = caseLocalXmlDataDatabase(localXmlDataDatabase);
				if (result == null) result = caseXmlDataDatabase(localXmlDataDatabase);
				if (result == null) result = caseXmlDatabase(localXmlDataDatabase);
				if (result == null) result = caseDatabase(localXmlDataDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.SERVER_XML_DATA_DATABASE: {
				ServerXmlDataDatabase serverXmlDataDatabase = (ServerXmlDataDatabase)theEObject;
				T result = caseServerXmlDataDatabase(serverXmlDataDatabase);
				if (result == null) result = caseXmlDataDatabase(serverXmlDataDatabase);
				if (result == null) result = caseXmlDatabase(serverXmlDataDatabase);
				if (result == null) result = caseDatabase(serverXmlDataDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.DATABASES: {
				Databases databases = (Databases)theEObject;
				T result = caseDatabases(databases);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.STRING_TO_INT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Integer> stringToIntMap = (Map.Entry<String, Integer>)theEObject;
				T result = caseStringToIntMap(stringToIntMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.XML_SCHEMA_DATABASE: {
				XmlSchemaDatabase xmlSchemaDatabase = (XmlSchemaDatabase)theEObject;
				T result = caseXmlSchemaDatabase(xmlSchemaDatabase);
				if (result == null) result = caseXmlDatabase(xmlSchemaDatabase);
				if (result == null) result = caseDatabaseformat(xmlSchemaDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.LOCAL_XML_SCHEMA_DATABASE: {
				LocalXmlSchemaDatabase localXmlSchemaDatabase = (LocalXmlSchemaDatabase)theEObject;
				T result = caseLocalXmlSchemaDatabase(localXmlSchemaDatabase);
				if (result == null) result = caseXmlSchemaDatabase(localXmlSchemaDatabase);
				if (result == null) result = caseXmlDatabase(localXmlSchemaDatabase);
				if (result == null) result = caseDatabaseformat(localXmlSchemaDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.SERVER_XML_SCHEMA_DATABASE: {
				ServerXmlSchemaDatabase serverXmlSchemaDatabase = (ServerXmlSchemaDatabase)theEObject;
				T result = caseServerXmlSchemaDatabase(serverXmlSchemaDatabase);
				if (result == null) result = caseXmlSchemaDatabase(serverXmlSchemaDatabase);
				if (result == null) result = caseXmlDatabase(serverXmlSchemaDatabase);
				if (result == null) result = caseDatabaseformat(serverXmlSchemaDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.XML_DATABASE: {
				XmlDatabase xmlDatabase = (XmlDatabase)theEObject;
				T result = caseXmlDatabase(xmlDatabase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionPackage.DATABASEFORMAT: {
				Databaseformat databaseformat = (Databaseformat)theEObject;
				T result = caseDatabaseformat(databaseformat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResult(Result object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlResult(XmlResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Data Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Data Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlDataDatabase(XmlDataDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Xml Data Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Xml Data Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalXmlDataDatabase(LocalXmlDataDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Xml Data Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Xml Data Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerXmlDataDatabase(ServerXmlDataDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databases</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databases</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabases(Databases object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Int Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Int Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToIntMap(Map.Entry<String, Integer> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Schema Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Schema Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlSchemaDatabase(XmlSchemaDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Xml Schema Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Xml Schema Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalXmlSchemaDatabase(LocalXmlSchemaDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Xml Schema Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Xml Schema Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerXmlSchemaDatabase(ServerXmlSchemaDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlDatabase(XmlDatabase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Databaseformat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Databaseformat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseformat(Databaseformat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExecutionSwitch
