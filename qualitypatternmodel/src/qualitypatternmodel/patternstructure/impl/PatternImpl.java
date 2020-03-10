/**
 */
package qualitypatternmodel.patternstructure.impl;

import static qualitypatternmodel.utilityclasses.Constants.*;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.graphstructure.impl.SingleElementImpl;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.VariableList;
import qualitypatternmodel.inputfields.impl.VariableListImpl;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getVariableList <em>Variable List</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#isCheckMorphismOfNextGraph <em>Check Morphism Of Next Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getReturnGraph <em>Return Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getElementCounter <em>Element Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternImpl extends PatternElementImpl implements Pattern {
	/**
	 * The cached value of the '{@link #getVariableList() <em>Variable List</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVariableList()
	 * @generated
	 * @ordered
	 */
	protected VariableList variableList;

	/**
	 * The cached setting delegate for the '{@link #isCheckMorphismOfNextGraph() <em>Check Morphism Of Next Graph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckMorphismOfNextGraph()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE = ((EStructuralFeature.Internal)PatternstructurePackage.Literals.PATTERN__CHECK_MORPHISM_OF_NEXT_GRAPH).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getReturnGraph() <em>Return Graph</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReturnGraph()
	 * @generated
	 * @ordered
	 */
	protected Graph returnGraph;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The default value of the '{@link #getElementCounter() <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElementCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEMENT_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElementCounter() <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElementCounter()
	 * @generated
	 * @ordered
	 */
	protected int elementCounter = ELEMENT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	protected PatternImpl() {
		super();
		setReturnGraph(new GraphImpl());
		getReturnGraph().setRootElement(new SingleElementImpl());
		SingleElementImpl returnElement = new SingleElementImpl();
		returnElement.setPrevious(getReturnGraph().getRootElement());
		getReturnGraph().getReturnElements().add(returnElement);

		setVariableList(new VariableListImpl(this));
		getShortPatternInternalId();
	}

	@Override
	public void isValid(boolean isDefinedPattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);
		variableList.isValid(isDefinedPattern);
		returnGraph.isValid(isDefinedPattern);
		condition.isValid(isDefinedPattern);
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (variableList == null)
			throw new InvalidityException("variableList null" + " (" + getShortPatternInternalId() + ")");
		if (returnGraph == null)
			throw new InvalidityException("returnGraph null" + " (" + getShortPatternInternalId() + ")");
		if (condition == null)
			throw new InvalidityException("condition null" + " (" + getShortPatternInternalId() + ")");
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		String res = getVariableList().toXQuery(location);

		if (returnGraph.getReturnElements() == null || returnGraph.getReturnElements().isEmpty()) {
			throw new InvalidityException("return elements missing");
		}
		res += returnGraph.toXQuery(Location.RETURN);

		res += WHERE + condition.toXQuery(Location.OUTSIDE); // TODO: schachteln!

		res += RETURN + "(";
		EList<SingleElement> returnElements = returnGraph.getReturnElements();
		for (int i = 0; i < returnElements.size(); i++) {
			if (i != 0)
				res += ", ";
			res += VARIABLE + returnElements.get(i).getOriginalID();
		}
		return res + ")";
	}

	public String toXQuery() throws InvalidityException {
		return toXQuery(Location.OUTSIDE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public int getNewRefNo() {
		return elementCounter++;
	}

	@Override
	public void prepareTranslation() {
		returnGraph.prepareTranslation();
		condition.prepareTranslation();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList<Input> getAllInputs() throws InvalidityException {
		EList<Input> inputs = returnGraph.getAllInputs();
		if (condition != null)
			inputs.addAll(condition.getAllInputs());
		return inputs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.PATTERN;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph getReturnGraph() {
		return returnGraph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetReturnGraph(Graph newReturnGraph, NotificationChain msgs) {
		if(getReturnGraph() != null) {
			getReturnGraph().setMorphismFrom(null);
			getReturnGraph().getMorphismTo().clear();
		}
		Graph oldReturnGraph = returnGraph;
		returnGraph = newReturnGraph;
		if (returnGraph != null) {
			returnGraph.setReturnGraph(true);
			returnGraph.setGraphDepth(0);
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternstructurePackage.PATTERN__RETURN_GRAPH, oldReturnGraph, newReturnGraph);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnGraph(Graph newReturnGraph) {
		if (newReturnGraph != returnGraph) {
			NotificationChain msgs = null;
			if (returnGraph != null)
				msgs = ((InternalEObject)returnGraph).eInverseRemove(this, GraphstructurePackage.GRAPH__PATTERN, Graph.class, msgs);
			if (newReturnGraph != null)
				msgs = ((InternalEObject)newReturnGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__PATTERN, Graph.class, msgs);
			msgs = basicSetReturnGraph(newReturnGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__RETURN_GRAPH, newReturnGraph, newReturnGraph));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (condition != null) {
			condition.setCondDepth(1);
		}
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PatternstructurePackage.PATTERN__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, PatternstructurePackage.CONDITION__PATTERN, Condition.class, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, PatternstructurePackage.CONDITION__PATTERN, Condition.class, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getElementCounter() {
		return elementCounter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementCounter(int newElementCounter) {
		int oldElementCounter = elementCounter;
		elementCounter = newElementCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__ELEMENT_COUNTER, oldElementCounter, elementCounter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableList getVariableList() {
		return variableList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableList(VariableList newVariableList, NotificationChain msgs) {
		VariableList oldVariableList = variableList;
		variableList = newVariableList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__VARIABLE_LIST, oldVariableList, newVariableList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableList(VariableList newVariableList) {
		if (newVariableList != variableList) {
			NotificationChain msgs = null;
			if (variableList != null)
				msgs = ((InternalEObject)variableList).eInverseRemove(this, InputfieldsPackage.VARIABLE_LIST__PATTERN, VariableList.class, msgs);
			if (newVariableList != null)
				msgs = ((InternalEObject)newVariableList).eInverseAdd(this, InputfieldsPackage.VARIABLE_LIST__PATTERN, VariableList.class, msgs);
			msgs = basicSetVariableList(newVariableList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__VARIABLE_LIST, newVariableList, newVariableList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckMorphismOfNextGraph() {
		return (Boolean)CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
				if (variableList != null)
					msgs = ((InternalEObject)variableList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__VARIABLE_LIST, null, msgs);
				return basicSetVariableList((VariableList)otherEnd, msgs);
			case PatternstructurePackage.PATTERN__RETURN_GRAPH:
				if (returnGraph != null)
					msgs = ((InternalEObject)returnGraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__RETURN_GRAPH, null, msgs);
				return basicSetReturnGraph((Graph)otherEnd, msgs);
			case PatternstructurePackage.PATTERN__CONDITION:
				if (condition != null)
					msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__CONDITION, null, msgs);
				return basicSetCondition((Condition)otherEnd, msgs);
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
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
				return basicSetVariableList(null, msgs);
			case PatternstructurePackage.PATTERN__RETURN_GRAPH:
				return basicSetReturnGraph(null, msgs);
			case PatternstructurePackage.PATTERN__CONDITION:
				return basicSetCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
				return getVariableList();
			case PatternstructurePackage.PATTERN__CHECK_MORPHISM_OF_NEXT_GRAPH:
				return isCheckMorphismOfNextGraph();
			case PatternstructurePackage.PATTERN__RETURN_GRAPH:
				return getReturnGraph();
			case PatternstructurePackage.PATTERN__CONDITION:
				return getCondition();
			case PatternstructurePackage.PATTERN__ELEMENT_COUNTER:
				return getElementCounter();
			case PatternstructurePackage.PATTERN__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
				setVariableList((VariableList)newValue);
				return;
			case PatternstructurePackage.PATTERN__RETURN_GRAPH:
				setReturnGraph((Graph)newValue);
				return;
			case PatternstructurePackage.PATTERN__CONDITION:
				setCondition((Condition)newValue);
				return;
			case PatternstructurePackage.PATTERN__ELEMENT_COUNTER:
				setElementCounter((Integer)newValue);
				return;
			case PatternstructurePackage.PATTERN__NAME:
				setName((String)newValue);
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
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
				setVariableList((VariableList)null);
				return;
			case PatternstructurePackage.PATTERN__RETURN_GRAPH:
				setReturnGraph((Graph)null);
				return;
			case PatternstructurePackage.PATTERN__CONDITION:
				setCondition((Condition)null);
				return;
			case PatternstructurePackage.PATTERN__ELEMENT_COUNTER:
				setElementCounter(ELEMENT_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.PATTERN__NAME:
				setName(NAME_EDEFAULT);
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
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
				return variableList != null;
			case PatternstructurePackage.PATTERN__CHECK_MORPHISM_OF_NEXT_GRAPH:
				return CHECK_MORPHISM_OF_NEXT_GRAPH__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case PatternstructurePackage.PATTERN__RETURN_GRAPH:
				return returnGraph != null;
			case PatternstructurePackage.PATTERN__CONDITION:
				return condition != null;
			case PatternstructurePackage.PATTERN__ELEMENT_COUNTER:
				return elementCounter != ELEMENT_COUNTER_EDEFAULT;
			case PatternstructurePackage.PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PatternstructurePackage.PATTERN___TO_XQUERY:
				try {
					return toXQuery();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN___GET_NEW_REF_NO:
				return getNewRefNo();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (elementCounter: ");
		result.append(elementCounter);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = "Pattern " + getShortPatternInternalId() + " " + name +" ("; 
		res += getVariableList().myToString().replace("\n", "\n. ");
		res += "\n. " + getReturnGraph().myToString().replace("\n", "\n. ");
		res += "\n. " + getCondition().myToString().replace("\n", "\n. ") + "\n)";
		return res;
	}

} // PatternImpl
