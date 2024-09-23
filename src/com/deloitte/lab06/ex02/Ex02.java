package com.deloitte.lab06.ex02;

import java.util.HashMap;
import java.util.Map;


public class Ex02 {

	
	public static Map<Character, Integer> countChars(char[] arr){
		
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(char c : arr) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			} else {
				charMap.put(c, 1);
			}
		}
		return charMap;
	}
	
	public static void main(String[] args) {
		char[] arr1 = {'c', 'b', 'a', 'a', 'b', 'a', 'c', 'd','d'};
		
		Map<Character, Integer> result = countChars(arr1);
		
		for(Map.Entry<Character, Integer> entry : result.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
}
