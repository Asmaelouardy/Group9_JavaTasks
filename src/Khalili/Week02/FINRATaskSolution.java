package Khalili.Week02;

public class FINRATaskSolution {
    public static void main(String[] args) {
        for(int n = 1 ; n <= 30 ; n++){
            if (n%3==0 && n%5==0){
                System.out.print("FINRA"+" ");
            }else if(n%3==0){
                System.out.print("FIN"+" ");
            }else if(n%5==0){
                System.out.print("RA"+" ");
            }else{
                System.out.printf(n + " ");

            }
        }
    }
}
