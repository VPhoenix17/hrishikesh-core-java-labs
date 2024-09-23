package com.deloitte.lab09.ex05;

import java.util.function.IntFunction;

public class Ex05 {
	public static int factorial(int n) {
		
		if(n==0 || n==1) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		IntFunction<Integer> factorialMethod = Ex05::factorial;
		int num1= 6;
		System.out.println(factorialMethod.apply(num1));
	}
}
