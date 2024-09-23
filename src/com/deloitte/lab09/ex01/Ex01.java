package com.deloitte.lab09.ex01;

import java.util.function.BiFunction;

public class Ex01 {
	public static void main(String[] args) {
		
	
		BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
		
		System.out.println(multiply.apply(12, 9));
		
	}
}
