package lab2;

import java.util.Scanner;

public class Z20 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        double a,b,c,d,f;
        a=str.nextDouble();
        b=str.nextDouble();
        c=str.nextDouble();
        if (a<=0)
            System.out.println("Значение mass должно быть положительным");
        else if (b<=0)
            System.out.println("Значение velocity должно быть положительным");
        else if (c<0)
            System.out.println("Значение height должно быть не отрицательным");
        else{
            d=(a*b*b)/2;
            f=a*c*9.8067;
            System.out.printf("Кинетическая энергия состовляет "+"%.4f",d);
            System.out.println(" Дж\n");
            System.out.printf("Потенциальная энергия состовляет " + "%.4f", f);
            System.out.println(" Дж");

        }

    }
}
