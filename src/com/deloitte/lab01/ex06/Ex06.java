package com.deloitte.lab01.ex06;

public class Ex06 {

	public static int calculateDifference(int n) {
        int sum = 0; 
        int sumOfSquares = 0;  

        
        for (int i = 1; i <= n; i++) {
            sum += i;  
            sumOfSquares += i * i;  
        }

        
        int squareOfSum = sum * sum;

        
        int difference = squareOfSum - sumOfSquares;

        return difference;
    }
	
	public static void main(String[] args) {
		int n = 4;
		System.out.println(calculateDifference(n));
	}
	
}
