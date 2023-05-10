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
	 * Returns a new object of class '<em>Xml Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Element</em>'.
	 * @generated
	 */
	XmlElement createXmlElement();

	/**
	 * Returns a new object of class '<em>Xml Element Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Element Navigation</em>'.
	 * @generated
	 */
	XmlElementNavigation createXmlElementNavigation();

	/**
	 * Returns a new object of class '<em>Xml Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Reference</em>'.
	 * @generated
	 */
	XmlReference createXmlReference();

	/**
	 * Returns a new object of class '<em>Xml Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Property</em>'.
	 * @generated
	 */
	XmlProperty createXmlProperty();

	/**
	 * Returns a new object of class '<em>Xml Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Root</em>'.
	 * @generated
	 */
	XmlRoot createXmlRoot();

	/**
	 * Returns a new object of class '<em>Xml Property Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Property Navigation</em>'.
	 * @generated
	 */
	XmlPropertyNavigation createXmlPropertyNavigation();

	/**
	 * Returns a new object of class '<em>Xml Axis Option Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Axis Option Param</em>'.
	 * @generated
	 */
	XmlAxisOptionParam createXmlAxisOptionParam();

	/**
	 * Returns a new object of class '<em>Xml Property Option Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Property Option Param</em>'.
	 * @generated
	 */
	XmlPropertyOptionParam createXmlPropertyOptionParam();

	/**
	 * Returns a new object of class '<em>Xml Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Path Param</em>'.
	 * @generated
	 */
	XmlPathParam createXmlPathParam();

	/**
	 * Returns a new object of class '<em>Xml Axis Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Axis Pair</em>'.
	 * @generated
	 */
	XmlAxisPart createXmlAxisPair();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptionxmlPackage getAdaptionxmlPackage();

} //AdaptionxmlFactory
