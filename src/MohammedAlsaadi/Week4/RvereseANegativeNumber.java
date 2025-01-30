package MohammedAlsaadi.Week4;

public class RvereseANegativeNumber {
    public static void main(String[] args) {
        // Test cases
        int num1 = -35;
        int num2 = -100;
        int num3 = -521;

        // Test and print results
        System.out.println("Test case 1: " + num1 + " -> " + reverseNegative(num1));
        System.out.println("Test case 2: " + num2 + " -> " + reverseNegative(num2));
        System.out.println("Test case 3: " + num3 + " -> " + reverseNegative(num3));
    }

    public static int reverseNegative(int num) {
        // Check if the number is negative
        if (num >= 0) {
            return num;  // Return as is if not negative
        }

        // Convert to positive for processing
        long positive = Math.abs((long) num);

        // Reverse the digits
        long reversed = 0;
        while (positive > 0) {
            reversed = reversed * 10 + positive % 10;
            positive /= 10;
        }

        // Check for integer overflow
        if (reversed > Integer.MAX_VALUE) {
            return num;  // Return original number if overflow would occur
        }

        // Make negative again and return
        return (int) -reversed;
    }
}