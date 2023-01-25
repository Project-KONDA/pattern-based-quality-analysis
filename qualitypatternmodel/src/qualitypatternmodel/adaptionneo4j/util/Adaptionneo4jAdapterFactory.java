/**
 */
package qualitypatternmodel.adaptionneo4j.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.adaptionneo4j.*;

import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;

import qualitypatternmodel.parameters.ListParam;
import qualitypatternmodel.parameters.Parameter;

import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.PatternElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage
 * @generated
 */
public class Adaptionneo4jAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Adaptionneo4jPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adaptionneo4jAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Adaptionneo4jPackage.eINSTANCE;
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
	protected Adaptionneo4jSwitch<Adapter> modelSwitch =
		new Adaptionneo4jSwitch<Adapter>() {
			@Override
			public Adapter caseNeoNode(NeoNode object) {
				return createNeoNodeAdapter();
			}
			@Override
			public Adapter caseNeoElementNode(NeoElementNode object) {
				return createNeoElementNodeAdapter();
			}
			@Override
			public Adapter caseNeoElementEdge(NeoElementEdge object) {
				return createNeoElementEdgeAdapter();
			}
			@Override
			public Adapter caseNeoComplexEdge(NeoComplexEdge object) {
				return createNeoComplexEdgeAdapter();
			}
			@Override
			public Adapter caseNeoSimpleEdge(NeoSimpleEdge object) {
				return createNeoSimpleEdgeAdapter();
			}
			@Override
			public Adapter caseNeoPathPart(NeoPathPart object) {
				return createNeoPathPartAdapter();
			}
			@Override
			public Adapter caseNeoPropertyNode(NeoPropertyNode object) {
				return createNeoPropertyNodeAdapter();
			}
			@Override
			public Adapter caseNeoElementPathParam(NeoElementPathParam object) {
				return createNeoElementPathParamAdapter();
			}
			@Override
			public Adapter caseNeoPropertyPathParam(NeoPropertyPathParam object) {
				return createNeoPropertyPathParamAdapter();
			}
			@Override
			public Adapter caseNeoPropertyEdge(NeoPropertyEdge object) {
				return createNeoPropertyEdgeAdapter();
			}
			@Override
			public Adapter caseNeoEdge(NeoEdge object) {
				return createNeoEdgeAdapter();
			}
			@Override
			public Adapter caseNeoPathParam(NeoPathParam object) {
				return createNeoPathParamAdapter();
			}
			@Override
			public Adapter caseNeoElement(NeoElement object) {
				return createNeoElementAdapter();
			}
			@Override
			public Adapter caseNeoNodeLabelsParam(NeoNodeLabelsParam object) {
				return createNeoNodeLabelsParamAdapter();
			}
			@Override
			public Adapter caseNeoEdgeLabelParam(NeoEdgeLabelParam object) {
				return createNeoEdgeLabelParamAdapter();
			}
			@Override
			public Adapter caseNeoLabel(NeoLabel object) {
				return createNeoLabelAdapter();
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
			public Adapter caseAdaptable(Adaptable object) {
				return createAdaptableAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseComplexNode(ComplexNode object) {
				return createComplexNodeAdapter();
			}
			@Override
			public Adapter caseRelation(Relation object) {
				return createRelationAdapter();
			}
			@Override
			public Adapter casePrimitiveNode(PrimitiveNode object) {
				return createPrimitiveNodeAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseParameterValue(ParameterValue object) {
				return createParameterValueAdapter();
			}
			@Override
			public Adapter caseListParam(ListParam object) {
				return createListParamAdapter();
			}
			@Override
			public Adapter caseTextListParam(TextListParam object) {
				return createTextListParamAdapter();
			}
			@Override
			public Adapter caseTextLiteralParam(TextLiteralParam object) {
				return createTextLiteralParamAdapter();
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
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoNode <em>Neo Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoNode
	 * @generated
	 */
	public Adapter createNeoNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoElementNode <em>Neo Element Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementNode
	 * @generated
	 */
	public Adapter createNeoElementNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoElementEdge <em>Neo Element Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementEdge
	 * @generated
	 */
	public Adapter createNeoElementEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoEdge <em>Neo Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoEdge
	 * @generated
	 */
	public Adapter createNeoEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoPathParam <em>Neo Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathParam
	 * @generated
	 */
	public Adapter createNeoPathParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoComplexEdge <em>Neo Complex Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoComplexEdge
	 * @generated
	 */
	public Adapter createNeoComplexEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoSimpleEdge <em>Neo Simple Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoSimpleEdge
	 * @generated
	 */
	public Adapter createNeoSimpleEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoPathPart <em>Neo Path Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPathPart
	 * @generated
	 */
	public Adapter createNeoPathPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyNode <em>Neo Property Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyNode
	 * @generated
	 */
	public Adapter createNeoPropertyNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoElementPathParam <em>Neo Element Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElementPathParam
	 * @generated
	 */
	public Adapter createNeoElementPathParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam <em>Neo Property Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam
	 * @generated
	 */
	public Adapter createNeoPropertyPathParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoPropertyEdge <em>Neo Property Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoPropertyEdge
	 * @generated
	 */
	public Adapter createNeoPropertyEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoElement <em>Neo Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoElement
	 * @generated
	 */
	public Adapter createNeoElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam <em>Neo Node Labels Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam
	 * @generated
	 */
	public Adapter createNeoNodeLabelsParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam <em>Neo Edge Label Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam
	 * @generated
	 */
	public Adapter createNeoEdgeLabelParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.adaptionneo4j.NeoLabel <em>Neo Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.adaptionneo4j.NeoLabel
	 * @generated
	 */
	public Adapter createNeoLabelAdapter() {
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
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.graphstructure.Adaptable <em>Adaptable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.graphstructure.Adaptable
	 * @generated
	 */
	public Adapter createAdaptableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.graphstructure.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.graphstructure.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.graphstructure.ComplexNode <em>Complex Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.graphstructure.ComplexNode
	 * @generated
	 */
	public Adapter createComplexNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.graphstructure.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.graphstructure.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.graphstructure.PrimitiveNode <em>Primitive Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.graphstructure.PrimitiveNode
	 * @generated
	 */
	public Adapter createPrimitiveNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.parameters.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.parameters.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.parameters.ParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.parameters.ParameterValue
	 * @generated
	 */
	public Adapter createParameterValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.parameters.ListParam <em>List Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.parameters.ListParam
	 * @generated
	 */
	public Adapter createListParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.parameters.TextListParam <em>Text List Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.parameters.TextListParam
	 * @generated
	 */
	public Adapter createTextListParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link qualitypatternmodel.parameters.TextLiteralParam <em>Text Literal Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see qualitypatternmodel.parameters.TextLiteralParam
	 * @generated
	 */
	public Adapter createTextLiteralParamAdapter() {
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

} //Adaptionneo4jAdapterFactory
