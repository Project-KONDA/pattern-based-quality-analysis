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
import qualitypatternmodel.adaptionxml.XMLElement;
import qualitypatternmodel.adaptionxml.XMLNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.impl.RelationImpl;

import qualitypatternmodel.parameters.OptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.RelationOptionParam;
import qualitypatternmodel.parameters.impl.RelationOptionParamImpl;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.RelationMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XMLNavigationImpl#getOption <em>Option</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionxml.impl.XMLNavigationImpl#getOptionParam <em>Option Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLNavigationImpl extends RelationImpl implements XMLNavigation {
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected RelationOptionParam option;

	/**
	 * The cached value of the '{@link #getOptionParam() <em>Option Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionParam()
	 * @generated
	 * @ordered
	 */
	protected OptionParam optionParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XMLNavigationImpl() {
		super();
	}
	
	@Override
	public String generateQuery(Location location) throws InvalidityException {
		// TODO: adapt
//		translated = true;

		String query = "";
		
		String source = "";
		if(getSource() instanceof XMLElement) {
			XMLElement sourceElement = (XMLElement) getSource();
			source = sourceElement.getXQueryVariable();
		}
		String xPathExpression = "";
		if (option != null && getMappingFrom() == null) {
			xPathExpression = source + option.generateQuery(location);
		} else if(getMappingFrom() == null) {
			throw new InvalidityException("option null");
		}
		
		String xPredicates;
		String target;
		if(getTarget() instanceof XMLElement) {
			XMLElement targetElement = (XMLElement) getTarget();
			targetElement.setTranslated(true);
			xPredicates = targetElement.translatePredicates(location);
			target = targetElement.getXQueryVariable();
		} else {
			throw new InvalidityException("target of relation not XMLElement");
		}	
		
		if (location == Location.RETURN) {
			query += FOR + target + IN; 			
			if (getTarget().getMappingFrom() == null) {
				query += xPathExpression + xPredicates;
			} else if (!xPredicates.equals("")) {
				query += target + xPredicates;
			} else {
				query = "";
			}
			
		} else {
			if (location == Location.EXISTS) {
				query += SOME;
			} else if (location == Location.FORALL) {
				query += EVERY;
			} else {
				throw new InvalidityException("invalid location");
			}
			query += target + IN;
			if (getTarget().getMappingFrom() == null) {
				query += xPathExpression + xPredicates + SATISFIES;
			} else if (!xPredicates.equals("")) {
				query += target + xPredicates + SATISFIES;
			} else {
				query = "";
			}
		}
		
		query += getTarget().generateQuery(location);
		
		return query;
	}
	
	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {
		super.isValidLocal(isDefinedPattern);
		if (getMappingFrom() == null && option == null)
			throw new InvalidityException("axis missing");
		if (getMappingFrom() != null && option != null)
			throw new InvalidityException("axis redundant");
		
		for(RelationMapping mapping : getMappingTo()) {
			if(!(mapping.getFrom() instanceof XMLNavigation)) {
				throw new InvalidityException("mapping different relations");
			}			
		}		
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public EList<Parameter> getAllInputs() throws InvalidityException {
		EList<Parameter> res = new BasicEList<Parameter>();
		if (getOption() != null) {
			res.add(option);
		} else if (getMappingFrom() == null) {
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
		ParameterList parameterList = getParameterList();
		if (getOption() == null) {
			RelationOptionParam relationOptionParam = new RelationOptionParamImpl();
			if(parameterList != null) {
				parameterList.add(relationOptionParam);
			}
			setOption(relationOptionParam);
		} else {
			parameterList.add(getOption());
		}		
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void removeParametersFromParameterList() {
		ParameterList parameterList = getParameterList();			
		parameterList.getParameters().remove(getOption());		
	}
	
	@Override
	public void updateParameters(ParameterList newParameterList) {
		if(getOption() != null) {
			getOption().updateParameters(newParameterList);		
		}
	}
	
	@Override
	public NotificationChain basicSetGraph(Graph newGraph, NotificationChain msgs) {
		if(newGraph != null) {
			updateParameters(newGraph.getParameterList());
		}
		NotificationChain res = super.basicSetGraph(newGraph, msgs);
		if (newGraph != null && getMappingFrom() == null) {
			createParameters();
		}
		return res;
	}
	
	@Override
	public NotificationChain basicSetMappingFrom(RelationMapping newMappingFrom, NotificationChain msgs) {
		if (newMappingFrom != null) { // TODO: remove?
			removeParametersFromParameterList();
			setOption(null);
		}
		NotificationChain res = super.basicSetMappingFrom(newMappingFrom, msgs);
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
	 * @generated
	 */
	public NotificationChain basicSetOption(RelationOptionParam newOption, NotificationChain msgs) {
		RelationOptionParam oldOption = option;
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
	public OptionParam getOptionParam() {
		if (optionParam != null && optionParam.eIsProxy()) {
			InternalEObject oldOptionParam = (InternalEObject)optionParam;
			optionParam = (OptionParam)eResolveProxy(oldOptionParam);
			if (optionParam != oldOptionParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionxmlPackage.XML_NAVIGATION__OPTION_PARAM, oldOptionParam, optionParam));
			}
		}
		return optionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionParam basicGetOptionParam() {
		return optionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptionParam(OptionParam newOptionParam, NotificationChain msgs) {
		OptionParam oldOptionParam = optionParam;
		optionParam = newOptionParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_NAVIGATION__OPTION_PARAM, oldOptionParam, newOptionParam);
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
	public void setOptionParam(OptionParam newOptionParam) {
		if (newOptionParam != optionParam) {
			NotificationChain msgs = null;
			if (optionParam != null)
				msgs = ((InternalEObject)optionParam).eInverseRemove(this, ParametersPackage.OPTION_PARAM__RELATION, OptionParam.class, msgs);
			if (newOptionParam != null)
				msgs = ((InternalEObject)newOptionParam).eInverseAdd(this, ParametersPackage.OPTION_PARAM__RELATION, OptionParam.class, msgs);
			msgs = basicSetOptionParam(newOptionParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionxmlPackage.XML_NAVIGATION__OPTION_PARAM, newOptionParam, newOptionParam));
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
			case AdaptionxmlPackage.XML_NAVIGATION__OPTION_PARAM:
				if (optionParam != null)
					msgs = ((InternalEObject)optionParam).eInverseRemove(this, ParametersPackage.OPTION_PARAM__RELATION, OptionParam.class, msgs);
				return basicSetOptionParam((OptionParam)otherEnd, msgs);
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
			case AdaptionxmlPackage.XML_NAVIGATION__OPTION_PARAM:
				return basicSetOptionParam(null, msgs);
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
			case AdaptionxmlPackage.XML_NAVIGATION__OPTION_PARAM:
				if (resolve) return getOptionParam();
				return basicGetOptionParam();
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
			case AdaptionxmlPackage.XML_NAVIGATION__OPTION_PARAM:
				setOptionParam((OptionParam)newValue);
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
			case AdaptionxmlPackage.XML_NAVIGATION__OPTION_PARAM:
				setOptionParam((OptionParam)null);
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
			case AdaptionxmlPackage.XML_NAVIGATION__OPTION_PARAM:
				return optionParam != null;
		}
		return super.eIsSet(featureID);
	}

} //XMLNavigationImpl
