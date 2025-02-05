package BAT.week4;

public class ReverseNegativeNumbers {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void reverse(int num){

        int reversedNum = 0;
        while(num!=0){
            reversedNum = reversedNum * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(reversedNum);
    }

    public static void main(String[] args) {
       int num = -45;
        reverse(num);
    }
}
