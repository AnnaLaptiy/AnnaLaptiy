package lab2;

import java.util.Scanner;

public class Z18 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b,c;
        a=str.nextInt();
        b=str.nextInt();
        c=str.nextInt();
        System.out.println(a*b+a*c+b*c);
    }
}
