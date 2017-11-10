package lab6;

import java.util.Scanner;

public class Z22 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a;
        String b;
        a=str.nextInt();
        b="!";
        for (int i=0; i<a; i++){

            if (i%5==0) {
                System.out.print(" ");
            }
            System.out.print(b);
        }
    }
}
