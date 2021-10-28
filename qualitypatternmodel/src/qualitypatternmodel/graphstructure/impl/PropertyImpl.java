/**
 */
package qualitypatternmodel.graphstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.basex.core.BaseXException;
import org.basex.core.Context;
import org.basex.core.cmd.XQuery;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.impl.ComparisonImpl;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.DateTimeParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TimeParamImpl;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.impl.PatternElementImpl;

import static qualitypatternmodel.operators.ComparisonOperator.*;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getComparison1 <em>Comparison1</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getComparison2 <em>Comparison2</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getElement <em>Element</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PropertyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends PatternElementImpl implements Property {
	/**
	 * The cached value of the '{@link #getComparison1() <em>Comparison1</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>Comparisons</code> that have <code>this</code> as their first argument.
	 * <!-- end-user-doc -->
	 * @see #getComparison1()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison1;

	/**
	 * The cached value of the '{@link #getComparison2() <em>Comparison2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>Comparisons</code> that have <code>this</code> as their second argument.
	 * <!-- end-user-doc -->
	 * @see #getComparison2()
	 * @generated
	 * @ordered
	 */
	protected EList<Comparison> comparison2;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * A list of <code>Matches</code> that have <code>this</code> as their argument.
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> match;

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
	 * The name of <code>this</code> <code>Property</code>.
	 * Is only used for the visualization, not for internal purposes.
	 * Has default value but can be modified by users.
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}
	
	@Override
	public void isValid (AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getClass().equals(PropertyImpl.class) && abstractionLevel.getValue() > AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("generic class in non-generic pattern");
		super.isValid(abstractionLevel);
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {}	
	
	@Override
	public PatternElement createXMLAdaption() {
		if(!(this instanceof XmlProperty)) {
			XmlProperty xmlProperty = new XmlPropertyImpl();			 
			xmlProperty.setElement(getElement());
			
			if(getName().matches("Property [0-9]+")) {
				xmlProperty.setName(getName().replace("Property", "XmlProperty"));
			} else {
				xmlProperty.setName(getName());
			}
			
			xmlProperty.createParameters();
			
			xmlProperty.getMatch().addAll(getMatch());
			getMatch().clear();			
			
			xmlProperty.getComparison1().addAll(getComparison1());
			getComparison1().clear();
			xmlProperty.getComparison2().addAll(getComparison2());
			getComparison2().clear();

			setElement(null);
			
			return xmlProperty;
		}
		return this;
	}	
	
	@Override
	public ReturnType getReturnType() {
		return ReturnType.UNSPECIFIED;
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * 
	 */
	@Override
	public EList<Element> getAllArgumentElements() {		
		return getElement().getAllArgumentElements();
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		return new BasicEList<PatternElement>();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphstructurePackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Comparison> getComparison1() {
		if (comparison1 == null) {
			comparison1 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.PROPERTY__COMPARISON1, OperatorsPackage.COMPARISON__ARGUMENT1);
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
			comparison2 = new EObjectWithInverseResolvingEList<Comparison>(Comparison.class, this, GraphstructurePackage.PROPERTY__COMPARISON2, OperatorsPackage.COMPARISON__ARGUMENT2);
		}
		return comparison2;
	}

	

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getElement() {
		if (eContainerFeatureID() != GraphstructurePackage.PROPERTY__ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement(Element newElement) {
		if (newElement != eInternalContainer() || (eContainerFeatureID() != GraphstructurePackage.PROPERTY__ELEMENT && newElement != null)) {
			if (EcoreUtil.isAncestor(this, newElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, GraphstructurePackage.ELEMENT__PROPERTIES, Element.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetElement(Element newElement, NotificationChain msgs) {
		triggerParameterUpdates(newElement);
		
		if (newElement == null || getElement() != null && !newElement.equals(getElement())) {
//			EList<Match> matches = new BasicEList<Match>();
//			matches.addAll(getMatch());
//			for(Match match : matches) {
//				match.reset();
//			}
//			EList<Comparison> comparisons = new BasicEList<Comparison>();
//			comparisons.addAll(getComparison1());
//			comparisons.addAll(getComparison2());
//			for(Comparison comp : comparisons) {
//				comp.reset();
//			}
			
//			getMatch().clear();
//			getComparison1().clear();
//			getComparison2().clear();
			
		}
		
		msgs = eBasicSetContainer((InternalEObject)newElement, GraphstructurePackage.PROPERTY__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Property copy() {
		Property newProperty = new PropertyImpl();		
		return newProperty;
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Comparison addComparison() {
		Comparison comparison = new ComparisonImpl();
		comparison.setOperatorList(getElement().getGraph().getOperatorList());
		comparison.createParameters();
		comparison.setArgument1(this);
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isOperatorArgument() {
		return !getComparison1().isEmpty() || !getComparison2().isEmpty() || !getMatch().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void checkComparisonConsistency(ParameterValue param) throws InvalidityException {
		String value = param.getValueAsString();
		Comparison effectedComp = null;
		ComparisonOperator op = null;
		for(Comparison comp1 : getComparison1()) {
			if(comp1.getArgument2().equals(param)) {
				effectedComp = comp1;
				op = effectedComp.getOption().getValue();
				break;
			}
		}
		for(Comparison comp2 : getComparison2()) {
			if(comp2.getArgument1().equals(param)) {
				effectedComp = comp2;
				op = effectedComp.getOption().getValue();
				op = reverseOperator(op);
				break;
			}
		}
		if(effectedComp == null || op == null) {
			return;
		}
		EList<Property> equivalentProperties = getEquivalentProperties();
		for(Property equiProp : equivalentProperties) {
			for(Comparison compOther : equiProp.getComparison1()) {
				if(compOther == null) {
					return;
				}
				if(!compOther.equals(effectedComp)) {
					ComparisonOperator otherOp = compOther.getOption().getValue();
					if(otherOp == null) {
						return;
					}
					Comparable argument2 = compOther.getArgument2();
					ParameterValue otherParam;
					if(argument2 instanceof ParameterValue) {
						otherParam = (ParameterValue) argument2;
						String otherValue = otherParam.getValueAsString();
						if(otherValue == null) {
							return;
						}
						checkPropertyParameterComparisonConstraints(param, value, op, otherParam, otherValue, otherOp);					
					}
				}
			}
			
			for(Comparison compOther : equiProp.getComparison2()) {
				if(compOther == null) {
					return;
				}
				if(!compOther.equals(effectedComp)) {
					ComparisonOperator otherOp = compOther.getOption().getValue();
					if(otherOp == null) {
						return;
					}
					otherOp = reverseOperator(otherOp);
					
					Comparable argument1 = compOther.getArgument1();
					ParameterValue otherParam;
					if(argument1 instanceof ParameterValue) {
						otherParam = (ParameterValue) argument1;
						String otherValue = otherParam.getValueAsString();
						if(otherValue == null) {
							return;
						}
						checkPropertyParameterComparisonConstraints(param, value, op, otherParam, otherValue, otherOp);					
					}
				}
			}
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void checkComparisonConsistency(Comparison comp) throws InvalidityException {
		ComparisonOperator op = comp.getOption().getValue();
		if(op == null) {
			return;
		}
		
		Comparable argument1 = comp.getArgument1();
		Comparable argument2 = comp.getArgument2();
		
		if(!argument1.equals(this) && !argument2.equals(this) || argument1.equals(this) && argument2.equals(this)) {
			return;
		}	
		
		if(argument1.equals(this)) {
			if(argument2 instanceof ParameterValue) {
				ParameterValue param = (ParameterValue) argument2;
				checkComparisonConsistency(param);
			} else if(argument2 instanceof Property) {
				Property otherProp = (Property) argument2;
				EList<Property> equivalentProperties = getEquivalentProperties();
				EList<Property> otherEquivalentProperties = otherProp.getEquivalentProperties();
				for(Property equiProp : equivalentProperties) {
					for(Comparison compOther : equiProp.getComparison1()) {
						if(!compOther.equals(comp)) {
							if(otherEquivalentProperties.contains(compOther.getArgument2())) {
								ComparisonOperator otherOp = compOther.getOption().getValue();
								checkPropertyPropertyComparisonConstraints(op, otherOp);
							}
						}
					}
					for(Comparison compOther : equiProp.getComparison2()) {
						if(!compOther.equals(comp)) {
							if(otherEquivalentProperties.contains(compOther.getArgument1())) {
								ComparisonOperator otherOp = compOther.getOption().getValue();
								otherOp = reverseOperator(otherOp);							
								checkPropertyPropertyComparisonConstraints(op, otherOp);
							}
						}
					}
				}
			}
		}
		if(argument2.equals(this)) {
			if(argument1 instanceof ParameterValue) {
				ParameterValue param = (ParameterValue) argument1;
				checkComparisonConsistency(param);
			} else if(argument1 instanceof Property) {
				Property otherProp = (Property) argument1;
				EList<Property> equivalentProperties = getEquivalentProperties();
				EList<Property> otherEquivalentProperties = otherProp.getEquivalentProperties();
				for(Property equiProp : equivalentProperties) {
					for(Comparison compOther : equiProp.getComparison1()) {
						if(!compOther.equals(comp)) {
							if(otherEquivalentProperties.contains(compOther.getArgument2())) {
								ComparisonOperator otherOp = compOther.getOption().getValue();
								op = reverseOperator(op);
								checkPropertyPropertyComparisonConstraints(op, otherOp);
							}
						}
					}
					for(Comparison compOther : equiProp.getComparison2()) {
						if(!compOther.equals(comp)) {
							if(otherEquivalentProperties.contains(compOther.getArgument1())) {
								ComparisonOperator otherOp = compOther.getOption().getValue();
								op = reverseOperator(op);
								otherOp = reverseOperator(otherOp);							
								checkPropertyPropertyComparisonConstraints(op, otherOp);
							}
						}
					}
				}
			}			
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getEquivalentProperties() {
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
	public void checkComparisonConsistency() throws InvalidityException {
		for(Comparison comp : getComparison1()) {
			checkComparisonConsistency(comp);
		}
		for(Comparison comp : getComparison2()) {
			checkComparisonConsistency(comp);
		}			
	}

	private void checkPropertyPropertyComparisonConstraints(ComparisonOperator op, ComparisonOperator otherOp)
			throws InvalidityException {
		if(op == EQUAL && otherOp == NOTEQUAL || op == NOTEQUAL && otherOp == EQUAL) {
			throw new InvalidityException("Requiring that a property is equal and unequal to another property will always yield false");
		}
		if(op == GREATER && otherOp == LESS || op == LESS && otherOp == GREATER) {
			throw new InvalidityException("Requiring that a property is smaller and greater to another property will always yield false");
		}
		if(op == GREATEROREQUAL && otherOp == LESS || op == LESS && otherOp == GREATEROREQUAL) {
			throw new InvalidityException("Requiring that a property is smaller and greater or equal to another property will always yield false");
		}
		if(op == GREATER && otherOp == LESSOREQUAL || op == LESSOREQUAL && otherOp == GREATER) {
			throw new InvalidityException("Requiring that a property is smaller or equal and greater to another property will always yield false");
		}		
		if(op == EQUAL && otherOp == GREATER || op == GREATER && otherOp == EQUAL) {
			throw new InvalidityException("Requiring that a property is equal and greater to another property will always yield false");
		}
		if(op == LESS && otherOp == GREATER || op == GREATER && otherOp == LESS) {
			throw new InvalidityException("Requiring that a property is smaller and greater to another property will always yield false");
		}
	}

	private ComparisonOperator reverseOperator(ComparisonOperator otherOp) {
		if(otherOp == GREATER) {
			otherOp = LESS;
		} else if(otherOp == LESS) {
			otherOp = GREATER;
		} else if(otherOp == GREATEROREQUAL) {
			otherOp = LESSOREQUAL;
		} else if(otherOp == LESSOREQUAL) {
			otherOp = GREATEROREQUAL;
		}
		return otherOp;
	}

	private void checkPropertyParameterComparisonConstraints(ParameterValue parameterValue, String value, ComparisonOperator op,
			ParameterValue otherParam, String otherValue, ComparisonOperator otherOp) throws InvalidityException {
		if(value == null || otherValue == null) {
			return;
		}
		if(op == EQUAL && otherOp == EQUAL && !value.equals(otherValue)) {
			throw new InvalidityException("Requiring that a property is equal to two different values will always yield false");						
		}
		if((op == EQUAL && otherOp == NOTEQUAL || op == NOTEQUAL && otherOp == EQUAL) && value.equals(otherValue)) {
			throw new InvalidityException("Requiring that a property is equal and unequal to the same value will always yield false");
		}
		if(op == LESS && otherOp == GREATER && parameterValue.getClass().equals(otherParam.getClass()) && lessOrEqual(parameterValue.getClass(), value, otherValue)) {
			throw new InvalidityException("Requiring that a property is < X and > Y with X <= Y will always yield false");
		}
		if(op == GREATER && otherOp == LESS && parameterValue.getClass().equals(otherParam.getClass()) && lessOrEqual(parameterValue.getClass(), otherValue, value)) {
			throw new InvalidityException("Requiring that a property is < X and > Y with X <= Y will always yield false");
		}
		if(op == LESSOREQUAL && otherOp == GREATER && parameterValue.getClass().equals(otherParam.getClass()) && lessOrEqual(parameterValue.getClass(), value, otherValue)) {
			throw new InvalidityException("Requiring that a property is <= X and > Y with X <= Y will always yield false");
		}
		if(op == GREATER && otherOp == LESSOREQUAL && parameterValue.getClass().equals(otherParam.getClass()) && lessOrEqual(parameterValue.getClass(), otherValue, value)) {
			throw new InvalidityException("Requiring that a property is <= X and > Y with X <= Y will always yield false");
		}
		
		if(op == LESS && otherOp == GREATEROREQUAL && parameterValue.getClass().equals(otherParam.getClass()) && lessOrEqual(parameterValue.getClass(), value, otherValue)) {
			throw new InvalidityException("Requiring that a property is <= X and > Y with X <= Y will always yield false");
		}
		if(op == GREATEROREQUAL && otherOp == LESS && parameterValue.getClass().equals(otherParam.getClass()) && lessOrEqual(parameterValue.getClass(), otherValue, value)) {
			throw new InvalidityException("Requiring that a property is < X and >= Y with X <= Y will always yield false");
		}
		
		if(op == LESSOREQUAL && otherOp == GREATEROREQUAL && parameterValue.getClass().equals(otherParam.getClass()) && less(parameterValue.getClass(), value, otherValue)) {
			throw new InvalidityException("Requiring that a property is <= X and >= Y with X < Y will always yield false");
		}
		if(op == GREATEROREQUAL && otherOp == LESSOREQUAL && parameterValue.getClass().equals(otherParam.getClass()) && less(parameterValue.getClass(), otherValue, value)) {
			throw new InvalidityException("Requiring that a property is <= X and >= Y with X < Y will always yield false");
		}		
		
		if(op == EQUAL && otherOp == GREATER && parameterValue.getClass().equals(otherParam.getClass()) && lessOrEqual(parameterValue.getClass(), value, otherValue)) {
			throw new InvalidityException("Requiring that a property is = X and > Y with X <= Y will always yield false");
		}
		if(op == GREATER && otherOp == EQUAL && parameterValue.getClass().equals(otherParam.getClass()) && lessOrEqual(parameterValue.getClass(), otherValue, value)) {
			throw new InvalidityException("Requiring that a property is = X and > Y with X <= Y will always yield false");
		}		
		if(op == EQUAL && otherOp == LESS && parameterValue.getClass().equals(otherParam.getClass()) && lessOrEqual(parameterValue.getClass(), otherValue, value)) {
			throw new InvalidityException("Requiring that a property is = X and < Y with X >= Y will always yield false");
		}
		if(op == LESS && otherOp == EQUAL && parameterValue.getClass().equals(otherParam.getClass()) && lessOrEqual(parameterValue.getClass(), value, otherValue)) {
			throw new InvalidityException("Requiring that a property is = X and < Y with X >= Y will always yield false");
		}		
		
		if(op == EQUAL && otherOp == GREATEROREQUAL && parameterValue.getClass().equals(otherParam.getClass()) && less(parameterValue.getClass(), value, otherValue)) {
			throw new InvalidityException("Requiring that a property is = X and >= Y with X < Y will always yield false");
		}
		if(op == GREATEROREQUAL && otherOp == EQUAL && parameterValue.getClass().equals(otherParam.getClass()) && less(parameterValue.getClass(), otherValue, value)) {
			throw new InvalidityException("Requiring that a property is = X and >= Y with X < Y will always yield false");
		}		
		if(op == EQUAL && otherOp == LESSOREQUAL && parameterValue.getClass().equals(otherParam.getClass()) && less(parameterValue.getClass(), otherValue, value)) {
			throw new InvalidityException("Requiring that a property is = X and <= Y with X > Y will always yield false");
		}
		if(op == LESSOREQUAL && otherOp == EQUAL && parameterValue.getClass().equals(otherParam.getClass()) && less(parameterValue.getClass(), value, otherValue)) {
			throw new InvalidityException("Requiring that a property is = X and <= Y with X > Y will always yield false");
		}
	}


	private boolean less(Class<? extends ParameterValue> class1, String value, String otherValue) {
		if(class1.equals(TextLiteralParamImpl.class)) {
			return value.compareTo(otherValue) < 0;
		}
		if(class1.equals(TextListParamImpl.class)) {
			return false;
		}
		if(class1.equals(NumberParamImpl.class)) {
			return Integer.parseInt(value) < Integer.parseInt(otherValue);
		}
		if(class1.equals(BooleanParamImpl.class)) {
			return (Boolean.parseBoolean(value) ? 1 : 0) < (Boolean.parseBoolean(otherValue) ? 1 : 0);
		}
		if(class1.equals(DateParamImpl.class)) {
			String query = "xs:date('" + value + "') < xs:date('" + otherValue + "')";
			Context context = new Context();
			XQuery xquery = new XQuery(query);
			try {
				String queryResult = xquery.execute(context);
				if(queryResult.equals("true")) {
					return true;
				} else {
					return false;
				}
			} catch (BaseXException e) {
				return false;
			}
		}
		if(class1.equals(TimeParamImpl.class)) {
			String query = "xs:time('" + value + "') < xs:time('" + otherValue + "')";
			Context context = new Context();
			XQuery xquery = new XQuery(query);
			try {
				String queryResult = xquery.execute(context);
				if(queryResult.equals("true")) {
					return true;
				} else {
					return false;
				}
			} catch (BaseXException e) {
				return false;
			}
		}
		if(class1.equals(DateTimeParamImpl.class)) {
			String query = "xs:dateTime('" + value + "') < xs:dateTime('" + otherValue + "')";
			Context context = new Context();
			XQuery xquery = new XQuery(query);
			try {
				String queryResult = xquery.execute(context);
				if(queryResult.equals("true")) {
					return true;
				} else {
					return false;
				}
			} catch (BaseXException e) {
				return false;
			}
		}
		
		return false;
	}

	private boolean lessOrEqual(Class<? extends ParameterValue> class1, String value, String otherValue) {
		if(class1.equals(TextLiteralParamImpl.class)) {
			return value.compareTo(otherValue) <= 0;
		}
		if(class1.equals(TextListParamImpl.class)) {
			return false;
		}
		if(class1.equals(NumberParamImpl.class)) {
			return Double.parseDouble(value) <= Double.parseDouble(otherValue);
		}
		if(class1.equals(BooleanParamImpl.class)) {
			return (Boolean.parseBoolean(value) ? 1 : 0) <= (Boolean.parseBoolean(otherValue) ? 1 : 0);
		}
		if(class1.equals(DateParamImpl.class)) {
			String query = "xs:date('" + value + "') <= xs:date('" + otherValue + "')";
			Context context = new Context();
			XQuery xquery = new XQuery(query);
			try {
				String queryResult = xquery.execute(context);
				if(queryResult.equals("true")) {
					return true;
				} else {
					return false;
				}
			} catch (BaseXException e) {
				return false;
			}
		}
		if(class1.equals(TimeParamImpl.class)) {
			String query = "xs:time('" + value + "') <= xs:time('" + otherValue + "')";
			Context context = new Context();
			XQuery xquery = new XQuery(query);
			try {
				String queryResult = xquery.execute(context);
				if(queryResult.equals("true")) {
					return true;
				} else {
					return false;
				}
			} catch (BaseXException e) {
				return false;
			}
		}
		if(class1.equals(DateTimeParamImpl.class)) {
			String query = "xs:dateTime('" + value + "') <= xs:dateTime('" + otherValue + "')";
			Context context = new Context();
			XQuery xquery = new XQuery(query);
			try {
				String queryResult = xquery.execute(context);
				if(queryResult.equals("true")) {
					return true;
				} else {
					return false;
				}
			} catch (BaseXException e) {
				return false;
			}
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Match> getMatch() {
		if (match == null) {
			match = new EObjectWithInverseResolvingEList<Match>(Match.class, this, GraphstructurePackage.PROPERTY__MATCH, OperatorsPackage.MATCH__PROPERTY);
		}
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if(name == null || name.equals("")) {
			if(getInternalId() > -1) {
				name = "Property " + getInternalId();
				return name;
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setName(String newName) {
		if(newName == null || newName.equals("")) {
			if(getInternalId() > -1) {
				newName = "Property " + getInternalId();				
			} else {
				return;
			}
		}
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PROPERTY__NAME, oldName, name));
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
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison1()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComparison2()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElement((Element)otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__MATCH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatch()).basicAdd(otherEnd, msgs);
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
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				return ((InternalEList<?>)getComparison1()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				return ((InternalEList<?>)getComparison2()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return basicSetElement(null, msgs);
			case GraphstructurePackage.PROPERTY__MATCH:
				return ((InternalEList<?>)getMatch()).basicRemove(otherEnd, msgs);
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
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return eInternalContainer().eInverseRemove(this, GraphstructurePackage.ELEMENT__PROPERTIES, Element.class, msgs);
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
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				return getComparison1();
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				return getComparison2();
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return getElement();
			case GraphstructurePackage.PROPERTY__MATCH:
				return getMatch();
			case GraphstructurePackage.PROPERTY__NAME:
				return getName();
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
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				getComparison1().clear();
				getComparison1().addAll((Collection<? extends Comparison>)newValue);
				return;
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				getComparison2().clear();
				getComparison2().addAll((Collection<? extends Comparison>)newValue);
				return;
			case GraphstructurePackage.PROPERTY__ELEMENT:
				setElement((Element)newValue);
				return;
			case GraphstructurePackage.PROPERTY__MATCH:
				getMatch().clear();
				getMatch().addAll((Collection<? extends Match>)newValue);
				return;
			case GraphstructurePackage.PROPERTY__NAME:
				setName((String)newValue);
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
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				getComparison1().clear();
				return;
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				getComparison2().clear();
				return;
			case GraphstructurePackage.PROPERTY__ELEMENT:
				setElement((Element)null);
				return;
			case GraphstructurePackage.PROPERTY__MATCH:
				getMatch().clear();
				return;
			case GraphstructurePackage.PROPERTY__NAME:
				setName(NAME_EDEFAULT);
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
			case GraphstructurePackage.PROPERTY__COMPARISON1:
				return comparison1 != null && !comparison1.isEmpty();
			case GraphstructurePackage.PROPERTY__COMPARISON2:
				return comparison2 != null && !comparison2.isEmpty();
			case GraphstructurePackage.PROPERTY__ELEMENT:
				return getElement() != null;
			case GraphstructurePackage.PROPERTY__MATCH:
				return match != null && !match.isEmpty();
			case GraphstructurePackage.PROPERTY__NAME:
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return GraphstructurePackage.PROPERTY___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return GraphstructurePackage.PROPERTY___CREATE_PARAMETERS;
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
			case GraphstructurePackage.PROPERTY___COPY:
				return copy();
			case GraphstructurePackage.PROPERTY___ADD_COMPARISON:
				return addComparison();
			case GraphstructurePackage.PROPERTY___IS_OPERATOR_ARGUMENT:
				return isOperatorArgument();
			case GraphstructurePackage.PROPERTY___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE:
				try {
					checkComparisonConsistency((ParameterValue)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.PROPERTY___CHECK_COMPARISON_CONSISTENCY__COMPARISON:
				try {
					checkComparisonConsistency((Comparison)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.PROPERTY___GET_EQUIVALENT_PROPERTIES:
				return getEquivalentProperties();
			case GraphstructurePackage.PROPERTY___CHECK_COMPARISON_CONSISTENCY:
				try {
					checkComparisonConsistency();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case GraphstructurePackage.PROPERTY___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
			case GraphstructurePackage.PROPERTY___CREATE_PARAMETERS:
				createParameters();
				return null;
			case GraphstructurePackage.PROPERTY___GET_RETURN_TYPE:
				return getReturnType();
			case GraphstructurePackage.PROPERTY___IS_TRANSLATABLE:
				return isTranslatable();
			case GraphstructurePackage.PROPERTY___GET_ALL_ARGUMENT_ELEMENTS:
				return getAllArgumentElements();
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

	@Override
	public String myToString() {
		String res = this.getClass().getSimpleName() + " [" + getInternalId() + "]";
		return res;
	}

	@Override
	public boolean isTranslatable() {
		return false;
	}

	@Override
	public void removeParametersFromParameterList() {

	}

	@Override
	public void createParameters() {

	}

} // PropertyImpl
