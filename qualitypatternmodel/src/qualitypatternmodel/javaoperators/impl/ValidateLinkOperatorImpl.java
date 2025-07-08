/**
 */
package qualitypatternmodel.javaoperators.impl;

import java.net.HttpURLConnection;
import java.net.URI;

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
		Boolean negate = getOption().getValue();
	    try {

			HttpURLConnection connection = (HttpURLConnection) URI.create(urlString).toURL().openConnection();
	        connection.setRequestMethod("HEAD");
	        int responseCode = connection.getResponseCode();
	        Boolean result = responseCode == HttpURLConnection.HTTP_OK;
	        return result != negate;
	    } catch (Exception e) {
	        return negate;
	    }
	}

	@Override
	public String myToString() {
		String res = "ValidateLink (" + getInternalId() + ")";
		if (getOption() != null) {
			res +=  "[";
			if (!getOption().getValue()) {
				res += "not ";
			}
			res += getOption().getInternalId() + "]";
		} else {
			res += "[no option] ";
		}

		if (getPrimitiveNode() != null) {
			res += "[" + getPrimitiveNode().getInternalId() + "]";
		} else {
			res += "[no node] ";
		}
		return res;
	}
} //ValidateLinkOperatorImpl
