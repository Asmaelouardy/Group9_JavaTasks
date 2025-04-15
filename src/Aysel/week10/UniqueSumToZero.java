package Aysel.week10;

import java.util.Arrays;

public class UniqueSumToZero {

    public static void main(String[] args) {
        // Example usage
        System.out.println(Arrays.toString(generateArray(4)));
        System.out.println(Arrays.toString(generateArray(5)));
        System.out.println(Arrays.toString(generateArray(6)));
    }

    public static int[] generateArray(int N) {
        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            result[i] = i + 1;
            sum += result[i];
        }

        result[N - 1] = -sum;

        return result;
    }


}

