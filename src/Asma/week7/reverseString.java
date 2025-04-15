package Asma.week7;

public class reverseString {
    public static void main(String[] args) {


        String str = "ABCD";
        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        System.out.println(reverseStr);
    }
}
