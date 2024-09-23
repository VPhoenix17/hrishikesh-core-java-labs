package com.deloitte.lab09.ex02;

import java.util.function.Function;

public class Ex02 {
	
	public static String formatString(String str1) {
		
		Function<String, String> addSpace = str2 -> {
			StringBuilder sb = new StringBuilder();
			for(char c : str1.toCharArray()) {
				sb.append(c).append(" ");
			}
			return sb.toString();
		};		
		return addSpace.apply(str1);
	}
	
	public static void main(String[] args) {
		String input = "CFg";
		
		System.out.println(formatString(input));
	}


}
