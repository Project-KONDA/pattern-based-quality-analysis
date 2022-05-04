/**
 */
package qualitypatternmodel.parameters.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import org.basex.query.QueryException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.PathParam;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.execution.Database;
import qualitypatternmodel.execution.XmlDataDatabase;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.impl.CompletePatternImpl;
import qualitypatternmodel.textrepresentation.ParameterReference;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ParameterValue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.parameters.impl.ParameterValueImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ParameterValueImpl#getComparison2 <em>Comparison2</em>}</li>
 *   <li>{@link qualitypatternmodel.parameters.impl.ParameterValueImpl#isTypeModifiable <em>Type Modifiable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParameterValueImpl extends ParameterImpl implements ParameterValue {
	/**
	 * The cached value of the '{@link #getComparison1() <em>Comparison1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>Comparisons</code> that reference <code>this</code> as <code>argument1</code>.
	 * <!-- end-user-doc -->
	 * @see #getComparison1()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison1;
	/**
	 * The cached value of the '{@link #getComparison2() <em>Comparison2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>Comparisons</code> that reference <code>this</code> as <code>argument2</code>.
	 * <!-- end-user-doc -->
	 * @see #getComparison2()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison2;


	/**
	 * The default value of the '{@link #isTypeModifiable() <em>Type Modifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeModifiable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TYPE_MODIFIABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isTypeModifiable() <em>Type Modifiable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * True if user is allowed to replace <code>this</code> with another <code>ParameterValue</code>.
	 * <!-- end-user-doc -->
	 * @see #isTypeModifiable()
	 * @generated
	 * @ordered
	 */
	protected boolean typeModifiable = TYPE_MODIFIABLE_EDEFAULT;


	/**
	 * <!-- begin-user-doc -->
	 * Constructor.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterValueImpl() {
		super();
	}
	
	@Override
	public EList<Parameter> validateAgainstSchema() {
		EList<Parameter> invalidParams = new BasicEList<Parameter>();
		boolean invalid = true;
		String valueWithoutPrefix = "";
		String valueWithPrefix = getValueAsString();
		String[] split = valueWithPrefix.split(":");
		if(split.length > 1) {
			valueWithoutPrefix = split[1];
		} else {
			valueWithoutPrefix = split[0];
		}
		for(String s : getSuggestions()) {
			if(s.equals(valueWithoutPrefix)){
				invalid = false;
			}
		}
		invalid = invalid && getSuggestions().size() > 0;
		if(invalid) {
			invalidParams.add(this);
		}
		return invalidParams;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.PARAMETER_VALUE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison1() {
		if (comparison1 == null) {
			comparison1 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, ParametersPackage.PARAMETER_VALUE__COMPARISON1, OperatorsPackage.COMPARISON__ARGUMENT1);
		}
		return comparison1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison2() {
		if (comparison2 == null) {
			comparison2 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, ParametersPackage.PARAMETER_VALUE__COMPARISON2, OperatorsPackage.COMPARISON__ARGUMENT2);
		}
		return comparison2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTypeModifiable() {
		return typeModifiable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeModifiable(boolean newTypeModifiable) {
		boolean oldTypeModifiable = typeModifiable;
		typeModifiable = newTypeModifiable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PARAMETER_VALUE__TYPE_MODIFIABLE, oldTypeModifiable, typeModifiable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isInTagComparison() {
		return getPrimitiveComparisonPropertyKinds().contains(PropertyKind.TAG);
	}

	private EList<PropertyKind> getPrimitiveComparisonPropertyKinds() {
		EList<PropertyKind> propertyKinds = new BasicEList<PropertyKind>();
		EList<Comparison> comparisons = new BasicEList<Comparison>();
		comparisons.addAll(getComparison1());
		comparisons.addAll(getComparison2());
		for(Comparison comparison : comparisons) {
			if(comparison.isPrimitive()) {
				if(comparison.getArgument1() instanceof XmlProperty) {
					XmlProperty property = (XmlProperty) comparison.getArgument1();
					for(Relation r : property.getIncoming()) {
						if (r instanceof XmlNavigation) {
							XmlNavigation nav = (XmlNavigation) r;
							if(nav.getPathParam() != null && nav.getPathParam().getPropertyOptionParam() != null) {
								propertyKinds.add(nav.getPathParam().getPropertyOptionParam().getValue());
							}
						}
						if (r instanceof XmlPropertyNavigation) {
							XmlPropertyNavigation nav = (XmlPropertyNavigation) r;
							if(nav.getPathParam() != null && nav.getPathParam().getPropertyOptionParam() != null) {
								propertyKinds.add(nav.getPathParam().getPropertyOptionParam().getValue());
							}
						}
					}
					
				}
				if(comparison.getArgument2() instanceof XmlProperty) {
					XmlProperty property = (XmlProperty) comparison.getArgument2();
					for(Relation r : property.getIncoming()) {
						if (r instanceof XmlNavigation) {
							XmlNavigation nav = (XmlNavigation) r;
							if(nav.getPathParam() != null && nav.getPathParam().getPropertyOptionParam() != null) {
								propertyKinds.add(nav.getPathParam().getPropertyOptionParam().getValue());
							}
						}
						if (r instanceof XmlPropertyNavigation) {
							XmlPropertyNavigation nav = (XmlPropertyNavigation) r;
							if(nav.getPathParam() != null && nav.getPathParam().getPropertyOptionParam() != null) {
								propertyKinds.add(nav.getPathParam().getPropertyOptionParam().getValue());
							}
						}
					}
				}				
			}
		}
		if(this instanceof TextLiteralParam) {
			TextLiteralParam text = (TextLiteralParam) this;
			if(text.getAxisPair() != null) {
				propertyKinds.add(PropertyKind.TAG);
			}
		}
		return propertyKinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isInAttributeComparison() {
		return getPrimitiveComparisonPropertyKinds().contains(PropertyKind.ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isInDataComparison() {
		return getPrimitiveComparisonPropertyKinds().contains(PropertyKind.DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getReturnType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isTranslatable() {
		return true;
	}
	
	@Override
	public boolean isUsed() {
		return !getComparison1().isEmpty() || !getComparison2().isEmpty();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Node> getAllArgumentElements() {
		return new BasicEList<Node>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isOperatorArgument() {
		return !getComparison1().isEmpty() || !getComparison2().isEmpty();
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
			case ParametersPackage.PARAMETER_VALUE__COMPARISON1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison1()).basicAdd(otherEnd, msgs);
			case ParametersPackage.PARAMETER_VALUE__COMPARISON2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison2()).basicAdd(otherEnd, msgs);
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
			case ParametersPackage.PARAMETER_VALUE__COMPARISON1:
				return ((InternalEList<?>)getComparison1()).basicRemove(otherEnd, msgs);
			case ParametersPackage.PARAMETER_VALUE__COMPARISON2:
				return ((InternalEList<?>)getComparison2()).basicRemove(otherEnd, msgs);
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
			case ParametersPackage.PARAMETER_VALUE__COMPARISON1:
				return getComparison1();
			case ParametersPackage.PARAMETER_VALUE__COMPARISON2:
				return getComparison2();
			case ParametersPackage.PARAMETER_VALUE__TYPE_MODIFIABLE:
				return isTypeModifiable();
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
			case ParametersPackage.PARAMETER_VALUE__COMPARISON1:
				getComparison1().clear();
				getComparison1().addAll((Collection<? extends Comparison>)newValue);
				return;
			case ParametersPackage.PARAMETER_VALUE__COMPARISON2:
				getComparison2().clear();
				getComparison2().addAll((Collection<? extends Comparison>)newValue);
				return;
			case ParametersPackage.PARAMETER_VALUE__TYPE_MODIFIABLE:
				setTypeModifiable((Boolean)newValue);
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
			case ParametersPackage.PARAMETER_VALUE__COMPARISON1:
				getComparison1().clear();
				return;
			case ParametersPackage.PARAMETER_VALUE__COMPARISON2:
				getComparison2().clear();
				return;
			case ParametersPackage.PARAMETER_VALUE__TYPE_MODIFIABLE:
				setTypeModifiable(TYPE_MODIFIABLE_EDEFAULT);
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
			case ParametersPackage.PARAMETER_VALUE__COMPARISON1:
				return comparison1 != null && !comparison1.isEmpty();
			case ParametersPackage.PARAMETER_VALUE__COMPARISON2:
				return comparison2 != null && !comparison2.isEmpty();
			case ParametersPackage.PARAMETER_VALUE__TYPE_MODIFIABLE:
				return typeModifiable != TYPE_MODIFIABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == qualitypatternmodel.graphstructure.Comparable.class) {
			switch (derivedFeatureID) {
				case ParametersPackage.PARAMETER_VALUE__COMPARISON1: return GraphstructurePackage.COMPARABLE__COMPARISON1;
				case ParametersPackage.PARAMETER_VALUE__COMPARISON2: return GraphstructurePackage.COMPARABLE__COMPARISON2;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == qualitypatternmodel.graphstructure.Comparable.class) {
			switch (baseFeatureID) {
				case GraphstructurePackage.COMPARABLE__COMPARISON1: return ParametersPackage.PARAMETER_VALUE__COMPARISON1;
				case GraphstructurePackage.COMPARABLE__COMPARISON2: return ParametersPackage.PARAMETER_VALUE__COMPARISON2;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == qualitypatternmodel.graphstructure.Comparable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.COMPARABLE___GET_RETURN_TYPE: return ParametersPackage.PARAMETER_VALUE___GET_RETURN_TYPE;
				case GraphstructurePackage.COMPARABLE___IS_TRANSLATABLE: return ParametersPackage.PARAMETER_VALUE___IS_TRANSLATABLE;
				case GraphstructurePackage.COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS: return ParametersPackage.PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;
				case GraphstructurePackage.COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP: return ParametersPackage.PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;
				case GraphstructurePackage.COMPARABLE___IS_OPERATOR_ARGUMENT: return ParametersPackage.PARAMETER_VALUE___IS_OPERATOR_ARGUMENT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ParametersPackage.PARAMETER_VALUE___IS_IN_TAG_COMPARISON:
				return isInTagComparison();
			case ParametersPackage.PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON:
				return isInAttributeComparison();
			case ParametersPackage.PARAMETER_VALUE___IS_IN_DATA_COMPARISON:
				return isInDataComparison();
			case ParametersPackage.PARAMETER_VALUE___GET_TAG_COMPARISON_ELEMENTS:
				return getTagComparisonElements();
			case ParametersPackage.PARAMETER_VALUE___INFER_ELEMENT_TAG_SUGGESTIONS:
				return inferElementTagSuggestions();
			case ParametersPackage.PARAMETER_VALUE___GET_ELEMENT_TAGS:
				return getElementTags();
			case ParametersPackage.PARAMETER_VALUE___GET_ATTRIBUTE_NAMES:
				return getAttributeNames();
			case ParametersPackage.PARAMETER_VALUE___GET_DATA_VALUES:
				return getDataValues();
			case ParametersPackage.PARAMETER_VALUE___GET_ATTRIBUTE_VALUES:
				return getAttributeValues();
			case ParametersPackage.PARAMETER_VALUE___GET_SUGGESTIONS:
				return getSuggestions();
			case ParametersPackage.PARAMETER_VALUE___REPLACE__PARAMETERVALUE:
				replace((ParameterValue)arguments.get(0));
				return null;
			case ParametersPackage.PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING:
				try {
					replaceViaValue((String[])arguments.get(0), (String)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ParametersPackage.PARAMETER_VALUE___GET_RETURN_TYPE:
				return getReturnType();
			case ParametersPackage.PARAMETER_VALUE___IS_TRANSLATABLE:
				return isTranslatable();
			case ParametersPackage.PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS:
				return getAllArgumentElements();
			case ParametersPackage.PARAMETER_VALUE___IS_OPERATOR_ARGUMENT:
				return isOperatorArgument();
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
		result.append(" (typeModifiable: ");
		result.append(typeModifiable);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean inputIsValid() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EMap<String, Integer> getElementTags() {		
		Database db;
		try {
			db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
			if(db instanceof XmlDataDatabase) {
				XmlDataDatabase xmlDb = (XmlDataDatabase) db;
				return xmlDb.getElementNames();
			}
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}	
		return new BasicEMap<String, Integer>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EMap<String, Integer> getAttributeNames() {
		Database db;
		try {
			db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
			if(db instanceof XmlDataDatabase) {
				XmlDataDatabase xmlDb = (XmlDataDatabase) db;
				return xmlDb.getAttributeNames();
			}
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}	
		return new BasicEMap<String, Integer>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EMap<String, Integer> getDataValues() {
		Database db;
		try {
			db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
			if(db instanceof XmlDataDatabase) {
				XmlDataDatabase xmlDb = (XmlDataDatabase) db;
				return xmlDb.getRecordedDataValues();
			}
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}	
		return new BasicEMap<String, Integer>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EMap<String, Integer> getAttributeValues() {
		Database db;
		try {
			db = ((CompletePattern) getAncestor(CompletePatternImpl.class)).getDatabase();
			if(db instanceof XmlDataDatabase) {
				XmlDataDatabase xmlDb = (XmlDataDatabase) db;
				return xmlDb.getRecordedAttributeValues();
			}
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}	
		return new BasicEMap<String, Integer>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getSuggestions() {
		EList<String> suggestions = new BasicEList<String>();
		if(isInTagComparison()) {
			suggestions.addAll(Constants.sortByValue(getElementTags()).keySet());
		}	
		if(isInAttributeComparison()) {
			suggestions.addAll(Constants.sortByValue(getAttributeValues()).keySet());
		}		
		if(isInDataComparison()) {
			suggestions.addAll(Constants.sortByValue(getDataValues()).keySet());
		}		
		return suggestions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void replace(ParameterValue concreteValue) {
		
		if(isTypeModifiable()) {		
			
			int index = getParameterList().getParameters().indexOf(this);
			getParameterList().getParameters().set(index, concreteValue);
			
			EList<Comparison> comparison1Copy = new BasicEList<Comparison>();
			comparison1Copy.addAll(getComparison1());
			for(Comparison comparison : comparison1Copy) {
				comparison.setArgument1(concreteValue);
			}
			EList<Comparison> comparison2Copy = new BasicEList<Comparison>();
			comparison2Copy.addAll(getComparison2());
			for(Comparison comparison : comparison2Copy) {
				comparison.setArgument2(concreteValue);	
			}
			
			EList<ParameterReference> fragmentCopy = new BasicEList<ParameterReference>();
			fragmentCopy.addAll(getParameterReferences());
			for(ParameterReference fragment : fragmentCopy) {
				fragment.getParameter().add(concreteValue);
				fragment.getParameter().remove(this);
			}
			
			concreteValue.setTypeModifiable(true);

		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void replaceViaValue(String[] values, String type) throws InvalidityException {
		if(type.equals(Constants.PARAMETER_TYPE_TEXT_LIST)) {
			TextListParam textList = ParametersFactory.eINSTANCE.createTextListParam();
			textList.getValues().clear();
			textList.getValues().addAll(Arrays.asList(values));			
			replace(textList);
		} else if(values.length == 1) {
			switch (type) {
			case Constants.PARAMETER_TYPE_TEXT:
				TextLiteralParam text = ParametersFactory.eINSTANCE.createTextLiteralParam();
				text.setValueFromString(values[0]);
				replace(text);
				break;			
			case Constants.PARAMETER_TYPE_NUMBER:
				NumberParam number = ParametersFactory.eINSTANCE.createNumberParam();
				number.setValueFromString(values[0]);
				replace(number);
				break;
			case Constants.PARAMETER_TYPE_BOOLEAN:
				BooleanParam bool = ParametersFactory.eINSTANCE.createBooleanParam();
				bool.setValueFromString(values[0]);
				replace(bool);
				break;
			case Constants.PARAMETER_TYPE_DATE:
				DateParam date = ParametersFactory.eINSTANCE.createDateParam();
				date.setValueFromString(values[0]);
				replace(date);
				break;
			case Constants.PARAMETER_TYPE_TIME:
				TimeParam time = ParametersFactory.eINSTANCE.createTimeParam();
				time.setValueFromString(values[0]);
				replace(time);
				break;
			case Constants.PARAMETER_TYPE_DATE_TIME:
				DateTimeParam dateTime = ParametersFactory.eINSTANCE.createDateTimeParam();
				dateTime.setValueFromString(values[0]);
				replace(dateTime);
				break;

			default:
				throw new InvalidityException("Parameter type '" + type + "' invalid");
			}
		} else {
			throw new InvalidityException("Too many values passed.");
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void checkComparisonConsistency() throws InvalidityException {
		for(Comparison comp : getComparison1()) {
			if(comp.getArgument2() instanceof PrimitiveNode) {
				PrimitiveNode prop = (PrimitiveNode) comp.getArgument2();
				prop.checkComparisonConsistency(this);
			}
		}
		for(Comparison comp : getComparison2()) {
			if(comp.getArgument1() instanceof PrimitiveNode) {
				PrimitiveNode prop = (PrimitiveNode) comp.getArgument1();
				prop.checkComparisonConsistency(this);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> inferElementTagSuggestions() {
		EList<String> suggestions = new BasicEList<String>();
		
		EList<Comparison> comparisons = getComparison1();
		comparisons.addAll(getComparison2());
		for (Comparison comp : comparisons) {
			if(comp.getOption().getValue() == ComparisonOperator.EQUAL) {				
				XmlProperty tagNode = null;
				if(comp.getArgument1().equals(this)) {
					if(comp.getArgument2() instanceof XmlProperty) {
						tagNode = (XmlProperty) comp.getArgument2();
					}
				}
				if(comp.getArgument2().equals(this)) {
					if(comp.getArgument1() instanceof XmlProperty) {
						tagNode = (XmlProperty) comp.getArgument1();			
					}
				}
				if(tagNode != null) {
					for (Relation r : tagNode.getIncoming()) {
						PathParam pathParam = null;					
						if(r instanceof XmlNavigation) {
							XmlNavigation nav = (XmlNavigation) r;
							pathParam = nav.getOriginalPathParam();
							if(pathParam.getAxisPairs().isEmpty()) {
								for (Relation previousRelation : nav.getSource().getIncoming()) {
									if(previousRelation instanceof XmlNavigation) {
										XmlNavigation previousNav = (XmlNavigation) previousRelation;
										PathParam previousPathParam = previousNav.getOriginalPathParam();
										TextLiteralParam text = previousPathParam.getAxisPairs().get(previousPathParam.getAxisPairs().size()-1).getTextLiteralParam();
										if(text != null) {
											EList<String> newSuggestions = text.inferElementTagSuggestions();
											if(suggestions.isEmpty() || newSuggestions.isEmpty()) {
												suggestions.addAll(newSuggestions);
											} else {
												suggestions.retainAll(newSuggestions);
											}
										}
									}
								}
								
							} else {
								TextLiteralParam text = pathParam.getAxisPairs().get(pathParam.getAxisPairs().size()-1).getTextLiteralParam();
								if(text != null) {
									EList<String> newSuggestions = text.inferElementTagSuggestions();
									if(suggestions.isEmpty() || newSuggestions.isEmpty()) {
										suggestions.addAll(newSuggestions);
									} else {
										suggestions.retainAll(newSuggestions);
									}
								}
							}
							
						}
					}
				}			
				
			}
		}
		
		return suggestions;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<XmlElement> getTagComparisonElements() {
		EList<XmlElement> tagComparisonElements = new BasicEList<XmlElement>();
		EList<Comparison> comparisons = new BasicEList<Comparison>();
		comparisons.addAll(getComparison1());
		comparisons.addAll(getComparison2());
		for(Comparison comparison : comparisons) {
			if(comparison.getOption() != null && comparison.getOption().getValue() == ComparisonOperator.EQUAL && comparison.isPrimitive()) {
				boolean isTagProperty = false;
				if(comparison.getArgument1() instanceof XmlProperty) {
					XmlProperty property = (XmlProperty) comparison.getArgument1();
					if(property.getOption().getValue() == PropertyKind.TAG) {
						isTagProperty = true;
					}
				}
				if(comparison.getArgument2() instanceof XmlProperty) {
					XmlProperty property = (XmlProperty) comparison.getArgument2();
					if(property.getOption().getValue() == PropertyKind.TAG) {
						isTagProperty = true;
					}
				}
				if(isTagProperty && comparison.getNodes().size() == 1 && comparison.getNodes().get(0) instanceof XmlElement) {
					tagComparisonElements.add((XmlElement) comparison.getNodes().get(0));
				}
			}
		}
		return tagComparisonElements;
	}

} //XSTypeImpl
