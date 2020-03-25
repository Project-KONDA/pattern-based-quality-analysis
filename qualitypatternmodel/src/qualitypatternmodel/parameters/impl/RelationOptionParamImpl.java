/**
 */
package qualitypatternmodel.parameters.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Axis;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Axis
 * Option</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.RelationOptionParamImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.RelationOptionParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.RelationOptionParamImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationOptionParamImpl extends ParameterImpl implements RelationOptionParam {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Axis> options;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Axis VALUE_EDEFAULT = Axis.CHILD;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Axis value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected Relation relation;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public RelationOptionParamImpl() {
		super();
		getOptions().add(Axis.CHILD);
		getOptions().add(Axis.DESCENDANT);
//		getOptions().add(Axis.PARENT);
//		getOptions().add(Axis.ANCESTOR);
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.UNSPECIFIED;
	}

	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		if (getOptions() == null)
			throw new InvalidityException("options null");
		if (getOptions().size() < 1)
			throw new InvalidityException("not enough options");
		super.isValidLocal(isDefinedPattern);
	}

	@Override
	public String generateQuery(Location location) throws InvalidityException {
		return "/" + value.getLiteral() + "::*";
	}

	@Override
	public boolean inputIsValid() {
		return getValue() != null && options.contains(getValue());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.RELATION_OPTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetVariableList(ParameterList newVariableList, NotificationChain msgs) {
		setRelation(null);
		return super.basicSetParameterList(newVariableList, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Axis> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<Axis>(Axis.class, this, ParametersPackage.RELATION_OPTION_PARAM__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Axis getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(Axis newValue) {
		Axis oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.RELATION_OPTION_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation getRelation() {
		if (relation != null && relation.eIsProxy()) {
			InternalEObject oldRelation = (InternalEObject)relation;
			relation = (Relation)eResolveProxy(oldRelation);
			if (relation != oldRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ParametersPackage.RELATION_OPTION_PARAM__RELATION, oldRelation, relation));
			}
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetRelation() {
		return relation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelation(Relation newRelation, NotificationChain msgs) {
		Relation oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParametersPackage.RELATION_OPTION_PARAM__RELATION, oldRelation, newRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelation(Relation newRelation) {
		if (newRelation != relation) {
			NotificationChain msgs = null;
			if (relation != null)
				msgs = ((InternalEObject)relation).eInverseRemove(this, GraphstructurePackage.RELATION__OPTION, Relation.class, msgs);
			if (newRelation != null)
				msgs = ((InternalEObject)newRelation).eInverseAdd(this, GraphstructurePackage.RELATION__OPTION, Relation.class, msgs);
			msgs = basicSetRelation(newRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.RELATION_OPTION_PARAM__RELATION, newRelation, newRelation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.RELATION_OPTION_PARAM__RELATION:
				if (relation != null)
					msgs = ((InternalEObject)relation).eInverseRemove(this, GraphstructurePackage.RELATION__OPTION, Relation.class, msgs);
				return basicSetRelation((Relation)otherEnd, msgs);
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
			case ParametersPackage.RELATION_OPTION_PARAM__RELATION:
				return basicSetRelation(null, msgs);
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
			case ParametersPackage.RELATION_OPTION_PARAM__OPTIONS:
				return getOptions();
			case ParametersPackage.RELATION_OPTION_PARAM__VALUE:
				return getValue();
			case ParametersPackage.RELATION_OPTION_PARAM__RELATION:
				if (resolve) return getRelation();
				return basicGetRelation();
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
			case ParametersPackage.RELATION_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends Axis>)newValue);
				return;
			case ParametersPackage.RELATION_OPTION_PARAM__VALUE:
				setValue((Axis)newValue);
				return;
			case ParametersPackage.RELATION_OPTION_PARAM__RELATION:
				setRelation((Relation)newValue);
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
			case ParametersPackage.RELATION_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				return;
			case ParametersPackage.RELATION_OPTION_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ParametersPackage.RELATION_OPTION_PARAM__RELATION:
				setRelation((Relation)null);
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
			case ParametersPackage.RELATION_OPTION_PARAM__OPTIONS:
				return options != null && !options.isEmpty();
			case ParametersPackage.RELATION_OPTION_PARAM__VALUE:
				return value != VALUE_EDEFAULT;
			case ParametersPackage.RELATION_OPTION_PARAM__RELATION:
				return relation != null;
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
		result.append(" (options: ");
		result.append(options);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		return "axis " + getInternalId() + " " + getValue();
	}

	@Override
	public void generateDescription() {
		String res = "Beziehung: XPath-Achse";
		try {			
			Element to = getRelation().getElement();
			Element from = to.getPreviousElement();
			res += " zur Navigation von " + from.getName() + " zu " + to.getName();			
		} catch (Exception e) {}
		setDescription(res);
	}

} // AxisOptionImpl
