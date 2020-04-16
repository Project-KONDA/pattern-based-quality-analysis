/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XMLRoot;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.impl.ElementImpl;

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
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException {	
		super.isValidLocal(isDefinedPattern);
		if(getIncoming() != null) {
			throw new InvalidityException("incoming relation at XMLRoot " + getId());
		}
		if(!getPredicates().isEmpty()) {
			throw new InvalidityException("XMLRoot has predicate");
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
