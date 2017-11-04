package lab2;

import java.util.Scanner;

public class Z4 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a;
        System.out.println("Write a");
        a=str.nextFloat();
        if (a<=0)
            System.out.println("Значение должно быть положительным");
        else
            System.out.printf("%.4f\n", Math.PI*2*a);

    }
}
