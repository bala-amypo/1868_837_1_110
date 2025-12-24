package com.example.demo.exception;

import com.example.demo.dto.ApiResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ApiResponse handle(Exception ex) {
        return new ApiResponse(false, ex.getMessage(), null);
    }
}
