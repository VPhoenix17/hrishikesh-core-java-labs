package com.deloitte.lab03.ex01;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter line of integers: ");
		String input = sc.nextLine();
		
		StringTokenizer tokens = new StringTokenizer(input);
		System.out.println("Integers: ");
		int sum = 0;
		while(tokens.hasMoreTokens()) {
			int num = Integer.parseInt(tokens.nextToken());
			System.out.print(num+" ");
			sum+=num;
		}
		System.out.println("\nSum: "+sum);
		sc.close();
		
	}
}
