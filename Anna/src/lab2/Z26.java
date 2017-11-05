package lab2;

import java.util.Scanner;

public class Z26 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,b,c,d;
        a=str.nextFloat();
        b=str.nextFloat();
        c=str.nextFloat();
        d=str.nextFloat();
        if (a==0)
            System.out.println("Значение а не может быть равно 0");
        else if (d==0)
            System.out.println("Значение d не может быть равно 0");
        else{
            System.out.printf("%.4f",(a*d+b*c)/(a*d));
        }
    }
}
