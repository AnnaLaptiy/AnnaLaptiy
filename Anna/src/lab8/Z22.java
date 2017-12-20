package lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Z22 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        String s = str.nextLine();
        String[] N = s.split(" ");
        int[] A = new int[N.length];
        for (int i = 0; i < N.length; i++) {
            A[i] = Integer.valueOf(N[i]);
        }
        Arrays.sort(A);
        for(int i=0; i<N.length; i++)
            System.out.print(A[i]+" ");

    }
}
