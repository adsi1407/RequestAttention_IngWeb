package co.edu.udea.wi.exception;

import java.util.List;

public class ClassException extends Exception {

	public ClassException() {
		// TODO Auto-generated constructor stub
	}

	public ClassException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ClassException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ClassException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ClassException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ClassException(List<String> errors) {
		super(createFormattedMessage(errors));
	}
	
	private static String createFormattedMessage(List<String> errors) {
		return "Errores:" + System.getProperty("line.separator") + "- " + String.join(System.getProperty("line.separator") + "- ", errors);
	}
}
