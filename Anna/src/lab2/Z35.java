package lab2;

import java.util.Scanner;

public class Z35 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b;
        a=str.nextDouble();
        b=str.nextDouble();
        System.out.printf("%.4f", Math.sqrt(a*a+b*b));
    }
}
