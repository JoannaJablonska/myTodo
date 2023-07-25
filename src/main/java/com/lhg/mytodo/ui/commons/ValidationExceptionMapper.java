package com.lhg.mytodo.ui.commons;

import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.MethodArgumentNotValidException;

@Component
@Mapper(componentModel = "spring")
public interface ValidationExceptionMapper {

    String KEY_VALUE_SEPARATOR = ": ";
    String DELIMITER = ", ";

    default String getValidationErrors(MethodArgumentNotValidException methodArgumentNotValidException) {
        return methodArgumentNotValidException.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(fieldError -> fieldError.getField() + KEY_VALUE_SEPARATOR + fieldError.getDefaultMessage())
                .collect(Collectors.joining(DELIMITER));
    }

}
