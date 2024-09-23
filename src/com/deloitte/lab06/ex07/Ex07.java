package com.deloitte.lab06.ex07;

import java.util.Arrays;

public class Ex07 {
	public static int[] getSorted(int[] arr1) {

		for (int i = 0; i < arr1.length; i++) {

			StringBuilder temp = new StringBuilder(String.valueOf(arr1[i]));

			arr1[i] = Integer.parseInt(temp.reverse().toString());
		}

		Arrays.sort(arr1);
		return arr1;
	}

	public static void main(String[] args) {
		int[] arr1 = {123, 456, 789, 12, 34};

		arr1 = getSorted(arr1);

		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}
