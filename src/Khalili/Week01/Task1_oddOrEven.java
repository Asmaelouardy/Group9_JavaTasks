package Khalili.Week01;

import java.util.Scanner;

public class Task1_oddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n = scanner.nextInt();

        if(n%2==0){
            System.out.println("even");
        }else if (n%2!=0){
            System.out.println("odd");
        }else{
            System.out.println("invalid number");

        }


    }

}
