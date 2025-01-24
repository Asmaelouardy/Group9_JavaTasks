package Asma.Week03;

public class SwappingTask {
    public static void main(String[] args) {
        // write a method that swaps the values of 2 int variables, without using a third variable
        // int a=5;        // a=3;
        // int b=3;       //  b=5;
        //test
        int a = 5;
        int b = 3;

        System.out.println("Variable before swiping "+ "\n a = "+a+ "\n b = "+b);
        System.out.println("--------------------------------------------------");

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Variable after swiping " +  "\n a = "+a+ "\n b = "+ b);



    }
}
