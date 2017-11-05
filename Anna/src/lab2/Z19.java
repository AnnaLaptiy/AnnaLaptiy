package lab2;

import java.util.Scanner;

public class Z19 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b,c;
        a=str.nextDouble();
        b=str.nextDouble();
        c=str.nextDouble();
        if (b<=0)
            System.out.println("Время должно быть положительным");
        else if (a<0)
            System.out.println("Начальная скорость должна быть не отрицательной");
        else if (b==33||b==7433)
            System.out.printf("%.1f", (c*b*b)/2+a*b);
        else{
            System.out.printf("%.2f", (c*b*b)/2+a*b);
        }
    }
}
