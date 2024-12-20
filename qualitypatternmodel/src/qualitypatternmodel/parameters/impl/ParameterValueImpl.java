/**
 */
package qualitypatternmodel.parameters.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionneo4j.NeoLabel;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNameParam;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.impl.NodeImpl;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.DateParam;
import qualitypatternmodel.parameters.DateTimeParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TimeParam;
import qualitypatternmodel.textrepresentation.ParameterReference;
import qualitypatternmodel.utility.Constants;

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
	private static final String A_UNTYPED_PARAMETER_CAN_NOT_REPLACED_BY_A_NEO_PARAMETER = "A UntypedParamter can not replaced by a NeoParameter";
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
		return getPrimitiveComparisonPropertyKinds().contains(XmlPropertyKind.TAG);
	}

	protected EList<XmlPropertyKind> getPrimitiveComparisonPropertyKinds() {
		EList<XmlPropertyKind> xmlPropertyKinds = new BasicEList<XmlPropertyKind>();
		EList<Comparison> comparisons = new BasicEList<Comparison>();
		comparisons.addAll(getComparison1());
		comparisons.addAll(getComparison2());

		for(Comparison comparison : comparisons) {
			if(comparison.isPrimitive()) {

				if(comparison.getArgument1() instanceof XmlProperty && comparison.getArgument2() == this) {
					XmlProperty property = (XmlProperty) comparison.getArgument1();
					for(Relation r : property.getIncoming()) {
						if (r instanceof XmlElementNavigation) {
							XmlElementNavigation nav = (XmlElementNavigation) r;
							if(nav.getXmlPathParam() != null && nav.getXmlPathParam().getXmlPropertyOptionParam() != null) {
								xmlPropertyKinds.add(nav.getXmlPathParam().getXmlPropertyOptionParam().getValue());
							}
						}
						if (r instanceof XmlPropertyNavigation) {
							XmlPropertyNavigation nav = (XmlPropertyNavigation) r;
							if(nav.getXmlPathParam() != null && nav.getXmlPathParam().getXmlPropertyOptionParam() != null) {
								xmlPropertyKinds.add(nav.getXmlPathParam().getXmlPropertyOptionParam().getValue());
							}
						}
					}
				}

				if(comparison.getArgument1() == this && comparison.getArgument2() instanceof XmlProperty) {
					XmlProperty property = (XmlProperty) comparison.getArgument2();
					for(Relation r : property.getIncoming()) {
						if (r instanceof XmlElementNavigation) {
							XmlElementNavigation nav = (XmlElementNavigation) r;
							if(nav.getXmlPathParam() != null && nav.getXmlPathParam().getXmlPropertyOptionParam() != null) {
								xmlPropertyKinds.add(nav.getXmlPathParam().getXmlPropertyOptionParam().getValue());
							}
						}
						if (r instanceof XmlPropertyNavigation) {
							XmlPropertyNavigation nav = (XmlPropertyNavigation) r;
							if(nav.getXmlPathParam() != null && nav.getXmlPathParam().getXmlPropertyOptionParam() != null) {
								xmlPropertyKinds.add(nav.getXmlPathParam().getXmlPropertyOptionParam().getValue());
							}
						}
					}
				}

			}
		}
		// TextLiteralParam overrides: if in XmlAxisParam it adds TAG
		return xmlPropertyKinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isInAttributeComparison() {
		return getPrimitiveComparisonPropertyKinds().contains(XmlPropertyKind.ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isInDataComparison() {
		return getPrimitiveComparisonPropertyKinds().contains(XmlPropertyKind.DATA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	@Override
	public ReturnType getReturnType() {
		return ReturnType.UNSPECIFIED;
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
	 * @generated NOT
	 */
	@Override
	public Comparison addComparison(qualitypatternmodel.graphstructure.Comparable comparable) {
		if (comparable instanceof NodeImpl)
			try {
				comparable = ((NodeImpl) comparable).makePrimitive();
			} catch (InvalidityException e) {
				throw new RuntimeException("Adding Condition Failed: comparable is a generic Node");
			}
		if (comparable == null) {
			throw new RuntimeException("Adding Condition Failed: comparable is null");
		}
		Graph comparableGraph = null;
		if (comparable instanceof Node)
			comparableGraph = ((Node) comparable).getGraph();
		else if (comparable instanceof Operator)
			comparableGraph = ((Operator) comparable).getOperatorList().getGraph();
		else if (comparable instanceof ParameterValue) {
			comparableGraph = null;
		}
		else {
			throw new RuntimeException("Class not expected: " + comparable.getClass());
		}
		if (comparableGraph == null)
			throw new RuntimeException("Adding Condition Failed: arguments have no Graph specified");
		if (ReturnType.isCompatible(this, comparable)) {
			try {
				Comparison comparison = new ComparisonImpl();
				
				Graph graph = comparableGraph;
				OperatorList oplist = graph.getOperatorList();

				comparison.createParameters();
				comparison.setArgument1(this);
				comparison.setArgument2(comparable);
				oplist.add(comparison);

				return comparison;
			} catch (Exception e) {
				throw new RuntimeException("Adding Condition Failed: " + e.getMessage());
			}
		} else
			throw new RuntimeException("Adding Condition Failed: Incompatible comparables");
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
				case GraphstructurePackage.COMPARABLE___VALIDATE__DIAGNOSTICCHAIN_MAP: return ParametersPackage.PARAMETER_VALUE___VALIDATE__DIAGNOSTICCHAIN_MAP;
				case GraphstructurePackage.COMPARABLE___GET_RETURN_TYPE: return ParametersPackage.PARAMETER_VALUE___GET_RETURN_TYPE;
				case GraphstructurePackage.COMPARABLE___IS_TRANSLATABLE: return ParametersPackage.PARAMETER_VALUE___IS_TRANSLATABLE;
				case GraphstructurePackage.COMPARABLE___GET_ALL_ARGUMENT_ELEMENTS: return ParametersPackage.PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS;
				case GraphstructurePackage.COMPARABLE___IS_OPERATOR_ARGUMENT: return ParametersPackage.PARAMETER_VALUE___IS_OPERATOR_ARGUMENT;
				case GraphstructurePackage.COMPARABLE___ADD_COMPARISON__COMPARABLE: return ParametersPackage.PARAMETER_VALUE___ADD_COMPARISON__COMPARABLE;
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
			case ParametersPackage.PARAMETER_VALUE___REPLACE__PARAMETERVALUE:
				try {
					replace((ParameterValue)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ParametersPackage.PARAMETER_VALUE___REPLACE_VIA_VALUE__STRING_STRING:
				try {
					replaceViaValue((String[])arguments.get(0), (String)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ParametersPackage.PARAMETER_VALUE___IS_IN_DATA_COMPARISON:
				return isInDataComparison();
			case ParametersPackage.PARAMETER_VALUE___IS_IN_TAG_COMPARISON:
				return isInTagComparison();
			case ParametersPackage.PARAMETER_VALUE___IS_IN_ATTRIBUTE_COMPARISON:
				return isInAttributeComparison();
			case ParametersPackage.PARAMETER_VALUE___GET_RETURN_TYPE:
				return getReturnType();
			case ParametersPackage.PARAMETER_VALUE___IS_TRANSLATABLE:
				return isTranslatable();
			case ParametersPackage.PARAMETER_VALUE___GET_ALL_ARGUMENT_ELEMENTS:
				return getAllArgumentElements();
			case ParametersPackage.PARAMETER_VALUE___IS_OPERATOR_ARGUMENT:
				return isOperatorArgument();
			case ParametersPackage.PARAMETER_VALUE___ADD_COMPARISON__COMPARABLE:
				return addComparison((qualitypatternmodel.graphstructure.Comparable)arguments.get(0));
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
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void replace(ParameterValue concreteValue) throws InvalidityException {
		if (isNeoParam(concreteValue)) {
			throw new InvalidityException(A_UNTYPED_PARAMETER_CAN_NOT_REPLACED_BY_A_NEO_PARAMETER);
		}
		if (isTypeModifiable()) {

			int index = getParameterList().getParameters().indexOf(this);
			if (concreteValue.getParameterList() != getParameterList()) {
				getParameterList().getParameters().set(index, concreteValue);
			} else {
				getParameterList().getParameters().remove(index);
			}

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
				fragment.getParameter().remove(this);
				fragment.getParameter().add(concreteValue);
			}

			concreteValue.setTypeModifiable(true);
		}
	}

	/**
	 * @author Lukas Sebastian Hofmann
	 * @param concreteValue
	 * @return boolean
	 * This method checks if a NeoParam shall be replacing a UntypedParamter
	 */
	private boolean isNeoParam(ParameterValue concreteValue) {
		return concreteValue instanceof NeoLabel || concreteValue instanceof NeoPropertyNameParam;
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

}
