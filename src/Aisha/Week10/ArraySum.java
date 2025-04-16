package Aisha.Week10;

import java.util.Arrays;

public class ArraySum {
    public static int[] generateArray(int N) {
        int[] result = new int[N];
        int index = 0;

        for (int i = 1; i <= N / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        if (N % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;  // Change N to test other values
        int[] result = generateArray(N);
        System.out.println(Arrays.toString(result));
    }
}
