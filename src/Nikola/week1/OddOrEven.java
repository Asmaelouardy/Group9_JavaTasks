package Nikola.week1;

public class OddOrEven {
    public static void main(String[] args) {
        IdentifyOddEven(5);
        IdentifyOddEven(6);

    }

      public static void IdentifyOddEven(int number){
          if(number % 2 == 0){
              System.out.println(number + " is even number");
          }else {
              System.out.println(number + " is odd number");
          }
        }



    }

