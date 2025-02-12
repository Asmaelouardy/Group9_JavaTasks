package ceyda.week5;

public class FrequencyOfCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {
        String input = "aaabbbcc";
        int[] frequency = frequencyOfChars(input);
        for (int i = 0; i < frequency.length; i++) {
            if(frequency[i] >0){
                System.out.print(frequency[i] + "" + (char)i);
            }
        }
    }

    public static int[] frequencyOfChars(String str) {
        int[] charCount = new int[256];

        for (char ch : str.toCharArray()) {
            charCount[ch]++;
        }

        return charCount;
    }


}
