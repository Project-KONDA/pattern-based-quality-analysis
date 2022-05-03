/**
 */
package qualitypatternmodel.adaptionxml.impl;

import java.lang.reflect.InvocationTargetException;
import static qualitypatternmodel.utility.Constants.EVERY;
import static qualitypatternmodel.utility.Constants.FOR;
import static qualitypatternmodel.utility.Constants.IN;
import static qualitypatternmodel.utility.Constants.SATISFIES;
import static qualitypatternmodel.utility.Constants.SOME;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.AxisOptionParam;
import qualitypatternmodel.adaptionxml.PathParam;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
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
 * An implementation of the model object '<em><b>XML Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl#getPathParam <em>Path Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlNavigationImpl extends RelationImpl implements XmlNavigation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlNavigationImpl() {
		super();
	}
	
	@Override
	public String generateQuery() throws InvalidityException {
		String query = "";
		
		String source = "";
		if(getSource() instanceof XmlElement) {
			XmlElement sourceElement = (XmlElement) getSource();
			source = sourceElement.getXQueryVariable();
		}
		String xPathExpression = "";
		if (option != null && getIncomingMapping() == null) {
			xPathExpression = source + option.generateQuery();
		} else if(getIncomingMapping() == null) {
			throw new InvalidityException("option null");
		}
		
		String xPredicates;
		String target;
		if(getTarget() instanceof XmlElement) {
			XmlElement targetElement = (XmlElement) getTarget();
			targetElement.setTranslated(true);
			xPredicates = targetElement.translatePredicates();
			target = targetElement.getXQueryVariable();
		} else {
			throw new InvalidityException("target of relation not XMLElement");
		}	
		
		if(getGraph() == null) {
			throw new InvalidityException("container Graph null");
		}
		
		if (getGraph().isReturnGraph()) {
			query += FOR + target + IN; 			
			if (getTarget().getIncomingMapping() == null) {
				query += xPathExpression + xPredicates;
			} else if (!xPredicates.equals("")) {
				query += target + xPredicates;
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
			query += target + IN;
			if (getTarget().getIncomingMapping() == null) {
				query += xPathExpression + xPredicates + SATISFIES;
			} else if (!xPredicates.equals("")) {
				query += target + xPredicates + SATISFIES;
			} else {
				query = "";
			}
		}
		
		query += getTarget().generateQuery();
		
		return query;
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
		if (getIncomingMapping() == null && pathParam == null)
			throw new InvalidityException("pathParam missing");
		if (getIncomingMapping() != null && pathParam != null)
			throw new InvalidityException("pathParam redundant");
	}	
	
	@Override
	public XmlPropertyNavigation adaptAsXMLPropertyNavigation() throws InvalidityException {
		if(target.isTypeModifiable()) {
			removeParametersFromParameterList();
			return super.adaptAsXMLPropertyNavigation();
		} else {
			throw new InvalidityException("XmlNavigation with a non-modifiable target cannot be adapted as an XmlPropertyNavigation.");
		}
	}
	
	@Override
	public XmlReference adaptAsXMLReference() throws InvalidityException {
		removeParametersFromParameterList();
		return super.adaptAsXMLReference();
	}
	
	@Override
	public PatternElement createXMLAdaption() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return this;
	}
	
	@Override
	public XmlNavigation adaptAsXMLNavigation() {
		return this;
	}
	
	@Override
	public String getName() {
		if(name == null || name.equals("")) {
			if(getOriginalID() > -1) {
				name = "XmlNavigation " + getOriginalID();
				return name;
			}
		}
		return name;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
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
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void createParameters() {	
		if (getIncomingMapping() == null) {		
			ParameterList parameterList = getParameterList();
			if(parameterList != null) {
				if (getPathParam() == null) {
					PathParam axisOptionParam = new PathParamImpl();
					setPathParam(axisOptionParam);
				} else {
					parameterList.add(getPathParam());
				}		
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void removeParametersFromParameterList() {
		AxisOptionParam option = getOption();
		setOption(null);
		ParameterList parameterList = getParameterList();	
		if(parameterList != null) {
			parameterList.remove(option);
		}
	}
	
	@Override
	public EList<PatternElement> prepareParameterUpdates() {
		EList<PatternElement> patternElements = new BasicEList<PatternElement>();
		patternElements.add(getOption());
		setOption(null);
		return patternElements;		
	}
	
	@Override
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {		
		NotificationChain res = super.basicSetGraph(newGraph, msgs);		
		createParameters();
		return res;
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
	 * @generated
	 */
	@Override
	public PathParam getPathParam() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_NAVIGATION__PATH_PARAM, oldPathParam, newPathParam);
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
	 * @generated NOT
	 */
	@Override
	public PathParam getOriginalPathParam() {
		if (getIncomingMapping() == null) {
			return getPathParam();
		} else {
			return ((XmlNavigation) getOriginalRelation()).getOriginalPathParam();		
		}
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
			case AdaptionxmlPackage.XML_NAVIGATION___GET_ORIGINAL_PATH_PARAM:
				return getOriginalPathParam();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public String myToString() {
		String res = super.myToString() + " ";
		if (getOption() != null) {
			return res + "(" + getOption().getValue().getLiteral() + "[" + getOption().getInternalId() + "])";
		} else {
			return res + "(prev.)";
		}
	}
} //XMLNavigationImpl
