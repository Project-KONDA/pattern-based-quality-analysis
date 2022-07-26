/**
 */
package qualitypatternmodel.adaptionrdf.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionrdf.AdaptionrdfPackage;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfLiteralNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
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
	public String generateSparql() {
		if (getPredicates().size() == 1 && getPredicates().get(0) != null && getPredicates().get(0) instanceof Comparison) {
			Comparison p = (Comparison) getPredicates().get(0);
			if (p.getArgument2() instanceof IriParam && p.getOption().getValue() == ComparisonOperator.EQUAL) {
				try {
					return p.getArgument2().generateSparql();
				} catch (InvalidityException e) {
				}
			}
		}
		return "?var" + getOriginalID();
	}
	
	
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException {
		return this;
	}

	@Override
	public Node makeGeneric() throws InvalidityException {
		throw new InvalidityException("This node can not become generic!");
	}

	@Override
	public Node makeGenericRecursive() throws InvalidityException {
		throw new InvalidityException("This node can not become generic!");
	}

	@Override
	public void checkGeneric() throws InvalidityException {
		throw new InvalidityException("This node can not become generic!");
	}

	@Override

	public ComplexNode makeComplex() throws InvalidityException {
		throw new InvalidityException("This node can not become generic!");
	}

	@Override
	public ComplexNode makeComplexRecursive() throws InvalidityException {
		throw new InvalidityException("This node can not become generic!");
	}

	@Override
	public void checkComplex() throws InvalidityException {
		throw new InvalidityException("This node can not become generic!");
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
