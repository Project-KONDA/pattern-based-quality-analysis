/**
 */
package qualitypatternmodel.adaptionrdf.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qualitypatternmodel.adaptionrdf.*;

import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;

import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.patternstructure.PatternElement;

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
 * @see qualitypatternmodel.adaptionrdf.AdaptionrdfPackage
 * @generated
 */
public class AdaptionrdfSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdaptionrdfPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptionrdfSwitch() {
		if (modelPackage == null) {
			modelPackage = AdaptionrdfPackage.eINSTANCE;
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
			case AdaptionrdfPackage.RDF_PREDICATE: {
				RdfPredicate rdfPredicate = (RdfPredicate)theEObject;
				T result = caseRdfPredicate(rdfPredicate);
				if (result == null) result = caseRelation(rdfPredicate);
				if (result == null) result = caseAdaptable(rdfPredicate);
				if (result == null) result = casePatternElement(rdfPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionrdfPackage.RDF_IRI_NODE: {
				RdfIriNode rdfIriNode = (RdfIriNode)theEObject;
				T result = caseRdfIriNode(rdfIriNode);
				if (result == null) result = caseComplexNode(rdfIriNode);
				if (result == null) result = caseRdfNode(rdfIriNode);
				if (result == null) result = caseNode(rdfIriNode);
				if (result == null) result = caseComparable(rdfIriNode);
				if (result == null) result = caseAdaptable(rdfIriNode);
				if (result == null) result = casePatternElement(rdfIriNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionrdfPackage.RDF_PATH: {
				RdfPath rdfPath = (RdfPath)theEObject;
				T result = caseRdfPath(rdfPath);
				if (result == null) result = casePatternElement(rdfPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionrdfPackage.RDF_SINGLE_PREDICATE: {
				RdfSinglePredicate rdfSinglePredicate = (RdfSinglePredicate)theEObject;
				T result = caseRdfSinglePredicate(rdfSinglePredicate);
				if (result == null) result = caseRdfPath(rdfSinglePredicate);
				if (result == null) result = casePatternElement(rdfSinglePredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionrdfPackage.RDF_NODE: {
				RdfNode rdfNode = (RdfNode)theEObject;
				T result = caseRdfNode(rdfNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionrdfPackage.RDF_LITERAL_NODE: {
				RdfLiteralNode rdfLiteralNode = (RdfLiteralNode)theEObject;
				T result = caseRdfLiteralNode(rdfLiteralNode);
				if (result == null) result = casePrimitiveNode(rdfLiteralNode);
				if (result == null) result = caseRdfNode(rdfLiteralNode);
				if (result == null) result = caseNode(rdfLiteralNode);
				if (result == null) result = caseComparable(rdfLiteralNode);
				if (result == null) result = caseAdaptable(rdfLiteralNode);
				if (result == null) result = casePatternElement(rdfLiteralNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionrdfPackage.IRI_PARAM: {
				IriParam iriParam = (IriParam)theEObject;
				T result = caseIriParam(iriParam);
				if (result == null) result = caseParameterValue(iriParam);
				if (result == null) result = caseParameter(iriParam);
				if (result == null) result = caseComparable(iriParam);
				if (result == null) result = casePatternElement(iriParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionrdfPackage.RDF_XOR: {
				RdfXor rdfXor = (RdfXor)theEObject;
				T result = caseRdfXor(rdfXor);
				if (result == null) result = caseRdfPath(rdfXor);
				if (result == null) result = casePatternElement(rdfXor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionrdfPackage.RDF_SEQUENCE: {
				RdfSequence rdfSequence = (RdfSequence)theEObject;
				T result = caseRdfSequence(rdfSequence);
				if (result == null) result = caseRdfPath(rdfSequence);
				if (result == null) result = casePatternElement(rdfSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionrdfPackage.IRI_LIST_PARAM: {
				IriListParam iriListParam = (IriListParam)theEObject;
				T result = caseIriListParam(iriListParam);
				if (result == null) result = caseParameterValue(iriListParam);
				if (result == null) result = caseParameter(iriListParam);
				if (result == null) result = caseComparable(iriListParam);
				if (result == null) result = casePatternElement(iriListParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionrdfPackage.RDF_PATH_PARAM: {
				RdfPathParam rdfPathParam = (RdfPathParam)theEObject;
				T result = caseRdfPathParam(rdfPathParam);
				if (result == null) result = caseParameter(rdfPathParam);
				if (result == null) result = caseAdaptable(rdfPathParam);
				if (result == null) result = casePatternElement(rdfPathParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionrdfPackage.RDF_PATH_PART: {
				RdfPathPart rdfPathPart = (RdfPathPart)theEObject;
				T result = caseRdfPathPart(rdfPathPart);
				if (result == null) result = casePatternElement(rdfPathPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdf Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdf Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdfPredicate(RdfPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdf Iri Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdf Iri Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdfIriNode(RdfIriNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdf Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdf Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdfPath(RdfPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdf Single Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdf Single Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdfSinglePredicate(RdfSinglePredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdf Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdf Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdfNode(RdfNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdf Literal Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdf Literal Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdfLiteralNode(RdfLiteralNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iri Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iri Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIriParam(IriParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdf Xor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdf Xor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdfXor(RdfXor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdf Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdf Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdfSequence(RdfSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iri List Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iri List Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIriListParam(IriListParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdf Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdf Path Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdfPathParam(RdfPathParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rdf Path Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rdf Path Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdfPathPart(RdfPathPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternElement(PatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptable(Adaptable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparable(qualitypatternmodel.graphstructure.Comparable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexNode(ComplexNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveNode(PrimitiveNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValue(ParameterValue object) {
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

} //AdaptionrdfSwitch
