package qualitypatternmodel.exceptions;

public class InvalidServletCallException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3415085844526634564L;

	public InvalidServletCallException() {
		super();
	}
	
	public InvalidServletCallException(String message) {
		super(message);
	}

	public InvalidServletCallException(String message, InvalidServletCallException e) {
		super(message, e);
	}
}
