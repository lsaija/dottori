package it.prova.dottori.web.api.exception;

public class DottoreNonDisponibileException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DottoreNonDisponibileException(String message) {
		super(message);
	}
	

}
