/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountConditionArgument;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl#getCountPattern <em>Count Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.CountConditionImpl#getArgument2 <em>Argument2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountConditionImpl extends ConditionImpl implements CountCondition {
	/**
	 * The cached value of the '{@link #getCountPattern() <em>Count Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The first argument of the comparison.
	 * <!-- end-user-doc -->
	 * @see #getCountPattern()
	 * @generated
	 * @ordered
	 */
	protected CountPattern countPattern;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The comparison operator.
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOptionParam option;

	/**
	 * The cached value of the '{@link #getArgument2() <em>Argument2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The second argument of the comparison.
	 * <!-- end-user-doc -->
	 * @see #getArgument2()
	 * @generated
	 * @ordered
	 */
	protected CountConditionArgument argument2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected CountConditionImpl() {
		super();
		getCountPattern();
		setArgument2(new NumberElementImpl());
	}
	
	@Override
	public String generateXQuery() throws InvalidityException {
		String argument1 = getCountPattern().generateXQuery();
		String argument2 = getArgument2().generateXQuery();
		if(getOption() != null && getOption().getValue() != null) {
			return argument1 + " " + getOption().getValue() + " " + argument2;
		} else {
			throw new InvalidityException("invalid option");
		}
		
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		String argument1 = getCountPattern().generateSparql().replace("/n", "/n  ");
		String argument2 = getArgument2().generateSparql().replace("/n", "/n  ");
		
		if(getOption() != null && getOption().getValue() != null) {
			String comp = getOption().getValue().getLiteral();
			String selects = "";			
			for(Node n : getCountPattern().getGraph().getNodes()) {
				if(n.getIncomingMapping() != null) {
					selects += "\n  ?var" + n.getOriginalID();
				}
			}
			String query = "\n{SELECT";;
			query += selects;
			query += " (COUNT(*) as ?count)";
			query += "\nWHERE {";
			query += argument1.replace("\n", "\n  ");
			query += "\n}";
			query += "\nGROUP BY ";
			query += selects;
			query += "\nHAVING (?count " + comp + " " + argument2;
			query += ")\n}";
			return query;
		} else {
			throw new InvalidityException("invalid option");
		}
		
	}
	
	//BEGIN - CYPHER
	//SIMPLE CYPHER COUNT --> has many restrictions, such as that it cannot be part of another condition.
	//The second argument can not be an other COUNT-PATTERN --> Implement that --> Would lead to diverse challenges.
	/**
	 * @author Lukas Sebastian Hofmann
	 * Translates a simple count pattern. One or more count-elements can be compared to on numerical value.
	 * COUNTS in Return-Clause is not supported by the model.
	 * <b>No support</b> for <b>nested COUNT</b> Cypher v4.4 and below.
	 */
	@Override 
	public String generateCypher() throws InvalidityException {
		if (getArgument2() instanceof CountPattern) {
			throw new UnsupportedOperationException(CypherSpecificConstants.THE_CURRENT_VERSION_DOES_NOT_SUPPORT_THIS_FUNCTIONALITY);
		}
		if(getOption() != null && getOption().getValue() != null) {
			final StringBuilder cypher = new StringBuilder();
			cypher.append(getCountPattern().generateCypher());
			String tempCypher = null;
			tempCypher = generateCypherWith();
			cypher.append(tempCypher);
			tempCypher = generateCypherCountWhere();
			cypher.append(tempCypher);
			
			return cypher.toString();
		}
		throw new InvalidityException(Constants.INVALID_OPTION);
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * Creates the substring of WITH-Clause.
	 */
	private final String generateCypherWith() throws InvalidityException {
		String cypher = CypherSpecificConstants.CLAUSE_WITH + CypherSpecificConstants.ONE_WHITESPACE;
		boolean multi = false;
		String tempWith;
		tempWith = ((CountPatternImpl) getCountPattern()).generateCypherWith();
		if (!tempWith.isEmpty()) {
			cypher += tempWith;
			multi = true;
		}
		final EList<String> myCounters = ((CountPatternImpl)getCountPattern()).generateCypherCounters();
		
		for (String entry : myCounters) {
			if (multi) {
				cypher += CypherSpecificConstants.CYPHER_SEPERATOR_WITH_ONE_WITHESPACE;
			}
			cypher += entry;
			multi = true;
		}
		return cypher;
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return String
	 * @throws InvalidityException
	 * Creates the substring of the Where-Clause of the count-condition.
	 */
	private final String generateCypherCountWhere() throws InvalidityException {
		final EList<String> myCounters = ((CountPatternImpl)getCountPattern()).generateCypherCounters();
		final String comp = getOption().getValue().getLiteral();
		final StringBuilder tempCypher = new StringBuilder();
		String cypher = new String();
		
		for (String entry : myCounters) {
		    if (tempCypher.length() != 0) {
		    	tempCypher.append(CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE);
		    }
		    tempCypher.append(entry.substring(entry.indexOf(CypherSpecificConstants.CYPHER_AGGREGATION_FUNCTION_COUNT_NAMING)));				
			tempCypher.append(CypherSpecificConstants.ONE_WHITESPACE + comp + CypherSpecificConstants.ONE_WHITESPACE);
			tempCypher.append(getArgument2().generateCypher());
		}
		cypher = CypherSpecificConstants.CLAUSE_WHERE + CypherSpecificConstants.ONE_WHITESPACE + tempCypher.toString();
		
		return cypher;
	}
	//END - CYPHER
	
	@Override
	public void initializeTranslation() {
		if(getCountPattern() != null) {
			getCountPattern().initializeTranslation();
		}
		if(getArgument2() != null) {
			getArgument2().initializeTranslation();
		}
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		getCountPattern().isValid(abstractionLevel);
		if(getArgument2() != null) {
			getArgument2().isValid(abstractionLevel);
		}
		getOption().isValid(abstractionLevel);
		
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if(getCountPattern() == null) {
			throw new InvalidityException("argument1 missing");
		} 		
		if(abstractionLevel != AbstractionLevel.SEMI_GENERIC && getArgument2() == null) {
			throw new InvalidityException("argument2 missing");
		}
		if(getOption() == null) {
			throw new InvalidityException("invalid option");
		} 		
	}
	
	@Override
	public boolean relationsXmlAdapted() {
		return getCountPattern().relationsXmlAdapted() && getArgument2().relationsXmlAdapted();
	}
	
	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getCountPattern().createXmlAdaption();
		getArgument2().createXmlAdaption();
		return this;
	}
	
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getCountPattern().createRdfAdaption();
		getArgument2().createRdfAdaption();
		return this;
	}
	
	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getCountPattern().createNeo4jAdaption();
		getArgument2().createNeo4jAdaption();
		final Graph graph = getCountPattern().getGraph();
		super.setNeo4JBeginnings(graph);
		return this;
	}
	
	@Override
	public EList<MorphismContainer> getNextMorphismContainers() throws InvalidityException {		
		BasicEList<MorphismContainer> result = new BasicEList<MorphismContainer>();
		if(getCountPattern() instanceof CountPattern) {
			result.add((MorphismContainer) getCountPattern());
		}
		if(getArgument2() instanceof CountPattern) {
			result.add((MorphismContainer) getArgument2());
		}
		return result;
	}	
	
	@Override
	public void recordValues(XmlDataDatabase database) {
		getCountPattern().recordValues(database);
		getArgument2().recordValues(database);
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		if(getOption() != null) {
			res.add(getOption());
		}		
		res.addAll(getCountPattern().getAllParameters());
		res.addAll(getArgument2().getAllParameters());		
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.COUNT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountPattern getCountPattern() {
		return countPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetCountPattern(CountPattern newCountPattern, NotificationChain msgs) {		
		CountPattern oldCountPattern = countPattern;
		countPattern = newCountPattern;
		
//		if(newCountPattern != null) {
//			newCountPattern.prepareParameterUpdates(getParameterList());
//		}
//		if(oldCountPattern != null) {
//			oldCountPattern.prepareParameterUpdates(null);
//		}
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN, oldCountPattern, newCountPattern);
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
	public void setCountPattern(CountPattern newCountPattern) {
		if (newCountPattern != countPattern) {
			NotificationChain msgs = null;
			if (countPattern != null)
				msgs = ((InternalEObject)countPattern).eInverseRemove(this, PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION, CountPattern.class, msgs);
			if (newCountPattern != null)
				msgs = ((InternalEObject)newCountPattern).eInverseAdd(this, PatternstructurePackage.COUNT_PATTERN__COUNT_CONDITION, CountPattern.class, msgs);
			msgs = basicSetCountPattern(newCountPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN, newCountPattern, newCountPattern));
	}
	
	@Override
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
				
		msgs = super.basicSetPattern(newPattern, msgs);
		
		createParameters();
		createCountPattern();
		
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createParameters() {
		ParameterList parameterList = getParameterList();
		if(parameterList != null) {
			if(getOption() == null) {
				ComparisonOptionParam comparisonOption = new ComparisonOptionParamImpl();
				setOption(comparisonOption);
//				parameterList.add(comparisonOption);
			} else {
				parameterList.add(getOption());
			}		
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void createCountPattern() {
		if(getCountPattern() == null) {
			setCountPattern(new CountPatternImpl());
		}
	}

	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(getOption());
		patternElements.add(getCountPattern());
		patternElements.add(getArgument2());		
//		super.triggerParameterUpdates(newContainer, patternElements);
		setOption(null);
		return patternElements;
	}
	
	@Override
	public NotificationChain basicSetFormula1(Formula newFormula, NotificationChain msgs) {		
		msgs = super.basicSetFormula1(newFormula, msgs);		
		createParameters();
		createCountPattern();			
		return msgs;
	}
	
	@Override
	public NotificationChain basicSetFormula2(Formula newFormula, NotificationChain msgs) {		
		msgs = super.basicSetFormula2(newFormula, msgs);		
		createParameters();
		createCountPattern();		
		return msgs;
	}
	
	@Override
	public NotificationChain basicSetNotCondition(NotCondition newNotCondition, NotificationChain msgs) {
		msgs = super.basicSetNotCondition(newNotCondition, msgs);		
		createParameters();
		createCountPattern();	
		return msgs;
	}
	
	@Override 
	public NotificationChain basicSetQuantifiedCondition(QuantifiedCondition newQuantifiedCondition, NotificationChain msgs) {	
		msgs = super.basicSetQuantifiedCondition(newQuantifiedCondition, msgs);		
		createParameters();
		createCountPattern();		
		return msgs;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOptionParam getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (ComparisonOptionParam)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PatternstructurePackage.COUNT_CONDITION__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOptionParam basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOption(ComparisonOptionParam newOption, NotificationChain msgs) {
		ComparisonOptionParam oldOption = option;
		
		ParameterList varlist = getParameterList();
		if(varlist != null) {
			varlist.remove(oldOption);			
			varlist.add(newOption);
		}
		
		option = newOption;
		
		if(option != null) {
			option.getOptions().clear();
			option.getOptions().addAll(ComparisonOperator.VALUES);
		}
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__OPTION, oldOption, newOption);
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
	public void setOption(ComparisonOptionParam newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS, ComparisonOptionParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS, ComparisonOptionParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountConditionArgument getArgument2() {
		return argument2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetArgument2(CountConditionArgument newArgument2, NotificationChain msgs) {		
		CountConditionArgument oldArgument2 = argument2;
		argument2 = newArgument2;
		
//		if(newArgument2 != null) {
//			newArgument2.prepareParameterUpdates(getParameterList());
//		}
//		if(oldArgument2 != null) {
//			oldArgument2.prepareParameterUpdates(null);
//		}
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__ARGUMENT2, oldArgument2, newArgument2);
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
	public void setArgument2(CountConditionArgument newArgument2) {
		if (newArgument2 != argument2) {
			NotificationChain msgs = null;
			if (argument2 != null)
				msgs = ((InternalEObject)argument2).eInverseRemove(this, PatternstructurePackage.COUNT_CONDITION_ARGUMENT__COUNT_CONDITION2, CountConditionArgument.class, msgs);
			if (newArgument2 != null)
				msgs = ((InternalEObject)newArgument2).eInverseAdd(this, PatternstructurePackage.COUNT_CONDITION_ARGUMENT__COUNT_CONDITION2, CountConditionArgument.class, msgs);
			msgs = basicSetArgument2(newArgument2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.COUNT_CONDITION__ARGUMENT2, newArgument2, newArgument2));
	}

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN:
				if (countPattern != null)
					msgs = ((InternalEObject)countPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN, null, msgs);
				return basicSetCountPattern((CountPattern)otherEnd, msgs);
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.COMPARISON_OPTION_PARAM__COUNT_CONDITIONS, ComparisonOptionParam.class, msgs);
				return basicSetOption((ComparisonOptionParam)otherEnd, msgs);
			case PatternstructurePackage.COUNT_CONDITION__ARGUMENT2:
				if (argument2 != null)
					msgs = ((InternalEObject)argument2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.COUNT_CONDITION__ARGUMENT2, null, msgs);
				return basicSetArgument2((CountConditionArgument)otherEnd, msgs);
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
			case PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN:
				return basicSetCountPattern(null, msgs);
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				return basicSetOption(null, msgs);
			case PatternstructurePackage.COUNT_CONDITION__ARGUMENT2:
				return basicSetArgument2(null, msgs);
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
			case PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN:
				return getCountPattern();
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case PatternstructurePackage.COUNT_CONDITION__ARGUMENT2:
				return getArgument2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN:
				setCountPattern((CountPattern)newValue);
				return;
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				setOption((ComparisonOptionParam)newValue);
				return;
			case PatternstructurePackage.COUNT_CONDITION__ARGUMENT2:
				setArgument2((CountConditionArgument)newValue);
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
			case PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN:
				setCountPattern((CountPattern)null);
				return;
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				setOption((ComparisonOptionParam)null);
				return;
			case PatternstructurePackage.COUNT_CONDITION__ARGUMENT2:
				setArgument2((CountConditionArgument)null);
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
			case PatternstructurePackage.COUNT_CONDITION__COUNT_PATTERN:
				return countPattern != null;
			case PatternstructurePackage.COUNT_CONDITION__OPTION:
				return option != null;
			case PatternstructurePackage.COUNT_CONDITION__ARGUMENT2:
				return argument2 != null;
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
			case PatternstructurePackage.COUNT_CONDITION___CREATE_PARAMETERS:
				createParameters();
				return null;
			case PatternstructurePackage.COUNT_CONDITION___CREATE_COUNT_PATTERN:
				createCountPattern();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		String res = "CountCondition [" + getInternalId() + "]";
		res += " " + getOption().getValue().getLiteral() + " [" + getOption().getInternalId() + "]";
		res += ("\n" + getCountPattern().myToString()).replace("\n", "\n#  ");
		res += ("\n" + getArgument2().myToString()).replace("\n", "\n#  ");
		return res;
	}

} //CountComparisonImpl