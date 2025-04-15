package BAT.week6;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static String removeDup(String str){


        String unique="";
        for (int i = 0; i <= str.length() - 1; i++){
            if(!unique.contains("" + str.charAt(i))){
                unique=unique+ "" + str.charAt(i);
            }
        }
        return unique;

    }

    public static void main(String[] args) {
        System.out.println("removeDup(\"AAABBBCCC\") => " + removeDup("AAABBBCCC"));
    }
}
