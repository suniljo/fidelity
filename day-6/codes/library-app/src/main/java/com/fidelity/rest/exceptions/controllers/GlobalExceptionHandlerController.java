package com.fidelity.rest.exceptions.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fidelity.rest.exceptions.BookNotFoundException;
import com.fidelity.rest.exceptions.models.ApiError;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
//@RestControllerAdvice
public class GlobalExceptionHandlerController {
	
	@ExceptionHandler(value = BookNotFoundException.class)
	public ResponseEntity<ApiError> handleBookNotFoundException(BookNotFoundException bex, HttpServletRequest httpRequest) {
		//return ResponseEntity.notFound().build();
		
		ApiError error = new ApiError();
		
		int code = 404;
		String message = bex.getMessage();
		String type = bex.getClass().getName();
		String uri = httpRequest.getRequestURI();
		
		error.setErrorCode(code);
		error.setMessage(message);
		error.setType(type);
		error.setUri(uri);
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleValidationFailures(MethodArgumentNotValidException ex){
		System.out.println(ex.getBindingResult().getErrorCount());
		//return ResponseEntity.badRequest().body("hshhshs");
		
		List<String> errorList = ex.getBindingResult()
										 .getFieldErrors()
										 .stream()
										 .map(fieldError -> fieldError.getField() + ": "+ fieldError.getDefaultMessage())
										 .collect(Collectors.toList());
		
		return ResponseEntity.badRequest().body(errorList);
	}
}
