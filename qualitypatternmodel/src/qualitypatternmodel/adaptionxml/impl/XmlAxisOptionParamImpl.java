/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlAxisOptionParam;
import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Axis
 * Option</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisOptionParamImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisOptionParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlAxisOptionParamImpl#getXmlAxisPair <em>Xml Axis Pair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlAxisOptionParamImpl extends ParameterImpl implements XmlAxisOptionParam {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * A subset of all XPath axes to choose from during the concretization.
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<XmlAxisKind> options;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final XmlAxisKind VALUE_EDEFAULT = XmlAxisKind.CHILD;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute. <!--
	 * begin-user-doc -->
	 * The chosen <code>RelationKind</code> (i.e. XPath axis).
	 * <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected XmlAxisKind value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public XmlAxisOptionParamImpl() {
		super();
		getOptions().addAll(XmlAxisKind.VALUES);
	}
	
	@Override
	public EList<Parameter> validateAgainstSchema() {
		EList<Parameter> invalidParams = new BasicEList<Parameter>();
		EList<XmlAxisKind> suggestions = inferSuggestions();		
		if(!suggestions.contains(getValue()) && !suggestions.isEmpty()) {
			invalidParams.add(this);
		}
		return invalidParams;
	}
	
	@Override
	public String getValueAsString() {
		return getValue().getName();
	}
	
	@Override
	public void setValueFromString(String value) throws InvalidityException {
		for(XmlAxisKind kind : XmlAxisKind.values()) {
			if(kind.getName().equals(value)) {			
				setValueIfValid(kind);
			}
		}		
	}
	
	@Override
	public String getOptionsAsStringList() {
		List<String> list = getOptions().stream().map(a -> a.getName()).collect(Collectors.toList());
		return ParameterFragmentImpl.generateJSONList(list);
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		
		if (getOptions() == null)
			throw new InvalidityException("options null");
		if (abstractionLevel != AbstractionLevel.SEMI_GENERIC && getOptions().isEmpty())
			throw new InvalidityException("not enough options");
		
		if(getParameterList() != null) {
			throw new InvalidityException("AxisOptionParam contained in ParameterList instead of AxisPair");
		}
		if ((abstractionLevel == AbstractionLevel.CONCRETE && !inputIsValid()))
			throw new InvalidityException("input missing or invalid" + " (" + getInternalId() + ")");
		if(isPredefined() && !inputIsValid()) {
			throw new InvalidityException("predefined input invalid" + " (" + getInternalId() + ")");
		}
	}

	@Override
	public String generateXQuery() throws InvalidityException {
		return value.getLiteral();
	}

	@Override
	public boolean inputIsValid() {
		return getValue() != null && options.contains(getValue());
	}
	
	@Override
	public boolean isUsed() {
		
		if (getXmlAxisPair() == null)
			return false;
		else if (getXmlAxisPair().getXmlPathParam() == null) 
			return false;
		else 
			return getXmlAxisPair().getXmlPathParam().getXmlNavigation() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_AXIS_OPTION_PARAM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetParameterList(ParameterList newVariableList, NotificationChain msgs) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<XmlAxisKind> getOptions() {
		if (options == null) {
			options = new EDataTypeUniqueEList<XmlAxisKind>(XmlAxisKind.class, this, AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__OPTIONS);
		}
		else if (options.size() > 1){
			EList<XmlAxisKind> options2 = new EDataTypeUniqueEList<XmlAxisKind>(XmlAxisKind.class, this, AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__OPTIONS);
			for (XmlAxisKind cop: options) {
				if (!options2.contains(cop)) {
					options2.add(cop);				
				}
			}
			options = options2;
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlAxisKind getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(XmlAxisKind newValue) {
		XmlAxisKind oldValue = value;
		value = newValue == null ? VALUE_EDEFAULT : newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlAxisPart getXmlAxisPair() {
		if (eContainerFeatureID() != AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR) return null;
		return (XmlAxisPart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlAxisPair(XmlAxisPart newXmlAxisPair, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newXmlAxisPair, AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXmlAxisPair(XmlAxisPart newXmlAxisPair) {
		if (newXmlAxisPair != eInternalContainer() || (eContainerFeatureID() != AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR && newXmlAxisPair != null)) {
			if (EcoreUtil.isAncestor(this, newXmlAxisPair))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newXmlAxisPair != null)
				msgs = ((InternalEObject)newXmlAxisPair).eInverseAdd(this, AdaptionxmlPackage.XML_AXIS_PAIR__XML_AXIS_OPTION_PARAM, XmlAxisPart.class, msgs);
			msgs = basicSetXmlAxisPair(newXmlAxisPair, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR, newXmlAxisPair, newXmlAxisPair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<XmlAxisKind> inferSuggestions() {
		return getXmlAxisPair().inferAxisSuggestions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not
	 */
	@Override
	public void setValueIfValid(XmlAxisKind newValue) throws InvalidityException {
		if(newValue == XmlAxisKind.SELF) {
			XmlAxisKind oldValue = getValue();
			setValue(newValue);		
			try {
				checkComparisonConsistency();
			} catch (Exception e) {
				setValue(oldValue);
				throw e;
			}
		} else {
			setValue(newValue);
		}
	}
	
	@Override
	public void checkComparisonConsistency() throws InvalidityException {
		Relation relation = getXmlAxisPair().getXmlPathParam().getXmlNavigation();
		Node target = relation.getTarget();
		if(target instanceof PrimitiveNode){
			((PrimitiveNode) target).checkComparisonConsistency();	
		}
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetXmlAxisPair((XmlAxisPart)otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR:
				return basicSetXmlAxisPair(null, msgs);
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
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR:
				return eInternalContainer().eInverseRemove(this, AdaptionxmlPackage.XML_AXIS_PAIR__XML_AXIS_OPTION_PARAM, XmlAxisPart.class, msgs);
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
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__OPTIONS:
				return getOptions();
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__VALUE:
				return getValue();
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR:
				return getXmlAxisPair();
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
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends XmlAxisKind>)newValue);
				return;
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__VALUE:
				setValue((XmlAxisKind)newValue);
				return;
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR:
				setXmlAxisPair((XmlAxisPart)newValue);
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
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__OPTIONS:
				getOptions().clear();
				return;
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR:
				setXmlAxisPair((XmlAxisPart)null);
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
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__OPTIONS:
				return options != null && !options.isEmpty();
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__VALUE:
				return value != VALUE_EDEFAULT;
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM__XML_AXIS_PAIR:
				return getXmlAxisPair() != null;
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
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM___SET_VALUE_IF_VALID__XMLAXISKIND:
				try {
					setValueIfValid((XmlAxisKind)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM___INFER_SUGGESTIONS:
				return inferSuggestions();
		}
		return super.eInvoke(operationID, arguments);
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
		return "axis [" + getInternalId() + "] " + getValue();
	}

	@Override
	public String generateDescription() {
		String res = "Beziehung: XPath-Achse";
		try {			
			Relation relation = getXmlAxisPair().getXmlPathParam().getXmlNavigation();
			Node to = relation.getTarget();
			Node from = relation.getSource();
			res += " zur Navigation von " + from.getName() + " zu " + to.getName();		
		} catch (Exception e) {}
		return res;
//		setDescription(res);
	}

} // AxisOptionImpl
