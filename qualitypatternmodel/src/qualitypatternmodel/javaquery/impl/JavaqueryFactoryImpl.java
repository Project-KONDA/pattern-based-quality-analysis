/**
 */
package qualitypatternmodel.javaquery.impl;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.javaquery.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaqueryFactoryImpl extends EFactoryImpl implements JavaqueryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaqueryFactory init() {
		try {
			JavaqueryFactory theJavaqueryFactory = (JavaqueryFactory)EPackage.Registry.INSTANCE.getEFactory(JavaqueryPackage.eNS_URI);
			if (theJavaqueryFactory != null) {
				return theJavaqueryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaqueryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaqueryFactoryImpl() {
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
			case JavaqueryPackage.JAVA_FILTER: return createJavaFilter();
			case JavaqueryPackage.FORMULA_FILTER_PART: return createFormulaFilterPart();
			case JavaqueryPackage.BOOLEAN_FILTER_ELEMENT: return createBooleanFilterElement();
			case JavaqueryPackage.ONE_ARG_FUNCTION_FILTER_PART: return createOneArgFunctionFilterPart();
			case JavaqueryPackage.LIST_FILTER_PART: return createListFilterPart();
			case JavaqueryPackage.TWO_ARG_FUNCTION_FILTER_PART: return createTwoArgFunctionFilterPart();
			case JavaqueryPackage.NOT_FILTER_PART: return createNotFilterPart();
			case JavaqueryPackage.COUNT_FILTER_PART: return createCountFilterPart();
			case JavaqueryPackage.COUNT_FILTER_ELEMENT: return createCountFilterElement();
			case JavaqueryPackage.NUMBER_FILTER_ELEMENT: return createNumberFilterElement();
			case JavaqueryPackage.NUMBER_VALUE_FILTER_ELEMENT: return createNumberValueFilterElement();
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
			case JavaqueryPackage.STRING_LIST_WRAPPER:
				return createStringListWrapperFromString(eDataType, initialValue);
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
			case JavaqueryPackage.STRING_LIST_WRAPPER:
				return convertStringListWrapperToString(eDataType, instanceValue);
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
	public JavaFilter createJavaFilter() {
		JavaFilterImpl javaFilter = new JavaFilterImpl();
		return javaFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormulaFilterPart createFormulaFilterPart() {
		FormulaFilterPartImpl formulaFilterPart = new FormulaFilterPartImpl();
		return formulaFilterPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanFilterElement createBooleanFilterElement() {
		BooleanFilterElementImpl booleanFilterElement = new BooleanFilterElementImpl();
		return booleanFilterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OneArgFunctionFilterPart createOneArgFunctionFilterPart() {
		OneArgFunctionFilterPartImpl oneArgFunctionFilterPart = new OneArgFunctionFilterPartImpl();
		return oneArgFunctionFilterPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListFilterPart createListFilterPart() {
		ListFilterPartImpl listFilterPart = new ListFilterPartImpl();
		return listFilterPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TwoArgFunctionFilterPart createTwoArgFunctionFilterPart() {
		TwoArgFunctionFilterPartImpl twoArgFunctionFilterPart = new TwoArgFunctionFilterPartImpl();
		return twoArgFunctionFilterPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotFilterPart createNotFilterPart() {
		NotFilterPartImpl notFilterPart = new NotFilterPartImpl();
		return notFilterPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountFilterPart createCountFilterPart() {
		CountFilterPartImpl countFilterPart = new CountFilterPartImpl();
		return countFilterPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountFilterElement createCountFilterElement() {
		CountFilterElementImpl countFilterElement = new CountFilterElementImpl();
		return countFilterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberFilterElement createNumberFilterElement() {
		NumberFilterElementImpl numberFilterElement = new NumberFilterElementImpl();
		return numberFilterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberValueFilterElement createNumberValueFilterElement() {
		NumberValueFilterElementImpl numberValueFilterElement = new NumberValueFilterElementImpl();
		return numberValueFilterElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Object> createStringListWrapperFromString(EDataType eDataType, String initialValue) {
		return (List<Object>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringListWrapperToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaqueryPackage getJavaqueryPackage() {
		return (JavaqueryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaqueryPackage getPackage() {
		return JavaqueryPackage.eINSTANCE;
	}

} //JavaqueryFactoryImpl
