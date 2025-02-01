package ceyda.week4;

public class ReverseNegativeNumbersWithString {
    public static void main(String[] args) {
        int str = -45;
        String reversed = reverseNegative((String.valueOf(str)));
        System.out.println(reversed);


    }
    public static String reverseNegative(String str) {
        String reversed = "-";
        for (int i = str.length()-1; i >0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
