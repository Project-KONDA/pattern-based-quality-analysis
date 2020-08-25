/**
 */
package qualitypatternmodel.operators.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.OperatorList;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.graphstructure.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.operators.impl.BooleanOperatorImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BooleanOperatorImpl extends OperatorImpl implements BooleanOperator {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;
	
	protected EMap<Element,Integer> elementCount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanOperatorImpl() {
		super();
	}
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException {

		if (getComparison1().isEmpty() && getComparison2().isEmpty()) {
			// this is root operator
			// ensure "each predicate owner must be argument" constraint:
			EList<Element> arguments = getAllArgumentElements();
			if (!arguments.containsAll(elements)) {
				throw new InvalidityException("invalid predicate owner" + " (" + getInternalId() + ")");
			}
			if (!elements.containsAll(arguments)) {
				throw new InvalidityException("invalid predicate argument" + " (" + getInternalId() + ")");
			}
		} else {
			if(!elements.isEmpty()) {
				throw new InvalidityException("invalid predicate owner" + " (" + getInternalId() + ")");
			}
		}
	}
	
	@Override
	public ReturnType getReturnType() {
		return ReturnType.BOOLEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OperatorsPackage.Literals.BOOLEAN_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectWithInverseResolvingEList.ManyInverse<Element>(Element.class, this, OperatorsPackage.BOOLEAN_OPERATOR__ELEMENTS, GraphstructurePackage.ELEMENT__PREDICATES);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void addElement(Element element) {
		if(getElementCount().containsKey(element)) {
			getElementCount().put(element, getElementCount().get(element)+1);
		} else {
			getElementCount().put(element, 1);
		}
		if(!getElements().contains(element)) {
			getElements().add(element);
//			element.getPredicates().add(this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void removeElement(Element element) {
		if(getElementCount().containsKey(element)) {			
			if(getElementCount().get(element) == 1) {
				getElements().remove(element);
//				element.getPredicates().remove(this);
				getElementCount().removeKey(element);
			} else {
				getElementCount().put(element, getElementCount().get(element)-1);
			}			
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain basicSetOperatorList(OperatorList newOperatorList, NotificationChain msgs) {
		if(getOperatorList() != null && !getOperatorList().equals(newOperatorList)) {			
			reset();
			getElements().clear();
		}
//		if(getOperatorList() != null) {
//			removeParametersFromParameterList();
//		}
		msgs = super.basicSetOperatorList(newOperatorList, msgs);
		
		createParameters();
		
//		if(newOperatorList != null) {
//			createParameters();
//		}
		
		return msgs;
	}

	
	public void reset() {
		removeParametersFromParameterList();
	}
	
	
	@Override
	abstract public void createParameters();
	
	@Override
	abstract public void removeParametersFromParameterList();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OperatorsPackage.BOOLEAN_OPERATOR__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
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
			case OperatorsPackage.BOOLEAN_OPERATOR__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case OperatorsPackage.BOOLEAN_OPERATOR__ELEMENTS:
				return getElements();
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
			case OperatorsPackage.BOOLEAN_OPERATOR__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
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
			case OperatorsPackage.BOOLEAN_OPERATOR__ELEMENTS:
				getElements().clear();
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
			case OperatorsPackage.BOOLEAN_OPERATOR__ELEMENTS:
				return elements != null && !elements.isEmpty();
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
			case OperatorsPackage.BOOLEAN_OPERATOR___ADD_ELEMENT__ELEMENT:
				addElement((Element)arguments.get(0));
				return null;
			case OperatorsPackage.BOOLEAN_OPERATOR___REMOVE_ELEMENT__ELEMENT:
				removeElement((Element)arguments.get(0));
				return null;
			case OperatorsPackage.BOOLEAN_OPERATOR___CREATE_PARAMETERS:
				createParameters();
				return null;
			case OperatorsPackage.BOOLEAN_OPERATOR___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
			case OperatorsPackage.BOOLEAN_OPERATOR___RESET:
				reset();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public EMap<Element, Integer> getElementCount() {
		if(elementCount == null) {
			elementCount = new BasicEMap<Element, Integer>();
		}
		return elementCount;
	}

	public void setElementCount(EMap<Element, Integer> elementCount) {
		this.elementCount = elementCount;
	}

} //BooleanOperatorImpl
