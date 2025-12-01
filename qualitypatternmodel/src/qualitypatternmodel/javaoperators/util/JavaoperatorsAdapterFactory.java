/**
 */
package qualitypatternmodel.javaoperators.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import qualitypatternmodel.javaoperators.*;
import qualitypatternmodel.javaoperators.JavaOperator;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.OneArgJavaOperator;
import qualitypatternmodel.javaoperators.TwoArgJavaOperator;
import qualitypatternmodel.javaoperators.ValidateLinkOperator;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.Operator;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.javaoperators.JavaoperatorsPackage
 * @generated
 */
public class JavaoperatorsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaoperatorsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaoperatorsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JavaoperatorsPackage.eINSTANCE;
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
	protected JavaoperatorsSwitch<Adapter> modelSwitch =
		new JavaoperatorsSwitch<Adapter>() {
			@Override
			public Adapter caseJavaOperator(JavaOperator object) {
				return createJavaOperatorAdapter();
			}
			@Override
			public Adapter caseOneArgJavaOperator(OneArgJavaOperator object) {
				return createOneArgJavaOperatorAdapter();
			}
			@Override
			public Adapter caseTwoArgJavaOperator(TwoArgJavaOperator object) {
				return createTwoArgJavaOperatorAdapter();
			}
			@Override
			public Adapter caseValidateLinkOperator(ValidateLinkOperator object) {
				return createValidateLinkOperatorAdapter();
			}
			@Override
			public Adapter caseLinkMimeTypeOperator(LinkMimeTypeOperator object) {
				return createLinkMimeTypeOperatorAdapter();
			}
			@Override
			public Adapter caseLinkImageMinSizeOperator(LinkImageMinSizeOperator object) {
				return createLinkImageMinSizeOperatorAdapter();
			}
			@Override
			public Adapter caseLinkSourceOperator(LinkSourceOperator object) {
				return createLinkSourceOperatorAdapter();
			}
			@Override
			public Adapter caseOneArgJavaListOperator(OneArgJavaListOperator object) {
				return createOneArgJavaListOperatorAdapter();
			}
			@Override
			public Adapter caseOneArgJavaTwoNumberOperator(OneArgJavaTwoNumberOperator object) {
				return createOneArgJavaTwoNumberOperatorAdapter();
			}
			@Override
			public Adapter casePatternElement(PatternElement object) {
				return createPatternElementAdapter();
			}
			@Override
			public Adapter caseComparable(qualitypatternmodel.graphstructure.Comparable object) {
				return createComparableAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseBooleanOperator(BooleanOperator object) {
				return createBooleanOperatorAdapter();
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
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaoperators.JavaOperator <em>Java Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaoperators.JavaOperator
	 * @generated
	 */
	public Adapter createJavaOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaoperators.OneArgJavaOperator <em>One Arg Java Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaoperators.OneArgJavaOperator
	 * @generated
	 */
	public Adapter createOneArgJavaOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaoperators.TwoArgJavaOperator <em>Two Arg Java Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaoperators.TwoArgJavaOperator
	 * @generated
	 */
	public Adapter createTwoArgJavaOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaoperators.ValidateLinkOperator <em>Validate Link Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaoperators.ValidateLinkOperator
	 * @generated
	 */
	public Adapter createValidateLinkOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaoperators.LinkMimeTypeOperator <em>Link Mime Type Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaoperators.LinkMimeTypeOperator
	 * @generated
	 */
	public Adapter createLinkMimeTypeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaoperators.LinkImageMinSizeOperator <em>Link Image Min Size Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaoperators.LinkImageMinSizeOperator
	 * @generated
	 */
	public Adapter createLinkImageMinSizeOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaoperators.LinkSourceOperator <em>Link Source Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaoperators.LinkSourceOperator
	 * @generated
	 */
	public Adapter createLinkSourceOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaoperators.OneArgJavaListOperator <em>One Arg Java List Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaoperators.OneArgJavaListOperator
	 * @generated
	 */
	public Adapter createOneArgJavaListOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator <em>One Arg Java Two Number Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.javaoperators.OneArgJavaTwoNumberOperator
	 * @generated
	 */
	public Adapter createOneArgJavaTwoNumberOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.patternstructure.PatternElement <em>Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.patternstructure.PatternElement
	 * @generated
	 */
	public Adapter createPatternElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.graphstructure.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.graphstructure.Comparable
	 * @generated
	 */
	public Adapter createComparableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.operators.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.operators.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.operators.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.operators.BooleanOperator
	 * @generated
	 */
	public Adapter createBooleanOperatorAdapter() {
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

} //JavaoperatorsAdapterFactory
