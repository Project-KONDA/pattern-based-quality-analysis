/**
 */
package qualitypatternmodel.adaptionxml.impl;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.AbstractionLevel;

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
		boolean hasAxis = !getXmlPathParam().getXmlAxisPairs().isEmpty();
		boolean isNew = getSource().getIncomingMapping() != null && getTarget().getIncomingMapping() == null;
		if (hasAxis || isNew) 
			return super.generateXQuery();
		
		XmlProperty target = (XmlProperty) getTarget();
		
		String path = getXmlPathParam().generateXQuery();
		
		XmlElement source = (XmlElement) getSource();
		String variable = source.getVariables().get(0) + path;
		target.getVariables().add(variable);		
		String result = "[" + "." + path;
		target.setTranslated(true);
		
		result += target.translatePredicates();
		result += target.translateMultipleIncoming();
		result += "]";
		
		return result;
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
			if(getOriginalID() > -1) {
				name = "XmlPropertyNavigation " + getOriginalID();
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
