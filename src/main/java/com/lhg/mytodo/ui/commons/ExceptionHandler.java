package com.lhg.mytodo.ui.commons;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import java.util.Locale;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@ControllerAdvice(annotations = RestController.class)
@RequiredArgsConstructor
public class ExceptionHandler {

	private final ValidationExceptionMapper mapper;

	private final RestExceptionResponseBuilder responseBuilder;

	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<FailedResponse> onMethodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException, Locale locale) {
		var validationErrors = mapper.getValidationErrors(methodArgumentNotValidException);
		return responseBuilder.build(validationErrors, BAD_REQUEST);
	}
}
