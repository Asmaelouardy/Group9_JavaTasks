package Khalili.Week04;

import org.w3c.dom.ls.LSOutput;

public class reverseANegativeNumber {
    public static void main(String[] args) {
        int number = -53;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        System.out.println(reversedNumber);
    }
}
