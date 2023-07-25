package com.lhg.mytodo.ui.commons;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class RestExceptionResponseBuilder {

    private final MessageSource messageSource;

    private final TimeProvider timeProvider;

    public ResponseEntity<FailedResponse> build(String description, HttpStatus status) {
        return ResponseEntity.status(status)
                .body(new FailedResponse(timeProvider.getTimestamp(), description));
    }

}
