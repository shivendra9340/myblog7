package com.myblog7.exception;



import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BlogAPIException extends ResponseStatusException {
    public BlogAPIException(HttpStatus status, String reason) {
        super(status, reason);
    }
}

