package qualitypatternmodel.exceptions;

public class MissingPatternContainerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3415085844526634564L;

	public MissingPatternContainerException() {
		super();
	}
	
	public MissingPatternContainerException(String message) {
		super(message);
	}
}
