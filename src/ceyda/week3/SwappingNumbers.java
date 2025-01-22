package ceyda.week3;

public class SwappingNumbers {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        swapnum(a, b);
    }


    public static void swapnum(int a, int b) {


        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
}
