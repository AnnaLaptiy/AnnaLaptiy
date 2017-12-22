package lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Z15 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a=str.nextLine();
        int T=0;
        int[] R = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i=0;i<R.length; i++){
            T=T+R[i];}
            double W=T/R.length;
        System.out.format("%.1f",W);
        System.out.print(" ");


    }
}
