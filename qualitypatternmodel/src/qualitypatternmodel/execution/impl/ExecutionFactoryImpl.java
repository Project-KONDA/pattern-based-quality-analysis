/**
 */
package qualitypatternmodel.execution.impl;

import java.util.Map;
import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.execution.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionFactoryImpl extends EFactoryImpl implements ExecutionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExecutionFactory init() {
		try {
			ExecutionFactory theExecutionFactory = (ExecutionFactory)EPackage.Registry.INSTANCE.getEFactory(ExecutionPackage.eNS_URI);
			if (theExecutionFactory != null) {
				return theExecutionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExecutionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExecutionPackage.XML_RESULT: return createXmlResult();
			case ExecutionPackage.XML_DATA_DATABASE: return createXmlDataDatabase();
			case ExecutionPackage.LOCAL_XML_DATA_DATABASE: return createLocalXmlDataDatabase();
			case ExecutionPackage.SERVER_XML_DATA_DATABASE: return createServerXmlDataDatabase();
			case ExecutionPackage.DATABASES: return createDatabases();
			case ExecutionPackage.STRING_TO_INT_MAP: return (EObject)createStringToIntMap();
			case ExecutionPackage.XML_SCHEMA_DATABASE: return createXmlSchemaDatabase();
			case ExecutionPackage.LOCAL_XML_SCHEMA_DATABASE: return createLocalXmlSchemaDatabase();
			case ExecutionPackage.SERVER_XML_SCHEMA_DATABASE: return createServerXmlSchemaDatabase();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExecutionPackage.BASE_XEXCEPTION_WRAPPER:
				return createBaseXExceptionWrapperFromString(eDataType, initialValue);
			case ExecutionPackage.QUERY_EXCEPTION_WRAPPER:
				return createQueryExceptionWrapperFromString(eDataType, initialValue);
			case ExecutionPackage.QUERY_IO_EXCEPTION_WRAPPER:
				return createQueryIOExceptionWrapperFromString(eDataType, initialValue);
			case ExecutionPackage.BASE_XCLIENT_WRAPPER:
				return createBaseXClientWrapperFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExecutionPackage.BASE_XEXCEPTION_WRAPPER:
				return convertBaseXExceptionWrapperToString(eDataType, instanceValue);
			case ExecutionPackage.QUERY_EXCEPTION_WRAPPER:
				return convertQueryExceptionWrapperToString(eDataType, instanceValue);
			case ExecutionPackage.QUERY_IO_EXCEPTION_WRAPPER:
				return convertQueryIOExceptionWrapperToString(eDataType, instanceValue);
			case ExecutionPackage.BASE_XCLIENT_WRAPPER:
				return convertBaseXClientWrapperToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlResult createXmlResult() {
		XmlResultImpl xmlResult = new XmlResultImpl();
		return xmlResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlDataDatabase createXmlDataDatabase() {
		XmlDataDatabaseImpl xmlDataDatabase = new XmlDataDatabaseImpl();
		return xmlDataDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalXmlDataDatabase createLocalXmlDataDatabase() {
		LocalXmlDataDatabaseImpl localXmlDataDatabase = new LocalXmlDataDatabaseImpl();
		return localXmlDataDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerXmlDataDatabase createServerXmlDataDatabase() {
		ServerXmlDataDatabaseImpl serverXmlDataDatabase = new ServerXmlDataDatabaseImpl();
		return serverXmlDataDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Databases createDatabases() {
		DatabasesImpl databases = DatabasesImpl.getInstance();
		return databases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Integer> createStringToIntMap() {
		StringToIntMapImpl stringToIntMap = new StringToIntMapImpl();
		return stringToIntMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlSchemaDatabase createXmlSchemaDatabase() {
		XmlSchemaDatabaseImpl xmlSchemaDatabase = new XmlSchemaDatabaseImpl();
		return xmlSchemaDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalXmlSchemaDatabase createLocalXmlSchemaDatabase() {
		LocalXmlSchemaDatabaseImpl localXmlSchemaDatabase = new LocalXmlSchemaDatabaseImpl();
		return localXmlSchemaDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerXmlSchemaDatabase createServerXmlSchemaDatabase() {
		ServerXmlSchemaDatabaseImpl serverXmlSchemaDatabase = new ServerXmlSchemaDatabaseImpl();
		return serverXmlSchemaDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseXException createBaseXExceptionWrapperFromString(EDataType eDataType, String initialValue) {
		return (BaseXException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaseXExceptionWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryException createQueryExceptionWrapperFromString(EDataType eDataType, String initialValue) {
		return (QueryException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryExceptionWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryIOException createQueryIOExceptionWrapperFromString(EDataType eDataType, String initialValue) {
		return (QueryIOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryIOExceptionWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseXClient createBaseXClientWrapperFromString(EDataType eDataType, String initialValue) {
		return (BaseXClient)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaseXClientWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionPackage getExecutionPackage() {
		return (ExecutionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExecutionPackage getPackage() {
		return ExecutionPackage.eINSTANCE;
	}

} //ExecutionFactoryImpl
