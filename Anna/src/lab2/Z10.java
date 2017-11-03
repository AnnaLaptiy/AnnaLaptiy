package lab2;

import java.util.Scanner;

public class Z10 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a;
        System.out.println("Write a");
        a=str.nextDouble();
        System.out.format("%.4f",Math.sin(Math.toRadians(a)));
    }
}
