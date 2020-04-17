/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XMLNavigation;
import qualitypatternmodel.adaptionxml.XMLReference;
import qualitypatternmodel.adaptionxml.XMLRoot;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.impl.ElementImpl;
import qualitypatternmodel.patternstructure.Location;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XMLRootImpl extends ElementImpl implements XMLRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLRootImpl() {
		super();
	}
	
	@Override
	public String generateQuery(Location location) throws InvalidityException {
		String result = "";
		for(Relation relation : getOutgoing()) {
			if(relation instanceof XMLNavigation) {
				result += relation.generateQuery(location);
			} else {
				throw new InvalidityException("XMLRoot has XMLReference");
			}
		}
		return result;		
	}

	@Override
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {	
		super.isValidLocal(isDefinedPattern);
		if(getIncoming() != null) {
			throw new InvalidityException("incoming relation at XMLRoot " + getId());
		}
		if(!getPredicates().isEmpty()) {
			throw new InvalidityException("XMLRoot has predicate");
		}
		for(Relation relation : getOutgoing()) {
			if(relation instanceof XMLReference) {
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
