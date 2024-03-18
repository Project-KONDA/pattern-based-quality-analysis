/**
 */
package qualitypatternmodel.javaquery.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.QuantifierFilterPart;
import qualitypatternmodel.javaqueryoutput.ContainerResult;
import qualitypatternmodel.javaqueryoutput.FixedContainerInterim;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.impl.FixedContainerInterimImpl;
import qualitypatternmodel.patternstructure.Quantifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantifier Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaquery.impl.QuantifierFilterPartImpl#getSubfilter <em>Subfilter</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.QuantifierFilterPartImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link qualitypatternmodel.javaquery.impl.QuantifierFilterPartImpl#getQuantifier <em>Quantifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantifierFilterPartImpl extends BooleanFilterPartImpl implements QuantifierFilterPart {
	/**
	 * The cached value of the '{@link #getSubfilter() <em>Subfilter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubfilter()
	 * @generated
	 * @ordered
	 */
	protected EList<BooleanFilterPart> subfilter;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected FixedContainerInterim argument;

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
	public QuantifierFilterPartImpl() {
		super();
		setArgument(new FixedContainerInterimImpl());
	}

	public QuantifierFilterPartImpl(EList<BooleanFilterPart> subfilter) {
		super();
		FixedContainerInterim container = new FixedContainerInterimImpl();
		
		for (BooleanFilterPart sub: subfilter) {
			getSubfilter().add(sub);
			container.getContained().addAll(sub.getArguments());
		}
		setArgument(container);
		
	}
	
	public QuantifierFilterPartImpl(String json, Map<Integer, InterimResultPart> map) throws InvalidityException {
		super();
		try {

			JSONObject jsono = new JSONObject(json);
			setQuantifier(Quantifier.get(jsono.getString("quantifier")));
			FixedContainerInterimImpl argument = (FixedContainerInterimImpl) map.get(jsono.getInt("argument")); 
			setArgument(argument);
			
			JSONArray subfilters = new JSONArray(jsono.getString("subfilters"));
			for (int i = 0; i < subfilters.length(); i++) {
				BooleanFilterPart bfp = (BooleanFilterPart) JavaFilterPartImpl.fromJson(subfilters.get(i).toString(), map);
				getSubfilter().add(bfp);
			}
		}
		catch (Exception e) {
			throw new InvalidityException();
		}
	}

	@Override
	public Boolean apply(InterimResult parameter) throws InvalidityException {
		if (parameter == null)
			throw new InvalidityException("parameter null");
		if(!(parameter instanceof ContainerResult))
			throw new InvalidityException("parameter not a container");
		ContainerResult param = (ContainerResult) parameter;
		if (!(param.getCorrespondsTo() instanceof FixedContainerInterim))
			throw new InvalidityException((param.getCorrespondsTo() != null? "Class of param is " + param.getCorrespondsTo().getClass().getSimpleName() : "Param is null") + ", but a fixed container was expected. " + this.toString());
		FixedContainerInterim fixedContainer = (FixedContainerInterim) param.getCorrespondsTo();
		int sizeResult = fixedContainer.getContained().size();
		int sizeFilter = getSubfilter().size();
		
		if (sizeResult != sizeFilter)
			return false;

		EList<Boolean> in = new BasicEList<Boolean>();
		for (int i = 0; i<sizeResult; i++ ) {
			in.add(getSubfilter().get(i).apply(param.getSubresult().get(i)));
		}
		return !in.isEmpty() && !in.contains(false);
	};

	@Override
	public EList<InterimResultPart> getArguments() {
		EList<InterimResultPart> result = new BasicEList<InterimResultPart>();
		result.add(getArgument());
		return result;
	}
	
	@Override
	public JSONObject toJson() {
		JSONObject result = new JSONObject();
		try {
			result.put("class", getClass().getSimpleName());
			result.put("quantifier", getQuantifier());
			result.put("argument", getArgument().getInterimPartId());
			JSONArray subfilters = new JSONArray();
			for (BooleanFilterPart subfilter: getSubfilter())
				subfilters.put(subfilter.toJson());
			result.put("subfilters", subfilters);
		} catch (JSONException e) {
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "[quantifier " + getJavaFilterPartId() + " <" + getArgument().getInterimPartId() + "> " 
				+ " " + getSubfilter().toString() + "]";
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.QUANTIFIER_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BooleanFilterPart> getSubfilter() {
		if (subfilter == null) {
			subfilter = new EObjectContainmentEList<BooleanFilterPart>(BooleanFilterPart.class, this, JavaqueryPackage.QUANTIFIER_FILTER_PART__SUBFILTER);
		}
		return subfilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedContainerInterim getArgument() {
		if (argument != null && argument.eIsProxy()) {
			InternalEObject oldArgument = (InternalEObject)argument;
			argument = (FixedContainerInterim)eResolveProxy(oldArgument);
			if (argument != oldArgument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaqueryPackage.QUANTIFIER_FILTER_PART__ARGUMENT, oldArgument, argument));
			}
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedContainerInterim basicGetArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument(FixedContainerInterim newArgument) {
		FixedContainerInterim oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.QUANTIFIER_FILTER_PART__ARGUMENT, oldArgument, argument));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryPackage.QUANTIFIER_FILTER_PART__QUANTIFIER, oldQuantifier, quantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__SUBFILTER:
				return ((InternalEList<?>)getSubfilter()).basicRemove(otherEnd, msgs);
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
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__SUBFILTER:
				return getSubfilter();
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__ARGUMENT:
				if (resolve) return getArgument();
				return basicGetArgument();
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__QUANTIFIER:
				return getQuantifier();
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
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__SUBFILTER:
				getSubfilter().clear();
				getSubfilter().addAll((Collection<? extends BooleanFilterPart>)newValue);
				return;
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__ARGUMENT:
				setArgument((FixedContainerInterim)newValue);
				return;
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__QUANTIFIER:
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
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__SUBFILTER:
				getSubfilter().clear();
				return;
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__ARGUMENT:
				setArgument((FixedContainerInterim)null);
				return;
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__QUANTIFIER:
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
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__SUBFILTER:
				return subfilter != null && !subfilter.isEmpty();
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__ARGUMENT:
				return argument != null;
			case JavaqueryPackage.QUANTIFIER_FILTER_PART__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //QuantifierFilterPartImpl
