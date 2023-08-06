package com.intern.restaurant.exception;

public class FoodException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FoodException() {
		super();
	}
	
	public FoodException(String message) {
		super(message);
	}
}
