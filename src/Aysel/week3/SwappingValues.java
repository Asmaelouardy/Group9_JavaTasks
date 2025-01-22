package Aysel.week3;

public class SwappingValues {
    // write a method that swaps the values of 2 int variables, without using a third variable
    // int a=5;  // int b = 3; // a=3; // b=5;

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;


                System.out.println("Swapped a: " + a);
                System.out.println("Swapped b: " + b);
            }
        }