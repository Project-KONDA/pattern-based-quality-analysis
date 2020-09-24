/**
 */
package qualitypatternmodel.adaptionxml.impl;

import static qualitypatternmodel.utilityclasses.Constants.EVERY;
import static qualitypatternmodel.utilityclasses.Constants.FOR;
import static qualitypatternmodel.utilityclasses.Constants.IN;
import static qualitypatternmodel.utilityclasses.Constants.SATISFIES;
import static qualitypatternmodel.utilityclasses.Constants.SOME;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.impl.RelationImpl;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.impl.RelationOptionParamImpl;
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
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XmlNavigationImpl extends RelationImpl implements XmlNavigation {
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * A <code>RelationOptionParam</code> that specifies the type of <code>this</code>, thus the corresponding XPath axis.
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected RelationOptionParam option;

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
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		super.isValidLocal(abstractionLevel);
		if (getIncomingMapping() == null && option == null)
			throw new InvalidityException("axis missing");
		if (getIncomingMapping() != null && option != null)
			throw new InvalidityException("axis redundant");
		
		for(RelationMapping mapping : getOutgoingMappings()) {
			if(!(mapping.getSource() instanceof XmlNavigation)) {
				throw new InvalidityException("mapping different relations");
			}			
		}		
	}	
	
	@Override
	public XmlReference adaptAsXMLReference() {
		removeParametersFromParameterList();
		return super.adaptAsXMLReference();
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
		if (getOption() != null) {
			res.add(option);
		} else if (getIncomingMapping() == null) {
			throw new InvalidityException("option null" + " (" + getInternalId() + ")");
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
				if (getOption() == null) {
					RelationOptionParam relationOptionParam = new RelationOptionParamImpl();
					setOption(relationOptionParam);
				} else {
					parameterList.add(getOption());
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
		RelationOptionParam option = getOption();
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
	public RelationOptionParam getOption() {
		if (option != null && option.eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (RelationOptionParam)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_NAVIGATION__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationOptionParam basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOption(RelationOptionParam newOption, NotificationChain msgs) {
		RelationOptionParam oldOption = option;
				
		ParameterList varlist = getParameterList();
		varlist.remove(oldOption);			
		varlist.add(newOption);				
		
		option = newOption;
		
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_NAVIGATION__OPTION, oldOption, newOption);
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
	public void setOption(RelationOptionParam newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.RELATION_OPTION_PARAM__RELATIONS, RelationOptionParam.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, ParametersPackage.RELATION_OPTION_PARAM__RELATIONS, RelationOptionParam.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_NAVIGATION__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdaptionxmlPackage.XML_NAVIGATION__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, ParametersPackage.RELATION_OPTION_PARAM__RELATIONS, RelationOptionParam.class, msgs);
				return basicSetOption((RelationOptionParam)otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_NAVIGATION__OPTION:
				return basicSetOption(null, msgs);
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
			case AdaptionxmlPackage.XML_NAVIGATION__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
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
			case AdaptionxmlPackage.XML_NAVIGATION__OPTION:
				setOption((RelationOptionParam)newValue);
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
			case AdaptionxmlPackage.XML_NAVIGATION__OPTION:
				setOption((RelationOptionParam)null);
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
			case AdaptionxmlPackage.XML_NAVIGATION__OPTION:
				return option != null;
		}
		return super.eIsSet(featureID);
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
