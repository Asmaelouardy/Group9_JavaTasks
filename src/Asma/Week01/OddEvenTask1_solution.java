package Asma.Week01;

public class OddEvenTask1_solution {
    public static void main(String[] args) {
        // //Write  a method which can identifies given number is even or odd
        //        // identifyOddEven(5);
        //        // identifyOddEven(6);


        identifyOddEven(5);
        identifyOddEven(6);

    }

    public static void identifyOddEven(int num) {
        if (num % 2 == 0) {
            System.out.println("number " + num + " is Odd");

        } else {
            System.out.println("number " + num + " is Even");
        }
    }
}
