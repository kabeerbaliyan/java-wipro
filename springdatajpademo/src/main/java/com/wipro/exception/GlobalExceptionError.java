package com.wipro.exception;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionError {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, Object>> handleValidationException(MethodArgumentNotValidException ex) {
		Map<String, Object> response = new HashMap<>();
		response.put("status", HttpStatus.BAD_REQUEST.value());
		response.put("error", "Validation Failed");
 
		List<Map<String, String>> errorList = new ArrayList<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> {
			Map<String, String> errorMap = new HashMap<>();
			errorMap.put("field", error.getField());
			errorMap.put("message", error.getDefaultMessage());
			errorList.add(errorMap);
		});
 
		response.put("errors", errorList);
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
	
	// Handle resource not found exception
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleResourceNotFoundException(ResourceNotFoundException ex) {
        Map<String, String> response = new HashMap<>();
        response.put("error", "Resource Not Found");
        response.put("message", ex.getMessage());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}