package com.deloitte.lab01.ex03;

public class Ex03 {
	
	public static int nonRecursiveFibonnaci(int n) {
		
		
		if(n<=1) {
			return n;
		}
		
		//
		int a = 0;
		int b = 1;
		int fib = 1;
		
		if ((n-1)!=0) {
			
			for(int i = 2; i<=n;i++) {
			
				fib= a+b;
				a=b;
				b=fib;
			}
		}		
		
		return fib;
	}
	
	public static int recursiveFibonnaci(int n) {
		
		if (n<=1) {
			return n;
		}
		
		else {
			return recursiveFibonnaci(n-1)+recursiveFibonnaci(n-2);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Using Non Recursive:\n"+nonRecursiveFibonnaci(16));
		System.out.println("Using Recursive:\n"+recursiveFibonnaci(16));
		
	}
}
