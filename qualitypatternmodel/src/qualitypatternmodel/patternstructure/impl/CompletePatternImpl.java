/**
 */
package qualitypatternmodel.patternstructure.impl;

import static qualitypatternmodel.utility.Constants.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.impl.GraphImpl;
import qualitypatternmodel.graphstructure.impl.PropertyImpl;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.operators.impl.OperatorImpl;
import qualitypatternmodel.graphstructure.impl.ElementImpl;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.parameters.impl.ParameterListImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextrepresentationPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Pattern</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#isAdaptionStarted <em>Adaption Started</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#isAdaptionFinalized <em>Adaption Finalized</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getElementCounter <em>Element Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getPropertyCounter <em>Property Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getRelationCounter <em>Relation Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getParameterCounter <em>Parameter Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getOperatorCounter <em>Operator Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getCounter <em>Counter</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CompletePatternImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompletePatternImpl extends PatternImpl implements CompletePattern {
	
	/**
	 * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The list of all <code>Parameters</code> in this <code>CompletePattern</code>
	 * They can be referenced from components of <code>Graphs</code> directly or indirectly contained in this <code>CompletePattern</code>.
	 * <!-- end-user-doc -->
	 * @see #getParameterList()
	 * @generated
	 * @ordered
	 */
	protected ParameterList parameterList;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Pattern";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!--
	 * begin-user-doc -->
	 * The user defined name of this pattern. It should describe roughly the pattern's purpose.
	 * <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The <code>Database</code> <code>this</code> was concretised for. Only relevant for concrete patterns.
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * The default value of the '{@link #isAdaptionStarted() <em>Adaption Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdaptionStarted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADAPTION_STARTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdaptionStarted() <em>Adaption Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * True if the XML adaption of <code>this</code> has been initiated by calling <code>createXMLAdaption</code>.
	 * <!-- end-user-doc -->
	 * @see #isAdaptionStarted()
	 * @generated
	 * @ordered
	 */
	protected boolean adaptionStarted = ADAPTION_STARTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isAdaptionFinalized() <em>Adaption Finalized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdaptionFinalized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADAPTION_FINALIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdaptionFinalized() <em>Adaption Finalized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * True if the XML adaption of <code>this</code> has been finalized by calling <code>finalizeXMLAdaption</code>.
	 * <!-- end-user-doc -->
	 * @see #isAdaptionFinalized()
	 * @generated
	 * @ordered
	 */
	protected boolean adaptionFinalized = ADAPTION_FINALIZED_EDEFAULT;

