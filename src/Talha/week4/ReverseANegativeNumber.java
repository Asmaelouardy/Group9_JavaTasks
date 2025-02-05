package Talha.week4;

public class ReverseANegativeNumber {

    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

        public static void main(String[] args) {
            int num = -35;
            int reversed = reverseNegativeNumber(num);
            System.out.println(reversed);
        }

        public static int reverseNegativeNumber(int num) {
            // If num is negative, process it by reversing
            if (num < 0) {
                num = -num;  // Makes it positive temporarily
                int reversed = 0;

                // Reverses the digits of the number
                while (num != 0) {
                    reversed = reversed * 10 + (num % 10);
                    num /= 10;
                }

                return -reversed;  // Returns reversed number w/ negative sign
            } else {
                return num;
            }
        }
    }

