/**
 */
package qualitypatternmodel.patternstructure.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.patternstructure.Location;
import qualitypatternmodel.patternstructure.PatternElement;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.util.PatternstructureValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pattern
 * Element</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link qualitypatternmodel.patternstructure.impl.PatternElementImpl#getRefNo <em>Ref No</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PatternElementImpl extends MinimalEObjectImpl.Container implements PatternElement {

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @ordered
	 */
	protected String id = EcoreUtil.generateUUID();

	/**
	 * The default value of the '{@link #getRefNo() <em>Ref No</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRefNo()
	 * @generated
	 * @ordered
	 */
	protected static final int REF_NO_EDEFAULT = -1;
	/**
	 * The cached value of the '{@link #getRefNo() <em>Ref No</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRefNo()
	 * @generated
	 * @ordered
	 */
	protected int refNo = REF_NO_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public EList<Input> getAllInputs() throws InvalidityException {
		return new BasicEList<Input>();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws OperatorCycleException 
	 */
	@Override
	public void isValid(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException {
		isValidLocal(isDefinedPattern);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws OperatorCycleException 
	 */
	public void isValidLocal(boolean isDefinedPattern) throws InvalidityException, OperatorCycleException {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validate(DiagnosticChain chain, Map context) {
		try {
			isValidLocal(false);
		} catch (Exception e) {
			if (chain != null) {
				chain.add(
						new BasicDiagnostic(Diagnostic.ERROR, PatternstructureValidator.DIAGNOSTIC_SOURCE,
								PatternstructureValidator.PATTERN_ELEMENT__VALIDATE,
								EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic",
										new Object[] { "not " + e.getMessage(),
												EObjectValidator.getObjectLabel(this, context) }),
								new Object[] { this }));
			}
			System.out.println(
					"Validation failed at " + this.getClass().getSimpleName() + " " + this.getId() + " with message: ");
			e.printStackTrace();
			return false;
		}
//		System.out.println("Validation successfull at " + this.getClass().getSimpleName() + " " + this.getId() + "!");
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws MissingPatternContainerException 
	 * @throws Exception 
	 * 
	 * @generated NOT
	 */
	@Override
	public PatternElement getContainer() throws MissingPatternContainerException {
		if (eInternalContainer() instanceof PatternElement)
			return (PatternElement)eInternalContainer(); 
		throw new MissingPatternContainerException("container object invalid");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @throws InvalidityException 
	 * 
	 * @generated NOT
	 */
	@Override
	public PatternElement getAncestor(Class cls) throws MissingPatternContainerException {
		if (cls.isInstance(this))
			return this;
		else
			return getContainer().getAncestor(cls);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void prepareTranslation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PatternstructurePackage.Literals.PATTERN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public int getRefNo() {
		if (refNo == -1) {
				try {
					refNo = ((PatternImpl) this.getAncestor(PatternImpl.class)).getNewRefNo();
				} catch (MissingPatternContainerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		return refNo;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefNo(int newRefNo) {
		int oldRefNo = refNo;
		refNo = newRefNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PatternstructurePackage.PATTERN_ELEMENT__REF_NO, oldRefNo, refNo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public String toXQuery(Location location) throws InvalidityException {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN_ELEMENT__ID:
				return getId();
			case PatternstructurePackage.PATTERN_ELEMENT__REF_NO:
				return getRefNo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN_ELEMENT__ID:
				setId((String)newValue);
				return;
			case PatternstructurePackage.PATTERN_ELEMENT__REF_NO:
				setRefNo((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case PatternstructurePackage.PATTERN_ELEMENT__REF_NO:
				setRefNo(REF_NO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PatternstructurePackage.PATTERN_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PatternstructurePackage.PATTERN_ELEMENT__REF_NO:
				return refNo != REF_NO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PatternstructurePackage.PATTERN_ELEMENT___TO_XQUERY__LOCATION:
				try {
					return toXQuery((Location)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GET_ALL_INPUTS:
				try {
					return getAllInputs();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___PREPARE_TRANSLATION:
				prepareTranslation();
				return null;
			case PatternstructurePackage.PATTERN_ELEMENT___IS_VALID__BOOLEAN:
				try {
					isValid((Boolean)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___IS_VALID_LOCAL__BOOLEAN:
				try {
					isValidLocal((Boolean)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GET_CONTAINER:
				try {
					return getContainer();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___GET_ANCESTOR__CLASS:
				try {
					return getAncestor((Class)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PatternstructurePackage.PATTERN_ELEMENT___VALIDATE__DIAGNOSTICCHAIN_MAP:
				return validate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", refNo: ");
		result.append(refNo);
		result.append(')');
		return result.toString();
	}

} // PatternElementImpl
