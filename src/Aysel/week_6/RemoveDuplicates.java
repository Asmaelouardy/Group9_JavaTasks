package Aysel.week_6;

public class RemoveDuplicates {

    public static void main(String[] args) {
        /*
        String--Remove Duplicates
        Write a return method that can remove the duplicated values
        from String
         */
        System.out.println(removeDup("AAABBBCCC"));
        System.out.println(removeDup("AABBCCDD"));
        System.out.println(removeDup("Hello World!"));
        System.out.println(removeDup("CCCBBBAAA"));
    }



        public static String removeDup(String str) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (!result.contains(String.valueOf(str.charAt(i)))) {
                    result += str.charAt(i);
                }
            }
            return result;
        }



    }








