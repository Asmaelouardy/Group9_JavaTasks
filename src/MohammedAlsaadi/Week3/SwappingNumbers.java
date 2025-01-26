package MohammedAlsaadi.Week3;

public class SwappingNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // Using arithmetic operations to swap values
        a = a + b;    // a now contains sum of both numbers (8)
        b = a - b;    // b now contains original value of a (5)
        a = a - b;    // a now contains original value of b (3)

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
