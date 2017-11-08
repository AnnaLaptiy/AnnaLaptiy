package Lab5;

import java.util.Scanner;

public class Z9 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b;
        a=str.nextDouble();
        b=str.nextDouble();
        if (a<=0)
            System.out.println("Площадь круга должна быть положительной");
        else if (b<=0)
            System.out.println("Площадь квадрата должна быть положительной");
        else if (a<=Math.PI*b/4)
            System.out.println("Круг уместится в квадрате");
        else
            System.out.println("Круг не поместится в квадрате");

    }
}
