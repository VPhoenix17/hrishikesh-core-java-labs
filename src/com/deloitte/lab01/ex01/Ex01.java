package com.deloitte.lab01.ex01;


public class Ex01 {
	public static void main(String[] args) {
		
		System.out.println(cubeSum(555555555));
	}
	
	public static int cubeSum(int n) {
		
		int cubeSum=0;
		while(n>0) {
			int digit = n % 10;
			cubeSum+=digit;
			n=n/10;
		}
		
		return cubeSum;
	}
}
