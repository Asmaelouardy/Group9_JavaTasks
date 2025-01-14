package Talha.week1;

/* Numbers -- odd & even
Write a method that can identify  a given number is even or odd.

EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"

Create branch, solve question, push, create pull request talk about your solution*/
public class OddOrEvenTask {

    public static void main(String[] args) {
        identifyOddEven(5);
        identifyOddEven(6);
        identifyOddEven(32);
    }


    public static void identifyOddEven(int a){
        if (a%2==0){
            System.out.println(a + " is even");
        }   else{   System.out.println( a+ " is odd");  }



    }
}

