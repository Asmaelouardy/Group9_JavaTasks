package BAT.week1;
/*
//Write  a method which can identifies given number is even or odd

        // identifyOddEven(5);
        // identifyOddEven(6);

 */
public class OddOrEven {
    public static void main(String[] args) {
        identifyOddEven(-4);
    }

    public static void identifyOddEven(int num){

        if(num%2==0){
            System.out.println(num+" is even number");
        }else {
            System.out.println(num+" is odd number");
        }
    }
}
