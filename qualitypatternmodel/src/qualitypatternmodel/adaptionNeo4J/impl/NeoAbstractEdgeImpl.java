/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoAbstractEdge;
import qualitypatternmodel.graphstructure.impl.RelationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Abstract Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NeoAbstractEdgeImpl extends RelationImpl implements NeoAbstractEdge {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoAbstractEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_ABSTRACT_EDGE;
	}

} //NeoAbstractEdgeImpl
