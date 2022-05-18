/**
 */
package qualitypatternmodel.execution.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.Result;

import qualitypatternmodel.patternstructure.CompletePattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.ResultImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.ResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.ResultImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.ResultImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.ResultImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.ResultImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.ResultImpl#getSplitResult <em>Split Result</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.ResultImpl#getProblemNumber <em>Problem Number</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.ResultImpl#getMatchNumber <em>Match Number</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.ResultImpl#getRuntime <em>Runtime</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResultImpl extends MinimalEObjectImpl.Container implements Result {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The name of <code>this</code> pattern application result.
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerson() <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The name of the person responsible for the pattern applciation.
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected String person = PERSON_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The date when the pattern application was started.
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The date when the pattern application was finished.
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * The concrete pattern whose application to <code>database</code> is represented by <code>this</code>.
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected CompletePattern pattern;

	/**
	 * The cached value of the '{@link #getSplitResult() <em>Split Result</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * The list of XML elements selected by the pattern.
	 * <!-- end-user-doc -->
	 * @see #getSplitResult()
	 * @generated
	 * @ordered
	 */
	protected EList<String> splitResult;

	/**
	 * The default value of the '{@link #getProblemNumber() <em>Problem Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PROBLEM_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProblemNumber() <em>Problem Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The number of matches of the concrete pattern in the <code>database</code>.
	 * <!-- end-user-doc -->
	 * @see #getProblemNumber()
	 * @generated
	 * @ordered
	 */
	protected int problemNumber = PROBLEM_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatchNumber() <em>Match Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int MATCH_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatchNumber() <em>Match Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The number of matches of the context <code>graph</code> of <code>pattern</code> in the <code>database</code>.
	 * <!-- end-user-doc -->
	 * @see #getMatchNumber()
	 * @generated
	 * @ordered
	 */
	protected int matchNumber = MATCH_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final long RUNTIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * The runtime of the pattern application in milliseconds.
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected long runtime = RUNTIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Database getDatabase() {
		if (eContainerFeatureID() != ExecutionPackage.RESULT__DATABASE) return null;
		return (Database)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDatabase, ExecutionPackage.RESULT__DATABASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabase(Database newDatabase) {
		if (newDatabase != eInternalContainer() || (eContainerFeatureID() != ExecutionPackage.RESULT__DATABASE && newDatabase != null)) {
			if (EcoreUtil.isAncestor(this, newDatabase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, ExecutionPackage.DATABASE__RESULTS, Database.class, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.RESULT__DATABASE, newDatabase, newDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.RESULT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerson(String newPerson) {
		String oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.RESULT__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.RESULT__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntime(long newRuntime) {
		long oldRuntime = runtime;
		runtime = newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.RESULT__RUNTIME, oldRuntime, runtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getProblemNumber() {
		return problemNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProblemNumber(int newProblemNumber) {
		int oldProblemNumber = problemNumber;
		problemNumber = newProblemNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.RESULT__PROBLEM_NUMBER, oldProblemNumber, problemNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.RESULT__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompletePattern getPattern() {
		if (pattern != null && pattern.eIsProxy()) {
			InternalEObject oldPattern = (InternalEObject)pattern;
			pattern = (CompletePattern)eResolveProxy(oldPattern);
			if (pattern != oldPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionPackage.RESULT__PATTERN, oldPattern, pattern));
			}
		}
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletePattern basicGetPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(CompletePattern newPattern) {
		CompletePattern oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.RESULT__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMatchNumber() {
		return matchNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchNumber(int newMatchNumber) {
		int oldMatchNumber = matchNumber;
		matchNumber = newMatchNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.RESULT__MATCH_NUMBER, oldMatchNumber, matchNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSplitResult() {
		if (splitResult == null) {
			splitResult = new EDataTypeUniqueEList<String>(String.class, this, ExecutionPackage.RESULT__SPLIT_RESULT);
		}
		return splitResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void export(String path) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionPackage.RESULT__DATABASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDatabase((Database)otherEnd, msgs);
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
			case ExecutionPackage.RESULT__DATABASE:
				return basicSetDatabase(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ExecutionPackage.RESULT__DATABASE:
				return eInternalContainer().eInverseRemove(this, ExecutionPackage.DATABASE__RESULTS, Database.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.RESULT__DATABASE:
				return getDatabase();
			case ExecutionPackage.RESULT__NAME:
				return getName();
			case ExecutionPackage.RESULT__PERSON:
				return getPerson();
			case ExecutionPackage.RESULT__START_DATE:
				return getStartDate();
			case ExecutionPackage.RESULT__END_DATE:
				return getEndDate();
			case ExecutionPackage.RESULT__PATTERN:
				if (resolve) return getPattern();
				return basicGetPattern();
			case ExecutionPackage.RESULT__SPLIT_RESULT:
				return getSplitResult();
			case ExecutionPackage.RESULT__PROBLEM_NUMBER:
				return getProblemNumber();
			case ExecutionPackage.RESULT__MATCH_NUMBER:
				return getMatchNumber();
			case ExecutionPackage.RESULT__RUNTIME:
				return getRuntime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutionPackage.RESULT__DATABASE:
				setDatabase((Database)newValue);
				return;
			case ExecutionPackage.RESULT__NAME:
				setName((String)newValue);
				return;
			case ExecutionPackage.RESULT__PERSON:
				setPerson((String)newValue);
				return;
			case ExecutionPackage.RESULT__START_DATE:
				setStartDate((Date)newValue);
				return;
			case ExecutionPackage.RESULT__END_DATE:
				setEndDate((Date)newValue);
				return;
			case ExecutionPackage.RESULT__PATTERN:
				setPattern((CompletePattern)newValue);
				return;
			case ExecutionPackage.RESULT__SPLIT_RESULT:
				getSplitResult().clear();
				getSplitResult().addAll((Collection<? extends String>)newValue);
				return;
			case ExecutionPackage.RESULT__PROBLEM_NUMBER:
				setProblemNumber((Integer)newValue);
				return;
			case ExecutionPackage.RESULT__MATCH_NUMBER:
				setMatchNumber((Integer)newValue);
				return;
			case ExecutionPackage.RESULT__RUNTIME:
				setRuntime((Long)newValue);
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
			case ExecutionPackage.RESULT__DATABASE:
				setDatabase((Database)null);
				return;
			case ExecutionPackage.RESULT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExecutionPackage.RESULT__PERSON:
				setPerson(PERSON_EDEFAULT);
				return;
			case ExecutionPackage.RESULT__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ExecutionPackage.RESULT__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ExecutionPackage.RESULT__PATTERN:
				setPattern((CompletePattern)null);
				return;
			case ExecutionPackage.RESULT__SPLIT_RESULT:
				getSplitResult().clear();
				return;
			case ExecutionPackage.RESULT__PROBLEM_NUMBER:
				setProblemNumber(PROBLEM_NUMBER_EDEFAULT);
				return;
			case ExecutionPackage.RESULT__MATCH_NUMBER:
				setMatchNumber(MATCH_NUMBER_EDEFAULT);
				return;
			case ExecutionPackage.RESULT__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
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
			case ExecutionPackage.RESULT__DATABASE:
				return getDatabase() != null;
			case ExecutionPackage.RESULT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExecutionPackage.RESULT__PERSON:
				return PERSON_EDEFAULT == null ? person != null : !PERSON_EDEFAULT.equals(person);
			case ExecutionPackage.RESULT__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case ExecutionPackage.RESULT__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case ExecutionPackage.RESULT__PATTERN:
				return pattern != null;
			case ExecutionPackage.RESULT__SPLIT_RESULT:
				return splitResult != null && !splitResult.isEmpty();
			case ExecutionPackage.RESULT__PROBLEM_NUMBER:
				return problemNumber != PROBLEM_NUMBER_EDEFAULT;
			case ExecutionPackage.RESULT__MATCH_NUMBER:
				return matchNumber != MATCH_NUMBER_EDEFAULT;
			case ExecutionPackage.RESULT__RUNTIME:
				return runtime != RUNTIME_EDEFAULT;
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
			case ExecutionPackage.RESULT___EXPORT__STRING:
				export((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", person: ");
		result.append(person);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", splitResult: ");
		result.append(splitResult);
		result.append(", problemNumber: ");
		result.append(problemNumber);
		result.append(", matchNumber: ");
		result.append(matchNumber);
		result.append(", runtime: ");
		result.append(runtime);
		result.append(')');
		return result.toString();
	}

} //ResultImpl
