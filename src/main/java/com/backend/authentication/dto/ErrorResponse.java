package com.backend.authentication.dto;

import org.springframework.http.HttpStatus;

public record ErrorResponse(
        String message,
        HttpStatus statusCode
) {
}
