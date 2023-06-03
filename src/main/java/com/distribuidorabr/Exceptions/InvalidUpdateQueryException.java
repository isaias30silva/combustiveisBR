package com.distribuidorabr.Exceptions;

public class InvalidUpdateQueryException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public InvalidUpdateQueryException(String msg) {
		super(msg);
	}

}
