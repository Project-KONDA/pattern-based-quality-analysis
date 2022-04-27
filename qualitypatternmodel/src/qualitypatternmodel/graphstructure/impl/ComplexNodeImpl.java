/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.adaptionxml.impl.XmlElementImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
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
	public PatternElement createXMLAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		EList<PrimitiveNode> propertiesCopy = new BasicEList<PrimitiveNode>();
		for(PrimitiveNode primitiveNode : propertiesCopy) {
			primitiveNode.createXMLAdaption();
		}
		if(!(this instanceof XmlElement) && !(this instanceof XmlRoot)) {
			XmlElement xmlElement = new XmlElementImpl();
			xmlElement.setGraphSimple(getGraph());				
			
			xmlElement.setResultOf(getResultOf());
			
			xmlElement.getPredicates().addAll(getPredicates());
			getPredicates().clear();
			
			xmlElement.getOutgoingMappings().addAll(getOutgoingMappings());
			getOutgoingMappings().clear();
			xmlElement.setIncomingMapping(getIncomingMapping());
			setIncomingMapping(null);
			
			if(getName().matches("Element [0-9]+")) {
				xmlElement.setName(getName().replace("Element", "XmlElement"));
			} else {
				xmlElement.setName(getName());
			}
			
			setResultOf(null);
			
			EList<Relation> outgoingCopy = new BasicEList<Relation>();
			if (this instanceof ComplexNode)
				outgoingCopy.addAll(((ComplexNode) this).getOutgoing());
			for(Relation relation : outgoingCopy) {
				relation.setSource(xmlElement);
			}
			
			EList<Relation> incomingCopy = new BasicEList<Relation>();
			incomingCopy.addAll(getIncoming());
			for(Relation relation : incomingCopy) {
				relation.setTarget(xmlElement);
			}
			
			xmlElement.getComparison1().addAll(getComparison1());
			getComparison1().clear();
			xmlElement.getComparison2().addAll(getComparison2());
			getComparison2().clear();	
			
			EList<PrimitiveNode> propertiesCopy2 = new BasicEList<PrimitiveNode>();
			propertiesCopy2.addAll(getProperties());
			for(PrimitiveNode primitiveNode : propertiesCopy2) {
				primitiveNode.setElement(xmlElement);
			}
			
			setGraph(null);
			
			return xmlElement;
		}
		return this;		
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
