package com.exceptionHandling.EH.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class PoductExceptionHandler {
	
	
	
	@ExceptionHandler(ProductIdNotFoundException.class)
	public ResponseEntity<Object> handleProductIdNotFoundException(ProductIdNotFoundException productIdNotFoundException){
		ErrorResponse errorResponse = new ErrorResponse("PRODUCT ID NOT FOUND", HttpStatus.NOT_FOUND);
		//ErrorResponse errorResponse = new ErrorResponse(productIdNotFoundException.getMessage(), HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
				
	}

}
