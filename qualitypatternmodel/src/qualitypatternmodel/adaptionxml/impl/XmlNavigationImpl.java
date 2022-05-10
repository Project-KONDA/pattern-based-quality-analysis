/**
 */
package qualitypatternmodel.adaptionxml.impl;

import static qualitypatternmodel.utility.Constants.EVERY;
import static qualitypatternmodel.utility.Constants.FOR;
import static qualitypatternmodel.utility.Constants.IN;
import static qualitypatternmodel.utility.Constants.SATISFIES;
import static qualitypatternmodel.utility.Constants.SOME;
import static qualitypatternmodel.utility.Constants.VARIABLE;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.PathParam;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlNode;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.patternstructure.RelationMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl#getPathParam <em>Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl#getSourceVariable <em>Source Variable</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl#getVariableCounter <em>Variable Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XmlNavigationImpl extends RelationImpl implements XmlNavigation {
	/**
	 * The cached value of the '{@link #getPathParam() <em>Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathParam()
	 * @generated
	 * @ordered
	 */
	protected PathParam pathParam;

	/**
	 * The default value of the '{@link #getSourceVariable() <em>Source Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVariable()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_VARIABLE_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getSourceVariable() <em>Source Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVariable()
	 * @generated
	 * @ordered
	 */
	protected String sourceVariable = SOURCE_VARIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableCounter() <em>Variable Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableCounter()
	 * @generated
	 * @ordered
	 */
	protected static final int VARIABLE_COUNTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVariableCounter() <em>Variable Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableCounter()
	 * @generated
	 * @ordered
	 */
	protected int variableCounter = VARIABLE_COUNTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlNavigationImpl() {
		super();
	}

	@Override
	public String generateQuery() throws InvalidityException {
		
		String xPathExpression = "";
		if (pathParam != null && getIncomingMapping() == null) {
			xPathExpression = getSourceVariable() + pathParam.generateQuery();
		} else if(getIncomingMapping() == null) {
			throw new InvalidityException("option null");
		}
		
		String xPredicates;
		
		if(getTarget() instanceof XmlElement) {
			XmlElement element = (XmlElement) getTarget();
			element.setTranslated(true);
		} else if(getTarget() instanceof XmlProperty) {
			XmlProperty property = (XmlProperty) getTarget();
			property.setTranslated(true);
		} else {
			throw new InvalidityException("target of relation not XmlNode");
		}
		
		if(getTarget() instanceof XmlNode) {
			XmlNode targetElement = (XmlNode) getTarget();			
			predicatesAreBeingTranslated = true;
			xPredicates = targetElement.translatePredicates();
			predicatesAreBeingTranslated = false;
		} else {
			throw new InvalidityException("target of relation not XmlNode");
		}
		
		String variable = generateNextXQueryVariable();
		
		if(getGraph() == null) {
			throw new InvalidityException("container Graph null");
		}
		
		String query = "";
		if (getGraph().isReturnGraph()) {
			query += FOR + variable + IN; 			
			if (getIncomingMapping() == null) {		
				if(getTarget() instanceof XmlNode) {
					XmlNode node = (XmlNode) getTarget();
					xPredicates += node.translateMultipleIncoming();
				}
				query += xPathExpression + xPredicates;
			} else if (!xPredicates.equals("")) {
				query += variable + xPredicates;
			} else {
				query = "";
			}
			
		} else {
			if(getGraph().getQuantifiedCondition() == null) {
				throw new InvalidityException("container QuantifiedCondition null");
			}
			if(getGraph().getQuantifiedCondition().getQuantifier() == null) {
				throw new InvalidityException("quantifier null");
			}
			if (getGraph().getQuantifiedCondition().getQuantifier() == Quantifier.EXISTS) {
				query += SOME;
			} else if (getGraph().getQuantifiedCondition().getQuantifier() == Quantifier.FORALL) {
				query += EVERY;
			} else {
				throw new InvalidityException("invalid location");
			}
			query += variable + IN;
			if (getIncomingMapping() == null) {
				if(getTarget() instanceof XmlNode) {
					XmlNode node = (XmlNode) getTarget();
					xPredicates += node.translateMultipleIncoming();
				}
				query += xPathExpression + xPredicates + SATISFIES;
			} else if (!xPredicates.equals("")) {
				query += variable + xPredicates + SATISFIES;
			} else {
				query = "";
			}
		}
		
		translated = true;
		
		if(getTarget() instanceof XmlNode) {
			XmlNode node = (XmlNode) getTarget();
			node.getVariables().add(variable);
		}
		
		query += getTarget().generateQuery();
		
		return query;
	}

	private String generateNextXQueryVariable() {
		String variable = VARIABLE + getOriginalID() + "_" + getVariableCounter();
		setVariableCounter(getVariableCounter()+1);
		return variable;
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		super.isValid(abstractionLevel);
		if (pathParam != null) 
			pathParam.isValid(abstractionLevel);
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		super.isValidLocal(abstractionLevel);
		if (getIncomingMapping() == null && pathParam == null) { 
			System.out.println(this + " " + getName());
			throw new InvalidityException("pathParam missing");
		}
		if (getIncomingMapping() != null && pathParam != null) { 
			throw new InvalidityException("pathParam superflous");
		}
	}	
	
	@Override
	public PatternElement createXMLAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}
	
	@Override
	public XmlReference adaptAsXMLReference() throws InvalidityException {
		removeParametersFromParameterList();
		return super.adaptAsXMLReference();
	}
	
	@Override
	public String getName() {
		if(name == null || name.equals("")) {
			if(getOriginalID() > -1) {
				name = "XmlElementNavigation " + getOriginalID();
				return name;
			}
		}
		return name;
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();		
		if (pathParam != null) {
			res.addAll(pathParam.getAllParameters());
		} else if (getIncomingMapping() == null) {
			throw new InvalidityException("pathParam null" + " (" + getInternalId() + ")");
		}
		return res;
	}	

	@Override
	public void removeParametersFromParameterList() {		
		PathParam option = pathParam;
		setPathParam(null);
		ParameterList parameterList = getParameterList();	
		if(parameterList != null) {
			parameterList.remove(option);
		}
	}
	
	@Override
	public void createParameters() {	
		if (getIncomingMapping() == null) {
			ParameterList parameterList = getParameterList();
			if(parameterList != null) {
				PathParam pp = getPathParam();
				if (pp == null) {
					pp = new PathParamImpl();
					setPathParam(pp);
					parameterList.add(pp);
					pp.createParameters();
				}
				if (!pp.getParameterList().equals(parameterList)){
					parameterList.add(pp);
				}
			}
		}
	}
	
	@Override
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {		
		NotificationChain res = super.basicSetGraph(newGraph, msgs);		
		createParameters();
		return res;
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(pathParam);
		setPathParam(null);
		return patternElements;		
	}
	
	@Override
	public NotificationChain basicSetIncomingMapping(RelationMapping newMappingFrom, NotificationChain msgs) {
		if (newMappingFrom != null) {		
			removeParametersFromParameterList();			
		}
		NotificationChain res = super.basicSetIncomingMapping(newMappingFrom, msgs);
		return res;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_NAVIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public PathParam getPathParam() {
		if (getIncomingMapping() != null)
			return ((XmlNavigation) getOriginalRelation()).getPathParam();
		if (pathParam != null && pathParam.eIsProxy()) {
			InternalEObject oldPathParam = (InternalEObject)pathParam;
			pathParam = (PathParam)eResolveProxy(oldPathParam);
			if (pathParam != oldPathParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM, oldPathParam, pathParam));
			}
		} 
		return pathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathParam basicGetPathParam() {
		return pathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetPathParam(PathParam newPathParam, NotificationChain msgs) {
		PathParam oldPathParam = pathParam;
		
		ParameterList varlist = getParameterList();
		if(varlist != null) {
			varlist.remove(oldPathParam);			
			varlist.add(newPathParam);				
		}
		
		pathParam = newPathParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_ELEMENT_NAVIGATION__PATH_PARAM, oldPathParam, newPathParam);
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
	public void setPathParam(PathParam newPathParam) {
		if (newPathParam != pathParam) {
			NotificationChain msgs = null;
			if (pathParam != null)
				msgs = ((InternalEObject)pathParam).eInverseRemove(this, AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION, PathParam.class, msgs);
			if (newPathParam != null)
				msgs = ((InternalEObject)newPathParam).eInverseAdd(this, AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION, PathParam.class, msgs);
			msgs = basicSetPathParam(newPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM, newPathParam, newPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceVariable() {
		return sourceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceVariable(String newSourceVariable) {
		String oldSourceVariable = sourceVariable;
		sourceVariable = newSourceVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_NAVIGATION__SOURCE_VARIABLE, oldSourceVariable, sourceVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getVariableCounter() {
		return variableCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableCounter(int newVariableCounter) {
		int oldVariableCounter = variableCounter;
		variableCounter = newVariableCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_NAVIGATION__VARIABLE_COUNTER, oldVariableCounter, variableCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM:
				if (pathParam != null)
					msgs = ((InternalEObject)pathParam).eInverseRemove(this, AdaptionxmlPackage.PATH_PARAM__XML_NAVIGATION, PathParam.class, msgs);
				return basicSetPathParam((PathParam)otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM:
				return basicSetPathParam(null, msgs);
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
			case AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM:
				if (resolve) return getPathParam();
				return basicGetPathParam();
			case AdaptionxmlPackage.XML_NAVIGATION__SOURCE_VARIABLE:
				return getSourceVariable();
			case AdaptionxmlPackage.XML_NAVIGATION__VARIABLE_COUNTER:
				return getVariableCounter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM:
				setPathParam((PathParam)newValue);
				return;
			case AdaptionxmlPackage.XML_NAVIGATION__SOURCE_VARIABLE:
				setSourceVariable((String)newValue);
				return;
			case AdaptionxmlPackage.XML_NAVIGATION__VARIABLE_COUNTER:
				setVariableCounter((Integer)newValue);
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
			case AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM:
				setPathParam((PathParam)null);
				return;
			case AdaptionxmlPackage.XML_NAVIGATION__SOURCE_VARIABLE:
				setSourceVariable(SOURCE_VARIABLE_EDEFAULT);
				return;
			case AdaptionxmlPackage.XML_NAVIGATION__VARIABLE_COUNTER:
				setVariableCounter(VARIABLE_COUNTER_EDEFAULT);
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
			case AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM:
				return pathParam != null;
			case AdaptionxmlPackage.XML_NAVIGATION__SOURCE_VARIABLE:
				return SOURCE_VARIABLE_EDEFAULT == null ? sourceVariable != null : !SOURCE_VARIABLE_EDEFAULT.equals(sourceVariable);
			case AdaptionxmlPackage.XML_NAVIGATION__VARIABLE_COUNTER:
				return variableCounter != VARIABLE_COUNTER_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (sourceVariable: ");
		result.append(sourceVariable);
		result.append(", variableCounter: ");
		result.append(variableCounter);
		result.append(')');
		return result.toString();
	}

	@Override
	public String myToString() {
		String res = super.myToString();
		if (getPathParam() != null) {
			return res + " (" + getPathParam().myToString() + ")";
		} else {
			return res + " (prev.)";
		}
	}
} //XmlNavigationImpl
