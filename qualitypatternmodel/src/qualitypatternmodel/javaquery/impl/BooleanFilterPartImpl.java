/**
 */
package qualitypatternmodel.javaquery.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.javaquery.BooleanFilterPart;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaqueryoutput.InterimResult;
import qualitypatternmodel.javaqueryoutput.InterimResultPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BooleanFilterPartImpl extends JavaFilterPartImpl implements BooleanFilterPart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanFilterPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.BOOLEAN_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	abstract public Boolean apply(InterimResult parameter) throws InvalidityException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	abstract public EList<InterimResultPart> getArguments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case JavaqueryPackage.BOOLEAN_FILTER_PART___APPLY__INTERIMRESULT:
				try {
					return apply((InterimResult)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //BooleanFilterPartImpl
