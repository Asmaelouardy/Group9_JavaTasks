package Othman.Week01;

public class OddOrEven {
    public static void main(String[] args) {

        identifyOddEven(5);
        identifyOddEven(6);
        identifyOddEven(99);
        identifyOddEven(72);

    }

    public static void identifyOddEven(int num){

        if(num % 2 == 0){
            System.out.println("num + \" is Odd\" = " + num + " is Even");
        }else{
            System.out.println("num + \" in Even\" = " + num + " is Odd");
        }

    }
}
