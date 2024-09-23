package com.deloitte.lab06.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Ex01 {
	
	public static List<Integer> getValues(HashMap<String, Integer> map){
		List <Integer> values = new ArrayList<>(map.values());
		Collections.sort(values);
		return values;
	}

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();
        
        System.out.println("Enter the number of entries:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

       
        for (int i = 0; i < n; i++) {
            System.out.println("Enter key (String):");
            String key = scanner.nextLine();
            System.out.println("Enter value (Integer):");
            int value = scanner.nextInt();
            scanner.nextLine(); 
            map.put(key, value);
        }


        List<Integer> sortedValues = getValues(map);


        System.out.println("Sorted Values: " + sortedValues);

        scanner.close();
    }
}
