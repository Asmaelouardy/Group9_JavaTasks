package Aysel.week09;

import java.util.Arrays;

public class Array_SortAscending {

    public static void main(String[] args) {


//Write a return method that can sort an int array in Ascending order
        // without using the sort method of the Arrays class


        int[] arr = {7,8,9,10};
        int[] result = reverseArray(arr);

        System.out.println(Arrays.toString(result));
    }
    public static int[] reverseArray(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }
        return reversedArray;
    }

}












