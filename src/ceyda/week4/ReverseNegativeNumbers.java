package ceyda.week4;

public class ReverseNegativeNumbers {
    public static void main(String[] args) {
        int a = -35;
        reverseNegativeNumbers(a);

    }

    public static void reverseNegativeNumbers(int n) {
        int reverse = 0;
        while(n!=0){
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
