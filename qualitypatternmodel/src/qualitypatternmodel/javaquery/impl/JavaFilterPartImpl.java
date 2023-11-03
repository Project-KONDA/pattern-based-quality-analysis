/**
 */
package qualitypatternmodel.javaquery.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import qualitypatternmodel.javaquery.JavaFilterPart;
import qualitypatternmodel.javaquery.JavaqueryPackage;
import qualitypatternmodel.javaqueryoutput.InterimResultParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Filter Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class JavaFilterPartImpl extends MinimalEObjectImpl.Container implements JavaFilterPart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaFilterPartImpl() {
		super();
	}
	
	@Override
	abstract public String toString();
	
	private static Integer idCounter = 1;
	private Integer javaFilterPartId = -1;
	public Integer getJavaFilterPartId() {
		if (javaFilterPartId == -1) {
			idCounter++;
			javaFilterPartId = idCounter;
		}
		return javaFilterPartId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaqueryPackage.Literals.JAVA_FILTER_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterimResultParam> getArguments() {
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
			case JavaqueryPackage.JAVA_FILTER_PART___GET_ARGUMENTS:
				return getArguments();
		}
		return super.eInvoke(operationID, arguments);
	}

} //JavaFilterPartImpl
