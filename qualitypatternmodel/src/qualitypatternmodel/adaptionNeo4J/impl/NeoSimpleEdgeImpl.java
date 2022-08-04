/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.KeyValueParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getKeyvalueparam <em>Keyvalueparam</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getTargetNodeType <em>Target Node Type</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoSimpleEdgeImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoSimpleEdgeImpl extends NeoPathImpl implements NeoSimpleEdge {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam label;
	/**
	 * The cached value of the '{@link #getKeyvalueparam() <em>Keyvalueparam</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyvalueparam()
	 * @generated
	 * @ordered
	 */
	protected KeyValueParam keyvalueparam;
	/**
	 * The cached value of the '{@link #getTargetNodeType() <em>Target Node Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNodeType()
	 * @generated
	 * @ordered
	 */
	protected TextLiteralParam targetNodeType;
	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected BooleanParam direction;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoSimpleEdgeImpl() {
		super();
	} 
	
	@Override
	public String generateCypher() throws InvalidityException {
		String cypher = "";
		
		return cypher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_SIMPLE_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteralParam getLabel() {
		if (label != null && label.eIsProxy()) {
			InternalEObject oldLabel = (InternalEObject)label;
			label = (TextLiteralParam)eResolveProxy(oldLabel);
			if (label != oldLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__LABEL, oldLabel, label));
			}
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteralParam basicGetLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(TextLiteralParam newLabel) {
		TextLiteralParam oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValueParam getKeyvalueparam() {
		if (keyvalueparam != null && keyvalueparam.eIsProxy()) {
			InternalEObject oldKeyvalueparam = (InternalEObject)keyvalueparam;
			keyvalueparam = (KeyValueParam)eResolveProxy(oldKeyvalueparam);
			if (keyvalueparam != oldKeyvalueparam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEYVALUEPARAM, oldKeyvalueparam, keyvalueparam));
			}
		}
		return keyvalueparam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueParam basicGetKeyvalueparam() {
		return keyvalueparam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyvalueparam(KeyValueParam newKeyvalueparam) {
		KeyValueParam oldKeyvalueparam = keyvalueparam;
		keyvalueparam = newKeyvalueparam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEYVALUEPARAM, oldKeyvalueparam, keyvalueparam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextLiteralParam getTargetNodeType() {
		if (targetNodeType != null && targetNodeType.eIsProxy()) {
			InternalEObject oldTargetNodeType = (InternalEObject)targetNodeType;
			targetNodeType = (TextLiteralParam)eResolveProxy(oldTargetNodeType);
			if (targetNodeType != oldTargetNodeType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__TARGET_NODE_TYPE, oldTargetNodeType, targetNodeType));
			}
		}
		return targetNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextLiteralParam basicGetTargetNodeType() {
		return targetNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetNodeType(TextLiteralParam newTargetNodeType) {
		TextLiteralParam oldTargetNodeType = targetNodeType;
		targetNodeType = newTargetNodeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__TARGET_NODE_TYPE, oldTargetNodeType, targetNodeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanParam getDirection() {
		if (direction != null && direction.eIsProxy()) {
			InternalEObject oldDirection = (InternalEObject)direction;
			direction = (BooleanParam)eResolveProxy(oldDirection);
			if (direction != oldDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__DIRECTION, oldDirection, direction));
			}
		}
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanParam basicGetDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(BooleanParam newDirection) {
		BooleanParam oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__DIRECTION, oldDirection, direction));
	}

	//Inserted Method
	@Override 
	public EList<NeoSimpleEdge> getSimpleEdges() {
		EList<NeoSimpleEdge> l = new BasicEList<NeoSimpleEdge>();
		//TODO
		return  l;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__LABEL:
				if (resolve) return getLabel();
				return basicGetLabel();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEYVALUEPARAM:
				if (resolve) return getKeyvalueparam();
				return basicGetKeyvalueparam();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__TARGET_NODE_TYPE:
				if (resolve) return getTargetNodeType();
				return basicGetTargetNodeType();
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__DIRECTION:
				if (resolve) return getDirection();
				return basicGetDirection();
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
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__LABEL:
				setLabel((TextLiteralParam)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEYVALUEPARAM:
				setKeyvalueparam((KeyValueParam)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__TARGET_NODE_TYPE:
				setTargetNodeType((TextLiteralParam)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__DIRECTION:
				setDirection((BooleanParam)newValue);
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
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__LABEL:
				setLabel((TextLiteralParam)null);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEYVALUEPARAM:
				setKeyvalueparam((KeyValueParam)null);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__TARGET_NODE_TYPE:
				setTargetNodeType((TextLiteralParam)null);
				return;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__DIRECTION:
				setDirection((BooleanParam)null);
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
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__LABEL:
				return label != null;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__KEYVALUEPARAM:
				return keyvalueparam != null;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__TARGET_NODE_TYPE:
				return targetNodeType != null;
			case AdaptionNeo4JPackage.NEO_SIMPLE_EDGE__DIRECTION:
				return direction != null;
		}
		return super.eIsSet(featureID);
	}

//	Also not done in RdfSinglePredicateImpl.class
//	@Override
//	public String generateDescription() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override 
	public void isValidLocal(AbstractionLevel abstractionLevel) 
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		//TODO
	}
} //SimpleEdgeImpl
