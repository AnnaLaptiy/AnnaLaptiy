package lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Z19 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        int[] R = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
        int M=R[0];


        for(int i=0; i< R.length; i++) {
            if(i < M)
                M = R[i];
        }
        for (int i=0;i<R.length; i++){
            int W=R[i]-M;
            System.out.print(W+ " ");

        }
    }
}
