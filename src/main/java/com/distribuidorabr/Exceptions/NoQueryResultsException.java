package com.distribuidorabr.Exceptions;

public class NoQueryResultsException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public NoQueryResultsException(String msg) {
		super(msg);
	}
}
