package com.deloitte.lab01.ex05;

public class Ex05 {

	
	public static int calculateSum(int n) {
        int sum = 0;  
        int count = 0;  
        int number = 1;  

        while (count < n) {
            if (number % 3 == 0 || number % 5 == 0) {
                sum += number; 
                count++; 
            }
            number++;
        }

        return sum;
    }
	
	public static void main(String[] args) {
		
		int n=15;
		System.out.println(calculateSum(n));
		
	}
	
}
