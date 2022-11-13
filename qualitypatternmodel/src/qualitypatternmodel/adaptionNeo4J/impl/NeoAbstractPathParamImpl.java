/**
 */
package qualitypatternmodel.adaptionneo4j.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.adaptionneo4j.Adaptionneo4jPackage;
import qualitypatternmodel.adaptionneo4j.NeoAbstractPathParam;
import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.graphstructure.Adaptable;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.parameters.impl.ParameterImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Abstract Path Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NeoAbstractPathParamImpl extends ParameterImpl implements NeoAbstractPathParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoAbstractPathParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Adaptionneo4jPackage.Literals.NEO_ABSTRACT_PATH_PARAM;
	}

	public abstract NeoPathPart getNeoPathPart();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public String getCypherReturnVariable() throws InvalidityException {
		String cypher = getNeoPathPart().getCypherVariable();	
		return cypher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getReturnInnerEdgeNodes() throws InvalidityException {
		String cypher;
		if (getNeoPathPart() == null) {
			return null;
		}
		cypher = getNeoPathPart().getCypherInnerEdgeNodes(true);
		return cypher;
	}
	
	protected boolean existsTargetNode(NeoSimpleEdge neoSimpleEdge) {
		return neoSimpleEdge.getNeoTargetNodeLabels() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void createParameters() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeParametersFromParameterList() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	
	@Override
	public boolean inputIsValid() {
		try{
			getNeoPathPart().isValid(AbstractionLevel.CONCRETE);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Adaptable.class) {
			switch (baseOperationID) {
				case GraphstructurePackage.ADAPTABLE___CREATE_PARAMETERS: return Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM___CREATE_PARAMETERS;
				case GraphstructurePackage.ADAPTABLE___REMOVE_PARAMETERS_FROM_PARAMETER_LIST: return Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM___GET_RETURN_INNER_EDGE_NODES:
				try {
					return getReturnInnerEdgeNodes();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM___GET_CYPHER_RETURN_VARIABLE:
				try {
					return getCypherReturnVariable();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM___CREATE_PARAMETERS:
				createParameters();
				return null;
			case Adaptionneo4jPackage.NEO_ABSTRACT_PATH_PARAM___REMOVE_PARAMETERS_FROM_PARAMETER_LIST:
				removeParametersFromParameterList();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	//Add to ECORE
	protected abstract int getRelationNumber();
} //NeoAbstractPathParamImpl
