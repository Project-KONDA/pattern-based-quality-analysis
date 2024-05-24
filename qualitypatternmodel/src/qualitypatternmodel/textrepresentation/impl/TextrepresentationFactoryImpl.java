/**
 */
package qualitypatternmodel.textrepresentation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.json.JSONObject;
import qualitypatternmodel.textrepresentation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextrepresentationFactoryImpl extends EFactoryImpl implements TextrepresentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextrepresentationFactory init() {
		try {
			TextrepresentationFactory theTextrepresentationFactory = (TextrepresentationFactory)EPackage.Registry.INSTANCE.getEFactory(TextrepresentationPackage.eNS_URI);
			if (theTextrepresentationFactory != null) {
				return theTextrepresentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TextrepresentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextrepresentationFactoryImpl() {
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
			case TextrepresentationPackage.PATTERN_TEXT: return createPatternText();
			case TextrepresentationPackage.PARAMETER_FRAGMENT: return createParameterFragment();
			case TextrepresentationPackage.TEXT_FRAGMENT: return createTextFragment();
			case TextrepresentationPackage.PARAMETER_PREDEFINITION: return createParameterPredefinition();
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
			case TextrepresentationPackage.OBJECT_WRAPPER:
				return createObjectWrapperFromString(eDataType, initialValue);
			case TextrepresentationPackage.JSON_OBJECT_WRAPPER:
				return createJSONObjectWrapperFromString(eDataType, initialValue);
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
			case TextrepresentationPackage.OBJECT_WRAPPER:
				return convertObjectWrapperToString(eDataType, instanceValue);
			case TextrepresentationPackage.JSON_OBJECT_WRAPPER:
				return convertJSONObjectWrapperToString(eDataType, instanceValue);
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
	public PatternText createPatternText() {
		PatternTextImpl patternText = new PatternTextImpl();
		return patternText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterFragment createParameterFragment() {
		ParameterFragmentImpl parameterFragment = new ParameterFragmentImpl();
		return parameterFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextFragment createTextFragment() {
		TextFragmentImpl textFragment = new TextFragmentImpl();
		return textFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterPredefinition createParameterPredefinition() {
		ParameterPredefinitionImpl parameterPredefinition = new ParameterPredefinitionImpl();
		return parameterPredefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectWrapperFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONObject createJSONObjectWrapperFromString(EDataType eDataType, String initialValue) {
		return (JSONObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJSONObjectWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextrepresentationPackage getTextrepresentationPackage() {
		return (TextrepresentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TextrepresentationPackage getPackage() {
		return TextrepresentationPackage.eINSTANCE;
	}

} //TextrepresentationFactoryImpl
