/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.patternstructure.impl.CompletePatternImpl;

/**
 * <!-- begin-user-doc --> 
 * An implementation of the model object '<em><b>ParameterList</b></em>'. 
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.ParameterListImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ParameterListImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterListImpl extends PatternElementImpl implements ParameterList {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * A list of all <code>Parameters</code> of the <code>CompletePattern</code>.
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterListImpl() {
		super();
	}

	public ParameterListImpl(CompletePatternImpl completePatternImpl) {
		super();
		setPattern(completePatternImpl);
	}

//	@Override
//	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException {
//		isValidLocal(abstractionLevel);
//	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (getPattern() == null)
			throw new InvalidityException("ParameterList not in Pattern" + " (" + getInternalId() + ")");

		EList<Parameter> patternVars = getPattern().getAllParameters();
		if (patternVars == null)
			throw new InvalidityException("invalid Operators of Graph" + " (" + getInternalId() + ")");
		
		if(abstractionLevel != AbstractionLevel.SEMI_GENERIC) {	
			if (!(patternVars.containsAll(getParameters()) && getParameters().containsAll(patternVars))) {
				String msg = "parameters from ParameterList (" + getInternalId() + ") not equal to parameters used in Pattern:";
				msg += "\nin Pattern:       ";
				for (Parameter var : patternVars) {
					msg += "[" + var.myToString() + "]";
					if (!getParameters().contains(var))
						msg += "- ";
					else
						msg += "+ ";
				}
				msg += "\nin ParameterList: ";
				for (Parameter var : getParameters()) {
					msg += "[" + var.myToString() + "]";
					if (!patternVars.contains(var))
						msg += "- ";
					else
						msg += "+ ";
				}
				throw new InvalidityException(msg + " (" + getInternalId() + ")");
			}
		}
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		String res = "";
		for (Parameter parameter : getParameters()) {
			if (parameter instanceof TextListParamImpl)
				res += ((TextListParamImpl) parameter).getListDeclaration();
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.PARAMETER_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, ParametersPackage.PARAMETER_LIST__PARAMETERS, ParametersPackage.PARAMETER__PARAMETER_LIST);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompletePattern getPattern() {
		if (eContainerFeatureID() != ParametersPackage.PARAMETER_LIST__PATTERN) return null;
		return (CompletePattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetPattern(CompletePattern newPattern, NotificationChain msgs) {
		getParameters().clear();
		msgs = eBasicSetContainer((InternalEObject) newPattern, ParametersPackage.PARAMETER_LIST__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(CompletePattern newPattern) {
		if (newPattern != eInternalContainer() || (eContainerFeatureID() != ParametersPackage.PARAMETER_LIST__PATTERN && newPattern != null)) {
			if (EcoreUtil.isAncestor(this, newPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPattern != null)
				msgs = ((InternalEObject)newPattern).eInverseAdd(this, PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST, CompletePattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PARAMETER_LIST__PATTERN, newPattern, newPattern));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void add(Parameter parameter) {
		if (parameter != null && !getParameters().contains(parameter)) {
			getParameters().add(parameter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void remove(Parameter parameter) {
		if(parameter != null && !parameter.isUsed()) {
			getParameters().remove(parameter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Parameter> validateAgainstSchema() {
		EList<Parameter> invalidParams = new BasicEList<Parameter>();
		for(Parameter p : getParameters()) {
			invalidParams.addAll(p.validateAgainstSchema());
		}
		return invalidParams;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.PARAMETER_LIST__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case ParametersPackage.PARAMETER_LIST__PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPattern((CompletePattern)otherEnd, msgs);
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
			case ParametersPackage.PARAMETER_LIST__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ParametersPackage.PARAMETER_LIST__PATTERN:
				return basicSetPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ParametersPackage.PARAMETER_LIST__PATTERN:
				return eInternalContainer().eInverseRemove(this, PatternstructurePackage.COMPLETE_PATTERN__PARAMETER_LIST, CompletePattern.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.PARAMETER_LIST__PARAMETERS:
				return getParameters();
			case ParametersPackage.PARAMETER_LIST__PATTERN:
				return getPattern();
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
			case ParametersPackage.PARAMETER_LIST__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ParametersPackage.PARAMETER_LIST__PATTERN:
				setPattern((CompletePattern)newValue);
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
			case ParametersPackage.PARAMETER_LIST__PARAMETERS:
				getParameters().clear();
				return;
			case ParametersPackage.PARAMETER_LIST__PATTERN:
				setPattern((CompletePattern)null);
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
			case ParametersPackage.PARAMETER_LIST__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ParametersPackage.PARAMETER_LIST__PATTERN:
				return getPattern() != null;
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
			case ParametersPackage.PARAMETER_LIST___VALIDATE_AGAINST_SCHEMA:
				return validateAgainstSchema();
			case ParametersPackage.PARAMETER_LIST___ADD__PARAMETER:
				add((Parameter)arguments.get(0));
				return null;
			case ParametersPackage.PARAMETER_LIST___REMOVE__PARAMETER:
				remove((Parameter)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		if (getParameters().size() > 0) {
			String res = "\nParameterList " + getInternalId();
			for (Parameter parameter : getParameters()) {
				res += "\n  : " + parameter.myToString();
			}
			return res;
		}
		return "";
	}

	@Override
	public void printCodeToConsole() {
		System.out.println("EList<Parameter> params = pattern.getParameterList().getParameters();\n");
		int i=0;
		for (Parameter p: getParameters()){
			System.out.println(p.getClass().getSimpleName().replace("Impl", "") + " p" + i + " = ((" + p.getClass().getSimpleName().replace("Impl", "") + ") params.get(" + i + "));");
			i++;
		}
	}

} // ParameterListImpl
