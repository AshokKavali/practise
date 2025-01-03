package com.example.topic;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class TopicNotFoundException extends RuntimeException {
    
	
    public TopicNotFoundException(String message) {
        super(message);
    }
    
    public TopicNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
