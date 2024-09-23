package com.deloitte.lab05.ex01;

import java.util.Scanner;

public class Ex01 {

	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your age: ");
        int age = sc.nextInt();


        try {
        	if (age <= 15) {
//        		sc.close();
                throw new AgeException();
            }
        } catch (AgeException e) {
            System.out.println(e.getMessage()); 
        } finally {
			sc.close();
		}
	       
	 }
}

