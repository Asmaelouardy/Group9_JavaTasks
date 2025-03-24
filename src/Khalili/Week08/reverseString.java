package Khalili.Week08;

public class reverseString {
    public static void main(String[] args) {
        String string = "ABCD";
        String reversed ="";
        for (int i = string.length()-1; i>=0;i--) {
            reversed += string.charAt(i);
        }
        System.out.println("Reversed String: "+reversed);
    }
}
