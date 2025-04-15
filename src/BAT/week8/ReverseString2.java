package BAT.week8;

public class ReverseString2 {
    public static void main(String[] args) {
        System.out.println("reverseString2(\"ABCD\") = " + reverseString2("ABCD"));
    }
    public static String reverseString2(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
