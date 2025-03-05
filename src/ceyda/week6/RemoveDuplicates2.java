package ceyda.week6;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        String str = "aaabbbbvvvccclkk";
        System.out.println(removeDuplicates(str));

    }
    public static String removeDuplicates(String str) {

        if (str == null || str.length() == 0) {
            return str;
        }

        String nonDuplicate = "";
        nonDuplicate += str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i-1)) {
                nonDuplicate += str.charAt(i);
            }
        }

        return nonDuplicate;

    }
}
