package com.deloitte.lab03.ex04;

import java.util.Scanner;

public class Ex04 {
	
	public static int modifynumber(int num1) {
		
		String str = String.valueOf(num1);
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<str.length()-1;i++) {
			int first = Character.getNumericValue(str.charAt(i));
			int second = Character.getNumericValue(str.charAt(i+1));
			
			int diff = Math.abs(first-second);
			sb.append(diff);
		}
		sb.append(str.charAt(str.length()-1));
		
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input= sc.nextInt();
		System.out.println(modifynumber(input));
		sc.close();
		
	}
}
