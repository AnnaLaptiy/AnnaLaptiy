package lab2;

import java.util.Scanner;

public class Z36 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b,c,d;
        a=str.nextDouble();
        b=str.nextDouble();
        c=str.nextDouble();
        d=str.nextDouble();
        if (a==0&&b==0&&c==0&&d==0)
            System.out.println("0");
        else
        System.out.printf("%.4f", Math.sqrt((c-a)*(c-a)+(d-b)*(d-b)));
    }
}
