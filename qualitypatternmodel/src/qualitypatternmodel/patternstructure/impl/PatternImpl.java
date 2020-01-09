/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.InvalidTranslationException;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.TranslationLocation;

import qualitypatternmodel.patternstructure.VariableList;
import static utilityclasses.Constants.*;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getReturnGraph <em>Return Graph</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternImpl#getVariableList <em>Variable List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternImpl extends PatternElementImpl implements Pattern {
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
	 * The cached value of the '{@link #getVariableList() <em>Variable List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableList()
	 * @generated
	 * @ordered
	 */
	protected VariableList variableList;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}
	
	public void isValid(boolean isDefinedPattern) throws InvalidTranslationException{
		this.isValid(isDefinedPattern, Location.OUTSIDE);
	}

	@Override
	public void isValid(boolean isDefinedPattern, Location loc) throws InvalidTranslationException {
		if (variableList == null) 
			throw new InvalidTranslationException("variableList null");
		variableList.isValid(isDefinedPattern, loc);
		if (returnGraph == null)
			throw new InvalidTranslationException("returnGraph null");
		returnGraph.isValid(isDefinedPattern, Location.RETURN);
		if (condition == null)
			throw new InvalidTranslationException("condition null");
		condition.isValid(isDefinedPattern, loc);
	}

	@Override
	public String toXQuery(TranslationLocation translationLocation) throws InvalidTranslationException {
		String returnVariables = "(";
		for (SingleElement returnElement : returnGraph.getReturnElements()) {
			returnVariables += "" + VARIABLE + returnElement.getId() + ", ";
		}
		returnVariables = returnVariables.substring(0, returnVariables.length() - 2);
		returnVariables += ")";
		return returnGraph.toXQuery(Location.RETURN) + "\nwhere "
				+ condition.toXQuery(Location.OUTSIDE) + "\nreturn " + returnVariables;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Input> getAllVariables() throws InvalidTranslationException {
		EList<Input> inputs = returnGraph.getAllVariables();
		inputs.addAll(condition.getAllVariables());
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
	public Graph getReturnGraph() {
		return returnGraph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnGraph(Graph newReturnGraph, NotificationChain msgs) {
		Graph oldReturnGraph = returnGraph;
		returnGraph = newReturnGraph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__RETURN_GRAPH, oldReturnGraph, newReturnGraph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnGraph(Graph newReturnGraph) {
		if (newReturnGraph != returnGraph) {
			NotificationChain msgs = null;
			if (returnGraph != null)
				msgs = ((InternalEObject)returnGraph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__RETURN_GRAPH, null, msgs);
			if (newReturnGraph != null)
				msgs = ((InternalEObject)newReturnGraph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__RETURN_GRAPH, null, msgs);
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
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableList getVariableList() {
		return variableList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableList(VariableList newVariableList) {
		if (newVariableList != variableList) {
			NotificationChain msgs = null;
			if (variableList != null)
				msgs = ((InternalEObject)variableList).eInverseRemove(this, PatternstructurePackage.VARIABLE_LIST__PATTERN, VariableList.class, msgs);
			if (newVariableList != null)
				msgs = ((InternalEObject)newVariableList).eInverseAdd(this, PatternstructurePackage.VARIABLE_LIST__PATTERN, VariableList.class, msgs);
			msgs = basicSetVariableList(newVariableList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN__VARIABLE_LIST, newVariableList, newVariableList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
				if (variableList != null)
					msgs = ((InternalEObject)variableList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.PATTERN__VARIABLE_LIST, null, msgs);
				return basicSetVariableList((VariableList)otherEnd, msgs);
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
			case PatternstructurePackage.PATTERN__RETURN_GRAPH:
				return basicSetReturnGraph(null, msgs);
			case PatternstructurePackage.PATTERN__CONDITION:
				return basicSetCondition(null, msgs);
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
				return basicSetVariableList(null, msgs);
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
			case PatternstructurePackage.PATTERN__RETURN_GRAPH:
				return getReturnGraph();
			case PatternstructurePackage.PATTERN__CONDITION:
				return getCondition();
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
				return getVariableList();
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
			case PatternstructurePackage.PATTERN__RETURN_GRAPH:
				setReturnGraph((Graph)newValue);
				return;
			case PatternstructurePackage.PATTERN__CONDITION:
				setCondition((Condition)newValue);
				return;
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
				setVariableList((VariableList)newValue);
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
			case PatternstructurePackage.PATTERN__RETURN_GRAPH:
				setReturnGraph((Graph)null);
				return;
			case PatternstructurePackage.PATTERN__CONDITION:
				setCondition((Condition)null);
				return;
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
				setVariableList((VariableList)null);
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
			case PatternstructurePackage.PATTERN__RETURN_GRAPH:
				return returnGraph != null;
			case PatternstructurePackage.PATTERN__CONDITION:
				return condition != null;
			case PatternstructurePackage.PATTERN__VARIABLE_LIST:
				return variableList != null;
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
			case PatternstructurePackage.PATTERN___IS_VALID__BOOLEAN:
				try {
					isValid((Boolean)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} // PatternImpl
