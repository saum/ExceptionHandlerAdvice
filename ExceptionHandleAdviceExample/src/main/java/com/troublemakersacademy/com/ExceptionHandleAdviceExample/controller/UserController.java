package com.troublemakersacademy.com.ExceptionHandleAdviceExample.controller;

import com.troublemakersacademy.com.ExceptionHandleAdviceExample.controller.error.ErrorMsg;
import com.troublemakersacademy.com.ExceptionHandleAdviceExample.controller.error.MyAppCheckedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(path = "getUserName")
    public String getUserName(){
        return "Amit";
    }

    @RequestMapping(path = "getUserAddress")
    public String  getUserAddress() throws MyAppCheckedException {
          if(userService.getAddress() == null) {
            throw   MyAppCheckedException.ADDRESS_NOT_FOUND(new Exception(), ErrorMsg.BAD_REQUEST, "Address");
          }
          return "test";
    }
}
