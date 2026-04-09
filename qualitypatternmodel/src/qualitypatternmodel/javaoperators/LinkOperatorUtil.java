package qualitypatternmodel.javaoperators;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

public class LinkOperatorUtil {
	
	public static final int DEFAULT_TIMEOUT = 5000;

    private static final HttpClient CLIENT = HttpClient.newBuilder()
            .connectTimeout(Duration.ofMillis(DEFAULT_TIMEOUT))
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build();
	
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

    public static int getResponseCode(String url) {
    	url = url.trim();
        try {
            HttpResponse<Void> response = sendForHead(url);
            return response.statusCode();
        } catch (Exception e) {
            return -1;
        }
    }

    public static String getMimeType(String url) {
    	url = url.trim();
        try {
            HttpResponse<Void> response = sendForHead(url);
            return response.headers()
                    .firstValue("Content-Type")
                    .map(ct -> ct.split(";")[0].trim())
                    .orElse(null);
        } catch (Exception e) {
            return null;
        }
    }

    public static Pair<Integer, Integer> getImageSize(String url) {
    	url = url.trim();
        try {
            HttpResponse<byte[]> response = sendForBody(url);
            byte[] data = response.body();
            if (data == null || data.length < 10) return null;
            return parseImageSize(data);
        } catch (Exception e) {
            return null;
        }
    }





    // Core Request Logic

    private static HttpResponse<Void> sendForHead(String url) throws Exception {
    	url = url.trim();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofMillis(DEFAULT_TIMEOUT))
                .method("HEAD", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<Void> response = CLIENT.send(request, HttpResponse.BodyHandlers.discarding()); 
        int code = response.statusCode();

        // Fallback to GET
        if (isFailure(code)) {
            request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .timeout(Duration.ofMillis(DEFAULT_TIMEOUT))
                    .GET()
                    .build();

            response = CLIENT.send(request, HttpResponse.BodyHandlers.discarding());
        }

        return response;
    }

    private static HttpResponse<byte[]> sendForBody(String url) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofMillis(DEFAULT_TIMEOUT))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        return CLIENT.send(request, HttpResponse.BodyHandlers.ofByteArray());
    }

    private static Pair<Integer, Integer> parseImageSize(byte[] data) {

        // PNG
        if (data.length > 24 &&
            data[0] == (byte)137 && data[1] == 80 && data[2] == 78 && data[3] == 71) {

            int width = readInt(data, 16);
            int height = readInt(data, 20);
            return Pair.of(width, height);
        }

        // GIF
        if (data.length > 10 &&
            data[0] == 'G' && data[1] == 'I' && data[2] == 'F') {

            int width = readShort(data, 6);
            int height = readShort(data, 8);
            return Pair.of(width, height);
        }

        // JPEG (simplified)
        if (data.length > 4 &&
            data[0] == (byte)0xFF && data[1] == (byte)0xD8) {

            int index = 2;
            while (index < data.length) {
                if ((data[index] & 0xFF) != 0xFF) break;

                int marker = data[index + 1] & 0xFF;
                int length = readShort(data, index + 2);

                if (marker == 0xC0 || marker == 0xC2) {
                    int height = readShort(data, index + 5);
                    int width = readShort(data, index + 7);
                    return Pair.of(width, height);
                }

                index += 2 + length;
            }
        }

        return null;
    }

    private static int readInt(byte[] data, int offset) {
        return ((data[offset] & 0xFF) << 24) |
               ((data[offset + 1] & 0xFF) << 16) |
               ((data[offset + 2] & 0xFF) << 8) |
               (data[offset + 3] & 0xFF);
    }

    private static int readShort(byte[] data, int offset) {
        return ((data[offset] & 0xFF) << 8) |
               (data[offset + 1] & 0xFF);
    }

	public static Boolean evaluateResponseCode(String urlString) {
    	urlString = urlString.trim();
	    try {
	        Integer responseCode = getResponseCode(urlString);
	        
	        Boolean result = isOk(responseCode);
	        if (result == false && urlString.startsWith("http://"))
	        	return evaluateResponseCode("https" + urlString.substring(4));
	        return result;
	    } catch (Exception e) {
	        return false;
	    }
	}

	@SuppressWarnings("unused")
	private static Boolean isRedirect(int responseCode) {
		return httpRedirect.contains(responseCode);
	}

	private static Boolean isOk(int responseCode) {
		return httpSuccess.contains(responseCode) || httpRestricted.contains(responseCode); 
	}

	private static Boolean isFailure(int responseCode) {
		return httpFailure.contains(responseCode); 
	}
}
