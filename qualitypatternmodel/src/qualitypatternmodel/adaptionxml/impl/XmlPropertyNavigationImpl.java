/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.PathParam;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.PatternElement;

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
		if (pathParam == null) 
			throw new InvalidityException("pathParam invalid");
		// TODO
		// if (getIncomingMapping() == null && option == null)
		//	throw new InvalidityException("axis missing");
		//if (getIncomingMapping() != null && option != null)
		//	throw new InvalidityException("axis redundant");
	}	
	
	@Override
	public XmlPropertyNavigation adaptAsXMLPropertyNavigation() {
		return this;
	}
	
	@Override
	public XmlElementNavigation adaptAsXMLElementNavigation() throws InvalidityException {
		if(target.isTypeModifiable()) {
			removeParametersFromParameterList();
			return super.adaptAsXMLElementNavigation();
		} else {
			throw new InvalidityException("XmlPropertyNavigation with a non-modifiable target cannot be adapted as an XmlNavigation.");
		}
	}
	
	@Override
	public XmlReference adaptAsXMLReference() throws InvalidityException {
		if(target.isTypeModifiable()) {
			return super.adaptAsXMLReference();
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
		assert (newTarget == null || newTarget instanceof PrimitiveNode);
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
