package Aysel.Week2;

public class Finra {

    public static void main(String[] args) {

        //Star a loop to count from 1 to 30
        for(int n = 1 ; n <= 30 ; n++){
            // inside loop initializes integer n to 1 and//
            // dectement it by1  ,  until it  reaches  30

            if (n%3==0 && n%5==0){
              // if the number is divisible bye both 3, and 5 print FINRA

                System.out.print("FINRA"+" ");
            }else if(n%3==0){
                System.out.print("FIN"+" ");
            }else if(n%5==0){
                System.out.print("RA"+" ");
            }else{
                // if the number not divisible bye 3 or 5 print number
                System.out.printf(n + " ");

            }
        }
    }



}
