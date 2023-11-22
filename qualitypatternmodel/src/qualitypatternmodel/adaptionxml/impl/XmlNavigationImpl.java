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
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlNode;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.Quantifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl#getXmlPathParam <em>Xml Path Param</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl#getSourceVariable <em>Source Variable</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl#getVariableCounter <em>Variable Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XmlNavigationImpl extends RelationImpl implements XmlNavigation {
	/**
	 * The cached value of the '{@link #getXmlPathParam() <em>Xml Path Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlPathParam()
	 * @generated
	 * @ordered
	 */
	protected XmlPathParam xmlPathParam;

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
	public String generateXQuery() throws InvalidityException {
		if(getGraph() == null) {
			throw new InvalidityException("container Graph null");
		}
		String variable = generateNextXQueryVariable();
		
		// Basic Translation via xmlPathParam
		String xPathExpression = "";
		if (xmlPathParam != null) {
			String sourcevariable = getSourceVariable();
			if (!(getSource() instanceof XmlRoot) && sourcevariable == "") {
				throw new InvalidityException("SourceVariable in Relation [" + getInternalId() + "] from Element [" + getSource().getInternalId() + "] is empty");
			}
				
			xPathExpression = sourcevariable + xmlPathParam.generateXQuery();
		} else 
			throw new InvalidityException("option null");
		
		// setTranslated
		
		if(getTarget() instanceof XmlElement) {
			XmlElement element = (XmlElement) getTarget();
			element.setTranslated(true);
		} else if(getTarget() instanceof XmlProperty) {
			XmlProperty property = (XmlProperty) getTarget();
			property.setTranslated(true);
		} else {
			throw new InvalidityException("target of relation not XmlNode");
		}
		
		// Predicate
		String xPredicates = "";
		if(getTarget() instanceof XmlNode) {
			XmlNode targetElement = (XmlNode) getTarget();
			xPredicates = targetElement.translatePredicates();
		} else {
			throw new InvalidityException("target of relation not XmlNode");
		}
		
		// Structure Translation (For, Some, Every)
		String query = "";
		if (getGraph().isReturnGraph()) {
			query += FOR + variable + IN; 			
			if(getTarget() instanceof XmlNode) {
				XmlNode node = (XmlNode) getTarget();
				xPredicates += node.translateMultipleIncoming();
			}
			query += xPathExpression + xPredicates;
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
			if(getTarget() instanceof XmlNode) {
				XmlNode node = (XmlNode) getTarget();
				xPredicates += node.translateMultipleIncoming();
			}
			query += xPathExpression + xPredicates + SATISFIES;
		}
		
		translated = true;
		
		String target = getTarget().generateXQuery();
		query += target;
		
		if (xPredicates == "" && xPathExpression == "" && target == "") {
			return "";
		}
		
		return query;
	}

	@Override
	public String generateXQueryJava() throws InvalidityException {
		if(getGraph() == null) {
			throw new InvalidityException("container Graph null");
		}
		EList<String> vars = ((XmlNode) getTarget()).getVariables();
		String variable = vars.size() == 0? generateNextXQueryVariable() : vars.get(vars.size()-1);
		
		// Basic Translation via xmlPathParam
		String xPathExpression = "";
		if (xmlPathParam != null) {
			String sourcevariable = getSourceVariable();
			if (!(getSource() instanceof XmlRoot) && sourcevariable == "") {
				throw new InvalidityException("SourceVariable in Relation [" + getInternalId() + "] from Element [" + getSource().getInternalId() + "] is empty");
			}
			xPathExpression = sourcevariable + xmlPathParam.generateXQuery();
		} else 
			throw new InvalidityException("option null");
		
		// setTranslated
		
		if(getTarget() instanceof XmlElement) {
			XmlElement element = (XmlElement) getTarget();
			element.setTranslated(true);
		} else if(getTarget() instanceof XmlProperty) {
			XmlProperty property = (XmlProperty) getTarget();
			property.setTranslated(true);
		} else {
			throw new InvalidityException("target of relation not XmlNode");
		}
		
		// Predicate
		String xPredicates = "";
		if(getTarget() instanceof XmlNode) {
			XmlNode targetElement = (XmlNode) getTarget();
			xPredicates = targetElement.translatePredicates();
		} else {
			throw new InvalidityException("target of relation not XmlNode");
		}
		
		// Structure Translation (For, Some, Every)
		String query = "";
		query += FOR + variable + IN; 			
		if(getTarget() instanceof XmlNode) {
			XmlNode node = (XmlNode) getTarget();
			xPredicates += node.translateMultipleIncoming();
		}
		query += xPathExpression + xPredicates;

		translated = true;
		
		String target = getTarget().generateXQuery();
		query += target;
		
		if (xPredicates == "" && xPathExpression == "" && target == "") {
			return "";
		}
		return query;
	}

	protected String generateNextXQueryVariable() throws InvalidityException {
		String variable = VARIABLE + getInternalId() + "_" + getVariableCounter();
		setVariableCounter(getVariableCounter()+1);

		if(getTarget() instanceof XmlNode) {
			XmlNode node = (XmlNode) getTarget();
			node.getVariables().add(variable);
		}
		else 
			throw new InvalidityException("Target of XmlNavigation [" + getInternalId() + "] is not an XmlNode");
		
		return variable;
	}
	
	@Override
	public void isValid(AbstractionLevel abstractionLevel) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (abstractionLevel.getValue() < AbstractionLevel.SEMI_ABSTRACT_VALUE)
			throw new InvalidityException("non-generic class in generic pattern");
		super.isValid(abstractionLevel);
		if (xmlPathParam != null) 
			xmlPathParam.isValid(abstractionLevel);
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		super.isValidLocal(abstractionLevel);
		if (xmlPathParam == null) {
			throw new InvalidityException("xmlPathParam missing on " + this + " " + getName());
		}

	}	
	
	@Override
	public PatternElement createXmlAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}
	
	@Override
	public XmlReference adaptAsXmlReference() throws InvalidityException {
		removeParametersFromParameterList();
		XmlReference reference = super.adaptAsXmlReference();
		try {
			reference.getGraph().createXmlAdaption();
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			e.printStackTrace();
			throw new InvalidityException(e.getMessage());
		}	
		return reference;
	}
	
	@Override
	public String getName() {
		if(name == null || name.equals("")) {
			if(getInternalId() > -1) {
				name = "XmlElementNavigation " + getInternalId();
				return name;
			}
		}
		return name;
	}
	
	@Override
	public EList<Parameter> getAllParameters() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();		
		if (xmlPathParam != null) {
			res.addAll(xmlPathParam.getAllParameters());
		} else 
			throw new InvalidityException("pathParam null" + " (" + getInternalId() + ")");
		return res;
	}	

	@Override
	public void removeParametersFromParameterList() {		
		XmlPathParam option = xmlPathParam;
		setXmlPathParam(null);
		ParameterList parameterList = getParameterList();	
		if(parameterList != null) {
			parameterList.remove(option);
		}
	}
	
	@Override
	public void createParameters() {	
		ParameterList parameterList = getParameterList();
		if(parameterList != null) {
			XmlPathParam pp = getXmlPathParam();
			if (pp == null) {
				pp = new XmlPathParamImpl();
				setXmlPathParam(pp);
				parameterList.add(pp);
				pp.createParameters();
			}
			if (!pp.getParameterList().equals(parameterList)){
				parameterList.add(pp);
			}
		}
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(xmlPathParam);
		setXmlPathParam(null);
		return patternElements;		
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
	 * @generated
	 */
	public XmlPathParam basicGetXmlPathParam() {
		return xmlPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlPathParam(XmlPathParam newXmlPathParam, NotificationChain msgs) {
		XmlPathParam oldXmlPathParam = xmlPathParam;
		xmlPathParam = newXmlPathParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_NAVIGATION__XML_PATH_PARAM, oldXmlPathParam, newXmlPathParam);
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
	public void setXmlPathParam(XmlPathParam newXmlPathParam) {
		if (newXmlPathParam != xmlPathParam) {
			NotificationChain msgs = null;
			if (xmlPathParam != null)
				msgs = ((InternalEObject)xmlPathParam).eInverseRemove(this, AdaptionxmlPackage.XML_PATH_PARAM__XML_NAVIGATION, XmlPathParam.class, msgs);
			if (newXmlPathParam != null)
				msgs = ((InternalEObject)newXmlPathParam).eInverseAdd(this, AdaptionxmlPackage.XML_PATH_PARAM__XML_NAVIGATION, XmlPathParam.class, msgs);
			msgs = basicSetXmlPathParam(newXmlPathParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_NAVIGATION__XML_PATH_PARAM, newXmlPathParam, newXmlPathParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public XmlPathParam getXmlPathParam() {
		if (xmlPathParam != null && xmlPathParam.eIsProxy()) {
			InternalEObject oldPathParam = (InternalEObject)xmlPathParam;
			xmlPathParam = (XmlPathParam)eResolveProxy(oldPathParam);
			if (xmlPathParam != oldPathParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_NAVIGATION__XML_PATH_PARAM, oldPathParam, xmlPathParam));
			}
		} 
		return xmlPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetPathParam(XmlPathParam newPathParam, NotificationChain msgs) {
		XmlPathParam oldPathParam = xmlPathParam;
		
		ParameterList varlist = getParameterList();
		if(varlist != null) {
			varlist.remove(oldPathParam);			
			varlist.add(newPathParam);				
		}
		
		xmlPathParam = newPathParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_ELEMENT_NAVIGATION__XML_PATH_PARAM, oldPathParam, newPathParam);
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
	
	@Override
	public void initializeTranslation() {
		super.initializeTranslation();
		setVariableCounter(VARIABLE_COUNTER_EDEFAULT);
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
			case AdaptionxmlPackage.XML_NAVIGATION__XML_PATH_PARAM:
				if (xmlPathParam != null)
					msgs = ((InternalEObject)xmlPathParam).eInverseRemove(this, AdaptionxmlPackage.XML_PATH_PARAM__XML_NAVIGATION, XmlPathParam.class, msgs);
				return basicSetXmlPathParam((XmlPathParam)otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_NAVIGATION__XML_PATH_PARAM:
				return basicSetXmlPathParam(null, msgs);
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
			case AdaptionxmlPackage.XML_NAVIGATION__XML_PATH_PARAM:
				if (resolve) return getXmlPathParam();
				return basicGetXmlPathParam();
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
			case AdaptionxmlPackage.XML_NAVIGATION__XML_PATH_PARAM:
				setXmlPathParam((XmlPathParam)newValue);
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
			case AdaptionxmlPackage.XML_NAVIGATION__XML_PATH_PARAM:
				setXmlPathParam((XmlPathParam)null);
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
			case AdaptionxmlPackage.XML_NAVIGATION__XML_PATH_PARAM:
				return xmlPathParam != null;
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
		if (getXmlPathParam() != null) {
			return res + " (" + getXmlPathParam().myToString() + ")";
		} else {
			return res + " (prev.)";
		}
	}
} //XmlNavigationImpl
