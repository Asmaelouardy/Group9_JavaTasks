package BAT.week9;

import java.util.Arrays;

public class SortAscending {

    public static void main(String[] args) {
     int[] arr  ={9,8,4,2,6,7};
     int[] sortedNums = sortAscendingOrder(arr);

     System.out.print("Sorted: ");
        for (int eachNum : sortedNums) {
            System.out.print(eachNum + " ");
        }
    }

    public static int [] sortAscendingOrder(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}