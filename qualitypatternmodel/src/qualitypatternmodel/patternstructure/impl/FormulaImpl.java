/**
 */
package qualitypatternmodel.patternstructure.impl;

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
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.utilityclasses.Constants;

import static qualitypatternmodel.utilityclasses.Constants.*;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondition1() <em>Condition1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition1()
	 * @generated
	 * @ordered
	 */
	protected Condition condition1;

	/**
	 * The cached value of the '{@link #getCondition2() <em>Condition2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition2()
	 * @generated
	 * @ordered
	 */
	protected Condition condition2;

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
	public String generateQuery(Location location) throws InvalidityException {
		String result = "";
		if (operator != null) {
//			if (operator == LogicalOperator.NOT) {
//				if (condition2 == null && condition != null) {
//					result = "not(" + condition.toXQuery(location) + ")";
//				} else {
//					throw new InvalidityException("invalid argument");
//				}
//			} else {
				if (condition1 != null && condition2 != null) {
					switch (operator) {
					case AND:
					case OR:
						result += "((" + condition1.generateQuery(location) + ")";
						result += "\n" + operator.getLiteral() + "\n";
						result += "(" + condition2.generateQuery(location) + "))";
						break;
					case IMPLIES:
						result += "(" + Constants.NOT + "(" + condition1.generateQuery(location) + ")";
						result += Constants.OR;
						result += "(" + condition2.generateQuery(location) + "))";
						break;
					case XOR:
						result = "(" + Constants.NOT + "(" + condition1.generateQuery(location) + ")";
						result += Constants.AND;
						result += "(" + condition2.generateQuery(location) + "))";
						result += Constants.OR;
						result += "((" + condition1.generateQuery(location) + ")";
						result += Constants.AND;
						result += Constants.NOT + "("+ condition2.generateQuery(location) + "))";
						break;
					case EQUAL:
						result += "(" + Constants.NOT + "(" + condition1.generateQuery(location) + ")";
						result += Constants.AND;
						result += Constants.NOT + "(" + condition2.generateQuery(location) + "))";
						result += Constants.OR;
						result += "((" + condition1.generateQuery(location) + ")";
						result += Constants.AND;
						result += "("+ condition2.generateQuery(location) + "))";			
						break;
					default:
						throw new InvalidityException("invalid arguments");
					}
					
				} else {
					throw new InvalidityException("invalid arguments");
				}
//			}
			
			return addMissingBrackets(result);
					
		} else {
			throw new InvalidityException("operator null");
		}
		
	}

	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);

//		if (operator == LogicalOperator.NOT) {
//			condition.isValid(isDefinedPattern);
//		} else {
			condition1.isValid(isDefinedPattern);
			condition2.isValid(isDefinedPattern);
//		}
	}

	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (operator == null)
			throw new InvalidityException("operator null" + " (" + getInternalId() + ")");
//		if (condition == null)
//			throw new InvalidityException("arguments null");
//		if (operator == LogicalOperator.NOT) {
//			if (condition2 != null || condition == null) {
//				throw new InvalidityException("argument invalid (op:NOT)");
//			}
//		} else 
		if (condition1 == null || condition2 == null) {
			throw new InvalidityException("arguments invalid" + " (" + getInternalId() + ")");
		}
	}
	
	@Override
	public PatternElement createXMLAdaption() {
		getCondition1().createXMLAdaption();
		getCondition2().createXMLAdaption();
		return this;
	}
	
	@Override
	public void finalizeXMLAdaption() {
		getCondition1().finalizeXMLAdaption();
		getCondition2().finalizeXMLAdaption();
	}
	
//	@Override	
//	public void updateParameters(ParameterList newParameterList) {
//		getCondition1().updateParameters(newParameterList);
//		getCondition2().updateParameters(newParameterList);
//	}
	
	@Override
	public EList<MorphismContainer> getNextQuantifiedConditions() throws InvalidityException {
		EList<MorphismContainer> result = new BasicEList<MorphismContainer>();
		result.addAll(getCondition1().getNextQuantifiedConditions());
		result.addAll(getCondition2().getNextQuantifiedConditions());
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
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> parameters = new BasicEList<Parameter>();
		parameters.addAll(condition1.getAllInputs());
		if(condition2 != null) {
			parameters.addAll(condition2.getAllInputs());
		}	
		return parameters;
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
	@SuppressWarnings("unchecked")
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
			case PatternstructurePackage.FORMULA__OPERATOR:
				setOperator((LogicalOperator)newValue);
				return;
			case PatternstructurePackage.FORMULA__CONDITION1:
				setCondition1((Condition)newValue);
				return;
			case PatternstructurePackage.FORMULA__CONDITION2:
				setCondition2((Condition)newValue);
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
		result.append(')');
		return result.toString();
	}
	
	@Override
	public String myToString() {
		String res = "( " + getCondition1().myToString().replace("\n", "\n. ") 
				+ "\n)\n" + getOperator().getName() + " " + getInternalId() + "\n( " + getCondition2().myToString().replace("\n", "\n. ") + "\n)";
		return res;
	}
	
} // FormulaImpl
