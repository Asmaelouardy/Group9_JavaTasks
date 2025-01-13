package Aisha.week1;

public class OddOrEven {

    public static void main(String[] args) {
        identifyOddEven(5);
        identifyOddEven(8);

    }
    public static void identifyOddEven(int number){
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is odd");

        }

    }
}
