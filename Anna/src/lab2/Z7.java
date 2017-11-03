package lab2;

import java.util.Scanner;

public class Z7 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a;
        System.out.println("Write a");
        a=str.nextDouble();
        System.out.printf("%.4f\n", a*Math.PI/180);
    }
}
