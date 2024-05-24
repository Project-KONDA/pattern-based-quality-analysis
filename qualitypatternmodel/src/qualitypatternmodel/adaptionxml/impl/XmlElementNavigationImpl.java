/**
 */
package qualitypatternmodel.adaptionxml.impl;

import static qualitypatternmodel.utility.Constants.FOR_LITE;
import static qualitypatternmodel.utility.Constants.IN;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNode;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XmlElementNavigationImpl extends XmlNavigationImpl implements XmlElementNavigation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlElementNavigationImpl() {
		super();
	}
	
	@Override
	public String generateXQueryJavaReturn() throws InvalidityException {
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
		String query = FOR_LITE + variable + IN;
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
//		if (query.startsWith("\n"))
//			query = query.substring(1);
//		return "  " + query + "\n  return (";
		query += getTarget().generateXQueryJavaReturn();
		return query;
	}
	
	@Override
	public XmlPropertyNavigation adaptAsXmlPropertyNavigation() throws InvalidityException {
		if(target.isTypeModifiable()) {
			removeParametersFromParameterList();
			return super.adaptAsXmlPropertyNavigation();
		} else {
			throw new InvalidityException("XmlElementNavigation with a non-modifiable target cannot be adapted as an XmlPropertyNavigation.");
		}
	}
	
	@Override
	public XmlElementNavigation adaptAsXmlElementNavigation() {
		return this;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_ELEMENT_NAVIGATION;
	}
} //XMLNavigationImpl
