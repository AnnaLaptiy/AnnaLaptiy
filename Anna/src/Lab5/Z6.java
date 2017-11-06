package Lab5;

import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,b,c;
        a=str.nextFloat();
        b=str.nextFloat();
        c=b*3.6f;
        if (a<0)
            System.out.println("Значение velocityInKmH должно быть неотрицательным");
        else if (b<0)
            System.out.println("Значение velocityInMS должно быть неотрицательным");
        else if (a>c) {
            System.out.printf("%.2f", b );
            System.out.print(" м/с меньше ");
            System.out.printf("%.2f", a);
            System.out.print(" км/ч");
        }
        else if(c>a) {
            System.out.printf("%.2f", a );
            System.out.print(" км/ч меньше ");
            System.out.printf("%.2f", b);
            System.out.print(" м/с");
        }
    }
}
