/**
 */
package qualitypatternmodel.graphstructure.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import qualitypatternmodel.graphstructure.*;

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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate' of 'Graph Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GRAPH_ELEMENT__VALIDATE = 1;

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
			case GraphstructurePackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case GraphstructurePackage.SINGLE_ELEMENT:
				return validateSingleElement((SingleElement)value, diagnostics, context);
			case GraphstructurePackage.SET_ELEMENT:
				return validateSetElement((SetElement)value, diagnostics, context);
			case GraphstructurePackage.ELEMENT:
				return validateElement((Element)value, diagnostics, context);
			case GraphstructurePackage.GRAPH:
				return validateGraph((Graph)value, diagnostics, context);
			case GraphstructurePackage.GRAPH_ELEMENT:
				return validateGraphElement((GraphElement)value, diagnostics, context);
			case GraphstructurePackage.PROPERTY_LOCATION:
				return validatePropertyLocation((PropertyLocation)value, diagnostics, context);
			case GraphstructurePackage.AXIS:
				return validateAxis((Axis)value, diagnostics, context);
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
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(property, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(property, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphElement_validate(property, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleElement(SingleElement singleElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singleElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singleElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singleElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singleElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singleElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singleElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphElement_validate(singleElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleElement_hasPreviousOrIsRoot(singleElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasPreviousOrIsRoot constraint of '<em>Single Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SINGLE_ELEMENT__HAS_PREVIOUS_OR_IS_ROOT__EEXPRESSION = "self.previous->notEmpty() or self.root->notEmpty()";

	/**
	 * Validates the hasPreviousOrIsRoot constraint of '<em>Single Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleElement_hasPreviousOrIsRoot(SingleElement singleElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GraphstructurePackage.Literals.SINGLE_ELEMENT,
				 singleElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasPreviousOrIsRoot",
				 SINGLE_ELEMENT__HAS_PREVIOUS_OR_IS_ROOT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetElement(SetElement setElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(setElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(setElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(setElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(setElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(setElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(setElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(setElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(setElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(setElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphElement_validate(setElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateSetElement_hasPrevious(setElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the hasPrevious constraint of '<em>Set Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SET_ELEMENT__HAS_PREVIOUS__EEXPRESSION = "self.previous->notEmpty()";

	/**
	 * Validates the hasPrevious constraint of '<em>Set Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetElement_hasPrevious(SetElement setElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GraphstructurePackage.Literals.SET_ELEMENT,
				 setElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "hasPrevious",
				 SET_ELEMENT__HAS_PREVIOUS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElement(Element element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(element, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(element, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphElement_validate(element, diagnostics, context);
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
	public boolean validateGraphElement(GraphElement graphElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(graphElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(graphElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(graphElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(graphElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(graphElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(graphElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(graphElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(graphElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(graphElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphElement_validate(graphElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validate constraint of '<em>Graph Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphElement_validate(GraphElement graphElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return graphElement.validate(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyLocation(PropertyLocation propertyLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAxis(Axis axis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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
