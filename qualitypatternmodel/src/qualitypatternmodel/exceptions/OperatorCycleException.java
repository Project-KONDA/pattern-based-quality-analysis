package qualitypatternmodel.exceptions;

public class OperatorCycleException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3415085844526634564L;

	public OperatorCycleException() {
		super();
	}
	
	public OperatorCycleException(String message) {
		super(message);
	}
}
