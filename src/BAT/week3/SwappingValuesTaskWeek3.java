package BAT.week3;

public class SwappingValuesTaskWeek3 {
    public static void main(String[] args) {

        int a = 20, b = 10;
        swappingValue(a, b);

    }
    // write a method that swaps the values of 2 int variables, without using a third variable

    // int a=5;

    // int b = 3;

    // a=3;

    // b=5;

    public static void swappingValue(int a, int b) {


        System.out.println("Before swap: a = " + a + ", b = " + b);

        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("After swap: a = " + a + ", b = " + b);

    }


}
