/**
 */
package qualitypatternmodel.inputfields.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.PropertyOption;
import qualitypatternmodel.inputfields.TextLiteral;
import qualitypatternmodel.inputfields.VariableList;
import qualitypatternmodel.inputfields.Boolean;
import qualitypatternmodel.inputfields.CompOption;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;
import qualitypatternmodel.patternstructure.impl.PatternImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Variable List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link qualitypatternmodel.inputfields.impl.VariableListImpl#getVariables
 * <em>Variables</em>}</li>
 * <li>{@link qualitypatternmodel.inputfields.impl.VariableListImpl#getPattern
 * <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableListImpl extends PatternElementImpl implements VariableList {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> variables;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VariableListImpl() {
		super();
	}

	public VariableListImpl(PatternImpl patternImpl) {
		super();
		setPattern(patternImpl);
	}

	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException {
		isValidLocal(isDefinedPattern);
	}

	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (getPattern() == null)
			throw new InvalidityException("VariableList not in Pattern" + " (" + getShortPatternInternalId() + ")");

		EList<Input> patternVars = getPattern().getAllInputs();
		if (patternVars == null)
			throw new InvalidityException("invalid Operators of Graph" + " (" + getShortPatternInternalId() + ")");

		if (!(patternVars.containsAll(getVariables()) && getVariables().containsAll(patternVars))) {
			String msg = "variables from VariableList not equal to amount of variables used in Graph" + " ("
					+ getShortPatternInternalId() + ")" + ": \n";
			for (Input var : patternVars) {
				msg += "[" + var.myToString() + " " + var.getShortPatternInternalId() + "]";
				if (!getVariables().contains(var))
					msg += "- ";
				else
					msg += "+ ";
			}
			msg += "\n";
			for (Input var : getVariables()) {
				msg += "[" + var.myToString() + " " + var.getShortPatternInternalId() + "]";
				if (!patternVars.contains(var))
					msg += "- ";
				else
					msg += "+ ";
			}
			throw new InvalidityException(msg + " (" + getShortPatternInternalId() + ")");
		}
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		String res = "";
		for (Input input : getVariables()) {
			if (input instanceof TextListImpl)
				res += ((TextListImpl) input).getListDeclaration();
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputfieldsPackage.Literals.VARIABLE_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Input> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList<Input>(Input.class, this,
					InputfieldsPackage.VARIABLE_LIST__VARIABLES, InputfieldsPackage.INPUT__VARIABLE_LIST);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Pattern getPattern() {
		if (eContainerFeatureID() != InputfieldsPackage.VARIABLE_LIST__PATTERN)
			return null;
		return (Pattern) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs) {
		for (Input input : getVariables()) {
			if (input instanceof Boolean) {
				((Boolean) input).setMatch(null);
			}
			if (input instanceof TextLiteral) {
				((TextLiteral) input).setMatch(null);
				((TextLiteral) input).setProperty(null);
			}
			if (input instanceof CompOption) {
				((CompOption) input).setComparison(null);
			}
			if (input instanceof PropertyOption) {
				((PropertyOption) input).setProperty(null);
			}
			input.getComparison1().clear();
			input.getComparison2().clear();
		}
		msgs = eBasicSetContainer((InternalEObject) newPattern, InputfieldsPackage.VARIABLE_LIST__PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPattern(Pattern newPattern) {
		if (newPattern != eInternalContainer()
				|| (eContainerFeatureID() != InputfieldsPackage.VARIABLE_LIST__PATTERN && newPattern != null)) {
			if (EcoreUtil.isAncestor(this, newPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString() + " ("
						+ getShortPatternInternalId() + ")");
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPattern != null)
				msgs = ((InternalEObject) newPattern).eInverseAdd(this, PatternstructurePackage.PATTERN__VARIABLE_LIST,
						Pattern.class, msgs);
			msgs = basicSetPattern(newPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputfieldsPackage.VARIABLE_LIST__PATTERN, newPattern,
					newPattern));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void add(Input input) {
		if (!getVariables().contains(input))
			getVariables().add(input);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InputfieldsPackage.VARIABLE_LIST__VARIABLES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVariables()).basicAdd(otherEnd, msgs);
		case InputfieldsPackage.VARIABLE_LIST__PATTERN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPattern((Pattern) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case InputfieldsPackage.VARIABLE_LIST__VARIABLES:
			return ((InternalEList<?>) getVariables()).basicRemove(otherEnd, msgs);
		case InputfieldsPackage.VARIABLE_LIST__PATTERN:
			return basicSetPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case InputfieldsPackage.VARIABLE_LIST__PATTERN:
			return eInternalContainer().eInverseRemove(this, PatternstructurePackage.PATTERN__VARIABLE_LIST,
					Pattern.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case InputfieldsPackage.VARIABLE_LIST__VARIABLES:
			return getVariables();
		case InputfieldsPackage.VARIABLE_LIST__PATTERN:
			return getPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case InputfieldsPackage.VARIABLE_LIST__VARIABLES:
			getVariables().clear();
			getVariables().addAll((Collection<? extends Input>) newValue);
			return;
		case InputfieldsPackage.VARIABLE_LIST__PATTERN:
			setPattern((Pattern) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case InputfieldsPackage.VARIABLE_LIST__VARIABLES:
			getVariables().clear();
			return;
		case InputfieldsPackage.VARIABLE_LIST__PATTERN:
			setPattern((Pattern) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case InputfieldsPackage.VARIABLE_LIST__VARIABLES:
			return variables != null && !variables.isEmpty();
		case InputfieldsPackage.VARIABLE_LIST__PATTERN:
			return getPattern() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case InputfieldsPackage.VARIABLE_LIST___ADD__INPUT:
			add((Input) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		if (getVariables().size() > 0) {
			String res = "\nVariableList " + getShortPatternInternalId() + " (";
			for (Input input : getVariables()) {
				res += "\n. " + input.myToString();
			}
			return res + ")";
		}
		return "";
	}

} // VariableListImpl
