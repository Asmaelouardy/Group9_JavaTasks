package Aysel.week06;



public class FindTheUnique {
    public static void main(String[] args) {
        String str= "AAABBBCCCDEF";

        System.out.println(findUniqueCharacters(str));
    }
        public static String findUniqueCharacters(String str) {
            String result = " ";

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (str.indexOf(c) == str.lastIndexOf(c)) {
                    result += c;
                }
            }

            return result;
        }


        }


















