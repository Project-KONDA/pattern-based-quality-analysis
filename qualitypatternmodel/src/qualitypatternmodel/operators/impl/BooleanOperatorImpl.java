/**
 */
package qualitypatternmodel.operators.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.impl.BooleanOperatorImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BooleanOperatorImpl extends OperatorImpl implements BooleanOperator {

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	private EMap<Node,Integer> elementCount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanOperatorImpl() {
		super();
	}
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		if (getComparison1().isEmpty() && getComparison2().isEmpty()) {
			// this is root operator, thus does not serve as an argument to another operator
			EList<Node> arguments = getAllArgumentElements();
			if (!arguments.containsAll(nodes)) {
				throw new InvalidityException("invalid predicate owner" + " (" + getInternalId() + ")");
			}
			if (!nodes.containsAll(arguments)) {
				throw new InvalidityException("invalid predicate argument" + " (" + getInternalId() + ")");
			}
		} else {
			// this serves as an argument to another operator
			if(!nodes.isEmpty()) {
				throw new InvalidityException("invalid predicate owner" + " (" + getInternalId() + ")");
			}
		}
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.BOOLEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatorsPackage.Literals.BOOLEAN_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectWithInverseResolvingEList.ManyInverse<Node>(Node.class, this, OperatorsPackage.BOOLEAN_OPERATOR__NODES, GraphstructurePackage.NODE__PREDICATES);
		}
		return nodes;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addElement(Node node) {
		if(getElementCount().containsKey(node)) {
			getElementCount().put(node, getElementCount().get(node)+1);
		} else {
			getElementCount().put(node, 1);
		}
		if(!getNodes().contains(node)) {
			getNodes().add(node);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void removeElement(Node node) {
		if(getElementCount().containsKey(node)) {
			if(getElementCount().get(node) == 1) {
				getNodes().remove(node);
				getElementCount().removeKey(node);
			} else {
				getElementCount().put(node, getElementCount().get(node)-1);
			}
		}
	}

	@Override
	abstract public Node getElement();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain basicSetOperatorList(OperatorList newOperatorList, NotificationChain msgs) {
		if(getOperatorList() != null && !getOperatorList().equals(newOperatorList)) {
			getNodes().clear();
		}
		msgs = super.basicSetOperatorList(newOperatorList, msgs);
		createParameters();
		return msgs;
	}

	@Override
	abstract public void createParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperatorsPackage.BOOLEAN_OPERATOR__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
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
			case OperatorsPackage.BOOLEAN_OPERATOR__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
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
			case OperatorsPackage.BOOLEAN_OPERATOR__NODES:
				return getNodes();
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
			case OperatorsPackage.BOOLEAN_OPERATOR__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
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
			case OperatorsPackage.BOOLEAN_OPERATOR__NODES:
				getNodes().clear();
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
			case OperatorsPackage.BOOLEAN_OPERATOR__NODES:
				return nodes != null && !nodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OperatorsPackage.BOOLEAN_OPERATOR___CREATE_PARAMETERS:
				createParameters();
				return null;
			case OperatorsPackage.BOOLEAN_OPERATOR___ADD_ELEMENT__NODE:
				addElement((Node)arguments.get(0));
				return null;
			case OperatorsPackage.BOOLEAN_OPERATOR___REMOVE_ELEMENT__NODE:
				removeElement((Node)arguments.get(0));
				return null;
			case OperatorsPackage.BOOLEAN_OPERATOR___GET_ELEMENT:
				return getElement();
		}
		return super.eInvoke(operationID, arguments);
	}

	private EMap<Node, Integer> getElementCount() {
		if(elementCount == null) {
			elementCount = new BasicEMap<Node, Integer>();
		}
		return elementCount;
	}

} //BooleanOperatorImpl
