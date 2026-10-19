package qualitypatternmodel.exceptions;

public class ForbiddenServletCallException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9002205270069676010L;

	public ForbiddenServletCallException() {
		super();
	}

	public ForbiddenServletCallException(String message) {
		super(message);
	}

	public ForbiddenServletCallException(String message, Exception e) {
		super(message, e);
	}
}
