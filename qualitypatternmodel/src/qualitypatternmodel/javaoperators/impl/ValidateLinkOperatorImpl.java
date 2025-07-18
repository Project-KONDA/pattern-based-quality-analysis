/**
 */
package qualitypatternmodel.javaoperators.impl;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

import qualitypatternmodel.javaoperators.JavaoperatorsPackage;
import qualitypatternmodel.javaoperators.ValidateLinkOperator;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validate Link Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ValidateLinkOperatorImpl extends OneArgJavaOperatorImpl implements ValidateLinkOperator {
	
	public static final int DEFAULT_TIMEOUT = 5000;
	public static final String[] REQUEST_METHOD = new String[] {"HEAD", "GET"};
	
	public static final List<Integer>  httpSuccess = Arrays.asList(
		HttpURLConnection.HTTP_OK, // 200
		HttpURLConnection.HTTP_CREATED, // 201
		HttpURLConnection.HTTP_ACCEPTED, // 202
		HttpURLConnection.HTTP_NOT_AUTHORITATIVE, // 203
		HttpURLConnection.HTTP_NO_CONTENT, // 204
		HttpURLConnection.HTTP_RESET, // 205
		HttpURLConnection.HTTP_PARTIAL // 206
    );

	public static final List<Integer>  httpRedirect = Arrays.asList(
		HttpURLConnection.HTTP_MULT_CHOICE, // 300
		HttpURLConnection.HTTP_MOVED_PERM, // 301
		HttpURLConnection.HTTP_MOVED_TEMP, // 302
		HttpURLConnection.HTTP_SEE_OTHER, // 303
		HttpURLConnection.HTTP_NOT_MODIFIED, // 304
		HttpURLConnection.HTTP_USE_PROXY // 305
    );

	public static final List<Integer>  httpRestricted = Arrays.asList(
		HttpURLConnection.HTTP_UNAUTHORIZED, // 401
		HttpURLConnection.HTTP_PAYMENT_REQUIRED, // 402
		HttpURLConnection.HTTP_FORBIDDEN, // 403
		HttpURLConnection.HTTP_PROXY_AUTH // 407
	);

	public static final List<Integer>  httpFailure = Arrays.asList(
		HttpURLConnection.HTTP_BAD_REQUEST, // 400
		HttpURLConnection.HTTP_NOT_FOUND, // 404
		HttpURLConnection.HTTP_BAD_METHOD, // 405
		HttpURLConnection.HTTP_NOT_ACCEPTABLE, // 406
		HttpURLConnection.HTTP_CLIENT_TIMEOUT, // 408
		HttpURLConnection.HTTP_CONFLICT, // 409
		HttpURLConnection.HTTP_GONE, // 410
		HttpURLConnection.HTTP_LENGTH_REQUIRED, // 411
		HttpURLConnection.HTTP_PRECON_FAILED, // 412
		HttpURLConnection.HTTP_ENTITY_TOO_LARGE, // 413
		HttpURLConnection.HTTP_REQ_TOO_LONG, // 414
		HttpURLConnection.HTTP_UNSUPPORTED_TYPE, // 415
		HttpURLConnection.HTTP_INTERNAL_ERROR, // 500
		HttpURLConnection.HTTP_NOT_IMPLEMENTED, // 501
		HttpURLConnection.HTTP_BAD_GATEWAY, // 502
		HttpURLConnection.HTTP_UNAVAILABLE, // 503
		HttpURLConnection.HTTP_GATEWAY_TIMEOUT, // 504
		HttpURLConnection.HTTP_VERSION // 505
    );
	
	public static void main (String[] params) {
		String link = "https://muenzen.uni-koeln.de/portal/databases/id/muenzen/titles/id/VAR_0008.html";
		ValidateLinkOperatorImpl validateLink = new ValidateLinkOperatorImpl();
		validateLink.setOption(new BooleanParamImpl());
		validateLink.getOption().setValue(false);
		System.out.println(validateLink.apply(link));
		System.out.println(validateLink.apply("https://www.google.com"));
	}

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
		urlString = urlString.trim();
		Boolean negate = getOption().getValue();
		Boolean result = false;
		for (String method: REQUEST_METHOD) {
			if (!result) {
				result = apply(urlString, method);
			}
		}
		return result != negate;
	}

	public Boolean apply(String urlString, String responseMethod) {
	    try {
			HttpURLConnection connection = (HttpURLConnection) URI.create(urlString).toURL().openConnection();
	        connection.setRequestMethod(responseMethod);
	        Integer responseCode = connection.getResponseCode();
	        connection.setConnectTimeout(DEFAULT_TIMEOUT);
	        connection.setReadTimeout(DEFAULT_TIMEOUT);
	        
	        Boolean result = categorizeResponseCode(responseCode, responseMethod, connection);
	        
	        // if http is invalid, check https
	        if (result == false && urlString.startsWith("http://"))
	        	return apply("https" + urlString.substring(4), responseMethod);
	        
	        return result;
	    } catch (Exception e) {
//	    	e.printStackTrace();
//	    	ServletUtilities.logError(e);
	        return false;
	    }
	}

	
	public Boolean categorizeResponseCode(int responseCode, String responseMethod, HttpURLConnection connection) {
        
        // SUCCESS
        if (httpSuccess.contains(responseCode)) { 
        	return true;
        	
        // REDIRECT
        } else if (httpRedirect.contains(responseCode)) {
            String location = connection.getHeaderField("Location");
            if (location != null)
            	return apply(location, responseMethod);
            
        // RESTRICTED
        } else if (httpRestricted.contains(responseCode)) {
        	return true;
        
        // FAILURE
        } else if (httpFailure.contains(responseCode)) {
        	return false;
        }
        return false;
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
