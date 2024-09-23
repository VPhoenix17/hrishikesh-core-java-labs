package com.deloitte.lab09.ex03;

import java.util.function.BiPredicate;

public class Ex03 {
	
	public static boolean authenticate(String username, String password) {
		
		
		String validName = "Admin";
		String validPassworrd = "deloitteusi";
		
		BiPredicate<String, String> isAuthenticated = (user, pass)->user.equals(validName) && pass.equals(validPassworrd);
		
		
		return isAuthenticated.test(username, password);
	}
	
	public static void main(String[] args) {
		 String username = "Admin";
		 String password = "password123";
		 
		 System.out.println(authenticate(username, password));
		 System.out.println("Updated Passworrd..");
		 password = "deloitteusi";
		 System.out.println(authenticate(username, password));
	}
	
}
