/**
 */
package qualitypatternmodel.functions.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.Count;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Match;
import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.functions.OperatorList;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Operator List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.impl.OperatorListImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.OperatorListImpl#getOperators <em>Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorListImpl extends PatternElementImpl implements OperatorList {
	/**
	 * The cached value of the '{@link #getOperators() <em>Operators</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<Operator> operators;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public OperatorListImpl() {
		super();
	}

	public OperatorListImpl(GraphImpl graphImpl) {
		super();
		setGraph(graphImpl);
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (getGraph() == null)
			throw new InvalidityException("OperatorList not in Graph (" + getInternalId() + ")");
		if (getGraph().getAllOperators() == null)
			throw new InvalidityException("invalid Operators of Graph" + "(" + getInternalId() + ")");

		EList<Operator> graphOps = getGraph().getAllOperators();
		if (!(graphOps.containsAll(getOperators()) && getOperators().containsAll(graphOps))) {
			String msg = "amount of operators in OperatorList not equal to amount of operators used in Graph (" + getInternalId() + "):\n";
			msg += getOperators();
			for (Operator op : graphOps) {
				msg += op.getId();
				if (!getOperators().contains(op))
					msg += "- ";
				else
					msg += "+ ";
			}
			msg += "; ";
			for (Operator op : getOperators()) {
				msg += op.getId();
				if (!getOperators().contains(op))
					msg += "- ";
				else
					msg += "+ ";
			}
			throw new InvalidityException(msg);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.OPERATOR_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operator> getOperators() {
		if (operators == null) {
			operators = new EObjectContainmentWithInverseEList<Operator>(Operator.class, this, FunctionsPackage.OPERATOR_LIST__OPERATORS, FunctionsPackage.OPERATOR__OPERATOR_LIST);
		}
		return operators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void add(Operator operator) {
		if (!getOperators().contains(operator))
			getOperators().add(operator);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getGraph() {
		if (eContainerFeatureID() != FunctionsPackage.OPERATOR_LIST__GRAPH) return null;
		return (Graph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		for(Operator op : getOperators()) {
			if(op instanceof BooleanOperator) {
				((BooleanOperator) op).getElements().clear();
			}
			if(op instanceof Count) {
				((Count) op).setArgument(null);
			}
			if(op instanceof Match) {
				((Match) op).reset();
			}
			if(op instanceof Comparison) {
				((Comparison) op).setArgument1(null);
				((Comparison) op).setArgument2(null);
				((Comparison) op).setOption(null);
			}
		}
		msgs = eBasicSetContainer((InternalEObject)newGraph, FunctionsPackage.OPERATOR_LIST__GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraph(Graph newGraph) {
		if (newGraph != eInternalContainer() || (eContainerFeatureID() != FunctionsPackage.OPERATOR_LIST__GRAPH && newGraph != null)) {
			if (EcoreUtil.isAncestor(this, newGraph))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__OPERATOR_LIST, Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.OPERATOR_LIST__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.OPERATOR_LIST__GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
			case FunctionsPackage.OPERATOR_LIST__OPERATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperators()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.OPERATOR_LIST__GRAPH:
				return basicSetGraph(null, msgs);
			case FunctionsPackage.OPERATOR_LIST__OPERATORS:
				return ((InternalEList<?>)getOperators()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FunctionsPackage.OPERATOR_LIST__GRAPH:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.GRAPH__OPERATOR_LIST, Graph.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunctionsPackage.OPERATOR_LIST__GRAPH:
				return getGraph();
			case FunctionsPackage.OPERATOR_LIST__OPERATORS:
				return getOperators();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FunctionsPackage.OPERATOR_LIST__GRAPH:
				setGraph((Graph)newValue);
				return;
			case FunctionsPackage.OPERATOR_LIST__OPERATORS:
				getOperators().clear();
				getOperators().addAll((Collection<? extends Operator>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FunctionsPackage.OPERATOR_LIST__GRAPH:
				setGraph((Graph)null);
				return;
			case FunctionsPackage.OPERATOR_LIST__OPERATORS:
				getOperators().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FunctionsPackage.OPERATOR_LIST__GRAPH:
				return getGraph() != null;
			case FunctionsPackage.OPERATOR_LIST__OPERATORS:
				return operators != null && !operators.isEmpty();
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
			case FunctionsPackage.OPERATOR_LIST___ADD__OPERATOR:
				add((Operator)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		if (getOperators().size() > 0) {
			String res = "\nOperatorList " + getInternalId() + " (";
			for (Operator operator: getOperators()) {
				res += "\n. " + operator.myToString();
			}
			return res + ")";
		}
		return "";
	}
} // OperatorListImpl
