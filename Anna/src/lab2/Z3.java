package lab2;

import java.util.Scanner;

public class Z3 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,d=3;
        System.out.println("Write a");
        a=str.nextInt();
        if (a<=0)
            System.out.println("Значение должно быть положительным");
        else{
            System.out.printf("%.0f",Math.pow(a,d));
        }
    }
}
