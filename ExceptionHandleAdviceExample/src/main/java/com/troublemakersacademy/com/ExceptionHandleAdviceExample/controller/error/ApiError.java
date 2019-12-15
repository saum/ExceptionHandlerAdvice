package com.troublemakersacademy.com.ExceptionHandleAdviceExample.controller.error;

import java.security.SecureRandom;

public class ApiError {

    private String errorCode;

    private String errorMessage;

    public ApiError(String errorCode, String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public ApiError setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public ApiError setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
}
