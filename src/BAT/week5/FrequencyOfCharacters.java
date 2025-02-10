package BAT.week5;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

     /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static  String frequencyOfChars(String str){

        Map<Character, Integer> counter = new LinkedHashMap<>();
        for( int i = 0; i<str.length() ;i++){
            char key = str.charAt(i);
            if(!counter.containsKey(key)){
                counter.put(key, 0);
            }
            counter.put(key,counter.get(key)+1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();


    }

    public static void main(String[] args) {
         String str = "AAABBCDD";
        System.out.println(frequencyOfChars(str));


    }

}
