package lab2;

import java.util.Scanner;

public class Z25 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b,c,t=2;
        a=str.nextDouble();
        b=str.nextDouble();
        c=str.nextDouble();
        System.out.printf("%.4f", Math.sqrt(Math.pow(a,t)+Math.pow(b,t)-2*a*b*Math.cos(Math.toRadians(c))));

    }
}
