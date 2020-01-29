package com.example.demo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestAdvice {

	@ExceptionHandler(Exception.class)
	// @ResponseStatus(code=HttpStatus.BAD_GATEWAY)
	public ResponseEntity<String> handleExcaption(Exception exception) {
		if (exception instanceof MethodArgumentNotValidException) {
			MethodArgumentNotValidException exp = (MethodArgumentNotValidException) exception;
			BindingResult bindingResult = exp.getBindingResult();
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			for (ObjectError objectError : allErrors) {
				System.out.println(objectError.getCode());
			}
			
			ResponseEntity.status(HttpStatus.ALREADY_REPORTED).body(exception.getMessage());
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
	}

}
