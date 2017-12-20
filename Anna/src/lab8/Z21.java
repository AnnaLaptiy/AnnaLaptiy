package lab8;

import java.util.Scanner;

public class Z21 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String a =str.nextLine();
        int X=str.nextInt();
        int Y=str.nextInt();
        String[] N = a.split(" ");
        int[] A = new int[N.length];
        for (int i = 0; i < N.length; i++) {
            if(A[i]==X)
                System.out.println();

        }
        String F=String.valueOf(Y);
        String W=String.valueOf(X);
        System.out.println(a.replaceAll (W, F));


    }
}
