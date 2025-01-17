package Armine.week1;

public class OddOrEven {
    public static void main(String[] args) {
        oddOrEven(100);
        oddOrEven(10);
        oddOrEven(7);

    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }
}
