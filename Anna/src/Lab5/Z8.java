package Lab5;

import java.util.Scanner;

public class Z8 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b,c,d;
        a=str.nextDouble();
        b=str.nextDouble();
        c=str.nextDouble();
        d=b*b-4*c*a;

        if (a==0) {
            System.out.print("Данное уравнение ");
            System.out.printf("%.0f",a);
            System.out.print("x^2+");
            System.out.printf("%.0f",b);
            System.out.print("x +");
            System.out.printf("%.0f",c);
            System.out.print("= 0 не является квадратным");
        }
        else if (d<0) {
            System.out.print("Вещественных корней уравнения ");
            System.out.printf("%.0f",a);
            System.out.print("x^2+");
            System.out.printf("%.0f",b);
            System.out.print("x +");
            System.out.printf("%.0f",c);
            System.out.print("=0 нет");
        }
        else if (d==0) {
            System.out.print("Уравнение ");
            System.out.printf("%.0f",a);
            System.out.print("x^2+");
            System.out.printf("%.0f",b);
            System.out.print("x +");
            System.out.printf("%.0f",c);
            System.out.println("= 0 имеет один корень");
        }
        else if (d>0) {
            System.out.print("У уравнения ");
            System.out.printf("%.0f",a);
            System.out.print("x^2+");
            System.out.printf("%.0f",b);
            System.out.print("x +");
            System.out.printf("%.0f",c);
            System.out.print("=0 два вещественных корня");
        }


    }
}
