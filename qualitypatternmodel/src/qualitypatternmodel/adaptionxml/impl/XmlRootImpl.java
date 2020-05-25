/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.XmlRoot;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.ElementImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XmlRootImpl extends ElementImpl implements XmlRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XmlRootImpl() {
		super();
		setName("Root");
	}
	
	@Override
	public String generateQuery() throws InvalidityException {
		String result = "";
		for(Relation relation : getOutgoing()) {
			if(relation instanceof XmlNavigation) {
				result += relation.generateQuery();
			} else {
				throw new InvalidityException("XMLRoot has XMLReference");
			}
		}
		return result;		
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel) throws InvalidityException {	
		super.isValidLocal(abstractionLevel);
		if(!getIncoming().isEmpty()) {
			throw new InvalidityException("incoming relation at XMLRoot " + getId());
		}
		if(!getPredicates().isEmpty()) {
			throw new InvalidityException("XMLRoot has predicate");
		}
		for(Relation relation : getOutgoing()) {
			if(relation instanceof XmlReference) {
				throw new InvalidityException("XMLRoot has XMLReference");
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionxmlPackage.Literals.XML_ROOT;
	}

} //XMLRootImpl
