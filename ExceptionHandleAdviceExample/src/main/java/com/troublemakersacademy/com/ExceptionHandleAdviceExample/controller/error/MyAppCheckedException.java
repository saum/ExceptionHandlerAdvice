package com.troublemakersacademy.com.ExceptionHandleAdviceExample.controller.error;

import org.springframework.http.HttpStatus;

public class MyAppCheckedException extends Exception{

    private ApiError apiError;

    private HttpStatus httpStatus;

    public MyAppCheckedException(Exception e, ErrorMsg errorMsg, Object... arg){
        this.apiError = new ApiError(errorMsg.errorCode,errorMsg.errorMessage);
    }

    public static MyAppCheckedException BAD_REQUEST(Exception e, ErrorMsg errorMsg,Object... arg){
        return new MyAppCheckedException(e != null? e: new Exception(), errorMsg,arg).setHttpStatus(HttpStatus.BAD_REQUEST);
    }

    public static MyAppCheckedException ADDRESS_NOT_FOUND(Exception e, ErrorMsg errorMsg,Object... arg){
        return new MyAppCheckedException(e != null? e: new Exception(), errorMsg,arg).setHttpStatus(HttpStatus.BAD_REQUEST);
    }

    private MyAppCheckedException setHttpStatus(HttpStatus httpStatus){
        this.httpStatus = httpStatus;
        return  this;
    }

    public ApiError getApiError() {
        return apiError;
    }

    public void setApiError(ApiError apiError) {
        this.apiError = apiError;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
