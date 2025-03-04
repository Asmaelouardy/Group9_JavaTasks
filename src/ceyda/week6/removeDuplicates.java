package ceyda.week6;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        String result = removeDuplicates(str);
        System.out.println(result);

    }

    public static String removeDuplicates(String str) {
        String nonDuplicate = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!nonDuplicate.contains("" + str.charAt(i)))
                nonDuplicate = nonDuplicate + " " + str.charAt(i);


        }

        return nonDuplicate;
    }
}
