/**
 */
package qualitypatternmodel.adaptionNeo4J.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JPackage;
import qualitypatternmodel.adaptionNeo4J.NeoUnspecifiedEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Neo Unspecified Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoUnspecifiedEdgeImpl#getNeoTargetNodeLabels <em>Neo Target Node Labels</em>}</li>
 *   <li>{@link qualitypatternmodel.adaptionNeo4J.impl.NeoUnspecifiedEdgeImpl#isStepsInBetween <em>Steps In Between</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeoUnspecifiedEdgeImpl extends NeoPathPartImpl implements NeoUnspecifiedEdge {
	/**
	 * The cached value of the '{@link #getNeoTargetNodeLabels() <em>Neo Target Node Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeoTargetNodeLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<TextLiteralParam> neoTargetNodeLabels;

	/**
	 * The default value of the '{@link #isStepsInBetween() <em>Steps In Between</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStepsInBetween()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STEPS_IN_BETWEEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStepsInBetween() <em>Steps In Between</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStepsInBetween()
	 * @generated
	 * @ordered
	 */
	protected boolean stepsInBetween = STEPS_IN_BETWEEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeoUnspecifiedEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdaptionNeo4JPackage.Literals.NEO_UNSPECIFIED_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TextLiteralParam> getNeoTargetNodeLabels() {
		if (neoTargetNodeLabels == null) {
			neoTargetNodeLabels = new EObjectResolvingEList<TextLiteralParam>(TextLiteralParam.class, this, AdaptionNeo4JPackage.NEO_UNSPECIFIED_EDGE__NEO_TARGET_NODE_LABELS);
		}
		return neoTargetNodeLabels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStepsInBetween() {
		return stepsInBetween;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepsInBetween(boolean newStepsInBetween) {
		boolean oldStepsInBetween = stepsInBetween;
		stepsInBetween = newStepsInBetween;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdaptionNeo4JPackage.NEO_UNSPECIFIED_EDGE__STEPS_IN_BETWEEN, oldStepsInBetween, stepsInBetween));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSteps(String stepsInBetween) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_UNSPECIFIED_EDGE__NEO_TARGET_NODE_LABELS:
				return getNeoTargetNodeLabels();
			case AdaptionNeo4JPackage.NEO_UNSPECIFIED_EDGE__STEPS_IN_BETWEEN:
				return isStepsInBetween();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AdaptionNeo4JPackage.NEO_UNSPECIFIED_EDGE__NEO_TARGET_NODE_LABELS:
				getNeoTargetNodeLabels().clear();
				getNeoTargetNodeLabels().addAll((Collection<? extends TextLiteralParam>)newValue);
				return;
			case AdaptionNeo4JPackage.NEO_UNSPECIFIED_EDGE__STEPS_IN_BETWEEN:
				setStepsInBetween((Boolean)newValue);
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
			case AdaptionNeo4JPackage.NEO_UNSPECIFIED_EDGE__NEO_TARGET_NODE_LABELS:
				getNeoTargetNodeLabels().clear();
				return;
			case AdaptionNeo4JPackage.NEO_UNSPECIFIED_EDGE__STEPS_IN_BETWEEN:
				setStepsInBetween(STEPS_IN_BETWEEN_EDEFAULT);
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
			case AdaptionNeo4JPackage.NEO_UNSPECIFIED_EDGE__NEO_TARGET_NODE_LABELS:
				return neoTargetNodeLabels != null && !neoTargetNodeLabels.isEmpty();
			case AdaptionNeo4JPackage.NEO_UNSPECIFIED_EDGE__STEPS_IN_BETWEEN:
				return stepsInBetween != STEPS_IN_BETWEEN_EDEFAULT;
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
			case AdaptionNeo4JPackage.NEO_UNSPECIFIED_EDGE___SET_STEPS__STRING:
				setSteps((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (stepsInBetween: ");
		result.append(stepsInBetween);
		result.append(')');
		return result.toString();
	}

	@Override
	public void isValidLocal(AbstractionLevel abstractionLevel)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String myToString() {
		// TODO Auto-generated method stub
		return null;
	}

} //NeoUnspecifiedEdgeImpl
