/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;
import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoEdge;
import qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam;
import qualitypatternmodel.adaptionneo4j.NeoPathParam;
import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;
import qualitypatternmodel.adaptionneo4j.NeoDirection;
import qualitypatternmodel.adaptionneo4j.NeoElementEdge;
import qualitypatternmodel.adaptionneo4j.NeoElement;
import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoLabel;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNameParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;

import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;

import qualitypatternmodel.adaptionrdf.impl.AdaptionrdfPackageImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;

import qualitypatternmodel.adaptionxml.impl.AdaptionxmlPackageImpl;

import qualitypatternmodel.execution.ExecutionPackage;

import qualitypatternmodel.execution.impl.ExecutionPackageImpl;

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
public class Adaptionneo4jPackageImpl extends EPackageImpl implements Adaptionneo4jPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoElementNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoElementEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPathParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoComplexEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoSimpleEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPathPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPropertyNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoElementPathParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPropertyPathParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPropertyEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoNodeLabelsParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoEdgeLabelParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neoPropertyNameParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum neoDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum neoPlaceEEnum = null;

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
	 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Adaptionneo4jPackageImpl() {
		super(eNS_URI, Adaptionneo4jFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Adaptionneo4jPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Adaptionneo4jPackage init() {
		if (isInited) return (Adaptionneo4jPackage)EPackage.Registry.INSTANCE.getEPackage(Adaptionneo4jPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAdaptionneo4jPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Adaptionneo4jPackageImpl theAdaptionneo4jPackage = registeredAdaptionneo4jPackage instanceof Adaptionneo4jPackageImpl ? (Adaptionneo4jPackageImpl)registeredAdaptionneo4jPackage : new Adaptionneo4jPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionPackage.eNS_URI);
		ExecutionPackageImpl theExecutionPackage = (ExecutionPackageImpl)(registeredPackage instanceof ExecutionPackageImpl ? registeredPackage : ExecutionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TextrepresentationPackage.eNS_URI);
		TextrepresentationPackageImpl theTextrepresentationPackage = (TextrepresentationPackageImpl)(registeredPackage instanceof TextrepresentationPackageImpl ? registeredPackage : TextrepresentationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AdaptionrdfPackage.eNS_URI);
		AdaptionrdfPackageImpl theAdaptionrdfPackage = (AdaptionrdfPackageImpl)(registeredPackage instanceof AdaptionrdfPackageImpl ? registeredPackage : AdaptionrdfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaoperatorsPackage.eNS_URI);
		JavaoperatorsPackageImpl theJavaoperatorsPackage = (JavaoperatorsPackageImpl)(registeredPackage instanceof JavaoperatorsPackageImpl ? registeredPackage : JavaoperatorsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaqueryPackage.eNS_URI);
		JavaqueryPackageImpl theJavaqueryPackage = (JavaqueryPackageImpl)(registeredPackage instanceof JavaqueryPackageImpl ? registeredPackage : JavaqueryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(JavaqueryoutputPackage.eNS_URI);
		JavaqueryoutputPackageImpl theJavaqueryoutputPackage = (JavaqueryoutputPackageImpl)(registeredPackage instanceof JavaqueryoutputPackageImpl ? registeredPackage : JavaqueryoutputPackage.eINSTANCE);

		// Create package meta-data objects
		theAdaptionneo4jPackage.createPackageContents();
		theParametersPackage.createPackageContents();
		theOperatorsPackage.createPackageContents();
		theGraphstructurePackage.createPackageContents();
		thePatternstructurePackage.createPackageContents();
		theAdaptionxmlPackage.createPackageContents();
		theExecutionPackage.createPackageContents();
		theTextrepresentationPackage.createPackageContents();
		theAdaptionrdfPackage.createPackageContents();
		theJavaoperatorsPackage.createPackageContents();
		theJavaqueryPackage.createPackageContents();
		theJavaqueryoutputPackage.createPackageContents();

		// Initialize created meta-data
		theAdaptionneo4jPackage.initializePackageContents();
		theParametersPackage.initializePackageContents();
		theOperatorsPackage.initializePackageContents();
		theGraphstructurePackage.initializePackageContents();
		thePatternstructurePackage.initializePackageContents();
		theAdaptionxmlPackage.initializePackageContents();
		theExecutionPackage.initializePackageContents();
		theTextrepresentationPackage.initializePackageContents();
		theAdaptionrdfPackage.initializePackageContents();
		theJavaoperatorsPackage.initializePackageContents();
		theJavaqueryPackage.initializePackageContents();
		theJavaqueryoutputPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdaptionneo4jPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Adaptionneo4jPackage.eNS_URI, theAdaptionneo4jPackage);
		return theAdaptionneo4jPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoNode() {
		return neoNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoNode__GetCypherVariable() {
		return neoNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoElementNode() {
		return neoElementNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoElementNode_NeoNodeLabels() {
		return (EReference)neoElementNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoElementNode_NeoPlace() {
		return (EAttribute)neoElementNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoElementNode_IsVariableDistinctInUse() {
		return (EAttribute)neoElementNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoElementNode__AddNeoLabel__String() {
		return neoElementNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoElementEdge() {
		return neoElementEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoElementEdge_NeoElementPathParam() {
		return (EReference)neoElementEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoEdge() {
		return neoEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoEdge_ReturnElement() {
		return (EAttribute)neoEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoEdge__SetIsReturnElement__boolean() {
		return neoEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoEdge__GetReturnInnerEdgeNodes() {
		return neoEdgeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPathParam() {
		return neoPathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPathParam_NeoPathPart() {
		return (EReference)neoPathParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathParam__GetReturnInnerEdgeNodes() {
		return neoPathParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathParam__GetCypherReturnVariable() {
		return neoPathParamEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoComplexEdge() {
		return neoComplexEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoComplexEdge_NeoPathParts() {
		return (EReference)neoComplexEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoComplexEdge__AddNeoPathPart__NeoPathPart() {
		return neoComplexEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoComplexEdge__RemoveNeoPathPart__NeoPathPart() {
		return neoComplexEdgeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoSimpleEdge() {
		return neoSimpleEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoSimpleEdge_KeyValueParam() {
		return (EReference)neoSimpleEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoSimpleEdge_NeoDirection() {
		return (EAttribute)neoSimpleEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoSimpleEdge_NeoTargetNodeLabels() {
		return (EReference)neoSimpleEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoSimpleEdge_NeoEdgeLabel() {
		return (EReference)neoSimpleEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeoSimpleEdge_EdgeNumber() {
		return (EAttribute)neoSimpleEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoSimpleEdge__SetNeoDirection__NeoDirection() {
		return neoSimpleEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoSimpleEdge__AddNeoTargetNodeLabel__String() {
		return neoSimpleEdgeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoSimpleEdge__AddNeoEdgeLabel__String() {
		return neoSimpleEdgeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPathPart() {
		return neoPathPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPathPart_NeoPathParam() {
		return (EReference)neoPathPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPathPart_NeoComplexEdge() {
		return (EReference)neoPathPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathPart__GetNeoPathPartEdgeLeafs() {
		return neoPathPartEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathPart__GetCypherVariable() {
		return neoPathPartEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathPart__GetCypherInnerEdgeNodes__boolean() {
		return neoPathPartEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathPart__GetNeoLastEdge() {
		return neoPathPartEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathPart__SetValueFromString__String() {
		return neoPathPartEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPathPart__GetValueAsString() {
		return neoPathPartEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPropertyNode() {
		return neoPropertyNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPropertyNode__GenerateCypherPropertyAddressing() {
		return neoPropertyNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoElementPathParam() {
		return neoElementPathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoElementPathParam_NeoElementEdge() {
		return (EReference)neoElementPathParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPropertyPathParam() {
		return neoPropertyPathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPropertyPathParam_NeoPropertyEdge() {
		return (EReference)neoPropertyPathParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPropertyPathParam_NeoPropertyName() {
		return (EReference)neoPropertyPathParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPropertyPathParam__SetNeoPropertyName__String() {
		return neoPropertyPathParamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPropertyEdge() {
		return neoPropertyEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeoPropertyEdge_NeoPropertyPathParam() {
		return (EReference)neoPropertyEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPropertyEdge__GenerateCypherPropertyAddressing() {
		return neoPropertyEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoPropertyEdge__GetCypherNodeVariable() {
		return neoPropertyEdgeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoElement() {
		return neoElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNeoElement__GetCypherReturn() {
		return neoElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoNodeLabelsParam() {
		return neoNodeLabelsParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoEdgeLabelParam() {
		return neoEdgeLabelParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoLabel() {
		return neoLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeoPropertyNameParam() {
		return neoPropertyNameParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNeoDirection() {
		return neoDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNeoPlace() {
		return neoPlaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adaptionneo4jFactory getAdaptionneo4jFactory() {
		return (Adaptionneo4jFactory)getEFactoryInstance();
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
		neoNodeEClass = createEClass(NEO_NODE);
		createEOperation(neoNodeEClass, NEO_NODE___GET_CYPHER_VARIABLE);

		neoElementNodeEClass = createEClass(NEO_ELEMENT_NODE);
		createEReference(neoElementNodeEClass, NEO_ELEMENT_NODE__NEO_NODE_LABELS);
		createEAttribute(neoElementNodeEClass, NEO_ELEMENT_NODE__NEO_PLACE);
		createEAttribute(neoElementNodeEClass, NEO_ELEMENT_NODE__IS_VARIABLE_DISTINCT_IN_USE);
		createEOperation(neoElementNodeEClass, NEO_ELEMENT_NODE___ADD_NEO_LABEL__STRING);

		neoElementEdgeEClass = createEClass(NEO_ELEMENT_EDGE);
		createEReference(neoElementEdgeEClass, NEO_ELEMENT_EDGE__NEO_ELEMENT_PATH_PARAM);

		neoComplexEdgeEClass = createEClass(NEO_COMPLEX_EDGE);
		createEReference(neoComplexEdgeEClass, NEO_COMPLEX_EDGE__NEO_PATH_PARTS);
		createEOperation(neoComplexEdgeEClass, NEO_COMPLEX_EDGE___ADD_NEO_PATH_PART__NEOPATHPART);
		createEOperation(neoComplexEdgeEClass, NEO_COMPLEX_EDGE___REMOVE_NEO_PATH_PART__NEOPATHPART);

		neoSimpleEdgeEClass = createEClass(NEO_SIMPLE_EDGE);
		createEReference(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__KEY_VALUE_PARAM);
		createEAttribute(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__NEO_DIRECTION);
		createEReference(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__NEO_TARGET_NODE_LABELS);
		createEReference(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__NEO_EDGE_LABEL);
		createEAttribute(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE__EDGE_NUMBER);
		createEOperation(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE___SET_NEO_DIRECTION__NEODIRECTION);
		createEOperation(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE___ADD_NEO_TARGET_NODE_LABEL__STRING);
		createEOperation(neoSimpleEdgeEClass, NEO_SIMPLE_EDGE___ADD_NEO_EDGE_LABEL__STRING);

		neoPathPartEClass = createEClass(NEO_PATH_PART);
		createEReference(neoPathPartEClass, NEO_PATH_PART__NEO_PATH_PARAM);
		createEReference(neoPathPartEClass, NEO_PATH_PART__NEO_COMPLEX_EDGE);
		createEOperation(neoPathPartEClass, NEO_PATH_PART___GET_NEO_PATH_PART_EDGE_LEAFS);
		createEOperation(neoPathPartEClass, NEO_PATH_PART___GET_CYPHER_VARIABLE);
		createEOperation(neoPathPartEClass, NEO_PATH_PART___GET_CYPHER_INNER_EDGE_NODES__BOOLEAN);
		createEOperation(neoPathPartEClass, NEO_PATH_PART___GET_NEO_LAST_EDGE);
		createEOperation(neoPathPartEClass, NEO_PATH_PART___SET_VALUE_FROM_STRING__STRING);
		createEOperation(neoPathPartEClass, NEO_PATH_PART___GET_VALUE_AS_STRING);

		neoPropertyNodeEClass = createEClass(NEO_PROPERTY_NODE);
		createEOperation(neoPropertyNodeEClass, NEO_PROPERTY_NODE___GENERATE_CYPHER_PROPERTY_ADDRESSING);

		neoElementPathParamEClass = createEClass(NEO_ELEMENT_PATH_PARAM);
		createEReference(neoElementPathParamEClass, NEO_ELEMENT_PATH_PARAM__NEO_ELEMENT_EDGE);

		neoPropertyPathParamEClass = createEClass(NEO_PROPERTY_PATH_PARAM);
		createEReference(neoPropertyPathParamEClass, NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_EDGE);
		createEReference(neoPropertyPathParamEClass, NEO_PROPERTY_PATH_PARAM__NEO_PROPERTY_NAME);
		createEOperation(neoPropertyPathParamEClass, NEO_PROPERTY_PATH_PARAM___SET_NEO_PROPERTY_NAME__STRING);

		neoPropertyEdgeEClass = createEClass(NEO_PROPERTY_EDGE);
		createEReference(neoPropertyEdgeEClass, NEO_PROPERTY_EDGE__NEO_PROPERTY_PATH_PARAM);
		createEOperation(neoPropertyEdgeEClass, NEO_PROPERTY_EDGE___GENERATE_CYPHER_PROPERTY_ADDRESSING);
		createEOperation(neoPropertyEdgeEClass, NEO_PROPERTY_EDGE___GET_CYPHER_NODE_VARIABLE);

		neoEdgeEClass = createEClass(NEO_EDGE);
		createEAttribute(neoEdgeEClass, NEO_EDGE__RETURN_ELEMENT);
		createEOperation(neoEdgeEClass, NEO_EDGE___SET_IS_RETURN_ELEMENT__BOOLEAN);
		createEOperation(neoEdgeEClass, NEO_EDGE___GET_RETURN_INNER_EDGE_NODES);

		neoPathParamEClass = createEClass(NEO_PATH_PARAM);
		createEReference(neoPathParamEClass, NEO_PATH_PARAM__NEO_PATH_PART);
		createEOperation(neoPathParamEClass, NEO_PATH_PARAM___GET_RETURN_INNER_EDGE_NODES);
		createEOperation(neoPathParamEClass, NEO_PATH_PARAM___GET_CYPHER_RETURN_VARIABLE);

		neoElementEClass = createEClass(NEO_ELEMENT);
		createEOperation(neoElementEClass, NEO_ELEMENT___GET_CYPHER_RETURN);

		neoNodeLabelsParamEClass = createEClass(NEO_NODE_LABELS_PARAM);

		neoEdgeLabelParamEClass = createEClass(NEO_EDGE_LABEL_PARAM);

		neoLabelEClass = createEClass(NEO_LABEL);

		neoPropertyNameParamEClass = createEClass(NEO_PROPERTY_NAME_PARAM);

		// Create enums
		neoDirectionEEnum = createEEnum(NEO_DIRECTION);
		neoPlaceEEnum = createEEnum(NEO_PLACE);
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
		GraphstructurePackage theGraphstructurePackage = (GraphstructurePackage)EPackage.Registry.INSTANCE.getEPackage(GraphstructurePackage.eNS_URI);
		ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		neoNodeEClass.getESuperTypes().add(this.getNeoElement());
		neoElementNodeEClass.getESuperTypes().add(theGraphstructurePackage.getComplexNode());
		neoElementNodeEClass.getESuperTypes().add(this.getNeoNode());
		neoElementEdgeEClass.getESuperTypes().add(this.getNeoEdge());
		neoComplexEdgeEClass.getESuperTypes().add(this.getNeoPathPart());
		neoSimpleEdgeEClass.getESuperTypes().add(this.getNeoPathPart());
		neoPathPartEClass.getESuperTypes().add(thePatternstructurePackage.getPatternElement());
		neoPropertyNodeEClass.getESuperTypes().add(theGraphstructurePackage.getPrimitiveNode());
		neoPropertyNodeEClass.getESuperTypes().add(this.getNeoNode());
		neoElementPathParamEClass.getESuperTypes().add(this.getNeoPathParam());
		neoPropertyPathParamEClass.getESuperTypes().add(this.getNeoPathParam());
		neoPropertyEdgeEClass.getESuperTypes().add(this.getNeoEdge());
		neoEdgeEClass.getESuperTypes().add(theGraphstructurePackage.getRelation());
		neoEdgeEClass.getESuperTypes().add(this.getNeoElement());
		neoPathParamEClass.getESuperTypes().add(theParametersPackage.getParameter());
		neoPathParamEClass.getESuperTypes().add(theGraphstructurePackage.getAdaptable());
		neoNodeLabelsParamEClass.getESuperTypes().add(theParametersPackage.getTextListParam());
		neoNodeLabelsParamEClass.getESuperTypes().add(this.getNeoLabel());
		neoEdgeLabelParamEClass.getESuperTypes().add(theParametersPackage.getTextLiteralParam());
		neoEdgeLabelParamEClass.getESuperTypes().add(this.getNeoLabel());
		neoPropertyNameParamEClass.getESuperTypes().add(theParametersPackage.getTextLiteralParam());

		// Initialize classes, features, and operations; add parameters
		initEClass(neoNodeEClass, NeoNode.class, "NeoNode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getNeoNode__GetCypherVariable(), ecorePackage.getEString(), "getCypherVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(neoElementNodeEClass, NeoElementNode.class, "NeoElementNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoElementNode_NeoNodeLabels(), this.getNeoNodeLabelsParam(), null, "neoNodeLabels", null, 0, 1, NeoElementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeoElementNode_NeoPlace(), this.getNeoPlace(), "neoPlace", "FOLLOWING", 0, 1, NeoElementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeoElementNode_IsVariableDistinctInUse(), ecorePackage.getEBoolean(), "isVariableDistinctInUse", "true", 0, 1, NeoElementNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNeoElementNode__AddNeoLabel__String(), null, "addNeoLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "label", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(neoElementEdgeEClass, NeoElementEdge.class, "NeoElementEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoElementEdge_NeoElementPathParam(), this.getNeoElementPathParam(), this.getNeoElementPathParam_NeoElementEdge(), "neoElementPathParam", null, 0, 1, NeoElementEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neoComplexEdgeEClass, NeoComplexEdge.class, "NeoComplexEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoComplexEdge_NeoPathParts(), this.getNeoPathPart(), this.getNeoPathPart_NeoComplexEdge(), "neoPathParts", null, 2, -1, NeoComplexEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNeoComplexEdge__AddNeoPathPart__NeoPathPart(), null, "addNeoPathPart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNeoPathPart(), "neoPathPart", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeoComplexEdge__RemoveNeoPathPart__NeoPathPart(), null, "removeNeoPathPart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNeoPathPart(), "neoPathPart", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoSimpleEdgeEClass, NeoSimpleEdge.class, "NeoSimpleEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoSimpleEdge_KeyValueParam(), theParametersPackage.getKeyValueParam(), null, "keyValueParam", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeoSimpleEdge_NeoDirection(), this.getNeoDirection(), "neoDirection", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoSimpleEdge_NeoTargetNodeLabels(), this.getNeoNodeLabelsParam(), null, "neoTargetNodeLabels", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoSimpleEdge_NeoEdgeLabel(), this.getNeoEdgeLabelParam(), null, "neoEdgeLabel", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNeoSimpleEdge_EdgeNumber(), ecorePackage.getEInt(), "edgeNumber", null, 0, 1, NeoSimpleEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNeoSimpleEdge__SetNeoDirection__NeoDirection(), null, "setNeoDirection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNeoDirection(), "neoDirection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNeoSimpleEdge__AddNeoTargetNodeLabel__String(), null, "addNeoTargetNodeLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "label", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNeoSimpleEdge__AddNeoEdgeLabel__String(), null, "addNeoEdgeLabel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "label", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(neoPathPartEClass, NeoPathPart.class, "NeoPathPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoPathPart_NeoPathParam(), this.getNeoPathParam(), this.getNeoPathParam_NeoPathPart(), "neoPathParam", null, 0, 1, NeoPathPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoPathPart_NeoComplexEdge(), this.getNeoComplexEdge(), this.getNeoComplexEdge_NeoPathParts(), "neoComplexEdge", null, 0, 1, NeoPathPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNeoPathPart__GetNeoPathPartEdgeLeafs(), this.getNeoPathPart(), "getNeoPathPartEdgeLeafs", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeoPathPart__GetCypherVariable(), ecorePackage.getEString(), "getCypherVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNeoPathPart__GetCypherInnerEdgeNodes__boolean(), ecorePackage.getEString(), "getCypherInnerEdgeNodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "isReturn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNeoPathPart__GetNeoLastEdge(), this.getNeoPathPart(), "getNeoLastEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNeoPathPart__SetValueFromString__String(), null, "setValueFromString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEOperation(getNeoPathPart__GetValueAsString(), ecorePackage.getEString(), "getValueAsString", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoPropertyNodeEClass, NeoPropertyNode.class, "NeoPropertyNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getNeoPropertyNode__GenerateCypherPropertyAddressing(), ecorePackage.getEString(), "generateCypherPropertyAddressing", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(neoElementPathParamEClass, NeoElementPathParam.class, "NeoElementPathParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoElementPathParam_NeoElementEdge(), this.getNeoElementEdge(), this.getNeoElementEdge_NeoElementPathParam(), "neoElementEdge", null, 0, 1, NeoElementPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neoPropertyPathParamEClass, NeoPropertyPathParam.class, "NeoPropertyPathParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoPropertyPathParam_NeoPropertyEdge(), this.getNeoPropertyEdge(), this.getNeoPropertyEdge_NeoPropertyPathParam(), "neoPropertyEdge", null, 0, 1, NeoPropertyPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNeoPropertyPathParam_NeoPropertyName(), this.getNeoPropertyNameParam(), null, "neoPropertyName", null, 0, 1, NeoPropertyPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNeoPropertyPathParam__SetNeoPropertyName__String(), null, "setNeoPropertyName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "neoPropertyName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(neoPropertyEdgeEClass, NeoPropertyEdge.class, "NeoPropertyEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoPropertyEdge_NeoPropertyPathParam(), this.getNeoPropertyPathParam(), this.getNeoPropertyPathParam_NeoPropertyEdge(), "neoPropertyPathParam", null, 0, 1, NeoPropertyEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNeoPropertyEdge__GenerateCypherPropertyAddressing(), ecorePackage.getEString(), "generateCypherPropertyAddressing", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNeoPropertyEdge__GetCypherNodeVariable(), ecorePackage.getEString(), "getCypherNodeVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(neoEdgeEClass, NeoEdge.class, "NeoEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNeoEdge_ReturnElement(), ecorePackage.getEBoolean(), "returnElement", null, 0, 1, NeoEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNeoEdge__SetIsReturnElement__boolean(), null, "setIsReturnElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "returnElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNeoEdge__GetReturnInnerEdgeNodes(), ecorePackage.getEString(), "getReturnInnerEdgeNodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(neoPathParamEClass, NeoPathParam.class, "NeoPathParam", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNeoPathParam_NeoPathPart(), this.getNeoPathPart(), this.getNeoPathPart_NeoPathParam(), "neoPathPart", null, 0, 1, NeoPathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNeoPathParam__GetReturnInnerEdgeNodes(), ecorePackage.getEString(), "getReturnInnerEdgeNodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		op = initEOperation(getNeoPathParam__GetCypherReturnVariable(), ecorePackage.getEString(), "getCypherReturnVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());

		initEClass(neoElementEClass, NeoElement.class, "NeoElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getNeoElement__GetCypherReturn(), null, "getCypherReturn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePatternstructurePackage.getInvalidityExceptionWrapper());
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEIntegerObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(neoNodeLabelsParamEClass, NeoNodeLabelsParam.class, "NeoNodeLabelsParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(neoEdgeLabelParamEClass, NeoEdgeLabelParam.class, "NeoEdgeLabelParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(neoLabelEClass, NeoLabel.class, "NeoLabel", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(neoPropertyNameParamEClass, NeoPropertyNameParam.class, "NeoPropertyNameParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(neoDirectionEEnum, NeoDirection.class, "NeoDirection");
		addEEnumLiteral(neoDirectionEEnum, NeoDirection.IMPLICIT);
		addEEnumLiteral(neoDirectionEEnum, NeoDirection.RIGHT);
		addEEnumLiteral(neoDirectionEEnum, NeoDirection.LEFT);

		initEEnum(neoPlaceEEnum, NeoPlace.class, "NeoPlace");
		addEEnumLiteral(neoPlaceEEnum, NeoPlace.BEGINNING);
		addEEnumLiteral(neoPlaceEEnum, NeoPlace.FOLLOWING);

		// Create resource
		createResource(eNS_URI);
	}

} //Adaptionneo4jPackageImpl
