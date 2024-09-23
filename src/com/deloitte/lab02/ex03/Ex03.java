package com.deloitte.lab02.ex03;

import java.util.Arrays;

public class Ex03 {
	
	
	public static int[] getSorted(int[] arr1){
		
		for (int i = 0; i < arr1.length; i++) {

            StringBuilder temp = new StringBuilder(String.valueOf(arr1[i]));
            
            arr1[i] = Integer.parseInt(temp.reverse().toString());
        }
		
		Arrays.sort(arr1);
		return arr1;
	}
	
	
	public static void main(String[] args) {
		int[] arr1= {51,12,95,23,45,19,21};
		
		arr1=getSorted(arr1);
		
		
		for(int i:arr1) {
			System.out.print(i+" ");
		}
	}
	
}
