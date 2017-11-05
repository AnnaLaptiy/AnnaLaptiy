package lab2;

import java.util.Scanner;

public class Z22 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b,d=9.8067,c;
        a=str.nextDouble();
        b=str.nextDouble();
        c=a*d*Math.cos(Math.toRadians(b));
        if (a<=0)
            System.out.println("Масса должна быть положительной");
        else if (c<=0)
            System.out.print(0);
        else{
            System.out.printf("%.6f", a*d*Math.cos(Math.toRadians(b)));

        }
    }
}
