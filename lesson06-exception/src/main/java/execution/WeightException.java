package execution;

public class WeightException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public WeightException() {
		super();
	}
	
	public WeightException(String reason) {
		super(reason);
	}
}
