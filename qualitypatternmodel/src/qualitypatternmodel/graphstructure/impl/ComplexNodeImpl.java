/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.impl.XmlElementImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.ComplexNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexNodeImpl extends NodeImpl implements ComplexNode {
	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexNodeImpl() {
		super();
	}

	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return adaptAsXmlElement();
	}

	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return createRdfAdaption();
	}
	
	@Override
	public XmlProperty adaptAsXmlProperty() throws InvalidityException {
		if(isTypeModifiable()) {
			return super.adaptAsXmlProperty();
		} else {
			throw new InvalidityException("This ComplexNode cannot be adapted as an XmlProperty");
		}
	}
	
	@Override
	public XmlElement adaptAsXmlElement() throws InvalidityException {
		XmlElement xmlElement = super.adaptAsXmlElement();
		if(xmlElement instanceof XmlElementImpl) {
			((XmlElementImpl) xmlElement).typeModifiable = false;
		}
		return xmlElement;
	}
	
	@Override
	public void checkComparisonConsistency(Comparison comp) throws InvalidityException {
		if(comp == null || comp.getOption() == null) {
			return;
		}
		Node otherElement = null;
		if(comp.getArgument1().equals(this)) {
			Comparable argument2 = comp.getArgument2();
			if(argument2 instanceof Node) {
				otherElement = (Node) argument2;
			}
		} else if(comp.getArgument2().equals(this)) {
			Comparable argument1 = comp.getArgument1();
			if(argument1 instanceof Node) {
				otherElement = (Node) argument1;
			}
		} else {
			return;
		}
		if(otherElement == null) {
			return;
		}
		ComparisonOperator op = comp.getOption().getValue();
		if(op != ComparisonOperator.EQUAL && op != ComparisonOperator.NOTEQUAL) {
			return;
		}
		EList<Node> equivalentToThis = getEquivalentNodes();
		EList<Node> equivalentToOther = otherElement.getEquivalentNodes();		
		
		for(Node e : equivalentToThis) {
			for(Comparison comp1 : e.getComparison1()) {
				if(!comp.equals(comp1)) {
					if(equivalentToOther.contains(comp1.getArgument2())) {
						ComparisonOperator otherOp = comp1.getOption().getValue();
						if(op == ComparisonOperator.EQUAL && otherOp == ComparisonOperator.NOTEQUAL || op == ComparisonOperator.NOTEQUAL && otherOp == ComparisonOperator.EQUAL) {
							throw new InvalidityException("Requiring that two elements are equal and unequal will always yield false");
						}
					}
				}
			}
			for(Comparison comp2 : e.getComparison2()) {
				if(!comp.equals(comp2)) {
					if(equivalentToOther.contains(comp2.getArgument1())) {
						ComparisonOperator otherOp = comp2.getOption().getValue();
						if(op == ComparisonOperator.EQUAL && otherOp == ComparisonOperator.NOTEQUAL || op == ComparisonOperator.NOTEQUAL && otherOp == ComparisonOperator.EQUAL) {
							throw new InvalidityException("Requiring that two elements are equal and unequal will always yield false");
						}
					}
				}
			}
		}
		
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.COMPLEX_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, GraphstructurePackage.COMPLEX_NODE__OUTGOING, GraphstructurePackage.RELATION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.COMPLEX_NODE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphstructurePackage.COMPLEX_NODE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphstructurePackage.COMPLEX_NODE__OUTGOING:
				return getOutgoing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphstructurePackage.COMPLEX_NODE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Relation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphstructurePackage.COMPLEX_NODE__OUTGOING:
				getOutgoing().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphstructurePackage.COMPLEX_NODE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexNodeImpl
