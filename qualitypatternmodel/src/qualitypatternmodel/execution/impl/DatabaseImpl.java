/**
 */
package qualitypatternmodel.execution.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.basex.core.BaseXException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.Result;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.DatabaseImpl#getResults <em>Results</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.DatabaseImpl#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.DatabaseImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DatabaseImpl extends MinimalEObjectImpl.Container implements Database {
	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<Result> results;

	/**
	 * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatterns()
	 * @generated
	 * @ordered
	 */
	protected CompletePattern patterns;

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
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Result> getResults() {
		if (results == null) {
			results = new EObjectContainmentWithInverseEList<Result>(Result.class, this, ExecutionPackage.DATABASE__RESULTS, ExecutionPackage.RESULT__DATABASE);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompletePattern getPatterns() {
		if (patterns != null && patterns.eIsProxy()) {
			InternalEObject oldPatterns = (InternalEObject)patterns;
			patterns = (CompletePattern)eResolveProxy(oldPatterns);
			if (patterns != oldPatterns) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecutionPackage.DATABASE__PATTERNS, oldPatterns, patterns));
			}
		}
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletePattern basicGetPatterns() {
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatterns(CompletePattern newPatterns, NotificationChain msgs) {
		CompletePattern oldPatterns = patterns;
		patterns = newPatterns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionPackage.DATABASE__PATTERNS, oldPatterns, newPatterns);
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
	public void setPatterns(CompletePattern newPatterns) {
		if (newPatterns != patterns) {
			NotificationChain msgs = null;
			if (patterns != null)
				msgs = ((InternalEObject)patterns).eInverseRemove(this, PatternstructurePackage.COMPLETE_PATTERN__DATABASES, CompletePattern.class, msgs);
			if (newPatterns != null)
				msgs = ((InternalEObject)newPatterns).eInverseAdd(this, PatternstructurePackage.COMPLETE_PATTERN__DATABASES, CompletePattern.class, msgs);
			msgs = basicSetPatterns(newPatterns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.DATABASE__PATTERNS, newPatterns, newPatterns));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.DATABASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Result execute(CompletePattern pattern, String name, String person) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, BaseXException {
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
	public int countProblems(CompletePattern pattern) {
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
	public int countMatches(CompletePattern pattern) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case ExecutionPackage.DATABASE__RESULTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResults()).basicAdd(otherEnd, msgs);
			case ExecutionPackage.DATABASE__PATTERNS:
				if (patterns != null)
					msgs = ((InternalEObject)patterns).eInverseRemove(this, PatternstructurePackage.COMPLETE_PATTERN__DATABASES, CompletePattern.class, msgs);
				return basicSetPatterns((CompletePattern)otherEnd, msgs);
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
			case ExecutionPackage.DATABASE__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
			case ExecutionPackage.DATABASE__PATTERNS:
				return basicSetPatterns(null, msgs);
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
			case ExecutionPackage.DATABASE__RESULTS:
				return getResults();
			case ExecutionPackage.DATABASE__PATTERNS:
				if (resolve) return getPatterns();
				return basicGetPatterns();
			case ExecutionPackage.DATABASE__NAME:
				return getName();
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
			case ExecutionPackage.DATABASE__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends Result>)newValue);
				return;
			case ExecutionPackage.DATABASE__PATTERNS:
				setPatterns((CompletePattern)newValue);
				return;
			case ExecutionPackage.DATABASE__NAME:
				setName((String)newValue);
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
			case ExecutionPackage.DATABASE__RESULTS:
				getResults().clear();
				return;
			case ExecutionPackage.DATABASE__PATTERNS:
				setPatterns((CompletePattern)null);
				return;
			case ExecutionPackage.DATABASE__NAME:
				setName(NAME_EDEFAULT);
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
			case ExecutionPackage.DATABASE__RESULTS:
				return results != null && !results.isEmpty();
			case ExecutionPackage.DATABASE__PATTERNS:
				return patterns != null;
			case ExecutionPackage.DATABASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case ExecutionPackage.DATABASE___EXECUTE__COMPLETEPATTERN_STRING_STRING:
				try {
					return execute((CompletePattern)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.DATABASE___COUNT_PROBLEMS__COMPLETEPATTERN:
				return countProblems((CompletePattern)arguments.get(0));
			case ExecutionPackage.DATABASE___COUNT_MATCHES__COMPLETEPATTERN:
				return countMatches((CompletePattern)arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} //DatabaseImpl
