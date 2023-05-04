package com.personal.gwent.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidInputException extends Exception{
    
    private static final long serialVersionUID = 1L;

    public InvalidInputException(String message) {
        super(message);
    }
}
