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
import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.javaquery.impl.NotFilterPartImpl;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.MorphismContainer;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.utility.ConstantsNeo;
import qualitypatternmodel.utility.ConstantsRdf;

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
		setCondition(null);
	}

	@Override
	public JavaFilterPart generateQueryFilterPart() throws InvalidityException{
		return new NotFilterPartImpl((BooleanFilterPart) getCondition().generateQueryFilterPart());
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		if (getCondition() instanceof NotCondition) {
			if (((NotCondition) getCondition()).getCondition() == null)
				return "true()";
			return ((NotCondition) getCondition()).getCondition().generateXQuery();
		}
		if (condition == null)
			return "false()";
		String conQuery = getCondition().generateXQuery().replace("\n", "\n  ");
		return "not(" + conQuery + ")";
	}

	@Override
	public String generateXQueryJava() throws InvalidityException {
		if (getCondition() instanceof NotCondition) {
			return ((NotCondition) getCondition()).getCondition().generateXQuery();
		}
		if (getCondition() == null)
			return "false()";
		String conQuery = getCondition().generateXQueryJava();
		if (conQuery.equals("")) {
			return "";
		}
		conQuery = conQuery.replace("\n", "\n  ");
		return "not(" + conQuery + ")";
	}

	@Override
	public String generateXQueryJavaReturn() throws InvalidityException {
		if (getCondition() == null)
			return null;
		return getCondition().generateXQueryJavaReturn();
	}

	@Override
	public int getNotSequenceSize() {
		if (getCondition() instanceof NotConditionImpl) {
			NotConditionImpl not = (NotConditionImpl) getCondition();
			return 1 + not.getNotSequenceSize();
		} else {
			return 1;
		}
	}

	@Override
	public String generateSparql() throws InvalidityException {
		if (getCondition() instanceof NotCondition) {
			return ((NotCondition) condition).getCondition().generateSparql();
		}
//		boolean firstNot = getNotCondition() == null;
//		boolean unevenNot = getNotSequenceSize() % 2 == 1;
		boolean notForall = !(getCondition() instanceof QuantifiedCondition && ((QuantifiedCondition) getCondition()).getQuantifier() == Quantifier.FORALL);
		boolean not = notForall; // firstNot && unevenNot &&
		if (getCondition() == null)
			return "";
		String query = getCondition().generateSparql();
		if (query.equals("")) {
			return "";
		}
		if (query.startsWith("\n")) {
			query = query.substring(1);
		}
		if(not) {
			query = ConstantsRdf.NOT + query;
		}
		if(!isInRdfFilter()) {
			query = ConstantsRdf.FILTER + query;
		}
		return "\n" + query;
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * Negates a Condition and negates it.
	 * <b>No support</b> for <b>nested COUNT</b> Cypher v4.4 and below.
	 */
	//BEGIN - NEO4J
	@Override
	public String generateCypher() throws InvalidityException {
		super.checkNextConditon(getCondition());
		String cypher = new String();
		if (getCondition() instanceof NotCondition) {
			Condition c = ((NotCondition) getCondition()).getCondition();
			if (c == null)
				return "";
			else 
				return c.generateCypher();
		}

		//In future Versions this should be reduced
		//Until now we have one the options that FORALL gets true or the TrueElement is there
		//The framework misses constrains
		
		String temp = "";
		if (getCondition() != null)
			temp = getCondition().generateCypher();
		if (temp.isEmpty()) {
			return ConstantsNeo.BOOLEAN_FALSE;
		}
		cypher = ConstantsNeo.BOOLEAN_OPERATOR_NOT + ConstantsNeo.ONE_WHITESPACE;
		cypher += ConstantsNeo.SIGNLE_OPENING_ROUND_BRACKET + temp + ConstantsNeo.SIGNLE_CLOSING_ROUND_BRACKET;
		return cypher;
	}
	//END - NEO4J

	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		super.isValid(abstractionLevel);
		if (getCondition() != null) {
			getCondition().isValid(abstractionLevel);
		}
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
	}

	@Override
	public boolean relationsXmlAdapted() {
		if (getCondition() == null)
			return true;
		return getCondition().relationsXmlAdapted();
	}

	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getCondition() != null)
			getCondition().createXmlAdaption();
		return this;
	}

	@Override
	public PatternElement createRdfAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getCondition() != null)
			getCondition().createRdfAdaption();
		return this;
	}

	@Override
	public PatternElement createNeo4jAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getCondition() != null)
			getCondition().createNeo4jAdaption();
		return this;
	}

	@Override
	public EList<MorphismContainer> getNextMorphismContainers() throws InvalidityException {
		EList<MorphismContainer> result = new BasicEList<MorphismContainer>();
		if (getCondition() != null)
			result.addAll(getCondition().getNextMorphismContainers());
		return result;
	}

	@Override
	public void prepareTranslation() {
		if (getCondition() != null)
			getCondition().prepareTranslation();
	}

	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		if (getCondition() == null)
			return new BasicEList<Parameter>();
		return getCondition().getAllParameters();
	}

	@Override
	public EList<Operator> getAllOperators() throws InvalidityException {
		if (getCondition() == null)
			return new BasicEList<Operator>();
		return condition.getAllOperators();
	}

	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		if (getCondition() != null)
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
		if (getCondition() == null)
			return "NOT " + " [\n. TRUE\n]";
		return "NOT " + " [\n. " + condition.myToString().replace("\n", "\n. ") + "\n]";
	}
} // NotImpl
