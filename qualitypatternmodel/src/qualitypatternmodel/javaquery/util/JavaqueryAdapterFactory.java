/**
 */
package qualitypatternmodel.javaquery.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.javaquery.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.javaquery.JavaqueryPackage
 * @generated
 */
public class JavaqueryAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaqueryPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaqueryAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JavaqueryPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaquerySwitch<Adapter> modelSwitch =
		new JavaquerySwitch<Adapter>() {
			@Override
			public Adapter caseJavaFilter(JavaFilter object) {
				return createJavaFilterAdapter();
			}
			@Override
			public Adapter caseJavaFilterPart(JavaFilterPart object) {
				return createJavaFilterPartAdapter();
			}
			@Override
			public Adapter caseFormulaFilterPart(FormulaFilterPart object) {
				return createFormulaFilterPartAdapter();
			}
			@Override
			public Adapter caseBooleanFilterPart(BooleanFilterPart object) {
				return createBooleanFilterPartAdapter();
			}
			@Override
			public Adapter caseOneArgFunctionFilterPart(OneArgFunctionFilterPart object) {
				return createOneArgFunctionFilterPartAdapter();
			}
			@Override
			public Adapter caseListFilterPart(ListFilterPart object) {
				return createListFilterPartAdapter();
			}
			@Override
			public Adapter caseTwoArgFunctionFilterPart(TwoArgFunctionFilterPart object) {
				return createTwoArgFunctionFilterPartAdapter();
			}
			@Override
			public Adapter caseCombinator(Combinator object) {
				return createCombinatorAdapter();
			}
			@Override
			public Adapter caseEveryCombinator(EveryCombinator object) {
				return createEveryCombinatorAdapter();
			}
			@Override
			public Adapter caseAnyCombinator(AnyCombinator object) {
				return createAnyCombinatorAdapter();
			}
			@Override
			public Adapter caseNoneCombinator(NoneCombinator object) {
				return createNoneCombinatorAdapter();
			}
			@Override
			public Adapter caseCountCombinator(CountCombinator object) {
				return createCountCombinatorAdapter();
			}
			@Override
			public Adapter caseNotFilterPart(NotFilterPart object) {
				return createNotFilterPartAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.JavaFilter <em>Java Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.JavaFilter
	 * @generated
	 */
	public Adapter createJavaFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.JavaFilterPart <em>Java Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.JavaFilterPart
	 * @generated
	 */
	public Adapter createJavaFilterPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.FormulaFilterPart <em>Formula Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.FormulaFilterPart
	 * @generated
	 */
	public Adapter createFormulaFilterPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.BooleanFilterPart <em>Boolean Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.BooleanFilterPart
	 * @generated
	 */
	public Adapter createBooleanFilterPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.OneArgFunctionFilterPart <em>One Arg Function Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.OneArgFunctionFilterPart
	 * @generated
	 */
	public Adapter createOneArgFunctionFilterPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.ListFilterPart <em>List Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.ListFilterPart
	 * @generated
	 */
	public Adapter createListFilterPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.TwoArgFunctionFilterPart <em>Two Arg Function Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.TwoArgFunctionFilterPart
	 * @generated
	 */
	public Adapter createTwoArgFunctionFilterPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.Combinator <em>Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.Combinator
	 * @generated
	 */
	public Adapter createCombinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.EveryCombinator <em>Every Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.EveryCombinator
	 * @generated
	 */
	public Adapter createEveryCombinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.AnyCombinator <em>Any Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.AnyCombinator
	 * @generated
	 */
	public Adapter createAnyCombinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.NoneCombinator <em>None Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.NoneCombinator
	 * @generated
	 */
	public Adapter createNoneCombinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.CountCombinator <em>Count Combinator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.CountCombinator
	 * @generated
	 */
	public Adapter createCountCombinatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.NotFilterPart <em>Not Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.NotFilterPart
	 * @generated
	 */
	public Adapter createNotFilterPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JavaqueryAdapterFactory
