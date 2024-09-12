package com.uade.movies.movies.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "This already exists")
public class CategoryDuplicateException extends Exception{

}
