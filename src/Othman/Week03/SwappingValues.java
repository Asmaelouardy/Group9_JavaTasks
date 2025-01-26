package Othman.Week03;

public class SwappingValues {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        swap(a,b);
    }
    public static void swap(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Swapped values: a = " + a + ", b = " + b);

    }

}

