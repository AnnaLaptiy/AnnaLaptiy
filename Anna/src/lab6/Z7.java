package lab6;

import java.util.Scanner;

public class Z7 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b;
        a=str.nextInt();
        b=str.nextInt();
        if (a>b) {
            for (int e=a; e>=b; e--) {
                System.out.print(" ");
                System.out.print(e);
            }
        }
        else{
            for (int i=a; i<=b; i++){
                System.out.print(" ");
                System.out.print(i);
            }
        }
    }
}
