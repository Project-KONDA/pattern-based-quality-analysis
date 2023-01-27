/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.adaptionneo4j.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Adaptionneo4jFactoryImpl extends EFactoryImpl implements Adaptionneo4jFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Adaptionneo4jFactory init() {
		try {
			Adaptionneo4jFactory theAdaptionneo4jFactory = (Adaptionneo4jFactory)EPackage.Registry.INSTANCE.getEFactory(Adaptionneo4jPackage.eNS_URI);
			if (theAdaptionneo4jFactory != null) {
				return theAdaptionneo4jFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Adaptionneo4jFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adaptionneo4jFactoryImpl() {
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
			case Adaptionneo4jPackage.NEO_ELEMENT_NODE: return createNeoElementNode();
			case Adaptionneo4jPackage.NEO_ELEMENT_EDGE: return createNeoElementEdge();
			case Adaptionneo4jPackage.NEO_COMPLEX_EDGE: return createNeoComplexEdge();
			case Adaptionneo4jPackage.NEO_SIMPLE_EDGE: return createNeoSimpleEdge();
			case Adaptionneo4jPackage.NEO_PROPERTY_NODE: return createNeoPropertyNode();
			case Adaptionneo4jPackage.NEO_ELEMENT_PATH_PARAM: return createNeoElementPathParam();
			case Adaptionneo4jPackage.NEO_PROPERTY_PATH_PARAM: return createNeoPropertyPathParam();
			case Adaptionneo4jPackage.NEO_PROPERTY_EDGE: return createNeoPropertyEdge();
			case Adaptionneo4jPackage.NEO_NODE_LABELS_PARAM: return createNeoNodeLabelsParam();
			case Adaptionneo4jPackage.NEO_EDGE_LABEL_PARAM: return createNeoEdgeLabelParam();
			case Adaptionneo4jPackage.NEO_PROPERTY_NAME_PARAM: return createNeoPropertyNameParam();
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
			case Adaptionneo4jPackage.NEO_DIRECTION:
				return createNeoDirectionFromString(eDataType, initialValue);
			case Adaptionneo4jPackage.NEO_PLACE:
				return createNeoPlaceFromString(eDataType, initialValue);
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
			case Adaptionneo4jPackage.NEO_DIRECTION:
				return convertNeoDirectionToString(eDataType, instanceValue);
			case Adaptionneo4jPackage.NEO_PLACE:
				return convertNeoPlaceToString(eDataType, instanceValue);
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
	public NeoElementNode createNeoElementNode() {
		NeoElementNodeImpl neoElementNode = new NeoElementNodeImpl();
		return neoElementNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoElementEdge createNeoElementEdge() {
		NeoElementEdgeImpl neoElementEdge = new NeoElementEdgeImpl();
		return neoElementEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoComplexEdge createNeoComplexEdge() {
		NeoComplexEdgeImpl neoComplexEdge = new NeoComplexEdgeImpl();
		return neoComplexEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoSimpleEdge createNeoSimpleEdge() {
		NeoSimpleEdgeImpl neoSimpleEdge = new NeoSimpleEdgeImpl();
		return neoSimpleEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPropertyNode createNeoPropertyNode() {
		NeoPropertyNodeImpl neoPropertyNode = new NeoPropertyNodeImpl();
		return neoPropertyNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoElementPathParam createNeoElementPathParam() {
		NeoElementPathParamImpl neoElementPathParam = new NeoElementPathParamImpl();
		return neoElementPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPropertyPathParam createNeoPropertyPathParam() {
		NeoPropertyPathParamImpl neoPropertyPathParam = new NeoPropertyPathParamImpl();
		return neoPropertyPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPropertyEdge createNeoPropertyEdge() {
		NeoPropertyEdgeImpl neoPropertyEdge = new NeoPropertyEdgeImpl();
		return neoPropertyEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoNodeLabelsParam createNeoNodeLabelsParam() {
		NeoNodeLabelsParamImpl neoNodeLabelsParam = new NeoNodeLabelsParamImpl();
		return neoNodeLabelsParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoEdgeLabelParam createNeoEdgeLabelParam() {
		NeoEdgeLabelParamImpl neoEdgeLabelParam = new NeoEdgeLabelParamImpl();
		return neoEdgeLabelParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoPropertyNameParam createNeoPropertyNameParam() {
		NeoPropertyNameParamImpl neoPropertyNameParam = new NeoPropertyNameParamImpl();
		return neoPropertyNameParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoDirection createNeoDirectionFromString(EDataType eDataType, String initialValue) {
		NeoDirection result = NeoDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNeoDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoPlace createNeoPlaceFromString(EDataType eDataType, String initialValue) {
		NeoPlace result = NeoPlace.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNeoPlaceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adaptionneo4jPackage getAdaptionneo4jPackage() {
		return (Adaptionneo4jPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Adaptionneo4jPackage getPackage() {
		return Adaptionneo4jPackage.eINSTANCE;
	}

} //Adaptionneo4jFactoryImpl
