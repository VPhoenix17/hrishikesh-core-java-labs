package com.deloitte.lab05.ex01;

@SuppressWarnings("serial")
public class AgeException extends Exception {


    public AgeException() {
        super("Age of a person should be above 15"); 
    }
}
