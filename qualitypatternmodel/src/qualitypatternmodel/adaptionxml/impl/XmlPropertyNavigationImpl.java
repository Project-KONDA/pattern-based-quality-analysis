/**
 */
package qualitypatternmodel.adaptionxml.impl;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static qualitypatternmodel.utility.Constants.FOR;
import static qualitypatternmodel.utility.Constants.IN;
import static qualitypatternmodel.utility.Constants.RETURN;
import static qualitypatternmodel.utility.JavaQueryTranslationUtility.VALUE;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNode;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.utility.JavaQueryTranslationUtility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Property Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XmlPropertyNavigationImpl extends XmlNavigationImpl implements XmlPropertyNavigation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlPropertyNavigationImpl() {
		super();
	}
	
	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {
		super.isValidLocal(abstractionLevel);
		if (getXmlPathParam() == null) 
			throw new InvalidityException("XmlPropertyNavigation [" + getInternalId() + "] has no pathParam");
		// TODO
		// if (getIncomingMapping() == null && option == null)
		//	throw new InvalidityException("axis missing");
		//if (getIncomingMapping() != null && option != null)
		//	throw new InvalidityException("axis redundant");
	}	

	@Override
	public String generateXQuery() throws InvalidityException {
		if (!getXmlPathParam().getXmlAxisParts().isEmpty()) 
			return super.generateXQuery();
		
		XmlProperty target = (XmlProperty) getTarget();
		
		String path = getXmlPathParam().generateXQuery();
		
		XmlElement source = (XmlElement) getSource();
		String variable = source.getVariables().get(0) + path;
		target.getVariables().add(variable);		
		String result = "." + path;
		target.setTranslated(true);
		
		result += target.translatePredicates();
		result += target.translateMultipleIncoming();
		
		return "[" + result + "]";
	}

	public String generateXQuery2() throws InvalidityException {
		return super.generateXQuery();
	}

	@Override
	public String generateXQueryJavaReturn() throws InvalidityException {
		String variable = generateNextXQueryVariable();
		
		if (!getTarget().containsJavaOperator())
			new InvalidityException("This query should not get translated here: " + variable);
		
		// Basic Translation via xmlPathParam
		String path = "";
		if (xmlPathParam == null)
			throw new InvalidityException("option null");
			
		String sourcevariable = ((XmlNode) source).getVariables().size()>0? ((XmlNode) source).getVariables().get(0) : "X";
//		String sourcevariable = getSourceVariable();
		if (!(getSource() instanceof XmlRoot) && sourcevariable == "") {
			throw new InvalidityException("SourceVariable in Relation [" + getInternalId() + "] from Element [" + getSource().getInternalId() + "] is empty");
		}
			
		path = sourcevariable + xmlPathParam.generateXQuery();

		// Predicate
		String predicates = "";
		if(getTarget() instanceof XmlNode) {
			getTarget().setTranslated(true);
			XmlNode targetElement = (XmlNode) getTarget();
			predicates = targetElement.translatePredicates();
		} else {
			throw new InvalidityException("target of relation not XmlNode");
		}
		
		String query1 = FOR + variable + IN + path + predicates;
		String query2 = RETURN + variable;
		String query = query1 + query2;
		query = query.indent(2);
		query = JavaQueryTranslationUtility.getXQueryReturnList(List.of(query), VALUE, false, false, true);
//		query = "\n  " + VALUESTART +",\n  (" + query + "  ),\n  "+ VALUEEND; // + "\n  ";
		return query; 
	}
	
	
	@Override
	public XmlPropertyNavigation adaptAsXmlPropertyNavigation() {
		return this;
	}
	
	@Override
	public XmlElementNavigation adaptAsXmlElementNavigation() throws InvalidityException {
		if(target.isTypeModifiable()) {
			removeParametersFromParameterList();
			return super.adaptAsXmlElementNavigation();
		} else {
			throw new InvalidityException("XmlPropertyNavigation with a non-modifiable target cannot be adapted as an XmlNavigation.");
		}
	}
	
	@Override
	public XmlReference adaptAsXmlReference() throws InvalidityException {
		if(target.isTypeModifiable()) {
			return super.adaptAsXmlReference();
		} else {
			throw new InvalidityException("XmlPropertyNavigation with a non-modifiable target cannot be adapted as an XmlReference.");
		}
	}

	@Override
	public String getName() {
		if(name == null || name.equals("")) {
			if(getInternalId() > -1) {
				name = "XmlPropertyNavigation " + getInternalId();
				return name;
			}
		}
		return name;
	}	
	
	@Override
	public void setTarget(Node newTarget) {
		if (newTarget != null)
			assertDoesNotThrow(() -> {newTarget.checkPrimitive();});
		super.setTarget(newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_PROPERTY_NAVIGATION;
	}

} //XmlPropertyNavigationImpl
