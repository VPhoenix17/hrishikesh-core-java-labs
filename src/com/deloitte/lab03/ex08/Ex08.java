package com.deloitte.lab03.ex08;

import java.util.Scanner;

public class Ex08 {

	public static boolean isPositiver(String str){
		
		for(int i = 1; i<str.length();i++) {
			if(str.charAt(i)<str.charAt(i-1)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		System.out.println(isPositiver(input));
		
		sc.close();
				
	}
	
}
