package lab2;

import java.util.Scanner;

public class Z11 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a;
        a=str.nextFloat();
        if (a<0)
            System.out.println("Значение не отрицательное");
        else
        System.out.printf("%.4f", Math.sqrt(a));
    }
}
