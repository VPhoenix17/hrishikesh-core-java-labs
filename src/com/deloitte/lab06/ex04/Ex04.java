package com.deloitte.lab06.ex04;

import java.util.HashMap;
import java.util.Map;

public class Ex04 {

	
	public static Map<Integer, String> getStudents(Map<Integer, Integer> marksMap){
		Map<Integer, String> medalMap = new HashMap<>();
		
		for(Map.Entry<Integer, Integer> entry : marksMap.entrySet()) {
			int regNum = entry.getKey();
			int marks = entry.getValue();
			
			if(marks>=90) {
				medalMap.put(regNum, "Gold");
			} else if (marks>=80) {
				medalMap.put(regNum, "Silver");
			} else if(marks>=70){
				medalMap.put(regNum, "Bronze");
			}
		}
		
		return medalMap;
	}
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> studentMarks = new HashMap<>();
        studentMarks.put(101, 63);
        studentMarks.put(102, 87);
        studentMarks.put(103, 95);
        studentMarks.put(104, 79);
        
        Map<Integer, String> result = getStudents(studentMarks);
        for (Map.Entry<Integer, String> entry : result.entrySet()) {
            System.out.println("RegNo: " + entry.getKey() + " :: " + entry.getValue());
        }
        
	}
	
}
