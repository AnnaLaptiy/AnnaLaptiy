package lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Z14 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);

        String a=str.nextLine();
        int S=str.nextInt();
        int[] R = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i=0;i<R.length; i++){
            int W=R[i]*S;
            System.out.print(W+ " ");

        }
    }
}
