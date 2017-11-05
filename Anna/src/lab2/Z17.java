package lab2;

import java.util.Scanner;

public class Z17 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,b,c;
        a=str.nextFloat();
        b=str.nextFloat();
        c=str.nextFloat();
        if (a<0||b<0)
            System.out.println("Скорость должна быть не отрицательной");
        else{
            System.out.printf("%.4f", c/(a+b));
        }
    }
}
