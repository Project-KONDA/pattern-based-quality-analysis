/**
 */
package qualitypatternmodel.adaptionxml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.adaptionxml.AdaptionxmlPackage
 * @generated
 */
public interface AdaptionxmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptionxmlFactory eINSTANCE = qualitypatternmodel.adaptionxml.impl.AdaptionxmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XML Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Element</em>'.
	 * @generated
	 */
	XMLElement createXMLElement();

	/**
	 * Returns a new object of class '<em>XML Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Navigation</em>'.
	 * @generated
	 */
	XMLNavigation createXMLNavigation();

	/**
	 * Returns a new object of class '<em>XML Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Reference</em>'.
	 * @generated
	 */
	XMLReference createXMLReference();

	/**
	 * Returns a new object of class '<em>XML Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Property</em>'.
	 * @generated
	 */
	XMLProperty createXMLProperty();

	/**
	 * Returns a new object of class '<em>XML Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Root</em>'.
	 * @generated
	 */
	XMLRoot createXMLRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptionxmlPackage getAdaptionxmlPackage();

} //AdaptionxmlFactory
