package Asma.week06;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('A','A','A','B','B','B','C','C','C'));
        ArrayList<Character> unique= new ArrayList<>();

        for (char each:list){
            if(!unique.contains(each)){
                unique.add(each);
            }
        }
        System.out.println("Before remove duplicate = " + list);
        System.out.println("-----------------------------");
        System.out.println("After remove duplicate = " + unique);
    }
}
