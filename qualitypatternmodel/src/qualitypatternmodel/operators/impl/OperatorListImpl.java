/**
 */
package qualitypatternmodel.operators.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

/**
 * <!-- begin-user-doc --> 
 * An implementation of the model object '<em><b>Operator List</b></em>'. 
 * Container to all Operators in a Graph. * 
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.impl.OperatorListImpl#getGraph <em>Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.OperatorListImpl#getOperators <em>Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorListImpl extends PatternElementImpl implements OperatorList {
	/**
	 * The cached value of the '{@link #getOperators() <em>Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * List of all <code>Operator</code>s referenced from within the container <code>graph</code>.
	 * <!-- end-user-doc -->
	 * @see #getOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<Operator> operators;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 */
	public OperatorListImpl() {
		super();
	}

	public OperatorListImpl(GraphImpl graphImpl) {
		super();
		setGraph(graphImpl);
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (getGraph() == null)
			throw new InvalidityException("OperatorList not in Graph (" + getInternalId() + ")");
		if (getGraph().getAllOperators() == null)
			throw new InvalidityException("invalid Operators of Graph" + "(" + getInternalId() + ")");

		if(abstractionLevel != AbstractionLevel.SEMI_GENERIC) {
			EList<Operator> graphOps = getGraph().getAllOperators();
			EList<Operator> opList = getGraph().getAllOperators();
			if (!(graphOps.containsAll(opList) && opList.containsAll(graphOps))) {
				String msg = "Amount of operators in OperatorList [" + getInternalId() + "] not equal to amount of operators used in Graph [" + getGraph().getInternalId() + "]:\n";
				msg += opList;
				msg += "\n";
				for (Operator op : graphOps) {
					if (!opList.contains(op))
						msg += "Missing in Operator List: ";
					msg += op.myToString();
				}
				msg += "\n";
				for (Operator op : opList) {
					if (!graphOps.contains(op))
						msg += "Missing in getAllOperators: ";
					msg += op.myToString();
				}
				throw new InvalidityException(msg);
			}
		}
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		for(Operator operator : getOperators()) {
			patternElements.add(operator);
		}
		return patternElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatorsPackage.Literals.OPERATOR_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operator> getOperators() {
		if (operators == null) {
			operators = new EObjectContainmentWithInverseEList<Operator>(Operator.class, this, OperatorsPackage.OPERATOR_LIST__OPERATORS, OperatorsPackage.OPERATOR__OPERATOR_LIST);
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
		if (eContainerFeatureID() != OperatorsPackage.OPERATOR_LIST__GRAPH) return null;
		return (Graph)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		triggerParameterUpdates(newGraph);
//		for(Operator op : getOperators()) {
//			if(op instanceof BooleanOperator) {
//				((BooleanOperator) op).getElements().clear();
//			}
//			if(op instanceof Match) {
//				((Match) op).reset();
//			}
//			if(op instanceof Comparison) {
//				((Comparison) op).reset();		
//			}
//		}
		msgs = eBasicSetContainer((InternalEObject)newGraph, OperatorsPackage.OPERATOR_LIST__GRAPH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraph(Graph newGraph) {
		if (newGraph != eInternalContainer() || (eContainerFeatureID() != OperatorsPackage.OPERATOR_LIST__GRAPH && newGraph != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.OPERATOR_LIST__GRAPH, newGraph, newGraph));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperatorsPackage.OPERATOR_LIST__GRAPH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGraph((Graph)otherEnd, msgs);
			case OperatorsPackage.OPERATOR_LIST__OPERATORS:
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
			case OperatorsPackage.OPERATOR_LIST__GRAPH:
				return basicSetGraph(null, msgs);
			case OperatorsPackage.OPERATOR_LIST__OPERATORS:
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
			case OperatorsPackage.OPERATOR_LIST__GRAPH:
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
			case OperatorsPackage.OPERATOR_LIST__GRAPH:
				return getGraph();
			case OperatorsPackage.OPERATOR_LIST__OPERATORS:
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
			case OperatorsPackage.OPERATOR_LIST__GRAPH:
				setGraph((Graph)newValue);
				return;
			case OperatorsPackage.OPERATOR_LIST__OPERATORS:
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
			case OperatorsPackage.OPERATOR_LIST__GRAPH:
				setGraph((Graph)null);
				return;
			case OperatorsPackage.OPERATOR_LIST__OPERATORS:
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
			case OperatorsPackage.OPERATOR_LIST__GRAPH:
				return getGraph() != null;
			case OperatorsPackage.OPERATOR_LIST__OPERATORS:
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
			case OperatorsPackage.OPERATOR_LIST___ADD__OPERATOR:
				add((Operator)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		if (getOperators().size() > 0) {
			String res = "\nOperatorList [" + getInternalId() + "]";
			for (Operator operator: getOperators()) {
				res += "\n- " + operator.myToString();
			}
			return res;
		}
		return "";
	}
} // OperatorListImpl
