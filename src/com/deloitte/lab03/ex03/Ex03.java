package com.deloitte.lab03.ex03;

import java.util.Scanner;

public class Ex03 {
	
	public static boolean isConsonant(char ch) {
		ch = Character.toLowerCase(ch);
		return (ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	}
	
	public static String alterString(String str) {
		
		StringBuilder sb  = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(isConsonant(ch)) {
				ch=(char) (ch+1);
			}
			sb.append(ch);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(alterString(str));
		
		sc.close();
		
	}
}
