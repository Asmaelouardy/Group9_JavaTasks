package Aysel.week05;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAABBCDD"));
    }

    public static String FrequencyOfChars(String str) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char each : str.toCharArray()) {
            freq.put(each, freq.getOrDefault(each, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }
}



