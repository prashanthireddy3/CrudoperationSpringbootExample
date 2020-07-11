package com.sa.telecom.plm.excpetionhandling;

import com.sa.telecom.plm.dto.ErrorResponse;
import com.sa.telecom.plm.excpetionhandling.exceptions.EmployeeNotFoundExcpetion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Calendar;

@ControllerAdvice
public class GlopbalExcpetion {

    @ExceptionHandler(EmployeeNotFoundExcpetion.class)
    public ResponseEntity<Object> EmployeeNotFoundException(EmployeeNotFoundExcpetion e){
        ErrorResponse response=new ErrorResponse(e.getMessage(),
                HttpStatus.NOT_FOUND, Calendar.getInstance());
        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> CommonException(Exception e){
        ErrorResponse response=new ErrorResponse(e.getMessage(),
                HttpStatus.NOT_FOUND, Calendar.getInstance());
        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }
}
