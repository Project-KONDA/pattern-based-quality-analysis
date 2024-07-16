/**
 */
package qualitypatternmodel.execution.impl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.execution.ExecutionPackage;
import qualitypatternmodel.execution.XmlResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xml Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XmlResultImpl extends ResultImpl implements XmlResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmlResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.XML_RESULT;
	}

	@Override
	public void export(String path) {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
			objectOutputStream.writeObject(this);
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

} //XmlResultImpl
