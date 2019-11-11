package br.com.bempromotora.backend.architecture.exception;

public class ArchitectureLogicException extends Exception{

	private static final long serialVersionUID = 1L;

	public ArchitectureLogicException() {
		super();
	}

	public ArchitectureLogicException(String message) {
		super(message);
	}

	public ArchitectureLogicException(Throwable cause) {
		super(cause);
	}
}
