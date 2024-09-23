package com.deloitte.lab01.ex04;

import java.util.Scanner;
import java.lang.Math;
public class Ex04 {
	
	public static boolean isPrime(int n) {
		for (int i=2;i<=Math.sqrt(n);i++) {
			if (n%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer number: ");
		int num=sc.nextInt();
		
		for (int i=1;i<=num;i++) {
			if (isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
		sc.close();
		
	}
	
}