/**
	 * The default value of the '{@link #getElementCounter() <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELEMENT_COUNTER_EDEFAULT = new Integer(1);

/**
	 * The cached value of the '{@link #getElementCounter() <em>Element Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Elements</code>.
	 * <!-- end-user-doc -->
	 * @see #getElementCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer elementCounter = ELEMENT_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyCounter() <em>Property Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROPERTY_COUNTER_EDEFAULT = new Integer(1);

/**
	 * The cached value of the '{@link #getPropertyCounter() <em>Property Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Properties</code>.
	 * <!-- end-user-doc -->
	 * @see #getPropertyCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer propertyCounter = PROPERTY_COUNTER_EDEFAULT;

/**
	 * The default value of the '{@link #getRelationCounter() <em>Relation Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELATION_COUNTER_EDEFAULT = new Integer(1);

/**
	 * The cached value of the '{@link #getRelationCounter() <em>Relation Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Relations</code>.
	 * <!-- end-user-doc -->
	 * @see #getRelationCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer relationCounter = RELATION_COUNTER_EDEFAULT;

/**
	 * The default value of the '{@link #getParameterCounter() <em>Parameter Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PARAMETER_COUNTER_EDEFAULT = new Integer(1);

/**
	 * The cached value of the '{@link #getParameterCounter() <em>Parameter Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Parameters</code>.
	 * <!-- end-user-doc -->
	 * @see #getParameterCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer parameterCounter = PARAMETER_COUNTER_EDEFAULT;

/**
	 * The default value of the '{@link #getOperatorCounter() <em>Operator Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPERATOR_COUNTER_EDEFAULT = new Integer(1);

/**
	 * The cached value of the '{@link #getOperatorCounter() <em>Operator Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of <code>Operators</code>.
	 * <!-- end-user-doc -->
	 * @see #getOperatorCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer operatorCounter = OPERATOR_COUNTER_EDEFAULT;

/**
	 * The default value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COUNTER_EDEFAULT = new Integer(1);

/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Counter for {@link qualitypatternmodel.patternstructure.PatternElement#getInternalId internalId} of classes other than <code>Element</code>, <code>Relation</code>,
	 * <code>Property</code>, <code>Parameter</code> and <code>Operator</code>.
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected Integer counter = COUNTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternText> text;

	//	protected int[] elementCounter = {1,1,1,1,1,1};

	protected CompletePatternImpl() {
		super();
		setParameterList(new ParameterListImpl(this));
		setGraph(new GraphImpl());
		
		ElementImpl element = new ElementImpl();
		element.setGraph(getGraph());

		getGraph().getReturnElements().add(element);
		
		getInternalId();
	}	
	

	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// If adaptationFinalized is true, Pattern can only be SEMI_ABSTRACT if it is ABSTRACT.
		if ( adaptionStarted && adaptionFinalized && abstractionLevel == AbstractionLevel.SEMI_ABSTRACT )
			super.isValid(AbstractionLevel.ABSTRACT);
		else super.isValid(abstractionLevel);
		parameterList.isValid(abstractionLevel);	
		for(PatternText p : getText()) {
			p.isValid(abstractionLevel);
		}
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		super.isValidLocal(abstractionLevel);
		if (parameterList == null)
			throw new InvalidityException("variableList null" + " (" + getInternalId() + ")");
		if ( adaptionStarted && !adaptionFinalized && abstractionLevel != AbstractionLevel.SEMI_ABSTRACT )
			throw new InvalidityException("adaptation in progress (" + getInternalId() + ")");
		if ( adaptionStarted && adaptionFinalized && abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE )
			throw new InvalidityException("adaptation already finalized" + " (" + getInternalId() + ")");
	}

	@Override
	public String generateQuery() throws InvalidityException {
		String res = getParameterList().generateQuery();
		res += super.generateQuery();
		return res;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public int getNewRefNo(Class type) {
		getElementCounter();
		if (ElementImpl.class.isAssignableFrom(type)) 
			return elementCounter++;
		if (PropertyImpl.class.isAssignableFrom(type))
			return propertyCounter++;
		if (RelationImpl.class.isAssignableFrom(type))
			return relationCounter++;
		if (ParameterImpl.class.isAssignableFrom(type))
			return parameterCounter++;
		if (OperatorImpl.class.isAssignableFrom(type))
			return operatorCounter++;
			
		return counter++;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws MissingPatternContainerException 
	 * @throws OperatorCycleException 
	 * @throws InvalidityException 
	 * @generated NOT
	 */
	@Override
	public void recordValues() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
	
		isValid(AbstractionLevel.CONCRETE);
		
		if(getDatabase() instanceof XmlDataDatabase) {			
			recordValues((XmlDataDatabase) getDatabase());
		}
		// TODO: else throw exception
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public AbstractionLevel getAbstractionLevel() {
		
		try {
			isValid(AbstractionLevel.SEMI_CONCRETE);
			
			try {
				isValid(AbstractionLevel.CONCRETE);
				return AbstractionLevel.CONCRETE;
			} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e1) {
				try {
					isValid(AbstractionLevel.ABSTRACT);
					return AbstractionLevel.ABSTRACT;
				} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e2) {
					return AbstractionLevel.SEMI_CONCRETE;
				}
			}
			
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e3) {
			try {
				isValid(AbstractionLevel.SEMI_ABSTRACT);
				try {
					isValid(AbstractionLevel.GENERIC);
					return AbstractionLevel.GENERIC;
				} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e4) {
					return AbstractionLevel.SEMI_ABSTRACT;
				}
			} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e5) {
				try {
					isValid(AbstractionLevel.SEMI_GENERIC);
					return AbstractionLevel.SEMI_GENERIC;
				} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e6) {
					// pattern invalid
					return null;
				}
			}
			
		}
		
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		if(newName == null || newName.equals("")) {			
			newName = NAME_EDEFAULT;			
		}
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
	public Database getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject)database;
			database = (Database)eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.COMPLETE_PATTERN__DATABASE, oldDatabase, database));
			}
		}
		return database;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database basicGetDatabase() {
		return database;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__DATABASE, oldDatabase, newDatabase);
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
	public void setDatabase(Database newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject)database).eInverseRemove(this, ExecutionPackage.DATABASE__PATTERNS, Database.class, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, ExecutionPackage.DATABASE__PATTERNS, Database.class, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__DATABASE, newDatabase, newDatabase));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAdaptionStarted() {
		return adaptionStarted;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdaptionStarted(boolean newAdaptionStarted) {
		boolean oldAdaptionStarted = adaptionStarted;
		adaptionStarted = newAdaptionStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__ADAPTION_STARTED, oldAdaptionStarted, adaptionStarted));
	}

	@Override
	public PatternElement createXMLAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValid(AbstractionLevel.GENERIC);
		setAdaptionStarted(true);
		return super.createXMLAdaption();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAdaptionFinalized() {
		return adaptionFinalized;
	}
	

	@Override
	public void finalizeXMLAdaption() throws InvalidityException {
		setAdaptionFinalized(true);
		super.finalizeXMLAdaption();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdaptionFinalized(boolean newAdaptionFinalized) {
		boolean oldAdaptionFinalized = adaptionFinalized;
		adaptionFinalized = newAdaptionFinalized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__ADAPTION_FINALIZED, oldAdaptionFinalized, adaptionFinalized));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getElementCounter() {
		return elementCounter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementCounter(Integer newElementCounter) {
		Integer oldElementCounter = elementCounter;
		elementCounter = newElementCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER, oldElementCounter, elementCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPropertyCounter() {
		return propertyCounter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyCounter(Integer newPropertyCounter) {
		Integer oldPropertyCounter = propertyCounter;
		propertyCounter = newPropertyCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__PROPERTY_COUNTER, oldPropertyCounter, propertyCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelationCounter() {
		return relationCounter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationCounter(Integer newRelationCounter) {
		Integer oldRelationCounter = relationCounter;
		relationCounter = newRelationCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER, oldRelationCounter, relationCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getParameterCounter() {
		return parameterCounter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterCounter(Integer newParameterCounter) {
		Integer oldParameterCounter = parameterCounter;
		parameterCounter = newParameterCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER, oldParameterCounter, parameterCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOperatorCounter() {
		return operatorCounter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperatorCounter(Integer newOperatorCounter) {
		Integer oldOperatorCounter = operatorCounter;
		operatorCounter = newOperatorCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER, oldOperatorCounter, operatorCounter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCounter() {
		return counter;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCounter(Integer newCounter) {
		Integer oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COMPLETE_PATTERN__COUNTER, oldCounter, counter));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PatternText> getText() {
		if (text == null) {
			text = new EObjectContainmentWithInverseEList<PatternText>(PatternText.class, this, PatternstructurePackage.COMPLETE_PATTERN__TEXT, TextrepresentationPackage.PATTERN_TEXT__PATTERN);
		}
		return text;
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				if (parameterList != null)
					msgs = ((InternalEObject)parameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST, null, msgs);
				return basicSetParameterList((ParameterList)otherEnd, msgs);
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE:
				if (database != null)
					msgs = ((InternalEObject)database).eInverseRemove(this, ExecutionPackage.DATABASE__PATTERNS, Database.class, msgs);
				return basicSetDatabase((Database)otherEnd, msgs);
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getText()).basicAdd(otherEnd, msgs);
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
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE:
				return basicSetDatabase(null, msgs);
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
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
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				return getName();
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE:
				if (resolve) return getDatabase();
				return basicGetDatabase();
			case PatternstructurePackage.COMPLETE_PATTERN__ADAPTION_STARTED:
				return isAdaptionStarted();
			case PatternstructurePackage.COMPLETE_PATTERN__ADAPTION_FINALIZED:
				return isAdaptionFinalized();
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				return getElementCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__PROPERTY_COUNTER:
				return getPropertyCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
				return getRelationCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
				return getParameterCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
				return getOperatorCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
				return getCounter();
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				return getText();
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
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST:
				setParameterList((ParameterList)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				setName((String)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE:
				setDatabase((Database)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ADAPTION_STARTED:
				setAdaptionStarted((Boolean)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ADAPTION_FINALIZED:
				setAdaptionFinalized((Boolean)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				setElementCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__PROPERTY_COUNTER:
				setPropertyCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
				setRelationCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
				setParameterCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
				setOperatorCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
				setCounter((Integer)newValue);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends PatternText>)newValue);
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
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE:
				setDatabase((Database)null);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ADAPTION_STARTED:
				setAdaptionStarted(ADAPTION_STARTED_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ADAPTION_FINALIZED:
				setAdaptionFinalized(ADAPTION_FINALIZED_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				setElementCounter(ELEMENT_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__PROPERTY_COUNTER:
				setPropertyCounter(PROPERTY_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
				setRelationCounter(RELATION_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
				setParameterCounter(PARAMETER_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
				setOperatorCounter(OPERATOR_COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
				setCounter(COUNTER_EDEFAULT);
				return;
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				getText().clear();
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
			case PatternstructurePackage.COMPLETE_PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PatternstructurePackage.COMPLETE_PATTERN__DATABASE:
				return database != null;
			case PatternstructurePackage.COMPLETE_PATTERN__ADAPTION_STARTED:
				return adaptionStarted != ADAPTION_STARTED_EDEFAULT;
			case PatternstructurePackage.COMPLETE_PATTERN__ADAPTION_FINALIZED:
				return adaptionFinalized != ADAPTION_FINALIZED_EDEFAULT;
			case PatternstructurePackage.COMPLETE_PATTERN__ELEMENT_COUNTER:
				return ELEMENT_COUNTER_EDEFAULT == null ? elementCounter != null : !ELEMENT_COUNTER_EDEFAULT.equals(elementCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__PROPERTY_COUNTER:
				return PROPERTY_COUNTER_EDEFAULT == null ? propertyCounter != null : !PROPERTY_COUNTER_EDEFAULT.equals(propertyCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__RELATION_COUNTER:
				return RELATION_COUNTER_EDEFAULT == null ? relationCounter != null : !RELATION_COUNTER_EDEFAULT.equals(relationCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_COUNTER:
				return PARAMETER_COUNTER_EDEFAULT == null ? parameterCounter != null : !PARAMETER_COUNTER_EDEFAULT.equals(parameterCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__OPERATOR_COUNTER:
				return OPERATOR_COUNTER_EDEFAULT == null ? operatorCounter != null : !OPERATOR_COUNTER_EDEFAULT.equals(operatorCounter);
			case PatternstructurePackage.COMPLETE_PATTERN__COUNTER:
				return COUNTER_EDEFAULT == null ? counter != null : !COUNTER_EDEFAULT.equals(counter);
			case PatternstructurePackage.COMPLETE_PATTERN__TEXT:
				return text != null && !text.isEmpty();
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
			case PatternstructurePackage.COMPLETE_PATTERN___GET_NEW_REF_NO__CLASS:
				return getNewRefNo((Class)arguments.get(0));
			case PatternstructurePackage.COMPLETE_PATTERN___RECORD_VALUES:
				try {
					recordValues();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.COMPLETE_PATTERN___GET_ABSTRACTION_LEVEL:
				return getAbstractionLevel();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", adaptionStarted: ");
		result.append(adaptionStarted);
		result.append(", adaptionFinalized: ");
		result.append(adaptionFinalized);
		result.append(", elementCounter: ");
		result.append(elementCounter);
		result.append(", propertyCounter: ");
		result.append(propertyCounter);
		result.append(", relationCounter: ");
		result.append(relationCounter);
		result.append(", parameterCounter: ");
		result.append(parameterCounter);
		result.append(", operatorCounter: ");
		result.append(operatorCounter);
		result.append(", counter: ");
		result.append(counter);
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
