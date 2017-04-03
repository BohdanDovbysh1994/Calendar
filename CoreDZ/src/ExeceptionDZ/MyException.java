package ExeceptionDZ;

public class MyException extends Exception {
	private Methods methods;

	public MyException(String msg) {
		super(msg);
	}

}
