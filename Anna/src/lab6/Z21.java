package lab6;

import java.util.Scanner;

public class Z21 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int X;
        X=str.nextInt();
        for (int i=10; i<=20; i++){
            if (i==X) {
                System.out.println(i + " +");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
