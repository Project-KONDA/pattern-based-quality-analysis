/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.RdfLiteralNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rdf Literal Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RdfLiteralNodeImpl extends PrimitiveNodeImpl implements RdfLiteralNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RdfLiteralNodeImpl() {
		super();
	}
	
	
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException {
		return this;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionrdfPackage.Literals.RDF_LITERAL_NODE;
	}

} //RdfLiteralNodeImpl
