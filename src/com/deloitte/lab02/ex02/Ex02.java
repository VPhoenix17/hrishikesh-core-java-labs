package com.deloitte.lab02.ex02;

import java.util.Arrays;
//import java.util.Collections;

public class Ex02 {
	
	public static String sortStrings(String[] str){
	
		Arrays.sort(str);
		
		int length = str.length;
		int half;
		
		if(length%2==0) half=length/2;
		else half = (length/2)+1;
		
		for(int i=0;i<=half;i++) {
			if(i<half) {
				str[i]=str[i].toUpperCase();
			}
			else str[i]=str[i].toLowerCase();
		}
		
		
		return Arrays.toString(str);
	}
	
	public static void main(String[] args) {
		String[] strs= {"apple", "Banana", "cherry", "applepie", "Grapes", "grape", "Almond", "mango"};
		
		System.out.println(sortStrings(strs));
		
		
	}
	
}