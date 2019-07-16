package com.company.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Shoh Jahon on 09.09.2018.
 */
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AppException extends RuntimeException{
    public AppException(String message){
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}
