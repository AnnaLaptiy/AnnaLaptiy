package lab2;

import java.util.Scanner;

public class Z30 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b;
        a=str.nextDouble();
        b=str.nextDouble();
        System.out.printf("%.4f", Math.sin(Math.toRadians(a))*Math.cos(Math.toRadians(b))+Math.cos(Math.toRadians(a))*Math.sin(Math.toRadians(b)));
    }

}
