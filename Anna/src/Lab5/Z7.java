package Lab5;

import java.util.Scanner;

public class Z7 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        Double a,b,c,d;
        a=str.nextDouble();
        b=str.nextDouble();
        c=Math.PI*a*a;//площадь круга
        d=b*b;//площать квадрата
        if (a<0)
            System.out.println("Радиус должен быть положительным");
        else if (b<0)
            System.out.println("Сторона квадрата должна быть положительна");
        else if (d>c) {
            System.out.print("Площадь квадрата ");
            System.out.printf("%.4f", d);
            System.out.print(" больше площади круга ");
            System.out.printf("%.4f", c);
        }
        else if (c>d) {
            System.out.print("Площадь круга ");
            System.out.printf("%.4f", c);
            System.out.print(" больше площади квадрата ");
            System.out.printf("%.4f", d);
        }




    }
}
