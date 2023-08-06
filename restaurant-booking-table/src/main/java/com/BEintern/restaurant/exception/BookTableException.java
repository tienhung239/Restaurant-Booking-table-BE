package com.intern.restaurant.exception;

public class BookTableException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BookTableException() {
		super();
	}
	
	public BookTableException(String message) {
		super(message);
	}
}
