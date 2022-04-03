package com.example.demo.helper;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception {

    public UserNotFoundException(){

        super("User with this User name is not found in DB!!");
    }
    public UserNotFoundException(String message){
        super(message);
    }
}
