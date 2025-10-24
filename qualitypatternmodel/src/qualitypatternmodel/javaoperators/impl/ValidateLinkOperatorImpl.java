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
		100, // 100 - Continue
		101, // 101 - Switching Protocols
		102, // 102 - Processing
		103, // 103 - Early Hints
		HttpURLConnection.HTTP_OK, // 200 - OK
		HttpURLConnection.HTTP_CREATED, // 201 - Created
		HttpURLConnection.HTTP_ACCEPTED, // 202 - Accepted
		HttpURLConnection.HTTP_NOT_AUTHORITATIVE, // 203 - Non-Authoritative Information
		HttpURLConnection.HTTP_NO_CONTENT, // 204 - No Content
		HttpURLConnection.HTTP_RESET, // 205 - Reset Content
		HttpURLConnection.HTTP_PARTIAL, // 206 - Partial Content
		207, // 207 - Multi-Status
		208, // 208 - Already Reported
		226 // 226 - IM Used
    );

	public static final List<Integer>  httpRedirect = Arrays.asList(
		HttpURLConnection.HTTP_MULT_CHOICE, // 300 - Multiple Choices
		HttpURLConnection.HTTP_MOVED_PERM, // 301 - Moved Permanently
		HttpURLConnection.HTTP_MOVED_TEMP, // 302 - Found
		HttpURLConnection.HTTP_SEE_OTHER, // 303 - See Other
		HttpURLConnection.HTTP_NOT_MODIFIED, // 304 - Not Modified
		HttpURLConnection.HTTP_USE_PROXY, // 305 - Use Proxy
		307, // 307 - Temporary Redirect
		308 // 308 - Permanent Redirect
    );

	public static final List<Integer>  httpRestricted = Arrays.asList(
		HttpURLConnection.HTTP_UNAUTHORIZED, // 401 - Unauthorized
		HttpURLConnection.HTTP_PAYMENT_REQUIRED, // 402 - Payment Required
		HttpURLConnection.HTTP_FORBIDDEN, // 403 - Forbidden
		HttpURLConnection.HTTP_PROXY_AUTH, // 407 - Proxy Authentication Required
		423, // 423 - Locked
		424, // 424 - Failed Dependency
		425, // 425 - Too Early
		426, // 426 - Upgrade Required
		428, // 428 - Precondition Required
		429, // 429 - Too Many Requests
		431, // 431 - Request Header Fields Too Large
		451, // 451 - Unavailable For Legal Reasons
		511 // 511 - Network Authentication Required	
	);

	public static final List<Integer>  httpFailure = Arrays.asList(
		HttpURLConnection.HTTP_BAD_REQUEST, // 400 - Bad Request
		HttpURLConnection.HTTP_NOT_FOUND, // 404 - Not Found
		HttpURLConnection.HTTP_BAD_METHOD, // 405 - Method Not Allowed
		HttpURLConnection.HTTP_NOT_ACCEPTABLE, // 406 - Not Acceptable
		HttpURLConnection.HTTP_CLIENT_TIMEOUT, // 408 - Request Timeout
		HttpURLConnection.HTTP_CONFLICT, // 409 - Conflict
		HttpURLConnection.HTTP_GONE, // 410 - Gone
		HttpURLConnection.HTTP_LENGTH_REQUIRED, // 411 - Length Required
		HttpURLConnection.HTTP_PRECON_FAILED, // 412 - Precondition Failed
		HttpURLConnection.HTTP_ENTITY_TOO_LARGE, // 413 - Content Too Large
		HttpURLConnection.HTTP_REQ_TOO_LONG, // 414 - URI Too Long
		HttpURLConnection.HTTP_UNSUPPORTED_TYPE, // 415 - Unsupported Media Type
		HttpURLConnection.HTTP_INTERNAL_ERROR, // 500 - Internal Server Error
		HttpURLConnection.HTTP_NOT_IMPLEMENTED, // 501 - Not Implemented
		HttpURLConnection.HTTP_BAD_GATEWAY, // 502 - Bad Gateway
		HttpURLConnection.HTTP_UNAVAILABLE, // 503 - Service Unavailable
		HttpURLConnection.HTTP_GATEWAY_TIMEOUT, // 504 - Gateway Timeout
		HttpURLConnection.HTTP_VERSION, // 505 - HTTP Version Not Supported
		416, // 416 - Range Not Satisfiable
		417, // 417 - Expectation Failed
		421, // 421 - Misdirected Request
		422, // 422 - Unprocessable Content
		506, // 506 - Variant Also Negotiates
		507, // 507 - Insufficient Storage
		508 // 508 - Loop Detected
    );

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
			res +=  "[bool ";
			if (!getOption().getValue()) {
				res += "not ";
			}
			res += getOption().getInternalId() + "]";
		} else {
			res += "[no option] ";
		}

		if (getPrimitiveNode() != null) {
			res += "[node " + getPrimitiveNode().getInternalId() + "]";
		} else {
			res += "[no node] ";
		}
		return res;
	}
} //ValidateLinkOperatorImpl
