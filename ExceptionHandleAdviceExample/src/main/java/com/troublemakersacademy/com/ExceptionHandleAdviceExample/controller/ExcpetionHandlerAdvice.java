package com.troublemakersacademy.com.ExceptionHandleAdviceExample.controller;

import com.troublemakersacademy.com.ExceptionHandleAdviceExample.controller.error.ApiError;
import com.troublemakersacademy.com.ExceptionHandleAdviceExample.controller.error.MyAppCheckedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExcpetionHandlerAdvice extends ResponseEntityExceptionHandler{

    @ExceptionHandler(value = MyAppCheckedException.class)
    public ResponseEntity<ApiError> checkedExHandler(MyAppCheckedException ex){
        System.out.println("Handling Exception across Application");
//        ApiError apiError = new ApiError("1","hiii");
        return new ResponseEntity<ApiError>(ex.getApiError(), ex.getHttpStatus());
    }

}
