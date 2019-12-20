/**
 */
package QualityPatternModel.impl;

import QualityPatternModel.PatternElement;
import QualityPatternModel.QualityPatternModelPackage;

import QualityPatternModel.TranslationLocation;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PatternElementImpl extends MinimalEObjectImpl.Container implements PatternElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QualityPatternModelPackage.Literals.PATTERN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 */
	public String toXQuery(TranslationLocation translationLocation) throws InvalidTranslationException {
		if(isValid()) {
			return toLocalXQuery(translationLocation);
		} else {
			throw new InvalidTranslationException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toLocalXQuery(TranslationLocation tranlsationLocation) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QualityPatternModelPackage.PATTERN_ELEMENT___IS_VALID:
				return isValid();
			case QualityPatternModelPackage.PATTERN_ELEMENT___TO_XQUERY__TRANSLATIONLOCATION:
				try {
					return toXQuery((TranslationLocation)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case QualityPatternModelPackage.PATTERN_ELEMENT___TO_LOCAL_XQUERY__TRANSLATIONLOCATION:
				return toLocalXQuery((TranslationLocation)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PatternElementImpl
