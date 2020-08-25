/**
 */
package qualitypatternmodel.operators.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.impl.PropertyImpl;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.NumberOperator;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Comparison</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.impl.ComparisonImpl#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.ComparisonImpl#getArgument2 <em>Argument2</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.ComparisonImpl#getType <em>Type</em>}</li>
 *   <li>{@link qualitypatternmodel.operators.impl.ComparisonImpl#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonImpl extends BooleanOperatorImpl implements Comparison {
	/**
	 * The cached value of the '{@link #getArgument1() <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArgument1()
	 * @generated
	 * @ordered
	 */
	protected qualitypatternmodel.graphstructure.Comparable argument1;

	/**
	 * The cached value of the '{@link #getArgument2() <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArgument2()
	 * @generated
	 * @ordered
	 */
	protected qualitypatternmodel.graphstructure.Comparable argument2;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ReturnType TYPE_EDEFAULT = ReturnType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ReturnType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOptionParam option;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ComparisonImpl() {
		super();
	}

	@Override
	public String generateQuery() throws InvalidityException {
		if (option != null && option.getValue() != null && argument1 != null && argument2 != null) {
			ComparisonOperator operator = option.getValue();
			String conversionStartArgument1 = type.getConversion();
			String conversionEndArgument1 = type.getConversionEnd();
			String argument1Translated = "";
			if (argument1 instanceof XmlElement) {
				argument1Translated = ((XmlElement) argument1).getXQueryRepresentation();
			} else {
				argument1Translated = argument1.generateQuery();
			}
			String conversionStartArgument2 = type.getConversion();
			String conversionEndArgument2 = type.getConversionEnd();
			String argument2Translated = "";
			if (argument2 instanceof XmlElement) {
				argument2Translated = ((XmlElement) argument2).getXQueryRepresentation();
			} else {
				argument2Translated = argument2.generateQuery();
			}			
			if( argument1 instanceof XmlElement && argument2 instanceof XmlElement ) {
				String res = "fn:deep-equal ( " + argument1Translated + ", " + argument2Translated + " )";
				if (operator == ComparisonOperator.EQUAL) {
					return res;
				} else if (operator == ComparisonOperator.NOTEQUAL) {
					return "not ( " + res + ")";					
				}
			}

			if ((argument1 instanceof TextListParam || argument2 instanceof TextListParam)
					&& (getOption().getValue() == ComparisonOperator.NOTEQUAL)) {
				return "not ( " + argument1Translated + " = " + argument2Translated + " )";
			}
			
			return conversionStartArgument1 + argument1Translated + conversionEndArgument1 + operator.getLiteral()
					+ conversionStartArgument2 + argument2Translated + conversionEndArgument2;
		} else {
			throw new InvalidityException("invalid option" + " (" + getInternalId() + ")");
		}
	}

	@Override
	public void isValid(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(abstractionLevel);

		if (argument1 instanceof PropertyImpl || argument1 instanceof OperatorImpl || argument1 instanceof ParameterImpl)
			argument1.isValid(abstractionLevel);
		if (argument2 instanceof PropertyImpl || argument2 instanceof OperatorImpl || argument2 instanceof ParameterImpl)
			argument2.isValid(abstractionLevel);
		option.isValid(abstractionLevel);

	}

	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException {
		if (argument1 == null)
			throw new InvalidityException("argument1 null" + " (" + getInternalId() + ")");
		if (argument2 == null)
			throw new InvalidityException("argument2 null" + " (" + getInternalId() + ")");
		if (option == null)
			throw new InvalidityException("operator options null" + " (" + getInternalId() + ")");

		if (argument1.getReturnType() != argument2.getReturnType()) {
			if (argument1.getReturnType() != ReturnType.UNSPECIFIED
					&& argument2.getReturnType() != ReturnType.UNSPECIFIED) {
				throw new InvalidityException("type mismatch" + " (" + getInternalId() + ")");
			}
		}

		if (argument1.getReturnType() != ReturnType.UNSPECIFIED && argument1.getReturnType() != type) {
			throw new InvalidityException("type mismatch" + " (" + getInternalId() + ")");
		}
		if (argument2.getReturnType() != ReturnType.UNSPECIFIED && argument2.getReturnType() != type) {
			throw new InvalidityException("type mismatch" + " (" + getInternalId() + ")");
		}

		if (abstractionLevel == AbstractionLevel.CONCRETE && type == ReturnType.UNSPECIFIED) {
			throw new InvalidityException("input value type unspecified" + " (" + getInternalId() + ")");
		}

		if (argument1 instanceof Element && argument2 instanceof Element) {
			if (option.getValue() != ComparisonOperator.EQUAL && option.getValue() != ComparisonOperator.NOTEQUAL) {
				throw new InvalidityException(
						"invalid comparison operator for arguments of type Element" + " (" + getInternalId() + ")");
			}
		}
		super.isValidLocal(abstractionLevel);
		isCycleFree();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList<Operator> getAllOperators() throws InvalidityException {
		EList<Operator> res = new BasicEList<Operator>();
		res.add(this);
		if (argument1 instanceof Operator) {
			res.addAll(((Operator) argument1).getAllOperators());
		}
		if (argument2 instanceof Operator) {
			res.addAll(((Operator) argument2).getAllOperators());
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public EList<Parameter> getAllInputs() throws InvalidityException {
//		System.out.println(argument1 + " " + argument2);
		EList<Parameter> res = new BasicEList<Parameter>();
		if (argument1 instanceof Parameter) {
			res.add((Parameter) argument1);
		} else if (argument1 instanceof Operator) {
			res.addAll(((Operator) argument1).getAllInputs());
		} else if (argument1 instanceof Property) {
			res.addAll(((Property) argument1).getAllInputs());
		}
		if (argument2 instanceof Parameter) {
			res.add((Parameter) argument2);
		} else if (argument2 instanceof Operator) {
			res.addAll(((Operator) argument2).getAllInputs());
		} else if (argument2 instanceof Property) {
			res.addAll(((Property) argument2).getAllInputs());
		}
		if (getOption() != null) {
			res.add(option);
		} else {
			throw new InvalidityException("option null" + " (" + getInternalId() + ")");
		}
		return res;
	}

	@Override
	public boolean isTranslatable() throws InvalidityException {		
		return argument1.isTranslatable() && argument2.isTranslatable();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @throws InvalidityException
	 * 
	 */
	@Override
	public EList<Element> getAllArgumentElements() throws InvalidityException {
		EList<Element> arguments = new BasicEList<Element>();
		if(argument1 != null) {
			arguments.addAll(argument1.getAllArgumentElements());
		}
		if(argument2 != null) {
			arguments.addAll(argument2.getAllArgumentElements());
		}
		return arguments;
	}

	@Override
	public EList<Comparable> getArguments() {
		EList<Comparable> list = new BasicEList<Comparable>();
		list.add(argument1);
		list.add(argument2);
		return list;
	}

	@Override
	public void createParameters() {	
		ParameterList parameterList = getParameterList();
		if (getOption() == null) {
			ComparisonOptionParam comparisonOption = new ComparisonOptionParamImpl();
			parameterList.add(comparisonOption);
			setOption(comparisonOption);
		} else {
			parameterList.add(getOption());
		}
		
	}

	@Override
	public void removeParametersFromParameterList() {
		ComparisonOptionParam option = getOption();
		setOption(null);
		ParameterList parameterList = getParameterList();			
		parameterList.remove(option);		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatorsPackage.Literals.COMPARISON;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public qualitypatternmodel.graphstructure.Comparable getArgument1() {
		if (argument1 != null && argument1.eIsProxy()) {
			InternalEObject oldArgument1 = (InternalEObject)argument1;
			argument1 = (qualitypatternmodel.graphstructure.Comparable)eResolveProxy(oldArgument1);
			if (argument1 != oldArgument1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.COMPARISON__ARGUMENT1, oldArgument1, argument1));
			}
		}
		return argument1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypatternmodel.graphstructure.Comparable basicGetArgument1() {
		return argument1;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument1(qualitypatternmodel.graphstructure.Comparable newArgument1) {
		if (newArgument1 != argument1) {
			NotificationChain msgs = null;
			if (argument1 != null)
				msgs = ((InternalEObject)argument1).eInverseRemove(this, GraphstructurePackage.COMPARABLE__COMPARISON1, qualitypatternmodel.graphstructure.Comparable.class, msgs);
			if (newArgument1 != null)
				msgs = ((InternalEObject)newArgument1).eInverseAdd(this, GraphstructurePackage.COMPARABLE__COMPARISON1, qualitypatternmodel.graphstructure.Comparable.class, msgs);
			msgs = basicSetArgument1(newArgument1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.COMPARISON__ARGUMENT1, newArgument1, newArgument1));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetArgument1(qualitypatternmodel.graphstructure.Comparable newArgument1,
			NotificationChain msgs) {
		Comparable oldArgument1 = argument1;
		argument1 = newArgument1;

		setTypeAccordingToArgument(newArgument1, getArgument2());

		try {
			isCycleFree();
		} catch (OperatorCycleException e1) {
			argument1 = oldArgument1;
			if (newArgument1 != null) {
				newArgument1.getComparison1().remove(this); // undo eInverseAdd
			}
			if (oldArgument1 != null) {
				oldArgument1.getComparison1().add(this); // undo eInverseRemove
			}
			return msgs;
		}

		adaptOperatorElementAssociation(newArgument1, oldArgument1);
		
		
		try {
			CompletePattern completePattern;
			completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();			
			if(oldArgument1 instanceof Parameter && varlist != null) {
				Parameter oldParameter = (Parameter) oldArgument1;					
				varlist.remove(oldParameter);				
			}				
			if(newArgument1 instanceof Parameter && varlist != null) {
				Parameter newParameter = (Parameter) newArgument1;
				varlist.add(newParameter);				
			}
		} catch (MissingPatternContainerException e) {
			// do nothing
		}	
		

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OperatorsPackage.COMPARISON__ARGUMENT1, oldArgument1, newArgument1);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	private void setTypeAccordingToArgument(qualitypatternmodel.graphstructure.Comparable newArgument,
			qualitypatternmodel.graphstructure.Comparable otherArgument) {
		if (newArgument == null) {
			if (otherArgument == null) {
				setType(ReturnType.UNSPECIFIED);
			}
			if (otherArgument instanceof Property) {
				setType(ReturnType.UNSPECIFIED);
			}
			if (otherArgument instanceof UntypedParameterValue) {
				setType(ReturnType.UNSPECIFIED);
			}
		} else {
			if (newArgument instanceof Element) {
				setType(ReturnType.ELEMENT);
			}
			if (newArgument instanceof BooleanOperator) {
				setType(ReturnType.BOOLEAN);
			}
			if (newArgument instanceof NumberOperator) {
				setType(ReturnType.NUMBER);
			}
			if (newArgument instanceof ParameterValue) {
				ParameterValue xsType = (ParameterValue) newArgument;
				setType(xsType.getReturnType());
			}
			if (newArgument instanceof UntypedParameterValue) {
				setType(ReturnType.UNSPECIFIED);
			}
		}

	}	

	private void adaptOperatorElementAssociation(qualitypatternmodel.graphstructure.Comparable newArgument, qualitypatternmodel.graphstructure.Comparable oldArgument) {
		EList<BooleanOperator> rootOperators = getRootBooleanOperators();

		addNewArgumentElementsToRootOperator(newArgument, rootOperators);

		if (newArgument instanceof BooleanOperator) {
			moveElementsFromNewArgumentToRootOperator(newArgument, rootOperators);
		}

		if(rootOperators.size() > 0) {
			for (BooleanOperator rootOperator : rootOperators) {
				removeOldArgumentElementsFromRootOperator(oldArgument, rootOperator);
				if (oldArgument instanceof BooleanOperator) {
					moveElementsFromRootOperatorToOldArgument(oldArgument, rootOperator);
				}
			}
		}
	}

	private void moveElementsFromRootOperatorToOldArgument(qualitypatternmodel.graphstructure.Comparable oldArgument, BooleanOperator rootOperator) {
		BooleanOperator oldArgumentOperator = (BooleanOperator) oldArgument;
		EList<Element> rootOperatorElements = new BasicEList<Element>();
		rootOperatorElements.addAll(rootOperator.getElements()); // rootOperator.getElements() is already empty at this point in
																// case THIS gets DELETED!
		try {
			EList<Element> argumentElements = oldArgumentOperator.getAllArgumentElements();
			if(argumentElements.size() > 0) {
				for (Element argumentElement : argumentElements) {
						oldArgumentOperator.addElement(argumentElement);
						rootOperator.removeElement(argumentElement);
				}
			}
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void removeOldArgumentElementsFromRootOperator(qualitypatternmodel.graphstructure.Comparable oldArgument, BooleanOperator rootOperator) {
		if (oldArgument != null && oldArgument instanceof Property && ((Property) oldArgument).getElement() != null) {
			rootOperator.removeElement(((Property) oldArgument).getElement());
		}
		if (oldArgument != null && oldArgument instanceof Element) {
			rootOperator.removeElement((Element) oldArgument);
		}
	}

	private void moveElementsFromNewArgumentToRootOperator(qualitypatternmodel.graphstructure.Comparable newArgument,
			EList<BooleanOperator> rootBooleanOperators) {
		BooleanOperator argumentOperator = (BooleanOperator) newArgument;
		EList<Element> argumentOperatorElements = new BasicEList<Element>();
		argumentOperatorElements.addAll(argumentOperator.getElements());
		if(argumentOperatorElements.size() > 0) {
			for (Element element : argumentOperatorElements) {
				argumentOperator.removeElement(element);
				if(rootBooleanOperators.size() > 0) {
					for (BooleanOperator rootBoolenOperator : rootBooleanOperators) {
						rootBoolenOperator.addElement(element);
					}
				}
			}
		}
	}

	private void addNewArgumentElementsToRootOperator(qualitypatternmodel.graphstructure.Comparable newArgument,
			EList<BooleanOperator> rootBooleanOperators) {
		if (newArgument instanceof Element) {
			for (BooleanOperator boolOp : rootBooleanOperators) {
				if (newArgument != null) {
					boolOp.addElement((Element) newArgument);
				}
			}
		}
		if (newArgument instanceof Property && ((Property) newArgument).getElement() != null) {
			for (BooleanOperator boolOp : rootBooleanOperators) {
				if (newArgument != null) {
					boolOp.addElement(((Property) newArgument).getElement());
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public ComparisonOptionParam getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (ComparisonOptionParam)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.COMPARISON__OPTION, oldOption, option));
			}
		}
		return option;
	}

	@Override
	public void reset() {
		super.reset();
		setArgument1(null);
		setArgument2(null);
		setOption(null);		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOptionParam basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetOption(ComparisonOptionParam newOption, NotificationChain msgs) {
		ComparisonOptionParam oldOption = option;
		option = newOption;

		try {
			CompletePattern completePattern;
			completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();
			if(varlist != null) {
				varlist.remove(oldOption);
				varlist.add(newOption);
			}
		} catch (MissingPatternContainerException e) {
			// do nothing
		}

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OperatorsPackage.COMPARISON__OPTION, oldOption, newOption);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOption(ComparisonOptionParam newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS, ComparisonOptionParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS, ComparisonOptionParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.COMPARISON__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isPrimitive() {
		if(!(getArgument1() instanceof Property) && !(getArgument2() instanceof Property)) {			
			return false;
		}
		if(!(getArgument1() instanceof Parameter) && !(getArgument2() instanceof Parameter)) {			
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Element getElement() {
		if(isPrimitive()) {
			if(getArgument1() instanceof Property) {
				return ((Property) getArgument1()).getElement();
			}
			if(getArgument2() instanceof Property) {
				return ((Property) getArgument2()).getElement();
			}
		} 
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Comparison copy() {
		Comparison newComparison = new ComparisonImpl();
		newComparison.setOption(getOption());
		return newComparison;
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		
		patternElements.add(getOption());
		setOption(null);
		
		if(getArgument1() instanceof Operator) {
			patternElements.add(getArgument1());
		}
		if(getArgument1() instanceof Parameter) {
			patternElements.add(getArgument1());
			setArgument1(null);
		}
		if(getArgument2() instanceof Operator) {
			patternElements.add(getArgument2());
		}
		if(getArgument2() instanceof Parameter) {
			patternElements.add(getArgument2());
			setArgument2(null);
		}
		
		return patternElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public qualitypatternmodel.graphstructure.Comparable getArgument2() {
		if (argument2 != null && argument2.eIsProxy()) {
			InternalEObject oldArgument2 = (InternalEObject)argument2;
			argument2 = (qualitypatternmodel.graphstructure.Comparable)eResolveProxy(oldArgument2);
			if (argument2 != oldArgument2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OperatorsPackage.COMPARISON__ARGUMENT2, oldArgument2, argument2));
			}
		}
		return argument2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public qualitypatternmodel.graphstructure.Comparable basicGetArgument2() {
		return argument2;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgument2(qualitypatternmodel.graphstructure.Comparable newArgument2) {
		if (newArgument2 != argument2) {
			NotificationChain msgs = null;
			if (argument2 != null)
				msgs = ((InternalEObject)argument2).eInverseRemove(this, GraphstructurePackage.COMPARABLE__COMPARISON2, qualitypatternmodel.graphstructure.Comparable.class, msgs);
			if (newArgument2 != null)
				msgs = ((InternalEObject)newArgument2).eInverseAdd(this, GraphstructurePackage.COMPARABLE__COMPARISON2, qualitypatternmodel.graphstructure.Comparable.class, msgs);
			msgs = basicSetArgument2(newArgument2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.COMPARISON__ARGUMENT2, newArgument2, newArgument2));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setType(ReturnType newType) {
		ReturnType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OperatorsPackage.COMPARISON__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public NotificationChain basicSetArgument2(qualitypatternmodel.graphstructure.Comparable newArgument2,
			NotificationChain msgs) {
		Comparable oldArgument2 = argument2;
		argument2 = newArgument2;

		setTypeAccordingToArgument(newArgument2, getArgument2());

		try {
			isCycleFree();
		} catch (OperatorCycleException e1) {
			argument2 = oldArgument2;
			if (newArgument2 != null) {
				newArgument2.getComparison2().remove(this); // undo eInverseAdd
			}
			if (oldArgument2 != null) {
				oldArgument2.getComparison2().add(this); // undo eInverseRemove
			}
			return msgs;
		}

		adaptOperatorElementAssociation(newArgument2, oldArgument2);
		
		try {
			CompletePattern completePattern;
			completePattern = (CompletePattern) getAncestor(CompletePattern.class);
			ParameterList varlist = completePattern.getParameterList();			
			if(oldArgument2 instanceof Parameter && varlist != null) {
				Parameter oldParameter = (Parameter) oldArgument2;					
				varlist.remove(oldParameter);				
			}				
			if(newArgument2 instanceof Parameter && varlist != null) {
				Parameter newParameter = (Parameter) newArgument2;
				varlist.add(newParameter);				
			}
		} catch (MissingPatternContainerException e) {
			// do nothing
		}	

		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					OperatorsPackage.COMPARISON__ARGUMENT2, oldArgument2, newArgument2);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperatorsPackage.COMPARISON__ARGUMENT1:
				if (argument1 != null)
					msgs = ((InternalEObject)argument1).eInverseRemove(this, GraphstructurePackage.COMPARABLE__COMPARISON1, qualitypatternmodel.graphstructure.Comparable.class, msgs);
				return basicSetArgument1((qualitypatternmodel.graphstructure.Comparable)otherEnd, msgs);
			case OperatorsPackage.COMPARISON__ARGUMENT2:
				if (argument2 != null)
					msgs = ((InternalEObject)argument2).eInverseRemove(this, GraphstructurePackage.COMPARABLE__COMPARISON2, qualitypatternmodel.graphstructure.Comparable.class, msgs);
				return basicSetArgument2((qualitypatternmodel.graphstructure.Comparable)otherEnd, msgs);
			case OperatorsPackage.COMPARISON__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.COMPARISON_OPTION_PARAM__COMPARISONS, ComparisonOptionParam.class, msgs);
				return basicSetOption((ComparisonOptionParam)otherEnd, msgs);
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
			case OperatorsPackage.COMPARISON__ARGUMENT1:
				return basicSetArgument1(null, msgs);
			case OperatorsPackage.COMPARISON__ARGUMENT2:
				return basicSetArgument2(null, msgs);
			case OperatorsPackage.COMPARISON__OPTION:
				return basicSetOption(null, msgs);
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
			case OperatorsPackage.COMPARISON__ARGUMENT1:
				if (resolve) return getArgument1();
				return basicGetArgument1();
			case OperatorsPackage.COMPARISON__ARGUMENT2:
				if (resolve) return getArgument2();
				return basicGetArgument2();
			case OperatorsPackage.COMPARISON__TYPE:
				return getType();
			case OperatorsPackage.COMPARISON__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
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
			case OperatorsPackage.COMPARISON__ARGUMENT1:
				setArgument1((qualitypatternmodel.graphstructure.Comparable)newValue);
				return;
			case OperatorsPackage.COMPARISON__ARGUMENT2:
				setArgument2((qualitypatternmodel.graphstructure.Comparable)newValue);
				return;
			case OperatorsPackage.COMPARISON__TYPE:
				setType((ReturnType)newValue);
				return;
			case OperatorsPackage.COMPARISON__OPTION:
				setOption((ComparisonOptionParam)newValue);
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
			case OperatorsPackage.COMPARISON__ARGUMENT1:
				setArgument1((qualitypatternmodel.graphstructure.Comparable)null);
				return;
			case OperatorsPackage.COMPARISON__ARGUMENT2:
				setArgument2((qualitypatternmodel.graphstructure.Comparable)null);
				return;
			case OperatorsPackage.COMPARISON__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OperatorsPackage.COMPARISON__OPTION:
				setOption((ComparisonOptionParam)null);
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
			case OperatorsPackage.COMPARISON__ARGUMENT1:
				return argument1 != null;
			case OperatorsPackage.COMPARISON__ARGUMENT2:
				return argument2 != null;
			case OperatorsPackage.COMPARISON__TYPE:
				return type != TYPE_EDEFAULT;
			case OperatorsPackage.COMPARISON__OPTION:
				return option != null;
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
			case OperatorsPackage.COMPARISON___IS_PRIMITIVE:
				return isPrimitive();
			case OperatorsPackage.COMPARISON___GET_ELEMENT:
				return getElement();
			case OperatorsPackage.COMPARISON___COPY:
				return copy();
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = "COMP [" + getInternalId() + "]:" + getReturnType() + " ";
		res += "(";
		if (getArgument1() != null)
			res += getArgument1().getInternalId() + " ";
		else
			res += "- ";
		if (getOption() != null)
			res += getOption().getValue() + "[" + getOption().getInternalId() + "]";
		else
			res += "-";
		if (getArgument2() != null)
			res += " " + getArgument2().getInternalId();
		else
			res += " -";
		return res + ")";
	}

} // ComparisonImpl
