package com.cg.eis.exception;

@SuppressWarnings("serial")
public class EmployeeException extends Exception {
    
    public EmployeeException() {
        super("Salary is below 3000"); 
    }
}
