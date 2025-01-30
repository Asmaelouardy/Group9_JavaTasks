package Aysel.week4;

public class ReverseANegativeNumber {

    public static void main(String[] args) {

        int number= -35;
        int reversedNumber= 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;

        } System.out.println("Reversed number: " + reversedNumber);





    }



}
