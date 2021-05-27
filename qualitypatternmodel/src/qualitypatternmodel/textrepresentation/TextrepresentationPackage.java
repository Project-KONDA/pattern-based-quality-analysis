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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Parameter Predefinitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT__PARAMETER_PREDEFINITIONS = 3;

	/**
	 * The number of structural features of the '<em>Pattern Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Generate JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT___GENERATE_JSON = 0;

	/**
	 * The operation id for the '<em>Is Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT___IS_VALID__ABSTRACTIONLEVEL = 1;

	/**
	 * The number of operations of the '<em>Pattern Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_TEXT_OPERATION_COUNT = 2;

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
	 * The feature id for the '<em><b>Pattern Text</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__PATTERN_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Generate JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT___GENERATE_JSON = 0;

	/**
	 * The number of operations of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_OPERATION_COUNT = 1;

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
	 * The feature id for the '<em><b>Pattern Text</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT__PATTERN_TEXT = FRAGMENT__PATTERN_TEXT;

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
	 * The operation id for the '<em>Generate JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___GENERATE_JSON = FRAGMENT___GENERATE_JSON;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT___GET_TYPE = FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parameter Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FRAGMENT_OPERATION_COUNT = FRAGMENT_OPERATION_COUNT + 1;

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
	 * The feature id for the '<em><b>Pattern Text</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT__PATTERN_TEXT = FRAGMENT__PATTERN_TEXT;

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
	 * The operation id for the '<em>Generate JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT___GENERATE_JSON = FRAGMENT___GENERATE_JSON;

	/**
	 * The number of operations of the '<em>Text Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FRAGMENT_OPERATION_COUNT = FRAGMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.ParameterReference <em>Parameter Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.ParameterReference
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getParameterReference()
	 * @generated
	 */
	int PARAMETER_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qualitypatternmodel.textrepresentation.impl.ParameterPredefinitionImpl <em>Parameter Predefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qualitypatternmodel.textrepresentation.impl.ParameterPredefinitionImpl
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getParameterPredefinition()
	 * @generated
	 */
	int PARAMETER_PREDEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PREDEFINITION__PARAMETER = PARAMETER_REFERENCE__PARAMETER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PREDEFINITION__VALUE = PARAMETER_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Predefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PREDEFINITION_FEATURE_COUNT = PARAMETER_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Predefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_PREDEFINITION_OPERATION_COUNT = PARAMETER_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Object Wrapper</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getObjectWrapper()
	 * @generated
	 */
	int OBJECT_WRAPPER = 6;


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
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.PatternText#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qualitypatternmodel.textrepresentation.PatternText#getName()
	 * @see #getPatternText()
	 * @generated
	 */
	EAttribute getPatternText_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link qualitypatternmodel.textrepresentation.PatternText#getParameterPredefinitions <em>Parameter Predefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Predefinitions</em>'.
	 * @see qualitypatternmodel.textrepresentation.PatternText#getParameterPredefinitions()
	 * @see #getPatternText()
	 * @generated
	 */
	EReference getPatternText_ParameterPredefinitions();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.PatternText#generateJSON() <em>Generate JSON</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate JSON</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.PatternText#generateJSON()
	 * @generated
	 */
	EOperation getPatternText__GenerateJSON();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.PatternText#isValid(qualitypatternmodel.patternstructure.AbstractionLevel) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Valid</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.PatternText#isValid(qualitypatternmodel.patternstructure.AbstractionLevel)
	 * @generated
	 */
	EOperation getPatternText__IsValid__AbstractionLevel();

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
	 * Returns the meta object for the container reference '{@link qualitypatternmodel.textrepresentation.Fragment#getPatternText <em>Pattern Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Pattern Text</em>'.
	 * @see qualitypatternmodel.textrepresentation.Fragment#getPatternText()
	 * @see #getFragment()
	 * @generated
	 */
	EReference getFragment_PatternText();

	/**
	 * Returns the meta object for the '{@link qualitypatternmodel.textrepresentation.Fragment#generateJSON() <em>Generate JSON</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate JSON</em>' operation.
	 * @see qualitypatternmodel.textrepresentation.Fragment#generateJSON()
	 * @generated
	 */
	EOperation getFragment__GenerateJSON();

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
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.ParameterPredefinition <em>Parameter Predefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Predefinition</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterPredefinition
	 * @generated
	 */
	EClass getParameterPredefinition();

	/**
	 * Returns the meta object for the attribute '{@link qualitypatternmodel.textrepresentation.ParameterPredefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterPredefinition#getValue()
	 * @see #getParameterPredefinition()
	 * @generated
	 */
	EAttribute getParameterPredefinition_Value();

	/**
	 * Returns the meta object for class '{@link qualitypatternmodel.textrepresentation.ParameterReference <em>Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Reference</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterReference
	 * @generated
	 */
	EClass getParameterReference();

	/**
	 * Returns the meta object for the reference '{@link qualitypatternmodel.textrepresentation.ParameterReference#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see qualitypatternmodel.textrepresentation.ParameterReference#getParameter()
	 * @see #getParameterReference()
	 * @generated
	 */
	EReference getParameterReference_Parameter();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN_TEXT__NAME = eINSTANCE.getPatternText_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Predefinitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN_TEXT__PARAMETER_PREDEFINITIONS = eINSTANCE.getPatternText_ParameterPredefinitions();

		/**
		 * The meta object literal for the '<em><b>Generate JSON</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_TEXT___GENERATE_JSON = eINSTANCE.getPatternText__GenerateJSON();

		/**
		 * The meta object literal for the '<em><b>Is Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PATTERN_TEXT___IS_VALID__ABSTRACTIONLEVEL = eINSTANCE.getPatternText__IsValid__AbstractionLevel();

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
		 * The meta object literal for the '<em><b>Pattern Text</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENT__PATTERN_TEXT = eINSTANCE.getFragment_PatternText();

		/**
		 * The meta object literal for the '<em><b>Generate JSON</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRAGMENT___GENERATE_JSON = eINSTANCE.getFragment__GenerateJSON();

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
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.impl.ParameterPredefinitionImpl <em>Parameter Predefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.impl.ParameterPredefinitionImpl
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getParameterPredefinition()
		 * @generated
		 */
		EClass PARAMETER_PREDEFINITION = eINSTANCE.getParameterPredefinition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_PREDEFINITION__VALUE = eINSTANCE.getParameterPredefinition_Value();

		/**
		 * The meta object literal for the '{@link qualitypatternmodel.textrepresentation.ParameterReference <em>Parameter Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qualitypatternmodel.textrepresentation.ParameterReference
		 * @see qualitypatternmodel.textrepresentation.impl.TextrepresentationPackageImpl#getParameterReference()
		 * @generated
		 */
		EClass PARAMETER_REFERENCE = eINSTANCE.getParameterReference();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_REFERENCE__PARAMETER = eINSTANCE.getParameterReference_Parameter();

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
