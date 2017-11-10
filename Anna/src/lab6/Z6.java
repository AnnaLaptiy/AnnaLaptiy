package lab6;

import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b;
        a=str.nextInt();
        b=str.nextInt();
        if (a<b){
            for (int i=a;i<=b; i++) {
                System.out.print(" ");
                System.out.print(i);
            }
        }
        else if (b<a){
            for (int i=b; i<=a; i++) {
                System.out.print(" ");
                System.out.print(i);
            }
        }
    }
}
