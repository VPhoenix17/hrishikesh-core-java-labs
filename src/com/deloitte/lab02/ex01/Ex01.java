package com.deloitte.lab02.ex01;

import java.util.Arrays;

public class Ex01 {
	
	
	
	public static int getSecondSmallest(int[] arr1) {
		
//		quickSort(arr1, 0, arr1.length - 1);
		Arrays.sort(arr1);
		return arr1[1];
	}
	
//	public static void quickSort(int[] array, int low, int high) {
//        if (low < high) {
//            int pivotIndex = partition(array, low, high);
//            quickSort(array, low, pivotIndex - 1);
//            quickSort(array, pivotIndex + 1, high);
//        }
//    }
//
//    private static int partition(int[] array, int low, int high) {
//        int pivot = array[high];
//        int i = low - 1;
//        
//        for (int j = low; j < high; j++) {
//            if (array[j] <= pivot) {
//                i++;
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//        }
//        
//        int temp = array[i + 1];
//        array[i + 1] = array[high];
//        array[high] = temp;
//        
//        return i + 1;
//    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println(getSecondSmallest(array));
        
    }

	
}
