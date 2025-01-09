package Aysel.Week1;

public class OddAndEven {
    public static void main(String[] args) {


        //Write  a method which can identifies given number is even or odd

         identifyOddEven(5);
         identifyOddEven(6);
    }

    private static void identifyOddEven(int i) {
        if (i % 2 == 0) {
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}






