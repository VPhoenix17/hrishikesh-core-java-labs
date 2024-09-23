package com.deloitte.lab05.ex02;

import java.util.Scanner;

public class Ex02 {

	 public static void validateName(String firstName, String lastName) throws nameException {
	        if (firstName == null || firstName.trim().isEmpty()) {
	            throw new nameException("First name cannot be blank.");
	        }
	        if (lastName == null || lastName.trim().isEmpty()) {
	            throw new nameException("Last name cannot be blank.");
	        }
	        System.out.println("Employee name is valid.");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter first name: ");
	        String firstName = sc.nextLine();
	        
	        System.out.print("Enter last name: ");
	        String lastName = sc.nextLine();


	        try {
	            validateName(firstName, lastName);
	        } catch (nameException e) {
	            System.out.println(e.getMessage()); 
	        } finally {
	        	sc.close();
			}
	        
	        
	    }
}
