package com.troublemakersacademy.com.ExceptionHandleAdviceExample.controller.error;

public enum ErrorMsg {

    BAD_REQUEST("0.01","Failed to process request "),
    TIME_OUT("0.02","Failed to close{0}, in allocated time");

    public String errorCode;

    public String errorMessage;


    ErrorMsg(String errorCode,String errorMessage){
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
