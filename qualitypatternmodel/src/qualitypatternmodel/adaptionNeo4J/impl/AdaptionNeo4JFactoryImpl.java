/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qualitypatternmodel.adaptionNeo4J.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdaptionNeo4JFactoryImpl extends EFactoryImpl implements AdaptionNeo4JFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdaptionNeo4JFactory init() {
		try {
			AdaptionNeo4JFactory theAdaptionNeo4JFactory = (AdaptionNeo4JFactory)EPackage.Registry.INSTANCE.getEFactory(AdaptionNeo4JPackage.eNS_URI);
			if (theAdaptionNeo4JFactory != null) {
				return theAdaptionNeo4JFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AdaptionNeo4JFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptionNeo4JFactoryImpl() {
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
			case AdaptionNeo4JPackage.NEO_NODE: return createNeoNode();
			case AdaptionNeo4JPackage.NEO_EDGE: return createNeoEdge();
			case AdaptionNeo4JPackage.NEO_COMPLEX_EDGE: return createNeoComplexEdge();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE: return createNeoSimpleEdge();
			case AdaptionNeo4JPackage.NEO_PROPERTY_NODE: return createNeoPropertyNode();
			case AdaptionNeo4JPackage.NEO_PATH_PARAM: return createNeoPathParam();
			case AdaptionNeo4JPackage.NEO_PROPERTY_PATH_PARAM: return createNeoPropertyPathParam();
			case AdaptionNeo4JPackage.NEO_PROPERTY_EDGE: return createNeoPropertyEdge();
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
			case AdaptionNeo4JPackage.NEO_DIRECTION:
				return createNeoDirectionFromString(eDataType, initialValue);
			case AdaptionNeo4JPackage.NEO_PLACE:
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
			case AdaptionNeo4JPackage.NEO_DIRECTION:
				return convertNeoDirectionToString(eDataType, instanceValue);
			case AdaptionNeo4JPackage.NEO_PLACE:
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
	public NeoNode createNeoNode() {
		NeoNodeImpl neoNode = new NeoNodeImpl();
		return neoNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoEdge createNeoEdge() {
		NeoEdgeImpl neoEdge = new NeoEdgeImpl();
		return neoEdge;
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
	public NeoPathParam createNeoPathParam() {
		NeoPathParamImpl neoPathParam = new NeoPathParamImpl();
		return neoPathParam;
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
	public AdaptionNeo4JPackage getAdaptionNeo4JPackage() {
		return (AdaptionNeo4JPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdaptionNeo4JPackage getPackage() {
		return AdaptionNeo4JPackage.eINSTANCE;
	}

} //AdaptionNeo4JFactoryImpl
