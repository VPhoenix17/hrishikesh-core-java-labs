package com.deloitte.lab01.ex07;

public class Ex07 {
	
	public static boolean checkNumber(int num) {
		
		boolean check=true;
		String str= String.valueOf(num);
		
		for(int i=0;i<(str.length()-1);i++) {
			if(Character.getNumericValue(str.charAt(i))>Character.getNumericValue(str.charAt(i+1))) {
				check=false;
			}
		}
		
		
		return check;
	}
	
	public static void main(String[] args) {
		int num=14689;
		System.out.println(checkNumber(num));
	}
	
}
