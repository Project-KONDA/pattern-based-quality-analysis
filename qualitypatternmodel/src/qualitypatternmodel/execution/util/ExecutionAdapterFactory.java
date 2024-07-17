/**
 */
package qualitypatternmodel.execution.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import qualitypatternmodel.execution.BaseXClient;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.Databaseformat;
import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.LocalXmlDataDatabase;
import qualitypatternmodel.execution.LocalXmlSchemaDatabase;
import qualitypatternmodel.execution.Result;
import qualitypatternmodel.execution.ServerXmlDataDatabase;
import qualitypatternmodel.execution.ServerXmlSchemaDatabase;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.execution.XmlDatabase;
import qualitypatternmodel.execution.XmlResult;
import qualitypatternmodel.execution.XmlSchemaDatabase;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.execution.ExecutionPackage
 * @generated
 */
public class ExecutionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExecutionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExecutionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionSwitch<Adapter> modelSwitch =
		new ExecutionSwitch<Adapter>() {
			@Override
			public Adapter caseResult(Result object) {
				return createResultAdapter();
			}
			@Override
			public Adapter caseXmlResult(XmlResult object) {
				return createXmlResultAdapter();
			}
			@Override
			public Adapter caseXmlDataDatabase(XmlDataDatabase object) {
				return createXmlDataDatabaseAdapter();
			}
			@Override
			public Adapter caseLocalXmlDataDatabase(LocalXmlDataDatabase object) {
				return createLocalXmlDataDatabaseAdapter();
			}
			@Override
			public Adapter caseServerXmlDataDatabase(ServerXmlDataDatabase object) {
				return createServerXmlDataDatabaseAdapter();
			}
			@Override
			public Adapter caseDatabases(Databases object) {
				return createDatabasesAdapter();
			}
			@Override
			public Adapter caseStringToIntMap(Map.Entry<String, Integer> object) {
				return createStringToIntMapAdapter();
			}
			@Override
			public Adapter caseXmlSchemaDatabase(XmlSchemaDatabase object) {
				return createXmlSchemaDatabaseAdapter();
			}
			@Override
			public Adapter caseLocalXmlSchemaDatabase(LocalXmlSchemaDatabase object) {
				return createLocalXmlSchemaDatabaseAdapter();
			}
			@Override
			public Adapter caseServerXmlSchemaDatabase(ServerXmlSchemaDatabase object) {
				return createServerXmlSchemaDatabaseAdapter();
			}
			@Override
			public Adapter caseXmlDatabase(XmlDatabase object) {
				return createXmlDatabaseAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseDatabaseformat(Databaseformat object) {
				return createDatabaseformatAdapter();
			}
			@Override
			public Adapter caseBaseXClient(BaseXClient object) {
				return createBaseXClientAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.Result
	 * @generated
	 */
	public Adapter createResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.XmlResult <em>Xml Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.XmlResult
	 * @generated
	 */
	public Adapter createXmlResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.XmlDataDatabase <em>Xml Data Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.XmlDataDatabase
	 * @generated
	 */
	public Adapter createXmlDataDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.LocalXmlDataDatabase <em>Local Xml Data Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.LocalXmlDataDatabase
	 * @generated
	 */
	public Adapter createLocalXmlDataDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.ServerXmlDataDatabase <em>Server Xml Data Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.ServerXmlDataDatabase
	 * @generated
	 */
	public Adapter createServerXmlDataDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.Databases <em>Databases</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.Databases
	 * @generated
	 */
	public Adapter createDatabasesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Int Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToIntMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.XmlSchemaDatabase <em>Xml Schema Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.XmlSchemaDatabase
	 * @generated
	 */
	public Adapter createXmlSchemaDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.LocalXmlSchemaDatabase <em>Local Xml Schema Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.LocalXmlSchemaDatabase
	 * @generated
	 */
	public Adapter createLocalXmlSchemaDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.ServerXmlSchemaDatabase <em>Server Xml Schema Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.ServerXmlSchemaDatabase
	 * @generated
	 */
	public Adapter createServerXmlSchemaDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.XmlDatabase <em>Xml Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.XmlDatabase
	 * @generated
	 */
	public Adapter createXmlDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.Databaseformat <em>Databaseformat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.Databaseformat
	 * @generated
	 */
	public Adapter createDatabaseformatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.BaseXClient <em>Base XClient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.BaseXClient
	 * @generated
	 */
	public Adapter createBaseXClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExecutionAdapterFactory
