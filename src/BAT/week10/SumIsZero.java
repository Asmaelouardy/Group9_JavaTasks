package BAT.week10;

public class SumIsZero {

    public static int[] sumZero(int n) {


        int[] result = new int[n];
        int index = 0;

        for (int i = 1; i <= n/2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }


        if (n % 2 != 0) {
            result[index] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = sumZero(n);

        System.out.print("Result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}