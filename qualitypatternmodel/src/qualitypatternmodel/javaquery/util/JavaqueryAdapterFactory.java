/**
 */
package qualitypatternmodel.javaquery.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import qualitypatternmodel.javaquery.BooleanFilterElement;
import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.CountFilterElement;
import qualitypatternmodel.javaquery.CountFilterPart;
import qualitypatternmodel.javaquery.FormulaFilterPart;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaquery.ListFilterPart;
import qualitypatternmodel.javaquery.NotFilterPart;
import qualitypatternmodel.javaquery.NumberFilterElement;
import qualitypatternmodel.javaquery.NumberFilterPart;
import qualitypatternmodel.javaquery.NumberValueFilterElement;
import qualitypatternmodel.javaquery.OneArgFunctionFilterPart;
import qualitypatternmodel.javaquery.QuantifierFilterPart;
import qualitypatternmodel.javaquery.TwoArgFunctionFilterPart;

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
			public Adapter caseBooleanFilterPart(BooleanFilterPart object) {
				return createBooleanFilterPartAdapter();
			}
			@Override
			public Adapter caseFormulaFilterPart(FormulaFilterPart object) {
				return createFormulaFilterPartAdapter();
			}
			@Override
			public Adapter caseBooleanFilterElement(BooleanFilterElement object) {
				return createBooleanFilterElementAdapter();
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
			public Adapter caseNotFilterPart(NotFilterPart object) {
				return createNotFilterPartAdapter();
			}
			@Override
			public Adapter caseCountFilterPart(CountFilterPart object) {
				return createCountFilterPartAdapter();
			}
			@Override
			public Adapter caseNumberFilterPart(NumberFilterPart object) {
				return createNumberFilterPartAdapter();
			}
			@Override
			public Adapter caseCountFilterElement(CountFilterElement object) {
				return createCountFilterElementAdapter();
			}
			@Override
			public Adapter caseNumberFilterElement(NumberFilterElement object) {
				return createNumberFilterElementAdapter();
			}
			@Override
			public Adapter caseJavaFilterPart(JavaFilterPart object) {
				return createJavaFilterPartAdapter();
			}
			@Override
			public Adapter caseNumberValueFilterElement(NumberValueFilterElement object) {
				return createNumberValueFilterElementAdapter();
			}
			@Override
			public Adapter caseQuantifierFilterPart(QuantifierFilterPart object) {
				return createQuantifierFilterPartAdapter();
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
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.NumberValueFilterElement <em>Number Value Filter Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.NumberValueFilterElement
	 * @generated
	 */
	public Adapter createNumberValueFilterElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.QuantifierFilterPart <em>Quantifier Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.QuantifierFilterPart
	 * @generated
	 */
	public Adapter createQuantifierFilterPartAdapter() {
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
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.BooleanFilterElement <em>Boolean Filter Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.BooleanFilterElement
	 * @generated
	 */
	public Adapter createBooleanFilterElementAdapter() {
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
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.CountFilterPart <em>Count Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.CountFilterPart
	 * @generated
	 */
	public Adapter createCountFilterPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.NumberFilterPart <em>Number Filter Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.NumberFilterPart
	 * @generated
	 */
	public Adapter createNumberFilterPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.CountFilterElement <em>Count Filter Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.CountFilterElement
	 * @generated
	 */
	public Adapter createCountFilterElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaquery.NumberFilterElement <em>Number Filter Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaquery.NumberFilterElement
	 * @generated
	 */
	public Adapter createNumberFilterElementAdapter() {
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
