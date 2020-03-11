/**
 */
package qualitypatternmodel.functions.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.ComparisonOperator;
import qualitypatternmodel.functions.Count;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.NumberOperator;
import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.functions.OperatorList;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.impl.PropertyImpl;
import qualitypatternmodel.inputfields.CompOption;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.InputValue;
import qualitypatternmodel.inputfields.InputfieldsPackage;
import qualitypatternmodel.inputfields.Text;
import qualitypatternmodel.inputfields.UnknownInputValue;
import qualitypatternmodel.inputfields.impl.CompOptionImpl;
import qualitypatternmodel.inputfields.impl.InputImpl;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.impl.PatternImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Comparison</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.impl.ComparisonImpl#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.ComparisonImpl#getArgument2 <em>Argument2</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.ComparisonImpl#getType <em>Type</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.ComparisonImpl#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonImpl extends BooleanOperatorImpl implements Comparison {
	/**
	 * The cached value of the '{@link #getArgument1() <em>Argument1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ReturnType TYPE_EDEFAULT = ReturnType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ReturnType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected CompOption option;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComparisonImpl() {
		super();		
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		if(option!=null && option.getValue()!=null && argument1 != null && argument2 != null) {
			ComparisonOperator operator = option.getValue();
			String conversionStartArgument1 = type.getConversion();
			String conversionEndArgument1 = type.getConversionEnd();
			if(argument1 instanceof Text) {
				conversionStartArgument1 = "";
				conversionEndArgument1 = "";
			}
			String conversionStartArgument2 = type.getConversion();
			String conversionEndArgument2 = type.getConversionEnd();
			if(argument2 instanceof Text) {
				conversionStartArgument2 = "";
				conversionEndArgument2 = "";
			}					
			return conversionStartArgument1 + argument1.toXQuery(location) + conversionEndArgument1 + operator.getLiteral() 
				+ conversionStartArgument2 + argument2.toXQuery(location) + conversionEndArgument2;
		} else {
			throw new InvalidityException("invalid option" + " (" + getInternalId() + ")");
		}
	}	
	
	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		isValidLocal(isDefinedPattern);

		if (argument1 instanceof PropertyImpl || argument1 instanceof OperatorImpl || argument1 instanceof InputImpl)
			argument1.isValid(isDefinedPattern);
		if (argument2 instanceof PropertyImpl || argument2 instanceof OperatorImpl || argument2 instanceof InputImpl)
			argument2.isValid(isDefinedPattern);
			option.isValid(isDefinedPattern);

	}
	
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException{
		if (argument1 == null)
			throw new InvalidityException("argument1 null" + " (" + getInternalId() + ")" );
		if (argument2 == null)
			throw new InvalidityException("argument2 null" + " (" + getInternalId() + ")" );
		if (option == null) 
			throw new InvalidityException("operator options null" + " (" + getInternalId() + ")" );
		
		if (argument1.getReturnType() != argument2.getReturnType()) {
			if(argument1.getReturnType() != ReturnType.UNSPECIFIED && argument2.getReturnType() != ReturnType.UNSPECIFIED) {
				throw new InvalidityException("type mismatch" + " (" + getInternalId() + ")" );
			}
		}				
		
		if(argument1.getReturnType() != ReturnType.UNSPECIFIED && argument1.getReturnType() != type) {
			throw new InvalidityException("type mismatch" + " (" + getInternalId() + ")" );	
		}
		if(argument2.getReturnType() != ReturnType.UNSPECIFIED && argument2.getReturnType() != type) {
			throw new InvalidityException("type mismatch" + " (" + getInternalId() + ")" );	
		}
		
//		if(argument1.getReturnType() == ReturnType.ELEMENT && argument2.getReturnType() != ReturnType.ELEMENT)
//			throw new InvalidityException("type mismatch" + " (" + getInternalId() + ")");	
//		if(argument1.getReturnType() != ReturnType.ELEMENT && argument2.getReturnType() == ReturnType.ELEMENT)
//			throw new InvalidityException("type mismatch" + " (" + getInternalId() + ")");	
		
		if(isDefinedPattern && type == ReturnType.UNSPECIFIED) {
			throw new InvalidityException("input value type unspecified" + " (" + getInternalId() + ")" );	
		}
		
//		if(argument1 instanceof SetElement || argument1 instanceof OtherOperators || argument1 instanceof BooleanOperator) {
//			throw new InvalidityException("invalid argument1 type" + " (" + getInternalId() + ")");
//		}
//		if(argument2 instanceof SetElement || argument2 instanceof OtherOperators || argument2 instanceof BooleanOperator) {
//			throw new InvalidityException("invalid argument2 type" + " (" + getInternalId() + ")");
//		}
		
		if(argument1 instanceof Element && argument2 instanceof Element) {
			if(option.getValue() != ComparisonOperator.EQUAL && option.getValue() != ComparisonOperator.NOTEQUAL) {
				throw new InvalidityException("invalid comparison operator for arguments of type Element" + " (" + getInternalId() + ")" );
			}
		}
		
		// ensure "predicate owner must be argument" constraint:	
		
		if(getComparison1().isEmpty() && getComparison2().isEmpty()) {
		
			EList<ListOfElements> arguments = getAllArgumentElements();
			
			EList<Element> argumentsFlattened = new BasicEList<Element>();
			arguments.forEach(argumentsFlattened::addAll);		
			
			boolean ownersInArguments = argumentsFlattened.containsAll(elements);
	
			if(!ownersInArguments) {
				throw new InvalidityException("invalid predicate argument" + " (" + getInternalId() + ")" );
			}
			
			boolean argumentsInElements = true;
			for(ListOfElements listOfElements : arguments) {
				boolean isElement = false;
				for(Element argument : listOfElements) {
					for(Element owner : elements) {					
						if(argument.equals(owner)) {	
							if(isElement) {
								throw new InvalidityException("too many predicate owners" + " (" + getInternalId() + ")" );
							}
							isElement = true;		
						}
					}
				}
				argumentsInElements &= isElement;
			}		
			if(!argumentsInElements) {
				throw new InvalidityException("invalid predicate owner" + " (" + getInternalId() + ")" );
			}	
		
		}
		
		isCycleFree();
		
	}
	
	@Override
	public boolean hasCountPredicate() {
		if(argument1 instanceof Count) {
			return true;
		}
		if(argument2 instanceof Count) {
			return true;
		}
		return false;
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
	public EList<Input> getAllInputs() throws InvalidityException {
		EList<Input> res = new BasicEList<Input>();
		if (argument1 instanceof Input) {
			res.add((Input) argument1);
		} else if (argument1 instanceof Operator) {
			res.addAll(((Operator) argument1).getAllInputs());
		}
		if (argument2 instanceof Input) {
			res.add((Input) argument2);
		} else if (argument2 instanceof Operator) {
			res.addAll(((Operator) argument2).getAllInputs());
		}
		if(getOption() != null) {
			res.add(option);
		} else {
			throw new InvalidityException("option null" + " (" + getInternalId() + ")");
		}
		return res;
	}

	@Override
	public ReturnType getReturnType() {
		return ReturnType.BOOLEAN;
	}
	
	@Override
	public boolean isTranslatable() throws InvalidityException {
		return argument1.isTranslatable() && argument2.isTranslatable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * 
	 */
	@Override
	public EList<ListOfElements> getAllArgumentElements() throws InvalidityException {				
		EList<ListOfElements> arguments = argument1.getAllArgumentElements();
		arguments.addAll(argument2.getAllArgumentElements());
		return arguments;
	}	
	
	@Override
	public EList<Comparable> getArguments(){
		EList<Comparable> list = new BasicEList<Comparable>();
		list.add(argument1);
		list.add(argument2);
		return list;
	}
	
	@Override
	public void createInputs() {
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);
			
			if(getOption() == null) {
				CompOption compOption = new CompOptionImpl();			
				pattern.getVariableList().add(compOption);
				setOption(compOption);			
			} else {
				pattern.getVariableList().add(getOption());
			}
		} catch (MissingPatternContainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void removeInputsFromVariableList() {
		try {
			Pattern pattern = (Pattern) getAncestor(PatternImpl.class);
			pattern.getVariableList().getVariables().remove(getOption());
		} catch (MissingPatternContainerException e) {
			// since this comparison is not contained in a pattern, do nothing
		}
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.COMPARISON;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.COMPARISON__ARGUMENT1, oldArgument1, argument1));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.COMPARISON__ARGUMENT1, newArgument1, newArgument1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetArgument1(qualitypatternmodel.graphstructure.Comparable newArgument1, NotificationChain msgs) {		
		Comparable oldArgument1 = argument1;
		argument1 = newArgument1;
		
		setTypeAccordingToArgument(newArgument1, getArgument2());		

		try {
			isCycleFree();
		} catch (OperatorCycleException  e1) {
			argument1 = oldArgument1;
			if(newArgument1 != null) {
				newArgument1.getComparison1().remove(this); // undo eInverseAdd				
			}
			if(oldArgument1 != null) {
				oldArgument1.getComparison1().add(this); // undo eInverseRemove
			}
			return msgs;
		}			
		
		adaptOperatorElementAssociation(newArgument1, oldArgument1);
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.COMPARISON__ARGUMENT1, oldArgument1, newArgument1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	public void setTypeAccordingToArgument(qualitypatternmodel.graphstructure.Comparable newArgument, qualitypatternmodel.graphstructure.Comparable otherArgument) {
		if(newArgument == null) {
			if(otherArgument == null) {
				setType(ReturnType.UNSPECIFIED);
			}
			if(otherArgument instanceof Property) {
				setType(ReturnType.UNSPECIFIED);
			}
			if(otherArgument instanceof UnknownInputValue) {
				setType(ReturnType.UNSPECIFIED);
			}
		} else {
			if(newArgument instanceof Element) {
				setType(ReturnType.ELEMENT);
			}
			if(newArgument instanceof BooleanOperator) {
				setType(ReturnType.BOOLEAN);
			}
			if(newArgument instanceof NumberOperator) {
				setType(ReturnType.NUMBER);
			}
			if(newArgument instanceof InputValue) {
				InputValue xsType = (InputValue) newArgument;
				setType(xsType.getReturnType());
			}
			if(newArgument instanceof UnknownInputValue) {
				setType(ReturnType.UNSPECIFIED);
			}
		}
		
		
	}

	private void adaptOperatorElementAssociation(Comparable newArgument, Comparable oldArgument) {
		EList<BooleanOperator> rootOperators = getRootBooleanOperators();
		
		addNewArgumentElementsToRootOperator(newArgument, rootOperators);
		
		if(newArgument instanceof BooleanOperator) {
			moveElementsFromNewArgumentToRootOperator(newArgument, rootOperators);
		}	
		
		for(BooleanOperator rootOperator : rootOperators) {			
			removeOldArgumentElementsFromRootOperator(oldArgument, rootOperator);			
			if (oldArgument instanceof BooleanOperator) {	
				moveElementsFromRootOperatorToOldArgument(oldArgument, rootOperator);
			}			
		}
	}

	private void moveElementsFromRootOperatorToOldArgument(Comparable oldArgument, BooleanOperator booleanOperator) {
		BooleanOperator argumentOperator = (BooleanOperator) oldArgument;
		EList<Element> boolOpElements = new BasicEList<Element>();
		boolOpElements.addAll(booleanOperator.getElements()); // boolOp.getElements() is already empty at this point in case THIS gets DELETED!
		for(Element element : boolOpElements) {		
			try {
				EList<ListOfElements> argumentElements = argumentOperator.getAllArgumentElements();
				for(ListOfElements listOfElements : argumentElements) {
					if(listOfElements.size() == 1 && listOfElements.contains(element)) {
						argumentOperator.addElement(element); 
						booleanOperator.removeElement(element);
					}
				}						
			} catch (InvalidityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}					
		}
	}

	private void removeOldArgumentElementsFromRootOperator(Comparable oldArgument,
			BooleanOperator booleanOperator) {
		if(oldArgument != null && oldArgument instanceof Property && ((Property) oldArgument).getElement() != null) {				
			booleanOperator.removeElement(((Property) oldArgument).getElement());
		}
		if(oldArgument != null && oldArgument instanceof Element) {
			booleanOperator.removeElement((Element) oldArgument);
		}
	}

	private void moveElementsFromNewArgumentToRootOperator(Comparable newArgument,
			EList<BooleanOperator> rootBooleanOperators) {
		BooleanOperator argumentOperator = (BooleanOperator) newArgument;
		EList<Element> argumentOperatorElements = new BasicEList<Element>();
		argumentOperatorElements.addAll(argumentOperator.getElements());
		for(Element element : argumentOperatorElements) {
			argumentOperator.removeElement(element);
			for(BooleanOperator rootBoolenOperator : rootBooleanOperators) {
				rootBoolenOperator.addElement(element); 
			}
		}
	}

	private void addNewArgumentElementsToRootOperator(Comparable newArgument,
			EList<BooleanOperator> rootBooleanOperators) {
		if(newArgument instanceof Element) {
			for(BooleanOperator boolOp : rootBooleanOperators) {
				if(newArgument != null) {
					boolOp.addElement((Element) newArgument);
				}				
			}			
		}
		if(newArgument instanceof Property && ((Property) newArgument).getElement() != null) {
			for(BooleanOperator boolOp : rootBooleanOperators) {
				if(newArgument != null) {
					boolOp.addElement(((Property) newArgument).getElement());
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
	@SuppressWarnings("unchecked")
	public CompOption getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (CompOption)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.COMPARISON__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOperatorList(OperatorList newOperatorList, NotificationChain msgs) {
		reset();
		return super.basicSetOperatorList(newOperatorList, msgs);
	}

	public void reset() {
		setArgument1(null);
		setArgument2(null);
		setOption(null);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompOption basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOption(CompOption newOption, NotificationChain msgs) {
		CompOption oldOption = option;
		option = newOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.COMPARISON__OPTION, oldOption, newOption);
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
	public void setOption(CompOption newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, InputfieldsPackage.COMP_OPTION__COMPARISON, CompOption.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, InputfieldsPackage.COMP_OPTION__COMPARISON, CompOption.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.COMPARISON__OPTION, newOption, newOption));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FunctionsPackage.COMPARISON__ARGUMENT2, oldArgument2, argument2));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.COMPARISON__ARGUMENT2, newArgument2, newArgument2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setType(ReturnType newType) {
		ReturnType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.COMPARISON__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetArgument2(qualitypatternmodel.graphstructure.Comparable newArgument2, NotificationChain msgs) {
		Comparable oldArgument2 = argument2;
		argument2 = newArgument2;	
		
		setTypeAccordingToArgument(newArgument2, getArgument2());
		
		try {
			isCycleFree();
		} catch (OperatorCycleException e1) {
			argument2 = oldArgument2;
			if(newArgument2 != null) {
				newArgument2.getComparison2().remove(this); // undo eInverseAdd				
			}
			if(oldArgument2 != null) {
				oldArgument2.getComparison2().add(this); // undo eInverseRemove
			}
			return msgs;
		}	
		
		adaptOperatorElementAssociation(newArgument2, oldArgument2);
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.COMPARISON__ARGUMENT2, oldArgument2, newArgument2);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.COMPARISON__ARGUMENT1:
				if (argument1 != null)
					msgs = ((InternalEObject)argument1).eInverseRemove(this, GraphstructurePackage.COMPARABLE__COMPARISON1, qualitypatternmodel.graphstructure.Comparable.class, msgs);
				return basicSetArgument1((qualitypatternmodel.graphstructure.Comparable)otherEnd, msgs);
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				if (argument2 != null)
					msgs = ((InternalEObject)argument2).eInverseRemove(this, GraphstructurePackage.COMPARABLE__COMPARISON2, qualitypatternmodel.graphstructure.Comparable.class, msgs);
				return basicSetArgument2((qualitypatternmodel.graphstructure.Comparable)otherEnd, msgs);
			case FunctionsPackage.COMPARISON__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, InputfieldsPackage.COMP_OPTION__COMPARISON, CompOption.class, msgs);
				return basicSetOption((CompOption)otherEnd, msgs);
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
			case FunctionsPackage.COMPARISON__ARGUMENT1:
				return basicSetArgument1(null, msgs);
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				return basicSetArgument2(null, msgs);
			case FunctionsPackage.COMPARISON__OPTION:
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
			case FunctionsPackage.COMPARISON__ARGUMENT1:
				if (resolve) return getArgument1();
				return basicGetArgument1();
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				if (resolve) return getArgument2();
				return basicGetArgument2();
			case FunctionsPackage.COMPARISON__TYPE:
				return getType();
			case FunctionsPackage.COMPARISON__OPTION:
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
			case FunctionsPackage.COMPARISON__ARGUMENT1:
				setArgument1((qualitypatternmodel.graphstructure.Comparable)newValue);
				return;
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				setArgument2((qualitypatternmodel.graphstructure.Comparable)newValue);
				return;
			case FunctionsPackage.COMPARISON__TYPE:
				setType((ReturnType)newValue);
				return;
			case FunctionsPackage.COMPARISON__OPTION:
				setOption((CompOption)newValue);
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
			case FunctionsPackage.COMPARISON__ARGUMENT1:
				setArgument1((qualitypatternmodel.graphstructure.Comparable)null);
				return;
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				setArgument2((qualitypatternmodel.graphstructure.Comparable)null);
				return;
			case FunctionsPackage.COMPARISON__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case FunctionsPackage.COMPARISON__OPTION:
				setOption((CompOption)null);
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
			case FunctionsPackage.COMPARISON__ARGUMENT1:
				return argument1 != null;
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				return argument2 != null;
			case FunctionsPackage.COMPARISON__TYPE:
				return type != TYPE_EDEFAULT;
			case FunctionsPackage.COMPARISON__OPTION:
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
			case FunctionsPackage.COMPARISON___SET_TYPE_ACCORDING_TO_ARGUMENT__COMPARABLE_COMPARABLE:
				setTypeAccordingToArgument((qualitypatternmodel.graphstructure.Comparable)arguments.get(0), (qualitypatternmodel.graphstructure.Comparable)arguments.get(1));
				return null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public String myToString() {
		String res = "COMP (" + getInternalId() + "):" + getReturnType() + " ";
		res += "[" + getArgument1().getInternalId();
		res += " " + getOption().getValue() + "(" + getOption().getInternalId() + ") ";
		res += getArgument2().getInternalId() + "]";
		return res;
	}

	

} // ComparisonImpl
