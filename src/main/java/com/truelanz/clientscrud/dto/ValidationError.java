package com.truelanz.clientscrud.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class ValidationError extends CustomError {
    
    @Getter
    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
    
}
