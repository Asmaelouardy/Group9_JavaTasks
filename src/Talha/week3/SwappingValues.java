package Talha.week3;

public class SwappingValues {
    public static void main(String[] args) {
        //write a method that swaps the values of 2 int variables, without using a third var

        int a = 5;
        int b = 3;
        System.out.println(a);
        System.out.println(b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("swapped variables");
        System.out.println(a);
        System.out.println(b);



    }
}
