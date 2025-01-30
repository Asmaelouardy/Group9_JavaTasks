package Aisha.week2;

public class Finra {

    public static void main(String[] args) {
        FINRA();
    }

    public static void FINRA (){
        for (int a=1; a <= 30; a++){
            if (a % 3 == 0 && a % 5 == 0){
                System.out.println("FINRA");
            } else if(a % 3 == 0){
                System.out.println("FIN");
            } else if(a % 5==0){
                System.out.println("RA");
            }else{
                System.out.println(a);
            }
        }
    }
}
