package com.sa.telecom.plm.excpetionhandling.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeNotFoundExcpetion  extends RuntimeException{
    private String message;
    public EmployeeNotFoundExcpetion(String message) {
       this.message=message;
    }
}
