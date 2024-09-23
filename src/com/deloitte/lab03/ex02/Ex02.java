package com.deloitte.lab03.ex02;

public class Ex02 {

	
	public static String getImage(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		return str +  "|" +sb.toString();
	}
	
	public static void main(String[] args) {
		
		String str = "Sample input";
		String result = getImage(str);
		System.out.println(result);
	}
	
}
