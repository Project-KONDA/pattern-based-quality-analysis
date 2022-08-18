/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoInEdgeTargedNode;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo In Edge Targed Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoInEdgeTargedNodeImpl#getNeoSimpleEdgeSource <em>Neo Simple Edge Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoInEdgeTargedNodeImpl extends NeoNodeImpl implements NeoInEdgeTargedNode {
	/**
	 * The cached value of the '{@link #getNeoSimpleEdgeSource() <em>Neo Simple Edge Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoSimpleEdgeSource()
	 * @generated
	 * @ordered
	 */
	protected NeoSimpleEdge neoSimpleEdgeSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoInEdgeTargedNodeImpl() {
		super();
	}

	@Override
	public String generateCypher() throws InvalidityException {
		return super.generateCypher();
	}
	
	@Override
	public String getCypherVariable() {
		return super.getCypherVariable();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_IN_EDGE_TARGED_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeoSimpleEdge getNeoSimpleEdgeSource() {
		if (neoSimpleEdgeSource != null && neoSimpleEdgeSource.eIsProxy()) {
			InternalEObject oldNeoSimpleEdgeSource = (InternalEObject)neoSimpleEdgeSource;
			neoSimpleEdgeSource = (NeoSimpleEdge)eResolveProxy(oldNeoSimpleEdgeSource);
			if (neoSimpleEdgeSource != oldNeoSimpleEdgeSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_IN_EDGE_TARGED_NODE__NEO_SIMPLE_EDGE_SOURCE, oldNeoSimpleEdgeSource, neoSimpleEdgeSource));
			}
		}
		return neoSimpleEdgeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeoSimpleEdge basicGetNeoSimpleEdgeSource() {
		return neoSimpleEdgeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeoSimpleEdgeSource(NeoSimpleEdge newNeoSimpleEdgeSource) {
		NeoSimpleEdge oldNeoSimpleEdgeSource = neoSimpleEdgeSource;
		neoSimpleEdgeSource = newNeoSimpleEdgeSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_IN_EDGE_TARGED_NODE__NEO_SIMPLE_EDGE_SOURCE, oldNeoSimpleEdgeSource, neoSimpleEdgeSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSourceEdge(NeoSimpleEdge neoSimpleEdgeSource) {
		if (neoSimpleEdgeSource == null)
			return;
		this.neoSimpleEdgeSource = neoSimpleEdgeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_IN_EDGE_TARGED_NODE__NEO_SIMPLE_EDGE_SOURCE:
				if (resolve) return getNeoSimpleEdgeSource();
				return basicGetNeoSimpleEdgeSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_IN_EDGE_TARGED_NODE__NEO_SIMPLE_EDGE_SOURCE:
				setNeoSimpleEdgeSource((NeoSimpleEdge)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_IN_EDGE_TARGED_NODE__NEO_SIMPLE_EDGE_SOURCE:
				setNeoSimpleEdgeSource((NeoSimpleEdge)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_IN_EDGE_TARGED_NODE__NEO_SIMPLE_EDGE_SOURCE:
				return neoSimpleEdgeSource != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AdaptionNeo4JPackage.NEO_IN_EDGE_TARGED_NODE___SET_SOURCE_EDGE__NEOSIMPLEEDGE:
				setSourceEdge((NeoSimpleEdge)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //NeoInEdgeTargedNodeImpl
