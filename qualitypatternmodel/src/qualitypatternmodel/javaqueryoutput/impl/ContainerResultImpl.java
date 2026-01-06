/**
 */
package qualitypatternmodel.javaqueryoutput.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaqueryoutput.ContainerInterim;
import qualitypatternmodel.javaqueryoutput.ContainerResult;
import qualitypatternmodel.javaqueryoutput.FixedContainerInterim;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;
import qualitypatternmodel.javaqueryoutput.JavaqueryoutputPackage;
import qualitypatternmodel.javaqueryoutput.VariableContainerInterim;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.ContainerResultImpl#getSubresult <em>Subresult</em>}</li>
 *   <li>{@link qualitypatternmodel.javaqueryoutput.impl.ContainerResultImpl#getTagname <em>Tagname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerResultImpl extends InterimResultImpl implements ContainerResult {
	/**
	 * The cached value of the '{@link #getSubresult() <em>Subresult</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubresult()
	 * @generated
	 * @ordered
	 */
	protected EList<InterimResult> subresult;

	/**
	 * The default value of the '{@link #getTagname() <em>Tagname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagname()
	 * @generated
	 * @ordered
	 */
	protected static final String TAGNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTagname() <em>Tagname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagname()
	 * @generated
	 * @ordered
	 */
	protected String tagname = TAGNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerResultImpl() {
		super();
	}

	protected ContainerResultImpl(String tag) {
		super();
		if (tag != null)
			setTagname(tag);
	}

	@SuppressWarnings("unchecked")
	public ContainerResultImpl(List<Object> input) throws InvalidityException {
		super();
		for (Object inputobject: input) {
			if (inputobject instanceof List) {
				getSubresult().add(new ContainerResultImpl((List<Object>) inputobject));
			} else if (inputobject instanceof String) {
				getSubresult().add(new ValueResultImpl((String) inputobject));
			} else {
				throw new InvalidityException(inputobject.toString() + " cannot be transformed to an InterimResultObject.");
			}
		}
	}

	@Override
	public void setCorresponding(InterimResultPart corresponding) throws InvalidityException {
		if (corresponding instanceof ContainerInterim) {
			int size = ((ContainerInterim) corresponding).getSize();
			if (size == -1) {
				VariableContainerInterim container = (VariableContainerInterim) corresponding;
				setCorrespondsTo(container);
				for(InterimResult a: getSubresult()) {
					a.setCorresponding(container.getContained());
				}
			}
			else if (size == getSubresult().size() || getSubresult().size() == 0){
				FixedContainerInterim container = (FixedContainerInterim) corresponding;
				setCorrespondsTo(container);
				if (size == getSubresult().size()) {
					for(int i= 0; i<size;i++) {
						getSubresult().get(i).setCorresponding(container.getContained().get(i));
					}
				}
			}
			return;
		} else {
			throw new InvalidityException(corresponding + " " + corresponding.getClass().toString() + " is not of type ContainerInterim! (" + this + ")");
		}
	}

	@Override
	public Boolean isValidToCorresponding() {
		if (getCorrespondsTo() == null || !(getCorrespondsTo() instanceof ContainerInterim )) {
			return false;
		}
		ContainerInterim container = (ContainerInterim) getCorrespondsTo();
		Integer size = container.getSize();

		if (size == -1) {
			return getSubresult().stream().allMatch(x-> x.isValidToCorresponding());
		} else {
			if (getSubresult().size() != 0  && size != getSubresult().size()) {
				return false;
			}

			FixedContainerInterim fixed = ((FixedContainerInterim) container);
			for (int i = 0; i < getSubresult().size(); i++) {
				InterimResult interim = getSubresult().get(i);
				try {
					interim.setCorresponding(fixed.getContained().get(i));
				} catch (InvalidityException e) {
					e.printStackTrace();
					return false;
				}
				if (!interim.isValidToCorresponding()) {
					return false;
				}
			}
			return true;
		}
	}





	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryoutputPackage.Literals.CONTAINER_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterimResult> getSubresult() {
		if (subresult == null) {
			subresult = new EObjectContainmentEList<InterimResult>(InterimResult.class, this, JavaqueryoutputPackage.CONTAINER_RESULT__SUBRESULT);
		}
		return subresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTagname() {
		return tagname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagname(String newTagname) {
		String oldTagname = tagname;
		tagname = newTagname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaqueryoutputPackage.CONTAINER_RESULT__TAGNAME, oldTagname, tagname));
	}

	//	private ContainerResult currentCreationResult = null;
//	private int depth = 0;
//	private int depth0 = 0;
//	private Boolean done = false;
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @throws InvalidityException
//	 * @generated NOT
//	 */
//	@Override
//	public Boolean stream(String value) throws InvalidityException {
//		if (done) {
//			return false;
//		}
//
//		depth0 = depth;
//		if (JavaQueryTranslationUtility.isStartTag(value)) {
//			depth +=1;
//		} else if (JavaQueryTranslationUtility.isEndTag(value)) {
//			depth-=1;
//		}
//
//		if (depth0 <= 0 && depth <= 0) {
//			throw new InvalidityException();
//		} else if (depth0 == 1 && depth == 0) {
//			done = true;
//		} else if (depth0 == 0 && depth == 1) {
//			if (getTagname() != null) {
//				throw new InvalidityException("Tagname already set: '" + getTagname() + "' and shell be: " + value);
//			}
//			setTagname(value);
//		}
//		else if (depth0 == 1 && depth == 1) {
//			getSubresult().add(new ValueResultImpl(value));
//		}
//		else if (depth0 == 1 && depth == 2) {
//			if (currentCreationResult != null) {
//				throw new InvalidityException();
//			}
//			currentCreationResult = new ContainerResultImpl();
//			currentCreationResult.stream(value);
//		}
//		else if (depth0 == 2 && depth == 1) {
//			currentCreationResult.stream(value);
//			getSubresult().add(currentCreationResult);
//			currentCreationResult = null;
//		}
//		else if (depth0 >= 2 && depth >= 2) {
//			if (!(currentCreationResult instanceof ContainerResult)) {
//				throw new InvalidityException("ContainerResult expected, recieved: " + currentCreationResult);
//			}
//			currentCreationResult.stream(value);
//		}





//		if(depth == 0) {
//			hasEnded = true;
//		} else if (depth0 == 0 && depth == 1) {
//			if(JavaQueryTranslationUtility.isEndTag(value)) {
//				currentCreationResult.stream(value);
//				getSubresult().add(currentCreationResult);
//				currentCreationResult = null;
//			}
//			else if(JavaQueryTranslationUtility.isStartTag(value)){
//				if (currentCreationResult == null)
//					throw new InvalidityException("no currentCreationResult " + value);
//				currentCreationResult = new ContainerResultImpl();
//				i +=1;
//				if (i <10)
//				currentCreationResult.stream(value);
//			}
//			else {
//				assert(JavaQueryTranslationUtility.isValue(value));
//				getSubresult().add(new ValueResultImpl(value));
//			}
//		} else if (depth > 1) {
//			if (currentCreationResult == null)
//				throw new InvalidityException("no currentCreationResult " + value);
//			currentCreationResult.stream(value);
//		}
//		return !done;
//	}

	static int i = 0;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JavaqueryoutputPackage.CONTAINER_RESULT__SUBRESULT:
				return ((InternalEList<?>)getSubresult()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaqueryoutputPackage.CONTAINER_RESULT__SUBRESULT:
				return getSubresult();
			case JavaqueryoutputPackage.CONTAINER_RESULT__TAGNAME:
				return getTagname();
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
			case JavaqueryoutputPackage.CONTAINER_RESULT__SUBRESULT:
				getSubresult().clear();
				getSubresult().addAll((Collection<? extends InterimResult>)newValue);
				return;
			case JavaqueryoutputPackage.CONTAINER_RESULT__TAGNAME:
				setTagname((String)newValue);
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
			case JavaqueryoutputPackage.CONTAINER_RESULT__SUBRESULT:
				getSubresult().clear();
				return;
			case JavaqueryoutputPackage.CONTAINER_RESULT__TAGNAME:
				setTagname(TAGNAME_EDEFAULT);
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
			case JavaqueryoutputPackage.CONTAINER_RESULT__SUBRESULT:
				return subresult != null && !subresult.isEmpty();
			case JavaqueryoutputPackage.CONTAINER_RESULT__TAGNAME:
				return TAGNAME_EDEFAULT == null ? tagname != null : !TAGNAME_EDEFAULT.equals(tagname);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		String sub = "";
		for (InterimResult interim : getSubresult()) {
			sub += interim + "\n";
		}
		return "Container (" + getTagname() + ") [\n  " + sub.indent(2) + "]";
	}

} //ContainerResultImpl
