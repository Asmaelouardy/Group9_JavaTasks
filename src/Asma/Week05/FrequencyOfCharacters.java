package Asma.Week05;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    /*
    Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    */

    public static void main(String[] args) {

        String FrequencyOfChars = "AAABBCDD";
        System.out.println("FrequencyOfChars    = " + FrequencyOfChars);
        System.out.println("FrequencyOfCharsInt = "+frequency_of_characters(FrequencyOfChars));
    }

    public static String frequency_of_characters(String str){

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            characterIntegerMap.put(c, characterIntegerMap.getOrDefault(c, 0) + 1);
        }
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }
}

