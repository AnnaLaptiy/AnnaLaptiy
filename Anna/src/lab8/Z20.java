package lab8;

import java.util.Arrays;
import java.util.Scanner;

public class Z20 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = str.nextLine();
        int[] R = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
        int z = str.nextInt(), y = str.nextInt(), M = R[z];
        if ( y > R.length||y==0) {
            System.out.println("Сообщение об ошибке");}
            else{
            for (int i = z; i <= y; i++) {
                if (R[i] < M)
                    M = R[i];
            }
            System.out.println(M);
        }
    }}
