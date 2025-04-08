package ceyda.week9;

public class sortAscending {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr=sortAscending(arr);
        for (int eachElementinArray : arr) {
            System.out.print(eachElementinArray + " ");
        }

    }

    public static int[] sortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;


    }
}
