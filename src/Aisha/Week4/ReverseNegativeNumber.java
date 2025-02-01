package Aisha.Week4;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        reverseNumber();
    }

    public static void reverseNumber(){
        int number = -35;
        System.out.println("number " + number);
        int reverse = 0;
        while(number != 0){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("Reverse Number" + reverse);

    }


}
