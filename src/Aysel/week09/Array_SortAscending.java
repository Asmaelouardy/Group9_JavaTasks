package Aysel.week09;

import java.util.Arrays;

public class Array_SortAscending {

    //Write a return method that can sort an int array in Ascending order
        // without using the sort method of the Arrays class

    public static void main(String[] args) {
                int[] array = {64, 25, 12, 22, 11};

                array = arraySort(array);
                System.out.println("Sorted array:");

                for (int num : array) {
                    System.out.print(num + " ");
                }
            }

            public static int[] arraySort(int[] array) {
                for (int i = 0; i < array.length - 1; i++) {
                    int minIndex = i;
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[j] < array[minIndex]) {
                            minIndex = j;
                        }
                    }

                    int temp = array[i];
                    array[i] = array[minIndex];
                    array[minIndex] = temp;
                }
                return array;
            }
        }













