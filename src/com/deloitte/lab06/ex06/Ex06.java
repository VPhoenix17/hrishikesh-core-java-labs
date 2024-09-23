package com.deloitte.lab06.ex06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex06 {
	
	public static List<Integer> voterList(Map<Integer,Integer> ageMap){
		List<Integer> eligibleVoters = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> entry : ageMap.entrySet()) {
			int id = entry.getKey();
			int age = entry.getValue();
			
			if(age>18) {
				eligibleVoters.add(id);
			}
		}
		
		return eligibleVoters;
	}
	
	public static void main(String[] args) {
		Map<Integer, Integer> ageMap = new HashMap<>();
        ageMap.put(101, 21);
        ageMap.put(102, 37);
        ageMap.put(103, 12);
        ageMap.put(104, 15);
        ageMap.put(105, 27);
        
        System.out.println(voterList(ageMap));
	}
}
