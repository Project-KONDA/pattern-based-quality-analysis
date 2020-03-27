/**
 */
package qualitypatternmodel.patternstructure;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.graphstructure.Graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Container</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see qualitypatternmodel.patternstructure.PatternstructurePackage#getMorphismContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MorphismContainer extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Morphism getMorphism();

} // GraphContainer
