/**
 */
package qualitypatternmodel.functions.impl;

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
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.functions.Operator;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Comparable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.ListOfElements;
import qualitypatternmodel.graphstructure.Property;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.graphstructure.impl.PropertyImpl;
import qualitypatternmodel.inputfields.CompOption;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.impl.InputImpl;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Comparison</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.functions.impl.ComparisonImpl#getArgument1 <em>Argument1</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.ComparisonImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.functions.impl.ComparisonImpl#getArgument2 <em>Argument2</em>}</li>
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
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected CompOption option;

	/**
	 * The cached value of the '{@link #getArgument2() <em>Argument2</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArgument2()
	 * @generated
	 * @ordered
	 */
	protected qualitypatternmodel.graphstructure.Comparable argument2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonImpl() {
		super();
	}

	@Override
	public String toXQuery(Location location) throws InvalidityException {
		if(option!=null && option.getValue()!=null && argument1 != null && argument2 != null) {
			ComparisonOperator operator = option.getValue();
			return argument1.toXQuery(location) + operator.getLiteral() + argument2.toXQuery(location);
		} else {
			throw new InvalidityException("invalid option");
		}
	}

	@Override
	public String toXQuery(Location location, int depth) throws InvalidityException {
		if(option!=null && option.getValue()!=null && argument1 != null && argument2 != null) {
			ComparisonOperator operator = option.getValue();
			return argument1.toXQuery(location, depth) + operator.getLiteral() + argument2.toXQuery(location, depth);
		} else {
			throw new InvalidityException("invalid option");
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
			throw new InvalidityException("argument1 null");
		if (argument2 == null)
			throw new InvalidityException("argument2 null");
		if (option == null) 
			throw new InvalidityException("operator Options invalid");
		if (!(argument1.getReturnType() == argument2.getReturnType()))
			throw new InvalidityException("unmatching types");		
		
//		if(argument1 instanceof SetElement || argument1 instanceof OtherOperators || argument1 instanceof BooleanOperator) {
//			throw new InvalidityException("invalid argument1 type");
//		}
//		if(argument2 instanceof SetElement || argument2 instanceof OtherOperators || argument2 instanceof BooleanOperator) {
//			throw new InvalidityException("invalid argument2 type");
//		}
		
		if(argument1 instanceof Element && argument2 instanceof Element) {
			if(option.getValue() != ComparisonOperator.EQUAL && option.getValue() != ComparisonOperator.NOTEQUAL) {
				throw new InvalidityException("invalid comparison operator for arguments of type Element");
			}
		}
		
		// ensure "predicate owner must be argument" constraint:	
		
		if(getComparison1().isEmpty() && getComparison2().isEmpty()) {
		
			EList<ListOfElements> arguments = getAllArgumentElements();
			
			EList<Element> argumentsFlattened = new BasicEList<Element>();
			arguments.forEach(argumentsFlattened::addAll);		
			
			boolean ownersInArguments = argumentsFlattened.containsAll(elements);
	
			if(!ownersInArguments) {
				throw new InvalidityException("invalid predicate argument");
			}
			
			boolean argumentsInElements = true;
			for(ListOfElements listOfElements : arguments) {
				boolean isElement = false;
				for(Element argument : listOfElements) {
					for(Element owner : elements) {					
						if(argument.equals(owner)) {	
							if(isElement) {
								throw new InvalidityException("too many predicate owners");
							}
							isElement = true;		
						}
					}
				}
				argumentsInElements &= isElement;
			}		
			if(!argumentsInElements) {
				throw new InvalidityException("invalid predicate owner");
			}	
		
		}
		
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
			throw new InvalidityException("option null");
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
	@Override
	public void setOption(CompOption newOption) {
		CompOption oldOption = option;
		option = newOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.COMPARISON__OPTION, oldOption, option));
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
	 * @generated NOT
	 */
	public NotificationChain basicSetArgument2(qualitypatternmodel.graphstructure.Comparable newArgument2, NotificationChain msgs) {
		Comparable oldArgument2 = argument2;
		argument2 = newArgument2;	
		
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
			case FunctionsPackage.COMPARISON__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				if (resolve) return getArgument2();
				return basicGetArgument2();
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
			case FunctionsPackage.COMPARISON__OPTION:
				setOption((CompOption)newValue);
				return;
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				setArgument2((qualitypatternmodel.graphstructure.Comparable)newValue);
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
			case FunctionsPackage.COMPARISON__OPTION:
				setOption((CompOption)null);
				return;
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				setArgument2((qualitypatternmodel.graphstructure.Comparable)null);
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
			case FunctionsPackage.COMPARISON__OPTION:
				return option != null;
			case FunctionsPackage.COMPARISON__ARGUMENT2:
				return argument2 != null;
		}
		return super.eIsSet(featureID);
	}

	

} // ComparisonImpl
