package com.exceptionHandling.EH.exception;



public class ProductIdNotFoundException extends RuntimeException{


	private static final long serialVersionUID = 1L;


	public ProductIdNotFoundException(String message) {
		super(message);
	}
	public ProductIdNotFoundException() {
		
	}




}
