/**
 */
package qualitypatternmodel.graphstructure.util;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.util.PatternstructureValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.graphstructure.GraphstructurePackage
 * @generated
 */
public class GraphstructureValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GraphstructureValidator INSTANCE = new GraphstructureValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "qualitypatternmodel.graphstructure";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Comparable'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPARABLE__VALIDATE = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternstructureValidator patternstructureValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphstructureValidator() {
		super();
		patternstructureValidator = PatternstructureValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GraphstructurePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GraphstructurePackage.RELATION:
				return validateRelation((Relation)value, diagnostics, context);
			case GraphstructurePackage.PRIMITIVE_NODE:
				return validatePrimitiveNode((PrimitiveNode)value, diagnostics, context);
			case GraphstructurePackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case GraphstructurePackage.GRAPH:
				return validateGraph((Graph)value, diagnostics, context);
			case GraphstructurePackage.COMPARABLE:
				return validateComparable((qualitypatternmodel.graphstructure.Comparable)value, diagnostics, context);
			case GraphstructurePackage.ADAPTABLE:
				return validateAdaptable((Adaptable)value, diagnostics, context);
			case GraphstructurePackage.COMPLEX_NODE:
				return validateComplexNode((ComplexNode)value, diagnostics, context);
			case GraphstructurePackage.RETURN_TYPE:
				return validateReturnType((ReturnType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relation, diagnostics, context);
		if (result || diagnostics != null) result &= patternstructureValidator.validatePatternElement_validate(relation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveNode(PrimitiveNode primitiveNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(primitiveNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(primitiveNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primitiveNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primitiveNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(primitiveNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primitiveNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(primitiveNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(primitiveNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primitiveNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateComparable_validate(primitiveNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateComparable_validate(node, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraph(Graph graph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(graph, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(graph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(graph, diagnostics, context);
		if (result || diagnostics != null) result &= patternstructureValidator.validatePatternElement_validate(graph, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparable(qualitypatternmodel.graphstructure.Comparable comparable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comparable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(comparable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comparable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comparable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(comparable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comparable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(comparable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(comparable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(comparable, diagnostics, context);
		if (result || diagnostics != null) result &= validateComparable_validate(comparable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComparable_validate(qualitypatternmodel.graphstructure.Comparable comparable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comparable.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdaptable(Adaptable adaptable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(adaptable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(adaptable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(adaptable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(adaptable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(adaptable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(adaptable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(adaptable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(adaptable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(adaptable, diagnostics, context);
		if (result || diagnostics != null) result &= patternstructureValidator.validatePatternElement_validate(adaptable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexNode(ComplexNode complexNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(complexNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(complexNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(complexNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(complexNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(complexNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(complexNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(complexNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(complexNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(complexNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateComparable_validate(complexNode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnType(ReturnType returnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GraphstructureValidator
