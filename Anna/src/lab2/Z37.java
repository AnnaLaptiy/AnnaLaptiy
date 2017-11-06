package lab2;

import java.util.Scanner;

public class Z37 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b,c,d,v;
        a=str.nextDouble();
        b=str.nextDouble();
        c=str.nextDouble();
        d=str.nextDouble();
        v=a+c;
        if (a<0||c<0)
            System.out.println("Объем должен быть неотрицательным");
        else{
            System.out.println(v);
            System.out.printf("%.4f", (b*a+d*c)/(a+c));

        }
    }
}
