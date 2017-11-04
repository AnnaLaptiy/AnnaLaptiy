package lab2;

import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,b,c=3;
        System.out.println("Write a");
        a=str.nextFloat();
        if (a<=0)
            System.out.println("Значение должно быть положительным");
        else
            System.out.printf("%.4f", Math.PI*4*Math.pow(a,c)/3);
    }
}
