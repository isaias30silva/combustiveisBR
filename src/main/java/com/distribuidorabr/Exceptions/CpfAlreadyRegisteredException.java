package com.distribuidorabr.Exceptions;

public class CpfAlreadyRegisteredException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CpfAlreadyRegisteredException(String msg) {
		super(msg);
	}
}
