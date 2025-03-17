package ceyda.week8;

public class reverseString {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverseStr(str));

    }
    public static String reverseStr(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
