package com.deloitte.lab02.ex04;

import java.util.Arrays;

public class Ex04 {

    public static int[] modifyArray(int[] arr) {

        Arrays.sort(arr);


        int[] temp = new int[arr.length];
        int j = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }

        temp[j++] = arr[arr.length - 1];
    

        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }


        for (int i = 0; i < result.length / 2; i++) {
            int tempValue = result[i];
            result[i] = result[result.length - 1 - i];
            result[result.length - 1 - i] = tempValue;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 3, 5, 4, 5, 6};

        int[] modifiedArr = modifyArray(arr);

        
        for (int num : modifiedArr) {
            System.out.print(num + " ");
        }
    }
}