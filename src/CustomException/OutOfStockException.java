package CustomException;

public class OutOfStockException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public OutOfStockException(String message) {
		super(message);
	}
	
}
