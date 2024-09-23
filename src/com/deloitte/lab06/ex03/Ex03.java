package com.deloitte.lab06.ex03;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {
	
	
	public static Map<Integer, Integer> getSquares(int[] nums){
		Map<Integer, Integer> squaresMap = new HashMap<>();
		
		for (int num1 : nums) {
			squaresMap.put(num1, num1*num1);
		}
		
		
		return squaresMap;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9};
		
		Map<Integer, Integer> result = getSquares(nums);
		
		for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
	}
}
