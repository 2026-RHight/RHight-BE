package com.reverse.rhight.global.exception;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ErrorResponse {
    private final LocalDateTime timestamp;

    private final String message;

    @Builder
    public ErrorResponse(String message) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }

    public static ErrorResponse of(Exception exception) {
        return ErrorResponse.builder().message(exception.getMessage()).build();
    }
}
