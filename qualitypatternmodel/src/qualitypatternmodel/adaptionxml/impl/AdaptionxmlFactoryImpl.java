/**
 */
package qualitypatternmodel.adaptionxml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.adaptionxml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptionxmlFactoryImpl extends EFactoryImpl implements AdaptionxmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdaptionxmlFactory init() {
		try {
			AdaptionxmlFactory theAdaptionxmlFactory = (AdaptionxmlFactory)EPackage.Registry.INSTANCE.getEFactory(AdaptionxmlPackage.eNS_URI);
			if (theAdaptionxmlFactory != null) {
				return theAdaptionxmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdaptionxmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptionxmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdaptionxmlPackage.XML_ELEMENT: return createXMLElement();
			case AdaptionxmlPackage.XML_NAVIGATION: return createXMLNavigation();
			case AdaptionxmlPackage.XML_REFERENCE: return createXMLReference();
			case AdaptionxmlPackage.XML_PROPERTY: return createXMLProperty();
			case AdaptionxmlPackage.XML_ROOT: return createXMLRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AdaptionxmlPackage.PROPERTY_LOCATION:
				return createPropertyLocationFromString(eDataType, initialValue);
			case AdaptionxmlPackage.AXIS:
				return createAxisFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AdaptionxmlPackage.PROPERTY_LOCATION:
				return convertPropertyLocationToString(eDataType, instanceValue);
			case AdaptionxmlPackage.AXIS:
				return convertAxisToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLElement createXMLElement() {
		XMLElementImpl xmlElement = new XMLElementImpl();
		return xmlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLNavigation createXMLNavigation() {
		XMLNavigationImpl xmlNavigation = new XMLNavigationImpl();
		return xmlNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLReference createXMLReference() {
		XMLReferenceImpl xmlReference = new XMLReferenceImpl();
		return xmlReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLProperty createXMLProperty() {
		XMLPropertyImpl xmlProperty = new XMLPropertyImpl();
		return xmlProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLRoot createXMLRoot() {
		XMLRootImpl xmlRoot = new XMLRootImpl();
		return xmlRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyLocation createPropertyLocationFromString(EDataType eDataType, String initialValue) {
		PropertyLocation result = PropertyLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis createAxisFromString(EDataType eDataType, String initialValue) {
		Axis result = Axis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdaptionxmlPackage getAdaptionxmlPackage() {
		return (AdaptionxmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdaptionxmlPackage getPackage() {
		return AdaptionxmlPackage.eINSTANCE;
	}

} //AdaptionxmlFactoryImpl
