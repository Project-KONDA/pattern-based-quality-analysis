/**
 */
package qualitypatternmodel.execution.util;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.execution.*;

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
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseResult(Result object) {
				return createResultAdapter();
			}
			@Override
			public Adapter caseXmlResult(XmlResult object) {
				return createXmlResultAdapter();
			}
			@Override
			public Adapter caseXmlDatabase(XmlDatabase object) {
				return createXmlDatabaseAdapter();
			}
			@Override
			public Adapter caseLocalXmlDatabase(LocalXmlDatabase object) {
				return createLocalXmlDatabaseAdapter();
			}
			@Override
			public Adapter caseServerXmlDatabase(ServerXmlDatabase object) {
				return createServerXmlDatabaseAdapter();
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
			public Adapter caseXmlSchema(XmlSchema object) {
				return createXmlSchemaAdapter();
			}
			@Override
			public Adapter caseLocalXmlSchema(LocalXmlSchema object) {
				return createLocalXmlSchemaAdapter();
			}
			@Override
			public Adapter caseServerXmlSchema(ServerXmlSchema object) {
				return createServerXmlSchemaAdapter();
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
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.LocalXmlDatabase <em>Local Xml Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.LocalXmlDatabase
	 * @generated
	 */
	public Adapter createLocalXmlDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.ServerXmlDatabase <em>Server Xml Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.ServerXmlDatabase
	 * @generated
	 */
	public Adapter createServerXmlDatabaseAdapter() {
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
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.XmlSchema <em>Xml Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.XmlSchema
	 * @generated
	 */
	public Adapter createXmlSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.LocalXmlSchema <em>Local Xml Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.LocalXmlSchema
	 * @generated
	 */
	public Adapter createLocalXmlSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.execution.ServerXmlSchema <em>Server Xml Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.execution.ServerXmlSchema
	 * @generated
	 */
	public Adapter createServerXmlSchemaAdapter() {
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
