package br.com.netshoes.spark.exception;

public class ResourceAlreadyExistsException extends RestfulException {
	
	private static final long serialVersionUID = 1L;

	public ResourceAlreadyExistsException() {
		super(409, "o Endpoint ja existe");
	}
}
