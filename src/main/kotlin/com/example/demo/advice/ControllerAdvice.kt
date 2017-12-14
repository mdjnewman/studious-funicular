package com.example.demo.advice

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ErrorHandlingAdvice {

    @ExceptionHandler(Exception::class)
    fun handleException(exception: Exception): ResponseEntity<*> {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Handled by ${this.javaClass.simpleName}")
    }

}