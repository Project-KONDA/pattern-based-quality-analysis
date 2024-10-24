/**
 */
package qualitypatternmodel.javaquery.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.ListFilterPart;
import qualitypatternmodel.javaqueryoutput.ContainerResult;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.VariableContainerInterim;
import qualitypatternmodel.javaqueryoutput.impl.VariableContainerInterimImpl;
import qualitypatternmodel.patternstructure.Quantifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.ListFilterPartImpl#getSubfilter <em>Subfilter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.ListFilterPartImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.ListFilterPartImpl#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListFilterPartImpl extends BooleanFilterPartImpl implements ListFilterPart {
	/**
	 * The cached value of the '{@link #getSubfilter() <em>Subfilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfilter()
	 * @generated
	 * @ordered
	 */
	protected BooleanFilterPart subfilter;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected VariableContainerInterim argument;

	/**
	 * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected static final Quantifier QUANTIFIER_EDEFAULT = Quantifier.EXISTS;

	/**
	 * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected Quantifier quantifier = QUANTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ListFilterPartImpl() {
		super();
		setArgument(new VariableContainerInterimImpl());
	}
	
	public ListFilterPartImpl(JSONObject json, Map<Integer, InterimResultPart> map) throws InvalidityException {
		super();
		try {
			setQuantifier(Quantifier.get(json.getString("quantifier")));
			VariableContainerInterimImpl argument = (VariableContainerInterimImpl) map.get(json.getInt("argument"));
			setArgument(argument);
			setSubfilter((BooleanFilterPart) JavaFilterPartImpl.fromJson(json.getJSONObject("subfilter"), map));
		}
		catch (Exception e) {
			throw new InvalidityException();
		}
	}

	public ListFilterPartImpl(Quantifier quantifier, BooleanFilterPart subfilter) {
		super();
		setArgument(new VariableContainerInterimImpl());
		setQuantifier(quantifier);
		setSubfilter(subfilter);
	}

	@Override
	public Boolean apply(InterimResult parameter) throws InvalidityException {
		if (parameter == null) {
			throw new InvalidityException("Parameter null");
		}
		ContainerResult container = (ContainerResult) parameter;
		for(InterimResult argument: container.getSubresult()) {
			Boolean arg = getSubfilter().apply(argument);
			if (arg && getQuantifier() == Quantifier.EXISTS) {
				return true;
			}
			if (!arg && getQuantifier() == Quantifier.FORALL) {
				return false;
			}
		}
		return getQuantifier() == Quantifier.FORALL;
	}

	@Override
	public EList<InterimResultPart> getArguments() {
		EList<InterimResultPart> result = new BasicEList<InterimResultPart>();
		result.add(getArgument());
		return result;
	}

	protected void updateArgument() throws InvalidityException {
		EList<InterimResultPart> contained = getSubfilter().getArguments();
		if (contained == null) {
			getArgument().setContained(null);
		} else if (contained.size() == 1) {
			getArgument().setContained(contained.get(0));
		} else {
			throw new InvalidityException("CountFilterElement has too much arguments");
		}
	}

	@Override
	public JSONObject toJson() {
		JSONObject result = new JSONObject();
		try {
			result.put("class", getClass().getSimpleName());
			result.put("quantifier", getQuantifier().getLiteral());
			result.put("argument", getArgument().getInterimPartId());

			result.put("subfilter", getSubfilter().toJson());

		} catch (JSONException e) {
		}
		return result;
	}

	@Override
	public String toString() {
		return "[list " + getJavaFilterPartId() + " <" + getArgument().getInterimPartId() + "> "
				+ " " + (getSubfilter() != null? getSubfilter().toString() : "null" ) + "]";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.LIST_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanFilterPart getSubfilter() {
		return subfilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetSubfilter(BooleanFilterPart newSubfilter, NotificationChain msgs) {
		BooleanFilterPart oldSubfilter = subfilter;
		subfilter = newSubfilter;
		try {
			updateArgument();
		} catch (InvalidityException e) {
			e.printStackTrace();
		}

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JavaqueryPackage.LIST_FILTER_PART__SUBFILTER, oldSubfilter, newSubfilter);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubfilter(BooleanFilterPart newSubfilter) {
		if (newSubfilter != subfilter) {
			NotificationChain msgs = null;
			if (subfilter != null)
				msgs = ((InternalEObject)subfilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.LIST_FILTER_PART__SUBFILTER, null, msgs);
			if (newSubfilter != null)
				msgs = ((InternalEObject)newSubfilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JavaqueryPackage.LIST_FILTER_PART__SUBFILTER, null, msgs);
			msgs = basicSetSubfilter(newSubfilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.LIST_FILTER_PART__SUBFILTER, newSubfilter, newSubfilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableContainerInterim getArgument() {
		if (argument != null && argument.eIsProxy()) {
			InternalEObject oldArgument = (InternalEObject)argument;
			argument = (VariableContainerInterim)eResolveProxy(oldArgument);
			if (argument != oldArgument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.LIST_FILTER_PART__ARGUMENT, oldArgument, argument));
			}
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableContainerInterim basicGetArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument(VariableContainerInterim newArgument) {
		VariableContainerInterim oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.LIST_FILTER_PART__ARGUMENT, oldArgument, argument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantifier getQuantifier() {
		return quantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantifier(Quantifier newQuantifier) {
		Quantifier oldQuantifier = quantifier;
		quantifier = newQuantifier == null ? QUANTIFIER_EDEFAULT : newQuantifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.LIST_FILTER_PART__QUANTIFIER, oldQuantifier, quantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryPackage.LIST_FILTER_PART__SUBFILTER:
				return basicSetSubfilter(null, msgs);
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
			case JavaqueryPackage.LIST_FILTER_PART__SUBFILTER:
				return getSubfilter();
			case JavaqueryPackage.LIST_FILTER_PART__ARGUMENT:
				if (resolve) return getArgument();
				return basicGetArgument();
			case JavaqueryPackage.LIST_FILTER_PART__QUANTIFIER:
				return getQuantifier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaqueryPackage.LIST_FILTER_PART__SUBFILTER:
				setSubfilter((BooleanFilterPart)newValue);
				return;
			case JavaqueryPackage.LIST_FILTER_PART__ARGUMENT:
				setArgument((VariableContainerInterim)newValue);
				return;
			case JavaqueryPackage.LIST_FILTER_PART__QUANTIFIER:
				setQuantifier((Quantifier)newValue);
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
			case JavaqueryPackage.LIST_FILTER_PART__SUBFILTER:
				setSubfilter((BooleanFilterPart)null);
				return;
			case JavaqueryPackage.LIST_FILTER_PART__ARGUMENT:
				setArgument((VariableContainerInterim)null);
				return;
			case JavaqueryPackage.LIST_FILTER_PART__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
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
			case JavaqueryPackage.LIST_FILTER_PART__SUBFILTER:
				return subfilter != null;
			case JavaqueryPackage.LIST_FILTER_PART__ARGUMENT:
				return argument != null;
			case JavaqueryPackage.LIST_FILTER_PART__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}
} //ListFilterPartImpl
