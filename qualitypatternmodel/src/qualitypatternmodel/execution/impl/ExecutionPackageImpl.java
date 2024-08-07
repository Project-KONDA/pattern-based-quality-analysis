/**
 */
package qualitypatternmodel.execution.impl;

import java.io.IOException;
import java.util.Map;

import org.basex.core.BaseXException;
import org.basex.query.QueryException;
import org.basex.query.QueryIOException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.impl.Adaptionneo4jPackageImpl;
import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl;
import qualitypatternmodel.execution.BaseXClient;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.Databaseformat;
import qualitypatternmodel.execution.Databases;
import qualitypatternmodel.execution.ExecutionFactory;
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
import qualitypatternmodel.execution.impl.BaseXClientImpl.Query;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.impl.GraphstructurePackageImpl;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.impl.JavaoperatorsPackageImpl;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.impl.JavaqueryPackageImpl;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.impl.JavaqueryoutputPackageImpl;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.OperatorsPackageImpl;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ParametersPackageImpl;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.impl.PatternstructurePackageImpl;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;
import qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionPackageImpl extends EPackageImpl implements ExecutionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlDataDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localXmlDataDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverXmlDataDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databasesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToIntMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlSchemaDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localXmlSchemaDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverXmlSchemaDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseformatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseXClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType baseXExceptionWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType queryExceptionWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType queryIOExceptionWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ioExceptionWrapperEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType queryWrapperEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see qualitypatternmodel.execution.ExecutionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExecutionPackageImpl() {
		super(eNS_URI, ExecutionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ExecutionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExecutionPackage init() {
		if (isInited) return (ExecutionPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExecutionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExecutionPackageImpl theExecutionPackage = registeredExecutionPackage instanceof ExecutionPackageImpl ? (ExecutionPackageImpl)registeredExecutionPackage : new ExecutionPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
		ParametersPackageImpl theParametersPackage = (ParametersPackageImpl)(registeredPackage instanceof ParametersPackageImpl ? registeredPackage : ParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
		OperatorsPackageImpl theOperatorsPackage = (OperatorsPackageImpl)(registeredPackage instanceof OperatorsPackageImpl ? registeredPackage : OperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);
		GraphstructurePackageImpl theGraphstructurePackage = (GraphstructurePackageImpl)(registeredPackage instanceof GraphstructurePackageImpl ? registeredPackage : GraphstructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		PatternstructurePackageImpl thePatternstructurePackage = (PatternstructurePackageImpl)(registeredPackage instanceof PatternstructurePackageImpl ? registeredPackage : PatternstructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdaptionxmlPackage.eNS_URI);
		AdaptionxmlPackageImpl theAdaptionxmlPackage = (AdaptionxmlPackageImpl)(registeredPackage instanceof AdaptionxmlPackageImpl ? registeredPackage : AdaptionxmlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TextrepresentationPackage.eNS_URI);
		TextrepresentationPackageImpl theTextrepresentationPackage = (TextrepresentationPackageImpl)(registeredPackage instanceof TextrepresentationPackageImpl ? registeredPackage : TextrepresentationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdaptionrdfPackage.eNS_URI);
		AdaptionrdfPackageImpl theAdaptionrdfPackage = (AdaptionrdfPackageImpl)(registeredPackage instanceof AdaptionrdfPackageImpl ? registeredPackage : AdaptionrdfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Adaptionneo4jPackage.eNS_URI);
		Adaptionneo4jPackageImpl theAdaptionneo4jPackage = (Adaptionneo4jPackageImpl)(registeredPackage instanceof Adaptionneo4jPackageImpl ? registeredPackage : Adaptionneo4jPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaoperatorsPackage.eNS_URI);
		JavaoperatorsPackageImpl theJavaoperatorsPackage = (JavaoperatorsPackageImpl)(registeredPackage instanceof JavaoperatorsPackageImpl ? registeredPackage : JavaoperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaqueryPackage.eNS_URI);
		JavaqueryPackageImpl theJavaqueryPackage = (JavaqueryPackageImpl)(registeredPackage instanceof JavaqueryPackageImpl ? registeredPackage : JavaqueryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaqueryoutputPackage.eNS_URI);
		JavaqueryoutputPackageImpl theJavaqueryoutputPackage = (JavaqueryoutputPackageImpl)(registeredPackage instanceof JavaqueryoutputPackageImpl ? registeredPackage : JavaqueryoutputPackage.eINSTANCE);

		// Create package meta-data objects
		theExecutionPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();
		theTextrepresentationPackage.createPackageContents();
		theAdaptionrdfPackage.createPackageContents();
		theAdaptionneo4jPackage.createPackageContents();
		theJavaoperatorsPackage.createPackageContents();
		theJavaqueryPackage.createPackageContents();
		theJavaqueryoutputPackage.createPackageContents();

		// Initialize created meta-data
		theExecutionPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();
		theTextrepresentationPackage.initializePackageContents();
		theAdaptionrdfPackage.initializePackageContents();
		theAdaptionneo4jPackage.initializePackageContents();
		theJavaoperatorsPackage.initializePackageContents();
		theJavaqueryPackage.initializePackageContents();
		theJavaqueryoutputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExecutionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExecutionPackage.eNS_URI, theExecutionPackage);
		return theExecutionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResult() {
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_Database() {
		return (EReference)resultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_Name() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_Person() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_StartDate() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_Runtime() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_ProblemNumber() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_EndDate() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResult_Pattern() {
		return (EReference)resultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_MatchNumber() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResult_SplitResult() {
		return (EAttribute)resultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getResult__Export__String() {
		return resultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlResult() {
		return xmlResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlDataDatabase() {
		return xmlDataDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlDataDatabase_RecordedAttributeValues() {
		return (EReference)xmlDataDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlDataDatabase_RecordedDataValues() {
		return (EReference)xmlDataDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlDataDatabase_XmlSchema() {
		return (EReference)xmlDataDatabaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlDataDatabase_ElementNames() {
		return (EReference)xmlDataDatabaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlDataDatabase_AttributeNames() {
		return (EReference)xmlDataDatabaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RecordAttributeValue__String() {
		return xmlDataDatabaseEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RecordDataValue__String() {
		return xmlDataDatabaseEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RemoveAttributeValue__String() {
		return xmlDataDatabaseEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RemoveDataValue__String() {
		return xmlDataDatabaseEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RecordElementName__String() {
		return xmlDataDatabaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RecordAttributeName__String() {
		return xmlDataDatabaseEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RemoveElementName__String() {
		return xmlDataDatabaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__RemoveAttributeName__String() {
		return xmlDataDatabaseEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__AddAttributeNames__EList() {
		return xmlDataDatabaseEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__AddElementNames__EList() {
		return xmlDataDatabaseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__CreateSchemaDatabaseFromReferencedSchema() {
		return xmlDataDatabaseEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__GetSuggestionsFromAxisPreviousTag__XmlAxisKind_String() {
		return xmlDataDatabaseEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__GetSuggestionsFromAxisPreviousRoot__XmlAxisKind() {
		return xmlDataDatabaseEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__FindXSDURL() {
		return xmlDataDatabaseEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__GetSuggestionsFromSourceTargetTag__String_String() {
		return xmlDataDatabaseEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDataDatabase__GetSuggestionsFromAxisNextTag__XmlAxisKind_String() {
		return xmlDataDatabaseEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalXmlDataDatabase() {
		return localXmlDataDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalXmlDataDatabase_DataPath() {
		return (EAttribute)localXmlDataDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerXmlDataDatabase() {
		return serverXmlDataDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServerXmlDataDatabase_BaseXClient() {
		return (EReference)serverXmlDataDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerXmlDataDatabase_LocalName() {
		return (EAttribute)serverXmlDataDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabases() {
		return databasesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabases_XmlDatabases() {
		return (EReference)databasesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabases_XmlSchemata() {
		return (EReference)databasesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabases__Clear() {
		return databasesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringToIntMap() {
		return stringToIntMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToIntMap_Key() {
		return (EAttribute)stringToIntMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringToIntMap_Value() {
		return (EAttribute)stringToIntMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlSchemaDatabase() {
		return xmlSchemaDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXmlSchemaDatabase_XmlDatabases() {
		return (EReference)xmlSchemaDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlSchemaDatabase_ElementNames() {
		return (EAttribute)xmlSchemaDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlSchemaDatabase_AttributeNames() {
		return (EAttribute)xmlSchemaDatabaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlSchemaDatabase_RootElementNames() {
		return (EAttribute)xmlSchemaDatabaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlSchemaDatabase_Prefix() {
		return (EAttribute)xmlSchemaDatabaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckFollowingInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckParentInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckAncestorInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckPrecedingSiblingInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckDescendantInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckChildInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckAttributeInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckKeyRefInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckPrecedingInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__CheckFollowingSiblingInSchema__String_String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetAncestorsInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetDescendantsInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetChildrenInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetFollowingInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetPrecedingInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetParentsInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetAttributesInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetFollowingSiblingsInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlSchemaDatabase__GetPrecedingSiblingsInSchema__String() {
		return xmlSchemaDatabaseEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalXmlSchemaDatabase() {
		return localXmlSchemaDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalXmlSchemaDatabase_SchemaPath() {
		return (EAttribute)localXmlSchemaDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerXmlSchemaDatabase() {
		return serverXmlSchemaDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXmlDatabase() {
		return xmlDatabaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlDatabase_Name() {
		return (EAttribute)xmlDatabaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXmlDatabase_Namespace() {
		return (EAttribute)xmlDatabaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__Analyse() {
		return xmlDatabaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__Init() {
		return xmlDatabaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__Open() {
		return xmlDatabaseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__Create() {
		return xmlDatabaseEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__Execute__String() {
		return xmlDatabaseEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__Close() {
		return xmlDatabaseEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXmlDatabase__Delete() {
		return xmlDatabaseEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabase_Results() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabase_Patterns() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabase__Execute__CompletePattern_String_String() {
		return databaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDatabase__CountMatches__CompletePattern() {
		return databaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseformat() {
		return databaseformatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaseXClient() {
		return baseXClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseXClient_Host() {
		return (EAttribute)baseXClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseXClient_Port() {
		return (EAttribute)baseXClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseXClient_Username() {
		return (EAttribute)baseXClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaseXClient_Password() {
		return (EAttribute)baseXClientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBaseXClient__Close() {
		return baseXClientEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBaseXClient__Execute__String() {
		return baseXClientEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBaseXClient__Query__String() {
		return baseXClientEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBaseXClient__IsConnected() {
		return baseXClientEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBaseXClient__Connect() {
		return baseXClientEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBaseXExceptionWrapper() {
		return baseXExceptionWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQueryExceptionWrapper() {
		return queryExceptionWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQueryIOExceptionWrapper() {
		return queryIOExceptionWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIoExceptionWrapper() {
		return ioExceptionWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getQueryWrapper() {
		return queryWrapperEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionFactory getExecutionFactory() {
		return (ExecutionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resultEClass = createEClass(RESULT);
		createEReference(resultEClass, RESULT__DATABASE);
		createEAttribute(resultEClass, RESULT__NAME);
		createEAttribute(resultEClass, RESULT__PERSON);
		createEAttribute(resultEClass, RESULT__START_DATE);
		createEAttribute(resultEClass, RESULT__END_DATE);
		createEReference(resultEClass, RESULT__PATTERN);
		createEAttribute(resultEClass, RESULT__SPLIT_RESULT);
		createEAttribute(resultEClass, RESULT__PROBLEM_NUMBER);
		createEAttribute(resultEClass, RESULT__MATCH_NUMBER);
		createEAttribute(resultEClass, RESULT__RUNTIME);
		createEOperation(resultEClass, RESULT___EXPORT__STRING);

		xmlResultEClass = createEClass(XML_RESULT);

		xmlDataDatabaseEClass = createEClass(XML_DATA_DATABASE);
		createEReference(xmlDataDatabaseEClass, XML_DATA_DATABASE__RECORDED_ATTRIBUTE_VALUES);
		createEReference(xmlDataDatabaseEClass, XML_DATA_DATABASE__RECORDED_DATA_VALUES);
		createEReference(xmlDataDatabaseEClass, XML_DATA_DATABASE__XML_SCHEMA);
		createEReference(xmlDataDatabaseEClass, XML_DATA_DATABASE__ELEMENT_NAMES);
		createEReference(xmlDataDatabaseEClass, XML_DATA_DATABASE__ATTRIBUTE_NAMES);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___RECORD_ELEMENT_NAME__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___REMOVE_ELEMENT_NAME__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___ADD_ELEMENT_NAMES__ELIST);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___RECORD_DATA_VALUE__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___REMOVE_DATA_VALUE__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___RECORD_ATTRIBUTE_NAME__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___REMOVE_ATTRIBUTE_NAME__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___ADD_ATTRIBUTE_NAMES__ELIST);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___RECORD_ATTRIBUTE_VALUE__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___REMOVE_ATTRIBUTE_VALUE__STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___CREATE_SCHEMA_DATABASE_FROM_REFERENCED_SCHEMA);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___GET_SUGGESTIONS_FROM_AXIS_PREVIOUS_TAG__XMLAXISKIND_STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___GET_SUGGESTIONS_FROM_AXIS_PREVIOUS_ROOT__XMLAXISKIND);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___GET_SUGGESTIONS_FROM_SOURCE_TARGET_TAG__STRING_STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___GET_SUGGESTIONS_FROM_AXIS_NEXT_TAG__XMLAXISKIND_STRING);
		createEOperation(xmlDataDatabaseEClass, XML_DATA_DATABASE___FIND_XSDURL);

		localXmlDataDatabaseEClass = createEClass(LOCAL_XML_DATA_DATABASE);
		createEAttribute(localXmlDataDatabaseEClass, LOCAL_XML_DATA_DATABASE__DATA_PATH);

		serverXmlDataDatabaseEClass = createEClass(SERVER_XML_DATA_DATABASE);
		createEReference(serverXmlDataDatabaseEClass, SERVER_XML_DATA_DATABASE__BASE_XCLIENT);
		createEAttribute(serverXmlDataDatabaseEClass, SERVER_XML_DATA_DATABASE__LOCAL_NAME);

		databasesEClass = createEClass(DATABASES);
		createEReference(databasesEClass, DATABASES__XML_DATABASES);
		createEReference(databasesEClass, DATABASES__XML_SCHEMATA);
		createEOperation(databasesEClass, DATABASES___CLEAR);

		stringToIntMapEClass = createEClass(STRING_TO_INT_MAP);
		createEAttribute(stringToIntMapEClass, STRING_TO_INT_MAP__KEY);
		createEAttribute(stringToIntMapEClass, STRING_TO_INT_MAP__VALUE);

		xmlSchemaDatabaseEClass = createEClass(XML_SCHEMA_DATABASE);
		createEReference(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE__XML_DATABASES);
		createEAttribute(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE__ELEMENT_NAMES);
		createEAttribute(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE__ATTRIBUTE_NAMES);
		createEAttribute(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE__ROOT_ELEMENT_NAMES);
		createEAttribute(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE__PREFIX);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_FOLLOWING_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_PARENT_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_ANCESTOR_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_PRECEDING_SIBLING_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_DESCENDANT_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_CHILD_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_ATTRIBUTE_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_KEY_REF_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_PRECEDING_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___CHECK_FOLLOWING_SIBLING_IN_SCHEMA__STRING_STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_ANCESTORS_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_DESCENDANTS_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_CHILDREN_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_FOLLOWING_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_PRECEDING_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_PARENTS_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_ATTRIBUTES_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_FOLLOWING_SIBLINGS_IN_SCHEMA__STRING);
		createEOperation(xmlSchemaDatabaseEClass, XML_SCHEMA_DATABASE___GET_PRECEDING_SIBLINGS_IN_SCHEMA__STRING);

		localXmlSchemaDatabaseEClass = createEClass(LOCAL_XML_SCHEMA_DATABASE);
		createEAttribute(localXmlSchemaDatabaseEClass, LOCAL_XML_SCHEMA_DATABASE__SCHEMA_PATH);

		serverXmlSchemaDatabaseEClass = createEClass(SERVER_XML_SCHEMA_DATABASE);

		xmlDatabaseEClass = createEClass(XML_DATABASE);
		createEAttribute(xmlDatabaseEClass, XML_DATABASE__NAME);
		createEAttribute(xmlDatabaseEClass, XML_DATABASE__NAMESPACE);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___ANALYSE);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___INIT);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___OPEN);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___CREATE);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___EXECUTE__STRING);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___CLOSE);
		createEOperation(xmlDatabaseEClass, XML_DATABASE___DELETE);

		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__RESULTS);
		createEReference(databaseEClass, DATABASE__PATTERNS);
		createEOperation(databaseEClass, DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING);
		createEOperation(databaseEClass, DATABASE___COUNT_MATCHES__COMPLETEPATTERN);

		databaseformatEClass = createEClass(DATABASEFORMAT);

		baseXClientEClass = createEClass(BASE_XCLIENT);
		createEAttribute(baseXClientEClass, BASE_XCLIENT__HOST);
		createEAttribute(baseXClientEClass, BASE_XCLIENT__PORT);
		createEAttribute(baseXClientEClass, BASE_XCLIENT__USERNAME);
		createEAttribute(baseXClientEClass, BASE_XCLIENT__PASSWORD);
		createEOperation(baseXClientEClass, BASE_XCLIENT___CONNECT);
		createEOperation(baseXClientEClass, BASE_XCLIENT___IS_CONNECTED);
		createEOperation(baseXClientEClass, BASE_XCLIENT___CLOSE);
		createEOperation(baseXClientEClass, BASE_XCLIENT___EXECUTE__STRING);
		createEOperation(baseXClientEClass, BASE_XCLIENT___QUERY__STRING);

		// Create data types
		baseXExceptionWrapperEDataType = createEDataType(BASE_XEXCEPTION_WRAPPER);
		queryExceptionWrapperEDataType = createEDataType(QUERY_EXCEPTION_WRAPPER);
		queryIOExceptionWrapperEDataType = createEDataType(QUERY_IO_EXCEPTION_WRAPPER);
		ioExceptionWrapperEDataType = createEDataType(IO_EXCEPTION_WRAPPER);
		queryWrapperEDataType = createEDataType(QUERY_WRAPPER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PatternstructurePackage thePatternstructurePackage = (PatternstructurePackage)EPackage.Registry.INSTANCE.getEPackage(PatternstructurePackage.eNS_URI);
		AdaptionxmlPackage theAdaptionxmlPackage = (AdaptionxmlPackage)EPackage.Registry.INSTANCE.getEPackage(AdaptionxmlPackage.eNS_URI);
		OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xmlResultEClass.getESuperTypes().add(this.getResult());
		xmlDataDatabaseEClass.getESuperTypes().add(this.getXmlDatabase());
		xmlDataDatabaseEClass.getESuperTypes().add(this.getDatabase());
		localXmlDataDatabaseEClass.getESuperTypes().add(this.getXmlDataDatabase());
		serverXmlDataDatabaseEClass.getESuperTypes().add(this.getXmlDataDatabase());
		xmlSchemaDatabaseEClass.getESuperTypes().add(this.getXmlDatabase());
		xmlSchemaDatabaseEClass.getESuperTypes().add(this.getDatabaseformat());
		localXmlSchemaDatabaseEClass.getESuperTypes().add(this.getXmlSchemaDatabase());
		serverXmlSchemaDatabaseEClass.getESuperTypes().add(this.getXmlSchemaDatabase());

		// Initialize classes, features, and operations; add parameters
		initEClass(resultEClass, Result.class, "Result", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResult_Database(), this.getDatabase(), this.getDatabase_Results(), "database", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Name(), ecorePackage.getEString(), "name", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Person(), ecorePackage.getEString(), "person", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResult_Pattern(), thePatternstructurePackage.getCompletePattern(), null, "pattern", null, 1, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_SplitResult(), ecorePackage.getEString(), "splitResult", null, 0, -1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_ProblemNumber(), ecorePackage.getEInt(), "problemNumber", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_MatchNumber(), ecorePackage.getEInt(), "matchNumber", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResult_Runtime(), ecorePackage.getELong(), "runtime", null, 0, 1, Result.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getResult__Export__String(), null, "export", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xmlResultEClass, XmlResult.class, "XmlResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlDataDatabaseEClass, XmlDataDatabase.class, "XmlDataDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlDataDatabase_RecordedAttributeValues(), this.getStringToIntMap(), null, "recordedAttributeValues", null, 0, -1, XmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlDataDatabase_RecordedDataValues(), this.getStringToIntMap(), null, "recordedDataValues", null, 0, -1, XmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlDataDatabase_XmlSchema(), this.getXmlSchemaDatabase(), this.getXmlSchemaDatabase_XmlDatabases(), "xmlSchema", null, 0, 1, XmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlDataDatabase_ElementNames(), this.getStringToIntMap(), null, "elementNames", null, 0, -1, XmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlDataDatabase_AttributeNames(), this.getStringToIntMap(), null, "attributeNames", null, 0, -1, XmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RecordElementName__String(), null, "recordElementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RemoveElementName__String(), null, "removeElementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__AddElementNames__EList(), null, "addElementNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementNames", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RecordDataValue__String(), null, "recordDataValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RemoveDataValue__String(), null, "removeDataValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RecordAttributeName__String(), null, "recordAttributeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RemoveAttributeName__String(), null, "removeAttributeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__AddAttributeNames__EList(), null, "addAttributeNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attributeNames", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RecordAttributeValue__String(), null, "recordAttributeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__RemoveAttributeValue__String(), null, "removeAttributeValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getXmlDataDatabase__CreateSchemaDatabaseFromReferencedSchema(), this.getLocalXmlSchemaDatabase(), "createSchemaDatabaseFromReferencedSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIoExceptionWrapper());
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());

		op = initEOperation(getXmlDataDatabase__GetSuggestionsFromAxisPreviousTag__XmlAxisKind_String(), ecorePackage.getEString(), "getSuggestionsFromAxisPreviousTag", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAdaptionxmlPackage.getXmlAxisKind(), "axisKind", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "previousTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIoExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getBaseXExceptionWrapper());

		op = initEOperation(getXmlDataDatabase__GetSuggestionsFromAxisPreviousRoot__XmlAxisKind(), ecorePackage.getEString(), "getSuggestionsFromAxisPreviousRoot", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAdaptionxmlPackage.getXmlAxisKind(), "axisKind", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIoExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getBaseXExceptionWrapper());

		op = initEOperation(getXmlDataDatabase__GetSuggestionsFromSourceTargetTag__String_String(), theAdaptionxmlPackage.getXmlAxisKind(), "getSuggestionsFromSourceTargetTag", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "targetTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIoExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getBaseXExceptionWrapper());

		op = initEOperation(getXmlDataDatabase__GetSuggestionsFromAxisNextTag__XmlAxisKind_String(), ecorePackage.getEString(), "getSuggestionsFromAxisNextTag", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theAdaptionxmlPackage.getXmlAxisKind(), "axisKind", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "previousTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIoExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getBaseXExceptionWrapper());

		op = initEOperation(getXmlDataDatabase__FindXSDURL(), ecorePackage.getEString(), "findXSDURL", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIoExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(localXmlDataDatabaseEClass, LocalXmlDataDatabase.class, "LocalXmlDataDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalXmlDataDatabase_DataPath(), ecorePackage.getEString(), "dataPath", null, 0, 1, LocalXmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverXmlDataDatabaseEClass, ServerXmlDataDatabase.class, "ServerXmlDataDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServerXmlDataDatabase_BaseXClient(), this.getBaseXClient(), null, "baseXClient", null, 1, 1, ServerXmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerXmlDataDatabase_LocalName(), ecorePackage.getEString(), "localName", null, 0, 1, ServerXmlDataDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databasesEClass, Databases.class, "Databases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabases_XmlDatabases(), this.getXmlDataDatabase(), null, "xmlDatabases", null, 0, -1, Databases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabases_XmlSchemata(), this.getXmlSchemaDatabase(), null, "xmlSchemata", null, 0, -1, Databases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDatabases__Clear(), null, "clear", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringToIntMapEClass, Map.Entry.class, "StringToIntMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToIntMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringToIntMap_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlSchemaDatabaseEClass, XmlSchemaDatabase.class, "XmlSchemaDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlSchemaDatabase_XmlDatabases(), this.getXmlDataDatabase(), this.getXmlDataDatabase_XmlSchema(), "xmlDatabases", null, 0, -1, XmlSchemaDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlSchemaDatabase_ElementNames(), ecorePackage.getEString(), "elementNames", null, 0, -1, XmlSchemaDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlSchemaDatabase_AttributeNames(), ecorePackage.getEString(), "attributeNames", null, 0, -1, XmlSchemaDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlSchemaDatabase_RootElementNames(), ecorePackage.getEString(), "rootElementNames", null, 0, -1, XmlSchemaDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlSchemaDatabase_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, XmlSchemaDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getXmlSchemaDatabase__CheckFollowingInSchema__String_String(), ecorePackage.getEBoolean(), "checkFollowingInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckParentInSchema__String_String(), ecorePackage.getEBoolean(), "checkParentInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckAncestorInSchema__String_String(), ecorePackage.getEBoolean(), "checkAncestorInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckPrecedingSiblingInSchema__String_String(), ecorePackage.getEBoolean(), "checkPrecedingSiblingInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckDescendantInSchema__String_String(), ecorePackage.getEBoolean(), "checkDescendantInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckChildInSchema__String_String(), ecorePackage.getEBoolean(), "checkChildInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckAttributeInSchema__String_String(), ecorePackage.getEBoolean(), "checkAttributeInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "attributeName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckKeyRefInSchema__String_String(), null, "checkKeyRefInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckPrecedingInSchema__String_String(), ecorePackage.getEBoolean(), "checkPrecedingInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__CheckFollowingSiblingInSchema__String_String(), ecorePackage.getEBoolean(), "checkFollowingSiblingInSchema", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName2", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetAncestorsInSchema__String(), ecorePackage.getEString(), "getAncestorsInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetDescendantsInSchema__String(), ecorePackage.getEString(), "getDescendantsInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetChildrenInSchema__String(), ecorePackage.getEString(), "getChildrenInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetFollowingInSchema__String(), ecorePackage.getEString(), "getFollowingInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetPrecedingInSchema__String(), ecorePackage.getEString(), "getPrecedingInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetParentsInSchema__String(), ecorePackage.getEString(), "getParentsInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetAttributesInSchema__String(), ecorePackage.getEString(), "getAttributesInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetFollowingSiblingsInSchema__String(), ecorePackage.getEString(), "getFollowingSiblingsInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		op = initEOperation(getXmlSchemaDatabase__GetPrecedingSiblingsInSchema__String(), ecorePackage.getEString(), "getPrecedingSiblingsInSchema", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "elementName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());

		initEClass(localXmlSchemaDatabaseEClass, LocalXmlSchemaDatabase.class, "LocalXmlSchemaDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalXmlSchemaDatabase_SchemaPath(), ecorePackage.getEString(), "schemaPath", null, 0, 1, LocalXmlSchemaDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverXmlSchemaDatabaseEClass, ServerXmlSchemaDatabase.class, "ServerXmlSchemaDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlDatabaseEClass, XmlDatabase.class, "XmlDatabase", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlDatabase_Name(), ecorePackage.getEString(), "name", null, 0, 1, XmlDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlDatabase_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, XmlDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getXmlDatabase__Analyse(), null, "analyse", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getXmlDatabase__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getXmlDatabase__Open(), null, "open", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());

		op = initEOperation(getXmlDatabase__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());

		op = initEOperation(getXmlDatabase__Execute__String(), ecorePackage.getEString(), "execute", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "query", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getXmlDatabase__Close(), null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBaseXExceptionWrapper());

		initEOperation(getXmlDatabase__Delete(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_Results(), this.getResult(), this.getResult_Database(), "results", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Patterns(), thePatternstructurePackage.getCompletePattern(), thePatternstructurePackage.getCompletePattern_Database(), "patterns", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDatabase__Execute__CompletePattern_String_String(), this.getResult(), "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getCompletePattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "person", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());
		addEException(op, theOperatorsPackage.getOperatorCycleExceptionWrapper());
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getDatabase__CountMatches__CompletePattern(), ecorePackage.getEInt(), "countMatches", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePatternstructurePackage.getCompletePattern(), "pattern", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getQueryExceptionWrapper());
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());
		addEException(op, theOperatorsPackage.getOperatorCycleExceptionWrapper());
		addEException(op, thePatternstructurePackage.getMissingPatternContainerException());
		addEException(op, this.getBaseXExceptionWrapper());
		addEException(op, this.getQueryIOExceptionWrapper());
		addEException(op, this.getIoExceptionWrapper());

		initEClass(databaseformatEClass, Databaseformat.class, "Databaseformat", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(baseXClientEClass, BaseXClient.class, "BaseXClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaseXClient_Host(), ecorePackage.getEString(), "host", null, 0, 1, BaseXClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseXClient_Port(), ecorePackage.getEInt(), "port", null, 0, 1, BaseXClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseXClient_Username(), ecorePackage.getEString(), "username", null, 0, 1, BaseXClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBaseXClient_Password(), ecorePackage.getEString(), "password", null, 0, 1, BaseXClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBaseXClient__Connect(), null, "connect", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIoExceptionWrapper());

		initEOperation(getBaseXClient__IsConnected(), ecorePackage.getEBoolean(), "isConnected", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBaseXClient__Close(), null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getBaseXClient__Execute__String(), ecorePackage.getEString(), "execute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "command", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIoExceptionWrapper());

		op = initEOperation(getBaseXClient__Query__String(), this.getQueryWrapper(), "query", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "query", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIoExceptionWrapper());

		// Initialize data types
		initEDataType(baseXExceptionWrapperEDataType, BaseXException.class, "BaseXExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(queryExceptionWrapperEDataType, QueryException.class, "QueryExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(queryIOExceptionWrapperEDataType, QueryIOException.class, "QueryIOExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ioExceptionWrapperEDataType, IOException.class, "IoExceptionWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(queryWrapperEDataType, Query.class, "QueryWrapper", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExecutionPackageImpl
