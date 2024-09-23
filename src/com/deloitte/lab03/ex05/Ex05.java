package com.deloitte.lab03.ex05;


public class Ex05 {

	public static void main(String[] args) {
		
		
		String input  = "Hello, World!\nThis is a sample text.\nIt contains multiple lines and words.";
		
		int chars = input.length();
		int lines = input.split("\n").length;
		int words = input.split("\\s+").length;
		
		System.out.println("Number of characters: "+chars);
		System.out.println("Number of Words: "+words);
		System.out.println("Number of Lines: "+lines);
		
	}
}
