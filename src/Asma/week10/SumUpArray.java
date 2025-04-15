package Asma.week10;

import java.util.Arrays;



public class SumUpArray {
    public static void  main(String[] args) {
        int n = 5;
        System.out.println("generateArray() = " + Arrays.toString(generateArray(n)));
    }
        public static  int[] generateArray(int n){;

            int[] result = new int[n];

            // Fill the array with integers from 1 to n-1
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                result[i] = i + 1; // Numbers 1 to n-1
                sum += result[i];
            }

            // The last element is the negative sum of the previous elements
            result[n - 1] = -sum;

            return result;
        }


}

