/**
 */
package qualitypatternmodel.textrepresentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.textrepresentation.TextrepresentationFactory
 * @model kind="package"
 * @generated
 */
public interface TextrepresentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "textrepresentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "textrepresentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "textrepresentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TextrepresentationPackage eINSTANCE = qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.impl.PatternTextImpl <em>Pattern Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.impl.PatternTextImpl
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getPatternText()
	 * @generated
	 */
	int PATTERN_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Textfragment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT__TEXTFRAGMENT = 1;

	/**
	 * The number of structural features of the '<em>Pattern Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pattern Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.impl.FragmentImpl
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getFragment()
	 * @generated
	 */
	int FRAGMENT = 2;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl <em>Parameter Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getParameterFragment()
	 * @generated
	 */
	int PARAMETER_FRAGMENT = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT__PARAMETER = FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___SET_VALUE__OBJECT = FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___GET_TYPE = FRAGMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT_OPERATION_COUNT = FRAGMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.impl.TextFragmentImpl <em>Text Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.impl.TextFragmentImpl
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getTextFragment()
	 * @generated
	 */
	int TEXT_FRAGMENT = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT__TEXT = FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT_OPERATION_COUNT = FRAGMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '<em>Object Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getObjectWrapper()
	 * @generated
	 */
	int OBJECT_WRAPPER = 4;


	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.PatternText <em>Pattern Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Text</em>'.
	 * @see qualitypatternmodel.textrepresentation.PatternText
	 * @generated
	 */
	EClass getPatternText();

	/**
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.textrepresentation.PatternText#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern</em>'.
	 * @see qualitypatternmodel.textrepresentation.PatternText#getPattern()
	 * @see #getPatternText()
	 * @generated
	 */
	EReference getPatternText_Pattern();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.textrepresentation.PatternText#getTextfragment <em>Textfragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textfragment</em>'.
	 * @see qualitypatternmodel.textrepresentation.PatternText#getTextfragment()
	 * @see #getPatternText()
	 * @generated
	 */
	EReference getPatternText_Textfragment();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.ParameterFragment <em>Parameter Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Fragment</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment
	 * @generated
	 */
	EClass getParameterFragment();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getParameter()
	 * @see #getParameterFragment()
	 * @generated
	 */
	EReference getParameterFragment_Parameter();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#setValue(java.lang.Object) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#setValue(java.lang.Object)
	 * @generated
	 */
	EOperation getParameterFragment__SetValue__Object();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.ParameterFragment#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.ParameterFragment#getType()
	 * @generated
	 */
	EOperation getParameterFragment__GetType();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see qualitypatternmodel.textrepresentation.Fragment
	 * @generated
	 */
	EClass getFragment();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.TextFragment <em>Text Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Fragment</em>'.
	 * @see qualitypatternmodel.textrepresentation.TextFragment
	 * @generated
	 */
	EClass getTextFragment();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.TextFragment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see qualitypatternmodel.textrepresentation.TextFragment#getText()
	 * @see #getTextFragment()
	 * @generated
	 */
	EAttribute getTextFragment_Text();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object Wrapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Wrapper</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObjectWrapper();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TextrepresentationFactory getTextrepresentationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.impl.PatternTextImpl <em>Pattern Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.impl.PatternTextImpl
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getPatternText()
		 * @generated
		 */
		EClass PATTERN_TEXT = eINSTANCE.getPatternText();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TEXT__PATTERN = eINSTANCE.getPatternText_Pattern();

		/**
		 * The meta object literal for the '<em><b>Textfragment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TEXT__TEXTFRAGMENT = eINSTANCE.getPatternText_Textfragment();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl <em>Parameter Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.impl.ParameterFragmentImpl
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getParameterFragment()
		 * @generated
		 */
		EClass PARAMETER_FRAGMENT = eINSTANCE.getParameterFragment();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_FRAGMENT__PARAMETER = eINSTANCE.getParameterFragment_Parameter();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_FRAGMENT___SET_VALUE__OBJECT = eINSTANCE.getParameterFragment__SetValue__Object();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARAMETER_FRAGMENT___GET_TYPE = eINSTANCE.getParameterFragment__GetType();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.impl.FragmentImpl
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getFragment()
		 * @generated
		 */
		EClass FRAGMENT = eINSTANCE.getFragment();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.impl.TextFragmentImpl <em>Text Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.impl.TextFragmentImpl
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getTextFragment()
		 * @generated
		 */
		EClass TEXT_FRAGMENT = eINSTANCE.getTextFragment();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_FRAGMENT__TEXT = eINSTANCE.getTextFragment_Text();

		/**
		 * The meta object literal for the '<em>Object Wrapper</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getObjectWrapper()
		 * @generated
		 */
		EDataType OBJECT_WRAPPER = eINSTANCE.getObjectWrapper();

	}

} //TextrepresentationPackage
