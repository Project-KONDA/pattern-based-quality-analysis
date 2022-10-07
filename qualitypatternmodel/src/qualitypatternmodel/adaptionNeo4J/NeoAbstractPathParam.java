/**
 */
package qualitypatternmodel.adaptionNeo4J;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.parameters.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neo Abstract Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage#getNeoAbstractPathParam()
 * @model abstract="true"
 * @generated
 */
public interface NeoAbstractPathParam extends Parameter, Adaptable {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getCypherReturnVariable() throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="qualitypatternmodel.patternstructure.InvalidityExceptionWrapper"
	 * @generated
	 */
	String getReturnInnerEdgeNodes() throws InvalidityException;
} // NeoAbstractPathParam
