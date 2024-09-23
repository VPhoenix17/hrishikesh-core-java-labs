package com.deloitte.lab01.ex08;

public class Ex08 {

	public static boolean checkNumber(int n) {
		
		
		while(n%2==0) {
			n=n/2;
		}
		
		if(n!=1) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int n=8292;
		System.out.println(checkNumber(n));;
	}
	
}
