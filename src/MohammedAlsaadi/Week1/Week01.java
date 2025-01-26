package MohammedAlsaadi.Week1;

public class Week01 {
    public class week01 {public static void identifyOddEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

        public static void main(String[] args) {
            identifyOddEven(5);  // Output: 5 is odd
            identifyOddEven(6);  // Output: 6 is even
        }
    }
}
