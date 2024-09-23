package com.deloitte.lab01.ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n1 - Red\n2 - Yellow\n3 - Green"
				+ "\nEnter integer:");
		int traffic= sc.nextInt();
		
		switch (traffic) {
		
		case 1: System.out.println("STOP");
				break;
		case 2: System.out.println("WAIT");
		        break;
		case 3: System.out.println("GO");
				break;
		default: System.out.println("Enter Valid Digit");
				break;
		}
		
		sc.close();
		
		
	}
	
}
