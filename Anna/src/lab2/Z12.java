package lab2;

import java.util.Scanner;

public class Z12 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a;
        a=str.nextFloat();
        if (a==360||a==90)
            System.out.printf("%.0f", Math.cos(Math.toRadians(a))*5);
        else {
            System.out.printf("%.4f", Math.cos(Math.toRadians(a)) * 5);
        }
    }
}
