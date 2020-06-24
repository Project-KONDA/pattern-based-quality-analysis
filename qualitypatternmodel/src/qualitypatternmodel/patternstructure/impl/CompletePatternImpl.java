/**
 */
package qualitypatternmodel.patternstructure.impl;

import static qualitypatternmodel.utilityclasses.Constants.*;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.graphstructure.impl.ElementImpl;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ParameterListImpl;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getElementCounter <em>Element Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getDatabases <em>Databases</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getQuery <em>Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompletePatternImpl extends PatternImpl implements CompletePattern {
	/**
	 * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getParameterList()
	 * @generated
	 * @ordered
	 */
	protected ParameterList parameterList;

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
	 * The cached value of the '{@link #getDatabases() <em>Databases</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabases()
	 * @generated
	 * @ordered
	 */
	protected Database databases;

	/**
	 * The default value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuery()
	 * @generated
	 * @ordered
	 */
	protected String query = QUERY_EDEFAULT;

	protected CompletePatternImpl() {
		super();
		setParameterList(new ParameterListImpl(this));
		setGraph(new GraphImpl());
		
		ElementImpl element = new ElementImpl();
		element.setGraph(getGraph());
//		getGraph().setRootElement(rootElement);
//		ElementImpl returnElement = new ElementImpl();
//		returnElement.setGraph(getGraph());
////		returnElement.setPreviousElement(getGraph().getRootElement());
		getGraph().getReturnElements().add(element);
		element.setName("First");
//		returnElement.setName("Return");
//		
//		Relation relation = new RelationImpl();
//		relation.setGraph(getGraph());
//		relation.setSource(rootElement);
//		relation.setTarget(returnElement);
		
		getInternalId();
	}	
	

	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		parameterList.isValid(abstractionLevel);		
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		super.isValidLocal(abstractionLevel);
		if (parameterList == null)
			throw new InvalidityException("variableList null" + " (" + getInternalId() + ")");
	}

	@Override
	public String generateQuery() throws InvalidityException {
		String res = getParameterList().generateQuery();
		res += super.generateQuery();
		return res;
	}

	@Override
	public PatternElement createXMLAdaption() {
		getGraph().createXMLAdaption();
		getCondition().createXMLAdaption();
		return this;
	}
	
	@Override
	public void finalizeXMLAdaption() {
		getGraph().finalizeXMLAdaption();
		getCondition().finalizeXMLAdaption();
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.COMPLETE_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterList getParameterList() {
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs) {
		ParameterList oldParameterList = parameterList;
		parameterList = newParameterList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST, oldParameterList, newParameterList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterList(ParameterList newParameterList) {
		if (newParameterList != parameterList) {
			NotificationChain msgs = null;
			if (parameterList != null)
				msgs = ((InternalEObject)parameterList).eInverseRemove(this, ParametersPackage.PARAMETER_LIST__PATTERN, ParameterList.class, msgs);
			if (newParameterList != null)
				msgs = ((InternalEObject)newParameterList).eInverseAdd(this, ParametersPackage.PARAMETER_LIST__PATTERN, ParameterList.class, msgs);
			msgs = basicSetParameterList(newParameterList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST, newParameterList, newParameterList));
	}

	public Graph getGraph() {
		return graph;
	}

	public void setGraph(Graph newGraph) {
		if (newGraph != graph) {
			NotificationChain msgs = null;
			if (graph != null)
				msgs = ((InternalEObject)graph).eInverseRemove(this, GraphstructurePackage.GRAPH__PATTERN, Graph.class, msgs);
			if (newGraph != null)
				msgs = ((InternalEObject)newGraph).eInverseAdd(this, GraphstructurePackage.GRAPH__PATTERN, Graph.class, msgs);
			msgs = basicSetGraph(newGraph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__GRAPH, newGraph, newGraph));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER, oldElementCounter, elementCounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database getDatabases() {
		if (databases != null && databases.eIsProxy()) {
			InternalEObject oldDatabases = (InternalEObject)databases;
			databases = (Database)eResolveProxy(oldDatabases);
			if (databases != oldDatabases) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.COMPLETE_PATTERN__DATABASES, oldDatabases, databases));
			}
		}
		return databases;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database basicGetDatabases() {
		return databases;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabases(Database newDatabases, NotificationChain msgs) {
		Database oldDatabases = databases;
		databases = newDatabases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__DATABASES, oldDatabases, newDatabases);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabases(Database newDatabases) {
		if (newDatabases != databases) {
			NotificationChain msgs = null;
			if (databases != null)
				msgs = ((InternalEObject)databases).eInverseRemove(this, ExecutionPackage.DATABASE__PATTERNS, Database.class, msgs);
			if (newDatabases != null)
				msgs = ((InternalEObject)newDatabases).eInverseAdd(this, ExecutionPackage.DATABASE__PATTERNS, Database.class, msgs);
			msgs = basicSetDatabases(newDatabases, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__DATABASES, newDatabases, newDatabases));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuery() {
		return query;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuery(String newQuery) {
		String oldQuery = query;
		query = newQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__QUERY, oldQuery, query));
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				if (parameterList != null)
					msgs = ((InternalEObject)parameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST, null, msgs);
				return basicSetParameterList((ParameterList)otherEnd, msgs);
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASES:
				if (databases != null)
					msgs = ((InternalEObject)databases).eInverseRemove(this, ExecutionPackage.DATABASE__PATTERNS, Database.class, msgs);
				return basicSetDatabases((Database)otherEnd, msgs);
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				return basicSetParameterList(null, msgs);
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASES:
				return basicSetDatabases(null, msgs);
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				return getParameterList();
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				return getElementCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				return getName();
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASES:
				if (resolve) return getDatabases();
				return basicGetDatabases();
			case PatternstructurePackage.COMPLETE_PATTERN__QUERY:
				return getQuery();
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				setParameterList((ParameterList)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				setElementCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				setName((String)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASES:
				setDatabases((Database)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__QUERY:
				setQuery((String)newValue);
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				setParameterList((ParameterList)null);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				setElementCounter(ELEMENT_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASES:
				setDatabases((Database)null);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__QUERY:
				setQuery(QUERY_EDEFAULT);
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				return parameterList != null;
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				return elementCounter != ELEMENT_COUNTER_EDEFAULT;
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASES:
				return databases != null;
			case PatternstructurePackage.COMPLETE_PATTERN__QUERY:
				return QUERY_EDEFAULT == null ? query != null : !QUERY_EDEFAULT.equals(query);
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
			case PatternstructurePackage.COMPLETE_PATTERN___GET_NEW_REF_NO:
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
		result.append(", query: ");
		result.append(query);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = "Pattern [" + getInternalId() + "] " + name; 
		res += "\n  " + getGraph().myToString().replace("\n", "\n  ");
		res += "\n  " + getCondition().myToString().replace("\n", "\n  ");
		res += getParameterList().myToString().replace("\n", "\n  ");
		return res;
	}

} // PatternImpl
