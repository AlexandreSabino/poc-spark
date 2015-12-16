package br.com.netshoes.spark.exception;

public class ResourceNotFoundException extends RestfulException {
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
        super(404, "Not found");
    }
}
