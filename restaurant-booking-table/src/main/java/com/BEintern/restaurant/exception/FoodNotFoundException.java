package com.intern.restaurant.exception;

public class FoodNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FoodNotFoundException() {
		super();
	}
	
	public FoodNotFoundException(String message) {
		super(message);
	}
}
