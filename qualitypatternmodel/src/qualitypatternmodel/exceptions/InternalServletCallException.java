package qualitypatternmodel.exceptions;

public class InternalServletCallException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9001584715746043021L;

	public InternalServletCallException() {
		super();
	}

	public InternalServletCallException(String message) {
		super(message);
	}

	public InternalServletCallException(String message, Exception e) {
		super(message, e);
	}
}
