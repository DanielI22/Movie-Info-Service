package com.project.api.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such movie in the database")  // 404
public class MovieNotFoundException extends RuntimeException{
}
