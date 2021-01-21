package com.dsclient.crud.services.exceptions;

public class DatabaseViolationException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DatabaseViolationException(String msg) {
		super(msg);
	}

}
