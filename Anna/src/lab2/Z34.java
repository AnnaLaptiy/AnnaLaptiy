package lab2;

import java.util.Scanner;

public class Z34 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b;
        a=str.nextDouble();
        b=str.nextDouble();
        System.out.printf("%.4f", 3*Math.sin(2*Math.toRadians(a))*Math.cos(3*Math.toRadians(b)));
    }
}
