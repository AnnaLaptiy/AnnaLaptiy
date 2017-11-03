package lab2;

import java.util.Scanner;

public class Z8 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        int a,b,c,v;
        System.out.println("Write a");
        a=str.nextInt();
        System.out.println("Write b");
        b=str.nextInt();
        if (a<=0)
            System.out.println("Значение См должно быть положительным");
        else if (b<=0)
            System.out.println("Значение М должно быть положительным");
        else{
            c=a*100;
            v=c%b;
            System.out.println(c/b +" шт " +v+" cm ");
        }

    }
}
