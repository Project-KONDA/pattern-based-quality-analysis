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
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.utility.CypherSpecificConstants;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Not</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.NotConditionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotConditionImpl extends ConditionImpl implements NotCondition {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * The argument, thus the <code>Condition</code> that is negated by <code>this</code>.
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected NotConditionImpl() {
		super();
		setCondition(new TrueElementImpl());
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		if (condition != null) {
			String conQuery = condition.generateXQuery().replace("\n", "\n  "); 
			return "not(" + conQuery + ")";
		} else {
			throw new InvalidityException("invalid condition");
		}
	}
	@Override
	public int getNotSequenceSize() {
		if(getCondition() instanceof NotConditionImpl) {
			NotConditionImpl not = (NotConditionImpl) getCondition();
			return 1 + not.getNotSequenceSize();
		} else {
			return 1;
		}
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		if (condition != null) {
			if (condition instanceof NotCondition) {
				return ((NotCondition) condition).getCondition().generateSparql();
			}
//			boolean firstNot = getNotCondition() == null;
//			boolean unevenNot = getNotSequenceSize() % 2 == 1;
			boolean notForall = !(getCondition() instanceof QuantifiedCondition && ((QuantifiedCondition) getCondition()).getQuantifier() == Quantifier.FORALL);
			boolean not = notForall; // firstNot && unevenNot && 
			String query = condition.generateSparql();
			if (query.startsWith("\n"))
				query = query.substring(1);
			if(not) {
				query = "NOT " + query; 
			}
			if(!isInRdfFilter()) {
				query = "FILTER " + query;
			}
			return "\n" + query;
		} else {
			throw new InvalidityException("invalid condition");
		}
	}
	
	@Override
	public String generateCypher() throws InvalidityException {
		if (condition != null) {
			String result = null;
			if (condition instanceof NotCondition) {
				return ((NotCondition) condition).getCondition().generateCypher();
			}
			
			result = CypherSpecificConstants.BOOLEAN_OPERATOR_NOT;
			result += " (" + condition.generateCypher() + ")";
			return result;	
		}
		throw new InvalidityException("Not Condition - invalid condition");
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		
		if(condition != null) {
			condition.isValid(abstractionLevel);
		}
	}
	
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && condition == null)
			throw new InvalidityException("condition null (" + getInternalId() + ")");
	}
	
	@Override
	public boolean relationsXmlAdapted() {
		return getCondition().relationsXmlAdapted();
	}
	
	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getCondition().createXmlAdaption();
		return this;
	}
	
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getCondition().createRdfAdaption();
		return this;
	}
	
	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		getCondition().createNeo4jAdaption();
		return this;
	}
	
	@Override
	public EList<MorphismContainer> getNextMorphismContainers() throws InvalidityException {
		EList<MorphismContainer> result = new BasicEList<MorphismContainer>();
		result.addAll(getCondition().getNextMorphismContainers());
		return result;
	}	
	
	@Override
	public void prepareTranslation() {
		condition.prepareTranslation();
				
	}
	
	@Override
	public void recordValues(XmlDataDatabase database) {
		getCondition().recordValues(database);
	}

	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> parameters = new BasicEList<Parameter>();
		parameters.addAll(condition.getAllParameters());		
		return parameters;
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(getCondition());
		return patternElements;
	}
		
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.NOT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PatternstructurePackage.NOT_CONDITION__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, PatternstructurePackage.CONDITION__NOT_CONDITION, Condition.class, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, PatternstructurePackage.CONDITION__NOT_CONDITION, Condition.class, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.NOT_CONDITION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PatternstructurePackage.NOT_CONDITION__CONDITION:
				if (condition != null)
					msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PatternstructurePackage.NOT_CONDITION__CONDITION, null, msgs);
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
			case PatternstructurePackage.NOT_CONDITION__CONDITION:
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
			case PatternstructurePackage.NOT_CONDITION__CONDITION:
				return getCondition();
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
			case PatternstructurePackage.NOT_CONDITION__CONDITION:
				setCondition((Condition)newValue);
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
			case PatternstructurePackage.NOT_CONDITION__CONDITION:
				setCondition((Condition)null);
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
			case PatternstructurePackage.NOT_CONDITION__CONDITION:
				return condition != null;
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
			case PatternstructurePackage.NOT_CONDITION___GET_NOT_SEQUENCE_SIZE:
				return getNotSequenceSize();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		return "NOT " + getInternalId() + " [\n. " + condition.myToString().replace("\n", "\n. ") + "\n]";
	}
} // NotImpl
