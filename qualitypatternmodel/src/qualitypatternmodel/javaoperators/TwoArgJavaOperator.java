/**
 */
package qualitypatternmodel.javaoperators;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.graphstructure.PrimitiveNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Two Arg Java Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaoperators.TwoArgJavaOperator#getPrimitiveNodes <em>Primitive Nodes</em>}</li>
 * </ul>
 *
 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getTwoArgJavaOperator()
 * @model abstract="true"
 * @generated
 */
public interface TwoArgJavaOperator extends JavaOperator {
	/**
	 * Returns the value of the '<em><b>Primitive Nodes</b></em>' reference list.
	 * The list contents are of type {@link qualitypatternmodel.graphstructure.PrimitiveNode}.
	 * It is bidirectional and its opposite is '{@link qualitypatternmodel.graphstructure.PrimitiveNode#getTwoargjavaoperator <em>Twoargjavaoperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Nodes</em>' reference list.
	 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage#getTwoArgJavaOperator_PrimitiveNodes()
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode#getTwoargjavaoperator
	 * @model opposite="twoargjavaoperator" lower="2" upper="2"
	 * @generated
	 */
	EList<PrimitiveNode> getPrimitiveNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean apply(String param1, String param2);

} // TwoArgJavaOperator
