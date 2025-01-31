package Asma.Week04;

public class ReverseANegativeNumber {
    public static void main(String[] args) {
        reverseNumber();
    }
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void reverseNumber(){
       int num = -35;
        System.out.println("Number      = "+num);

        int reverse = 0;
        while(num!=0){
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse num = "+reverse);

    }
}
