package Armin.Week3;

    public class SwappingValues {

        public static void main(String[] args) {

            int a = 5;
            int b = 3;

            System.out.println("Variable before swapping "+ "\n a = "+a+ "\n b = "+b);
            System.out.println("--------------------------------------------------");

            a = a+b;
            b = a-b;
            a = a-b;

            System.out.println("Variable after swapping " +  "\n a = "+a+ "\n b = "+ b);





            // write a method that swaps the values of 2 int variables, without using a third variable

            // int a=5;

            // int b = 3;

            // a=3;

            // b=5;

        }

    }

