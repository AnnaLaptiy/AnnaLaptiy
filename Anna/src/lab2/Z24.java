package lab2;

import java.util.Scanner;

public class Z24 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b,c,g=9.8067, t=2;
        a=str.nextDouble();
        b=str.nextDouble();
        c=str.nextDouble();
        if (a<=0||b<=0)
            System.out.println("Масса должна быть не отрицательной");
        else if (c<=0)
            System.out.println("Дистанция должна быть не отрицательной");
        else{
            System.out.printf("%.4f", g*((a*b)/Math.pow(c,t)));
        }

    }
}
