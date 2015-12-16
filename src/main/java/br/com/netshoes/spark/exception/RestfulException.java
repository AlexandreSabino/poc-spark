package br.com.netshoes.spark.exception;

public class RestfulException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private int statusCode;

	public RestfulException(int statusCode, String message) {
		super(message);
		this.statusCode = statusCode;
	}

	public RestfulException(String message, Throwable cause, int statusCode) {
		super(message, cause);
		this.statusCode = statusCode;
	}

	public RestfulException(Throwable cause, int statusCode) {
		super(cause);
		this.statusCode = statusCode;
	}

	public RestfulException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace,
			int statusCode) {
		super(message, cause, enableSuppression, writableStackTrace);
		this.statusCode = statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}
}
