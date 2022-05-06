/**
 */
package qualitypatternmodel.adaptionxml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qualitypatternmodel.adaptionxml.*;

import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;

import qualitypatternmodel.parameters.Parameter;
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
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage
 * @generated
 */
public class AdaptionxmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdaptionxmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptionxmlSwitch() {
		if (modelPackage == null) {
			modelPackage = AdaptionxmlPackage.eINSTANCE;
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
			case AdaptionxmlPackage.XML_ELEMENT: {
				XmlElement xmlElement = (XmlElement)theEObject;
				T result = caseXmlElement(xmlElement);
				if (result == null) result = caseComplexNode(xmlElement);
				if (result == null) result = caseNode(xmlElement);
				if (result == null) result = caseComparable(xmlElement);
				if (result == null) result = caseAdaptable(xmlElement);
				if (result == null) result = casePatternElement(xmlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionxmlPackage.XML_ELEMENT_NAVIGATION: {
				XmlElementNavigation xmlElementNavigation = (XmlElementNavigation)theEObject;
				T result = caseXmlElementNavigation(xmlElementNavigation);
				if (result == null) result = caseRelation(xmlElementNavigation);
				if (result == null) result = caseAdaptable(xmlElementNavigation);
				if (result == null) result = casePatternElement(xmlElementNavigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionxmlPackage.XML_REFERENCE: {
				XmlReference xmlReference = (XmlReference)theEObject;
				T result = caseXmlReference(xmlReference);
				if (result == null) result = caseRelation(xmlReference);
				if (result == null) result = caseAdaptable(xmlReference);
				if (result == null) result = casePatternElement(xmlReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionxmlPackage.XML_PROPERTY: {
				XmlProperty xmlProperty = (XmlProperty)theEObject;
				T result = caseXmlProperty(xmlProperty);
				if (result == null) result = casePrimitiveNode(xmlProperty);
				if (result == null) result = caseNode(xmlProperty);
				if (result == null) result = caseComparable(xmlProperty);
				if (result == null) result = caseAdaptable(xmlProperty);
				if (result == null) result = casePatternElement(xmlProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionxmlPackage.XML_ROOT: {
				XmlRoot xmlRoot = (XmlRoot)theEObject;
				T result = caseXmlRoot(xmlRoot);
				if (result == null) result = caseComplexNode(xmlRoot);
				if (result == null) result = caseNode(xmlRoot);
				if (result == null) result = caseComparable(xmlRoot);
				if (result == null) result = caseAdaptable(xmlRoot);
				if (result == null) result = casePatternElement(xmlRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionxmlPackage.XML_PROPERTY_NAVIGATION: {
				XmlPropertyNavigation xmlPropertyNavigation = (XmlPropertyNavigation)theEObject;
				T result = caseXmlPropertyNavigation(xmlPropertyNavigation);
				if (result == null) result = caseRelation(xmlPropertyNavigation);
				if (result == null) result = caseAdaptable(xmlPropertyNavigation);
				if (result == null) result = casePatternElement(xmlPropertyNavigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionxmlPackage.AXIS_OPTION_PARAM: {
				AxisOptionParam axisOptionParam = (AxisOptionParam)theEObject;
				T result = caseAxisOptionParam(axisOptionParam);
				if (result == null) result = caseParameter(axisOptionParam);
				if (result == null) result = casePatternElement(axisOptionParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM: {
				PropertyOptionParam propertyOptionParam = (PropertyOptionParam)theEObject;
				T result = casePropertyOptionParam(propertyOptionParam);
				if (result == null) result = caseParameter(propertyOptionParam);
				if (result == null) result = caseAdaptable(propertyOptionParam);
				if (result == null) result = casePatternElement(propertyOptionParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionxmlPackage.PATH_PARAM: {
				PathParam pathParam = (PathParam)theEObject;
				T result = casePathParam(pathParam);
				if (result == null) result = caseAdaptable(pathParam);
				if (result == null) result = caseParameter(pathParam);
				if (result == null) result = casePatternElement(pathParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdaptionxmlPackage.AXIS_PAIR: {
				AxisPair axisPair = (AxisPair)theEObject;
				T result = caseAxisPair(axisPair);
				if (result == null) result = caseAdaptable(axisPair);
				if (result == null) result = casePatternElement(axisPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlElement(XmlElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Element Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Element Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlElementNavigation(XmlElementNavigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlReference(XmlReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlProperty(XmlProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlRoot(XmlRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Property Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Property Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXmlPropertyNavigation(XmlPropertyNavigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axis Option Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis Option Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxisOptionParam(AxisOptionParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Option Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Option Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyOptionParam(PropertyOptionParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathParam(PathParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Axis Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Axis Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAxisPair(AxisPair object) {
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

} //AdaptionxmlSwitch
