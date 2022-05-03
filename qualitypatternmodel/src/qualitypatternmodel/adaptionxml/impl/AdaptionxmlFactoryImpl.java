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
			case AdaptionxmlPackage.XML_ELEMENT: return createXmlElement();
			case AdaptionxmlPackage.XML_NAVIGATION: return createXmlNavigation();
			case AdaptionxmlPackage.XML_REFERENCE: return createXmlReference();
			case AdaptionxmlPackage.XML_PROPERTY: return createXmlProperty();
			case AdaptionxmlPackage.XML_ROOT: return createXmlRoot();
			case AdaptionxmlPackage.XML_PROPERTY_NAVIGATION: return createXmlPropertyNavigation();
			case AdaptionxmlPackage.RELATION_OPTION_PARAM: return createRelationOptionParam();
			case AdaptionxmlPackage.PROPERTY_OPTION_PARAM: return createPropertyOptionParam();
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
			case AdaptionxmlPackage.PROPERTY_KIND:
				return createPropertyKindFromString(eDataType, initialValue);
			case AdaptionxmlPackage.RELATION_KIND:
				return createRelationKindFromString(eDataType, initialValue);
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
			case AdaptionxmlPackage.PROPERTY_KIND:
				return convertPropertyKindToString(eDataType, instanceValue);
			case AdaptionxmlPackage.RELATION_KIND:
				return convertRelationKindToString(eDataType, instanceValue);
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
	public XmlElement createXmlElement() {
		XmlElementImpl xmlElement = new XmlElementImpl();
		return xmlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlNavigation createXmlNavigation() {
		XmlNavigationImpl xmlNavigation = new XmlNavigationImpl();
		return xmlNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlReference createXmlReference() {
		XmlReferenceImpl xmlReference = new XmlReferenceImpl();
		return xmlReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlProperty createXmlProperty() {
		XmlPropertyImpl xmlProperty = new XmlPropertyImpl();
		return xmlProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlRoot createXmlRoot() {
		XmlRootImpl xmlRoot = new XmlRootImpl();
		return xmlRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlPropertyNavigation createXmlPropertyNavigation() {
		XmlPropertyNavigationImpl xmlPropertyNavigation = new XmlPropertyNavigationImpl();
		return xmlPropertyNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationOptionParam createRelationOptionParam() {
		RelationOptionParamImpl relationOptionParam = new RelationOptionParamImpl();
		return relationOptionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyOptionParam createPropertyOptionParam() {
		PropertyOptionParamImpl propertyOptionParam = new PropertyOptionParamImpl();
		return propertyOptionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyKind createPropertyKindFromString(EDataType eDataType, String initialValue) {
		PropertyKind result = PropertyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationKind createRelationKindFromString(EDataType eDataType, String initialValue) {
		RelationKind result = RelationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationKindToString(EDataType eDataType, Object instanceValue) {
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
