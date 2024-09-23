package com.deloitte.lab06.ex05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex05 {

	public static int getSecondSmallest(int[] arr){
		List<Integer> arrList1 = new ArrayList<>();
		for(int num:arr) {
			arrList1.add(num);
		}
		Collections.sort(arrList1);
		
		return arrList1.get(1);
	}
	
	public static void main(String[] args) {
		int[] arr1 = {21,53,58,45,12,36};
		
		System.out.println(getSecondSmallest(arr1));
	}
	
}
