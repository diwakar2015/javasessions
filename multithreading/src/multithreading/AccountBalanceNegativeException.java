package multithreading;

public class AccountBalanceNegativeException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public AccountBalanceNegativeException(String msg) {
		super(msg);
	}

}
