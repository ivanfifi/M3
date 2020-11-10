import java.util.Scanner;

public class M3_1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Max = scn.nextInt();
        int Min = Max;

        for(int i = 0;i < 2;i++){
            int n = scn.nextInt();
            if(n>Max){
                Max=n;
            }
            if (n<Min){
                Min=n;
            }
        }
        System.out.println(Max);
        System.out.println(Min);
    }
}