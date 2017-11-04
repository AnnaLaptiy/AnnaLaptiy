package lab2;

import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        float a,b;
        System.out.println("Write a");
        a=str.nextFloat();
        System.out.println("Write b");
        b=str.nextFloat();
        if (a<=0)
            System.out.println("Значение base должно быть положительным");
        else if (b<=0)
            System.out.println("Значение height должно быть положительным");
        else{
            System.out.printf("%.2f", a*b/2);
        }
    }
}
