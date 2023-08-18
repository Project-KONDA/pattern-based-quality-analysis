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
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.operators.NullCheck;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.DateTimeParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TimeParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;

import static qualitypatternmodel.operators.ComparisonOperator.*;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Property</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl#getNullCheck <em>Null Check</em>}</li>
 *   <li>{@link qualitypatternmodel.graphstructure.impl.PrimitiveNodeImpl#getStringLength <em>String Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveNodeImpl extends NodeImpl implements PrimitiveNode {
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
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Contains> contains;

	/**
	 * The cached value of the '{@link #getNullCheck() <em>Null Check</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullCheck()
	 * @generated
	 * @ordered
	 */
	protected NullCheck nullCheck;

	/**
	 * The cached value of the '{@link #getStringLength() <em>String Length</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringLength()
	 * @generated
	 * @ordered
	 */
	protected EList<StringLength> stringLength;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveNodeImpl() {
		super();
	}
	
	
	@Override
	public void isValid (AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (getClass().equals(PrimitiveNodeImpl.class) && abstractionLevel.getValue() > AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("generic class in non-generic pattern");
		super.isValid(abstractionLevel);
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {}	
	
	@Override
	public PatternElement createXmlAdaption() throws InvalidityException {
		return adaptAsXmlProperty();
	}
	
	@Override
	public PatternElement createRdfAdaption() throws InvalidityException {
		return adaptAsRdfLiteralNode();
	}
	
	/**
	 * @author Lukas Sebastian Hofmann
	 * @return PatternElement
	 * @throws InvalidityException
	 * A PrimitiveNode will be converted to a NeoPropertyNode.
	 */
	@Override 
	public PatternElement createNeo4jAdaption() throws InvalidityException {
		return adaptAsNeoPropertyNode();
	}
	
	@Override
	public XmlElement adaptAsXmlElement() throws InvalidityException {
		if(isTypeModifiable()) {
			return super.adaptAsXmlElement();
		} else {
			throw new InvalidityException("This PrimitiveNode cannot be adapted as an XmlElement");
		}
	}
	
	@Override
	public XmlProperty adaptAsXmlProperty() throws InvalidityException {
		XmlProperty xmlProperty = super.adaptAsXmlProperty();
		if(xmlProperty instanceof XmlPropertyImpl) {
			((XmlPropertyImpl) xmlProperty).typeModifiable = false;
		}
		return xmlProperty;
	}
	
	@Override
	public ReturnType getReturnType() {
		return ReturnType.UNSPECIFIED;
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
		return GraphstructurePackage.Literals.PRIMITIVE_NODE;
	}

	@Override
	public boolean isOperatorArgument() {
		return !getComparison1().isEmpty() || !getComparison2().isEmpty() || !getMatch().isEmpty() || !(getNullCheck() != null) || !getStringLength().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void checkComparisonConsistency(ParameterValue param) throws InvalidityException {
//		String value = 
		param.getValueAsString();
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
	}

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
			}
		}
		if(argument2.equals(this)) {
			if(argument1 instanceof ParameterValue) {
				ParameterValue param = (ParameterValue) argument1;
				checkComparisonConsistency(param);
			}			
		}		
	}
	
	@Override
	public Relation addOutgoing(Graph graph) throws InvalidityException {
		throw new InvalidityException("PrimitiveNodes can not have subnodes.");
	}
	
	@Override
	public Relation addOutgoing(Node node) throws InvalidityException {
		throw new InvalidityException("PrimitiveNodes can not have subnodes.");
	}
	

	@SuppressWarnings("unused")
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

	@SuppressWarnings("unused")
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
			match = new EObjectWithInverseResolvingEList<Match>(Match.class, this, GraphstructurePackage.PRIMITIVE_NODE__MATCH, OperatorsPackage.MATCH__PRIMITIVE_NODE);
		}
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contains> getContains() {
		if (contains == null) {
			contains = new EObjectWithInverseResolvingEList<Contains>(Contains.class, this, GraphstructurePackage.PRIMITIVE_NODE__CONTAINS, OperatorsPackage.CONTAINS__PRIMITIVE_NODE);
		}
		return contains;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullCheck getNullCheck() {
		if (nullCheck != null && nullCheck.eIsProxy()) {
			InternalEObject oldNullCheck = (InternalEObject)nullCheck;
			nullCheck = (NullCheck)eResolveProxy(oldNullCheck);
			if (nullCheck != oldNullCheck) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK, oldNullCheck, nullCheck));
			}
		}
		return nullCheck;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullCheck basicGetNullCheck() {
		return nullCheck;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullCheck(NullCheck newNullCheck, NotificationChain msgs) {
		NullCheck oldNullCheck = nullCheck;
		nullCheck = newNullCheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK, oldNullCheck, newNullCheck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNullCheck(NullCheck newNullCheck) {
		if (newNullCheck != nullCheck) {
			NotificationChain msgs = null;
			if (nullCheck != null)
				msgs = ((InternalEObject)nullCheck).eInverseRemove(this, OperatorsPackage.NULL_CHECK__PRIMITIVE_NODE, NullCheck.class, msgs);
			if (newNullCheck != null)
				msgs = ((InternalEObject)newNullCheck).eInverseAdd(this, OperatorsPackage.NULL_CHECK__PRIMITIVE_NODE, NullCheck.class, msgs);
			msgs = basicSetNullCheck(newNullCheck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK, newNullCheck, newNullCheck));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringLength> getStringLength() {
		if (stringLength == null) {
			stringLength = new EObjectWithInverseResolvingEList<StringLength>(StringLength.class, this, GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH, OperatorsPackage.STRING_LENGTH__PRIMITIVE_NODE);
		}
		return stringLength;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphstructurePackage.PRIMITIVE_NODE__NAME, oldName, name));
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
			case GraphstructurePackage.PRIMITIVE_NODE__MATCH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatch()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.PRIMITIVE_NODE__CONTAINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContains()).basicAdd(otherEnd, msgs);
			case GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK:
				if (nullCheck != null)
					msgs = ((InternalEObject)nullCheck).eInverseRemove(this, OperatorsPackage.NULL_CHECK__PRIMITIVE_NODE, NullCheck.class, msgs);
				return basicSetNullCheck((NullCheck)otherEnd, msgs);
			case GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStringLength()).basicAdd(otherEnd, msgs);
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
			case GraphstructurePackage.PRIMITIVE_NODE__MATCH:
				return ((InternalEList<?>)getMatch()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.PRIMITIVE_NODE__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK:
				return basicSetNullCheck(null, msgs);
			case GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH:
				return ((InternalEList<?>)getStringLength()).basicRemove(otherEnd, msgs);
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
			case GraphstructurePackage.PRIMITIVE_NODE__MATCH:
				return getMatch();
			case GraphstructurePackage.PRIMITIVE_NODE__CONTAINS:
				return getContains();
			case GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK:
				if (resolve) return getNullCheck();
				return basicGetNullCheck();
			case GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH:
				return getStringLength();
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
			case GraphstructurePackage.PRIMITIVE_NODE__MATCH:
				getMatch().clear();
				getMatch().addAll((Collection<? extends Match>)newValue);
				return;
			case GraphstructurePackage.PRIMITIVE_NODE__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Contains>)newValue);
				return;
			case GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK:
				setNullCheck((NullCheck)newValue);
				return;
			case GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH:
				getStringLength().clear();
				getStringLength().addAll((Collection<? extends StringLength>)newValue);
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
			case GraphstructurePackage.PRIMITIVE_NODE__MATCH:
				getMatch().clear();
				return;
			case GraphstructurePackage.PRIMITIVE_NODE__CONTAINS:
				getContains().clear();
				return;
			case GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK:
				setNullCheck((NullCheck)null);
				return;
			case GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH:
				getStringLength().clear();
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
			case GraphstructurePackage.PRIMITIVE_NODE__MATCH:
				return match != null && !match.isEmpty();
			case GraphstructurePackage.PRIMITIVE_NODE__CONTAINS:
				return contains != null && !contains.isEmpty();
			case GraphstructurePackage.PRIMITIVE_NODE__NULL_CHECK:
				return nullCheck != null;
			case GraphstructurePackage.PRIMITIVE_NODE__STRING_LENGTH:
				return stringLength != null && !stringLength.isEmpty();
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
			case GraphstructurePackage.PRIMITIVE_NODE___CHECK_COMPARISON_CONSISTENCY__PARAMETERVALUE:
				try {
					checkComparisonConsistency((ParameterValue)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public void removeParametersFromParameterList() {

	}

	@Override
	public void createParameters() {

	}

} // PropertyImpl
