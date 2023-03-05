package com.aws.spring.controller;

import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity handleError() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("message","ERROR");
        return ResponseEntity.ok(jsonObject);
    }

}