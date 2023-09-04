/**
 */
package qualitypatternmodel.patternstructure.impl;

import static qualitypatternmodel.utility.Constants.*;

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
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Formula</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.FormulaImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.FormulaImpl#getCondition1 <em>Condition1</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.FormulaImpl#getCondition2 <em>Condition2</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.FormulaImpl#isClamped <em>Clamped</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormulaImpl extends ConditionImpl implements Formula {

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalOperator OPERATOR_EDEFAULT = LogicalOperator.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The <code>LogicalOperator</code> that defines <code>this</code> <code>Formula</code>.
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondition1() <em>Condition1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The first argument.
	 * <!-- end-user-doc -->
	 * @see #getCondition1()
	 * @generated
	 * @ordered
	 */
	protected Condition condition1;

	/**
	 * The cached value of the '{@link #getCondition2() <em>Condition2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The second argument.
	 * <!-- end-user-doc -->
	 * @see #getCondition2()
	 * @generated
	 * @ordered
	 */
	protected Condition condition2;
	
/**
	 * The default value of the '{@link #isClamped() <em>Clamped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClamped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLAMPED_EDEFAULT = false;

    

	/**
	 * The cached value of the '{@link #isClamped() <em>Clamped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClamped()
	 * @generated
	 * @ordered
	 */
	protected boolean clamped = CLAMPED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected FormulaImpl() {
		super();
		setCondition1(new TrueElementImpl());
		setCondition2(new TrueElementImpl());
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		String result = "";
		if (operator != null) {
			if (condition1 != null && condition2 != null) {
				
				String condition1Query = condition1.generateXQuery();
				String condition2Query = condition2.generateXQuery();
				
				switch (operator) {
				case AND:
				case OR:
					result += "((" + condition1Query + ")";
					result += "\n" + operator.getLiteral() + "\n";
					result += "(" + condition2Query + "))";
					break;
				case IMPLIES:
					result += "(" + Constants.NOT + "(" + condition1Query + ")";
					result += Constants.OR;
					result += "(" + condition2Query + "))";
					break;
				case XOR:					
					result = "(" + Constants.NOT + "(" + condition1Query + "))";
					result += " = ";
					result += "(" + condition2Query + ")";				
					break;
				case EQUAL:					
					result = "(" + condition1Query + ")";
					result += " = ";
					result += "(" + condition2Query + ")";					
					break;
				default:
					throw new InvalidityException("invalid arguments");
				}
				
			} else {
				throw new InvalidityException("invalid arguments");
			}
			
			return addMissingBrackets(result);
					
		} else {
			throw new InvalidityException("operator null");
		}
		
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		String result = "";
		if (operator != null) {
			if (condition1 != null && condition2 != null) {
				
				String condition1Query = condition1.generateSparql().substring(1);
				String condition2Query = condition2.generateSparql();
				
				if(operator != LogicalOperator.AND && !isInRdfFilter()) {
					result += "\nFILTER ";
				}
				
				switch (operator) {
				case AND:
					result += condition1Query + condition2Query;
					break;
				case OR:
					result += "(" + condition1Query + " || " + condition2Query + ")";
					break;
				case IMPLIES:
					result += "( NOT " + condition1Query + " || " + condition2Query + " )";
					break;
				case XOR:			
					result += "(" + condition1Query + " != " + condition2Query + ")";
					break;
				case EQUAL:	
					result += "(" + condition1Query + " = " + condition2Query + ")";
					break;
				default:
					throw new InvalidityException("invalid arguments");
				}
				
			} else {
				throw new InvalidityException("invalid arguments");
			}
			
			return addMissingBrackets(result);
			
		} else {
			throw new InvalidityException("operator null");
		}
	}
	
	//BEGIN - Neo4J
	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * Implements all framework operators into existing or non existing Neo4J-Operators. Moreover, it considers if something should be clamped or not. 
	 * <i>AND, OR, XOR, IMPLIES, EQUALS<\i>.
	 */
	@Override 
	public String generateCypher() throws InvalidityException {
		super.checkNextConditon(getCondition1());
		super.checkNextConditon(getCondition2());
		
		if (this.operator != null) {
			StringBuilder cypher = new StringBuilder();
			if (this.condition1 != null && this.condition2 != null) {
				String condition1Query = condition1.generateCypher();
				//If the generated Condition isBlank (Cases: TrueElement, FORALL [true])
				if (condition1Query.isBlank()) {
					condition1Query = CypherSpecificConstants.BOOLEAN_TRUE;
				} else {
					StringBuilder temp = new StringBuilder(condition1Query);
					super.addWhiteSpacesForPreviewsCondition(temp, CypherSpecificConstants.THREE_WHITESPACES);
					condition1Query = temp.toString();
				}
				
				//If the generated Condition isBlank (Cases: TrueElement, FORALL [true])
				String condition2Query = condition2.generateCypher();
				if (condition1Query.isBlank()) {
					condition2Query = CypherSpecificConstants.BOOLEAN_TRUE;
				} else {
					StringBuilder temp = new StringBuilder(condition2Query);
					super.addWhiteSpacesForPreviewsCondition(temp, CypherSpecificConstants.THREE_WHITESPACES);
					condition2Query = temp.toString();
				}
				
				//For cypher there are less Boolean Operators
				switch (operator) {
				case AND:
					cypher.append(condition1Query);
					cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_PREFIX + CypherSpecificConstants.BOOLEAN_OPERATOR_AND);
					cypher.append(CypherSpecificConstants.ONE_WHITESPACE + condition2Query);
					break;
				case OR:
					cypher.append(condition1Query);
					cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_PREFIX + CypherSpecificConstants.BOOLEAN_OPERATOR_OR);
					cypher.append(CypherSpecificConstants.ONE_WHITESPACE + condition2Query);
					break;
				case XOR:
					//XOR is between the EXISTS-FUNCTION NOT POSSIBLE
					cypher.append(CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + condition1Query);
					cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_PREFIX + CypherSpecificConstants.BOOLEAN_OPERATOR_AND);
					cypher.append(CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.BOOLEAN_OPERATOR_NOT + CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + condition2Query + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
					cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_PREFIX + CypherSpecificConstants.BOOLEAN_OPERATOR_OR + CypherSpecificConstants.ONE_WHITESPACE);
					cypher.append(CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + CypherSpecificConstants.BOOLEAN_OPERATOR_NOT + CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + condition1Query + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
					cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_PREFIX + CypherSpecificConstants.BOOLEAN_OPERATOR_AND);
					cypher.append(CypherSpecificConstants.ONE_WHITESPACE + condition2Query + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
					break;
				case IMPLIES:
					cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_NOT + CypherSpecificConstants.ONE_WHITESPACE + CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + condition1Query + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
					cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_PREFIX + CypherSpecificConstants.BOOLEAN_OPERATOR_AND);
					cypher.append(CypherSpecificConstants.ONE_WHITESPACE + condition2Query);
					break;
				case EQUAL:
					cypher.append(CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + condition1Query + CypherSpecificConstants.BOOLEAN_OPERATOR_PREFIX + CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE + condition2Query + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
					cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_PREFIX + CypherSpecificConstants.BOOLEAN_OPERATOR_OR + CypherSpecificConstants.ONE_WHITESPACE);
					cypher.append(CypherSpecificConstants.BOOLEAN_OPERATOR_NOT + CypherSpecificConstants.ONE_WHITESPACE);
					cypher.append(CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET + condition1Query + CypherSpecificConstants.BOOLEAN_OPERATOR_PREFIX + CypherSpecificConstants.BOOLEAN_OPERATOR_AND + CypherSpecificConstants.ONE_WHITESPACE + condition2Query + CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
					break;
				default:
					throw new InvalidityException(Constants.INVALID_OPERATOR);
				}
			} else {
				throw new InvalidityException(Constants.INVALID_ARGUMENTS);
			}
			if (this.clamped) {
				cypher.insert(0, CypherSpecificConstants.SIGNLE_OPENING_ROUND_BRACKET);
				cypher.append(CypherSpecificConstants.SIGNLE_CLOSING_ROUND_BRACKET);
			}
			return cypher.toString();
		}
		throw new InvalidityException(Constants.OPERATOR_NULL);
	}
	//END - Neo4J

	@Override
	public void initializeTranslation() {

		if(getCondition1() != null) {
			getCondition1().initializeTranslation();
		}
		if(getCondition2() != null) {
			getCondition2().initializeTranslation();
		}
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		
		if(condition1 != null) {
			condition1.isValid(abstractionLevel);
		}
		if(condition2 != null) {
			condition2.isValid(abstractionLevel);
		}
	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (operator == null) {
			throw new InvalidityException("operator null" + " (" + getInternalId() + ")");
		}
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && (condition1 == null || condition2 == null)) {
			throw new InvalidityException("arguments invalid" + " (" + getInternalId() + ")");
		}
	}
	
	@Override
	public boolean relationsXmlAdapted() {
		return getCondition1().relationsXmlAdapted() && getCondition2().relationsXmlAdapted();
	}
	
	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getCondition1().createXmlAdaption();
		getCondition2().createXmlAdaption();
		return this;
	}
	
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getCondition1().createRdfAdaption();
		getCondition2().createRdfAdaption();
		return this;
	}
	
	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getCondition1().createNeo4jAdaption();
		getCondition2().createNeo4jAdaption();
		return this;
	}
	
	@Override
	public EList<MorphismContainer> getNextMorphismContainers() throws InvalidityException {
		EList<MorphismContainer> result = new BasicEList<MorphismContainer>();
		result.addAll(getCondition1().getNextMorphismContainers());
		result.addAll(getCondition2().getNextMorphismContainers());
		return result;
	}

	@Override
	public void prepareTranslation() {
		condition1.prepareTranslation();
		if(condition2 != null) {
			condition2.prepareTranslation();
		}		
	}
	
	@Override
	public void recordValues(XmlDataDatabase database) {
		getCondition1().recordValues(database);
		getCondition2().recordValues(database);
	}

	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> parameters = new BasicEList<Parameter>();
		parameters.addAll(condition1.getAllParameters());
		if(condition2 != null) {
			parameters.addAll(condition2.getAllParameters());
		}	
		return parameters;
	}

	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(getCondition1());
		patternElements.add(getCondition2());
		return patternElements;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.FORMULA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.FORMULA__CONDITION1:
				if (condition1 != null)
					msgs = ((InternalEObject)condition1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.FORMULA__CONDITION1, null, msgs);
				return basicSetCondition1((Condition)otherEnd, msgs);
			case PatternstructurePackage.FORMULA__CONDITION2:
				if (condition2 != null)
					msgs = ((InternalEObject)condition2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.FORMULA__CONDITION2, null, msgs);
				return basicSetCondition2((Condition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(LogicalOperator newOperator) {
		LogicalOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.FORMULA__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition getCondition1() {
		return condition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition1(Condition newCondition1, NotificationChain msgs) {
		Condition oldCondition1 = condition1;
		condition1 = newCondition1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.FORMULA__CONDITION1, oldCondition1, newCondition1);
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
	public void setCondition1(Condition newCondition1) {
		if (newCondition1 != condition1) {
			NotificationChain msgs = null;
			if (condition1 != null)
				msgs = ((InternalEObject)condition1).eInverseRemove(this, PatternstructurePackage.CONDITION__FORMULA1, Condition.class, msgs);
			if (newCondition1 != null)
				msgs = ((InternalEObject)newCondition1).eInverseAdd(this, PatternstructurePackage.CONDITION__FORMULA1, Condition.class, msgs);
			msgs = basicSetCondition1(newCondition1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.FORMULA__CONDITION1, newCondition1, newCondition1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition getCondition2() {
		return condition2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition2(Condition newCondition2, NotificationChain msgs) {
		Condition oldCondition2 = condition2;
		condition2 = newCondition2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.FORMULA__CONDITION2, oldCondition2, newCondition2);
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
	public void setCondition2(Condition newCondition2) {
		if (newCondition2 != condition2) {
			NotificationChain msgs = null;
			if (condition2 != null)
				msgs = ((InternalEObject)condition2).eInverseRemove(this, PatternstructurePackage.CONDITION__FORMULA2, Condition.class, msgs);
			if (newCondition2 != null)
				msgs = ((InternalEObject)newCondition2).eInverseAdd(this, PatternstructurePackage.CONDITION__FORMULA2, Condition.class, msgs);
			msgs = basicSetCondition2(newCondition2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.FORMULA__CONDITION2, newCondition2, newCondition2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isClamped() {
		return clamped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClamped(boolean newClamped) {
		boolean oldClamped = clamped;
		clamped = newClamped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.FORMULA__CLAMPED, oldClamped, clamped));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.FORMULA__CONDITION1:
				return basicSetCondition1(null, msgs);
			case PatternstructurePackage.FORMULA__CONDITION2:
				return basicSetCondition2(null, msgs);
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
			case PatternstructurePackage.FORMULA__OPERATOR:
				return getOperator();
			case PatternstructurePackage.FORMULA__CONDITION1:
				return getCondition1();
			case PatternstructurePackage.FORMULA__CONDITION2:
				return getCondition2();
			case PatternstructurePackage.FORMULA__CLAMPED:
				return isClamped();
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
			case PatternstructurePackage.FORMULA__OPERATOR:
				setOperator((LogicalOperator)newValue);
				return;
			case PatternstructurePackage.FORMULA__CONDITION1:
				setCondition1((Condition)newValue);
				return;
			case PatternstructurePackage.FORMULA__CONDITION2:
				setCondition2((Condition)newValue);
				return;
			case PatternstructurePackage.FORMULA__CLAMPED:
				setClamped((Boolean)newValue);
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
			case PatternstructurePackage.FORMULA__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case PatternstructurePackage.FORMULA__CONDITION1:
				setCondition1((Condition)null);
				return;
			case PatternstructurePackage.FORMULA__CONDITION2:
				setCondition2((Condition)null);
				return;
			case PatternstructurePackage.FORMULA__CLAMPED:
				setClamped(CLAMPED_EDEFAULT);
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
			case PatternstructurePackage.FORMULA__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case PatternstructurePackage.FORMULA__CONDITION1:
				return condition1 != null;
			case PatternstructurePackage.FORMULA__CONDITION2:
				return condition2 != null;
			case PatternstructurePackage.FORMULA__CLAMPED:
				return clamped != CLAMPED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(", clamped: ");
		result.append(clamped);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public String myToString() {
		String res = "( " + getCondition1().myToString().replace("\n", "\n. ") + "\n)\n"; 
//		res += getOperator().getName() + " " + getInternalId(); 
		res += getOperator().getName();
		res += "\n( " + getCondition2().myToString().replace("\n", "\n. ") + "\n)";
		return res;
	}
	
} // FormulaImpl
