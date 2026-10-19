package qualitypatternmodel.exceptions;

public class ConflictServletCallException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9001584715746043021L;

	public ConflictServletCallException() {
		super();
	}

	public ConflictServletCallException(String message) {
		super(message);
	}

	public ConflictServletCallException(String message, Exception e) {
		super(message, e);
	}
}
