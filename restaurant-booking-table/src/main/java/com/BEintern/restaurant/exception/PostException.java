package com.intern.restaurant.exception;

public class PostException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PostException() {
		super();
	}
	
	public PostException(String message) {
		super(message);
	}

}
