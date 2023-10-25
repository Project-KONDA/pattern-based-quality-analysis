/**
 */
package qualitypatternmodel.javaoperators.impl;

import java.net.HttpURLConnection;
import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.ValidateLinkOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validate Link Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ValidateLinkOperatorImpl extends OneArgJavaOperatorImpl implements ValidateLinkOperator {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ValidateLinkOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaoperatorsPackage.Literals.VALIDATE_LINK_OPERATOR;
	}

	@Override
	public Boolean apply(String urlString) {
	    try {
	        URL url = new URL(urlString);
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("HEAD");
	        int responseCode = connection.getResponseCode();
	        return responseCode == HttpURLConnection.HTTP_OK;
	    } catch (Exception e) {
	        return false;
	    }
	}

	@Override
	public String myToString() {
		String res = "ValidateLink (" + getInternalId() + ") [";
		if (!getOption().getValue()) res += "not ";
		res += getOption().getInternalId() + "]";
		res += "[" + getPrimitiveNode().getInternalId() + "]";
		return res;
	}
} //ValidateLinkOperatorImpl
