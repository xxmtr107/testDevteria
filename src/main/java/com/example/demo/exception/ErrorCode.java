package com.example.demo.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    USER_EXISTED(1003, "User already exists", HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(1002, "User not found", HttpStatus.NOT_FOUND),
    USERNAME_INVALID(1001, "Username must be at least 3 characters", HttpStatus.BAD_REQUEST),
    PASSWORD_INVALID(1004, "Password must be at least 8 characters", HttpStatus.BAD_REQUEST),
    UNAUTHENTICATION(1005, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    INVALID_KEY(1006, "Invalid key", HttpStatus.BAD_REQUEST),
    UNCATERORIZED(999, "Uncaterized error", HttpStatus.INTERNAL_SERVER_ERROR),
    UNAUTHORIZED(1007, "You do not have permission", HttpStatus.FORBIDDEN);



    ErrorCode(int code, String message, HttpStatus httpStatus) {
        this.code = code;
        this.message = message;
        this.httpStatus = httpStatus;
    }
    private int code;
    private String message;
    private HttpStatus httpStatus;

}
