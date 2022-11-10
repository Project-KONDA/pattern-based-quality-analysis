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
			case AdaptionxmlPackage.XML_ELEMENT_NAVIGATION: return createXmlElementNavigation();
			case AdaptionxmlPackage.XML_REFERENCE: return createXmlReference();
			case AdaptionxmlPackage.XML_PROPERTY: return createXmlProperty();
			case AdaptionxmlPackage.XML_ROOT: return createXmlRoot();
			case AdaptionxmlPackage.XML_PROPERTY_NAVIGATION: return createXmlPropertyNavigation();
			case AdaptionxmlPackage.XML_AXIS_OPTION_PARAM: return createXmlAxisOptionParam();
			case AdaptionxmlPackage.XML_PROPERTY_OPTION_PARAM: return createXmlPropertyOptionParam();
			case AdaptionxmlPackage.XML_PATH_PARAM: return createXmlPathParam();
			case AdaptionxmlPackage.XML_AXIS_PART: return createXmlAxisPart();
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
			case AdaptionxmlPackage.XML_PROPERTY_KIND:
				return createXmlPropertyKindFromString(eDataType, initialValue);
			case AdaptionxmlPackage.XML_AXIS_KIND:
				return createXmlAxisKindFromString(eDataType, initialValue);
			case AdaptionxmlPackage.XML_AXIS_KIND_ARRAY:
				return createXmlAxisKindArrayFromString(eDataType, initialValue);
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
			case AdaptionxmlPackage.XML_PROPERTY_KIND:
				return convertXmlPropertyKindToString(eDataType, instanceValue);
			case AdaptionxmlPackage.XML_AXIS_KIND:
				return convertXmlAxisKindToString(eDataType, instanceValue);
			case AdaptionxmlPackage.XML_AXIS_KIND_ARRAY:
				return convertXmlAxisKindArrayToString(eDataType, instanceValue);
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
	public XmlElementNavigation createXmlElementNavigation() {
		XmlElementNavigationImpl xmlElementNavigation = new XmlElementNavigationImpl();
		return xmlElementNavigation;
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
	public XmlAxisOptionParam createXmlAxisOptionParam() {
		XmlAxisOptionParamImpl xmlAxisOptionParam = new XmlAxisOptionParamImpl();
		return xmlAxisOptionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlPropertyOptionParam createXmlPropertyOptionParam() {
		XmlPropertyOptionParamImpl xmlPropertyOptionParam = new XmlPropertyOptionParamImpl();
		return xmlPropertyOptionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlPathParam createXmlPathParam() {
		XmlPathParamImpl xmlPathParam = new XmlPathParamImpl();
		return xmlPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XmlAxisPart createXmlAxisPart() {
		XmlAxisPartImpl xmlAxisPart = new XmlAxisPartImpl();
		return xmlAxisPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlPropertyKind createXmlPropertyKindFromString(EDataType eDataType, String initialValue) {
		XmlPropertyKind result = XmlPropertyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXmlPropertyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlAxisKind createXmlAxisKindFromString(EDataType eDataType, String initialValue) {
		XmlAxisKind result = XmlAxisKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXmlAxisKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlAxisKind[] createXmlAxisKindArrayFromString(EDataType eDataType, String initialValue) {
		return (XmlAxisKind[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXmlAxisKindArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
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
