package Talha.week2;

public class finra {
    public static void main(String[] args) {
        //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
        //print "FIN" instead of the number and
        //for numbers which are a multiple of 5, print "RA" instead of the number.
        //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

       FINRA();




    }

    public static void FINRA() {
        for (int i = 1; i <= 30; i++) {
            boolean by3 = i % 3 == 0;
            boolean by5 = i % 5 == 0;

            if (by3 && by5) {
                System.out.println("FINRA");
            } else if (by3) {
                System.out.println("FIN");
            }else if (by5) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }




        // please add your solution here

    }


}