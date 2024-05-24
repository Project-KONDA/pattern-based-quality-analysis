package qualitypatternmodel.exceptions;

public class FailedServletCallException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3415085844526634564L;

	public FailedServletCallException() {
		super();
	}
	
	public FailedServletCallException(String message) {
		super(message);
	}

	public FailedServletCallException(String message, Exception e) {
		super(message, e);
	}
}
