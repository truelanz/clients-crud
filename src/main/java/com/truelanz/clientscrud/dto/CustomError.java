package com.truelanz.clientscrud.dto;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomError {

    private Instant timestamp;
    private Integer status;
    private String error;
    private String path;

}
