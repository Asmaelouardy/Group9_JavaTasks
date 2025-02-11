package Khalili.Week05;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String input = "AAABBCDD";
        String output = FrequencyOfChars(input);
        System.out.println(output);
    }
    public static String FrequencyOfChars(String str) {

        Map<Character, Integer> freqMap = new HashMap<>();


        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }


        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }


        return result.toString();
    }
}
