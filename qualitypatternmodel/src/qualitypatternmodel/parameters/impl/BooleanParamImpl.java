/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.lang.Boolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.OneArgJavaOperator;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.NullCheck;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.ParameterList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean</b></em>'.
 * A parameter of type <code>Boolean</code>.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.BooleanParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.BooleanParamImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.BooleanParamImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.BooleanParamImpl#getNullCheck <em>Null Check</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.BooleanParamImpl#getOneArgJavaOperator <em>One Arg Java Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanParamImpl extends ParameterValueImpl implements BooleanParam {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated NOT
	 * @ordered
	 */
	protected static final Boolean VALUE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Concrete value of this parameter specified during concretization.
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * Returns all <code>Matches</code> that use <code>this</code> to specify if the result of the matching is negated.
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Contains> contains;

	/**
	 * The cached value of the '{@link #getNullCheck() <em>Null Check</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullCheck()
	 * @generated
	 * @ordered
	 */
	protected EList<NullCheck> nullCheck;

	/**
	 * The cached value of the '{@link #getOneArgJavaOperator() <em>One Arg Java Operator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneArgJavaOperator()
	 * @generated
	 * @ordered
	 */
	protected EList<OneArgJavaOperator> oneArgJavaOperator;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BooleanParamImpl() {
		super();
	}
	
	@Override
	public String getValueAsString() {
		if (getValue() == null)
			return null;
		return getValue().toString();
	}
	
	@Override
	public void setValueFromString(String value) throws InvalidityException {
		setValueIfValid(Boolean.parseBoolean(value));
	}


	@Override
	public String generateXQuery() throws InvalidityException {
		if(getValue() != null) {
			return getValue() + "()";
		} else {
			throw new InvalidityException("invalid value");
		}
	}
	
	@Override
	public String generateSparql() throws InvalidityException {
		if(getValue() != null) {
			return ""+getValue();
		} else {
			return super.generateSparql();
		}
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @throws InvalidityException
	 * @return String
	 * In Neo4J upper- and lower-case are possible for boolean values. 
	 * However, we use LowerCase since:
	 * 		Neo4J follows partly the Java StyleGuide. Thus, we also use the way to write true/false lower-case.
	 */
	@Override 
	public String generateCypher() throws InvalidityException {
		if (getValue() != null) {
			return getValue().toString().toLowerCase();
		}
		return super.generateCypher();
	}
	
	@Override
	public ReturnType getReturnType() {
		return ReturnType.BOOLEAN;
	}
	
	@Override
	public boolean inputIsValid() {
		return (getValue() instanceof Boolean);
	}
	
	@Override
	public boolean isUsed() {		
		return super.isUsed() || !getMatches().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.BOOLEAN_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getValue() {
		return value;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetParameterList(ParameterList newVariableList, NotificationChain msgs) {
		if(newVariableList == null) {
			getMatches().clear();
		}
		return super.basicSetParameterList(newVariableList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Boolean newValue) {
		Boolean oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.BOOLEAN_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectWithInverseResolvingEList<Match>(Match.class, this, ParametersPackage.BOOLEAN_PARAM__MATCHES, OperatorsPackage.MATCH__OPTION);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contains> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList<Contains>(Contains.class, this, ParametersPackage.BOOLEAN_PARAM__CONTAINS, OperatorsPackage.CONTAINS__OPTION);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NullCheck> getNullCheck() {
		if (nullCheck == null) {
			nullCheck = new EObjectWithInverseResolvingEList<NullCheck>(NullCheck.class, this, ParametersPackage.BOOLEAN_PARAM__NULL_CHECK, OperatorsPackage.NULL_CHECK__OPTION);
		}
		return nullCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OneArgJavaOperator> getOneArgJavaOperator() {
		if (oneArgJavaOperator == null) {
			oneArgJavaOperator = new EObjectWithInverseResolvingEList<OneArgJavaOperator>(OneArgJavaOperator.class, this, ParametersPackage.BOOLEAN_PARAM__ONE_ARG_JAVA_OPERATOR, JavaoperatorsPackage.ONE_ARG_JAVA_OPERATOR__OPTION);
		}
		return oneArgJavaOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueIfValid(Boolean newValue) throws InvalidityException {
		Boolean oldValue = getValue();
		setValue(newValue);		
		try {
			checkComparisonConsistency();
		} catch (Exception e) {
			setValue(oldValue);
			throw e;
		}
	}
	
	@Override
	public void validateExampleValue(String val) throws InvalidityException {
		Boolean.parseBoolean(val);	
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
			case ParametersPackage.BOOLEAN_PARAM__MATCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatches()).basicAdd(otherEnd, msgs);
			case ParametersPackage.BOOLEAN_PARAM__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case ParametersPackage.BOOLEAN_PARAM__NULL_CHECK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNullCheck()).basicAdd(otherEnd, msgs);
			case ParametersPackage.BOOLEAN_PARAM__ONE_ARG_JAVA_OPERATOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOneArgJavaOperator()).basicAdd(otherEnd, msgs);
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
			case ParametersPackage.BOOLEAN_PARAM__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
			case ParametersPackage.BOOLEAN_PARAM__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case ParametersPackage.BOOLEAN_PARAM__NULL_CHECK:
				return ((InternalEList<?>)getNullCheck()).basicRemove(otherEnd, msgs);
			case ParametersPackage.BOOLEAN_PARAM__ONE_ARG_JAVA_OPERATOR:
				return ((InternalEList<?>)getOneArgJavaOperator()).basicRemove(otherEnd, msgs);
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
			case ParametersPackage.BOOLEAN_PARAM__VALUE:
				return getValue();
			case ParametersPackage.BOOLEAN_PARAM__MATCHES:
				return getMatches();
			case ParametersPackage.BOOLEAN_PARAM__CONTAINS:
				return getContains();
			case ParametersPackage.BOOLEAN_PARAM__NULL_CHECK:
				return getNullCheck();
			case ParametersPackage.BOOLEAN_PARAM__ONE_ARG_JAVA_OPERATOR:
				return getOneArgJavaOperator();
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
			case ParametersPackage.BOOLEAN_PARAM__VALUE:
				setValue((Boolean)newValue);
				return;
			case ParametersPackage.BOOLEAN_PARAM__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
				return;
			case ParametersPackage.BOOLEAN_PARAM__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Contains>)newValue);
				return;
			case ParametersPackage.BOOLEAN_PARAM__NULL_CHECK:
				getNullCheck().clear();
				getNullCheck().addAll((Collection<? extends NullCheck>)newValue);
				return;
			case ParametersPackage.BOOLEAN_PARAM__ONE_ARG_JAVA_OPERATOR:
				getOneArgJavaOperator().clear();
				getOneArgJavaOperator().addAll((Collection<? extends OneArgJavaOperator>)newValue);
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
			case ParametersPackage.BOOLEAN_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.BOOLEAN_PARAM__MATCHES:
				getMatches().clear();
				return;
			case ParametersPackage.BOOLEAN_PARAM__CONTAINS:
				getContains().clear();
				return;
			case ParametersPackage.BOOLEAN_PARAM__NULL_CHECK:
				getNullCheck().clear();
				return;
			case ParametersPackage.BOOLEAN_PARAM__ONE_ARG_JAVA_OPERATOR:
				getOneArgJavaOperator().clear();
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
			case ParametersPackage.BOOLEAN_PARAM__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ParametersPackage.BOOLEAN_PARAM__MATCHES:
				return matches != null && !matches.isEmpty();
			case ParametersPackage.BOOLEAN_PARAM__CONTAINS:
				return contains != null && !contains.isEmpty();
			case ParametersPackage.BOOLEAN_PARAM__NULL_CHECK:
				return nullCheck != null && !nullCheck.isEmpty();
			case ParametersPackage.BOOLEAN_PARAM__ONE_ARG_JAVA_OPERATOR:
				return oneArgJavaOperator != null && !oneArgJavaOperator.isEmpty();
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
			case ParametersPackage.BOOLEAN_PARAM___SET_VALUE_IF_VALID__BOOLEAN:
				try {
					setValueIfValid((Boolean)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}
	
	@Override 
	public String myToString() {
		return "bool [" + getInternalId() + "] " + getValue();
	}
	
	@Override
	public String generateDescription() {
		String res = "Eingabe des boolschen Wertes";
		return res;
//		try {} catch (Exception e) {}
//		setDescription(res);
	}

} //BooleanImpl
