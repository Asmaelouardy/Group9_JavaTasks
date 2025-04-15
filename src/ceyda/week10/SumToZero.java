package ceyda.week10;

import java.util.Arrays;

public class SumToZero {
    public static void main(String[] args) {
        int N=7;
        System.out.println("Result: " + Arrays.toString(totalZero(N)));

    }
    public static int[] totalZero(int N) {
        int[] arr = new int[N];
        int sum=0;
        for (int i = 0; i < N-1; i++) {
            arr[i] = i+1;
            sum+=arr[i];

        }
        arr[N-1]=-sum;
        return arr;
    }
}
